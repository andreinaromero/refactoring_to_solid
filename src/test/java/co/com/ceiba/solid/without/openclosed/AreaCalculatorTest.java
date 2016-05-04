package co.com.ceiba.solid.without.openclosed;

import org.junit.Test;

import co.com.ceiba.solid.without.openclosed.AreaCalculator;
import co.com.ceiba.solid.without.openclosed.util.Circle;
import co.com.ceiba.solid.without.openclosed.util.Rectangle;

import static org.junit.Assert.*;

public class AreaCalculatorTest {
	@Test
	public void shouldCalculateRectanguleAndCircleAreas() {
		//Arrange
		Object[] shapes = new Object[2];
		shapes[0] = new Rectangle(10, 5); //50
		shapes[1] = new Circle(3); //28.274333882308138
		//Act
		AreaCalculator areaCalculator = new AreaCalculator();
		double result = areaCalculator.area(shapes);
		//Assert
		assertEquals("El total de las áreas debe ser 78.27: ", 78.27, result, 1);
	}
}
