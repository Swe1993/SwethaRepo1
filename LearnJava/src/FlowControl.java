
public class FlowControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		if (boolean condition)
		{
		//Statement inside if will get executed
		}
		// if condition is false then will skip to next statement
		*/

		//Largest among 3 numbers 10,20,5
		int a = 10;
		int b = 20;
		int c = 5;

		if (a>=b && a>= c)
		{
		System.out.println("Largest of 3 numbers is : " +a);
		}

		if (b>=a && b>= c)
		{
		System.out.println("Largest of 3 numbers is : " +b);
		}

		if (c>=a && c>= b)
		{
		System.out.println("Largest of 3 numbers is : " +b);
		}

	}

}
