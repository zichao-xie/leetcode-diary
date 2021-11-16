import java.util.ArrayList;
import java.util.List;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/16 17:13
 * @number 500
 */
public class findWords {
    public static String[] findWords(String[] words) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            int ftype = -1;
            int ntype = -1;
            for (int j = 0; j < words[i].length(); j++) {
                if (j == 0) {
                    if (str.indexOf(words[i].toLowerCase().charAt(j))<10) {
                        ftype = 0;
                    }else if (str.indexOf(words[i].toLowerCase().charAt(j))<19){
                        ftype = 1;
                    }else {
                        ftype = 2;
                    }
                }else {
                    if (str.indexOf(words[i].toLowerCase().charAt(j))<10) {
                        ntype = 0;
                    }else if (str.indexOf(words[i].toLowerCase().charAt(j))<19){
                        ntype = 1;
                    }else {
                        ntype = 2;
                    }
                }

                if (j!=0&&ftype!=ntype) {
                    ftype = -1;
                    break;
                }

            }
            if (ftype != -1 ) {
                ans.add(words[i]);
                System.out.println(words[i]);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }

    public static void main(String[] args) {
        findWords(new String[]{"adsdf","sfd"});
    }

}
