import java.util.*;

public class ransomNote {
    public static boolean ransome(String ransom,String magazine){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ransom.length();i++){
            if(map.containsKey(ransom.charAt(i))){
                map.put(ransom.charAt(i), map.get(ransom.charAt(i))+1);
            }else{
                map.put(ransom.charAt(i),1);
            }
        }
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i)))
            { 
                
                if(map.get(magazine.charAt(i))==1){
                    map.remove(magazine.charAt(i));
            }
                
            else{
                map.put(magazine.charAt(i), map.get(magazine.charAt(i))-1);
            }
            if(map.isEmpty()){
                return true;
            }
        }
    }
        return false;
    }
    public static void main(String[] args) {
        String ransom="aa";
        String magazine="ab";
       System.out.println(ransome(ransom,magazine));
    }
}
