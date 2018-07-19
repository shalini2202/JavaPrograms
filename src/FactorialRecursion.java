
public class FactorialRecursion {

	static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
		 return (n * factorial(n-1));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		int fact = 1;
		 
	    fact = FactorialRecursion.factorial(n);
	    
	    System.out.println(fact);
		
		
		

	}

}
