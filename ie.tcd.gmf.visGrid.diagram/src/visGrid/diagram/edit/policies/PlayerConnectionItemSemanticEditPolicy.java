package visGrid.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class PlayerConnectionItemSemanticEditPolicy extends
		visGrid.diagram.edit.policies.VisGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PlayerConnectionItemSemanticEditPolicy() {
		super(
				visGrid.diagram.providers.VisGridElementTypes.PlayerConnection_4119);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
