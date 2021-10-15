import java.util.*;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/13 22:05
 * @number 15
 */
public class threeSum {
    /**
     * @author  xzc
     * @time  2021/10/13 22:05
     * @description 三指针，注意去重
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int len = nums.length;
        if (len<3)
            return lists;

        Arrays.sort(nums);

        for (int i=0;i<len-2;i++){
            //nums[i]>0时相加不可能为0
            if (nums[i]>0) break;
            if (i>0&&nums[i]==nums[i-1]) continue;//去重
            int l = i+1;
            int r = len-1;//如果i>=len-2,那么l>=len-1,因此不会进入循环，所以最外层的循环不用i<len-2
            while (l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0){
                    lists.add(Arrays.asList(nums[i],nums[l],nums[r]));//
                    while (l<r&&nums[l]==nums[l+1]) l++;
                    while (l<r&&nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }else if (sum<0) l++;
                else r--;
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
