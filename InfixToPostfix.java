import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class InfixToPostfix {
    static int prec(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static String infixToPostFix(String exp){
        String result = new String();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i=0; i< exp.length();i++){
            Character c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result +=c;
            }
            else if(c=='(')
                stack.push(c);
            else if (c==')') {
                while (!stack.isEmpty() && stack.peek()!='('){
                    result += stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else  {
                while (!stack.isEmpty() && prec(c)<=prec(stack.peek())){
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }


        }
        while (!stack.isEmpty()){
            if(stack.peek()=='('){
                return "invalid expresiion";
            }
            result += stack.peek();
            stack.pop();
        }

        return result;
    }
    static int evaluatePostfix(String s) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++) {
            char cur = s.charAt(i);
            if (Character.isDigit(cur)){
                stack.push(cur-'0');
            }
            else  {
                int second = stack.pop();
                int first = stack.pop();
                int eval = calculate(first, second, cur);
                stack.push(eval);
            }
        }

        return stack.pop();
    }
    static int calculate(int a, int b, char c) {
        switch(c) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        // Function call
        System.out.println(infixToPostFix(exp));

        String exp2 = "100 200 + 2 / 5 * 7 +";

        // Function call
        System.out.println(evaluatePostfix(exp2));
    }
}
