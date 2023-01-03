public class moveTheChar {

    public static void moveChar(String str,int idx,int c,String newString){
        if(idx==str.length()){
            for(int i=0;i<c;i++){
                newString+='x';
            }
            System.out.println("New String is :"+ newString);
            return;
        }

        char currElement=str.charAt(idx);

        if(currElement=='x'){
            c+=1;
            moveChar(str, idx+1, c, newString);
        }else{
            newString+=currElement;
            moveChar(str, idx+1,c , newString);
        }
    }
    public static void main(String[] args) {
        String s="axbxcxdax";
        moveChar(s, 0, 0, "");
    }
}
