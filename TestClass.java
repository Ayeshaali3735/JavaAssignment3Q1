
public class TestClass {
public static void main(String args[])
{
	/*Shape S1=new Shape();
	Shape S2=new Shape("blue",false);
	Shape S3=new Shape("pink",true);
	System.out.println("Shape is filled or not:"+S2.isFilled());
	System.out.println("Shape is filled or not:"+S2.isFilled());
	System.out.println("Shape color is is:"+S2.getColor());*/
	Rectangle R1=new Rectangle();
	Rectangle R2=new Rectangle(4.0,7.0);
	System.out.println("Area of Rectangle is:"+ R1.getArea());
	System.out.println("Perimeter of Rectangle is:"+ R2.getPerimeter());
    Circle C1=new Circle();
    Circle C2=new Circle(7.9);
    Circle C3=new Circle(5.0,"red",true);
    System.out.println("Area of Circle is:"+ C2.getArea());
	System.out.println("Perimeter of Circle is:"+ C3.getPerimeter());
	System.out.println("Circle data is:"+C1);
	 Square Sq1=new Square();
	 Square Sq2=new Square(5.0,"blue",false);
	 System.out.println("Square data is:"+Sq1);
}
}
