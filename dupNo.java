import java.util.*;

public class dupNo {
    public static List<Integer> checkDuplicate(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int  keys : map.keySet()) {
            if(map.get(keys)>1){
                ans.add(keys);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,1,5,4};
        System.out.println(checkDuplicate(arr));
    }
}
