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
		List<String> header = new ArrayList<>();
		header.add("Title");
		header.add("PublisherName");
		ListBox.display(service1.getQuery(publisherFilter), header);
	}

	@Override
	public void query2(String startDate, String endDate) {
		List<String> header = new ArrayList<>();
		header.add("BranchID");
		header.add("BookID");
		header.add("DateOut");
		header.add("DueDate");
		ListBox.display(service2.getQuery(startDate, endDate), header);
	}

	@Override
	public void query3(String firstName, String lastName) {
		List<String> header = new ArrayList<>();
		header.add("Title");
		header.add("PublisherName");
		header.add("Author");
		ListBox.display(service3.getQuery(firstName, lastName), header);
	}

	@Override
	public void query4() {
		List<String> header = new ArrayList<>();
		header.add("BookID");
		header.add("Title");
		header.add("Author");
		header.add("PublisherName");
		ListBox.display(service4.getQuery(), header);
	}

	@Override
	public void query5() {
		List<String> header = new ArrayList<>();
		header.add("CardNo");
		header.add("Borrower");
		header.add("NoBkBor");
		ListBox.display(service5.getQuery(), header);
	}

	@Override
	public void query6(String branch) {
		List<String> header = new ArrayList<>();
		header.add("Title");
		ListBox.display(service6.getQuery(branch), header);
	}

	@Override
	public void query7() {
		List<String> header = new ArrayList<>();
		header.add("BranchID");
		header.add("BranchName");
		header.add("BookID");
		header.add("NoTimesLoaned");
		header.add("Title");
		header.add("Author");
		header.add("PublisherName");
		header.add("Address");
		ListBox.display(service7.getQuery(), header);
	}

	@Override
	public void query8(String book) {
		List<String> header = new ArrayList<>();
		header.add("Title");
		header.add("BranchName");
		header.add("Borrower");
		header.add("DateOut");
		header.add("DueDate");
		ListBox.display(service8.getQuery(book), header);
	}
}
