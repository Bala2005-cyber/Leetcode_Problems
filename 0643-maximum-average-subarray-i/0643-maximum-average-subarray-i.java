class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left=0;
        int right =0;
        double sum=0;
        double maxavg =Double.NEGATIVE_INFINITY;

        while(right < nums.length){

            sum+=nums[right];

            int window = right - left +1;

            if(window == k){

               

                maxavg = Math.max(maxavg,sum);
                sum-=nums[left];
                left++;
            }

            right++;



        }

        return (double) maxavg/k;


        
    }
}