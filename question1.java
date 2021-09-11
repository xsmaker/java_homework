package HOMEWORK;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入出生年");
        int yearofborn = in.nextInt();
        int yearofdeath = yearofborn + 100;
        int time = 0;
        for (int i = yearofborn; i <= yearofdeath; i++) {
            if (i % 400 == 0) {
                time += 1;
            } else if (i % 4 == 0 && i % 100 != 0) {
                time += 1;
            }
        }
        System.out.println("过了" + time + "个闰年");
    }
}
