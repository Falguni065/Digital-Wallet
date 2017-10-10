
public class Farm extends Monthly_Income {

	int poultry,agriculture,farm;
	
	public Farm(int x,int y,int z)
	{
		super(x);
		this.poultry = y;
		this.agriculture = z;
		
	}
	
	public void getfarm()
	{
		farm = basic + poultry + agriculture;
	}
}
