/**
 * 
 */
package day3;

/**
 * @author Lenovo
 *
 */
public class array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int a[]=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]); */
		
		int a[]=new int[5];
		System.out.println("size of array is" + a.length);
		a[0]=3;
		a[2]=10;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+ " ");
		}
		
		
	}
}