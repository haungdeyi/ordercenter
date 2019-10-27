package com.huangdeyi.distributed.jms;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.JMSException;
import javax.jms.TextMessage;

public class SpringJmsReceiver {
    public static void main(String[] args) throws JMSException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-jms.xml");
        //得到发送模板
        JmsTemplate jmsTemplate =  context.getBean("jmsTemplate", JmsTemplate.class);
        //消费消息
        TextMessage textMessage = (TextMessage) jmsTemplate.receive("spring-queue");
        //得到消息中的内容
        String content = textMessage.getText();
        System.out.println(content);
    }
}
