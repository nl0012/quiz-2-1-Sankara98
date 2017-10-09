package shapes;

public abstract class Shape implements Comparable<Shape> {
	

	public final int compareTo(Shape shape) {
		if (shape.calculateArea() > this.calculateArea())
			return 1;
		else if (shape.calculateArea() == this.calculateArea())
			return 0;
		
		else return -1;
	}

	public abstract double calculateArea();

}