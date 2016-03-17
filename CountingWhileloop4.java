import java.util.Scanner;

public class CountingWhileloop4
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
                int x;
               //String message;
                System.out.println("Enter the number of time message should display");
                x=keyboard.nextInt();
		System.out.println( "Type in a message, and I'll display it times." );
                String message = keyboard.nextLine();
           System.out.print( "Message: " );
		
		int n = 0;
		while ( n < x )
		{
			System.out.println( (n+1) + ". " + message );
			n++;
}

	}
}

