package day10;

import java.io.FileNotFoundException;

public class FirstProgram {

	public static void main(String[] args) throws FileNotFoundException,ClassNotFoundException {
		// TODO Auto-generated method stub
		//throw new ArithmeticException("Exception occured"); //unchecked exception run time exception
          throw new FileNotFoundException("file is not present"); // checked or compile time exception
          //you can handled it by throw keyword or by try catch block.
	}
	

}
