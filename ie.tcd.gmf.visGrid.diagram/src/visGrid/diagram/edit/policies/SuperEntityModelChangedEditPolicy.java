package visGrid.diagram.edit.policies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.TopGraphicEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

import visGrid.House;
import visGrid.diagram.edit.parts.InfoLabelProvider;

public class SuperEntityModelChangedEditPolicy extends AbstractEditPolicy implements NotificationListener {
	public static final String MODEL_CHANGED_ROLE = "ModelChangedRole";

	private static final String MY_SEMANTIC_SUPER_ENTITY_LISTENER = "MySemanticSuperEntityListener";

	private final String editPolicyRole;
	private final EditPolicy defaultPolicy;

	public SuperEntityModelChangedEditPolicy(String role, EditPolicy originalPolicy) {
		super();
		this.editPolicyRole = role;
		this.defaultPolicy = originalPolicy;
	}

	@Override
	public void activate() {
		super.activate();
		if (defaultPolicy != null) {
			defaultPolicy.activate();
		}

		EditPart hostEP = getHost();
		if (hostEP instanceof InfoLabelProvider) {
			InfoLabelProvider host = (InfoLabelProvider) hostEP;
			House entity = (House) host.resolveSemanticElement();
			host.installListenerFilter(MY_SEMANTIC_SUPER_ENTITY_LISTENER, this, entity, null);
		}
	}

	@Override
	public void deactivate() {
		EditPart hostEP = getHost();
		if (hostEP instanceof InfoLabelProvider) {
			InfoLabelProvider host = (InfoLabelProvider) hostEP;
			host.uninstallListenerFilter(MY_SEMANTIC_SUPER_ENTITY_LISTENER);
		}
		if (defaultPolicy != null) {
			defaultPolicy.deactivate();
		}
		super.deactivate();
	}

	private EditPolicy getParentEditPolicy() {
		EditPart parentEP = getHost().getParent();
		while (parentEP != null) {
			EditPolicy editPolicy = parentEP.getEditPolicy(editPolicyRole);
			if (editPolicy != null && editPolicy instanceof NotificationListener) {
				return editPolicy;
			}
			if (parentEP instanceof TopGraphicEditPart) {
				return null;
			}
			parentEP = parentEP.getParent();
		}
		return null;
	}

	@Override
	public void notifyChanged(Notification n) {
		if (n.getEventType() == Notification.SET) {
			updateSuperEntityLabel();
		}

		NotificationListener parentPolicy = (NotificationListener) getParentEditPolicy();
		if (parentPolicy != null) {
			parentPolicy.notifyChanged(n);
		}
	}

	public boolean updateSuperEntityLabel() {
		EditPart host = getHost();
		if (host instanceof InfoLabelProvider) {
			return updateSuperEntityLabel((InfoLabelProvider) host);
		}
		return false;
	}

	protected boolean updateSuperEntityLabel(InfoLabelProvider host) {

	    WrappingLabel infoLabel = host.getInfoLabel();
	    if (infoLabel == null) {
	        return false;
	    }
	    return true;
	}
}