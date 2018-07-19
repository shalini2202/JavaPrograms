
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int anum = 0;
		int rem;
		int copynum = num;
		
		
		while(num != 0) {
			rem = num  % 10;
			anum = anum + (rem*rem*rem);
			num = num/10;
		}

		System.out.println(anum);
		
		if(copynum == anum) {
			System.out.println("arms no.");
		}
		else {
			System.out.println("not arms");
		}
	}

}
