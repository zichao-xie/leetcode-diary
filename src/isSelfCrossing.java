/**
 * @author xzc
 * @version 1
 * @time 2021/11/4 21:39
 * @number 335
 */
public class isSelfCrossing {
    /**
     * @author  xzc
     * @date  2021/11/4 22:06
     * @time  80.03
     * @memory  96.52
     * @description  好难的分类讨论，沃日
     */
    public boolean isSelfCrossing(int[] d) {
        int n = d.length;
        if (n<4) return false;
        for (int i=3;i<n;i++){
            if (d[i]>=d[i-2]&&d[i-1]<=d[i-3]) return true;
            if (i>=4 && d[i-1]==d[i-3] && d[i]+d[i-4]>=d[i-2]) return true;
            else if (i>=5 && d[i-1]<=d[i-3] && d[i-1]+d[i-5]>=d[i-3] && d[i-2]>d[i-4] && d[i] + d[i - 4] >= d[i - 2]) return true;
        }
        return false;
    }
}
