import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] freq = new int[26];

            // Count characters
            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Create key
            StringBuilder key = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                key.append('#');
                key.append(freq[i]);
            }

            // Create group if key doesn't exist
            if (!map.containsKey(key.toString())) {
                map.put(key.toString(), new ArrayList<>());
            }

            // Add string to its group
            map.get(key.toString()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}