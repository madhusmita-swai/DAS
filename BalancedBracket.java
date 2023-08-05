import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBracket {
    static boolean isBracketBalanced(String expr){
        Deque<Character> stack = new ArrayDeque();
        for(int i=0; i<expr.length();i++){
            char charcheck = expr.charAt(i);
            if(charcheck=='('|| charcheck=='{' || charcheck=='['){
                stack.push(charcheck);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check ;
            switch (charcheck){
                case ')':
                    check = stack.pop();
                    if(check=='}' || check==']') {
                        return false;
                    }
                    break;
                case '}' :
                    check = stack.pop();
                    if(check==')' || check==']') {
                        return false;
                    }break;

                case ']' :
                    check = stack.pop();
                    if(check==')' || check=='}') {
                        return false;

                    }
                    break;

            }


        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expr = ")([{}])";
         if(isBracketBalanced(expr)){
             System.out.println("balanced");
         }else {
             System.out.println("NOT balanced");
         }

    }
}
