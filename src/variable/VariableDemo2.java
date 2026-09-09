package variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //这是一个变量的练习

//      定义初始攻击力
        int attack = 220;

//      定义初始防御力
        int defence = 180;

//      定义初始血量
        double health = 100.0;

//      定义技能倍率
        double skill  =1.2;

//        定义敌方攻击力
        int attack2 = 210;

//        定义敌方防御力
        int defence2 = 80;

//        定义敌方技能加成
        double skill2 =1.3;

//        定义敌方血量
        double blood2 = 1223.3;

        //普通攻击的伤害 = 攻击力 - 防御力
        int damage1 = attack - defence;

//        血量2 = 血量2 - 普通攻击的伤害
        blood2 = blood2 - damage1;
        System.out.println("血量2 = " + blood2);

//        技能伤害 = 攻击力 * 技能倍率 - 防御力
        double Damage2 = attack * skill - defence2;

        blood2 = blood2 - Damage2;
        System.out.println("血量2 = " + blood2);
    }
}
/*变量使用的若干注意事项
1.只能存一个值
2.变量名不能重复
3.变量在使用之前一定要赋值
4.一个语句一般不会定义多个变量

 */