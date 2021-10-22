/**
 * @author xzc
 * @version 1
 * @time 2021/10/22 10:59
 * @number 35
 */
public class searchInsert {
    /**
     * @author  xzc
     * @time  2021/10/22 11:10
     * @description 
     */
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid;
        while (l<=r){
            mid = l+(r-l)/2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]>target) r = mid - 1;
            else l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},7));
    }
}
