package day4;

public class searching_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {2,5,3,7,19,20,16};
   int FindNumber=19, flag=0, location=0;
   for(int i=0;i<a.length;i++)
   {
	   if(a[i]== FindNumber)
	   {
		   flag=1;
		   location=i+1;
		   break;
	   }
   }
   if(flag==1)
   {
	   System.out.println("element is found in" + location + "position");
   }
   else {
	   System.out.println("element is not found");
   }
	}

}
