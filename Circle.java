
public class Circle extends Shape{
private double radius=1.0;
public static final double PI=Math.PI;
public Circle()
{
	radius=1.0;
}
public Circle(double radius)
{
	this.radius=radius;
}
public Circle(double radius,String color,boolean filled)
{
	super(color,filled);
	this.radius=radius;
}
public double getRadius()
{
	return radius;
}
public void setRadius(double radius)
{
	this.radius=radius;
}
	public double getArea()
	{
		return PI*radius*radius;
}
	public double getPerimeter()
	{
		return 2*PI*radius;
}
	public String toString() {
		return " A circle with radius: " + radius +"Which is a sub class of: " + super.toString();
	}
}
