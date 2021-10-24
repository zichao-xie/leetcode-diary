/**
 * @author xzc
 * @version 1
 * @time 2021/10/24 20:05
 * @number 344
 */
public class reverseString {
    /**
     * @author  xzc
     * @time  2021/10/24 20:08
     * @description 双指针
     */
    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        while (l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l'});
    }
}
