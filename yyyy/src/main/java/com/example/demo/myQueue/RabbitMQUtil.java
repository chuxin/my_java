package com.example.demo.myQueue;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMQUtil {

    private static ConnectionFactory connectionFactory;

    static {
        //创建mq的连接工厂对象
        connectionFactory = new ConnectionFactory();
        //设置连接rabbit的主机地址
        connectionFactory.setHost("localhost");
        //设置连接端口
        connectionFactory.setPort(5672);
        //设置连接哪个虚拟主机
        connectionFactory.setVirtualHost("/");
        //设置虚拟主机的用户名和密码
        connectionFactory.setUsername("mybbbb");
        connectionFactory.setPassword("mybbbb");
    }

    //定义一个获取连接
    public static Connection getConnection() {
        try {
            //通过连接工厂获取连接
            Connection connection = connectionFactory.newConnection();
            return connection;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        return null;
    }

    //关闭连接通道的方法
    public static void closeConnectionChannel(Channel channel, Connection connection){
        try {
            if (channel!=null) channel.close();
            if (connection!=null)connection.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }

}

