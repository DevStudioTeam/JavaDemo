package com.igromov.simpleanagram;

public class Main {

    public static void main(String[] args) {
        AnagramGame anagramGame = new AnagramGame(new SimpleDictionary());

        anagramGame.startLoop();
    }
}
