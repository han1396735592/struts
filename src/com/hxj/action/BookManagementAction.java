package com.hxj.action;

import com.hxj.db.BookDatabase;
import com.hxj.doamin.Book;
import com.opensymphony.xwork2.ActionSupport;

public class BookManagementAction extends ActionSupport{
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String execute() throws Exception {
		return super.execute();
	}
	
	public String addBook(){
		if(BookDatabase.addBook(book))
			return SUCCESS;
		else 
			return ERROR;
		
		
	}
	
	
	
	

}
