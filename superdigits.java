public class superdigits {
    public static int  superdigitFun(String n ,int k){
        if(n.length()==1){
            return Integer.parseInt(n);
        }

        long sum=0;
        for(int i=0;i<n.length();i++){
            sum+=Character.getNumericValue(n.charAt(i));
        }
        n=String.valueOf(sum*k);
        return superdigitFun(n, 1);

    
      }

    public static void main(String[] args) {
        System.out.println(superdigitFun("9875", 4));
    }
}
