package com.moyu;

import java.util.Scanner;

public class Demon04 {
    public static void main(String[] args) {
        /*
        初始最大生命200，受到x点伤害，技能恢复y点血，x和y有键盘录入而来
        假设，游戏人物不会死亡，最少1点血
        问：最终游戏人物血量是多少？
        */
        int hp = 200;
        Scanner sc = new Scanner(System.in);

        int hurt = 0;
        while (true){
            System.out.println("请输入受到的伤害：");
            hurt = sc.nextInt();
            if (hurt > 0){
                break;
            }else {
                System.out.println("请输入正确的伤害值");
            }
        }
        hp = hp - hurt;
        if (hp <= 0){
            hp = 1;
            System.out.println("人物已处于最低血量值");
        }
        System.out.println("当前人物剩余血量：" + hp);

        int add = 0;
        while (true){
            System.out.println("请输入技能回复的血量：");
            add = sc.nextInt();
            if (add > 0){
                break;
            }else {
                System.out.println("请输入增加的正常血量值：" + add);
            }
        }
        hp = hp + add;
        if (hp > 200){
            hp = 200;
            System.out.println("人物已满血");
        }
        System.out.println("当前人物血量为：" + hp);
    }
}
