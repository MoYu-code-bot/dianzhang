package com.oopDemo.test.statictest.test4;

public class test {
    public static void main(String[] args) {
        Student.teacherName = "王老师";

        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;

        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 19;

    }
}
