package sort;

import java.time.temporal.Temporal;

//堆排序
public class heap {
    public static void sort(int[] a) {
        for (int i=a.length/2-1; i>=0; i--) {
            adjust_heap(a, i, a.length);
        }
        for (int i=a.length-1; i>0; i--){
            swap(a, 0,i);
            adjust_heap(a, 0, i);
        }
    }

    public static void adjust_heap(int[] a, int i, int length) {
        int temp=a[i];
        for (int j=2*i+1; j<length; j=2*j+1) {
            if (j+1<length && a[j]<a[j+1]){
                j ++;
            }
            if (a[j]>temp){
                a[i]=a[j];
                i=j;
            }else{
                break;
            }
        }
        a[i]=temp;
    }

    public  static void swap(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args){
        int[] b= new int[] { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
        sort(b);
        for (int j : b) {
            System.out.print(j + ",");
        }
    }
}
