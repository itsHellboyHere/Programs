public class merge {
    public void mergeFun(int arr[],int start,int mid, int end){
     int temp[]=new int[end -start+1];
    int i=start,j=mid+1,k=0;
    while(i<=mid && j<=end){
        if(arr[i]<=arr[j]){
            temp[k]=arr[i];
            k+=1;i+=1;
        }
        else{
            temp[k]=arr[j];
            k+=1;j+=1;
        }
    }
    while(i<=mid){
        temp[k]=arr[i];
        k+=1;i+=1;
    }
    while(j<=end){
        temp[k]=arr[j];
        k+=1;j+=1;
    }
    for( i=start;i<=end;i+=1){
        arr[i]=temp[i-start];
    }
    }
    void mergeSort(int arr[],int start , int end){

        if(start<end){
            int mid=(start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            mergeFun(arr, start, mid, end);
        }
    }
    void printdetails(int arr[]){
        for(int i=0;i<=arr.length;i++){
            System.out.println("Array is :"+ arr[i]);
        }
    } 
    public static void main(String[] args) {
        int arr[]={2,1,8,3,34,6};
        merge obj=new merge();
        obj.mergeSort(arr, 0, arr.length-1);
        obj.printdetails(arr);

    }

}
