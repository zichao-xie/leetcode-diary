import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/11 21:13
 * @number 457
 */
public class circularArrayLoop {
    /**
     * @author  xzc
     * @date  2021/11/11 21:39
     * @time  27.17
     * @memory  90.74
     * @description 遍历数组。在循环里，如果访问的数组次数大于数组长度，则一定访问了重复的位置，返回false；
     */
    static int [] nums;
    static int len;
    public static boolean circularArrayLoop(int[] _nums) {
        nums = _nums;
        len = nums.length;
        for (int i = 0; i < len; i++) {
            if (checkCircularArrayLoop(i)) return true;
        }
        return false;
    }

    public static boolean checkCircularArrayLoop(int i){
        int cnt = 1;
        int cur = i;
        while ( true ) {
            if (cnt>len) return false;
            int next = ((cur + nums[cur])%len + len)%len;//越界处理
            if (nums[cur]*nums[next]<=0) return false;
            if (next == i) return cnt>1;//判断next == i 而不是 cur==i，不然会开始就false
            cur = next;
            cnt++;
        }
    }

    /**
     * @author  xzc
     * @date  2021/11/13 10:35
     * @time 100
     * @memory  84.34
     * @description  用数组记录原数组是否被访问过，并记录被访问的轮数。如果被访问过，但不是当前轮次访问的说明一定不存在环。
     *
     */
    public static boolean circularArrayLoop2(int[] nums){
        int  len = nums.length;
        int [] vis = new int[len];
        for (int i = 0,idx = 1; i < len; i++,idx++) {
            if (vis[i]!=0) continue;
            int cur = i;
            while (true) {
                int next = ((cur + nums[cur])%len+len)%len;
                if (next == cur) break;
                if (vis[next]!=0){
                    if (vis[next]!=idx) break;
                    else return true;
                }
                if (nums[cur]*nums[next]<=0) break;
                vis[next] = idx;
                cur = next;
            }
        }
        return false;
    }

    /**
     * @author  xzc
     * @date  2021/11/13 11:10
     * @time  100
     * @memory  56.32
     * @description  在原数组上修改。变为offset+i（是超出nums[i]范围的数字)
     */
    public static boolean circularArrayLoop3(int[] nums){
        int  len = nums.length;
        for (int i = 0; i < len; i++) {
            int cur = i;
            int tag = 1010 + i;
            while (nums[cur]<1010) {
                int next = ((cur + nums[cur])%len+len)%len;
                if (cur == next) break;
                if (nums[next]==tag) return true;
                if (nums[cur]*nums[next]<=0) break;
                nums[cur] = tag;
                cur = next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(circularArrayLoop3(new int[]{2,0,1}));

    }

}
