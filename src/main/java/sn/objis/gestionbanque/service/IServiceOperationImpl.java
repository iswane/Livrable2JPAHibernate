/**
 * 
 */
package sn.objis.gestionbanque.service;

import java.util.List;

import sn.objis.gestionbanque.dao.IDaoOperationImpl;
import sn.objis.gestionbanque.domaine.Operation;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceOperationImpl implements IServiceOperation{

	IDaoOperationImpl dao = new IDaoOperationImpl();
	
	@Override
	public Operation ajouter(Operation t) {
		dao.add(t);
		return t;
	}

	@Override
	public List<Operation> lister() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Operation rechercherParCle(long k) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
