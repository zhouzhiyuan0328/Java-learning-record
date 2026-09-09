package Operator;

public class OperatorDemo5 {
    public static void main(String[] args){
        //实现字母大小写转换
        //  A对应ASCII里面的65 -> a对应ASCII里面的97   97 - 65 = 32


        //1.定义变量来记录大写的字符
        char c = 'B';

        //2.转成大写
        char C = (char)(c + 32);
        System.out.println(C);//b
    }
}
