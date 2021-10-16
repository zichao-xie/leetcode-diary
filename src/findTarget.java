import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/16 14:11
 * @number 653
 */
public class findTarget {
    /**
     * @author  xzc
     * @time  2021/10/16 14:22
     * @description 遍历，查看set中是否有
     */
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return find(root,k,set);
    }
    public boolean find(TreeNode root,int k, Set<Integer> set){
        if (root == null) return false;
        if (set.contains(k- root.val)) return true;
        set.add(root.val);
        return find(root.left,k,set) || find(root.right,k,set);
    }


    /**
     * @author  xzc
     * @time  2021/10/16 14:28
     * @description bfs
     */
    public boolean findTarget2(TreeNode root,int k) {
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            if (queue.peek()!=null){
                TreeNode node = queue.remove();
                if (set.contains(k-node.val)) return true;
                set.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }else {
                queue.remove();
            }
        }
        return false;
    }


}
