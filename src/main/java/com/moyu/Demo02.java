package com.moyu;

import java.util.Scanner;

public class Demo02 {
    /*
    键盘录入一个三位数，将其拆分成个位、十位、百位后，打印在控制台
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 10;
        System.out.println("百位数：" + a + ",十位数：" + b + ",个位数：" + c);
    }

}
