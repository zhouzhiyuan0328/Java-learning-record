package variable;

public class VariableDemo4 {
    public static void main(String[] args) {
        //计算BMI
        //公式：BMI = 体重（kg） / 身高^2（m^2）

    double weight = 70;

    double height = 1.75;

    double bmi = weight / (height * height);
    
    System.out.println("BMI = " + bmi);
    }

}
