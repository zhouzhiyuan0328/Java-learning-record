package Operator;

public class OperatorDemo7 {
    public static void main(String[] args){
        //下面介绍的是运算符的类型及用法

        //自增自减运算符
        int a1 = 1;
        a1++;// ++ 自增运算符，数值加1，先后顺序不讨论，--自减运算符同理
        System.out.println(a1);//2
        a1--;
        System.out.println(a1);//1

        //赋值运算符
        /*
        =       直接赋值
        +=      加后赋值
        -=      减后赋值
        *=      乘后赋值
        /=      除后赋值
        %=      取模后赋值
         */
        int a2 = 24;
        System.out.println(a2);//24

        a2 += a1;
        System.out.println(a2);//25

        a2 -= a1;
        System.out.println(a2);//24

        a2 *= a1;
        System.out.println(a2);//24

        a2 /= a1;
        System.out.println(a2);//24

        a2 %= 5;
        System.out.println(a2);//4
    }
}
