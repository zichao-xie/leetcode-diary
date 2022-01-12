/**
 * @author xzc
 * @version 1
 * @time 2022/1/12 22:44
 * @number 334
 */
public class increasingTriplet {
    /**
    　　* @Description: 
    　　* @author ZichaoXie
    　　* @date 2022/1/12 23:36
    　　*/
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int f1, f2;
        f1 = f2 =Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            if (f2<t) return  true;
            else if (f1<t && f2>t) f2 = t;
            else if (f1 > t) f1 = t;
        }
        return false;
    }
}
