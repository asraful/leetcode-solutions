package leetcode;

import java.util.*;

public class Solution_49 {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String wrd : strs) {

            char[] chars = wrd.toCharArray();

            Arrays.sort(chars);
            String sortedWord = new String(chars);
            /*
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }*/

            map.putIfAbsent(sortedWord, new ArrayList<>());

            map.get(sortedWord).add(wrd);
        }
        return new ArrayList<>(map.values());
    }
}
