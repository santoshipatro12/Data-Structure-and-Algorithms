class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length() < t.length()){
            return "";
        }

        int freq[] = new int[128];

        int left=0, start =0, count=0, minLen = Integer.MAX_VALUE;


        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i)]++;
        }

        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);

            if(freq[ch] > 0){
                count++;
            }
            freq[ch]--;
            
            while(count == t.length()){
                int windowLen = right-left+1;

                if(windowLen < minLen){
                    minLen = windowLen;
                    start= left;
                }
            
            char leftChar = s.charAt(left);
            freq[leftChar]++;

            if(freq[leftChar] >0){
                count--;
            }
            left++;
        }
    }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}