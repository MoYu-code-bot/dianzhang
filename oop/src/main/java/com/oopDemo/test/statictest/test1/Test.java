package com.oopDemo.test.statictest.test1;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "华为";
        p1.price = 3999;
        p1.color = "蓝色";
        System.out.println("手机品牌是：" + p1.brand + " 手机价格是：" + p1.price + " 手机颜色是：" + p1.color);

    }
}
