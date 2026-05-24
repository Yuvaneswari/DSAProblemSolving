class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (String ch : strs) {

            char[] word = ch.toCharArray();  // convert to char array
            Arrays.sort(word);               // sort characters

            String key = new String(word);  // create key

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(ch);
        }

        return new ArrayList<>(map.values());
    }
}