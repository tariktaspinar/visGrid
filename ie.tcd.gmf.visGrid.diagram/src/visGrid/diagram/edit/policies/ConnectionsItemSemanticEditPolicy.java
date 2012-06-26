package visGrid.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ConnectionsItemSemanticEditPolicy extends
		visGrid.diagram.edit.policies.VisGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionsItemSemanticEditPolicy() {
		super(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductorConnection_4002 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsHouse_aCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_conductor_4004 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTriplex_line_conductorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsEnergy_storageCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsDc_dc_converterCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsHouseCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsClimateCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Line_configurationConnection_4011 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.LinkConnection_4013 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_conductor_4014 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsUnderground_line_conductorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.CapbankConnection_4016 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsStubauctionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsShaper_4021 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsShaperCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlc_4022 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsPlcCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsOffice_4023 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsOfficeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RelayConnection_4026 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsAuctionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRefrigeratorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsVoltdump_4033 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsVoltdumpCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.BilldumpConnection_4035 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsInverterCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsResidential_enduseCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsSubstationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsMicroturbineCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_configuration_4045 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLine_configurationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsFault_check_4046 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsFault_checkCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlayer_4048 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsPlayerCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Fault_checkConnection_4049 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsClotheswasherCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLine_spacingCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsFuse_4052 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsFuseCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsComm_4053 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsCommCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsEvchargerCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLightsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.MultizoneConnection_4056 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsControllerCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsSeries_reactorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_configuration_4059 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTransformer_configurationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsPqload_4060 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsPqloadCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsPower_electronicsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductorConnection_4062 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsCsv_readerCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsBilldump_4066 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsBilldumpCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsSolarCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.PqloadConnection_4069 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.OfficeConnection_4070 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsOccupantloadCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.HouseConnection_4073 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsGeneratorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RestorationConnection_4077 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsFreezerCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRangeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRecorderCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTriplex_nodeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RegulatorConnection_4084 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.CommConnection_4086 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsCollector_4087 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsCollectorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Volt_var_controlConnection_4088 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRegulator_configurationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsMeterCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsController2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsDryerCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTriplex_lineCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLink_4097 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLinkCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsMultizone_4100 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsMultizoneCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ShaperConnection_4101 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsWindturb_dgCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsPlugloadCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsMicrowaveCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsZIPloadCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRectifierCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsHistogram_4109 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsHistogramCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsCapacitorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Transformer_configurationConnection_4111 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_4112 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRegulatorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.CollectorConnection_4113 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsWaterheaterCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsSwitchCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTransformerCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.PlayerConnection_4119 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.PlcConnection_4120 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLineCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.HistogramConnection_4124 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_meter_4127 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTriplex_meterCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductorConnection_4128 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.VoltdumpConnection_4129 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsUnderground_lineCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_meterConnection_4133 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsNodeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsDiesel_dgCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLoadCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsFrequency_genCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRestoration_4142 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRestorationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsMotorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsWeatherCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsDishwasherCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTriplex_line_configurationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsBatteryCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_conductor_4150 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsOverhead_line_conductorCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapbank_4152 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsCapbankCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsVolt_var_control_4153 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsVolt_var_controlCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.FuseConnection_4154 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRelay_4155 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRelayCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsOverhead_lineCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_nodeConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductorConnection_4002 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Overhead_line_conductorConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_conductor_4004 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Regulator_configurationConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ZIPloadConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Line_configurationConnection_4011 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Line_configurationConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.SwitchConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.LinkConnection_4013 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.LinkConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_conductor_4014 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ClimateConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.CapbankConnection_4016 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.CapbankConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.OccupantloadConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.WaterheaterConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.NodeConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsShaper_4021 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlc_4022 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsOffice_4023 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.MeterConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.SolarConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RelayConnection_4026 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RelayConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Csv_readerConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.LightsConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ClotheswasherConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.PlugloadConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsVoltdump_4033 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.MicroturbineConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.BilldumpConnection_4035 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.BilldumpConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_lineConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.TransformerConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.WeatherConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Energy_storageConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.House_aConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_configuration_4045 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsFault_check_4046 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.DryerConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlayer_4048 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Fault_checkConnection_4049 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Fault_checkConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsFuse_4052 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsComm_4053 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.MultizoneConnection_4056 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.MultizoneConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_configuration_4059 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsPqload_4060 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductorConnection_4062 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_line_conductorConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.MotorConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.InverterConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsBilldump_4066 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.SubstationConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.PqloadConnection_4069 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.PqloadConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.OfficeConnection_4070 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.OfficeConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RefrigeratorConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.HouseConnection_4073 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.HouseConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Dc_dc_converterConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RectifierConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RestorationConnection_4077 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RestorationConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.BatteryConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Frequency_genConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RegulatorConnection_4084 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RegulatorConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ControllerConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.CommConnection_4086 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.CommConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsCollector_4087 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Volt_var_controlConnection_4088 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Volt_var_controlConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.FreezerConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Windturb_dgConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.EvchargerConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLink_4097 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.StubauctionConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.GeneratorConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsMultizone_4100 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ShaperConnection_4101 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ShaperConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RecorderConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.DishwasherConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsHistogram_4109 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Transformer_configurationConnection_4111 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Transformer_configurationConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_4112 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.CollectorConnection_4113 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.CollectorConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Diesel_dgConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.LoadConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.PlayerConnection_4119 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.PlayerConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.PlcConnection_4120 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.PlcConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Controller2ConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Overhead_lineConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.HistogramConnection_4124 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.HistogramConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Line_spacingConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_line_configurationConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_meter_4127 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductorConnection_4128 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Underground_line_conductorConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.VoltdumpConnection_4129 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.VoltdumpConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.CapacitorConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Series_reactorConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_meterConnection_4133 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_meterConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Power_electronicsConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.LineConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.AuctionConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.MicrowaveConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRestoration_4142 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Residential_enduseConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Underground_lineConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_conductor_4150 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RangeConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapbank_4152 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsVolt_var_control_4153 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.FuseConnection_4154 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.FuseConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsRelay_4155 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_nodeConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Overhead_line_conductorConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsHouse_aReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTriplex_line_conductorReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsEnergy_storageReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsDc_dc_converterReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Regulator_configurationConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsHouseReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ZIPloadConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsClimateReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Line_configurationConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.SwitchConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.LinkConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsUnderground_line_conductorReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ClimateConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.CapbankConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsStubauctionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.OccupantloadConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.WaterheaterConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.NodeConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsShaperReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsPlcReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsOfficeReorientCommand(
					req));
		case visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.MeterConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.SolarConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.RelayConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Csv_readerConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsAuctionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.LightsConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRefrigeratorReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ClotheswasherConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.PlugloadConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsVoltdumpReorientCommand(
					req));
		case visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.MicroturbineConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.BilldumpConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsInverterReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsResidential_enduseReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsSubstationReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_lineConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.TransformerConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.WeatherConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Energy_storageConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsMicroturbineReorientCommand(
					req));
		case visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.House_aConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLine_configurationReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsFault_checkReorientCommand(
					req));
		case visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.DryerConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsPlayerReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Fault_checkConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsClotheswasherReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLine_spacingReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsFuseReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsCommReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsEvchargerReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLightsReorientCommand(
					req));
		case visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.MultizoneConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsControllerReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsSeries_reactorReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTransformer_configurationReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsPqloadReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsPower_electronicsReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_line_conductorConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.MotorConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsCsv_readerReorientCommand(
					req));
		case visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.InverterConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsBilldumpReorientCommand(
					req));
		case visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.SubstationConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsSolarReorientCommand(
					req));
		case visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.PqloadConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.OfficeConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsOccupantloadReorientCommand(
					req));
		case visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.RefrigeratorConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.HouseConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Dc_dc_converterConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.RectifierConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsGeneratorReorientCommand(
					req));
		case visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.RestorationConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.BatteryConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsFreezerReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRangeReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRecorderReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Frequency_genConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTriplex_nodeReorientCommand(
					req));
		case visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.RegulatorConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ControllerConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.CommConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsCollectorReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Volt_var_controlConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.FreezerConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRegulator_configurationReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsMeterReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsController2ReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Windturb_dgConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsDryerReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTriplex_lineReorientCommand(
					req));
		case visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.EvchargerConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLinkReorientCommand(
					req));
		case visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.StubauctionConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.GeneratorConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsMultizoneReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ShaperConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsWindturb_dgReorientCommand(
					req));
		case visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.RecorderConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsPlugloadReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsMicrowaveReorientCommand(
					req));
		case visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.DishwasherConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsZIPloadReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRectifierReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsHistogramReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsCapacitorReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Transformer_configurationConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRegulatorReorientCommand(
					req));
		case visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.CollectorConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsWaterheaterReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Diesel_dgConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsSwitchReorientCommand(
					req));
		case visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.LoadConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTransformerReorientCommand(
					req));
		case visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.PlayerConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.PlcConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Controller2ConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLineReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Overhead_lineConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.HistogramConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Line_spacingConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_line_configurationConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTriplex_meterReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Underground_line_conductorConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.VoltdumpConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.CapacitorConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsUnderground_lineReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Series_reactorConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_meterConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsNodeReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Power_electronicsConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsDiesel_dgReorientCommand(
					req));
		case visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.LineConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.AuctionConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.MicrowaveConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsLoadReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsFrequency_genReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRestorationReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsMotorReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Residential_enduseConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsWeatherReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsDishwasherReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsTriplex_line_configurationReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsBatteryReorientCommand(
					req));
		case visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.Underground_lineConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsOverhead_line_conductorReorientCommand(
					req));
		case visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.RangeConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsCapbankReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsVolt_var_controlReorientCommand(
					req));
		case visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.FuseConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsRelayReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsOverhead_lineReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
