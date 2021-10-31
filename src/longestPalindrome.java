/**
 * @author xzc
 * @version 1
 * @time 2021/10/31 20:26
 * @number 5
 */
public class longestPalindrome {
    /**
     * @author  xzc
     * @date  2021/10/31 21:08
     * @time  20.76
     * @memory  40.78
     * @description  dp,外层遍历子串长度。dp[i][j]表示s[i...j]是否为回文串
     */
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;
        boolean [][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        int max = 1;
        int begin = 0;
        for (int L =2;L<=len;L++){
            for (int i = 0; i < len; i++) {
                int j = i+L-1;
                if (j>=len) break;
                if (s.charAt(i)!=s.charAt(j)) {
                    dp[i][j]=false;
                }else {
                    if (L<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if (dp[i][j]&&L>max){
                    max = L;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+max);
    }

    /**
     * @author  xzc
     * @date  2021/10/31 21:25
     * @time  74.95
     * @memory  78.41
     * @description  中心扩散。注意奇偶。记录开始位置，不是中心位置！
     */
    public static String longestPalindrome2(String s){
        if (s.length()<2) return s;
        int max = 1, begin =0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s,i,i+1);
            int len2 = expandAroundCenter(s,i,i);
            int len = Math.max(len1,len2);
            if (len>max){
                max = len;
                begin = i-(len-1)/2;
            }
        }
        return s.substring(begin,begin+max);
    }

    public static int expandAroundCenter(String s, int l, int r){
        while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("acbca"));
    }
}
