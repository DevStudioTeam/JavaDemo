package com.igromov.simpleanagram;

import java.util.Scanner;

public class AnagramGame {

    private final Dictionary dictionary;

    public AnagramGame(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void startLoop() {
        Scanner scanner = new Scanner(System.in);
        boolean isInterrupted = false;
        while (!isInterrupted) {
            System.out.println("> Press ENTER to get a new word, or type \"exit\"");
            System.out.print("> ");
            String cmd = scanner.next();
            if (cmd.isEmpty()) {
                
            } else if (cmd.trim().toLowerCase().equals("exit")) {
                System.exit(0);
            }
        }
    }
}
