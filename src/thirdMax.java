/**
 * @author xzc
 * @version 1
 * @time 2021/11/9 22:11
 * @number 414
 */
public class thirdMax {
    public static int thirdMax(int[] nums) {

        int m1 = Integer.MIN_VALUE ;
        int m2 = Integer.MIN_VALUE ;
        int m3 = Integer.MIN_VALUE ;
        int n = 0;
        for (int num : nums) {
            if (num==m1 || num==m2) continue;
            n++;
            if (num > m1) {
                m3 = m2;
                m2 = m1;
                m1 = num;
            } else if (num > m2) {
                m3 = m2;
                m2 = num;
            } else if (num > m3) {
                m3 = num;

            }
            System.out.println(m1+" "+m2+" "+m3);
        }


        return n>=3 ?m3:m1;
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2,2,5,3,5}));
    }
}
