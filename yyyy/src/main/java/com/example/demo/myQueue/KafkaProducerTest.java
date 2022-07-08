package com.example.demo.myQueue;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaProducerTest implements Runnable {
    private final KafkaProducer<String, String> producer;
    private final String topic;

    public KafkaProducerTest(String topicName) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.1.9:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("key.serializer", StringSerializer.class.getName());
        props.put("value.serializer", StringSerializer.class.getName());
        this.producer = new KafkaProducer<String, String>(props);
        this.topic = topicName;
    }

    @Override
    public void run() {
        int messageNo = 1;
        try {
            for(;;) {
                String messageStr = "你好，这是第" + messageNo + "条数据";
                // 往 kafka 里推数据
                producer.send(new ProducerRecord<String, String>(topic, "Message", messageStr));
                if (messageNo % 100 == 0) {
                    System.out.println("发送的消息：" + messageStr);
                }
                if (messageNo % 1000 == 0) {
                    System.out.println("成功发送了" + messageNo + "条");
                    break;
                }
                messageNo++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            producer.close();
        }
    }
}
