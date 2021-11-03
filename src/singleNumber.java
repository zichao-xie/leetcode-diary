/**
 * @author xzc
 * @version 1
 * @time 2021/11/3 20:52
 * @number 260
 */
public class singleNumber {
    /**
     * @author  xzc
     * @date  2021/11/3 20:59
     * @time  100
     * @memory  55.70
     * @description  全部亦或得到xor。然后找到xor中为1的位，说明两个数字在这个位上不一样。
     * 再次遍历，与该位亦或，分组再次亦或。
     *
     */
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i:nums){
            xor^=i;
        }
        int k = -1;
        for (int i=31;i>=0 && k == -1;i--){
            if (((xor >> i) & 1) == 1) k =i;
        }
        int [] ans = new int[2];
        for(int i:nums){
            if (((i>>k)&1)==1) ans[1]^=i;
            else ans[0]^=i;
        }
        return ans;
    }
}
