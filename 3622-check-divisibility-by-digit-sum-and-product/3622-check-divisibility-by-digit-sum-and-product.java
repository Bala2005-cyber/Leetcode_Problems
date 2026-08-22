class Solution {
    public boolean checkDivisibility(int n) {
       
       int sum=0;
       int product = 1;
       int dup = n;

       while(n!=0){
        int digit = n%10;
        sum+=digit;
        product*=digit;
        n=n/10;
       }

      
       if(dup%(sum+product)==0){
        return true;
       }
       else{
        return false;
       }

        
    }
}