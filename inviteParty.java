public class inviteParty {
    //only single and pairs are allowed.

    public static int countTotalways(int n){
        if(n<=1){   // only single choice when its equal to one.
            return 1;
        }
        int solo=countTotalways(n-1); //inviting in solo.
        int duo=(n-1)*countTotalways(n-2);//inviting in pairs(duo).
        return solo+duo;
    }
    public static void main(String[] args) {
        
        System.out.println(countTotalways(2));
    }
}
