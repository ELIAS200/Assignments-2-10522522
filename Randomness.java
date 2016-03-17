import java.util.Random;
 class Randomness{
   public static void main(String args[]){
        Random r = new Random(12353);
        int x=1+r.nextInt();
       System.out.println("My random number is " + x);
        System.out.println("Here are some numbers from 1 to 5!");
      //1+r.nextInt(10);
        System.out.println( 1+r.nextInt(5) + " ");
            System.out.println( 1+r.nextInt(5) + " ");
            System.out.println(1+r.nextInt(5) + " ");
            System.out.println(1+ r.nextInt(5) + " ");
             System.out.println( 1+r.nextInt(5) + " ");
            System.out.println( 1+r.nextInt(5) + " ");
             System.out.println("Here are some numbers from 1 to 100!");
            System.out.println(1 + r.nextInt(100) +"\t");
            System.out.println(1 + r.nextInt(100) +"\t");
             System.out.println(1 + r.nextInt(100) +"\t");
            System.out.println(1 + r.nextInt(100) + "\t");
             System.out.println(1 + r.nextInt(100) + "\t");
            System.out.println(1 + r.nextInt(100) + "\t");
            int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);
                if (num1>num2){
                    System.out.println("Hey there thank God it is Wednesday");
                }

		if ( num1 == num2 )
		{
			System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
			System.out.println( "The random numbers were different! Not too surprising, actually." );
		}
	}
}

            

    
