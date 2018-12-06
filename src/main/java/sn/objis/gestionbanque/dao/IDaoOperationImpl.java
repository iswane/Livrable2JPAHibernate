/**
 * 
 */
package sn.objis.gestionbanque.dao;

import sn.objis.gestionbanque.domaine.Operation;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoOperationImpl extends AbstractIDaoGeneriqueImpl<Operation, Integer> implements IDaoOperation {

	public IDaoOperationImpl() {
		super(Operation.class);
	}
}
