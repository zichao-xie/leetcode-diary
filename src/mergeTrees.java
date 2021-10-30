import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/29 15:03
 * @number 617
 */
public class mergeTrees {
    /**
     * @author  xzc
     * @date  2021/10/29 17:12
     * @time  100
     * @memory  62.08
     * @description  dfs
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null) return root2;
        if (root2==null) return root1;
//        TreeNode merge = new TreeNode(root1.val+root2.val);
        root1.val = root1.val + root2.val;
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right,root2.right);
        return root1;

    }
}
