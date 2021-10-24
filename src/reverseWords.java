import java.util.Arrays;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/24 20:14
 * @number 557
 */
public class reverseWords {
    /**
     * @author  xzc
     * @time  2021/10/24 20:30
     * @description 继续双指针
     */
    public static String reverseWords(String s) {
        char [] chars = s.toCharArray();
        int l = 0;
        int r = 0;
        while (r<s.length()){
            if (chars[r]==' '){
                reverseChars(chars,l,r-1);
                l = r+1;
            }
            r++;
        }
        reverseChars(chars,l,r-1);
        return String.valueOf(chars);
    }

    public static void reverseChars(char [] chars,int s ,int e){
        while (s<e){
            char temp = chars[s];
            chars[s] = chars[e];
            chars[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}

