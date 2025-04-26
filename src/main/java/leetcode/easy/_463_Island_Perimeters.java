package leetcode.easy;

public class _463_Island_Perimeters {

    //https://leetcode.com/problems/island-perimeter/
    public int islandPerimeter(int[][] grid) {
        // initalise a visited set of boolean
        int rows=grid.length;
        int cols = grid[0].length;
        boolean[][]visitedIsland = new boolean[rows][cols];


        // for reach grid check if neighboring Island is there
        // while maintaining visited Island set
        for(int i = 0 ; i <rows;i++){
            for(int j = 0 ; j < cols;j++){
                // Only start DFS when you find land
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j, visitedIsland);
                }
            }
        }
        return 0;
    }

    private int dfs(int [][] grid,int rowIndex,int colIndex, boolean[][] visitedIsland) {
        // check if out of bound grid or
        // any water is there
        if(rowIndex<0 || colIndex<0 || rowIndex>=grid.length || colIndex>=grid[0].length
                || grid[rowIndex][colIndex]==0){
            // we have reached border in that case return 1
            return 1;
        }

        if(visitedIsland[rowIndex][colIndex]){
            // visited Island
            return 0;
        }


        // mark the current island as visited
        visitedIsland[rowIndex][colIndex]=true;

        // now check for all four different direction to check parameter
        return dfs(grid,rowIndex-1,colIndex,visitedIsland)+
                dfs(grid,rowIndex+1,colIndex,visitedIsland)+
                dfs(grid,rowIndex,colIndex+1,visitedIsland)+
                dfs(grid,rowIndex,colIndex-1,visitedIsland);

    }
}
