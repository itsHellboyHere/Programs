import java.util.HashSet;

class union{

    public static void  unionArray(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
       // return set.size();
       for(int value:set){
        System.out.print(" "+value);
       }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,4,6};
        int arr2[]={1,2,8,9,10,6};
       // System.out.println(unionArray(arr1, arr2));
       unionArray(arr1, arr2);
    }
}