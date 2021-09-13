package com.company;

public class Main {

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();

        deck.createDeck();

//        System.out.println(deck);
        System.out.println(deck.getCards().size());
        deck.draw(5);
        System.out.println(deck.getCards().size());

    }
}
