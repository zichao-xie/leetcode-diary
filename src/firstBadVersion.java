/**
 * @author xzc
 * @version 1
 * @time 2021/10/21 17:10
 * @number 278
 */
public class firstBadVersion {
    public static int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l<r){
            int mid = l+(r-l)/2;
            if (isBadVersion(mid)) {
                r= mid;
            }
            else l = mid+1;
        }
        return l;
    }

    public  static boolean isBadVersion (int x){
        int bad = 1;
        if (x<bad) return false;
        else return true;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(1));
    }

}
