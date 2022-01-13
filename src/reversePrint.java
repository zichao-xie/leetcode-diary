import java.util.Stack;

/**
 * @author xzc
 * @version 1
 * @time 2022/1/13 22:11
 * @number 剑指 Offer 06. 从尾到头打印链表
 */
public class reversePrint {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int len = stack.size();
        int [] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
