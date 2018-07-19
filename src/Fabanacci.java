
public class Fabanacci {
	static int a=0,b=1,c=0;
	
	static void fabonicci(int num)
	{
		if(num>0)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			fabonicci(num-1);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		Fabanacci.fabonicci(num-2);
		/*int a = 0;
		int b = 1;
		int c;
		
		for(int i = 0; i<=10 ; i++) {
			c = a + b;
			a = b;
			b = c;
			
			System.out.println(c);
			}*/
		
		

	}

}
