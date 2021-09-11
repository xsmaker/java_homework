package sort;
//快速排序
public class quick {
    public static void sort(int[] a, int low , int high){
        if(low>high){
            return;
        }
        int i=low;
        int j=high;
        int pivot=a[low];
        while (i<j){
            while (pivot<=a[j]&&i<j) {
                j--;
            }
            while (pivot>=a[i]&&i<j) {
                i++;
            }
            if (i<j){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        a[low]=a[i];
        a[i]=pivot;
        sort(a, low, j-1);
        sort(a, j+1, high);
    }

    public static void main(String[] args){
        int[] b= new int[] { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
        sort(b, 0 , b.length-1);
        for (int j : b) {
            System.out.print(j + ",");
        }
    }
}
