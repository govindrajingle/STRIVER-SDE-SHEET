package io.neetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Codec {
    static HashMap<Character, String> charToCode = new HashMap<>();
    static HuffmanNode root;

    public static void buildHuffmanTree(HashMap<Character, Integer> freqMap){
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.frequency));
        for(Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }
        while (pq.size() > 1){
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            HuffmanNode parent = new HuffmanNode(left.frequency + right.frequency, left, right);
            pq.add(parent);
        }
        root = pq.poll();
        buildCodeMap(root, ""); //remember to pass the empty string
    }

    public static void buildCodeMap(HuffmanNode node, String code){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            charToCode.put(node.character, code);
        }
        buildCodeMap(node.left, code+"0");
        buildCodeMap(node.right, code+"1");
    }

    public static String encode(String text){
        StringBuilder sb = new StringBuilder();
        for(char ch : text.toCharArray()){
            sb.append(charToCode.get(ch));
        }
        return sb.toString();
    }

    public static String decode(String encodedStr){
        StringBuilder sb = new StringBuilder();
        HuffmanNode current = root;
        for(int i=0; i<encodedStr.length(); i++){
            char ch = encodedStr.charAt(i);
            if(ch == '0'){
                current = current.left;
            } else {
                current = current.right;
            }
            if(current.left == null && current.right == null){
                sb.append(current.character);
                current = root;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "aavvxxffddrddddjj";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(char ch : text.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        buildHuffmanTree(freqMap);
        String encodedStr = encode(text);
        System.out.println(encodedStr);
        String decodedStr = decode(encodedStr);
        System.out.println(decodedStr);
    }
}

class HuffmanNode {
    char character;
    int frequency;
    HuffmanNode left;
    HuffmanNode right;
    HuffmanNode(char character, int frequency){
        this.character = character;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }
    HuffmanNode(int frequency, HuffmanNode left, HuffmanNode right){
        this.character = '\0';
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }
}
