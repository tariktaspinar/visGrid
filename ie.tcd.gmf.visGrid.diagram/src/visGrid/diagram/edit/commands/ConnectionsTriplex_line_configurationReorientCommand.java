package visGrid.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ConnectionsTriplex_line_configurationReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ConnectionsTriplex_line_configurationReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof visGrid.Connections) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof visGrid.Triplex_line_configuration && newEnd instanceof visGrid.Connections)) {
			return false;
		}
		return visGrid.diagram.edit.policies.VisGridBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistConnectionsTriplex_line_configuration_4147(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof visGrid.Triplex_line_configuration && newEnd instanceof visGrid.Triplex_line_configuration)) {
			return false;
		}
		return visGrid.diagram.edit.policies.VisGridBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistConnectionsTriplex_line_configuration_4147(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getTriplex_line_configuration().remove(getOldTarget());
		getNewSource().getTriplex_line_configuration().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getTriplex_line_configuration().remove(getOldTarget());
		getOldSource().getTriplex_line_configuration().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected visGrid.Connections getOldSource() {
		return (visGrid.Connections) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected visGrid.Connections getNewSource() {
		return (visGrid.Connections) newEnd;
	}

	/**
	 * @generated
	 */
	protected visGrid.Triplex_line_configuration getOldTarget() {
		return (visGrid.Triplex_line_configuration) oldEnd;
	}

	/**
	 * @generated
	 */
	protected visGrid.Triplex_line_configuration getNewTarget() {
		return (visGrid.Triplex_line_configuration) newEnd;
	}
}
