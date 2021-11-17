/**
 * @author xzc
 * @version 1
 * @time 2021/11/17 17:18
 * @number 551
 */
public class checkRecord {
    /**
     * @author  xzc
     * @date  2021/11/17 17:24
     * @time  100
     * @memory  40
     * @description ...
     */
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i)=='L'){
                l++;
            }else {
                l=0;
            }
            if (s.charAt(i)=='A') {
                a++;
            }

            if (l>2||a>1) return false;
        }

        return true;
    }
}
