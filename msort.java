public class msort {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        int k=0;
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[i]){
                arr[k++]=nums1[i++];
            }else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<m){
            arr[k]=nums1[i];
            k++;i++;
        }
        while(j<n){
            arr[k]=nums2[j];
            k++;j++;
        }
        for(int a=0;a<arr.length;a++){
            nums1[a]=arr[a];
        }
        for(int c=0;c<nums1.length;c++){
            System.out.print(nums1[c]);
        }
     }
     public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int m=arr1.length;
        int arr2[]={2,5,6};
        int n=arr2.length;
        merge(arr1, m+n, arr1, n);

     }
}
