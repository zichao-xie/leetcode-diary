/**
 * @author xzc
 * @version 1
 * @time 2021/10/25 18:41
 * @number 876
 */
public class middleNode {
    public ListNode middleNode(ListNode head) {
        /**
         * @author  xzc
         * @time  2021/10/25 18:51
         * @description easy
         */
        ListNode cur = head;
        int len = 0;
        while(cur!=null){
            len++;
            cur = cur.next;
        }
        cur = head;
        int i = 0;
        while (i<len/2){
            i++;
            cur = cur.next;
        }
        return cur;
    }
}
