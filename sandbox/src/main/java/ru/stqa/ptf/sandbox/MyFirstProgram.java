package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

	public static void main(String[] args){
		hello("world");
		hello("user");
		Square s = new Square(5);
		Rectangle r = new Rectangle(2, 4);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
		Point point1 = new Point(5, 7);
		Point point2 = new Point(10, -7);
		System.out.println(point1.distance(point1, point2));
	}

	public static void hello(String somebody){
		System.out.println ("Hello, " + somebody + "!");
	}

}