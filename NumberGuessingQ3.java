import java.util.Scanner;
import java.util.Random;
class NumberGuess{
    public static void main(String args[]){
        int x;
        String name;
        Scanner ELI= new Scanner(System.in);
        System.out.println("Enter your name");
       name=ELI.nextLine();
        System.out.print("Hello " + name );
               System.out.println(", I am thinking of a number from 1 to 20");
              System.out.println( "Enter your guess");
               x=ELI.nextInt();
               System.out.println("Your Guess is: " +x);
               //x=ELI.nextInt();
        Random r = new Random(20);
        x = r.nextInt(20);
        if (x==r.nextInt())
        System.out.println("That is right! my secret number is" +r.nextInt());
        else
            System.out.println("Sorry,but I was really thinking of "+r.nextInt());
        x=r.nextInt();
       while(x==r.nextInt()){
           System.out.println("you have one more chance");
            System.out.println("Enter your name");
       name=ELI.nextLine();
        System.out.print("Hello " + name );
               System.out.println(", I am thinking of a number from 1 to 20");
              System.out.println( "Enter your guess");
               x=ELI.nextInt();
               System.out.println("Your Guess is: " +x);
               //x=ELI.nextInt();
       /* Random r = new Random(20);
        x = r.nextInt(20);*/
        if (x==r.nextInt())
        System.out.println("That is right! my secret number is" +r.nextInt());
        else
            System.out.println("Sorry,but I was really thinking of "+r.nextInt());
        x=r.nextInt();
       while(x==r.nextInt()){
           System.out.println("you have one more chance");
           
}
   }
       }
}
        
    

    


