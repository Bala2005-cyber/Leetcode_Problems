class Solution {
    public int[] rearrangeArray(int[] nums) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        int p=0;
        int n = 0;
        for(int i=0;i<nums.length;i++){

            if(nums[i] > 0){

                pos.add(nums[i]);
            }
            else{

                neg.add(nums[i]);
            }
        }
       
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            if(i%2==0){
                result[i] = pos.get(p);
                p++;
            }
            else{
                result[i]= neg.get(n);
                n++; 
            }
        }

        return result;
        
    }
}