/**
 * @author xzc
 * @version 1
 * @time 2021/11/1 17:23
 * @number 541
 */
public class reverseStr {
    /**
     * @author  xzc
     * @date  2021/11/1 18:34
     * @time  100
     * @memory  63.95
     * @description  ...
     */
    public static String reverseStr(String s, int k) {
        char [] cs = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i=i+k*2) {
            reverse(cs,i,Math.min(i+k-1,n-1));
        }
        return String.valueOf(cs);
    }

    public static void  reverse(char[] cs, int l, int r){
        while (l<r){
            char c = cs[l];
            cs[l] = cs[r];
            cs[r] = c;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
    }
}
