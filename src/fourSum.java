import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/15 10:40
 * @number 18
 */
public class fourSum {
    /**
     * @author  xzc
     * @time  2021/10/15 11:13
     * @description 四指针，注意去重。三重循环
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length<4)
            return ans;
        Arrays.sort(nums);
        for (int ll=0;ll<nums.length-3;ll++){
            if (ll>0&&nums[ll]==nums[ll-1]) continue;
            for (int rr=nums.length-1;rr>ll;rr--){
                if (rr<nums.length-1&&nums[rr]==nums[rr+1]) continue;
                int diff = target - nums[ll] - nums[rr];
                int l = ll+1;
                int r = rr-1;
                while (l<r){
                    if (nums[l]+nums[r]==diff){
                        ans.add(Arrays.asList(nums[ll],nums[l],nums[r],nums[rr]));
                        while (l<r&&nums[l]==nums[l+1]) l++;
                        while (l<r&&nums[r]==nums[r-1]) r--;
                        l++;
                        r++;
                    }else if (nums[l]+nums[r]>diff) r--;
                    else l++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        fourSum(new int[]{-3,-1,0,2,4,5},0);
    }
}
