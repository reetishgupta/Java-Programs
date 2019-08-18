class  pattern11
{
	public static void main(String[] args) 
	{
		int lspace=5;
		int lstar=0;
		int rstar=0;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
				lspace--;
				lstar++;
				rstar++;
			}
			else
			{
				lspace++;
				lstar--;
				rstar--;
			}
			for(int j=1;j<=lspace;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=lstar;k++)
			{
				System.out.print("*");
			}
			if((i<=3)||(i>=7))
			{
				for(int l=1;l<=8;l++)
				{
					System.out.print(" ");
				}
			}
			else
			{
				for(int m=1;m<=8;m++)
				{
					System.out.print("*");
				}
			}
			for(int n=1;n<=rstar;n++)
			{
				System.out.print("*");
			}
			System.out.println();
	}
}
}
