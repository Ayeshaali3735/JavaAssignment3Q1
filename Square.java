
public class Square extends Rectangle {

	public Square() {
		
	}
	public Square(double side) {
		super();
	}
	public Square(double side,String color,boolean filled)
{
  super();
	
}
	public double getSide() {
		double s;
		s=super.getLength();
		return s;
	}
	public void setSide(double side)
	{
		super.setLength(side);
	}
	public void setWidth(double side)
	{
		side=super.getWidth();
	}
	public void setLength(double side) 
	{
	side=super.getLength();
	}
	public String toString() {
		return "A Square with side: " + getSide() + " Which is a subclass of " + super.toString();
	}
}