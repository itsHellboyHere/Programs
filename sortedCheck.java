public class sortedCheck {

    public static boolean checksort(int arr[],int idx){
        if(idx==arr.length-1){   //stops when index==array size-1.
            return true;
        }

        if(arr[idx]<arr[idx+1]){
            return checksort(arr, idx+1);  //checkig at each level plus one that they are in ascending or not.
        }else{
            return false; // if not in ascending order then return false.
        }
    }
    public static void main(String[] args) {
     int arr[]={1,1,1,7,9};
     System.out.println(checksort(arr, 0)) ;  
    }
}
