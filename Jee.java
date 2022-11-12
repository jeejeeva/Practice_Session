

public class Jee {

	public static void main(String[] args) {

		Jee ls = new Jee();
		
		//ls.reverse(12345); // this hava count and sum of digit code;
		
		//ls.palindrom(939); // palindrome mean same number value, reverse order also same value 
		
		//int value=ls.neon(9); 	same number multiple to same number and divided to 10 and one value to reverse value
		//System.out.println(value); -add to total value and previous value to same that is 'neon' number.
		
		//ls.armsStrong_number(153); // ArmsStrong number mean same number modulo for every single number. every single number divided for
	//  same single numer in 3 times (ex; 3= 3*3*3) and add for all value same for previous number that is armsStrong number
		//ls.sum_of_single_digit(60);	// this is last  "single digit value" print 		
		
		//ls.swapping_two(12, 25); // add thrid variable initialized.
		
		//ls.swapping_without_third_variable(23,54); //swapping without third variable.
		
		//ls.lcm(3,25); // lest common multiple.
		
		//ls.power(100); doubt
		
		//ls.decimalToBinary(6); // Decimal to binary mean divided from which number to divided the variable that number to try with divide
		//ls.print();
		
		ls.recursion(1);
		
		
	}

	private int recursion(int no) {
		 if (no<=5) {
			 System.out.println(no);
		        return no +recursion(no + 1);
		    } else {
		      return 0;
		    }
		
	}

	private void print() {
		int no =1;
		while(no<=121)
		{
			System.out.println(no);
			no = no*11;
		}
	}

	private void decimalToBinary(int no) {
		String binary ="";
		while(no>0)
		{
			int div = no%2;
			binary = binary+div;
			no= no/2;
		}
		System.out.println("Decimal to Binary = "+binary);
		 
	}

	private void power(int no) {
	    while(1<no)
	    {
	    
	      if(no%2==0 && no%5==0)
	      {
	          System.out.println("power of no = "+no);
	      break;
	      }
	      no = no+1;    
	     } 
		
	}

	private void lcm(int no1, int no2) {
		 int big = no1>no2 ? no1:no2;
		 int count =0;
		 
		 while(true) 
		 {
		 if(big%no1==0 && big%no2==0)
		 {
			 System.out.println("This is least common multiple No = "+big);
			 
			 break;
		 }
		 count = count+1;
		 big = big +1;
		 
		 }
		 System.out.println("Total time of running loop = "+count);
		 
		
	}

	private void swapping_without_third_variable(int no1, int no2) {
		no1 = no1+no2;  // no1 =77;
		no2 = no1-no2; // no2 = 23;
		no1 = no1-no2; // no1 = 54;
		System.out.println("No 1 is (23) But print is ="+no1);
		System.out.println("No 2 is (54) But print is = "+no2);
		
	}

	private void swapping_two(int no1, int no2) {
		//Swapping two: 
		 int tem=0;
		 tem = no1; //tem = no1 value added
		 no1 = no2; // no1 = no2 value added 
		 no2 = tem; // no2 = tem value (no1) added
		 System.out.println("No 1 value is (12) But print = "+no1);
		 System.out.println("No 2 value is (25) But print = "+no2);
		
	}

	private void sum_of_single_digit(int no) {
		int sum=0;
		while(no>0)
		{
			int div = no%10;
			sum = sum + div;
			no= no/10;
		}
		if(sum>=9)
		{
			sum_of_single_digit(sum);
		}
		else {
			System.out.println("sum of single digit = "+sum);
		}
	}

	private int armsStrong_number(int no) {
		int sum =0, total =0, armsStrong =no;
		while(no>0)
		{
			int div = no%10;
			sum = (div * div)*div;;
			total += sum ;
			no /=10;
		}
		if(armsStrong == total)
		{
			System.out.println("This is ArmsStrong number");
		}
		else {
			System.out.println("This is not ArmsStrong number");
		}
		return no;
	}

	private int neon(int no) {
		int sum=no*no, total =0;;
		while(sum>0)
		{
			int div = sum%10;
			//System.out.println(div);
			total = total+div;
			sum= sum/10;
		}
		//System.out.println("Strong = "+no);
		
		if(no == total)
		{
			System.out.println("This is strong number");
		}
		else {
			System.out.println("This not Strong number");
		}
		return no;
	}

	private void palindrom(int no) {
		int sum=0, pal = no;
		while(no>=1)
		{
			int div = no%10;
			sum = (sum*10)+div;
			
			no=no/10;
		}
		System.out.println(sum);
		if(sum==pal)
		{
			System.out.println("This is palindrme");
		}
		else {
			System.out.println("This number not palindrome");
		}
	}

	private void reverse(int no) 
	{
		int rev =0, count=0, sum=0;
		
		System.out.println("Stright order = "+no);
		while(no>0)
		{
			int div = no%10;
			sum = sum+div;
			rev=(rev*10)+div;
		count = count+1;	
			no = no/10;
		}
		System.out.println("Reverse = "+rev);
		System.out.println("Total count = "+count);
		System.out.println("Sum of digit = "+sum);
	}

	
	
	
}

