class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sumOfNatural=((n*(n+1))/2);

        int totalSum=0;
        for(int i=0;i<n;i++)
        {
            totalSum+=nums[i];
        }
        return sumOfNatural-totalSum;
    }
    
    }