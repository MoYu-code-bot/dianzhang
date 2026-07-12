package com.moyu;

import java.util.Scanner;

public class Demo03 {
    /*
    给定秒数seconds,将其转换为对应的小时数，分钟数和秒数，使得总时间不变，但分钟和秒数都不超过59
    输入：3661
    输出：1 1 1
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入给定的秒数：");
        int seconds = sc.nextInt();

        int hours = seconds / 3600;
        System.out.print(hours + "时");

        int min = seconds % 3600 / 60;
        System.out.print(min + "分");

        int second = seconds % 3600 % 60;
        System.out.print(second + "秒");

    }


}
