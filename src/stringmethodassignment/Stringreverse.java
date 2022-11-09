package stringmethodassignment;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="apple";
		
		String rev="";
		
		for (int i=0; i<s.length();i++) {
			
			rev=s.charAt(i)+rev;
			
		}
		System.out.println(rev);
	}

}
