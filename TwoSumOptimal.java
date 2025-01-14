import java.util.HashMap;

public class TwoSumOptimal {
    public static void main(String[] args) {
        int a [] = {3, 2, 4};
        int target = 6;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int difference = target - a[i];
            if(hmap.containsKey(difference)){
                System.out.println("indexes are " + i +" and " + hmap.get(difference));
                break;
            }
            hmap.put(a[i], i);
        }
        System.out.println("no match found");
    }
}
