class Sample 
{
	static int i=50;
	int j=22;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(i);
		Sample obj=new Sample();
		System.out.println(obj.j);
		System.out.println("main ends");
	}
}
