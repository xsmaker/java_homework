package sort;
//归并排序
public class merge {
    public static void sort(int[] a){
        int[] temp=new int[a.length];
        sort1(a, temp, 0, a.length-1);
    }

    public static void sort1(int[] a, int[] temp, int left, int right) {
        if(left<right){
            int mid=(left+right)/2;
            sort1(a, temp, left, mid);
            sort1(a, temp, mid+1, right);
            mer(a, temp, left, mid, right);
        }
    }

    public static void mer(int[] a, int[] temp, int left, int mid, int right) {
        int i=left;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=right) {
            if (a[i]>=a[j]){
                temp[k++]=a[j++];
            }else {
                temp[k++]=a[i++];
            }
        }
        while (i<=mid) {
            temp[k++]=a[i++];
        }
        while (j<=right) {
            temp[k++]=a[j++];
        }
        k=0;
        while(left <= right){
            a[left++] = temp[k++];
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
