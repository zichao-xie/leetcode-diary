/**
 * @author xzc
 * @version 1
 * @time 2021/11/4 20:56
 * @number 273
 */
public class numberToWords {
    /**
     * @author  xzc
     * @date  2021/11/4 21:17
     * @time  32.02
     * @memory  10.44
     * @description  英语三位是一个计量单位，每次只要处理三位即可。
     * 对于x属于[0,999] 分为三类处理
     * 1. x>=100 x/100属于[1,10]
     * 2. x>=20 x/10属于[2,9]
     * 3. x!=0 x/10属于[1,19]
     * 注意 “0”
     */
    static String[] num2str_small = {
            "Zero",
            "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    static String[] num2str_medium = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    static String[] num2str_large = {
            "Billion", "Million", "Thousand", "",
    };

    static String num2str(int x){
        String ans = "";
        if (x>100){
            ans += num2str_small[x/100] + " Hundred ";
            x %= 100;
        }else if (x>=20){
            ans += num2str_medium[x/10]+ " ";
            x %= 10;
        }
        if (x!=0) ans += num2str_small[x]+" ";
        return ans;
    }

    public static String numberToWords(int num) {
        if (num == 0) return num2str_small[0];
        StringBuilder sb = new StringBuilder();
        for (int i = (int)1e9, j = 0; i >=1 ; i /= 1000, j++) {
            if (num<i) continue;
            sb.append(num2str(num/i)+ num2str_large[j]+ " ");
            num %= i;
        }
        while (sb.charAt(sb.length()-1)==' ') sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(numberToWords(201));
    }
}
