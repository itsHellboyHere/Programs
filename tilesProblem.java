public class tilesProblem {
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2; //if both are equal there is only 2 way either horizontal or vertical;
        }
        if(n<m){
            return 1; // if the n is small then m then there are only 1 way that is horizontal.
        }
        //putting the tiles in horizontal
        int horizontal=placeTiles(n-1, m);
        //putting the tiles vertical 
        int vertical=placeTiles(n-m, m);
        return horizontal+vertical;
    }
    public static void main(String[] args) {
       System.out.println(placeTiles(4, 4));
    }
}
