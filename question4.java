package HOMEWORK;

import java.util.Scanner;

public class question4 { public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int[] a = new int[26];
    System.out.println("输入一串字符");
    String str=in.nextLine();
    for (int i=0; i< str.length(); i++){
        char c=str.charAt(i);
        int index=c-'a';
        a[index] +=1;
    }
    for (int i=0; i<a.length; i++){
        if(a[i] != 0){
            System.out.println("字母"+(char)(i+'a')+"出现"+a[i]+"次");
        }
    }
}
}
