package com.huangdeyi.distributed.orderservice;

import java.io.Serializable;

public class OrderServiceResponse implements Serializable {

    private static final long serialVersionUID = -8576208389439558550L;
    private String state;
    private Object data;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
