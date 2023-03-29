/* Description
There is a new alien language which uses the latin alphabet. However, the order among letters are unknown to you. You receive a list of
non-empty words from the dictionary, where words are sorted lexicographically by the rules of this new language. Derive the order of letters
in this language.
    You may assume all letters are in lowercase.
    The dictionary is invalid, if string a is prefix of string b and b is appear before a.
    If the order is invalid, return an empty string.
    There may be multiple valid order of letters, return the smallest in normal lexicographical order.
    The letters in one string are of the same rank by default and are sorted in Human dictionary order.
        Input：["wrt","wrf","er","ett","rftt"]
        Output："wertf"
        Explanation：
        from "wrt"and"wrf" ,we can get 't'<'f'
        from "wrt"and"er" ,we can get 'w'<'e'
        from "er"and"ett" ,we can get 'r'<'t'
        from "ett"and"rftt" ,we can get 'e'<'r'
        So return "wertf
 */
package Graph1;

import java.util.*;

public class Alien_Dictionary {
//    public class Solution {
        public static String alienOrder(String[] words) {
            HashMap<Character, List<Character>> map = new HashMap<>();
            for (int i = 0; i < words.length; i++) {
                String s = words[i];
                for (int j = 0; j < s.length(); j++) {
                    if (!map.containsKey(s.charAt(j))) {
                        map.put(s.charAt(j), new ArrayList<>());
                    }
                }
            }
            for (int i = 0; i < words.length - 1; i++) {
                String word1 = words[i];
                String word2 = words[i + 1];
                if(word1.startsWith(word2) && word1.length() > word2.length()) {
                    return "";
                }
                for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
                    if (word1.charAt(j) != word2.charAt(j)) {
                        map.get(word1.charAt(j)).add(word2.charAt(j));
                        break;
                    }
                }
            }
            return TopologicalSort(map);
        }
        public static String TopologicalSort(HashMap<Character,List<Character>> map) {
            int[] in = indegree(map);
            StringBuilder sb = new StringBuilder();
            Queue<Character> q = new LinkedList<>();
            for (char ch: map.keySet()) {
                if (in[ch-'a'] == 0) {
                        q.add(ch);
                }
            }
            int count = 0;
            while (!q.isEmpty()) {
                char ch = q.poll();
                sb.append(ch);
                count++;
                for (char nbrs : map.get(ch)) {
                    in[nbrs - 'a']--;
                    if (in[nbrs - 'a'] == 0) {
                        q.add(nbrs);
                    }
                }
            }
            return count == map.size() ? sb.toString() : "";
        }

        public static int[] indegree(HashMap<Character, List<Character>> map) {
            int[] in = new int[26];
            for (char key : map.keySet()) {
                for (char nbrs : map.get(key)) {
                    in[nbrs - 'a']++;
                }
            }
            return in;
        }
        public static void main(String[] args) {
            Alien_Dictionary ad = new Alien_Dictionary();
            String[] words = { "wrta", "wrfc", "erl", "ettn", "rfttb" };  // abcwlnertf
//            String[] words = {"wrt","wrf","er","ett","rftt"};  //  wertf
            System.out.println(ad.alienOrder(words));
        }
//    }
}
