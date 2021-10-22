import java.util.Arrays;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/22 11:11
 * @number 977
 */
public class sortedSquares {
    public int[] sortedSquares(int[] nums) {
        for (int i=0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    /**
     * @author  xzc
     * @time  2021/10/22 11:15
     * @description 双指针，平方大的放入数组末尾
     */
    public int[] sortedSquares2(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int cur = nums.length-1;
        int [] ans = new int[nums.length];
        while (l<=r){
            if (nums[l]*nums[l]>nums[r]*nums[r]){
                ans[cur] = nums[l]*nums[l];
                l++;
            }else {
                ans[cur] = nums[r]*nums[r];
                r--;
            }
            cur--;
        }
        return ans;
    }
}
