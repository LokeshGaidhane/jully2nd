package Interface;

interface a{
	int a= 10;
	int m1() ;
}

public class interfacese implements a {
	public int m1() {
		System.out.println("This is interface Method");
	
		return a;
	}
	
public static void main(String[] args) {
	interfacese it = new interfacese();
	it.m1();
}
}
