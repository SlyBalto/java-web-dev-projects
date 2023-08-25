package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write something really silly: ");

        String userInput = input.nextLine();
        String sentenceOld = userInput.toLowerCase();
        String sentence = sentenceOld.replaceAll("[^a-zA-Z]", "");
        char[] charArray = sentence.toCharArray();

        HashMap<Character, Integer> characterMap = new HashMap<>();
        for (char i : charArray) {
            if(characterMap.containsKey(i)){
                characterMap.put(i, characterMap.get(i) + 1);
            } else {
                characterMap.put(i, 1);
            }
        }

        for (Map.Entry<Character, Integer> ckey : characterMap.entrySet()) {
            System.out.println(ckey.getKey() +  ": " + ckey.getValue());
        }
    }
}