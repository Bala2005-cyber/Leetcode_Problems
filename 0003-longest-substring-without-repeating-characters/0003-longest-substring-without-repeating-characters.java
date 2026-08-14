class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int maxlen = 0;

        Set<Character> set = new HashSet<>();

        while(right < s.length()){
         
          if(!set.contains(s.charAt(right))){

            set.add(s.charAt(right));
            maxlen = Math.max(maxlen,right-left+1);
            right++;
          }
          else{

            set.remove(s.charAt(left));
            left++;
          }
          


        }

        return maxlen;

        
    }
}