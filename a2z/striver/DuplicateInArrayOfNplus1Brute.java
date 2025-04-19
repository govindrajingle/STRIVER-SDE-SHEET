package a2z.striver;

import java.util.HashMap;

public class DuplicateInArrayOfNplus1Brute {
    public static void main(String[] args) {
        int a [] = {1, 2, 3, 4, 2, 6};
        int dup = -1;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                int temp = a[i];
                if(temp == a[j]){
                    //dup = a[i];
                }
            }
        }
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<a.length; i++){
            if(!hmap.containsKey(a[i])){
                hmap.put(a[i], 0);
            } else {
                dup = a[i];
            }
        }
        System.out.println("duplicate element = "+dup);
    }
}
