import java.util.Stack;

public class pushatBottomStack {
    
    public static void pushatBottome(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatBottome(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        pushatBottome(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
