public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String name = "Agam";
		int length = name.length();
		
		char[] ch =  new char[length];
		char[] ch1 =  new char[length];

		
		for(int i=0; i<length; i++) {
			ch[i] = name.charAt(i);	
		}
		

		for(int j=0; j<length; j++) {
			ch1[j] = ch[3-j];	
			System.out.println(j + " " + ch1[j]);
		}*/
		
		String s = "Madam";
		String rs = "";
		
		int length = s.length();
		
		for(int i = length-1 ; i>=0 ; --i) {
			rs = rs + s.charAt(i);
		}
		
		System.out.println(rs);
	
		if(rs.equalsIgnoreCase(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
