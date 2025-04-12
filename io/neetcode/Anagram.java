package io.neetcode;

import java.util.Collection;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        boolean ans = isAnagram("racecar", "carrace");
        System.out.println(ans);
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
            } else {
                hmap.put(s.charAt(i), 1);
            }
        }
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c)-1);
            }
        }
        Collection<Integer> values = hmap.values();
        for(int value : values){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
