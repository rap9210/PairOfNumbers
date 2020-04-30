import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PairOfNumbers {
    public static void main(String[] args) {
        /*
        "# Pair of Numbers: Methods"
        1. Create a HashMap where the Keys are Strings and the
        Values are Integers.
        2. Map the Keys from 2 to K and the values are the
        values in a game of blackjack (2=2,3=3...J/Q/K=10).
        3. Add a condition for the Ace so that the user may accept
         a value of 1 or 11. (Put steps 1-3 in a method)
        4. Prompt user to enter card inputs or '00' to end.
        5. If not '00': take user inputs of two card displays.
        6. Use the inputs(>>Keys) to find the value associated with
        them in the hashmap.
        7. Add those values together and display the sum.
            7a. if the sum is 21 add an "*" next to the sum.
         */
        Scanner scn = new Scanner(System.in);
        blackJackCalculator();
        String initiate = "";
        System.out.println("Welcome to 2 Card Counter");
        do {

            System.out.println("Aces can be 1 or 11, if you wish to input an Ace, \nenter it as 'A1' or 'A11'");
            System.out.println("Enter Card#1: ");
            String cardFirst = scn.nextLine();
            System.out.println("Enter Card#2: ");
            String cardSecond = scn.nextLine();


            int sumCardValues = blackJackCalculator().get(cardFirst) + blackJackCalculator().get(cardSecond);
            if (sumCardValues == 21) {
                System.out.println(sumCardValues + "*");
            } else {
                System.out.println(sumCardValues);
            }

            System.out.println("Enter '00' to end or '11' to start over.");
            initiate = scn.nextLine();
        }while(!initiate.equals("00"));
        if (initiate.equals("00")){
            System.out.println("Goodbye!");
        }
    }
    public static HashMap<String, Integer> blackJackCalculator(){
        HashMap<String, Integer> blackJackCalculator = new HashMap<>();
        String deckOfCards[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "j", "Q", "q", "K", "k", "A1", "a1", "A11", "a11"};
        for(int i = 0; i < 9 ; i++){
            blackJackCalculator.put(deckOfCards[i], Integer.parseInt(deckOfCards[i]));
        }
        for (int i = 9; i < 15; i++){
            blackJackCalculator.put(deckOfCards[i], 10);
        }
        blackJackCalculator.put(deckOfCards[15], 1);
        blackJackCalculator.put(deckOfCards[16], 1);
        blackJackCalculator.put(deckOfCards[17], 11);
        blackJackCalculator.put(deckOfCards[18], 11);

    return blackJackCalculator;}
}
