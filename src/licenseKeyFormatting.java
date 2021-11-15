import java.util.Locale;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/15 21:57
 * @number
 */
public class licenseKeyFormatting {
    public static String licenseKeyFormatting(String _s, int k) {

        StringBuilder ans  = new StringBuilder();
        String s = new String(_s.toUpperCase());
        int cnt = 0;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i)=='-') continue;

            if (++cnt==k+1) {
                cnt = 1;
                ans.append('-');
            }
            ans.append(s.charAt(i));
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w",3));
    }
}
