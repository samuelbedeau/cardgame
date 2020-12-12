package com.company;

// Author: Samuel Bedeau
// Purpose: Card class for variety of Card Games
public class Card {
    // Rank enum for class Card
    public enum Rank {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7)
        , EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(10), QUEEN(10), KING(10), ACE(11);
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
    // Class variable types - Rank & Suit of Enum Type
    private Rank rank;
    private Suit suit;
    // Class Constructor
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    // Class accessor methods
    public Rank getRank() {
        return rank;
    }
    public Suit getSuit() {
        return suit;
    }
    // Returns difference in rank between two Cards
    public static int difference(Card a, Card b){
        int diff = 0;
        diff = b.getRank().ordinal() - a.getRank().ordinal();
        return diff;
    }
    // Returns difference in value between two cards
    public static int differenceValue(Card a, Card b){
        int diff =0;
        diff = a.getRank().getValue() - b.getRank().getValue();
        return diff;
    }
    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }

    public static void main(String[] args) {
        Card c = new Card(Rank.TEN, Suit.CLUBS);
        Card b = new Card(Rank.QUEEN, Suit.DIAMONDS);
        System.out.println(difference(c,b));
        System.out.println(differenceValue(c,b));
        System.out.println(c.rank.getPrevious());
        System.out.println(c.rank.getValue());
        System.out.println(c.suit.getRandomSuit());

    }
}

