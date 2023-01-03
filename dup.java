import java.util.*;



public class dup {
    public static boolean  checkDuplicate(String s){
        //int count =0;
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++){
        if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }else{
            map.put(s.charAt(i), 1);
        }
       }
       for(int i=0;i<s.length();i++){
        if(map.containsKey(s.charAt(i))&& map.get(s.charAt(i))>1){
            return true;
        }
       }
      return false;
      //  System.out.println(count);
     // return false;
        
        
        
       // System.out.println(set);
    }
     public static void main(String[] args) {
        //int arr[]={1,3,5,1,5};
        String s ="h";
        System.out.println(checkDuplicate(s));

     }
}
