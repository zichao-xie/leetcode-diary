import java.util.Map;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/20 20:56
 * @number 11
 */
public class maxArea {
    /**
     * @author  xzc
     * @time  2021/10/20 20:56
     * @description 双指针，只有中间的比两边的更高才移动，否则就跳过。
     */
    public static int maxArea(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length-1;
        while (l<r){
            int  minh = Math.min(height[l],height[r]);
            res = Math.max(res,minh*(r-l));
            while (l<r&&height[l]<=minh) l++;
            while (l<r&&height[r]<=minh) r--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{4,3,2,1,4}));
    }
}
