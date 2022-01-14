import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author xzc
 * @version 1
 * @time 2022/1/14 22:48
 * @number 373. 查找和最小的 K 对数字
 */
public class kSmallestPairs {
    /**
    　　* @Description: 利用优先队列保存。（注意根据值排序，队列里存的事下标
    　　* @author ZichaoXie
    　　* @date 2022/1/14 23:36
    　　*/
    boolean flag = true;
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
         int n = nums1.length, m = nums2.length;
         if(n>m) {
             flag = false;
             return kSmallestPairs(nums2,nums1,k);
         }
         List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int []> priorityQueue = new PriorityQueue<>((a,b)->(nums1[a[0]]+nums2[a[1]])-(nums1[b[0]]+nums2[b[1]]));
        for (int i = 0; i < Math.min(n,k); i++) {
            priorityQueue.add(new int[]{i,0});
        }
        while (ans.size()<k && !priorityQueue.isEmpty()) {
            int [] poll = priorityQueue.poll();
            int a =poll[0], b=poll[1];
            ans.add(new ArrayList(){{
                add(flag?nums1[a]:nums2[b]);
                add(flag?nums2[b]:nums1[a]);
            }});
            if (b+1<m) priorityQueue.add(new int[]{a,b+1});
        }
        return ans;
    }
}
