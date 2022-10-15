package chapters.chapter_07.examples;

import java.util.Arrays;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        for (int i = 0;i < deck.length;i++){
            deck[i] = i;
        }
        for (int i = 0;i < 4;i++){
            display(deck);
        }
    }

    public static void display(int[] deck) {
        shuffleTheDeck(deck);
        int cardNumber = pickACard(deck);
        System.out.println("Card number " + cardNumber + ": " + determineTheRank(cardNumber) + " of " + determineTheSuit(cardNumber));
    }

    public static int[] shuffleTheDeck(int[] deck){
        for (int i = deck.length - 1;i > 0;i--){
            int j = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        return deck;
    }
    public static int pickACard(int[] deck){
        int r = (int)(Math.random() * deck.length);
        return deck[r];
    }
    public static String determineTheSuit(int number){
        String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
        return suits[number / 13];
    }
    public static String determineTheRank(int number){
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        return ranks[number % 13];
    }

}
