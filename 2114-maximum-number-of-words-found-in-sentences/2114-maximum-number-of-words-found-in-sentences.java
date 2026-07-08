class Solution {
    public int mostWordsFound(String[] sentences) {
        int max= 0;
        for(String sentence : sentences){
            String []word = sentence.split(" ");
            int count = word.length;

            if(count> max)  max = count;
        }
        return max;
    }
}