package javafundamentals;

public class F10 {
	public static void main(String args[]) {
		 char a='F';
	if(a>=65&&a<=92) {
	a=(char) (a+32);
	}
	 if(a>=97&&a<=122)
	 {
		a=(char) (a-32);
	 }
	System.out.print(a);
	}

}