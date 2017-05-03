
public class SixrteenthAssignment {

	public static void main(String[] args)
		{

	manager manage=new manager();
	manage.show();
	
	trainee tra=new trainee();
	tra.show();

	
	
		}
}


class employees
{
	
	char employeename;
	int employeeid;
	static String company="cts"; 
	int salary;
	int allowance;

	
	void show()
	{
		
	}
	
}

class manager extends employees
{
	
	String employeename;
	int employeeid;
	static String company=" cts "; 
	int salary;
	int allowance;

	
	void show()
	{
		employeename="navinbala";
		employeeid=1001;
		salary=22000;
	allowance=(salary*15)/100;
	System.out.println(" MANAGER DETAILS "+" \n employee name " + employeename + " \n employee id " + employeeid + " \n company name " + company + " \n manager's salary " +  salary +  " \ntravel allowance for manager is " + allowance );

	}
	
}



class trainee extends employees
{
	
	String employeename;
	int employeeid;
	static String company=" cts "; 
	int salary;
	int allowance;

	
	void show()
	{
		employeename="bala";
		employeeid=1002;
		salary=15000;
	allowance=(salary*10)/100;
	System.out.println( "\n\nTRAINEE DETAILS: " +" \n employee name " +employeename + " \n employee id "+ employeeid + " \n  company name "+ company + " \n trainee's salary  " +salary + " \n travel allowance for trainee is " + allowance );
	
	}
	
}


