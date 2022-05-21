package com.lvmenglou.converter;

import com.lvmenglou.entity.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<String, User> {

    @Override
    public User convert(String source) {
        System.out.println("yyyyyyyyyyyyyyyy");
        User user = new User();
        String[] stringvalues = source.split(",");
        if (stringvalues != null && stringvalues.length == 3) {
            user.setName(stringvalues[0]);
            user.setAge(Integer.parseInt(stringvalues[1]));
            user.setHeight(Double.parseDouble(stringvalues[2]));
            return user;
        } else {
            throw new IllegalArgumentException(String.format("类型转换失败， 需要格式化为'中国,18,1.86'，但目前格式是[%s]", source));
        }
    }
}
