import java.util.*;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/11 20:16
 * @number 451
 */
public class frequencySort {
    /**
     * @author  xzc
     * @date  2021/11/11 20:32
     * @time  36.42
     * @memory  67.82
     * @description  使用map记录次数，然后用list根据次数排序。最后根据list的顺序，输出
     */
    public static String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
//            int f = map.getOrDefault(s.charAt(i),0)+1;
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)-> map.get(b)-map.get(a));
//        int size = list.size();
        StringBuilder sb = new StringBuilder();
        for(char c : list){
            int f = map.get(c);
            sb.append(String.valueOf(c).repeat(f));
        }
        return sb.toString();
    }

    /**
     * @author  xzc
     * @date  2021/11/11 20:40
     * @time  96.96
     * @memory  46.82
     * @description  因为是ASCII所以可以创建一个二维
     */
    public static String frequencySort2(String s){
        int [][] cnts = new int[128][2];
        char [] chars = s.toCharArray();
        for (int i = 0; i < 128; i++) {
            cnts[i][0] = i;
        }

        for (char c:
             chars) {
            cnts[c][1]++;
        }

        Arrays.sort(cnts,(a,b)->b[1]-a[1]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            char c = (char) cnts[i][0];
            int f = cnts[i][1];
            while (f-->0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(frequencySort2("abbcccc"));
        Integer [] arr = {0,1,234,1234,535,456,45};
        Arrays.sort(arr,new MyComparator());
        for (Integer integer: arr
             ) {
//            System.out.println(integer==1234);

        }

    }
}
class MyComparator implements Comparator<Integer> {
    //如果o1小于o2，我们就返回正值，如果n1大于n2我们就返回负值，
    //这样颠倒一下，就可以实现反向排序了
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

