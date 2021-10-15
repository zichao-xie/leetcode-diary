import java.util.HashMap;
import java.util.Map;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/13 21:51
 * @number 1
 */
public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);

        }
        return null;
    }

    public static void main(String[] args) {
        twoSum(new int[]{3,2,4},6);
    }
}
