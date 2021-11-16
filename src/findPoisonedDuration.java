/**
 * @author xzc
 * @version 1
 * @time 2021/11/16 17:09
 * @number 495
 */
public class findPoisonedDuration {
    /**
     * @author  xzc
     * @date  2021/11/16 17:12
     * @time  83.81
     * @memory  98.83
     * @description
     */
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            ans +=Math.min(duration,timeSeries[i]-timeSeries[i-1]);
        }
        return ans+duration;
    }

    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1,2},2));
    }
}
