/**
 * @author xzc
 * @version 1
 * @time 2021/11/10 21:12
 * @number 434
 */
public class countSegments {
    /**
     * @author  xzc
     * @date  2021/11/10 21:30
     * @time  100
     * @memory  92.80
     * @description  ....
     */
    public static int countSegments(String s) {
        int ans = 0;
        for (int i = 0; i < s.length();) {
            if (s.charAt(i) == ' ') {
                ++i;
                continue;
            }
            while (i<s.length() && s.charAt(i)!=' ') {
                ++i;
            }
            ans++;
//            if (s.charAt(i)!=' '){
//                ++ans;
//                while (i<s.length() && s.charAt(i)!=' ') ++i;
//            }
//            while (i<s.length() && s.charAt(i)==' ') ++i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countSegments(" a    b     "));
    }
}
