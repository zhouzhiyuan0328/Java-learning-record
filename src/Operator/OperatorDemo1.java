package Operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //下面介绍算数运算符
        //1.整数运算
        int a = 10;
        int b = 3;
        //加法
        System.out.println(a + b);//13

        //减法
        System.out.println(a - b);//7

        //乘法
        System.out.println(a * b);//30

        //除法(整除)
        System.out.println(a / b);//3

        //取余
        System.out.println(a % b);//1


        //2.浮点数运算
        //小数参与运算，结果不一定精确
        double c = 10.0;
        double d = 3.0;
        //加法
        System.out.println(c + d);//13.0

        //减法
        System.out.println(c - d);//7.0

        //乘法
        System.out.println(c * d);//30.0

        //除法
        System.out.println(c / d);//3.3333333333333335

        //取余
        System.out.println(c % d);//1.0
    }
}
