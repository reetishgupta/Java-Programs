class Sample1 
{
	static double i=2.3;
	static int j=12;
	char p='#';
	int q=55;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(i);
		System.out.println(j);
		Sample1 obj=new Sample1();
		System.out.println(obj.p);
		System.out.println(obj.q);
		System.out.println("main ends");

	}
}
