public class permutation {
    
    public static void printPermutation(String str, String Permutation){
        if(str.length()==0){//base condition will work when string will be over. 
            System.out.println(Permutation);//Printing all the possible permutation
        }

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);//finding the current character postion in the string
            String newString=str.substring(0, i+1)+str.substring(i+1);//slecting the chara from the string
            printPermutation(newString, Permutation+curr);//calling for next permutation.
        }
    }
//Time complexity of this will be O(n!).
    public static void main(String[] args) {
        String str="aba";
        printPermutation(str, "");
    }
}
