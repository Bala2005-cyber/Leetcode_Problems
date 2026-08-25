class Solution {
    public int findCircleNum(int[][] isConnected) {

      int n = isConnected.length;

      Queue<Integer> q = new LinkedList<>();
      boolean[] visit = new boolean[n];
      int prov = 0;

for(int i=0;i<n;i++){

    if(!visit[i]){

        prov++;

        q.add(i);

        visit[i] = true;

        while(!q.isEmpty()){

            int node = q.poll();

            for(int j=0;j<n;j++){

                if(isConnected[node][j]==1 && !visit[j]){


                    visit[j] = true;
                    q.add(j);

                }
            }
        }
    }


}
      
return prov;
      

        
        
    }
}