import java.util.Stack;

/**
 * @author xzc
 * @version 1
 * @time 2022/1/12 23:42
 * @number 剑指 Offer 30. 包含min函数的栈
 */
public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> s1,s2;
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.add(x);
        if (s2.isEmpty() || x<=s2.peek()) s2.add(x);
    }

    public void pop() {
        if (s1.pop().equals(s2.peek())) s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}
