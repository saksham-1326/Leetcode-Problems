class Solution {
    public String countAndSay(int n) {
     String s="1"   ;

     for(int m=1;m<n;m++)
     {
        String ans="";
        int count=1;

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                ans+= count + "" +s.charAt(i-1);
                count=1;
            }
        }
        ans+= count +"" +s.charAt(s.length()-1);

        s=ans;
     }
     return s;
    }
}