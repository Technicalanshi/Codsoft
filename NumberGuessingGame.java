package Numbergame;
import java.util.Scanner;
public class NumberGuessingGame
{
    public static void main(String args[]) 
    {
        int trail = 1;
        int userNumber = 0;
        int correctNumber = (int) (Math.random() * 99 + 1);           
        Scanner sc = new Scanner(System.in);
        System.out.println("****** Welcome to  the world of Guessing Number Game *******");
        do {
            System.out.println(" Please guess  a number between 1 to 100");
            if(sc.hasNextInt()) {
                userNumber = sc.nextInt();
                if (userNumber == correctNumber)
                {    
                    System.out.println("Congratulations.. Your Number is Correct. You have Won the Game!");
                    break;
                }
                else if (userNumber < correctNumber)
                    System.out.println(" OOPS! You have guess smaller no.!");
                else if (userNumber > correctNumber)
                    System.out.println(" OOPS! You have guess higher no.!");
                if(trail == 5) {
                    System.out.println("SORRY! You have finish your 5 attempts please  Try Again...");
                    break;
                }
                trail++;
            }else {
                System.out.println("Invalid  Number!");
                break;
            }
        } while (userNumber != correctNumber);
        sc.close();
    }
}