package com.example.demo.controller;

import com.example.demo.utils.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    MessageProducer producer;

    @PostMapping(value = "/send")
    public String sendMessage(@RequestParam("message")
                                  String message) {
        producer.sendMessage("my-topic", message);
        return "Message sent: " + message;
    }
}
