import java.util.Arrays;

public class maxSub {
    public static void main(String[] args) {
        int arr[]={-4,-3,-1,4,8,6,-1,5};
        System.out.println(maxSubsum(arr));
        
    }
     public static  int maxSubsum(int arr[]) {
        int maxSum=Integer.MIN_VALUE;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
     }
}
