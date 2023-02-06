
public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month=Integer.parseInt(args[0]);
		if (month==12 || month>=1 && month <=2) 
		{
			System.out.println("Winter Season");
		}
		else if (month>2 && month<=5)
		{
			System.out.println("Summer Season");
		}
		else if (month>5 && month<=8)
		{
			System.out.println("Spring Season");
		}
		else if (month>8 && month<=11)
		{
			System.out.println("Autumn Season");
		}
		
		else
		{
			System.out.println("Invalid");
		}

	}

}
