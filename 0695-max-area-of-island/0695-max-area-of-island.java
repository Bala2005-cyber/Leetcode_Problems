class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int r = grid.length;
        int c = grid[0].length;

        if(grid.length ==0){
            return 0;
        }

        int maxarea = 0;

      int[] dr = {-1,1,0,0};
      int[] dc = {0,0,-1,1};

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){

               
               Queue<int[]> q = new LinkedList<>();

               if(grid[i][j]==1){

                   q.add(new int[]{i,j});
                   int area = 0;

                   grid[i][j] = 0;

                   while(!q.isEmpty()){

                      int[] temp = q.poll();

                      int row = temp[0];
                      int col = temp[1];
                      area++;

                      for(int k=0;k<dr.length;k++){

                        

                        int newrow = row + dr[k];
                        int newcol = col + dc[k];


                        if(newrow < 0 || newrow>=r || newcol <0 || newcol>=c || grid[newrow][newcol]!=1 ){
                            continue;
                        }

                        grid[newrow][newcol] = 0;

                        q.add(new int[]{newrow,newcol});
                      }
                   }

                   maxarea = Math.max(maxarea,area);
               }



            }
        }

        return maxarea;

        
        
    }
}