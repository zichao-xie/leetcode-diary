import java.util.ArrayList;
import java.util.List;

/**
 * @author xzc
 * @version 1
 * @time 2022/1/7 16:14
 * @number 438
 */
public class findAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        char [] c1 = new char[26],c2 = new char[26];
        int n = s.length(), m = p.length();
        for (int i = 0; i < m; i++) {
            c2[p.charAt(i)-'a']++;
        }
        int l = 0, r = 0;
        while (r<n){
            c1[s.charAt(r)-'a']++;
        }
    }
}
