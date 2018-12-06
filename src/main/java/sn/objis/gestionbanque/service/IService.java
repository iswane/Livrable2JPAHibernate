package sn.objis.gestionbanque.service;

import java.util.List;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IService<T> {

	public T ajouter(T t);

	public List<T> lister();

	public T rechercherParCle(long k);
}
