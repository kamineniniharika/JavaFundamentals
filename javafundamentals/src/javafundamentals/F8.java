package javafundamentals;

public class F8 {
public static void main(String args[]) {
	char a=args[0].charAt(0);
	if((a>='a'&&a<='z')||(a>='A'&&a<='Z')){ 
		System.out.println("Alphabet");
	}
	else if(a>=0&&a<=100)
		System.out.println("Digit");
	else
		System.out.println("Special Char");
}
}
