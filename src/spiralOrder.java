import java.util.ArrayList;
import java.util.List;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/1 20:06
 * @number 54
 */
public class spiralOrder {
    /**
     * @author  xzc
     * @date  2021/11/1 20:24
     * @time  100
     * @memory  51.43
     * @description  遍历圆圈。注意只有一行或者一列的情况。
     */
    public List<Integer> spiralOrder(int[][] matrix) {
//        int n = matrix.length, m = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        spiralOrderCircle(0,0,matrix.length-1,matrix[0].length-1,list,matrix);
        return list;
    }

    public void spiralOrderCircle(int x1, int y1, int x2, int y2, List<Integer> list, int [][] matrix){
        if (x2<x1 || y1>y2) return;
        if (x1==x2){
            for (int i=y1;i<=y2;i++)
            list.add(matrix[x1][i]);
            return;
        }
        if (y1==y2){
            for (int i=x1;i<=x2;i++) list.add(matrix[i][y1]);
            return;

        }

        for (int i=y1;i<y2;i++) list.add(matrix[x1][i]);
        for (int i=x1;i<x2;i++) list.add(matrix[i][y2]);
        for (int i=y2;i>y1;i--) list.add(matrix[x2][i]);
        for (int i=x2;i>x1;i--) list.add(matrix[i][y1]);
        spiralOrderCircle(x1+1,y1+1,x2-1,y2-1,list,matrix);
    }
}
