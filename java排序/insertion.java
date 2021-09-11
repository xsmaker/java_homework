package sort;
//插入排序
public class insertion {
    public static void sort(int[] a){
        int temp;
        for (int i=1 ; i<a.length ; i ++){
            for (int j=i; j>0; j--) {
                if (a[j] < a[j-1]) {
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
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
