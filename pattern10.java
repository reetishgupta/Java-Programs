class pattern10 
{
	public static void main(String[] args) 
	{
      int space=5;
	  int star=0;
	  for(int i=1;i<=9;i++)
		{
		  if(i<=5)
			{
			  star++;
			  space--;
			}
			else
			{
				star--;
				space++;
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			if((i>=4)&&(i<=6))
			{
				for(int l=1;l<=8;l++)
				{
				System.out.print("*");
				}
			}
		System.out.println();
		}
	}
}

