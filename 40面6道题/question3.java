package HOMEWORK;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("输入两个整数");
        int number1=in.nextInt();
        int number2=in.nextInt();
        int i=1;
        while (i != 0){
            i = number1%number2;
            number1 = number2;
            number2 = i;
        }
        System.out.println("两个数最大公约数为"+number1);
    }
}
