import java.util.Scanner;
import java.util.Random;
class DICE5{
    public static void main(String args[]){
        Scanner string=new Scanner(System.in);
        Random r = new Random();
        int x,y, answer;
        System.out.println("HERE COMES THE DICE!");
        x=r.nextInt(6);
        System.out.println("Roll #1: " +x);
         //x=r.nextInt(6);
          y=r.nextInt(6);
        System.out.println("Roll #2: " +y);
        int v=y+x;
        
         System.out.println("The total is "+v );
           System.out.println("HERE COMES THE DICE!");
        x=r.nextInt(6);
        System.out.println("Roll #1: " +x);
          y=r.nextInt(6);
        System.out.println("Roll #2: " +y); 
        
        int z=y+x;
         System.out.println("The total is "+z );
        
        
           
       }
        
    }