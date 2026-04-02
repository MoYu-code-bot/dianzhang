package com.oopDemo.test.finalTest.test1;

public class FinalTest {
    public static void main(String[] args) {
       /* 1.定义一个常量，一旦被赋值就不能再进行修改
        2.常量名大写，多个单词之间再用下划线隔开*/

        final int NUMBER = 100;

        System.out.println(NUMBER);
        /*可以进行加减乘除运算*/
        System.out.println(NUMBER + 10);

        /*
        基本数据类型：
        byte short int long float double boolean char
        变量里面记录的是真实数据
        final int a = 10;  此时变量里面记录的数据无法发生改变

        引用数据类型：
        除上面的八种，其他所有数据类型都是引用类型
        final Student stu = new Student();
        真正无法改变的是 stu记录的内存地址，但是对象里面的属性还是可以发生改变：name age
        */
    }
}
