import java.util.HashMap;
import java.util.Map;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/24 20:32
 * @number 3
 */
public class lengthOfLongestSubstring {
    /**
     * @author  xzc
     * @time  2021/10/24 20:58
     * @description map
     */
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int l = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
//                if (map.get(s.charAt(i))>=l){
//                    ans = Math.max(ans,i-l);
//                    l = map.get(s.charAt(i))+1;
//                }
                l = Math.max(map.get(s.charAt(i))+1,l);
            };
//            System.out.println(l);
            ans = Math.max(ans,i-l+1);
            map.put(s.charAt(i),i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(""));
    }
}
