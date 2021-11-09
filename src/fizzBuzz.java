import java.util.ArrayList;
import java.util.List;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/9 20:51
 * @number 412
 */
public class fizzBuzz {
    /**
     * @author  xzc
     * @date  2021/11/9 21:51
     * @time  55.18
     * @memory  12.40
     * @description
     */
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String sb = "";
            if (i%3==0) sb+=("Fizz");
            if (i%5==0) sb+=("Buzz");
            if (sb.length()==0) sb+=i;
            ans.add(sb);
        }
        return ans;
    }
}
