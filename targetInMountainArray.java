public class targetInMountainArray {
    public static int search(int arr[],int target){
        int peak=findPeakElement(arr);
        int firstSearch=orderAgnosticbinarySearch(arr, target, 0, peak);
        if(firstSearch!=-1){
            return firstSearch;
        }
        return orderAgnosticbinarySearch(arr, target, peak+1, arr.length-1);
    }
    public static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    public static int orderAgnosticbinarySearch(int arr[],int target,int start,int end){
        
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,2,1};
        int target=5 ;
        System.out.println(search(arr, target));
    }
}
