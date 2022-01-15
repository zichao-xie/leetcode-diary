

/**
 * @author xzc
 * @version 1
 * @time 2022/1/15 20:41
 * @number 剑指 Offer 03. 数组中重复的数字
 */
public class findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int i=0;
        while (i<nums.length){
            if (nums[i]==i) {
                i++;
                continue;
            }
            if (nums[nums[i]]==nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }
}
