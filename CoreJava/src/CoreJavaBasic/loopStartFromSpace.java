package CoreJavaBasic;

public class loopStartFromSpace {
	public static void main(String[] args) {
		
		for (int i=0; i<=3;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(" ");	
			} for (int b=3; b>=i; b--) {
				System.out.print("*");
				
			} System.out.println();
			
		}
	}

}
