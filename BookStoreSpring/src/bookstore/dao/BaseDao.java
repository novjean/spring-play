package bookstore.dao;

import java.util.List;

public interface BaseDao {

	//Create a book
	public void persist(Object obj);
	
	//List all books part of the table
	public <T> List<T> getAll(Class<T> clazz);
}
