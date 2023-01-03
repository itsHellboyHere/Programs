class Solution{
    public static int[] fun(int[] arr,int targetValue){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int sum =arr[start]+arr[end];
            if(sum==targetValue){
                return new int [] {start,end};
            }
            else if(sum<targetValue){
                start++;
            }
            else{
                end--;
            }

        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int targetValue=6;
        int result[]=fun(arr, targetValue);
        System.out.println("indices are: "+result[0]+" "+ result[1]);

    }
}