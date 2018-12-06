/**
 * 
 */
package sn.objis.gestionbanque.service;

import java.util.List;

import sn.objis.gestionbanque.dao.IDaoClientImpl;
import sn.objis.gestionbanque.domaine.Client;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceClientImpl implements IServiceClient{

	IDaoClientImpl dao = new IDaoClientImpl();
	@Override
	public Client ajouter(Client t) {
		// TODO Auto-generated method stub
		return dao.add(t);
	}

	@Override
	public List<Client> lister() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Client rechercherParCle(long k) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
