package variable;

//确定Scanner的位置
import java.util.Scanner;

public class VariableDemo5 {
    public static void main(String[] args) {
        /*键盘录入数据：*/

        //1.创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //2.使用Scanner对象接收数据
        System.out.println("请输入整数：");
        int num = sc.nextInt();   //接受整数

        System.out.println("请输入小数：");
        double num2 = sc.nextDouble();   //接受小数

        System.out.println("请输入字符串：");
        String str = sc.next();   //接受字符串

        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        System.out.println("str = " + str);
    }
}
