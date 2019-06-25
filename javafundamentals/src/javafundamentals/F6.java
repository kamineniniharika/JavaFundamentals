package javafundamentals;

public class F6 {
	public static void main(String args[]) {
		if(args.length==0)
			System.out.println("novalues");
		else
			for(String i:args)
				System.out.println(i+",");
	}

}
