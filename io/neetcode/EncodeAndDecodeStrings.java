package io.neetcode;
import java.util.*;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("neet");
        strs.add("code");
        strs.add("love");
        strs.add("you");
        String enc = encode(strs);
        System.out.println("encoded = " + enc);
        List<String> dec = decode(enc);
        System.out.println(dec);
    }

    public static String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            String revStr = reverse(str);
            int partition = revStr.length() / 2 + revStr.length() % 2; // ensures leftHalf is larger if odd
            String leftHalf = revStr.substring(0, partition);
            String rightHalf = revStr.substring(partition);
            encodedString.append(rightHalf).append(leftHalf).append("+");
        }
        return encodedString.toString();
    }

    public static List<String> decode(String str) {
        List<String> tempList = new ArrayList<>(Arrays.asList(str.split("\\+")));
        tempList.removeIf(String::isEmpty); // remove empty in case of trailing '+'
        List<String> ans = new ArrayList<>();

        for (String s : tempList) {
            int len = s.length();
            int partition = len / 2;
            // this matches how encode does partition
            if (len % 2 != 0) {
                partition = len - len / 2; // leftHalf was longer during encode
            }
            String rightHalf = s.substring(0, len - partition);
            String leftHalf = s.substring(len - partition);
            String revStr = leftHalf + rightHalf;
            ans.add(reverse(revStr));
        }
        return ans;
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
