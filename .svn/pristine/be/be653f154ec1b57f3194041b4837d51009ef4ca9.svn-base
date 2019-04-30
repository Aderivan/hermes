package br.com.apsinformatica.infra;

import java.util.List;

public interface IPersistence<T> {
	public T getById(final String id);
	@SuppressWarnings("unchecked")
	public List<T> findAll();
	public void persist(T entidade);
	public void merge(T entidade);
	public void remove(T entidade);
	public void removeById(final String id);
}
