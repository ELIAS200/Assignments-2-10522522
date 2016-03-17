import java.util.Scanner;
import java.util.Random;
class FortuneCookies{
    public static void main(String args[]){
    Random r = new Random(54);
int x1, x2, x3, x4, x5, x6;
Scanner string = new Scanner(System.in);
System.out.println("choose six  numbers:");
x1= string.nextInt();
x2=string.nextInt();
x3= string.nextInt();
x4=string.nextInt();
x5= string.nextInt();
x6=string.nextInt();
System.out.println("You will find hapiness with new love ");
System.out.println("the numbers you entered are: ");
System.out.print("The random nubers between 1 and 54 are"+r.nextInt());
System.out.print(""+r.nextInt());
System.out.print("- "+r.nextInt());
System.out.print("-"+r.nextInt());
System.out.print(" "+r.nextInt());
System.out.print("-"+r.nextInt());
x1=r.nextInt();


    }
}
