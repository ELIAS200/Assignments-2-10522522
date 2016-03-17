import java.util.Scanner;

public class CountingWhileloop3
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "4.Type in a message, and I'll display it ten times." );
		System.out.print( "5.Message: " );
		String message = keyboard.nextLine();
                int v =10;
		int n = 5;
		while ( n < 15 )
		{
                    System.out.print((n+1));
                        n++;
                    System.out.print("."+ v + ". ");
                    v+=10;
                    System.out.println(message);
			
		}

	}
}
