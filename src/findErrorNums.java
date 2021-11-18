import java.util.HashMap;
import java.util.Map;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/18 20:12
 * @number 645
 */
public class findErrorNums {
    /**
     * @author  xzc
     * @date  2021/11/18 20:23
     * @time  100
     * @memory  48.25
     * @description  
     */
    public int[] findErrorNums(int[] nums) {
        int  len = nums.length;
        int [] cnt = new int[len];
        for (int i = 0; i < len; i++) {
            cnt[nums[i]-1]++;
        }
        int c = 0, d = 0;
        for (int i = 0; i < len; i++) {
            if (cnt[i]==0) d = i+1;
            if (cnt[i]==2) c = i+1;
        }
        return new int[]{c,d};
    }

    /**
     * @author  xzc
     * @date  2021/11/18 20:46
     * @time  79.74
     * @memory  83.44
     * @description  遍历，如果当前数字不等于i+1,就和nums[nums[i]-1]交换，直到nums[i]==i+1
     * 或者nums[i]==nums[nums[i]-1]
     */
    public int[] findErrorNums2(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i]!=i+1 && nums[i]!=nums[nums[i]-1]){
                //因为nums[nums[i]-1]之前nums[i]已经变了，所以交换错误。
//                int temp = nums[i];
//                nums[i] = nums[nums[i]-1];
//                nums[nums[i]-1] = temp;
                swap(nums,i,nums[i]-1);
            }
        }
        int c = 0, d = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i]!=i+1) {
                c= nums[i];
                d= i+1;
            }
        }
        return new int[]{c,d};
    }

    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
