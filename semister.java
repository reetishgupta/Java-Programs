class  semister
{
	public static void main(String[] args) 
	{
		semister S=new semister();
		S.internal();
	}
	public void internal()
	{
		System.out.println("prepare for internal");
		external();
	}
	public void external()
	{
		System.out.println("first in external");
	}
}


