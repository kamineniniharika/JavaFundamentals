package JavaFuntamentals;

public class F21 {
public static void main(String args[]) {
	int rev,sum=0,temp;
	int n=Integer.parseInt(args[0]);
	temp=n;
	while(n>0)
	{
		rev=n%10;
		sum=(sum*10)+rev;
		n=n/10;
	}
	if(temp==n)
		System.out.println("Pallindrome");
	else
		System.out.println("Not pallindrome");
}
}
