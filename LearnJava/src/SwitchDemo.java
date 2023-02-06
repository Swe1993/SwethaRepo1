
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=Integer.parseInt(args[0]);
		String season="";
		switch(month)
		{
		case 1:
		case 2:
			season="Winter";
		break;
	
		case 3:
		case 4:
		case 5:
			season="Summer";
		break;

		case 6:
		case 7:
		case 8:
			season="Spring";
		break;
			
		case 9:
		case 10:
		case 11:
			season="Autumn";
		break;

		default:
			System.out.println("Invalid month");
			
		}
		System.out.println("Season is " +season);

	}

}
