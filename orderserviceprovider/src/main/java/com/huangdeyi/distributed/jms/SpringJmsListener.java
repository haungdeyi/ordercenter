package com.huangdeyi.distributed.jms;

import com.huangdeyi.distributed.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Component("reveiverListener")
//改变消息的接收方式(默认是阻塞式接收)
public class SpringJmsListener implements MessageListener {
    @Autowired
    private Provider provider;

    public void onMessage(Message message) {
        try {
             provider.maybePlaceOrder(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
