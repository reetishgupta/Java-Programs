class  Reetish
{
	public static void main(String[] args) 
	{
		int res1=sub(12,27);
		Reetish obj=new Reetish();
		double res2=obj.mul(1.5,2.7);
		int res3=div(10,3);
		double finalres=res1+res2+res3;
		System.out.println(finalres);
	}
		public static int sub(int a,int b)
		{
			int c=a-b;
			return c;
		}
		public double mul(double x,double y)
		{
			double z=x*y;
			return z;
		}
		public static int div(int i,int j)
		{
			int k=i%j;
			return k;
		}
}
	     

