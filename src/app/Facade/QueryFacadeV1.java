package app.Facade;

import app.model.DBConnection;
import app.view.ListBox;

import java.util.ArrayList;
import java.util.List;

public class QueryFacadeV1 extends DefaultQueryFacade
{
	public QueryFacadeV1()
	{
		super();
	}
	@Override
	public void query1(String publisherFilter) {
		ListBox.display(service1.getQuery(publisherFilter));
	}

	@Override
	public void query2(String startDate, String endDate) {
		ListBox.display(service2.getQuery(startDate, endDate));
	}

	@Override
	public void query3(String firstName, String lastName) {
		ListBox.display(service3.getQuery(firstName, lastName));
	}

	@Override
	public void query4() {
		ListBox.display(service4.getQuery());
	}

	@Override
	public void query5() {
		ListBox.display(service5.getQuery());
	}

	@Override
	public void query6() {
		/* TODO: insert query 6 logic here */
		/* TODO: call static method ListBox.display() to display results, accepts arraylist of strings */
		/* 1 row = 1 string
		*  I suggest using tabs (\t) to separate columns para pantay pantay
		* */
	}

	@Override
	public void query7() {
		ListBox.display(service7.getQuery());
	}

	@Override
	public void query8() {
		/* TODO: insert query 8 logic here */
		/* TODO: call static method ListBox.display() to display results, accepts arraylist of strings */
		/* 1 row = 1 string
		*  I suggest using tabs (\t) to separate columns para pantay pantay
		* */
	}
}
