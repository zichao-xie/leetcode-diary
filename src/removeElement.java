/**
 * @author xzc
 * @version 1
 * @time 2021/11/26 21:05
 * @number 27
 */
public class removeElement {
    /**
     * @author  xzc
     * @date  2021/11/26 21:07
     * @time  100
     * @memory  86.40
     * @description
     */
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i]!=val) {
                nums[l++]=nums[i];
            }
        }
        return l;
    }
}
