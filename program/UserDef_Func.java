class UserDef_Func
{
     public static void Method4()
	 {
	    Method3();
		System.out.println("From Method 4 = ");
	 }
	 
	 public static void main(String[]args)
	 {
	    System.out.println("From Main");
		Address();
		Address(100);
		System.out.println("From End");
	 }
	 public static void Address()
	 {
		 System.out.println("From Method 1 ");
		 Address(200);
	 }
	 
	 public static void Address(int i)
	 {
	    System.out.println("From Args Method  "+i);
		Method4();
	 }
	 
	public static void Method3()
	{
	    System.out.println("From Method 3  ");
	}
}