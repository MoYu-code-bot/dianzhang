package com.oopDemo.test.statictest.test5;

public class ArrayUtil {
    private ArrayUtil(){}

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
    public static void getAverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("平均值为：" + sum * 1.0 / arr.length);

    }
}
