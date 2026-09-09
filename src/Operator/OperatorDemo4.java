package Operator;
//类型转换
public class OperatorDemo4 {
    public static void main(String[] args){
        //数字运算：类型不可以进行计算，必须进行类型转换成同类型的才行
        /*
        java中默认采取隐式转换
        1.含byte short类型的会提升为int
        2.范围小的类型转成大的再运算
         */
        //例题1
        byte a = 100;
        short s = 200;
        double d = 20.3;

        //类型转换的过程
        /*
        1.a + s
        byte a,short s都转成int得到300


        2.结果 + d
        int 300加double 20.3，int转换成double

         */


        double result = a + s + d;
        System.out .println(result);//320.3


        /*强制转换
        强制转换不会自动触发，需要手写代码
        格式：目标数据类型 变量名 = (目标数据类型)被强转的数据;
         */
        short s1 = 100;
        short s2 = 200;
        /*int + int = int
        方案一：
        300 ：二进制 00000000 00000000 00000001 00101100
        强制转换成byte：00101100
        */
        byte result1 = (byte)(s1 + s2);
        System.out.println(result1);//44


        //方案二：
        int result2 = s1 + s2;
        System.out.println(result2);//300
    }
}
