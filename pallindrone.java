class pallindrone{

    public static boolean chekcPallindrone(String s ,int idx){
        if(idx==s.length()){
            return true;
        }
        char currElement=s.charAt(idx);
    
        chekcPallindrone(s, idx+1);
        if(currElement==s.charAt(s.length()-1)){
            return true;
        }
        return false;
    }
public static void main(String[] args) {
    String s="aba"; 
    System.out.println(chekcPallindrone(s, 0));

}
}