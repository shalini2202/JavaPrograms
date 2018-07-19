
public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 121;
		int copynum =  num;
		int rem;
		int rev = 0;
		
		while(num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		System.out.println(rev);
		
		if(rev == copynum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
