package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

	public static void main(String[] args){
		hello("world");
		hello("user");
		double l = 5;
		double a = 2;
		double b = 4;
		System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
	}

	public static void hello(String somebody){
		System.out.println ("Hello, " + somebody + "!");
	}
	public static double area (double len){
		return len*len;
	}
	public static double area (double a, double b){
		return a*b;
	}

}