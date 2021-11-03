import java.util.HashMap;
import java.util.Map;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/3 19:53
 * @number 166
 */
public class fractionToDecimal {
    /**
     * @author  xzc
     * @date  2021/11/3 20:05
     * @time  30.10
     * @memory  19.28
     * @description
     */
    public String fractionToDecimal(int numerator, int denominator) {
        long a = numerator, b = denominator;
        //整除直接返回
        if(a%b==0) return String.valueOf(a/b);
        StringBuilder sb = new StringBuilder();
        //判断整数部分
        if (a*b<0) sb.append('-');
        a = Math.abs(a);
        b = Math.abs(b);
        sb.append(String.valueOf(a/b)+'.');
        a%=b;
        //存余数是否出现
        Map<Long,Integer> map = new HashMap<>();
        while (a!=0){
            map.put(a,sb.length());
            a*=10;
            sb.append(a/b);
            a%=b;
            if (map.containsKey(a)){
                int u = map.get(a);
                return String.format("%s(%s)",sb.substring(0,u),sb.substring(u));
            }
        }
        return sb.toString();
    }
}
