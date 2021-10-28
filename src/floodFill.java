/**
 * @author xzc
 * @version 1
 * @time 2021/10/28 9:25
 * @number 733
 */
public class floodFill {
    /**
     * @author  xzc
     * @date  2021/10/28 10:24
     * @time  100
     * @memory 5.31
     * @description 新颜色可能与旧颜色相同,
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (newColor == image[sr][sc]) return image;
        fill(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int newColor,int oldColor){
        if (image[sr][sc]!=oldColor) return ;
        image[sr][sc]=newColor;
        if (sr>0){
            fill(image,sr-1,sc,newColor,oldColor);
        }
        if (sc>0){
            fill(image,sr,sc-1,newColor,oldColor);
        }
        if (sr<image.length-1){
            fill(image,sr+1,sc,newColor,oldColor);
        }
        if (sc<image[0].length-1){
            fill(image,sr,sc+1,newColor,oldColor);
        }
    }

}
