/*
Demonstrating inheritance 
*/

class College
{
	String collName,collAddress;
	
	College ()
	{

		collName="Amrita";
		collAddress="Amritapuri";
		

	}
	void showCollegeDetails()
	{
		System.out.println("Name: "+collName);
		System.out.println("Address: "+collAddress);
		
	}
}

class Department extends College
{
	String deptName,hodName;
	Department ()
	{
		
		deptName="CSE";
		hodName="Jyotisha";

	}
	void showDepartmentDetails()					               
	{
		
		System.out.println("Department Name: "+deptName);
		System.out.println("Address: "+hodName);
	} 	
	

}
class Faculty extends Department
{
	String facName,facQual;
	int year;
	Faculty ( )
	{
	
		facName="Sumeeh KJ";
		facQual="Phd";
		year=4;

	}
	void showFacultyDetails()					               
	{
		System.out.println("Name: "+collName);
		System.out.println("Address: "+collAddress);
		System.out.println("Department Name: "+deptName);
		System.out.println("Address: "+hodName);
		System.out.println("Faculty Name: "+facName);
		System.out.println("Faculty Qualifications "+facQual);
		System.out.println("No of years"+ year);
	} 	
	

}


public class OOPS6
{
	public static void  main(String args[])
	{
		College c=new College();
		Department d=new Department();
		Faculty f=new Faculty();
		f.showFacultyDetails();
		
		




	}
}
