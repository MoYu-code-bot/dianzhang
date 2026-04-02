package com.oopDemo.test.finalTest.test2;

public class Circle {
    private double radius;//半径
    private final double PI = 3.14;//圆周率

    //构造方法
    public Circle(double radius) {
        this.radius = radius;
    }
    //Get/Set方法
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }
    //行为
    //计算圆的周长和面积
    //面积
    public double getArea() {
        return PI * radius * radius;
    }
    //周长
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
