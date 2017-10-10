
public class Job extends Monthly_Income {

	int educational,for_treatment,jobsalary;
	
	public Job(int x,int y,int z)
	{
		super(x);
		this.educational = y;
		this.for_treatment = z;
	}
	
	public Job()
	{
		
	}


	public void getjob()
	{
		jobsalary = basic + educational + for_treatment;
	}

	
}
