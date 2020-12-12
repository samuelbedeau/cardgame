package com.company;

public class Card {
    // Rank enum for class Card
    public enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);
        // Enum variable for the value
        private int value;
        // Constructor for Rank enum
        Rank(int value) {
            this.value = value;
        }
        // Returns previous enum value
        private int getPrevious() {
            return this.value - 1;
        }
        // Return current enum value
        private int getValue(){
            return this.value;
        }
    }
    // Suit enum for class Card
    public enum Suit {
        CLUBS("Clubs"), DIAMONDS("Diamonds"), HEARTS("Hearts"), SPADES("Spades");
        // Enum constant value
        private String name;
        //Constructor for Suit enum
        Suit(String name) {
            this.name = name;
        }

        private Suit getRandomSuit(){
            return values()[(int) (Math.random() * values().length)];
        }
    }
    // Enum instance/ Class variable types - Rank & Suit
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public Rank getRank() {
        return rank;
    }
    public Suit getSuit() {
        return suit;
    }
    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }

    public static void main(String[] args) {
        Card c = new Card(Rank.FIVE, Suit.CLUBS);
        System.out.println(c.rank.getPrevious());
        System.out.println(c.rank.getValue());
        System.out.println(c.suit.getRandomSuit());
    }
}

