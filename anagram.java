import java.util.*;

import hashing.HashMap;

public class anagram {
    public static boolean checkanagram(String str,String str2){
        if(str.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
            }else{
                return false;
            }
        }
        Set<Character> key=map.keySet();
        for(Character k:key){
            if(map.get(k)!=0){
                return false;
            }
        } 
        return true;
       
    }
    public static void main(String[] args) {
        String str="hello";
        String  str2="olleh";
        if(checkanagram(str, str2)){
            System.out.println("Anagram is found!");
        }else{
            System.out.println("No Anagram found!");
        }
    }
}
