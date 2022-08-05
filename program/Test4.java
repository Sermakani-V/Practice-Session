//Finding directions using switch case

import java.util.*;

class Test4
{
    public static void main(String[]args)
    {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Type your directions");
        char ch=sc.next().charAt(0);
		
        switch(ch)
        {
            case'N':
			System.out.println("North");
			break;
			
            case'E':
			System.out.println("East");
            break;
			case'S':
			System.out.println("South");
            break;
			case'W':
			System.out.println("West");
       	    break;
			
			default:
			System.out.println("Unknown Direction");
      		break;
            
		}
             
	
	}		

}