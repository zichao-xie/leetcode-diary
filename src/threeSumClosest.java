import java.util.Arrays;
import java.util.Map;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/21 10:13
 * @number 16
 */
public class threeSumClosest {
    /**
     * @author  xzc
     * @time  2021/10/21 10:39
     * @description 排序，双指针
     */
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] +nums[2];
        for (int i=0;i<nums.length;i++){
            int l = i + 1;
            int r = nums.length - 1;
            while (l<r){
                int sum = nums[i] + nums[l] + nums[r] ;
                if (Math.abs(ans-target)>Math.abs(target-sum)){
                    ans = sum;
                } else if (sum<target) l++;
                else if (sum == target) return sum;
                else r--;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4},1));
    }
}
