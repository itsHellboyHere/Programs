import java.util.ArrayList;

public class crossPuzzle {
    public void fun(ArrayList<String> cross,String words){

    }
    public static void main(String[] args) {
        ArrayList<String> cross=new ArrayList<>();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                cross.add("+");
            }
            //System.out.println();
        }
        System.out.println(cross);
    }
}
