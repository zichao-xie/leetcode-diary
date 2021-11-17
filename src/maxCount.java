/**
 * @author xzc
 * @version 1
 * @time 2021/11/17 19:35
 * @number 598
 */
public class maxCount {
    /**
     * @author  xzc
     * @date  2021/11/17 19:38
     * @time  100
     * @memory  16.16
     * @description  每次都会有(0,0)这个点，就变成求每次都被包括在内的矩形的大小。
     */
    public int maxCount(int m, int n, int[][] ops) {
        for (int [] op : ops){
            m = Math.min(m,op[0]);
            n = Math.min(n,op[1]);
        }
        return m*n;
    }
}
