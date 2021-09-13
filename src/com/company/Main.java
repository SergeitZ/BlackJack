package com.company;

public class Main {

    public static void main(String[] args) {

        DeckOfCards example = new DeckOfCards();

        example.createDeck();

        System.out.println(example);
        System.out.println(example.getCards().size());
        example.draw(5);
        System.out.println(example.getCards().size());

    }
}
