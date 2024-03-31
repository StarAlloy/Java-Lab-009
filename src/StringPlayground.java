import java.util.EmptyStackException;
import java.util.Stack;
// Looks complicated and could probably be cut down if you really thought about it for a minute.
public class StringPlayground {
        public static void main(String[] args) {
            StringPlayground sp = new StringPlayground();
            String s1 = "((3 + 7) * 2)";
            String s2 = "(3 + 7) * 2)";
            boolean isBalanced1 = sp.isBalanced(s1);
            boolean isBalanced2 = sp.isBalanced(s2);
            System.out.println("Is " + s1 + " balanced? " + isBalanced1);
            System.out.println("Is " + s2 + " balanced? " + isBalanced2);
        }
        public int countParentheses(String s) {
            Stack<Character> stack = new Stack<Character>();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        throw new EmptyStackException();
                    }
                    stack.pop();
                }
            }
            count = stack.size();
            return count;
        }

        public boolean isBalanced(String s) {
            try {
                countParentheses(s);
                return true;
            } catch (EmptyStackException e) {
                return false;
            }}}