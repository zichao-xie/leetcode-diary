/**
 * @author xzc
 * @version 1
 * @time 2021/11/2 21:41
 * @number 165
 */
public class compareVersion {
    /**
     * @author  xzc
     * @date  2021/11/2 21:49
     * @time  79.58
     * @memory  23.39
     * @description  string数组。
     */
    public int compareVersion(String version1, String version2) {
        String [] ss1 = version1.split("\\.");
        String [] ss2 = version2.split("\\.");
        int n = ss1.length, m = ss2.length;
        int i=0,j=0;
        while (i<n || j<m){
            int a = 0;
            int b = 0;
            if (i<n) a = Integer.parseInt(ss1[i++]);
            if (j<m) b = Integer.parseInt(ss2[j++]);
            if (a!=b) return a>b?1:-1;
        }
        return 0;
    }

    /**
     * @author  xzc
     * @date  2021/11/2 21:55
     * @time  100
     * @memory  81.68
     * @description  每次遇到'.'之前，计算两个字符串的值。
     */
    public int compareVersion2(String version1, String version2){
        int n = version1.length(), m = version2.length();
        int i = 0, j = 0;
        while (i<n || j<m){
            int a = 0;
            for (;i<n&& version1.charAt(i)!='.';++i){
                a = a*10 +version1.charAt(i)-'0';
            }
            ++i;
            int b = 0;
            for (;j<m&& version2.charAt(j)!='.';++j){
                b = b*10 +version2.charAt(j)-'0';
            }
            ++j;
            if (a!=b)
                return a>b?1:-1;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
