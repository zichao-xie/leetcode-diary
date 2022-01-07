/**
 * @author xzc
 * @version 1
 * @time 2022/1/7 15:29
 * @number 424
 */
public class characterReplacement {
    /**
     * @author  xzc
     * @date  2022/1/7 16:03
     * @time  21.68
     * @memory  72.36
     * @description  双指针，每次判断区间内出现次数最多的字符。
     */
    public int characterReplacement(String s, int k) {
       int [] cnt = new int[26];
       char [] chars = s.toCharArray();
       int ans = 0;
        for (int l = 0,r=0; r < s.length(); r++) {
            int cur = chars[r]-'A';
            cnt[cur]++;
            while (!check(cnt,k)){
                cnt[chars[l]-'A']--;
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }

    public boolean check(int[] cnt,int k){
        int max = 0, sum = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, cnt[i]);
            sum+=cnt[i];
        }
        return sum - max <= k;
    }
}
