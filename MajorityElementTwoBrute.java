import java.util.HashMap;
import java.util.Map;

public class MajorityElementTwoBrute {
    public static void main(String[] args) {
        int arr [] = {2, 1, 4, 2 ,2 ,2, 1, 1, 6, 2, 1};
        int n = arr.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i : arr){
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
            if(entry.getValue() > n / 3){
                System.out.println("element is " + entry.getKey());
            }
        }
    }
}
