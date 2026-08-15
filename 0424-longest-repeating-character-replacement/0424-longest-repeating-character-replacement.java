class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int right =0;
        int max=0;
        int maxfreq = 0;
        
        int[] freq = new int[26];

        while(right < s.length()){

            int ch = s.charAt(right) - 'A';
            freq[ch]++;
            maxfreq = Math.max(maxfreq,freq[ch]);

            while((right - left+1) - maxfreq > k){

                int leftchar = s.charAt(left) - 'A';
                freq[leftchar]--;
                left++;
            }


             max = Math.max(max,right-left+1);

             right++;
        }

        return max;




            
        
    }
}