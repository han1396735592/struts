package com.hxj.db;

import java.util.ArrayList;
import java.util.List;

import com.hxj.doamin.Book;

public class BookDatabase {
	private static List<Book> bdb = new ArrayList<Book>();
	
	public static boolean addBook(Book book){
		for (int i = 0; i < bdb.size(); i++) {
			Book bk = bdb.get(i);
			if(bk.getBookSN().equals(book.getBookSN())){
				return false;
			}
		}
		return bdb.add(book);
	}
	
	public static boolean deleteBook(Book book){
		for (int i = 0; i < bdb.size(); i++) {
			if(bdb.get(i).getBookSN().equals(book.getBookSN())){
				 bdb.remove(i);
				 return true;
			}
		}
		return false;
	}

}
