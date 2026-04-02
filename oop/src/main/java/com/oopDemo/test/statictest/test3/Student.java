package com.oopDemo.test.statictest.test3;

public class Student {

    private String name;
    private int age;
    private int hight;
    private int weight;

    public Student(String name, int age, int hight, int weight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setHight(int hight) {
        this.hight = hight;
    }
    public int getHight() {
        return hight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void study(){
        System.out.println(name + "正在学习~");
    }
}
