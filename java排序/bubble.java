package sort;
//冒泡排序
public class bubble {
    public static void sort(int[] a){
        int temp;
        for (int i=0 ; i<a.length-1 ; i++){
            for (int j=0 ; j<a.length-i-1 ; j++){
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] b= new int[] { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
        sort(b);
        for (int j : b) {
            System.out.print(j + ",");
        }
    }
}
