import java.util.Arrays;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/22 19:51
 * @number 189
 */
public class rotate {
    /**
     * @author  xzc
     * @time  2021/10/22 20:19
     * @description 使用额外的数组存
     */
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int [] newarr = new int[n];
        for(int i=0;i<n;i++){
            newarr[(i+k)%n] = nums[i];
        }
        System.arraycopy(newarr,0,nums,0,n);
    }


        /**
         * @author  xzc
         * @time  2021/10/22 20:23
         * @description 翻转。先将nums翻转，然后分别翻转[0,k-1],[k,length-1]
         */
    public void rotate2(int [] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int [] nums,int start,int end){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * @author  xzc
     * @time  2021/10/23 11:13
     * @description 牛批
     */
    public void rotate3(int [] nums, int k) {
        int n = nums.length;
        k = k%n;
        int count = gcd(k,n);
        for (int i=0;i<count;i++){
            int cur = i;
            int pre = nums[i];
            do {
                int next = (cur+k)%n;
                int temp = nums[next];
                nums[next] = pre;
                pre = temp;
                cur = next;
            }while (i != cur);
        }
    }

    public int gcd(int x,int y) {
        return y>0?gcd(y,x%y):x;
    }

    public void rotate4(int [] nums, int k) {

    }
}
