class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalcol = image[sr][sc];

        if(originalcol==color){
            return image;
        }
        image[sr][sc] = color;

        Queue<int[]> q = new LinkedList<>();
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        q.add(new int[]{sr,sc});

        while(!q.isEmpty()){

            int[] temp = q.poll();

            int r = temp[0];
            int c = temp[1];


            for(int i=0;i<dr.length;i++){

                int newrow = r + dr[i];
                int newcol = c + dc[i];

                if(newrow<0 || newrow>=image.length || newcol<0 || newcol >=image[0].length|| image[newrow][newcol]!=originalcol){
                    continue;
                }

                image[newrow][newcol] = color;
                q.add(new int[]{newrow,newcol});
            }
        }  
        return image;     
    }
}