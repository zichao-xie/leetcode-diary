/**
 * @author xzc
 * @version 1
 * @time 2021/10/15 15:21
 * @number 167
 */
public class twoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while (l<r) {
            if (numbers[l]+numbers[r]==target) {
                return new int[]{l+1,r+1};
            }else if (numbers[l]+numbers[r]<target) {
                l++;
            }else {
                r--;
            }
        }
        return null;
    }
}
