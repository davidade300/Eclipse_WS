package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instanciar a lista usando o tipo generico é o ideal, pois assim a lista aceita
		// dados de todos os tipos das subclasses.
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			switch (ch) {
			case 'r':
				System.out.print("width: ");
				double width = sc.nextDouble();
				System.out.print("height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			break;
			case 'c':	
				System.out.print("radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			break;
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
			
		}
		sc.close();
	}

}
