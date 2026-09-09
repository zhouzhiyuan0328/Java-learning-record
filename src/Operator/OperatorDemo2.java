package Operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //键盘录入数字，将位数拆分
        //1.键盘录入一个三位数(123)
        System.out.println("请输入一个三位数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //2.将数字拆分为个位数、十位数、百位数
        int ge = num %10;
        int shi = num / 10 % 10;
        int bai = num / 100;

        //3.输出结果
        System.out.println("个位数是：" + ge);//3
        System.out.println("十位数是：" + shi);//2
        System.out.println("百位数是：" + bai);//1
    }
}
