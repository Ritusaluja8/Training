package day3;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,8,5,9,12,7};
		int i,odd_sum=0,even_sum=0,odd_count=0,even_count=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				even_sum=even_sum+a[i];
				++even_count;
			}
			else {
				odd_sum=odd_sum+a[i];
				++odd_count;
			}
		}
		System.out.println("the even count is" + " " + even_count);
		System.out.println("the even sum is" + " " + even_sum);
		System.out.println("the odd count is" + " " + odd_count);
		System.out.println("the odd sum is" + " " + odd_sum);
		

	}

}
