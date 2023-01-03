import java.util.Arrays;

public class cyclicSort {
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctidx=arr[i]-1;
            if(arr[i]!=arr[correctidx]){
                swap(arr,i,correctidx);
            }else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int firstidx, int secondidx) {
        int temp=arr[firstidx];
        arr[firstidx]=arr[secondidx];
        arr[secondidx]=temp;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
