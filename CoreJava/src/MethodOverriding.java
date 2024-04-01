
class Bank{
	double RateofIntrest() {
		return 0;
	}
}
 class SBI extends Bank{
	 double RateofIntrest()
	 {
			return 10.5;
		}}
 class ICICI extends Bank{
	 double RateofIntrest()
	 {
			return 8.5;
		}
 }
 class HDFC extends Bank{
	 double RateofIntrest()
	 {
			return 11.5;
		}
 }
public class MethodOverriding {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println(sbi.RateofIntrest() );
		ICICI icici = new ICICI();
		System.out.println(icici.RateofIntrest());
		HDFC hdfc = new HDFC();
		System.out.println(hdfc.RateofIntrest());
	}

}
