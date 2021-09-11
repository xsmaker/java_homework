package sort;
//希尔排序
public class shell {
    public static void sort(int[] a){
        for (int i= a.length/2; i>0; i /=2) {
            for (int j=i; j<a.length; j +=i) {
                for (int k=j; k>0; k-=i) {
                    if (a[k]<a[k-i]) {
                        int temp =a[k];
                        a[k]=a[k-1];
                        a[k-1]=temp;
                    }
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

