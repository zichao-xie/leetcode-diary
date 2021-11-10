import java.util.*;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/9 22:11
 * @number 414
 */
public class thirdMax {
    /**
     * @author  xzc
     * @date  2021/11/10 20:56
     * @time  24.25
     * @memory  34.37
     * @description  利用set去重，然后list排序，注意可以使用set new一个list。
     */
    public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.size()<3?list.get(list.size()-1):list.get(list.size()-3);
    }

    /**
     * @author  xzc
     * @date  2021/11/10 21:06
     * @time  100
     * @memory  86.27
     * @description  由于nums中元素的大小在整个int，因此三个最大值初始化为long最小的数。
     */
    public static int thirdMax2(int [] nums){
        long m1 = Long.MIN_VALUE ;
        long m2 = Long.MIN_VALUE ;
        long m3 = Long.MIN_VALUE ;
        for (int num : nums) {
            if (num > m1) {
                m3 = m2;
                m2 = m1;
                m1 = num;
            } else if (num > m2 && num < m1) {
                m3 = m2;
                m2 = num;
            } else if (num > m3 && num < m2) {
                m3 = num;
            }
        }
        return m3!=Long.MIN_VALUE ?(int)m3:(int)m1;
    }

    public static void main(String[] args) {
//        System.out.println(thirdMax(new int[]{2,2,3,1}));
        System.out.println(thirdMax2(new int[]{1,-2147483648,2}));
//        int a = INF;
//        System.out.println(INF);
    }
}
