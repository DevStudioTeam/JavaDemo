package com.igromov.simpleanagram;

import java.util.Random;
import java.util.Scanner;

public class AnagramGame {

    private final Dictionary dictionary;
    private final Random random;

    public AnagramGame(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.random = new Random();
    }

    public void startLoop() {
        Scanner scanner = new Scanner(System.in);
        boolean isInterrupted = false;
        while (!isInterrupted) {
            System.out.println("> Press ENTER to get a new word, or type \"exit\"");
            String cmd = scanner.nextLine();
            if (cmd.isEmpty()) {
                String word = dictionary.next();
                String scrambled = scramble(word);
                System.out.println("> " + scrambled);
                String answer = scanner.nextLine();
                if (answer.trim().toLowerCase().equals(word)) {
                    System.out.println("> CORRECT!");
                } else {
                    System.out.println("> Incorrect!");
                }
            } else if (cmd.trim().toLowerCase().equals("exit")) {
                System.exit(0);
            }
        }
    }

    public String scramble(String inputString) {
        // Convert your string into a simple char array:
        char a[] = inputString.toCharArray();

        // Scramble the letters using the standard Fisher-Yates shuffle, 
        for (int i = 0; i < a.length - 1; i++) {
            int j = random.nextInt(a.length - 1);
            // Swap letters
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        return new String(a);
    }
}
