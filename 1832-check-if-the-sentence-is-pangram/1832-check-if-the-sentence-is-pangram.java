class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        {
            return false;
        }
        String sample="qwertyuiopasdfghjklzxcvbnm";
        for(int i=0;i<sample.length();i++)
        {
            if(sentence.indexOf(sample.charAt(i))==-1)
            {
                return false;
            }
        }
        return true;
    }
}