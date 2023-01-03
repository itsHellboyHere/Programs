class celingNo{
    public static int fun(int[] arr,int target,int start,int end){

         while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(target>arr[mid]){
                return fun(arr,target,mid+1,end);
            }else{
                return fun(arr,target,start,mid-1);
            }
         }
         if(target >arr[arr.length-1]){
            return -1;
         }
         return arr[start] ;
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,7,8,10,12,13};
        int target=13;
        System.out.print("Celing of a no is :");
        System.out.println(fun(arr,target,0,arr.length-1));

    }
}
