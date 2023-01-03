public class BinarySearch {
    public static int searchElement(int arr[],int start ,int end,int key){
        if(end>=start){
        int mid=(start+end)/2;
        if(arr[mid]==key){
            return mid;
        }
        

        if(arr[mid]<key){
           return  searchElement(arr,mid+1,end,key);
        }
        else if(arr[mid]>key){
            return searchElement(arr, start, mid-1, key);
        }
    }
       
        return -1;



    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8};
       // searchElement(arr, 0, arr.length-1, 5);
        System.out.println(searchElement(arr, 0, arr.length-1, 5));
    }
    
}
