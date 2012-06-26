package visGrid.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ConnectionsRefrigeratorItemSemanticEditPolicy extends
		visGrid.diagram.edit.policies.VisGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionsRefrigeratorItemSemanticEditPolicy() {
		super(
				visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
