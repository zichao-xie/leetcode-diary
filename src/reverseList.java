

/**
 * @author xzc
 * @version 1
 * @time 2022/1/13 22:19
 * @number 剑指 Offer 24. 反转链表
 */
public class reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next =  null;
        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }
}
