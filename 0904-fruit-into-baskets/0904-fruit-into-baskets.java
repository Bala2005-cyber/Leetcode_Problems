class Solution {
    public int totalFruit(int[] fruits) {

        int left =0;
        int right = 0;
        int max=0;

        Map<Integer,Integer> map = new HashMap<>();

        while(right < fruits.length){
         
         int nums = fruits[right];

         map.put(nums,map.getOrDefault(nums,0)+1);

         while(map.size() > 2){

            int leftelement = fruits[left]; 
            map.put(leftelement,map.get(leftelement)-1);

            if(map.get(leftelement)==0){

                map.remove(leftelement);
            }
            left++;
         }

         

            max = Math.max(max,right - left +1);


         
         right++;


              

        }
        return max;
        
    }
}