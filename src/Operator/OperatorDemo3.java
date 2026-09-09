package Operator;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //时间转换
        /*输入秒数对应输出小时、分钟、秒
        例如：输入3661
        输出1 1 1*/
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();

        int hours = seconds / 3600;

    }
}
