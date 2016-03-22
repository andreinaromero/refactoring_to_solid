package co.com.ceiba.solid.without.openclosed.test;

import org.junit.Test;

import co.com.ceiba.solid.without.openclosed.AreaCalculator;
import co.com.ceiba.solid.without.openclosed.util.Circle;
import co.com.ceiba.solid.without.openclosed.util.Rectangle;
import co.com.ceiba.solid.without.openclosed.util.Shape;

import static org.junit.Assert.*;

public class AreaCalculatorTest {
	@Test
	public void shouldCalculateRectanguleAndCircleAreas() {
		//Arrange
		Object[] shapes = new Shape[2];
		shapes[0] = new Rectangle(10, 5); //50
		shapes[1] = new Circle(3); //28.7
		//Act
		AreaCalculator areaCalculator = new AreaCalculator();
		double result = areaCalculator.area(shapes);
		//Assert
		assertEquals("El total de las áreas debe ser 50: ", result, 50, 0);
	}
}
