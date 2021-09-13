package com.company;
import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private List<Card> cards = new ArrayList<>();
    private List<Card> pulledCards = new ArrayList<>();

    public List<Card> getCards() {
        return cards;
    }

    public void draw(int numberOfCards) {
        for (int i = 0; i < numberOfCards; i++) {
            pulledCards.add(cards.remove((int) Math.floor(Math.random() * cards.size())));
        }
        System.out.println(pulledCards);
    }

    public void createDeck() {
        for (Suits s : Suits.values()) {
            for (Ranks r : Ranks.values()){
               cards.add(new Card(s, r));
            }
        }
    }

    @Override
    public String toString() {
        return "DeckOfCards{" +
                "cards=" + cards +
                '}';
    }
}
