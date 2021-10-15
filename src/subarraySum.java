import java.util.HashMap;
import java.util.Map;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/15 15:28
 * @number 560
 */
public class subarraySum {
    /**
     * @author  xzc
     * @time  2021/10/15 16:09
     * @description 暴力
     */
    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        for (int i=0;i<nums.length;i++){
            int sum = 0;
            for (int j=i;j<nums.length;j++){
                sum+=nums[j];
                if (sum==k) {
                    ans++;
                }
            }
        }
        return ans;
    }

    /**
     * @author  xzc
     * @time  2021/10/15 16:09
     * @description 前缀和,sum[j,i] = pre[i]-pre[j-1]。由于只要次数，可以用hash表记录次数
     */
    public static int subarraySum2(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int pre = 0;
        map.put(0,1);
        int ans = 0;
        for (int i=0;i<nums.length;i++){
            pre+=nums[i];
            if (map.containsKey(pre-k)){
                ans+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1},2));
    }
}
