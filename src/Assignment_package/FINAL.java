package Assignment_package;

public class FINAL {
	public static void main(String[]args)
	{
		Circle circle=new Circle(4);
		System.out.println("Area of circle "+circle.CalculatedArea());
		
		Rectangle rectangle=new Rectangle(15,9);
		System.out.println("Area of rectangle "+rectangle.calculatedArea());
		
		
		Triangle triangle=new Triangle(10,13);
		System.out.println("Area of triangle "+triangle.CalculatedArea());
	}

}
