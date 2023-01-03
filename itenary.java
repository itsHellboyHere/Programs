import java.util.*;

public class itenary {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> reversemap=new HashMap<>();
        for(String key:tickets.keySet()){
            reversemap.put(tickets.get(key), key);
        }
        for(String key:tickets.keySet()){
            if(!reversemap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        HashMap<String,String> tickets=new java.util.HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String start=getStart(tickets);
        while(tickets.containsKey(start)){
            System.out.print(start+"->");
            start=tickets.get(start);
        }
        System.out.print(start);
    }
}
