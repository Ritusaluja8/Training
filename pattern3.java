package Day2;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k = 1;  
		//inner loop  
		for (i = 1; i <= 3; i++)   
		{  
		//outer loop  
		for (j = 1; j< i + 1; j++)   
		{  
		//prints the value of k  
		System.out.print(k++ + " ");  
		}   
		System.out.println();  
		}  

	}

}
