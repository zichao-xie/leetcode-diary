import java.util.LinkedList;
import java.util.Queue;

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
     * @time  64.17
     * @memory 91.44
     * @description 新颜色可能与旧颜色相同,
     */
    int [] dx = {0,0,-1,1};
    int [] dy = {1,-1,0,0};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (newColor != image[sr][sc])
            fill(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int newColor,int oldColor){
        image[sr][sc]=newColor;
        for (int i=0;i<4;i++){
            int mx = sr + dx[i],my = sc + dy[i];
            if (mx>=0&&mx<image.length&&my>=0&&my<image[0].length&&image[mx][my]==oldColor){
                fill(image,mx,my,newColor,oldColor);
            }
        }
    }



    /**
     * @author  xzc
     * @date  2021/10/28 15:30
     * @time  64.17
     * @memory  62.05
     * @description  bfs
     */
    public int[][] floodFill2(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor){
            return image;
        }
        int n = image.length,m = image[0].length;
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        image[sr][sc] = newColor;
        while (!queue.isEmpty()){
            int [] cell = queue.poll();
            int x = cell[0],y = cell[1];
            for (int i=0;i<4;i++){
                int mx = x + dx[i],my = y + dy[i];
                if (mx>=0&&mx<n&&my>=0&&my<m&&image[mx][my]==oldColor){
                    queue.offer(new int[]{mx,my});
                    image[mx][my] = newColor;
                }
            }
        }
        return image;
    }
}
