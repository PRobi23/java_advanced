/* the Figure class must be declared as abstract 
   because it contains an abstract method  */

public abstract class Figure
{
	/* because this is an abstract method the 
	   body will be blank  */
	public abstract float getArea();	
}

public class Circle extends Figure
{
	private float radius;

	public float getArea()
	{
		return (3.14 * (radius * 2)); 	
	}
}

public class Rectangle extends Figure
{
	private float length, width;

	public float getArea(Figure other)
	{
		return length * width;
	}
}