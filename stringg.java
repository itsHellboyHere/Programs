public class stringg {
    public static void main(String[] args) {
        String name="vishal";
        int len=name.length();
        char ch[]=name.toCharArray();
        String reverse="";
        for(int i=len-1;i>=0;i--){
            reverse+=ch[i];
        }
        System.out.println("Reverse is :"+reverse);
    }
}
