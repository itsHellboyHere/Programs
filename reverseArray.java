import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseArray {
    static void  reverse(int []arr,int idx){
        int start=0;
        int end=arr.length-1;
        if(arr.length==0){
            return ;
        }
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
       
    }
    static void swap(int []arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void main(String[] args) {
        int arr[]={3,8,1,65,7};
        reverse(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
