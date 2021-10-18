/**
 * @author xzc
 * @version 1
 * @time 2021/10/18 19:04
 * @number 2
 */
public class addTwoNumbers {
    /**
     * @author  xzc
     * @time  2021/10/18 19:42
     * @description 没啥
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre  = new ListNode();
        ListNode cur = pre;
        int carry = 0;

        while (l1!=null||l2!=null){
            cur.next = new ListNode();
            cur = cur.next;
            int x= l1==null?0:l1.val;
            int y= l2==null?0:l2.val;
            cur.val = (x+y+carry)%10;
            carry=(x+y+carry)/10;

            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
        }
        if (carry!=0) cur.next = new ListNode(carry);
        return pre.next;
    }
}
