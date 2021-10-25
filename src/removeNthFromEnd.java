/**
 * @author xzc
 * @version 1
 * @time 2021/10/25 18:52
 * @number 19
 */
public class removeNthFromEnd {
    /**
     * @author  xzc
     * @time  2021/10/25 19:02
     * @description 数组
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode [] nodes = new ListNode[31];
        ListNode pre = new ListNode();
        ListNode cur = pre;
        pre.next = head;
        int  len = 0;
        while (cur != null){
            nodes[len] = cur;
            cur = cur.next;
            len++;
        }
        nodes[len-n-1].next = nodes[len -n].next;
        return pre.next;
    }

    /**
     * @author  xzc
     * @time  2021/10/25 19:16
     * @description 快慢指针。
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode pre = new ListNode(0,head);
        ListNode low = pre;
        ListNode fast = head;
        for (int i=0;i<n;i++){
            fast = fast.next;
        }
        while (fast!=null){
            low = low.next;
            fast = fast.next;
        }
        low.next = low.next.next;
        return pre.next;
    }
}
