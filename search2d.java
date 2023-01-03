public class search2d {
    
    public static boolean search(int[][] arr,int target){
        int m=arr.length;
        int n=arr[m].length;
        int low=0;
        int high=n*m-1;
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,5},{7,8,9}};
        System.out.println(search(arr,3));

    }
}
