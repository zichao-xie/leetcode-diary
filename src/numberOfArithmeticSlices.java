/**
 * @author xzc
 * @version 1
 * @time 2021/11/9 21:53
 * @number 413
 */
public class numberOfArithmeticSlices {
    /**
     * @author  xzc
     * @date  2021/11/9 22:09
     * @time  100
     * @memory  41
     * @description  dp
     */
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        int [] dp = new int[len];
        int ans = 0;
        for (int i = 2; i < len; i++) {
            if (nums[i]-nums[i-1] == nums[i-1]-nums[i-2])
                dp[i] = dp[i-1]+1;
            ans += dp[i];
        }
        return ans;
    }
}
