/**
 * 
 */
package Day1;

/**
 * @author Lenovo
 *
 */
public class Increment_Decrement {

	/**
	 * @param args  ++a pre-increment- before assigning the value it will add
	 * post-incre/decre first assgn the value then add
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		System.out.println("value of a is" + ++a);
		System.out.println("value of a is" + a++);
		int b= a++ + ++a + a++ - a++;
		System.out.println(b);
		int c= a-- + ++a + --a + a--;
		System.out.println(c);
		int d= --a + ++a + a++;
		System.out.println(d);
		

	}

}
