/**
 * @author xzc
 * @version 1
 * @time 2022/1/14 23:41
 * @number 剑指 Offer 58 - II. 左旋转字符串
 */
public class reverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        String ans = s+s;
        return ans.substring(n, s.length()+n);
    }
}
