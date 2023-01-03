class postiveMissing{
    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctidx=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correctidx]){
                swap(nums,i,correctidx);
            }else{
                i++;
            }
        }
        for(int idx=0;idx<nums.length;idx++){
            if(nums[idx]!=idx+1){
                return idx+1;
            }
        }
        return nums.length+1;
    }
    public static void swap(int[] arr, int firstidx, int secondidx) {
        int temp=arr[firstidx];
        arr[firstidx]=arr[secondidx];
        arr[secondidx]=temp;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2};
        System.out.println(missingNumber(arr));
    }
}