import java.util.ArrayList;
import java.util.List;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/27 15:21
 * @number 567
 */
public class checkInclusion {
    /**
     * @author  xzc
     * @time  2021/10/27 15:42
     * @description 双指针。初始将s1的字符在数组中全部记为--。遍历s2，若r指针的数字大于0，则移动l，并将l--；。
     *           若r-l+1==n，则返回true。
     */
    public boolean checkInclusion(String s1, String s2) {

        int [] cnt = new int[26];
        for (int i=0;i<s1.length();i++){
            cnt[s1.charAt(i)-'a']--;
        }
        int l = 0;
        for (int i=0;i<s2.length();i++){
            int x = s2.charAt(i)-'a';
            cnt[x]++;
            while (cnt[x]>0){
                cnt[s2.charAt(l)-'a']--;
                l++;
            }
            if (i-l+1==s1.length())
                return true;
        }
        return false;
    }

    public boolean checkInclusion2(String s1, String s2) {
        int n = s1.length(),m = s2.length();
        if (n>m) return false;
        int [] cnt  = new int[26];
        for (int i=0;i<n;i++){
            cnt[s1.charAt(i)-'a']--;
            cnt[s2.charAt(i)-'a']++;
        }
        int diff = 0;
        for (int i:cnt){
            if (i!=0) ++diff;
        }
        if (diff==0) return true;
        for (int i=n;i<m;i++){
            int x = s2.charAt(i)-'a';
            int y = s2.charAt(i-n)-'a';
            if (x==y){
                continue;
            }
            if (cnt[x]==0){
                diff++;
            }
            cnt[x]++;
            if (cnt[x]==0){
                diff--;
            }
            if (cnt[y]==0){
                diff++;
            }
            --cnt[y];
            if (cnt[y]==0){
                diff--;
            }
            if (diff==0) return true;

        }
        return false;
    }

}
