package Operator;

import java.util.Scanner;

public class OperatorDemo10 {
    public static void main(String[] args){
        //下面介绍逻辑运算符
        //1. &  :和，表示同时满足符号两边的表达式时才返还true
        //例：输入一个数判断是否在1~10之间
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num1 = sc.nextInt();
        boolean result1 = num1 >= 1 & num1 <= 10;
        System.out.println("结果为："+ result1);

        //2. |：或，直须满足两个表达式中的一个就会返还true
        //例：输入一个数判断是否不在1~10之间
        System.out.println("请输入一个数：");
        int num2 = sc.nextInt();
        boolean result2 = num2 <=1 | num2 >= 10;
        System.out.println(result2);
        }
}
