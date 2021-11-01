/**
 * @author xzc
 * @version 1
 * @time 2021/11/1 18:47
 * @number 1480
 */
public class runningSum {
    /**
     * @author  xzc
     * @date  2021/11/1 18:49
     * @time  100
     * @memory  41.34
     * @description  ...
     */
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
