package org.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.Verification;
import com.ctc.wstx.util.StringUtil;
import com.google.gson.Gson;
import freemarker.template.Configuration;
import freemarker.template.Template;
import kafka.utils.Json;
import org.example.demo.bean.CrudUsers;
import org.example.demo.bean.ResponseStandard;
import org.example.demo.core.EncryptionUtils;
import org.example.demo.core.JWTUtils;
import org.example.demo.core.MailUtils;
import org.example.demo.mapper.CrudUsersMapper;
import org.example.demo.toolEntity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.StringWriter;
import java.net.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Controller
public class LoginController {
    @Autowired
    public CrudUsersMapper crudUsersMapper;

    public final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    JavaMailSenderImpl mailSender;
    @Autowired
    MailUtils mailUtils;
    @Value("${spring.mail.username}")
    private String mailUserName;
    @Autowired
    TemplateEngine templateEngine;

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public ResponseEntity<ResponseStandard<String>> register(@RequestParam(defaultValue = "null") String username,
                                 @RequestParam(defaultValue = "null") String passwd,
                                 @RequestParam(defaultValue = "null") String mobile) throws NoSuchAlgorithmException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime current_time = LocalDateTime.parse(dtf.format(LocalDateTime.now()), dtf);

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] md5Byte = md5.digest(passwd.getBytes());
        String passwdEncrytion = EncryptionUtils.bytesToHexString(md5Byte);

        String ip = "";
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        int resIns = crudUsersMapper.insertUserInfo(username, passwdEncrytion, ip, mobile, current_time, current_time);
        ResponseStandard<String> tt = new ResponseStandard<String>(200, "注册成功，标识符： " + resIns, String.valueOf(resIns));
        return new ResponseEntity<>(tt, HttpStatus.OK);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<ResponseStandard<Map<String, String>>> login(@RequestParam(defaultValue = "null") String username,
                                    @RequestParam(defaultValue = "null") String passwd) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] md5Byte = md5.digest(passwd.getBytes());
        String passwdEncryption = EncryptionUtils.bytesToHexString(md5Byte);

        CrudUsers res = crudUsersMapper.getUserInfo(username, passwdEncryption);
        System.out.println(res);

        Map<String, String> xxxx = new HashMap<>();
        if (res == null) {
            xxxx.put("jwt_token", "");
            ResponseStandard<Map<String, String>> tt = new ResponseStandard<Map<String, String>>(499, "返回结果有问题。。", xxxx);
            return new ResponseEntity<>(tt, HttpStatus.OK);
        }

        Map<String, String> payload = new HashMap<>();
        payload.put("id", String.valueOf(res.getId()));
        payload.put("username", String.valueOf(res.getUsername()));
        payload.put("ip", String.valueOf(res.getIp()));
        payload.put("mobile", String.valueOf(res.getMobile()));
        payload.put("create_time", String.valueOf(res.getCreate_time()));
        payload.put("update_time", String.valueOf(res.getUpdate_time()));
        String token22 = JWTUtils.generateToken(payload);
        xxxx.put("jwt_token", token22);
        ResponseStandard<Map<String, String>> tt = new ResponseStandard<Map<String, String>>(200, "返回结果。。", xxxx);
        logger.info("登录成功，" + String.valueOf(res.getMobile()));
        mailUtils.sendSimpleMail(mailUserName);
        return new ResponseEntity<>(tt, HttpStatus.OK);
    }

    @RequestMapping(value = "/testIP", method = RequestMethod.GET)
    public void testIP(HttpServletRequest request) {
        // 获取局域网IP地址
        try {
            String ip22 = InetAddress.getLocalHost().getHostAddress();
            System.out.println("哈哈哈和 " + ip22);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // 获取全部存放本机IP地址
        List<String> list = new LinkedList<>();
        try {
            Enumeration enumeration = NetworkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()) {
                NetworkInterface network = (NetworkInterface) enumeration.nextElement();
                // 加判断，只获取全部 IPV4/IPV6 IP地址
//                if (network.isVirtual() || !network.isUp()) {
//                    continue;
//                } else {
                    Enumeration addresses = network.getInetAddresses();
                    while (addresses.hasMoreElements()) {
                        InetAddress address = (InetAddress) addresses.nextElement();
                        if (address != null && (address instanceof Inet4Address || address instanceof Inet6Address)) {
                            list.add(address.getHostAddress());
                        }
                    }
//                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        System.out.println(String.valueOf(list));

        Assert.notNull(request, "HttpServletRequest is not null");
        String ip = request.getHeader("X-Requested-For");
        if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Forwarded-For");
        }
        if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        System.out.println(StringUtils.isBlank(ip) ? null : ip.split(",")[0]);

        /**
         * 获取IP地址
         * 使用Nginx等反向代理软件， 则不能通过request.getRemoteAddr()获取IP地址
         * 如果使用了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP地址，X-Forwarded-For中第一个非unknown的有效IP字符串，则为真实IP地址
         */
        String ip33 = null;
        try {
            HttpServletRequest request1 = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
            ip33 = request.getHeader("x-forwarded-for");
            if (StringUtils.isEmpty(ip33) || "unknown".equalsIgnoreCase(ip)) {
                ip33 = request.getHeader("Proxy-Client-IP");
            }
            if (StringUtils.isEmpty(ip33) || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip33 = request.getHeader("WL-Proxy-Client-IP");
            }
            if (StringUtils.isEmpty(ip33) || "unknown".equalsIgnoreCase(ip)) {
                ip33 = request.getHeader("HTTP_CLIENT_IP");
            }
            if (StringUtils.isEmpty(ip33) || "unknown".equalsIgnoreCase(ip)) {
                ip33 = request.getHeader("HTTP_X_FORWARDED_FOR");
            }
            if (StringUtils.isEmpty(ip33) || "unknown".equalsIgnoreCase(ip)) {
                ip33 = request.getRemoteAddr();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 使用代理，则获取第一个IP地址
        if (StringUtils.isNotEmpty(ip33) && ip33.length() > 15) {
            if (ip33.indexOf(",") > 0) {
                ip33 = ip33.substring(0, ip33.indexOf(","));
            }
        }
        System.out.println(ip33);
    }

    //  消息摘要算法
    //    消息摘要算法的特征是加密过程不需要秘钥，并且加密的数据无法被解密。任何消息经过散列函数处理后，都会获得唯一的散列值，这一过程称为“消息摘要”。
    //    消息摘要算法最著名的是MD5算法和SHA-1算法及其变体。
    @RequestMapping(value = "/testEncryption", method = RequestMethod.GET)
    public void testEncryption() throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] md5Byte = md5.digest("chuxin135".getBytes());
        System.out.println(EncryptionUtils.bytesToHexString(md5Byte));

        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        byte[] md5Byte22 = sha256.digest("chuxin135".getBytes());
        System.out.println(EncryptionUtils.bytesToHexString(md5Byte22));

        // 字符串可以， md5Byte 的整型不行
        String string = "hello world";
        byte[] bytes = string.getBytes();
        String s = new String(bytes);
        System.out.println("Decoded String : " + s);

        for (byte x: md5Byte) {
            System.out.println(x);
        }
        System.out.println(new String(md5Byte));
    }

    @RequestMapping(value = "/testJWT", method = RequestMethod.GET)
    public void testJWT() {
        // 写法一
        // 加密Token
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date(System.currentTimeMillis()));
        String token = JWT.create()
           .withExpiresAt(new Date(System.currentTimeMillis() + 10000)) // 设置过期时间
           .withAudience("user333")     // 设置接受方信息，一般是登录用户
           .sign(Algorithm.HMAC256("99999"));   // 使用HMAC算法，99999作为密钥加密
        System.out.println(token);

        // 解密Token
        String userId = JWT.decode(token).getAudience().get(0);
        // java-import-不能导入同名类，所以只能有下面这样的写法
        org.junit.Assert.assertEquals("对比不正确", "user333", userId);
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("99999")).build();
        DecodedJWT ss = jwtVerifier.verify(token);
        System.out.println(ss.getToken());


        // 写法二
        // 加密Token
        Map<String, String> payload = new HashMap<>();
        payload.put("userId22", "4567");
        payload.put("username", "papa and mama");
        String token22 = JWTUtils.generateToken(payload);
        System.out.println("token: " + token22);

        // 解密Token
        try {
            DecodedJWT decodedJWT = JWTUtils.decodeToken(token22);
            String userId22 = decodedJWT.getClaim("userId22").asString();
            String username = decodedJWT.getClaim("username").asString();
            String exp = decodedJWT.getExpiresAt().toString();
            System.out.println("userId22: " + userId22);
            System.out.println("username: " + username);
            System.out.println("exp: " + exp);
        } catch (JWTDecodeException e) {
            System.out.println("令牌错误");
        } catch (TokenExpiredException e) {
            System.out.println("令牌过期");
        }
    }

    @RequestMapping(value = "/testJson", method = RequestMethod.GET)
    public void testJson() {
        // 参考博文：https://blog.csdn.net/leosblog/article/details/80842640

        // FastJson
        CrudUsers crudUsers = new CrudUsers(11, "username", "passwd", "ip", "15851733229", LocalDateTime.now(), LocalDateTime.of(2022, 11, 11, 11, 11));
        Object jsonString = JSON.toJSON(crudUsers);
        System.out.println(jsonString.toString());

        // GJson
        Gson gson = new Gson();
        String jsonString22 = gson.toJson(crudUsers);
        System.out.println(jsonString22);
        String jsonString33 = "{\"id\":11,\"username\":\"username\",\"passwd\":\"passwd\",\"ip\":\"ip\",\"mobile\":\"mobile\",\"create_time\":{\"date\":{\"year\":2022,\"month\":12,\"day\":30},\"time\":{\"hour\":17,\"minute\":53,\"second\":29,\"nano\":963975000}},\"update_time\":{\"date\":{\"year\":2022,\"month\":11,\"day\":11},\"time\":{\"hour\":11,\"minute\":11,\"second\":0,\"nano\":0}}}";
        CrudUsers crudUsers22 = gson.fromJson(jsonString33, CrudUsers.class);
        System.out.println(crudUsers22.toString());
    }

    @RequestMapping(value="/testMail", method = RequestMethod.GET)
    public void testMail() {
        // 读取配置文件信息
        System.out.println(mailUserName);

        // 最简单的邮件发送
        mailUtils.sendSimpleMail(mailUserName);

        // 邮件加附件
        // 带图片资源的邮件
//        mailUtils.sendAttachmentsMail(mailUserName, "chuxin135@163.com", "我是主题",
//                "<div>内容，内容 图片2： <div><img src='cid:1'/></div></div>", new String[]{"1.jpg", "2.jpg"});

        // 使用FreeMarker构建邮件模板
//        mailUtils.sendFreeMarkerHtmlMail(mailUserName);

        // 使用Thymeleaf构建邮件模板    没成功？？？
        // 通过 Context 构造模版中变量需要的值
//        Context ctx = new org.thymeleaf.context.Context();
//        ctx.setVariable("username", "你好啊");
//        ctx.setVariable("sex", "男");
//        // 使用TemplateEngine 对模版进行渲染
//        String content = templateEngine.process("mailTemplate.html", ctx);
//        System.out.println("==============================" + content);
//        mailUtils.sendThymeleafHtmlMail(mailUserName, content);
    }
}
