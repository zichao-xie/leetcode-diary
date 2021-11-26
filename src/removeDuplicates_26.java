/**
 * @author xzc
 * @version 1
 * @time 2021/11/26 21:01
 * @number 26
 */
public class removeDuplicates_26 {
    /**
     * @author  xzc
     * @date  2021/11/26 21:04
     * @time  92.91
     * @memory  54.31
     * @description  ..
     */
    public int removeDuplicates(int[] nums) {
        int l = 1;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i]!=nums[i-1]){
                nums[l++] = nums[i];
            }
        }
        return l;
    }
}
