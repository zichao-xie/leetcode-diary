import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/30 19:58
 * @number 116
 */
public class connect {
    /**
     * @author  xzc
     * @date  2021/10/30 20:22
     * @time  35.70
     * @memory  49.65
     * @description  队列
     */
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i=0;i<size;i++){
                Node node = queue.poll();
                if (i<size-1) node.next = queue.peek();
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
        }
        return root;
    }

    /**
     * @author  xzc
     * @date  2021/10/30 21:04
     * @time  100
     * @memory  57.52
     * @description  使用next指针。另root的left的next等于root的right。
     * root的right的next等于root的next的left
     */
    public Node connect1(Node root){
        if (root==null) return null;
        Node leftmost = root;
        while (leftmost.left!=null){
            Node head = leftmost;
            while (head!=null){
                head.left.next = head.right;
                if (head.next!=null) head.right.next = head.next.left;
                head = head.next;
            }
            leftmost = leftmost.left;
        }
        return root;
    }
}
