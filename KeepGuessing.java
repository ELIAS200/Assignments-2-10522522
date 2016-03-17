 import java.util.Scanner;
import java.util.Random;
class KeepGuessing{
    public static void main(String args[]){
        int Guess;
        String name;
        Scanner ELI= new Scanner(System.in);
        Random r = new Random();
        System.out.print("Hello "  );
        System.out.println(", I am thinking of a number from 1 to 20");
        System.out.println( "Enter your guess");
         Guess=ELI.nextInt();
         System.out.println("Your Guess is: " +Guess);
         
        Guess=r.nextInt();
        while(Guess!=r.nextInt()){
        System.out.print("That is incorrect ");
			System.out.print("Guess again: ");
			Guess = ELI.nextInt();
                        System.out.println("Your Guess is: " +Guess);
        }

		System.out.println("That's right! You're a good guesser");
                
	}
}



   

        
    

    


