import java.util.HashSet;

public class intersect {
    public static int[] intersection(int[] arr1,int[] arr2){
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
               // System.out.println(arr2[j]);
                return new int []{arr2[j],arr2[j]};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={1,2,3,4,6,7,8};
        intersection(arr1, arr2);
        
    }
}
