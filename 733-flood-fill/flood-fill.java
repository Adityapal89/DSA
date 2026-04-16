class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,image[sr][sc],color);
        return image;
    }

    public void dfs(int[][] img, int i, int j,int orgColor, int newColor){
        if(i<0 || j<0 || i>=img.length || j>=img[0].length || img[i][j] != orgColor || img[i][j] == newColor){
            return;
        }
        img[i][j] = newColor;
        dfs(img,i+1,j,orgColor,newColor);
        dfs(img,i,j+1,orgColor,newColor);
        dfs(img,i-1,j,orgColor,newColor);
        dfs(img,i,j-1,orgColor,newColor);
    }
}