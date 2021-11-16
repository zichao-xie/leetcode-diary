import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/16 20:51
 * @number 520
 */
public class detectCapitalUse {
    /**
     * @author  xzc
     * @date  2021/11/16 21:06
     * @time  15.98
     * @memory  91.35
     * @description 若[1,n]全为小写，直接返回TRUE。
     * 若全为大写并且第一位为大写，返回TRUE。
     */
    public static boolean detectCapitalUse(String _word) {

//        String word = new String(_word.substring(1));
        return  ( _word.substring(1).equals(_word.substring(1).toLowerCase()) || (_word.toUpperCase().equals(_word)) );



    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("mL"));
    }
}
