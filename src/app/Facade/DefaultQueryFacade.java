package app.Facade;

import app.model.*;

public abstract class DefaultQueryFacade
{
	protected OneService service1;
	protected TwoService service2;
	protected ThreeService service3;
	protected FourService service4;
	protected FiveService service5;
	protected SevenService service7;

	public DefaultQueryFacade() {
		this.service1 = new OneService();
		this.service2 = new TwoService();
		this.service3 = new ThreeService();
		this.service4 = new FourService();
		this.service5 = new FiveService();
		this.service7 = new SevenService();
	}

	public abstract void query1(String publisherFilter);
	public abstract void query2(String startDate, String endDate);
	public abstract void query3(String firstName, String lastName);
	public abstract void query4();
	public abstract void query5();
	public abstract void query6();
	public abstract void query7();
	public abstract void query8();
}
