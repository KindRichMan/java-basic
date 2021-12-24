package stringbuilder1;

public class Test {
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		int b= 0;
		while(b < a.length()) {
			
			a.deleteCharAt(b);
			System.out.println(a);
			b+=3;
		}
	}

}
