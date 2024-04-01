package Overloading;

import java.awt.geom.Arc2D.Double; 

public class ConstructorOverloading {
	 ConstructorOverloading(int a, int b) {
		System.out.println(a+b);
	}
	ConstructorOverloading(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	ConstructorOverloading(double a, int b) {
		System.out.println(a +b);
	}
 public static void main(String[] args) {
	 new ConstructorOverloading(1010,20);
	 new ConstructorOverloading(12.25d, 450);
}
}
