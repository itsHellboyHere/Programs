public class keypadCombination {
    
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKeypadCombination(String s,int idx,String Combination){
        if(idx==s.length()){
            System.out.println(Combination);
            return;
        }

        char ch=s.charAt(idx);
        String mapping=keypad[ch-'0'];          //finding the string index inside the map array.
        for(int i=0;i<mapping.length();i++){    //looping inside the String of the map. 
            printKeypadCombination(s, idx+1, Combination+mapping.charAt(i));            //adding string combination.
        }
    }
    //Time complexity of this will be O(4^n*n). 
    public static void main(String[] args) {
        String s="66";
        printKeypadCombination(s, 0, "");
    }
}
