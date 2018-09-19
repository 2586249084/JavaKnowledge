package initialization.exercise;

public class EnumEx21 {
	public enum Bills{
		FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
	
	public static void main(String[] args) {
		for(Bills bills : Bills.values()) {
			System.out.println("ordinal--" + bills.ordinal() + " = " + bills);
			describe(bills);
		}
	}
	
	static void describe(Bills bills) {
		switch (bills) {
		case FIVE:
			System.out.println("This is five RMB");
			break;
		case TEN:
			System.out.println("This is ten RMB");
			break;
		case TWENTY:
			System.out.println("This is tewnty RMB");
			break;
		case FIFTY:
			System.out.println("This is fifty RMB");
			break;
		case HUNDRED:
			System.out.println("This is one hundred RMB");
			break;
		default:
			break;
		}
	}
}
