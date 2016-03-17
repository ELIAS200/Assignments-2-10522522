  import java.util.Scanner;
import java.util.Random;
class ThreeCardsMonte{
    public static void main(String args[]){
        Scanner string = new Scanner(System.in);
        Random r = new Random();
        int x;
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
System.out.println("He lays down three cards." );
System.out.println("Which one is the ace?");
System.out.println("##  ##  ##\n" +
"	##  ##  ##\n" +
"	1   2   3\n" +
"");
        x = string.nextInt();
       switch (r.nextInt()){
           case 23:
           System.out.println("Sorry, you are too low.  I was thinking of " + r.nextInt(100));
           break;
       
       default:{
       System.out.println("Sorry, you are too high.  I was thinking of " +r.nextInt(100));
               
       }
           
    }
    }
}
