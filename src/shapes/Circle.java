package shapes;

public class Circle extends Shape {
	private double radius;
	
	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Circles cannot have a negative radius.
	 */
	public Circle(double radius) throws IllegalArgumentException {
		// TODO Implement me
	}
	
	/*
	 *  Implement any remaining methods demanded by the superclass.
	 */
	
	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
}
