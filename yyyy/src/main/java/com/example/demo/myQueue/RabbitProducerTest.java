package com.example.demo.myQueue;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitProducerTest {

    public void sendMessage() throws IOException, TimeoutException {
        // 1.创建ConnectionFactory , 并进行初始化
        ConnectionFactory cf = new ConnectionFactory();
        cf.setUsername("mybbbb");
        cf.setPassword("mybbbb");
        cf.setHost("127.0.0.1");
        cf.setHandshakeTimeout(600000);
        cf.setConnectionTimeout(600000);
        cf.setPort(5672);
        cf.setVirtualHost("/");

        // 获取连接对象
        Connection connection = cf.newConnection();
        // 获取连接中通道
        Channel channel = connection.createChannel();

        // 通道绑定对应消息队列
        // 参数1:  队列名称 如果队列不存在自动创建
        // 参数2:  用来定义队列特性是否要持久化 true 持久化队列   false 不持久化
        // 参数3:  exclusive 是否独占队列，表示声明的当前队列只允许当前的连接所使用  true 独占队列   false  不独占
        // 参数4:  autoDelete: 是否在消费完成后自动删除队列  true 自动删除  false 不自动删除
        // 参数5:  额外附加参数
        channel.queueDeclare("hello", true, false, false, null);

        // 发布消息
        // 参数1: 交换机名称 参数2:队列名称  参数3:传递息额外设置（MessageProperties.PERSISTENT_TEXT_PLAIN 设置消息持久化）  参数4:消息的具体内容
        channel.basicPublish("", "hello", MessageProperties.PERSISTENT_TEXT_PLAIN, "hello rabbitmq777对的".getBytes());

        //关闭连接
        channel.close();
        connection.close();
        System.out.println("生产者发送成功....");
    }

    public void test() throws IOException, TimeoutException {
        // 创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("mybbbb");
        factory.setPassword("mybbbb");
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setVirtualHost("/");
        // 建立到代理服务器到连接
        Connection conn = factory.newConnection();
        // 获得信道
        Channel channel = conn.createChannel();
        // 声明交换机
        String exchangeName = "hello-exchange-louis";
        channel.exchangeDeclare(exchangeName, "direct", true);

        // 发布消息
        byte[] messageBodyBytes = "who are you22".getBytes();
        String routingKey = "lu-you-key";
        // 参数分别对应 exchange, routingKey, base properties, 信息体 body
        channel.basicPublish(exchangeName, routingKey, null, messageBodyBytes);

        channel.close();
        conn.close();

        System.out.println("发送了一条消息到 rabbitMQ");
    }
}
