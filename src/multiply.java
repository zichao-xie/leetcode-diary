import java.util.Stack;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/18 19:47
 * @number 43
 */
public class multiply {
    /**
     * @author  xzc
     * @time  2021/10/18 19:47
     * @description 可以优化，太慢了
     */
    public static String multiply(String num1, String num2) {
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        StringBuilder res = new StringBuilder("0");
        for (int i=sb2.length()-1;i>=0;i--){
            int c = sb2.charAt(i)-'0';
            if (c==0) continue;
            int carry = 0;
            StringBuilder sb3 = new StringBuilder();
            Stack stack = new Stack();
            for (int j=sb1.length()-1;j>=0;j--){
                int t = sb1.charAt(j)-'0';
                int cur = (c*t+carry)%10;
                carry = (c*t+carry)/10;
                stack.add(cur);
            }
            if (carry!=0) stack.add(carry);
            while (!stack.isEmpty()){
                sb3.append(stack.pop());
            }
            int ii = i;
            while (ii<sb2.length()-1) {
                sb3.append('0');
                ii++;
            }
            if (sb3.equals("0")) continue;
            int reslen = res.length()-1,sb3len = sb3.length()-1;
            int carry2 = 0;
            while (reslen>=0||sb3len>=0){
                int x = reslen>=0?res.charAt(reslen)-'0':0;
                int y = sb3len>=0?sb3.charAt(sb3len)-'0':0;
                stack.add((x+y+carry2)%10);
                carry2 = (x+y+carry2)/10;
                reslen--;
                sb3len--;
            }
            if (carry2!=0) stack.add(carry2);
            res = new StringBuilder();
            while (!stack.isEmpty()){
                res.append(stack.pop());
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("210","300000000000000000000000000"));
    }
}
