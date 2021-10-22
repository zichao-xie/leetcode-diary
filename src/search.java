/**
 * @author xzc
 * @version 1
 * @time 2021/10/21 16:50
 * @number 704
 */
public class search {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]<target) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},2));
    }
}
