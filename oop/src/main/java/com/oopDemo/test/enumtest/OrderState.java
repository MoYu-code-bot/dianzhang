package com.oopDemo.test.enumtest;

public enum OrderState {
    o1("待支付"),
    o2("处理中"),
    o3("已发货"),
    o4("配送中"),
    o5("已送达"),
    o6("已取消");
    private String name;



    private OrderState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
