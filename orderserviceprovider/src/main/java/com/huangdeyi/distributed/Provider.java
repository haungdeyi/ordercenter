package com.huangdeyi.distributed;

import com.huangdeyi.distributed.orderservice.OrderService;
import com.huangdeyi.distributed.orderservice.OrderServiceRequest;
import com.huangdeyi.distributed.orderservice.OrderServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@Service("orderservice-provider")
public class Provider implements OrderService {

    public OrderServiceResponse placeOrder(OrderServiceRequest request) {
        System.out.println("下单信息:" + request.getParams());
        OrderServiceResponse response = new OrderServiceResponse();
        response.setState("666");
        response.setData("翠花，终于等到你!");
        return response;
    }

    public OrderServiceResponse canclePlace(OrderServiceRequest orderServiceRequest) {
        return null;
    }

    public void maybePlaceOrder(Message message) throws JMSException {
        System.out.println("使用异步接收消息模式：" + ((TextMessage)message).getText());
    }
}
