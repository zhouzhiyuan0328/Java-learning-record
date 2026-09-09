package Operator;

import java.util.Scanner;

public class OperatorDemo9 {
    public static void main(String[] args){
        //下面是一个关系运算符的练习
        //录入一个三位数，判断是否可以被3整除
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();
        number %= 3;
        boolean result = number == 0;
        System.out.println("被三整除的结果是" + result);
    }
}
