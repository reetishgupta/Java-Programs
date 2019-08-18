class  pattern9
{
	public static void main(String[] args) 
	{
		int star=0;
		for(int i=1;i<=9;i++)
		{
			if((i<=3)||(i>=7))
			{
				for(int j=1;j<=8;j++)
				{
					System.out.print(" ");
				}
				if(i<=5)
				{
					star++;
				}
				else
				{
					star--;
				}
			}
			else
			{
				for(int k=1;k<=8;k++)
				{
					System.out.print("*");
				}
				if(i<=5)
				{
					star++;
				}
				else
				{
					star--;
				}
			}
			for(int m=1;m<=star;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			

