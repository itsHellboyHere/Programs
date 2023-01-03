public class pascal {
    public int fact(int i){
        if(i==0){
            return 1;
        }
        return i*(fact(i-1));
    }
public static void main(String[] args) {
        int num=3;
        pascal obj=new pascal();
        int i,j;
        for(i=0;i<num;i++){
            for(j=0;j<=num-i;j++){
                System.out.println(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(" "+
                    obj.fact(i)
                    / (obj.fact(i-j)*obj.fact(j)));
                
            }
            System.out.println();
        }
    }
}

