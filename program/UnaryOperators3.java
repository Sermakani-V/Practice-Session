class UnaryOperators3
{
   public static void main(String[]ref)
   {
     
	 int x =0;
	 int y=0;
	 int z =0;
	 
	 z= ++x + x++ + --y + ++y + x-- + --y + ++x + x++ + ++y + y++ + --y + x-- + y + x + + y-- + x++ + y-- + x;
	         
			   System.out.println(x);
			   System.out.println(y);
			   System.out.println(z);
	}
	
}