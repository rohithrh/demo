package com.example.demo.utils;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @KafkaListener(topics = "my-topic",groupId = "my-group-id")
    public void recieve(String message){
        // just to recieve a message -logic follows
        System.out.println("message received: "+ message);
    }
}
