import java.util.HashMap;

public class uniqueIndex {
    public static  int  check(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                   // System.out.print(" "+i);
                   return i;
            }
        }
        return -1;
       // System.out.println(map);
    }
    public static void main(String[] args) {
        String s="hello";
       System.out.println(check(s));
    }
}
