public class totalPathMaze {
    public static int countPaths(int i,int j,int n,int m){
        if(i==n||j==m){ //Crorsses the boundary of the matrix then return 0.
            return 0;
        }
        if(i==n-1&&j==m-1){ // end point of the matrix then only 1 path.
            return 1;
        }
         // at every point there is two path ,either go downwards or rightwards 
        //moving downwards so i will increase.
        int downwards=countPaths(i+1, j, n, m);
        //moving rightwards so j will increase.
        int rightwards=countPaths(i, j+1, n, m);
        int total=downwards+rightwards;
        return total;

    }

    public static void main(String[] args) {
        
        int n=2,m=2;
        countPaths(0, 0, n, m);
        System.out.println(countPaths(0, 0, n, m));
    }
}
