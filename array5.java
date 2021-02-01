package day3;

public class array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// unjagged array
		int a[][]=new int[4][5];
		System.out.println("row length"+ a.length);
		System.out.println("column length"+ a[1].length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"");
			}
			System.out.println();
		}
		
	}

}
