/**
 * @author xzc
 * @version 1
 * @time 2021/11/1 19:36
 * @number 58
 */
public class lengthOfLastWord {
    /**
     * @author  xzc
     * @date  2021/11/1 19:42
     * @time  100
     * @memory  52.87
     * @description  ...
     */
    public int lengthOfLastWord(String s) {
//        boolean flag = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i)!=' ') {
                stringBuilder.append(s.charAt(i));
//                flag=true;
            }
            else if (stringBuilder.length()!=0){
                break;
            }
        }
        return stringBuilder.length();
    }

    /**
     * @author  xzc
     * @date  2021/11/1 19:47
     * @time  100
     * @memory  84.46
     * @description  双指针
     */
    public int lengthOfLastWord2(String s) {
        int r = s.length()-1;
        while (r>=0&&s.charAt(r)==' ') r--;
        int l = r;
        while (l>=0&&s.charAt(l)!=' ') l--;
        return r-l;
    }
}
