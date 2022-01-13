import java.util.Arrays;

/**
 * @author xzc
 * @version 1
 * @time 2022/1/13 21:41
 * @number 747. 至少是其他数字两倍的最大数
 */
public class dominantIndex {
    /**
    　　* @Description: sb 解法（自己的
    　　* @author ZichaoXie
    　　* @date 2022/1/13 22:01
    　　*/
    public int dominantIndex(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;
        int[] cp = nums.clone();
        Arrays.sort(cp);
        if (cp[len-1] >= 2*cp[len-2]) {
            for (int i = 0; i < len; i++) {
                if (cp[len-1] == nums[i]) return i;
            }
        }
        return -1;
    }

    /**
    　　* @Description: 保留最大和第二大
    　　* @author ZichaoXie
    　　* @date 2022/1/13 22:12
    　　*/
    public int dominantIndex2(int[] nums) {
        int  len = nums.length;
        if (len == 1) return 0;
        int m1 = 0;
        int m2 = -1;
        for (int i = 1; i < len; i++) {
            if (nums[i]> nums[m1]) {
                m2 = m1;
                m1 = i;
            }else if (m2 == -1 || nums[i] >nums[m2]){
                m2 = i;
            }
        }
        return nums[m1] >= 2*nums[m2] ? m1 : -1;
    }
}
