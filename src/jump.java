/**
 * @author xzc
 * @version 1
 * @time 2021/11/26 21:08
 * @number 45
 */
public class jump {
    /**
     * @author  xzc
     * @date  2021/11/26 21:28
     * @time  99.15
     * @memory  83.90
     * @description  动态规划。f[i]为到i需要的最少步数。j为最早能够一步到达i的点。
     * 状态转移方程：
     * f[i] = f[j] + 1
     */
    public static int jump(int[] nums) {
        int len = nums.length;
        int [] f = new int[len];
        for (int i = 1,j = 0; i < len; i++) {
            while (j + nums[j] < i) j++;
            f[i] = f[j] + 1;
        }
        return f[len-1];
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
    }
}
