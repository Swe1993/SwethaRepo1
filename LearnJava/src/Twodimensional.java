
public class Twodimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int twoDarr[][];
		twoDarr= new int[4] [5]; //array contains 4 rows 5 columns
		int k=0;
		for(int i=0;i<4;i++)
			
		{
			
			for(int j=0;j<5;j++)
				
			{
				twoDarr[i][j]=k;
				System.out.println(i);
				System.out.println(j);
				System.out.println("value of twoDarr["+i+"] ["+j+"] is:" +twoDarr[i][j]);
				k++;
				
			}
			System.out.println("**************");
		}

	}

}
