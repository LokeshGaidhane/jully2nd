package HybridInheratance;

 class test
 {
	 void m1()
	 {
		 System.out.println("This is M1 method from B Class");
	 }
 } 
 interface a{
	 void a1() ;
 }
 interface b{
	 void b1();
 }
public class HybridInheretance extends test implements a,b {
	public void a1() {
		System.out.println("This is a1 Method from class a");
	}
	public void b1() {
		System.out.println("This is b1 Method from class b");
	}
	public static void main(String[] args) {
		HybridInheretance ato = new HybridInheretance() ;
		ato.m1();
		ato.a1();
		ato.b1();
		
	}

}
