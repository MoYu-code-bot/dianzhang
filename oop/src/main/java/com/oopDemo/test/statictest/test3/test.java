package com.oopDemo.test.statictest.test3;

public class test {
    public static void main(String[] args) {
        Student s = new Student("张三", 18, 180, 80);


        //1.
        System.out.println(s.getName() + ", " + s.getAge() + ", " + s.getHight() + ", " + s.getWeight());
        s.study();

        //2.
        s.setAge(s.getAge() + 1);
        int newWeight = s.getWeight() + 10;
        s.setWeight(newWeight);
        System.out.println(s.getName() + ", " + s.getAge() + ", " + s.getHight() + ", " + s.getWeight());
        //3.
        s.setAge(s.getAge() + 1);
        int newHight = s.getHight() + 2;
        s.setHight(newHight);
        int newWeight2 = s.getWeight() - 3;
        s.setWeight(newWeight2);
        System.out.println(s.getName() + ", " + s.getAge() + ", " + s.getHight() + ", " + s.getWeight());

        //4.
        s.setAge(s.getAge() + 1);
        System.out.println(s.getName() + ", " + s.getAge() + ", " + s.getHight() + ", " + s.getWeight());

        //5.
        s.setAge(s.getAge() + 1);
        System.out.println("毕业生：" + s.getName() + ", " + s.getAge() + ", " + s.getHight() + ", " + s.getWeight());


    }
}
