package Operator;

import java.util.Scanner;

public class OperatorDemo8 {
    //下面介绍比较运算符
    /*
    ==      判断是否相等
    ！=      判断是否不相等
    >       判断是否大于
    >=      判断是否大于等于
    <       判断是否小于
    <=      判断是否大于等于

    上述判断成立则为true，否则为false,需要用boolean类型的数据接收
     */
    public static void main(String[] args){
        //下面以一个例题介绍比较运算符的用途
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入甲的体重：");
        double weight1 = sc.nextDouble();
        System.out.println("请输入乙的体重：");
        double weight2 = sc.nextDouble();
        boolean result = weight1 >= weight2;
        System.out.println("甲的体重大于等于乙的体重，结果为" + result);
    }

}
