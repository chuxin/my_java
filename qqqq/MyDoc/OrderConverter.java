import com.lvmenglou.entity.Order;
import com.lvmenglou.entity.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class OrderConverter implements Converter<String, Order> {

    @Override
    public Order convert(String source) {
        System.out.println("xxxxxxxxxxxxx");
        Order order = new Order();
        String[] stringvalues = source.split(",");
        if (stringvalues != null && stringvalues.length == 3) {
            order.setName(stringvalues[0]);
            order.setAge(Integer.parseInt(stringvalues[1]));
            order.setHeight(Double.parseDouble(stringvalues[2]));
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                order.setCreateDate(dateFormat.parse(stringvalues[3]));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return order;
        } else {
            throw new IllegalArgumentException(String.format("类型转换失败， 需要格式化为'中国,18,1.86'，但目前格式是[%s]", source));
        }
    }
}
