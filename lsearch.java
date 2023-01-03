

public class lsearch {
    public static void main(String[] args) {
        int arr[]={5,8,4,16,7};
        int X=5;
        System.out.println("Check :"+linearSearch(arr, X));
}
public static Boolean linearSearch(int arr[],int X){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==X){
            return true;
        }

    }
    return false;
}
}