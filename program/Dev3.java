import java.util.*;

class Dev3
{
	public static void main(String[]args)
	{
	   Scanner sc= new Scanner(System.in);
	  
		System.out.print("Enter the Day: ");
		String Days= "Tuesday";
		
		switch(Days)
		{
		case "Monday":
		  System.out.println("1st day");
		 break;
		 
		 case "Tuesday":
		  System.out.println("2nd day");
		 break;
		
		 case "Wednesday":
		  System.out.println("3rd day");
		 break;
		 
		 case "Thursday":
		  System.out.println("4th day");
		 break;
		 
		 case "Friday":
		  System.out.println("5th day");
		 break;
		 
		 case "Saturday":
		  System.out.println("6th day");
		 break;
		 
		 case "Sunday":
		  System.out.println("7th day");
		 break;
		 
	     default: 
		  System.out.println("Invalid Day");
         break;
		 
		 }
	}
	
}