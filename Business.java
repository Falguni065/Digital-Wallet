
public class Business extends Monthly_Income {

	int cloth,medicine,business;
	
	public Business(int x,int y,int z)
	{
		super(x);
		this.cloth = y;
		this.medicine = z;
		
	}
	
	public Business()
	{
		
		
	}
	
	public void getbusiness()
	{
		business = basic + cloth + medicine;
	}
}
