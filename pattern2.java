package Day2;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,number, n=3;   
		//loop for rows  
		for(i=0; i<n; i++)  
		{   
		number=1;   
		//loop for columns  
		for(j=0; j<=i; j++)  
		{   
		//prints number  
		System.out.print(number+ " ");   
		//incrementing the value of number   
		number++;   
		}   
		System.out.println();   
		}   

	}

}
