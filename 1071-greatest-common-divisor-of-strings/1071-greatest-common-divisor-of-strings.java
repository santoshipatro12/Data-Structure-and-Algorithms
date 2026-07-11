class Solution {
    public String gcdOfStrings(String str1, String str2) {
       int min =  Math.min(str1.length(),str2.length());

      for(int len= min; len>=1; len--){
         String candidate = str1.substring(0,len);

         if(str1.length()% len !=0 || str2.length()% len !=0)
            continue;

        if(candidate.repeat(str1.length()/len).equals(str1) &&
           candidate.repeat(str2.length()/len).equals(str2) )
            return candidate;
      }
      return "";
    }
    
}