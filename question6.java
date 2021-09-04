package HOMEWORK;

import java.util.Random;

public class question6 {
    public static void main(String[] args){
        int[] a= new int[20];
        Random random=new Random();
        for (int i=0 ; i<20 ;i++){
            a[i]=random.nextInt(382)+77;
        }
        for (int i=0 ; i<20 ;i++){
            System.out.println(a[i]);
        }
        int min=a[0];
        for (int i=0 ; i<20 ;i++){
            if (min>a[i]){
                min=a[i];
            }
        }
        int max=a[0];
        for (int i=0 ; i<20 ;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        int sum=0;
        for (int i=0 ; i<20 ;i++){
            sum +=a[i];
        }
        float average=(float) sum/20;
        System.out.println("最小值为"+min+"，最大值为"+max+"，平均值为"+average+"，各个元素之和为"+sum);
    }
}
