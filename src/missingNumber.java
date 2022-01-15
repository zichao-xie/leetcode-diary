/**
 * @author xzc
 * @version 1
 * @time 2022/1/15 21:20
 * @number 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */
public class missingNumber {
    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length-1;
        while (l<=r) {
            int m = (l+r)/2;
            if (nums[m]<m) r = m-1;
            else l = m+1;
        }
        return l;
    }
}
