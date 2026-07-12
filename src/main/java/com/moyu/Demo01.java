package com.moyu;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        /*
        键盘录入你的身高和体重，计算BMI
        BMI身体质量指数计算公式：BMI=体重÷身高²（体重单位：干克，身高单位：米)
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的身高：");
        double high = sc.nextFloat();
        System.out.println("请输入你的体重：");
        double weight = sc.nextFloat();
        double BMI = weight / (high * high);
        if (BMI<18.5){
            System.out.println("您的身体消瘦，有部分健康风险增加" + " BMI指数为：" + BMI);
        }else if (BMI>=18.5 && BMI<=23.9){
            System.out.println("您的身体正常，没有健康风险" + " BMI指数为：" + BMI);
        }else if(BMI>=24.0 && BMI <=26.9){
            System.out.println("您的身体偏胖，会增加健康风险" + " BMI指数为：" + BMI);
        }else if (BMI>=27.0 && BMI<=29.9){
            System.out.println("您的身体肥胖，会增加中度健康风险" + " BMI指数为：" + BMI);
        }else{
            System.out.println("您的身体严重肥胖，会急剧增加健康风险" + " BMI指数为：" + BMI);
        }
    }
}
