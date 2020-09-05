package br.com.smartpizza.dao;

public interface GenericDao <T> {
	
	public void saveOrUpdate(T entity);
	public void update(T entity);
	public void merge (T entity);
	public void delete (T entity);
	public T findById(Long primaryKey);
}
