package week1.assignments;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6556, revNum = 0, rem;
	    
	    // store the number to originalNum
	    int origNum = num;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (num != 0) {
	    	rem = num % 10;
	    	revNum = revNum * 10 + rem;
	      num /= 10;
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (origNum == revNum) {
	      System.out.println(origNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(origNum + " is not Palindrome.");
	    }
	  }
	}
