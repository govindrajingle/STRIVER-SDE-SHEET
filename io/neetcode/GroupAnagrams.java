package io.neetcode;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<List<String>> ans = groupAnagrams(new String [] {"eat","tea","tan","ate","nat","bat","duh", "ill"});
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i< strs.length; i++){ //O(N)
            String str = strs[i];
            //sort the String so that its anagram becomes same
            char [] charArray = str.toCharArray();
            Arrays.sort(charArray); //O(K logK) K=words in String
            String constString = new String(charArray);
            //System.out.println("const strings are "+constString);
            if(map.containsKey(constString)){
                List<String> temp = map.get(constString);
                temp.add(str);
                map.put(constString, temp);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(constString, temp);
            }
        }
        System.out.println(map.toString());
        return null;
    }
}
