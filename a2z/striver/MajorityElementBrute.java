package a2z.striver;

import java.util.HashMap;

public class MajorityElementBrute {
    public static void main(String[] args) {
        int a [] = {2,2,1,1,1,2,2};
        int n = a.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i : a) {
            if (!hmap.containsKey(i)) {
                hmap.put(i, 1);
            } else {
                hmap.put(i, hmap.get(i) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (HashMap.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                max = entry.getKey();
            }
        }

        System.out.println("majority element is " + max);
    }
}
