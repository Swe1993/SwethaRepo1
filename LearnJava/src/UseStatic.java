
public class UseStatic {

	static int a=2;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(5);
	}
		
		static void method1(int x)
		{
			System.out.println("Value of x "+x);
			System.out.println("Value of a "+a);
			System.out.println("Value of b "+b);
			
		}
		//Static keyword is used for memory management
		//static members of class belongs to class itself instead of class objects
		//constructor cannot be static
		//static method can be invoked without creating an object
		//static method can access static data members(static variables) and change its value

		static {
			b=a*2;
		}
	}


