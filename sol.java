import java.util.HashMap;

public class sol {
    static int   searchmissing(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =1;i<nums.length;i++){
            if(nums[i]>0){
            map.put(nums[i], i);
        }
    }
        //System.out.println(map);
        for(int j=1;j<nums.length;j++){
            if(!map.containsKey(j)){
                return j;
            }
        }
        return nums.length+1;
    }
    public static void main(String[] args) {
        int arr[]={1};
        System.out.println(searchmissing(arr));
    }
}
