package Operator;

import java.util.Scanner;

public class OperatorDemo12 {
    public static void main(String[] args){
//        下面介绍三元短路运算符
//        格式: a ? b :c  若a为true则返还b，否则返回c
//        例：用三元短路运算符判断两个数中的最大值
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入第一个数：");
        int a = sc.nextInt();
        System.out.printf("请输入第二个数：");
        int b = sc.nextInt();
        int result = a > b ? a : b;
        System.out.println("二者中较大数为："+result);
    }
}
