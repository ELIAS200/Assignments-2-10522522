
import java.util.Scanner;
import java.util.Random;
class OneshotHiLo{
    public static void main(String args[]){
        Scanner string = new Scanner(System.in);
        Random r = new Random();
         int x =r.nextInt(100);
        System.out.println("I am thinking of a number between 1- 100. Try to guess it ");
        int N= string.nextInt();
        System.out.println("your guess is "+N);
  while(N>x){
       System.out.println("Sorry, you are too high.  I was thinking of " +r.nextInt(100));
               
       }
           
    
    }
}
