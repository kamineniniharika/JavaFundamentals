package JavaFuntamentals;

public class F19 {
public static void main(String args[]) {
	if(args.length==0)
		System.out.println("enter the value");
	else
	{   int n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++) 
{  
		for(int j=1;j<=i;j++)
     {   System.out.print("*");
				
	 }
		System.out.println();
}
}
}
}
