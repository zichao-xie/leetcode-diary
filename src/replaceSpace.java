/**
 * @author xzc
 * @version 1
 * @time 2022/1/14 23:37
 * @number 剑指 Offer 05. 替换空格
 */
public class replaceSpace {
//    public String replaceSpace(String s) {
//        int length = s.length();
//        char[] array = new char[length * 3];
//        int size = 0;
//        for (int i = 0; i < length; i++) {
//            char c = s.charAt(i);
//            if (c == ' ') {
//                array[size++] = '%';
//                array[size++] = '2';
//                array[size++] = '0';
//            } else {
//                array[size++] = c;
//            }
//        }
//        String newStr = new String(array, 0, size);
//        return newStr;
//    }
    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }
}
