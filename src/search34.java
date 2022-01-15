/**
 * @author xzc
 * @version 1
 * @time 2022/1/15 20:51
 * @number 剑指 Offer 53 - I. 在排序数组中查找数字 I & 34
 */
public class search34 {
    public int search(int[] nums, int target) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) ans++;
        }
        return ans;
    }
}
