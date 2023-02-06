
public class BoxDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double volume;
		Box1 b1= new Box1(10,5,3); //constructor for a class is called when object is created
		
		//b1.setDimension(10,20,15);
		volume=b1.volume();
		System.out.println("Volume is:" +volume);
		
		Box1 b2= new Box1(12,4,6);
		//b2.setDimension(5,5,5);
		volume=b2.volume();
		System.out.println("Volume is:" +volume);
		

	}

}
