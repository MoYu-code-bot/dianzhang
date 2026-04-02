package com.oopDemo.test.enumtest;

public class EnumTest1 {
    public static void main(String[] args) {

        //枚举类是特殊的JavaBean类
        OrderState a1 = OrderState.o1;
        System.out.println(a1);

        //匹配
        switch (a1){
            case o1:
                System.out.println("待支付状态");
                break;
            case o2:
                System.out.println("订单处理中");
                break;
            case o3:
                System.out.println("已发货");
                break;
            case o4:
                System.out.println("配送中");
                break;
            case o5:
                System.out.println("订单已送达");
                break;
            case o6:
                System.out.println("订单已取消");

        }

        /*
        Java 枚举（枚举类）的注意事项:
        1.每一个枚举项，都是该枚举类的对象
        2.枚举项在底层其实就是常量，默认用 public static final 修饰
        3.枚举类的第一行上必须是枚举项，枚举项之间用逗号隔开，以分号作为结尾
        4.枚举类的构造方法必须是 private 修饰，不让外界创建本类的对象
        5.编译器会给枚举类新增两个默认存在的方法：values()、valueOf()
        */

    }
}
