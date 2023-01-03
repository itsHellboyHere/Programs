public class fibnacci {
    public static void fun(int a ,int b,int n){
        if(n==0){
            return;
        }
        int s=a+b;
        System.out.println(s);
        fun(b, s, n-1);
        
    }
    public static void main(String[] args) {
        int a=0,b=1;
       int n=8;
       System.out.println(a);
       System.out.println(b);
       fun(a, b, n-2);
    }
}
