import java.util.Stack;

public class validStack {
    public static boolean check (String s){
        Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='{'){
                stack.push('}');
            }
            else if(c=='['){
                stack.push(']');
            }
            else if(stack.isEmpty()||stack.pop()!=c){
                return false;
            }
        }
        return true;
        }
    public static void main(String[] args) {
        String s="({";
        System.out.println(check(s));
        
    }
}
