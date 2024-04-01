package Overloading;

public class MethodOverloading {
	void M1(int a, int b) {
		System.out.println(a+b);
	}
	void M1(int a, int b, int c) {
		System.out.println(a+b+ c);
	}
	void M1(float a, int b) {
		System.out.println(a+b);
	}
	void M1(int a, float  b) {
		System.out.println(a+b);
	}
	void M1(double a, int b) {
		System.out.println(a+b);
	}
        
	public static void main(String[] args) {
		MethodOverloading le = new MethodOverloading();
		le.M1(10,10);
		le.M1(50, 10, 40);

	}

}
