class Solution {
    public int orangesRotting(int[][] grid) {
     int m = grid.length;
        int n = grid[0].length;
        Queue<int []> q = new LinkedList<>();
        
        int fresh = 0;
        int time = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2)
                    q.offer(new int[]{i,j});
                else if(grid[i][j] == 1)
                    fresh++;
            }
        }
        
        if(fresh == 0)
            return 0;
        
        int dirs[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int p[] = q.poll();
                for(int dir[] : dirs){
                    int x = p[0] + dir[0];
                    int y = p[1] + dir[1];
                    
                    if(x<0 || y<0 || y>=n || x>=m || grid[x][y] != 1)
                        continue;
                    else
                        grid[x][y] = 2;
                    
                    fresh--;
                    q.offer(new int[]{x,y});
                }
            }
            time++;
        }
        if(fresh == 0)
            return time - 1;
        return -1;
    }
}