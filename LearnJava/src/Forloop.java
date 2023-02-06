
public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		boolean isPrime=false;
		num =7;
		if (num <2)
		
		for (int i=2; i<num/2; i++) 
		{
			if((num % i==0))
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime=false)
		{
			System.out.println("Number is Prime");
		}
		else
			System.out.println("Number is not Prime");
	}

}
