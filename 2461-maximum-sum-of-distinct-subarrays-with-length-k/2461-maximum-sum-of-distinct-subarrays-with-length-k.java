class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int left = 0;
        int right = 0;
        long sum=0;
        long maxsum = 0;
        Set<Integer> set = new HashSet<>();

        while(right<nums.length){

            sum+=nums[right];


           

            while(set.contains(nums[right])){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
                
            }

            set.add(nums[right]);
            int window = right - left +1;
            if(window == k){
            maxsum = Math.max(maxsum,sum);
            sum-=nums[left];
            set.remove(nums[left]);
            left++;
            }

            right++;
        }
        return maxsum;
        
    }
}