class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        int num= n;

        for(int i=0;i<15;i++)
        {
            sum=0;
            while(num>0)
            {
                int digit= num%10;
                sum+=digit*digit;
                num=num/10;
            }
            if(sum==1)
            {
                return true;
            }
            num=sum;
        }
        return false;
        
    }
}