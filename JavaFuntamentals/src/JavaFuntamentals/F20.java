package JavaFuntamentals;

public class F20 {
public static void main(String args[]) {
	int n=Integer.parseInt(args[0]);
	int sum=0,rev;
	while(n>0)
	{   rev=n%10;
	    sum=(sum*10)+rev;
	    n=n/10;
	}
	System.out.println(+sum);
}
}
