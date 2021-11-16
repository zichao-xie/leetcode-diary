/**
 * @author xzc
 * @version 1
 * @time 2021/11/16 17:02
 * @number 492
 */
public class constructRectangle {
    /**
     * @author  xzc
     * @date  2021/11/16 17:08
     * @time  100
     * @memory  41.35
     * @description
     */
    public int[] constructRectangle(int area) {
//        int [] ans
        for (int i = (int) Math.sqrt(area); i >0; i--) {
            if (area%i==0) return new int[]{area/i,i};
        }
        return null;
    }
}
