package com.practice.kafkademo;

import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "firstTopic",
            groupId ="groupId1"
    )
    void listener(String data){
        System.out.println("Message received: "+ data);
    }
}
