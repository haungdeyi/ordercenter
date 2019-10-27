package com.huangdeyi.distributed.orderservice;

import java.io.Serializable;

public class OrderServiceRequest implements Serializable {
    private static final long serialVersionUID = 2802864344283178477L;
    private Object params;

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }
}
