public class powersum {
    
    public static int checkPower(int X,int N ,int start){
       if(X==0){
        return 1;
       }
       if(X<0){
        return 0;
       }

        int count=0;
       for(int i=start;Math.pow(i, N)<=X;i++){ 
        count+=checkPower((int) (X-Math.pow(i, N)), N, i+1);
       }
        return count;
    }

    public static void main(String[] args) {
       System.out.println(checkPower(5, 2,1));
    }
}
