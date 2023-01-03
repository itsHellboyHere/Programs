public class targetInfiniteArray {
    public static int searchInInfinite(int[]arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;//the new start 
            end=end+(end-start+1)*2;// new size of end will be double 
            start=newStart; // update the start.
        }
        return binarySearch(arr, target, start, end);
    }
    public static int  binarySearch(int []arr,int target,int start,int end){
        while(start<=end){
            int mid =start+(end-start)/2;
           if(target<arr[mid]){
            end=mid-1;
           }else if(target>arr[mid]){
            start=mid+1;
           }else {
            return mid;
           }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(searchInInfinite(arr, target));
    }
}
