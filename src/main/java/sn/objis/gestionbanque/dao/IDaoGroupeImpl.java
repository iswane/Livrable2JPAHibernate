/**
 * 
 */
package sn.objis.gestionbanque.dao;

import sn.objis.gestionbanque.domaine.Groupe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoGroupeImpl extends AbstractIDaoGeneriqueImpl<Groupe, Integer> implements IDaoGroupe{

	public IDaoGroupeImpl() {
		super(Groupe.class);
	}

}
