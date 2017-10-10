public class Monthly_Expense {
	
	int food, house_rent,education,treatment,current_bill,totalexpense;
	
	public void setExpense(int f,int h,int ed,int t,int c)
	{
		food = f;
		house_rent= h;
		education = ed;
		treatment = t;
		current_bill = c;
		
	}
	
	public void getExpense()
	{
		 totalexpense = food+house_rent+education+treatment+current_bill;
		 System.out.println("Your total expense is: ");
		 System.out.println(totalexpense);
	}



}
