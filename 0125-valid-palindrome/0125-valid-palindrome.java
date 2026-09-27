// class Solution {
//     public boolean isPalindrome(String s) {
//      String reverse="";
//      s = s.toLowerCase();
//      for(int i=s.length()-1;i>=0;i--)
//      {
//         char ch=s.charAt(i);
//         reverse+=s.charAt(i);
//      }
//      if(s.equals(reverse))
//      {
//         return true;
//      }
//      return false;
//     }
// }
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String filter_s = "";
        for(int i =0; i<s.length();i++){
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                filter_s+=s.charAt(i);
            }
        }
        System.out.println(filter_s);
        String reverse = "";
        for(int i = filter_s.length()-1; i>=0; i--){
            reverse+=filter_s.charAt(i);
        }
        if (reverse.equals(filter_s)){
            return true;
        }
        return false;
    }
}