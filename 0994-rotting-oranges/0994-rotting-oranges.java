class Solution {
    public int orangesRotting(int[][] grid) {

        if(grid.length==0){
            return 0;
        }

        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new int[] {i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        int count = 0;
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};



        while(!q.isEmpty() && fresh > 0){
            count++;

            int size = q.size();

            while(size--> 0){

                int[] temp = q.poll();
                int r = temp[0];
                int c = temp[1];

                for(int k=0;k<dr.length;k++){

                    int newrow = r + dr[k];
                    int newcol = c + dc[k];

                    if(newrow < 0 || newrow>=grid.length || newcol < 0 || newcol >=grid[0].length || grid[newrow][newcol]!=1){
                        continue;
                    }

                    grid[newrow][newcol] = 2;
                    fresh--;

                    q.add(new int[]{newrow,newcol});




                }
            }
        }

        return fresh ==0 ? count : -1;
        
    }
}