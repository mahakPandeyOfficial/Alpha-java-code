import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0; //operands or operators ke liye
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; //duplicate exist
                }else{
                    s.pop();
                }
            }else{
                //opening
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))";  //true
        String str2 = "(a+b)";    //false

        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
