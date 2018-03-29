package com.daos;

public interface ICrud<T> {
	public Boolean create(T entity);

	public T read(Long id);

	public Boolean update(T entity);

	public Boolean delete(Long id);

}
