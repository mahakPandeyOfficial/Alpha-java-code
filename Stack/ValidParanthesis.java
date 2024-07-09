import java.util.Stack;
public class ValidParanthesis {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == '{' || ch == '[' || ch == '('){
                //opening
                stack.push(ch);
            }else{
                //closing
                if(stack.isEmpty()) {
                    return false;
                }

                if((stack.peek() == '{' && ch == '}' )
                || (stack.peek() == '[' && ch == ']') 
                || (stack.peek() == '(' && ch == ')')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{[)]}";

        System.out.println(isValid(s));
    }
}

