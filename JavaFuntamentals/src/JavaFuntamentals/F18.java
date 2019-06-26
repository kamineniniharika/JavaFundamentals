package JavaFuntamentals;

public class F18 {
public static void main(String args[]) {
	int a=Integer.parseInt(args[0]);
	int sum=0,rev;
	while(a>0)
	{   rev=a%10;
	    sum=sum+rev;
	    a=a/10;
	}
	System.out.println(+sum);
}
}
