package fr.epita.geometry.launcher;

import java.util.Arrays;
import java.util.List;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Shape;
import fr.epita.geometry.datamodel.Square;
import fr.epita.geometry.datamodel.Triangle;

public class Launcher {

	public static void main(String[] args) {
 
		Shape t1 = new Triangle(1, 2, 3, 4);
		Shape t2 = new Triangle(2, 3, 4, 5);
		
		Shape s1 = new Square(5);
		Shape s2 = new Square(10);
		
		Shape c1 = new Circle(3);
		Shape c2 = new Circle(6);
		
		List<Shape> shapes = Arrays.asList(t1, t2, s1, s2, c1, c2);
		
		double globalArea = 0;
		double globalPerimeter = 0;
		
		for (Shape shape : shapes) {
			globalArea += shape.calculateArea();
			globalPerimeter += shape.calculatePerimeter();
		}
		
		System.out.println(globalArea);
		System.out.println(globalPerimeter);
				
	}

}
