package com.example.demo.myQueue;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitConsumerTest {

    public void receiveMessage() throws IOException, TimeoutException, InterruptedException {
        // 1. 创建和初始化ConnectFactory
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("mybbbb");
        factory.setPassword("mybbbb");
        factory.setHost("127.0.0.1");
        factory.setHandshakeTimeout(600000);
        factory.setConnectionTimeout(600000);
        factory.setPort(5672);
        factory.setVirtualHost("/");

        Connection connection = factory.newConnection();
        // 创建通道
        Channel channel = connection.createChannel();

        // 通道绑定队列：与生产端一致
        channel.queueDeclare("hello", true, false, false, null);

        // 获取消息
        // 参数1: 消费那个队列的消息 队列名称
        // 参数2: 开始消息的自动确认机制[只要消费就从队列删除消息]
        // 参数3: 消费时的回调接口
        channel.basicConsume("hello", true, new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("取出消息:===>" + new String(body));
            }
        });

        // 消费端连接与同道不用关闭，一直处于监听状态
    }

    public void test() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("mybbbb");
        factory.setPassword("mybbbb");
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setVirtualHost("/");
        // 建立到代理服务器到连接
        Connection conn = factory.newConnection();
        // 获得信道
        final Channel channel = conn.createChannel();
        // 声明交换机
        String exchangeName = "hello-exchange-louis";
        channel.exchangeDeclare(exchangeName, "direct", true);
        // 声明队列
        String queueName = channel.queueDeclare().getQueue();
        String routingKey = "lu-you-key";
        // 绑定队列，通过键 lu-you-key 将队列和交换器绑定起来
        channel.queueBind(queueName, exchangeName, routingKey);

        while (true) {
            // 消费消息
            boolean autoAck = false;
            String consumerTag = "";
            channel.basicConsume(queueName, autoAck, consumerTag, new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope,
                                           AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String routingKey = envelope.getRoutingKey();
                    String contentType = properties.getContentType();
                    System.out.println("消费的路由键：" + routingKey);
                    System.out.println("消费的内容类型：" + contentType);
                    long deliveryTag = envelope.getDeliveryTag();
                    // 确认消息
                    channel.basicAck(deliveryTag, false);
                    System.out.println("消息的内容为：" + new String(body, "UTF-8"));
                }
            });
        }
    }
}
