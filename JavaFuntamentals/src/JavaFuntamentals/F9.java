package JavaFuntamentals;

public class F9 {
public static void main(String args[]) {
	String g=args[0];
	int age=Integer.parseInt(args[1]);
	if(g.equals("Female"))
	{    if(age>=1&&age<=58)
		    System.out.println("Percentage is 8.2%");
	     if(age>=59&&age<=100)
		    System.out.println("Percentage is 9.2%");
	}
	else if(g.equals("Male"))
	{
		 if(age>1&&age<58)
			System.out.println("Percentage is 8.4%");
		 if(age>59&&age<100)
			System.out.println("Percentage is 10.5%");
	}
}
}
