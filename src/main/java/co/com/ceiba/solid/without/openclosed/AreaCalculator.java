package co.com.ceiba.solid.without.openclosed;

public class AreaCalculator {
	public double area(Object[] shapes)
	{
	    double area = 0;
	    for (Object shape:shapes)
	    {
	        if (shape instanceof Rectangle)
	        {
	            Rectangle rectangle = (Rectangle) shape;
	            area += rectangle.getWidth()*rectangle.getHeight();
	        }
	        else
	        {
	            Circle circle = (Circle)shape;
	            area += circle.getRadius() * circle.getRadius() * Math.PI;
	        }
	    }

	    return area;
	}
}
