
public class Shape {
private String color="red";
private boolean filled=true;

public Shape()
{
	color="green";
	filled=true;
}
public Shape(String color,boolean filled){
	this.color=color;
	this.filled=filled;
}
public String getColor()
{
	return color;
}
public void srtColor(String color) {
	this.color=color;
}
public boolean isFilled()
{
	return true;
}
public void setFilled(boolean filled)
{
	this.filled=filled;
}
public String toString()
{
	return("A shape with color: " + color + " and Filled is? " + filled);
}
}
