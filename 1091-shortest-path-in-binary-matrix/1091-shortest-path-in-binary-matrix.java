class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;

        if(grid[0][0]!=0 || grid[n-1][n-1]!=0){

              return -1;
        }

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0,0});

        int distance = 1;

        int[] dr  = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};

        while(!q.isEmpty()){

            int size = q.size();

            while(size --> 0){

                int[] temp = q.poll();

                int r = temp[0];
                int c = temp[1];

                if(r==n-1 && c == n-1){
                    return distance;
                }

                for(int i=0;i<dr.length;i++){

                    int newrow = r + dr[i];
                    int newcol = c + dc[i];

                    if(newrow < 0 || newrow >=grid.length || newcol < 0||newcol >=grid[0].length || grid[newrow][newcol]!=0){
                        continue;
                    }

                    grid[newrow][newcol] = 1;

                    q.add(new int[]{newrow,newcol});




                }
            }

            distance++;
        }

        return -1;

        
    }
}