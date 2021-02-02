package day5;
class Employee{
	int id;
	String name;
	double salary;
	int experience;
	void displayEmployeeDetails()
	{
		System.out.println("ID is" +id);
		System.out.println("name is" +name);
		System.out.println("salary is" +salary);
		System.out.println("experience is" +experience);
			}
	String checkForLoanOption()
	{
		if(salary>75000)
			return "you can apply for loan.";
		return "you cannot applyfor loan";
					
	}
}

public class Day5FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ritu=new Employee();
		ritu.id=1;
		ritu.name="Ritu Saluja";
		ritu.salary=25000;
        ritu.experience=7;
        ritu.displayEmployeeDetails();
        System.out.println(ritu.checkForLoanOption());
	}

}
