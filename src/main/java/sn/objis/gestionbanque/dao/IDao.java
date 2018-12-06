/**
 * 
 */
package sn.objis.gestionbanque.dao;

import java.util.List;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDao<T,K> {
	
	public T add(T t);
	
	public List<T> getAll();
	
	public T findByKey(K k);
}
