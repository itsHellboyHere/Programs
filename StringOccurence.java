public class StringOccurence {
public static int first=-1;
public static int last=-1;
public static void checkOccur(String s ,int idx,char element){
    if(idx==s.length()){
        System.out.println("First: "+first);
        System.out.println("Last: "+last);
        return;
    }
    char currElement=s.charAt(idx);
    if(currElement==element){
        if(first==-1){
            first=idx;
        }
        else{
            last=idx;
        }
    }
    checkOccur(s, idx+1, element);
}

    public static void main(String[] args) {
        String s="baacdaefah";
        checkOccur(s, 0, 'a');
    }
}
