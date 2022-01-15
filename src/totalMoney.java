/**
 * @author xzc
 * @version 1
 * @time 2022/1/15 20:36
 * @number 1716. 计算力扣银行的钱
 */
public class totalMoney {
    public int totalMoney(int n) {
        int a = n/7, b= n%7;
        int k = 1, ans = 0;
        while (a-->0) {
            ans+=(k+k+6)*7/2;
            k++;
        }
        while (b-->0) {
            ans+=k++;
        }
        return ans;
    }
}
