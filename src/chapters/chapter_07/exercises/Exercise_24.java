package chapters.chapter_07.exercises;

public class Exercise_24 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        for (int i = 0;i < deck.length;i++){
            deck[i] = i;
        }
        boolean[] diffSuits = new boolean[4];
        int countOfDiffSuit = 0;
        int countOfTry = 0;
        while (countOfDiffSuit < 4){
            deck = shuffleTheDeck(deck);
            int cardNumber = pickACard(deck);
            if (!diffSuits[cardNumber / 13]){
                diffSuits[cardNumber / 13] = true;
                System.out.println(determineTheRank(cardNumber) + " of " + determineTheSuit(cardNumber));
                countOfDiffSuit++;
            }
            countOfTry++;
        }
        System.out.println("Number of picks: " + countOfTry);
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
