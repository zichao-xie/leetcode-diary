import java.util.Arrays;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/16 21:16
 * @number 528
 */
 class Solution {
    /**
     * @author  xzc
     * @date  2021/11/16 21:51
     * @time  50.10
     * @memory  56.12
     * @description  sum[0]记录(0,w[0]]之间的数轴，sum[i]:(sum[i-1],sum[i-1]+w[i]];
     * rand一个数字r，使用二分法判断这个数字在哪个(sum[i-1],sum[i-1]+w[i]]之间；
     * 注意二分法的写法，r并不一定可以匹配到，要找到满足sum[i]-w[i]+1<=r<=sum[i]的i；
     */
    int [] sum;
    int total ;
    public Solution(int[] w) {
        int n = w.length;
        sum = new int[n];
        sum[0] = w[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1] + w[i];
        }
        total = Arrays.stream(w).sum();//!!!!!
    }

    public int pickIndex() {
        int x = (int) (Math.random()*total) +1 ;
        return binarySearch(x);
    }

    public int binarySearch(int x){
        int l = 0, r = sum.length-1;
        while (l<r){
            int mid = (r-l)/2 + l;
            if (x>sum[mid]) l = mid +1;
            else r = mid;
        }
        return l;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
