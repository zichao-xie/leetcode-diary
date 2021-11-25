import java.util.Stack;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/25 21:57
 * @number 1047
 */
public class removeDuplicates {
    public static String removeDuplicates(String s) {
        char [] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c:chars) {
            if (!stack.isEmpty()&&stack.peek()==c) {
                stack.pop();
//                System.out.println(stack.pop());
            }
            else
                stack.add(c);
//            System.out.println(stack.peek());
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
