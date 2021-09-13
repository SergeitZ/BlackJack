package com.company;

public class Card {
  private Suits suit;
  private Ranks rank;

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "\n" + rank + " of " + suit;
    }
}
