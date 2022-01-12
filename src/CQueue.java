import java.util.Stack;

/**
 * @author xzc
 * @version 1
 * @time 2022/1/12 23:34
 * @number 剑指 Offer 09. 用两个栈实现队列
 */
public class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.add(value);
    }

    public int deleteHead() {
        if (!s2.isEmpty()) return s2.pop();
        if (s1.isEmpty()) return -1;
        while (!s1.isEmpty()) {
            s2.add(s1.pop());
        }
        return s2.pop();
    }
}
