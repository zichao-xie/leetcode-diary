/**
 * @author xzc
 * @version 1
 * @time 2021/12/31 10:47
 * @number 507
 */
public class checkPerfectNumber {
    /**
     * @author  xzc
     * @date  2021/12/31 10:54
     * @time  92.45
     * @memory  17.06
     * @description  ...
     */
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int res = 1, end = (int) Math.sqrt(num);
        for (int i = 2; i <= end; i++) {
            if (num%i==0){
                res+=i+num/i;
            }
        }
        return res == num;
    }
}
