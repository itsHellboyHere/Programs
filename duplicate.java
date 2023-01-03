public class duplicate {

    public static boolean map[]=new boolean[26];
    public static void removeDuplicate(String s,int idx,String newString){
        if(idx==s.length()){
            System.out.println(newString);
            return;
        }

        char currElement=s.charAt(idx);
        if(map[currElement-'a']==true){
            removeDuplicate(s, idx+1, newString);
        }else{
            newString+=currElement;
            map[currElement-'a']=true;
            removeDuplicate(s, idx+1, newString);
        }
    }
    public static void main(String[] args) {
     String s="aabbcddee";
     removeDuplicate(s, 0, "");
        
    }
}
