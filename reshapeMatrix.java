public class reshapeMatrix {

    public static  void main(String[] args) {
        int [][] num={{1,2,3},{3,4,5}};
        int n=num.length;
        int m=num[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(num[i][j]);
            }
        }
        System.out.println();
        System.out.println(m);
    }
    }
