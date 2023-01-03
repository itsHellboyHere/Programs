import java.util.*;
class nonString{
    public static void main(String[] args) {
     HashMap<String,Integer> map=new HashMap<>();
     map.put("India", 200); 
     map.put("USA", 200); 
     map.put("England", 200); 
     //System.out.println(map.get("India"));
     for  (Map.Entry<String,Integer> e:map.entrySet()){
        System.out.print(e.getKey());
        System.out.print(e.getValue());
        System.out.println();
     } 
    }
}
