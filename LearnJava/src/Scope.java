
public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x; //it is known to code within main method
		x=10;
		if (x==10)
		{
			int y =20; // it is known only to this block
			
			
			System.out.println("value of y : " +y);
		}
		System.out.println("value of x : " +x);
		
		
//scope of the variable is inside the block where it is declared
	}

}
