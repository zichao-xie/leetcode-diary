/**
 * @author xzc
 * @version 1
 * @time 2021/11/25 21:38
 * @number 896 （726还没做）
 */
public class isMonotonic {
    /**
     * @author  xzc
     * @date  2021/11/25 21:54
     * @time  71.02
     * @memory  91.29
     * @description ..
     */
    public static boolean isMonotonic(int[] nums) {
        int len = nums.length;
        if (len == 1 || len == 2) return true;

        int type = 0;
        for (int i = 1; i < len; i++) {
            int  diff = nums[i] - nums[i-1];
            if (diff!=0&&type==0) {
                type = diff>0?1:-1;
            }

            if (type!=0&&diff*type<0) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{2,2,2,1,4,5}));
    }
}
