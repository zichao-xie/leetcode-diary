/**
 * @author xzc
 * @version 1
 * @time 2021/11/29 21:57
 * @number 88
 */
public class merge {
    /**
     * @author  xzc
     * @date  2021/11/30 16:42
     * @time  100
     * @memory  90.44
     * @description  ...
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c=0,c1=0, c2=0;
        int [] tmp = new int[m+n];
        while(c1<m || c2<n){
            if(c1<m && c2<n) {
                tmp[c++] = nums1[c1]<nums2[c2]?nums1[c1++]:nums2[c2++];
            }else if (c1<m){
                tmp[c++] = nums1[c1++];
            }else {
                tmp[c++] = nums2[c2++];
            }
        }
        System.arraycopy(tmp,0,nums1,0,m+n);
    }
}
