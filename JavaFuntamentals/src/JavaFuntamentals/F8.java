package JavaFuntamentals;

public class F8 {
public static void main(String args[]) {
	char a=args[0].charAt(0);
	if((a>='A'&&a<='Z')||(a>='a'&&a<='z'))
		System.out.println("Alphabet");
	else 
	{   if(a>='0'&&a<='9')
		   System.out.println("Digit");
	else
		System.out.println("Special Character");
	}
			
}
}
