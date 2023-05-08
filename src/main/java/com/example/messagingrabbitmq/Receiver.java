package com.example.messagingrabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {

//    String returnMessage = "";
//
//    public String getReturnMessage() {
//        return returnMessage;
//    }
//
//    public void setReturnMessage(String returnMessage) {
//        this.returnMessage = returnMessage;
//    }

    @RabbitListener(queues = MessagingRabbitmqApplication.queueName)
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        //setReturnMessage(message);
    }
}


