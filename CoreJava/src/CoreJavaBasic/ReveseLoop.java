package CoreJavaBasic;

public class ReveseLoop {
	public static void main(String[] args) {
		/* printing loop in abve order   
    *
   **
  ***
 ****
*****
		 */
		
		for(int i=0; i<=4; i++) {
			for (int b=3; b>=i; b--) {
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
