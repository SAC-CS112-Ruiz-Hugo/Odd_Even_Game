/**
 * Created by Culebra on 10/4/2016.
 */

    import java.util.Random;
    import java.util.Scanner;

public class Odd_Even_Game {
    public static void main (String[] args) {
        Random rand = new Random();
        int guess;
        int numberToGet = rand.nextInt(6);
        numberToGet++;
        int timesPlayed = 0;
        char answer;
        int numberOfOdds = 0;
        int numberOfEvens = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 6: ");
        guess = input.nextInt();

        if (guess == numberToGet) {
            System.out.println("You win!");
            timesPlayed++;
        } else if (guess != numberToGet) {
            System.out.println("You lose!");
            timesPlayed++;
        }

        if (numberToGet == 2 || numberToGet == 4 || numberToGet == 6) {
            numberOfEvens++;
        } else if (numberToGet == 1 || numberToGet == 3 || numberToGet == 5) {
            numberOfOdds++;
        }

        System.out.println("Do you want to keep playing? Y or N");
        answer = input.next().charAt(0);

        if (answer == 'Y') {
            while (answer == 'Y') {
                System.out.println("Guess a number between 1 and 6: ");
                guess = input.nextInt();

                if (guess == numberToGet) {
                    System.out.println("You win!");
                    timesPlayed++;
                    System.out.println("Do you want to keep playing? Y or N");
                    answer = input.next().charAt(0);
                } else if (guess != numberToGet) {
                    System.out.println("You lose!");
                    timesPlayed++;
                }

                if (numberToGet == 2 || numberToGet == 4 || numberToGet == 6) {
                    numberOfEvens++;
                } else if (numberToGet == 1 || numberToGet == 3 || numberToGet == 5) {
                    numberOfOdds++;
                }
            }
        } else {
            System.out.println("You played " + timesPlayed + " time(s).");
            System.out.println("The system generated " + numberOfEvens + " even numbers and "
                    + numberOfOdds + " odd numbers.");

            System.out.println("These are the user numbers: ");
            int array[] = {guess};

            for (int i = 0; i < array.length; i++)
            {
                array[i] += guess;
                System.out.println(array[i]);
            }

            System.exit(0);
        }

        System.out.println("You played " + timesPlayed + " time(s).");
        System.out.println("The system generated " + numberOfEvens + " even numbers and "
                + numberOfOdds + " odd numbers.");

        System.out.println("These are the user numbers: ");
        int array[] = {guess};

        for (int i = 0; i < array.length; i++)
        {
            array[i] += guess;
            System.out.println(array[i]);
        }
        }
    }