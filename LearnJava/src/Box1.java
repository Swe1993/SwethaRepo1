
public class Box1 {
	
	double width; // instance variable
	double height;
	double depth;
	
	//Constructor - it has same name as class name
	
	Box1(double width,double height,double depth)
	{
		System.out.println("Constructing a box");
		this.width=width; 
		this.height=height;
		this.depth=depth;
		
		//purpose of this is to refer current object
	}
/*
	void setDimension(double w,double h,double d)
	{
		width =w;
		height=h;
		depth=d;
		
		
	}
	*/
	double volume()
	{
		/*
		System.out.println("Volume of Box b1 is:");
		System.out.println(width*height*depth);
	*/
		
		return width*height*depth;
	}
	

}

