class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0;
        int count2=0;
        int n=s.length();

        String vowel="aeiouAEIOU";
        for(int i=0;i<n/2;i++)
        {
            if(vowel.indexOf(s.charAt(i))!=-1)
            {
                count1++;
            }

        }

        for(int j=n/2;j<n;j++)
        {
            if(vowel.indexOf(s.charAt(j))!=-1)
            {
                count2++;
            }
        }

        return count1==count2;
    }
}