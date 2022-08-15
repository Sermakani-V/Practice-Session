class Diff_Returntype
{
	public static void main(String[]args)
	{
		
		method1(10,20);
		int value1 = method2(20,20);
		System.out.println(value1);
		boolean returnvalue = method3();
		System.out.println(returnvalue);
	}
	
	public static void method1(int i,int j)
	{
		System.out.println("From method1: "+i+", "+j);
	}
	
	public static int method2(int i,int j)
	{
		int k = i+j;
		return k;
	}
	
	public static boolean method3()
	{
		return true;
	}
}
