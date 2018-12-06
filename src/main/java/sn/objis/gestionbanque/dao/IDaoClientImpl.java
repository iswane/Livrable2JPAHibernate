/**
 * 
 */
package sn.objis.gestionbanque.dao;

import sn.objis.gestionbanque.domaine.Client;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoClientImpl extends AbstractIDaoGeneriqueImpl<Client, Integer> implements IDaoClient{

	public IDaoClientImpl() {
		super(Client.class);
	}

}
