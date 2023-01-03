public class noRotation {
    public static int   countRotation(int [] nums){
        int pivot =pivotsearch(nums);
        
        return pivot +1;
    }
    public static int pivotsearch(int [] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]==nums[start] &&nums[mid]==nums[end]){
            
                if(nums[start]>nums[start+1]){
                    return start;
                }
                
                start++;
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }else if(nums[mid]>nums[start] || nums[mid]==nums[start] && nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
       System.out.println(countRotation(arr));
    }
}
