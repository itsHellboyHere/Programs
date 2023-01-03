import java.util.HashSet;
//subsequence follows the same order.
public class subsequenceString {
    

    public static void subseqFun(String s ,int idx,String newString,HashSet<String> set ){
        if(idx==s.length()){
            if(set.contains(newString)){   // if we want unique subesquence we have to check its presence in the set.
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        //We will give choices to the characters that if they want to come in new string or not
        char currElement=s.charAt(idx);
        subseqFun(s, idx+1, newString+currElement,set); //choice one if they want to come.

        subseqFun(s, idx+1, newString,set); //choice two if they do not want to come.

    }//Time complexity of this wil be O(2^n).
    public static void main(String[] args) {
        String s ="abc";
        HashSet<String> set=new HashSet<>();
        subseqFun(s, 0, "",set);
    }
}
