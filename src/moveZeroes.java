import java.util.Arrays;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/23 19:13
 * @number 283
 */
public class moveZeroes {
    /**
     * @author  xzc
     * @time  2021/10/23 19:25
     * @description 笨方法
     */
    public static void moveZeroes(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0) continue;
            int ii = i;
            while (ii>0 && nums[ii-1]==0){
                nums[ii-1]=nums[ii];
                nums[ii] = 0;
                ii--;
            }
        }
    }

    /**
     * @author  xzc
     * @time  2021/10/23 19:39
     * @description 计算当前数字前面有几个零 或者 最后补0
     */
    public static void moveZeroes2(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                count++;
            }else {
                nums[i-count] = nums[i];
                if (count!=0) nums[i] = 0;
            }
        }
    }

    /**
     * @author  xzc
     * @time  2021/10/23 19:41
     * @description 双指针。l指向已处理的字符串尾部，r指向未处理的第一个非零。
     */
    public static void moveZeroes3(int[] nums) {
        int l = 0,r = 0,n = nums.length;
        while (r<n){
            if (nums[r]!=0){
                swap(nums,l,r);
                l++;
            }
            r++;
        }
    }

    public static void swap (int [] nums,int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

    }


    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
