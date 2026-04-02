package com.oopDemo.test.extendtest;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        s.grade = "五年级";
        System.out.println(s.name + " " + s.age + " " + s.grade);
        s.eat();
        s.study();
        System.out.println("--------------------------------------------------------");
        Teacher t = new Teacher();
        t.name = "王老师";
        t.age = 22;
        t.subject = "计算机";
        System.out.println(t.name + " " + t.age + " " + t.subject);
        t.eat();
        t.teach();
    }
}
