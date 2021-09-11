package HOMEWORK;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("求第几项Fibonacci序列?\n");
        int n=in.nextInt();
        int[] Fibonacci= new int[n+1];
        Fibonacci[0]=0;
        Fibonacci[1]=1;
        int i=2;
        while (i <= n) {
            Fibonacci[i]=Fibonacci[i-1]+Fibonacci[i-2];
            i +=1;
        }
        System.out.println("第" +n+"项Fibonacci序列为"+Fibonacci[n]);
    }
}
