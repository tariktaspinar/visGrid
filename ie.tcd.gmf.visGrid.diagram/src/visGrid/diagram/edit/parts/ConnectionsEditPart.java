package visGrid.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ConnectionsEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2077;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ConnectionsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.ConnectionsItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new RectangleFigure();
	}

	/**
	 * @generated
	 */
	public RectangleFigure getPrimaryShape() {
		return (RectangleFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(78);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_conductor_4004);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_conductor_4014);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsShaper_4021);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlc_4022);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOffice_4023);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsVoltdump_4033);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_configuration_4045);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFault_check_4046);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlayer_4048);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFuse_4052);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsComm_4053);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_configuration_4059);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPqload_4060);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsBilldump_4066);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCollector_4087);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLink_4097);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMultizone_4100);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHistogram_4109);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_4112);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_meter_4127);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRestoration_4142);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_conductor_4150);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapbank_4152);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsVolt_var_control_4153);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRelay_4155);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.House_aEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_conductor_4004);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Energy_storageEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Dc_dc_converterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HouseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClimateEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_conductor_4014);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.StubauctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ShaperEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsShaper_4021);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlcEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlc_4022);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OfficeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOffice_4023);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.AuctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RefrigeratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.VoltdumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsVoltdump_4033);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.InverterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Residential_enduseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SubstationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicroturbineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_configuration_4045);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Fault_checkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFault_check_4046);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlayerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlayer_4048);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClotheswasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_spacingEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FuseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFuse_4052);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CommEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsComm_4053);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.EvchargerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LightsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ControllerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Series_reactorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_configuration_4059);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PqloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPqload_4060);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Power_electronicsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Csv_readerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BilldumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsBilldump_4066);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SolarEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OccupantloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.GeneratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FreezerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RangeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RecorderEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CollectorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCollector_4087);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Regulator_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MeterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Controller2EditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DryerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LinkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLink_4097);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MultizoneEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMultizone_4100);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Windturb_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlugloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicrowaveEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ZIPloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RectifierEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HistogramEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHistogram_4109);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapacitorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RegulatorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_4112);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SwitchEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.TransformerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_meterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_meter_4127);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.NodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LoadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Frequency_genEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RestorationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRestoration_4142);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MotorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WeatherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DishwasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BatteryEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_conductor_4150);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapbankEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapbank_4152);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Volt_var_controlEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsVolt_var_control_4153);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RelayEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRelay_4155);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2038);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_conductor_4004) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2047);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2014);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2019);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2012);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2001);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_conductor_4014) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2036);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2020);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsShaper_4021) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2074);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlc_4022) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2061);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsOffice_4023) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2054);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2025);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2029);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsVoltdump_4033) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2046);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2045);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2013);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2048);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2024);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_configuration_4045) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2028);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsFault_check_4046) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2063);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlayer_4048) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2018);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2049);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2003);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsFuse_4052) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2066);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsComm_4053) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2056);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2059);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2039);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2006);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2041);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_configuration_4059) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2057);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsPqload_4060) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2011);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2033);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2070);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsBilldump_4066) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2016);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2026);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2065);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2075);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2058);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2022);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2064);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsCollector_4087) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2053);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2010);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2002);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2015);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2060);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2030);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsLink_4097) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2032);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsMultizone_4100) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2027);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2051);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2031);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2055);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2062);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2008);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsHistogram_4109) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2073);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2023);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_4112) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2005);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2068);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2071);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2035);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2021);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_meter_4127) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2052);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2037);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2007);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2079);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2043);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2050);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRestoration_4142) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2040);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2078);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2044);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2076);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2069);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_conductor_4150) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2004);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapbank_4152) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2017);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsVolt_var_control_4153) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2067);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRelay_4155) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2009);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2034);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(78);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductorConnection_4002);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configurationConnection_4011);
		types.add(visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012);
		types.add(visGrid.diagram.providers.VisGridElementTypes.LinkConnection_4013);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015);
		types.add(visGrid.diagram.providers.VisGridElementTypes.CapbankConnection_4016);
		types.add(visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018);
		types.add(visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019);
		types.add(visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020);
		types.add(visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024);
		types.add(visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RelayConnection_4026);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027);
		types.add(visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031);
		types.add(visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032);
		types.add(visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034);
		types.add(visGrid.diagram.providers.VisGridElementTypes.BilldumpConnection_4035);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039);
		types.add(visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040);
		types.add(visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042);
		types.add(visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044);
		types.add(visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_checkConnection_4049);
		types.add(visGrid.diagram.providers.VisGridElementTypes.MultizoneConnection_4056);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductorConnection_4062);
		types.add(visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063);
		types.add(visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065);
		types.add(visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067);
		types.add(visGrid.diagram.providers.VisGridElementTypes.PqloadConnection_4069);
		types.add(visGrid.diagram.providers.VisGridElementTypes.OfficeConnection_4070);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072);
		types.add(visGrid.diagram.providers.VisGridElementTypes.HouseConnection_4073);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RestorationConnection_4077);
		types.add(visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RegulatorConnection_4084);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085);
		types.add(visGrid.diagram.providers.VisGridElementTypes.CommConnection_4086);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_controlConnection_4088);
		types.add(visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093);
		types.add(visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096);
		types.add(visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098);
		types.add(visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ShaperConnection_4101);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103);
		types.add(visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configurationConnection_4111);
		types.add(visGrid.diagram.providers.VisGridElementTypes.CollectorConnection_4113);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115);
		types.add(visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117);
		types.add(visGrid.diagram.providers.VisGridElementTypes.PlayerConnection_4119);
		types.add(visGrid.diagram.providers.VisGridElementTypes.PlcConnection_4120);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123);
		types.add(visGrid.diagram.providers.VisGridElementTypes.HistogramConnection_4124);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductorConnection_4128);
		types.add(visGrid.diagram.providers.VisGridElementTypes.VoltdumpConnection_4129);
		types.add(visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meterConnection_4133);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135);
		types.add(visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137);
		types.add(visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138);
		types.add(visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151);
		types.add(visGrid.diagram.providers.VisGridElementTypes.FuseConnection_4154);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductorConnection_4002) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2004);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2010);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2062);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Line_configurationConnection_4011) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2028);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2071);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.LinkConnection_4013) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2032);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2001);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.CapbankConnection_4016) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2017);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2065);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2068);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2007);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2002);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2026);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RelayConnection_4026) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2009);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2070);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2039);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2049);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2031);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2024);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.BilldumpConnection_4035) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2016);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2030);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2035);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2044);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2014);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2038);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2060);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Fault_checkConnection_4049) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2063);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.MultizoneConnection_4056) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2027);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductorConnection_4062) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2047);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2078);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2045);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2048);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.PqloadConnection_4069) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2011);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.OfficeConnection_4070) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2054);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2029);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.HouseConnection_4073) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2012);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2019);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2008);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RestorationConnection_4077) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2040);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2069);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2050);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RegulatorConnection_4084) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2005);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2006);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.CommConnection_4086) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2056);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Volt_var_controlConnection_4088) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2067);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2058);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2051);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2059);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2020);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2075);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ShaperConnection_4101) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2074);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2064);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Transformer_configurationConnection_4111) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2057);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.CollectorConnection_4113) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2053);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2079);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2043);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.PlayerConnection_4119) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2018);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.PlcConnection_4120) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2061);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2015);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2034);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.HistogramConnection_4124) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2073);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2003);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2076);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductorConnection_4128) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2036);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.VoltdumpConnection_4129) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2046);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2023);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2041);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Triplex_meterConnection_4133) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2052);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2033);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2021);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2025);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2055);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2013);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2037);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2022);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.FuseConnection_4154) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2066);
		}
		return types;
	}

}
