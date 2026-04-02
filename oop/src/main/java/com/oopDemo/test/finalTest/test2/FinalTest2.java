package com.oopDemo.test.finalTest.test2;

public class FinalTest2 {
    public static void main(String[] args) {
        /*定义一个Java Bean类，描述圆
        属性：半径和圆周率
        行为：计算圆的周长和面积
                */
        //创建一个圆的对象
        Circle c = new Circle(1.5);

        System.out.println(c.getRadius());
        System.out.println(c.getPI());

        //获取圆的面积
        System.out.println(c.getArea());
        //获取圆的周长
        System.out.println(c.getPerimeter());

    }
}
