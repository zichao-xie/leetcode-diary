/**
 * @author xzc
 * @version 1
 * @time 2021/10/31 21:27
 * @number 7
 */
public class reverse {
    /**
     * @author  xzc
     * @date  2021/10/31 21:33
     * @time  99.10
     * @memory  99.82
     * @description  每次循环计算计算是否越界。
     */
    public int reverse(int x) {
        int ans = 0;
        while (x!=0){
            if (x>0 && (Integer.MAX_VALUE-x%10)/10<ans) return 0;
            if (x<0 && (Integer. MIN_VALUE-x%10)/10>ans) return 0;
            ans = ans*10 + x%10;
            x/=10;
        }
        return ans;
    }
}
