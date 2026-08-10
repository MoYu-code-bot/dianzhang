package com.moyu;

import java.util.Scanner;

public class Demo05 {
    /*
     键盘录入一个大于等于2的整数，判断是否为质数
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 0;
        while (true) {
            System.out.println("请输入一个大于等于2的整数");
            number = sc.nextInt();
            if (number >= 2) {
                break;
            } else {
                System.out.println("输入的数字不合法，请重新输入");
            }
        }

        int count = 0;
        for (int i = 2; i <= number -1; i++) {
            if(number % i == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println(number + "是质数");
        }else {
            System.out.println(number + "不是质数");
        }

    }
}
