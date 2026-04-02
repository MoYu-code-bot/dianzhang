package com.oopDemo.test.statictest.test2;

public class test {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.name = "张三";
        w.age = 18;
        w.salaryage = 5;
        System.out.println(w.name + " " + w.age + " " + w.salaryage);

        w.work();
    }
}
