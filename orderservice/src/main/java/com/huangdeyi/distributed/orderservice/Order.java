package com.huangdeyi.distributed.orderservice;

import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = 1067039561345599074L;
    //名称
    private String orderName;
    //价格
    private String category;
    //数量
    private Integer count;
    //价格
    private Integer price;
    //图片路径
    private String pictrueUrl;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPictrueUrl() {
        return pictrueUrl;
    }

    public void setPictrueUrl(String pictrueUrl) {
        this.pictrueUrl = pictrueUrl;
    }
}
