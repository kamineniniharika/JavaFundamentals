package JavaFuntamentals;

public class F11 {
public static void main(String args[]) {
	char colour=args[0].charAt(0);
	switch (colour) {
	case 'R': System.out.println("RED");
	        break;
	case 'O':System.out.println("ORANGE");
	        break;
	case 'G':System.out.println("GREEN");
	        break;
	case 'W':System.out.println("WHITE");
	        break;
	case 'Y':System.out.println("YELLOW");
	         break;
	default: System.out.println("INVALID CODE");
	         break;
	         
	}
}
}
