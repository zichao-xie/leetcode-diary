/**
 * @author xzc
 * @version 1
 * @time 2021/11/10 21:39
 * @number 443
 */
public class compress {
    /**
     * @author  xzc
     * @date  2021/11/10 22:06
     * @time  94.44
     * @memory  83.42
     * @description
     */
    public static int compress(char[] chars) {
        int num = 1;
        int cur = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i]==chars[i-1]){
                num++;
            }else{
                if (num!=1){
                    StringBuilder sb = new StringBuilder(String.valueOf(num));
                    for (int j = 0; j <sb.length() ; j++) {
                        chars[cur] = sb.charAt(j);
                        cur++;
                    }
                }
                num = 1;
                chars[cur] = chars[i];
                cur++;
            }
        }

        if (num!=1){
            StringBuilder sb = new StringBuilder(String.valueOf(num));
            for (int j = 0; j <sb.length() ; j++) {
                chars[cur] = sb.charAt(j);
                cur++;
            }
        }

        for (int i = 0; i < cur; i++) {
            System.out.println(chars[i]);
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }
}
