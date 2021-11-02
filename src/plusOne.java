import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/2 20:51
 * @number 66
 */
public class plusOne {
    /**
     * @author  xzc
     * @date  2021/11/2 21:05
     * @time  100
     * @memory  31.07
     * @description  list
     */
    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int carry = 1;
        for (int i = digits.length-1; i >= 0 ; i--) {
            int cur = digits[i] + carry;
            carry = cur/10;
            list.add(cur%10);
        }
        if (carry!=0) list.add(carry);
        int len = 0;
        int size = list.size();
        digits = new int[size];
        while (len<size){
            digits[size-1-len] = list.get(len);
            len++;
        }
        return digits;
    }

    /**
     * @author  xzc
     * @date  2021/11/2 21:09
     * @time  100
     * @memory  94.92
     * @description  在原数组上修改
     */
    public static int[] plusOne2(int[] digits) {

        for (int i = digits.length-1; i >= 0 ; i--) {
            digits[i]++;
            digits[i]%=10;
            if (digits[i]!=0) return digits;
        }

        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        plusOne(new int[]{9});
    }
}
