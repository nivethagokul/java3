public class leap2 {

	public static void main(String[] args) {
		int year;
		year=Integer.parseInt(args[0]);
		if(year%400==0 || year%100 ==0 || year%4==0)
		{
		    System.out.println("is a leap year");
		}
		else
		{
		    System.out.println("is not a leap year");
		   
		}
		

	}

}
