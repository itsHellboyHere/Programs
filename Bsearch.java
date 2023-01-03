

public class Bsearch {
    public static void main(String[] args) {
        int arr[]={4,7,10,24,50,52,80};
        int k=1;
        int first=0;
        int last=arr.length-1;
       System.out.println(binaryCheck(arr, first, last,k));
    }
    
public static int binaryCheck(int arr[],int first,int last, int k){
    int mid=(first+last)/2;

        if(last<first){
            return -1;
        }
        if(arr[mid]<k){
            return binaryCheck(arr, mid+1, last, k);
        } 
        else if(arr[mid]==k){
            return mid;
            
        }else{
            return binaryCheck(arr, first, mid-1, k);
        }
      
   
    }
}