package Operator;

import java.util.Scanner;

public class OpenratorDemo11 {
    public static void main(String[] args){
        //下面介绍短路逻辑运算符：&&  ||
        //短路逻辑运算符的好处是第一个条件不成立时就会中断运算
        //例题：录入一个四位整数，判断是不是回文数
        System.out.println("请输入一个四位数:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int ge = num1 % 10;
        int shi = num1 / 10 % 10;
        int bai = num1 / 100 % 10;
        int qian = num1 /1000;
//        System.out.println(ge);
//        System.out.println(shi);
//        System.out.println(bai);
//        System.out.println(qian);
        boolean result = ge == qian && shi == bai;
        System.out.println(result);

        //例题：判断7的有缘数，输入两位整数，只要包含7或者是7的倍数就是有缘数
        System.out.printf("请输入一个两位数：");
        int num2 = sc.nextInt();
        boolean result2 = num2 / 10 == 7 || num2 % 10 == 7 || num2 % 7 == 0;
        System.out.println(result2);
    }
}
