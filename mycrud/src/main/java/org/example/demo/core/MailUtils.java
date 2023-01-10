package org.example.demo.core;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.example.demo.controller.LoginController;
import org.example.demo.toolEntity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.StringWriter;

@Component
public class MailUtils {
    @Autowired
    JavaMailSender javaMailSender;

    public void sendAttachmentsMail(String sender, String receiver, String subject, String content, String[] srcPath) {
        try {
            MimeMessage message33 = javaMailSender.createMimeMessage();
            // 第二个参数true表示构造一个 multipart message 类型邮件
            MimeMessageHelper helper = new MimeMessageHelper(message33, true);
            helper.setFrom(sender);
            helper.setTo(receiver);
            helper.setSubject(subject);

            // 邮件正文加图片
            // 第二个参数true表示邮件正文是HTML格式（默认为false）
            helper.setText(content, true);
            String rootPath = "/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/mycrud/src/main/resources/files/";
            for (int i=0; i< srcPath.length; i++) {
                // 通过FileSystemResource构造静态资源
                FileSystemResource res = new FileSystemResource(new File(rootPath + srcPath[i]));
                helper.addInline(String.valueOf(i), res);
            }

            // 邮件加附件
            File ff = new File("/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/mycrud/src/main/resources/files/abc.txt");
            helper.addAttachment(ff.getName(), ff);

            javaMailSender.send(message33);
        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }
    }

    public void sendFreeMarkerHtmlMail(String sender) {
        try {
            // 首先配置 FreeMarker 模版位置
            freemarker.template.Configuration configuration =
                    new Configuration(freemarker.template.Configuration.VERSION_2_3_0);
            ClassLoader loader = LoginController.class.getClassLoader();
            configuration.setClassLoaderForTemplateLoading(loader,"ftl");

            // 配置模版文件
            Template template = configuration.getTemplate("mailTemplate.ftl");

            // 结合 User 对象渲染模版
            StringWriter mail = new StringWriter();
            User user = new User();
            user.setUsername("suohe");
            user.setSex("男");
            template.process(user, mail);

            // 将渲染结果发送出去
            try {
                MimeMessage message = javaMailSender.createMimeMessage();
                MimeMessageHelper helper = new MimeMessageHelper(message, true);
                helper.setTo("chuxin135@163.com");
                helper.setFrom(sender);
                helper.setSubject("啦啦啦");
                helper.setText(mail.toString(), true);
                javaMailSender.send(message);
            } catch (MessagingException e) {
                System.out.println("发送失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendThymeleafHtmlMail(String sender, String content) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo("chuxin135@163.com");
            helper.setFrom(sender);
            helper.setSubject("sendThymeleafHtmlMail");
            helper.setText(content, true);
            javaMailSender.send(message);
        } catch (MessagingException e) {
            System.out.println("发送失败");
        }
    }
}
