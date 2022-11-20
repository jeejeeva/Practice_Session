public class Alphabets {

	public static void main(String[] args) {
		Alphabets al= new Alphabets();
		al.printM();
		System.out.println();
		al.printJ();
		System.out.println();
		al.printE();
		System.out.println();
		al.printEE();
		System.out.println();
		System.out.println();
		al.printV();
		System.out.println();
		al.printA();
		
		
		
	}


	private void printM() {
		for(int row =1;row<=9;row++)
		{
			System.out.print(" ");
			System.out.print("  ");
			for(int col=1;col<=9;col++)
			{
				
				if(col==1) 
					System.out.print("* ");
				
				else if(row==col && col<=5) 
					System.out.print("* ");
				
				else if(row + col==10 && row<=col)
					System.out.print("* ");
				else if(col==9)
					System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	private void printJ() {
		for(int row =1;row<=9;row++)
		{
			System.out.print("  ");
			for(int col=1;col<=9;col++)
			{
				if(row==1)
				
					System.out.print("* ");
				else if(col==5)
					System.out.print("* ");
				else if(col==1 && row>5)
					System.out.print("* ");
				else if(row ==9 && col<5)
					System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	private void printE(){						// ||
		
		
		for(int row =1;row<=7;row++) {
			
			System.out.print("* ");}
		System.out.println();
		
		for(int col=1;col<=8;col++) {
			
			if(col==4)
			{
				for(int str=1;str<=4;str++) {
					System.out.print("* ");
				}
			}
			else	
			System.out.println("* ");
		}
		for(int row=1;row<=7;row++)
		{
			
			System.out.print("* ");
		}
System.out.println();


		
		
	}
	private void printEE(){	
					// ||
		
		
		for(int row =1;row<=7;row++) {
			
			System.out.print("* ");}
		System.out.println();
		
		for(int col=1;col<=8;col++) {
			
			if(col==4)
			{
				for(int str=1;str<=4;str++) {
					System.out.print("* ");
				}
			}
			else	
			System.out.println("* ");
		}
		for(int row=1;row<=7;row++)
		{
			
			System.out.print("* ");
		}
		
	}
	
	private void printV() {
		
		for(int row=1;row<=6;row++)
		{System.out.print(" ");
			for(int col=1;col<=11;col++)
			{
				if(row==col) 
					System.out.print("* ");
				else if(row+col==12)
					System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	
	private void printA() {
		
		for(int row=1;row<=6;row++)
		{
			for(int col=1;col<=12;col++)
			{
				if(row+col==7)
					System.out.print("* ");	
				else if(col-row==6)
					System.out.print("* ");
				else if(row==3 && col>=5 && col<=8 )
				
					System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	


}

