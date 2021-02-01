package Day2;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* for(int i=1;i<=50;i++)
{
	if(i%2==1)
 System.out.println(i);	
}*/ 
	/*for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=4;j++)
		{
			System.out.print(i+ "" + j+ " " );
		}
		System.out.println();
	}*/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1|| j==5)
			{
			System.out.println(i +  "" + j + "");		
				}
				else
					System.out.println(" ");
			}

		}
	}
}