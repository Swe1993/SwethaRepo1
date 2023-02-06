
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		//Increment();
		//relational();
		logical();
		
	}
	
	public static void Concatenation()
	{
		/*
		 + operator is used in 2 ways 
		 addition of numeric values 
		 concatenation of strings
		 */
		
		System.out.println(10+20);
		System.out.println("10"+20);
		System.out.println("10"+"20");
		System.out.println(10+"20");
		
	}	
	
	public static void Increment()
	{
		//Increment
		
		int a=5;
		//Pre increment
		System.out.println(++a);
		
		int b=7;
		//Post increment
		System.out.println(b++);
		int c=b;
		System.out.println(c);
		
	}	
	
	public static void relational()
	{
		//relational
		
		int a=5;
		int b=7;
		
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		
	}
	
	public static void logical()
	{
		//logical
		
		
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);

		
	}

	

}
