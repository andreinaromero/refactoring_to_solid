package co.com.ceiba.solid.without.openclosed.util;

public class Circle {
	private int radius;
	
	public int getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}


	public double calculateArea() {
		return getRadius() * getRadius() * Math.PI;
	}

}
