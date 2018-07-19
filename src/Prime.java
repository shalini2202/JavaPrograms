import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1,2,3,5,7,11,13,17
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number:");
		int prime = in.nextInt();
		int flag = 0;
		
		for(int i =2; i<prime/2; i++) {
			if(prime % i == 0) {
				System.out.println("not prime");
				flag = 1;
				break;
			}
		}
		
		if(flag==1) {
			System.out.println("Not a prime no.");
		}
		else {
			System.out.println("Prime no.");
		}
		

	}

}
