public class rotatedDuplicate {
    public static void main(String[] args) {
        int arr[]={1};
        int target=1;
        System.out.println(search(arr, target));
    }
    public static boolean search(int[] nums, int target) {
        int pivot=pivotsearch(nums);
        if(pivot==-1){//case 1:when no pivot is found then normal binary search.
            return binarySearch(nums,0,nums.length-1,target);
        }
         if(nums[pivot]==target){
            return true;
        }
        if(target>=nums[0]){
            return binarySearch(nums,0,pivot-1,target);
        }
        return binarySearch(nums,pivot+1,nums.length-1,target);
    }
    
    public static int pivotsearch(int[] nums){
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
    public static boolean binarySearch(int arr[],int start ,int end,int key){
         if(end>=start){
        int mid=(start+end)/2;
        if(arr[mid]==key){
            return true;
        }
        

        if(arr[mid]<key){
           return  binarySearch(arr,mid+1,end,key);
        }
        else if(arr[mid]>key){
            return binarySearch(arr, start, mid-1, key);
        }
    }
       
        return false;
    }
}
