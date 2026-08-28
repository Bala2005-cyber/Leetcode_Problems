class Solution {
    public int[] replaceElements(int[] arr) {


        ArrayList<Integer> li =  new ArrayList<>();

        int max = 0;

        for(int i=0;i<arr.length;i++){
            max = 0;
            
            for(int j=i+1;j<arr.length;j++){
              
                   
               max =  Math.max(max,arr[j]);

            }
            li.add(max);
            
        }
        
      
       
       int[] ans = new int[li.size()];
       for(int i=0;i<li.size();i++){

        ans[i] = li.get(i);
       }
       ans[li.size()-1] = -1;
        return ans;
    }

}