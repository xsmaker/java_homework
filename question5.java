package HOMEWORK;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("要输入几个数");
        int n = in.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        int sum=0;
        for (int i=0; i<n ;i++){
            sum +=a[i];
        }
        double average=(double) sum/n;
        for (int i=0 ; i<n ; i++){
            if (a[i]>average){
                System.out.println(a[i] );
            }
        }
    }
}
