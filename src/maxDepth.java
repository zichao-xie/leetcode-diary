/**
 * @author xzc
 * @version 1
 * @time 2022/1/7 15:15
 * @number 1614
 */
public class maxDepth {
    public  int maxDepth(String s) {
        int num = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(') num++;
            else if (s.charAt(i)==')'){
                res = res<num?num:res;
                num--;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
