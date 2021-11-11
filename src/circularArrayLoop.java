import java.util.Arrays;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/11 21:13
 * @number 457
 */
public class circularArrayLoop {
    /**
     * @author  xzc
     * @date  2021/11/11 21:39
     * @time  32.52
     * @memory  9.05
     * @description 遍历数组。
     */
    public static boolean circularArrayLoop(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int [] cnt  = new int[len];
            int cur = i;
            int pre = i;
            int flag = 0;
            while (cnt[cur]==0 ) {
                cnt[cur]++;
                if (nums[cur] * nums[pre]<0) {
                    flag = -1;
                    break;
                }
                pre = cur;
                cur = (cur + nums[cur])% len;
                flag++;
                while (cur<0) cur+=len;
            }
            if (flag>1&&cur == i) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(circularArrayLoop(new int[]{-1,-2,-3,-4,-5}));
//        System.out.println(-1%2);
    }

}
