package com.huangdeyi.distributed.jms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringJmsReceiverByListener {
    public static void main(String[] args) {
        //通过监听器实现异步接收消息
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-jms.xml");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
