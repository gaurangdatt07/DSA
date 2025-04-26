package leetcode.medium;

import java.util.Map;

public class _695_Max_Area_Of_Island {
    //https://leetcode.com/problems/max-area-of-island/description/

    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;int col=grid[0].length;int maxCount=0;

        for(int i=0;i<row;i++){
            for (int j =0;j<col;j++){
                if(grid[i][j]==1){
                    int count= dfs(grid,i,j);
                    maxCount= Math.max(count,maxCount);
                }
            }
        }
       return maxCount;
    }

    private int dfs(int[][] grid, int i, int j) {
        if(i<0 || i>=grid.length ||
        j<0 || j>=grid[0].length ||
        grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0 ; // marked visited

        return 1+dfs(grid,i-1,j)+dfs(grid,i+1,j)+
                dfs(grid,i,j-1)+dfs(grid,i,j+1);
    }
}
