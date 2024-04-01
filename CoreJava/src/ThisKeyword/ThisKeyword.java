package ThisKeyword;

public class ThisKeyword {
	int a,b; // its called instance variable or class variable
	void getvalues(int a, int b)// Method variable or external variable
	{
		this.a= a;
		this.b = b ;
		
	}
	void PrintValues () {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		ThisKeyword ve = new ThisKeyword();
		ve.getvalues(10,15);
		ve.PrintValues();
	}

}
