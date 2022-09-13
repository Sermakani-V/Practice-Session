/* STRING 

With all methods().

*/

class String_1
{
	public static void main(String[]args)
	{
		String s1 = "Java is a programming language";
		String s2= new String("Java");
		String s3 = "My name is ";
		s3 = s3.concat(" serma");        //concatenate
		String s4 = s1+ " angular";
		String str = "Hello java";
		
		System.out.println(s1);            //normal way of print stmt s1
		System.out.println(s2); 		  //another way of print stmt s2
        System.out.println(s2); 		   //normal way s2
		System.out.println("Length of the string: "+ s1.length());   //to find length
		System.out.println(s2.length());
		System.out.println("Concatenate: "+ s3);          
		System.out.println(s4);
		System.out.println("Length of the String " +str.length());
		System.out.println();
		
		
		//charAt()
		
		int i = str.length();
		
		System.out.println("charAt() - Printing all the Characters: ");
		
		for(int j=0;j<i;j++)               //method to print all the characters, should use for loop
		{
			System.out.println(str.charAt(j));
		
		}
		
		System.out.println();
		
		System.out.println("Finding the specific Character using Index: " +str.charAt(3));  //Simply if we give index at charAt() it will print the value
		System.out.println();

		
		//intern()
		
		String sb = str.intern();
		System.out.println("Intern Method: " + (s3 == sb));
		System.out.println();
		
		//indexOf
		
		System.out.println("indexOf - Finding the specific Index using Character: "+ str.indexOf('0'));
		
		System.out.println("Printing the 'a' index after 6th index: " + str.indexOf("a",6));  //will print - Range starts after the 6th index
		System.out.println();

        
		//lastIndexOf() - Starts finding the index value From Last
		
		System.out.println("lastIndexOf: "+ str.lastIndexOf("a"));
		
		System.out.println();

 
        //Split method:
		
        String Wr = " String is immutable and String buffer also used";
		String arr[] = Wr.split("i");
		
		System.out.println("Length of Wr: " + arr.length);

		System.out.println("Finding 1st index char: " + arr[1]);
	    System.out.println();

		System.out.println("Using split method: ");
		System.out.println();

		
		for(String temp:arr)
		{
			System.out.println(temp);
		}
				
	    System.out.println();

		
		//Substring 
	
        System.out.println("Substring using index value: "+ Wr.substring(7)); 
	    System.out.println();

		String strdata = Wr.substring(Wr.indexOf("b",11));
	    System.out.println("Substring using indexOf: "+ strdata);
		
		
		//compare to
		
		System.out.println("CompareTo: "+ s2.compareTo(str));
		System.out.println();
		
		//Case sensitive and equalsIgnore
		
		System.out.println("LowerCase: "+ s2.toUpperCase());
		System.out.println("UpperCase: " + s3.toLowerCase());
		System.out.println("EqualsIgnore: "+ s4.equalsIgnoreCase(str));
		System.out.println();

		
		//valueOf (used to convert and compare other type into string and return boolean)
		
		int b1 = 10;
		
		String s5 = String.valueOf(b1);
		System.out.println();

		
		//Replace
		
		String s6 = "Java is a object oriented programming language";
		String s7 = "I am a Java Developer";
		s6 = s6.replace('o', 'g');
		s7 = s7.replace("Java", "a");
		
		System.out.println("Using Replace character: "+ s6);
		System.out.println("Using Replace string: "+ s7);
		System.out.println();
		
		//trim() - it will remove the white spaces but not in between the strings
		
		String str1 = "     I am Sermakani   ";
		
		System.out.println("Length before trim: "+ str1.length());
		
		str1 = str1.trim();
		
        System.out.println("Length after trim: "+ str1.length());

		}
}
