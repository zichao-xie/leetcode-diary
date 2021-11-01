import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/1 18:39
 * @number 1436
 */
public class destCity {
    /**
     * @author  xzc
     * @date  2021/11/1 18:46
     * @time  95.75
     * @memory  78.77
     * @description  将path放进map，当前城市作为key寻找下一个城市，找不到就是末尾。
     */
    public String destCity(List<List<String>> paths) {
        Map<String,String> map = new HashMap<>();
        for (List<String> p:paths){
            map.put(p.get(0),p.get(1));
        }
        String ans = paths.get(0).get(0);
        while (map.containsKey(ans)) ans = map.get(ans);
        return ans;
    }
}
