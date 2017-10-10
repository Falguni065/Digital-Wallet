import java.util.Scanner;

public class Main {
	

	private static Scanner scanObject;

	public static void main(String[] args) {
		int p,q,r,f,h,ed,c,t,total_income;
	
		Monthly_Income i = new Monthly_Income();
		Monthly_Expense e = new Monthly_Expense();

		scanObject = new Scanner(System.in);
		System.out.println("Enter your basic job salary: ");
		p = scanObject.nextInt();
		System.out.println("Enter your payment for education: ");
		q = scanObject.nextInt();
		System.out.println("Enter your payment for treatment: ");
		r = scanObject.nextInt();
		
		Job j = new Job(p,q,r);
		
		
		
		System.out.println("Enter your basic business income: ");
		p = scanObject.nextInt();
		System.out.println("Enter your income from cloth business: ");
		q = scanObject.nextInt();
		System.out.println("Enter your income from medicine business: ");
		r = scanObject.nextInt();
		
		Business b = new Business(p,q,r);
		
		
		
		System.out.println("Enter your basic income from farm: ");
		p = scanObject.nextInt();
		System.out.println("Enter your income from poultry farm: ");
		q = scanObject.nextInt();
		System.out.println("Enter your income from agricultural farm: ");
		r = scanObject.nextInt();
		
		Farm fa = new Farm(p,q,r);
		
		j.getjob();
		b.getbusiness();
		fa.getfarm();
		
		
		total_income = j.jobsalary + b.business + fa.farm ;
		
	     System.out.println("Your total income is: ");
		 System.out.println(total_income);
		

		System.out.println("Enter your expense for food: ");
		f = scanObject.nextInt();
		System.out.println("Enter your house rent: ");
		h = scanObject.nextInt();
		System.out.println("Enter your expense for education: ");
		ed = scanObject.nextInt();
		System.out.println("Enter your expense for treatment: ");
		t = scanObject.nextInt();
		System.out.println("Enter your current bill: ");
		c = scanObject.nextInt();
		
		
		e.setExpense(f,h,ed,t,c);
		e.getExpense();

		
		
		
	}

}
