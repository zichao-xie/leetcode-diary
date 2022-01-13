import java.util.*;

/**
 * @author xzc
 * @version 1
 * @time 2022/1/13 22:28
 * @number 剑指 Offer 35. 复杂链表的复制 & 138
 */
public class copyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();
        while (cur != null) {
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur!=null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

    /**
    　　* @Description: 拼接链表
    　　* @author ZichaoXie
    　　* @date 2022/1/13 23:08
    　　*/
    public Node copyRandomList2(Node head){
        if (head == null) return null;
        Node cur = head;
        while (cur != null) {
            Node tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }
        cur = head;
        while (cur != null) {
            if (cur.random != null) cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        cur = head.next;
        Node pre = head, ans = head.next;
        while (cur.next != null) {
            pre.next = cur.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;
        return ans;

    }

}
