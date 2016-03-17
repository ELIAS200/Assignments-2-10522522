
import java.util.Scanner;
import java.util.Random;
class OneshotHiLo{
    public static void main(String args[]){
        Scanner string = new Scanner(System.in);
        Random r = new Random();
        int x;
        System.out.println("I am thinking of a number between 1- 100. Try to guess it ");
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
