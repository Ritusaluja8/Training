package day9;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo2 {

	public static void main(String[] args) throws IOException {      //throws IO Exception then add throws IOException
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		f.createNewFile();
		

	}

}
