package com.huangdeyi.distributed.orderservice;

public interface OrderService {

    //下单
    public OrderServiceResponse placeOrder(OrderServiceRequest request);

    //取消订单(未付款的订单)
    public OrderServiceResponse canclePlace(OrderServiceRequest orderServiceRequest);
}
