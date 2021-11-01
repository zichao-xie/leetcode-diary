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

    /**
     * @author  xzc
     * @date  2021/11/1 19:31
     * @time  75.77
     * @memory  97.75
     * @description  定理：长度为n和m的数字相乘，结果长度不会超过n+m。
     *  用数组存每次相乘的结果。
     */
    public static String multiply2(String num1, String num2) {
        int n = num1.length(), m = num2.length();
        int [] res = new int[n+m];
        for (int i = n-1; i >=0 ; i--) {
            for (int j = m-1; j >=0 ; j--) {
                int x = num1.charAt(i)-'0';
                int y = num2.charAt(j)-'0';
                int r = x*y+res[i+j+1];
                res[i+j+1] = r%10;
                res[i+j] += r/10;//注意这里！！！！
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n+m; i++) {
            if (stringBuilder.length()==0&&res[i]==0) continue;
            stringBuilder.append(res[i]);
        }
        return stringBuilder.length()==0?"0":stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println(multiply("210","300000000000000000000000000"));
    }
}
