import java.util.Random;
import java.util.Scanner;
public class Numbergame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        boolean playAgain=true;
        int totalScore=0;

        while(playAgain){
            int randomNumber=random.nextInt(100)+1;
            int attemptMade=0;
            int maxAttempts=10;
            boolean guessedCorrect=false;

            System.out.println("**********Number Guessing Game**********");
            System.out.println("Guess Number between 1 - 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while(attemptMade<maxAttempts){
                System.out.println("Enter your Guess :");
                int guessNumber;

                try {
                    guessNumber = sc.nextInt();
                }catch (Exception e) {
                    System.out.println("!!!Please enter a valid number!!!");
                    sc.nextLine();
                    continue;
                }

                attemptMade++;

                if(guessNumber==randomNumber){
                    System.out.println("$$$$$$$$$$ Well Done! you guessed the number correctly.$$$$$$$$$$");
                    System.out.println("Attempts made : "+ attemptMade);

                    totalScore += (maxAttempts - attemptMade + 1)*10;
                    guessedCorrect=true;
                    break;
                }
                else if(guessNumber<randomNumber){
                    System.out.println("Too Low! Try Again.\n");
                }
                else{
                    System.out.println("Too High! Try Again.\n");
                }
                System.out.println("Remaining Attempts : "+ (maxAttempts-attemptMade));
            }

            if(!guessedCorrect){
                System.out.println("You ran out of attempts");
                System.out.println("The correct number was : "+ randomNumber);
            }
            System.out.println("Do you want to play again? (yes/no) : ");
            String choice=sc.next();

            if(!choice.equalsIgnoreCase("yes")){
                playAgain=false;
            }
        }
        System.out.println("**********Game Over**********");
        System.out.println("Final score : "+totalScore);

        sc.close();
    }
}
