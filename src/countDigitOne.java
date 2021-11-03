/**
 * @author xzc
 * @version 1
 * @time 2021/11/3 20:15
 * @number 233
 */
public class countDigitOne {
    /**
     * @author  xzc
     * @date  2021/11/3 20:44
     * @time  100
     * @memory  70.30
     * @description  https://leetcode-cn.com/problems/number-of-digit-one/solution/shu-zi-1-de-ge-shu-by-leetcode-solution-zopq/
     */
    public static int countDigitOne(int n) {
        long mulk = 1;
        int ans = 0;
        while (mulk<=n) {
            ans +=(n/(mulk*10))*mulk+Math.min(Math.max(n%(mulk*10)-mulk+1,0),mulk);
            mulk*=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countDigitOne(1000000000));
    }
}
