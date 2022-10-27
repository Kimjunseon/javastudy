package prob03;

public class CurrencyConverter {
	private int dollar;
	private int krw;
	private int rate;
	
	public static void setRate(double d) {
	}
	
	public static double toDollar(int i) {
		double dollar = (i / 1433);
		return dollar;
	}
	public static double toKRW(int i) {
		double krw = i * 1433;
		return krw;
	}
	
	


}
