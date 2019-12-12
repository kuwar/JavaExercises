package fr.epita.geometry.datamodel;

public class Square implements Shape {

	private double length;

	public Square(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}
	
	public double calculatePerimeter() {
		return 4 * this.length;
	}
	
	public double calculateArea() {
		return this.length * this.length;
	}
}
