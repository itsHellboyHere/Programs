import java.util.Arrays;

public class bubbleSort {
    static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){ 
            boolean flag=false;// outer loop till n-1 times.
            for(int j=1;j<arr.length-1;j++){ // inner loop will run till the unsorted smaller element .
                if(arr[j]<=arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }
                
            }
            if(!flag){
                break;
            }
        }
    }
     public static void main(String[] args) {
        int arr[]={2,4,3,1,3,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
     }
}
