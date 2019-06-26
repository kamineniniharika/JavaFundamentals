package JavaFuntamentals;

public class F12 {
	public static void main(String args[]) {
		if(args.length==0)
			System.out.println("please enter the month");
		else {
			int n=Integer.parseInt(args[0]);
			switch(n) {
			case 1:System.out.println("JAN");
			       break;
			case 2:System.out.println("FEB");
			       break;
			case 3:System.out.println("MARCH");
		           break;
			case 4:System.out.println("APRIL");
		           break;
			case 5:System.out.println("MAY");
		            break;
			case 6:System.out.println("JUNE");
		            break;
			case 7:System.out.println("JULY");
		           break;
			case 8:System.out.println("AUGUEST");
		           break;
			case 9:System.out.println("SEPTEMBER");
		           break;
			case 10:System.out.println("OCTOMBER");
		           break;
			case 11:System.out.println("NOVEMBER");
		            break;
			case 12:System.out.println("DECEMBER");
		            break;
			}
		}
}
}