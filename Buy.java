package exercise;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/8 - 17:13
 */
/*
    项目：
        用户输入消费金额
        输入完成后询问是否参加换购活动
        输入是
        弹出5个优惠活动显示供用户选择
        假设选择4
        输出消费总金额
        并显示成功换购的奖品
        输入否
        欢迎下次光临
        是否参加优惠换购活动
        1:满50元，加2元换购百事可乐饮料1瓶
        2:满100元，加3元换购500ml可乐1瓶
        3:满100元，加10元换购5公斤面粉
        4:满200元，加10元可换购1个苏泊尔炒菜锅
        5:满200员，加20元可换购欧莱雅爽肤水1瓶
 */
public class Buy {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入您的消费金额(精确到毛)：");
            double sMoney = sc.nextDouble();

            if (sMoney == 30208) {
                System.out.println("进入开发者模式");
                System.out.println("是否需要停止运行？(true/false)");
                boolean c = sc.nextBoolean();

                if (c == true) {
                    System.out.println("正在关闭系统...");
                    System.exit(0);
                }
                else if (c == false) {
                    System.exit(0);
                }
            }

            if(sMoney < 0) {
                System.out.println("输入错误！");
            }
            else if (sMoney >= 0 && sMoney < 50) {
                System.out.println("换购活动需要消费到达50元才能参加，谢谢您的光临！");
                return;
            }
            else if (sMoney >= 50) {
                System.out.println("您的消费金额已经到达要求，是否参加换购？(1/0)：");
            }

            int t = sc.nextInt();
            if (t == 0) {
                System.out.println("欢迎下次光临！");
            }
            else if (t == 1) {
                print("1:满50元，加2元换购百事可乐饮料1瓶");
                print("2:满100元，加3元换购500ml可乐1瓶");
                print("3:满100元，加10元换购5公斤面粉");
                print("4:满200元，加10元可换购1个苏泊尔炒菜锅");
                print("5:满200员，加20元可换购欧莱雅爽肤水1瓶");
                print("请输入您的选择：");
            }
            int r = 2, p = 3, l = 10, o = 20;
            int a = sc.nextInt();

            if (a < 0 && a >5) {
                System.out.println("您的输入有误，如有换购需求请重新开始！");
            }
            else if (a == 1 && sMoney >= 50) {
                System.out.println("换购成功！您本次换购了百事可乐饮料1瓶");
                System.out.println("您的本次消费为：" + (sMoney+r));
            }
            else if (a == 2 && sMoney >= 100) {
                System.out.println("换购成功！您本次换购了500ml可乐一瓶");
                System.out.println("您的本次消费为：" + (sMoney+p));
            }
            else if (a == 3 && sMoney >= 100) {
                System.out.println("换购成功！您本次换购了5公斤面粉");
                System.out.println("您的本次消费为：" + (sMoney+l));
            }
            else if (a == 4 && sMoney >= 200) {
                System.out.println("换购成功！您本次换购了一个苏泊尔炒菜锅");
                System.out.println("您的本次消费为：" + (sMoney+l));
            }
            else if (a == 5 && sMoney >= 200) {
                System.out.println("换购成功！您本次换购了欧莱雅爽肤水1瓶");
                System.out.println("您的本次消费为：" + (sMoney+o));
            }
            else {
                System.out.println("您没有选择相对应的换购额度！请重新输入！");
            }
            System.out.println("-----------------------------------------------------");
        }   while (true);
    }

    public static void print(String i){
        System.out.println(i);
    }
}
