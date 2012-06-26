package visGrid.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class DryerEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2074;

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
	public DryerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.DryerItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
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
		return primaryShape = new DryerFigure();
	}

	/**
	 * @generated
	 */
	public DryerFigure getPrimaryShape() {
		return (DryerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.DryerNameEditPart) {
			((visGrid.diagram.edit.parts.DryerNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureDryerNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.DryerNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
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
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(visGrid.diagram.part.VisGridVisualIDRegistry
				.getType(visGrid.diagram.edit.parts.DryerNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Regulator_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Volt_var_controlEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MultizoneEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HistogramEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.GeneratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OfficeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicrowaveEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RecorderEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ControllerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RangeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.StubauctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OccupantloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HouseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_spacingEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Residential_enduseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RelayEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Csv_readerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.TransformerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SolarEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Frequency_genEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicroturbineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.VoltdumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FreezerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LightsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LoadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CommEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlcEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Windturb_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlugloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MeterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.AuctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.EvchargerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BilldumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Energy_storageEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RestorationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.InverterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.House_aEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Power_electronicsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ShaperEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PqloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RectifierEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClotheswasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapbankEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FuseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SubstationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Controller2EditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MotorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SwitchEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Fault_checkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClimateEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ZIPloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CollectorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LinkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_meterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlayerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Dc_dc_converterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WeatherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapacitorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RefrigeratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DishwasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Series_reactorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DryerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RegulatorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.NodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BatteryEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2078);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2078);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class DryerFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerMotor_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerCoil_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerCircuit_splitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerDemandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerQueueFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerStall_voltageFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerStart_voltageFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerStall_impedanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerTrip_delayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerReset_delayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerStateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDryerOverrideFigure;

		/**
		 * @generated
		 */
		public DryerFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDryerNameFigure = new WrappingLabel();
			fFigureDryerNameFigure.setText("<...>");

			this.add(fFigureDryerNameFigure);

			fFigureDryerMotor_powerFigure = new WrappingLabel();
			fFigureDryerMotor_powerFigure.setText("<...>");

			this.add(fFigureDryerMotor_powerFigure);

			fFigureDryerCoil_powerFigure = new WrappingLabel();
			fFigureDryerCoil_powerFigure.setText("<...>");

			this.add(fFigureDryerCoil_powerFigure);

			fFigureDryerCircuit_splitFigure = new WrappingLabel();
			fFigureDryerCircuit_splitFigure.setText("<...>");

			this.add(fFigureDryerCircuit_splitFigure);

			fFigureDryerDemandFigure = new WrappingLabel();
			fFigureDryerDemandFigure.setText("<...>");

			this.add(fFigureDryerDemandFigure);

			fFigureDryerQueueFigure = new WrappingLabel();
			fFigureDryerQueueFigure.setText("<...>");

			this.add(fFigureDryerQueueFigure);

			fFigureDryerStall_voltageFigure = new WrappingLabel();
			fFigureDryerStall_voltageFigure.setText("<...>");

			this.add(fFigureDryerStall_voltageFigure);

			fFigureDryerStart_voltageFigure = new WrappingLabel();
			fFigureDryerStart_voltageFigure.setText("<...>");

			this.add(fFigureDryerStart_voltageFigure);

			fFigureDryerStall_impedanceFigure = new WrappingLabel();
			fFigureDryerStall_impedanceFigure.setText("<...>");

			this.add(fFigureDryerStall_impedanceFigure);

			fFigureDryerTrip_delayFigure = new WrappingLabel();
			fFigureDryerTrip_delayFigure.setText("<...>");

			this.add(fFigureDryerTrip_delayFigure);

			fFigureDryerReset_delayFigure = new WrappingLabel();
			fFigureDryerReset_delayFigure.setText("<...>");

			this.add(fFigureDryerReset_delayFigure);

			fFigureDryerStateFigure = new WrappingLabel();
			fFigureDryerStateFigure.setText("<...>");

			this.add(fFigureDryerStateFigure);

			fFigureDryerShapeFigure = new WrappingLabel();
			fFigureDryerShapeFigure.setText("<...>");

			this.add(fFigureDryerShapeFigure);

			fFigureDryerLoadFigure = new WrappingLabel();
			fFigureDryerLoadFigure.setText("<...>");

			this.add(fFigureDryerLoadFigure);

			fFigureDryerEnergyFigure = new WrappingLabel();
			fFigureDryerEnergyFigure.setText("<...>");

			this.add(fFigureDryerEnergyFigure);

			fFigureDryerPowerFigure = new WrappingLabel();
			fFigureDryerPowerFigure.setText("<...>");

			this.add(fFigureDryerPowerFigure);

			fFigureDryerPeak_demandFigure = new WrappingLabel();
			fFigureDryerPeak_demandFigure.setText("<...>");

			this.add(fFigureDryerPeak_demandFigure);

			fFigureDryerHeatgainFigure = new WrappingLabel();
			fFigureDryerHeatgainFigure.setText("<...>");

			this.add(fFigureDryerHeatgainFigure);

			fFigureDryerHeatgain_fractionFigure = new WrappingLabel();
			fFigureDryerHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureDryerHeatgain_fractionFigure);

			fFigureDryerCurrent_fractionFigure = new WrappingLabel();
			fFigureDryerCurrent_fractionFigure.setText("<...>");

			this.add(fFigureDryerCurrent_fractionFigure);

			fFigureDryerImpedance_fractionFigure = new WrappingLabel();
			fFigureDryerImpedance_fractionFigure.setText("<...>");

			this.add(fFigureDryerImpedance_fractionFigure);

			fFigureDryerPower_fractionFigure = new WrappingLabel();
			fFigureDryerPower_fractionFigure.setText("<...>");

			this.add(fFigureDryerPower_fractionFigure);

			fFigureDryerPower_factorFigure = new WrappingLabel();
			fFigureDryerPower_factorFigure.setText("<...>");

			this.add(fFigureDryerPower_factorFigure);

			fFigureDryerConstant_powerFigure = new WrappingLabel();
			fFigureDryerConstant_powerFigure.setText("<...>");

			this.add(fFigureDryerConstant_powerFigure);

			fFigureDryerConstant_currentFigure = new WrappingLabel();
			fFigureDryerConstant_currentFigure.setText("<...>");

			this.add(fFigureDryerConstant_currentFigure);

			fFigureDryerConstant_admittanceFigure = new WrappingLabel();
			fFigureDryerConstant_admittanceFigure.setText("<...>");

			this.add(fFigureDryerConstant_admittanceFigure);

			fFigureDryerVoltage_factorFigure = new WrappingLabel();
			fFigureDryerVoltage_factorFigure.setText("<...>");

			this.add(fFigureDryerVoltage_factorFigure);

			fFigureDryerConfigurationFigure = new WrappingLabel();
			fFigureDryerConfigurationFigure.setText("<...>");

			this.add(fFigureDryerConfigurationFigure);

			fFigureDryerOverrideFigure = new WrappingLabel();
			fFigureDryerOverrideFigure.setText("<...>");

			this.add(fFigureDryerOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerNameFigure() {
			return fFigureDryerNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerMotor_powerFigure() {
			return fFigureDryerMotor_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerCoil_powerFigure() {
			return fFigureDryerCoil_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerCircuit_splitFigure() {
			return fFigureDryerCircuit_splitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerDemandFigure() {
			return fFigureDryerDemandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerQueueFigure() {
			return fFigureDryerQueueFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerStall_voltageFigure() {
			return fFigureDryerStall_voltageFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerStart_voltageFigure() {
			return fFigureDryerStart_voltageFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerStall_impedanceFigure() {
			return fFigureDryerStall_impedanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerTrip_delayFigure() {
			return fFigureDryerTrip_delayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerReset_delayFigure() {
			return fFigureDryerReset_delayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerStateFigure() {
			return fFigureDryerStateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerShapeFigure() {
			return fFigureDryerShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerLoadFigure() {
			return fFigureDryerLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerEnergyFigure() {
			return fFigureDryerEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerPowerFigure() {
			return fFigureDryerPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerPeak_demandFigure() {
			return fFigureDryerPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerHeatgainFigure() {
			return fFigureDryerHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerHeatgain_fractionFigure() {
			return fFigureDryerHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerCurrent_fractionFigure() {
			return fFigureDryerCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerImpedance_fractionFigure() {
			return fFigureDryerImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerPower_fractionFigure() {
			return fFigureDryerPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerPower_factorFigure() {
			return fFigureDryerPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerConstant_powerFigure() {
			return fFigureDryerConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerConstant_currentFigure() {
			return fFigureDryerConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerConstant_admittanceFigure() {
			return fFigureDryerConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerVoltage_factorFigure() {
			return fFigureDryerVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerConfigurationFigure() {
			return fFigureDryerConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDryerOverrideFigure() {
			return fFigureDryerOverrideFigure;
		}

	}

}
