package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8;
		int a=0,b=1,c;
		
		for (int i = 0; i < range; i++) {
					
					c=a+b;
					System.out.println(a);
					a=b;
					b=c;
					
			
		}

	}

}
