package OOP4;

import java.util.Random;

public class DeckOfCards {
    public static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static int CARDS = 9;
    public static int PLAYERS = 4;
    public static String[][] playerCard = new String[4][9];

    public static String getRandom(String[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }

    public static void distribute() {
        for (int i = 0; i < PLAYERS; i++) {
            for (int j = 0; j < CARDS; j++) {
                String s1 = getRandom(suit);
                String s2 = getRandom(rank);
                playerCard[i][j] = s1.concat(s2);
            }
        }
    }

    public static void printCard() {
        for (int i = 0; i < PLAYERS; i++) {
            int c = i + 1;
            System.out.print("\nPlayer "+c+" :");
            for (int j = 0; j < CARDS; j++) {
                System.out.print(" "+playerCard[i][j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        distribute();
        printCard();
    }
}