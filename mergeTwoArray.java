class mergeTwoArray{

    public static  void merge(int[] arr,int s,int e){
        int mid=(s+e)/2;
        int len1=mid-s+1;
        int len2=e-mid;
        int[] arr1= new int[len1];
        int[] arr2=new int[len2];
        int mainArrayindex=s;
        for(int i=0;i<len1;i++){
            arr1[i]=arr[mainArrayindex++];
            
        }
       mainArrayindex=mid+1;
        for(int i=0;i<len2;i++){
            arr2[i]=arr[mainArrayindex++];
            
        }
        //merge two arrays
        int index1=0;
        int index2=0;
        mainArrayindex=s;
        while(index1< len1&& index2< len2){
            if(arr1[index1]<arr2[index2]){
                arr[mainArrayindex++]=arr1[index1++];
            }
            else{
                arr[mainArrayindex++]=arr2[index2++];
            }
        }
        while(index1<len1){
            arr[mainArrayindex++]=arr1[index1++];

        }
        while(index2<len2){
            arr[mainArrayindex++]=arr2[index2++];
        }


    }
    public static void mergeSort(int []arr,int s ,int e){
        if(s>=e){
            return;
        }  // base case
        int mid=(s+e)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr ,s,e);
    }
    
    public static void main(String[] args) {
        int arr[]={2,5,1,8,9};
       // mergeTwoArray obj=new mergeTwoArray();
       mergeSort(arr, 0, arr.length-1);
       for(int i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
       }
    }
}