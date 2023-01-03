class selectionSort{
  static void swap(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
   static int Minimumindex(int arr[],int start){
    int minIndex=start;
    ++start;
    while(start<arr.length){
        if(arr[start]<arr[minIndex])
            minIndex=start;
        ++start;
        
    }
    return minIndex;

  }
  static void Sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minIndex=Minimumindex(arr, i);

            if(i!=minIndex){
                swap(arr, i, minIndex);
            }
        }
  }
static void printDetails(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println("Sorted Array :"+arr[i]);
    }
}
  public static void main(String[] args) {
    int arr[]={17,2,1,9,8,7,13};
    Sort(arr);
    printDetails(arr);
//     for(int num : arr)  
//             System.out.print(num + " ");
  }
 }
