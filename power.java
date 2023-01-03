public class power {
    public static int fun(int x,int  n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 1;
        }
        if(n%2==0){  // if the power is even then
            return fun(x, n/2)* fun(x, n/2);  //x^n/2*x^n/2
        }
        else{      //power is odd then
            return fun(x, n/2)* fun(x, n/2)*x;   //x^n/2*x^n/2*x^1
        }
    }
    public static void main(String[] args) {
        int  x=2;
        int n=5;
        int cal=fun(x, n);
        System.out.println(cal);
    }
}
