package org.example.demo.controller;

import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import kafka.utils.json.JsonObject;
import org.example.demo.bean.CrudMessageBoard;
import org.example.demo.bean.CrudUsers;
import org.example.demo.bean.ResponseStandard;
import org.example.demo.core.JWTUtils;
import org.example.demo.mapper.CrudMessageBoardMapper;
import org.example.demo.mapper.CrudUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scala.Int;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
public class MessageBoardController {
    @Autowired
    public CrudMessageBoardMapper crudMessageBoardMapper;
    @Autowired
    public CrudUsersMapper crudUsersMapper;

    public static final int PageSizeNum = 2;

    @RequestMapping("/showList")
    public List<CrudMessageBoard> showList(@RequestParam Integer pageStart,
                                           @RequestParam Integer pageSize) {
        // 获取总数
        Integer count = crudMessageBoardMapper.getCount();
        // 计算对应页码有无数据
        if (pageSize == null || pageSize <= 0) {
            pageSize = PageSizeNum;
        }
        pageStart = (pageStart - 1) * pageSize;
        List<CrudMessageBoard> listData = crudMessageBoardMapper.getPageRecords(pageStart, pageSize);

        return listData;
//        return crudMessageBoardMapper.getAllRecords();
    }

    @RequestMapping(value="/addMessage", method=RequestMethod.POST)
    public ResponseEntity insertMessage(@RequestParam(defaultValue = "null") String title,
                                @RequestParam(defaultValue = "null") String content,
                                @RequestParam(defaultValue = "null") String author,
                                @RequestParam(defaultValue = "null") String category,
                                @RequestParam(defaultValue = "0000-00-00 00:00:00") String create_time,
                                @RequestParam(defaultValue = "") String jwt_token) {
        try {
            System.out.println(jwt_token);
            DecodedJWT decodedJWT = JWTUtils.decodeToken(jwt_token);
            System.out.println(decodedJWT.getClaim("id").asInt());
            Integer id = Integer.parseInt(decodedJWT.getClaim("id").asString());
            System.out.println("id: " + id);
            // 校验记录是否存在
            CrudUsers userObj = crudUsersMapper.getUserInfoById(id);
            if (userObj == null) {
                return new ResponseEntity<>("令牌错误，不存在此用户", HttpStatus.OK);
            }

            // jwt 本身已经校验过了，如果过期，直接在 catch 里捕获
//            System.out.println("过期时间：" + decodedJWT.getExpiresAt().getTime());
//            System.out.println("现在时间：" + new Date());
//            // 校验令牌是否过期
//            if (decodedJWT.getExpiresAt().before(new Date())) {
//                return new ResponseEntity<>("令牌过期", HttpStatus.OK);
//            }

            String username = decodedJWT.getClaim("username").asString();
            String mobile = decodedJWT.getClaim("mobile").asString();
            System.out.println("username: " + username);
            System.out.println("mobile: " + mobile);
        } catch (JWTDecodeException e) {
            return new ResponseEntity<>("令牌错误，不存在此用户", HttpStatus.OK);
        } catch (TokenExpiredException e) {
            return new ResponseEntity<>("令牌过期", HttpStatus.OK);
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt_create = LocalDateTime.parse(create_time, dtf);
        // 获取当前时间
        LocalDateTime ldt_update = LocalDateTime.parse(dtf.format(LocalDateTime.now()), dtf);
        int res = crudMessageBoardMapper.insertMessage(title, content, author, category, ldt_create, ldt_update);
        return new ResponseEntity<>("插入成功，标识符为：" + res, HttpStatus.OK);
    }

    @RequestMapping(value="/updateMessage", method=RequestMethod.POST)
    public ResponseEntity<ResponseStandard<String>> updateMessage(@RequestParam(defaultValue = "") int id,
                                          @RequestParam(defaultValue = "") String content,
                                          @RequestParam(defaultValue = "") String author) {
        int res = crudMessageBoardMapper.updateMessage(id, content, author);
        ResponseStandard<String> tt = new ResponseStandard<String>(200, "更新成功,标识符：" + res, "lalal");
        System.out.println(tt);
        return new ResponseEntity<>(tt, HttpStatus.OK);
    }

    @GetMapping("/deleteMessage/{id}")
    public String deleteMessage(@PathVariable("id") int id) {
        int res = crudMessageBoardMapper.deleteMessage(id);
        return "删除成功,标识符：" + res;
    }

}
