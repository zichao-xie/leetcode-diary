/**
 * @author xzc
 * @version 1
 * @time 2021/11/1 18:51
 * @number 14
 */
public class longestCommonPrefix {
    /**
     * @author  xzc
     * @date  2021/11/1 19:01
     * @time  71.04
     * @memory  90.94
     * @description
     */
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<strs[0].length() ; i++) {
            char cur = strs[0].charAt(i);//可以将i=0提取到外面，内层少循环一次
            for (int j = 1;j<strs.length; j++) {
                if (i>strs[j].length()-1) return stringBuilder.toString();

                if (strs[j].charAt(i)!=cur) {
                    return stringBuilder.toString();
                }

            }
            stringBuilder.append(cur);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog","dog","dog"}));
    }
}
