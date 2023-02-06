
public class InheritanceC extends InheritanceA{

	int i;
	InheritanceC(int a,int b)
	{
		super.i=a;
		i=b;
	}
	void show()
	{
		System.out.println("Value of i in parent : " +super.i);
		System.out.println("Value of i in child : " +i);
	}
}
