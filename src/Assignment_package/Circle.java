package Assignment_package;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	
	public double CalculatedArea()
	{
		return Math.PI*radius*radius;
	}

}



