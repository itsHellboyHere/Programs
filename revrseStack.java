import java.util.Stack;

public class revrseStack {
    public static void  pushAtbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtbottom(s,data);
        s.push(top);
    }
    public static void  reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top=s.pop();
        reverse(s);
        pushAtbottom(s, top);
    }
    public static void main(String[] args) {

        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        reverse(s);
    while(!s.isEmpty()){
           System.out.println(s.peek());
       s.pop();
        }
    }
}
