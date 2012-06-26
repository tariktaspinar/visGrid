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
public class Diesel_dgEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2024;

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
	public Diesel_dgEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Diesel_dgItemSemanticEditPolicy());
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
		return primaryShape = new Diesel_dgFigure();
	}

	/**
	 * @generated
	 */
	public Diesel_dgFigure getPrimaryShape() {
		return (Diesel_dgFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgNameEditPart) {
			((visGrid.diagram.edit.parts.Diesel_dgNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureDiesel_dgNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Diesel_dgNameEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Volt_var_controlEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClotheswasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LinkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HouseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RecorderEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RestorationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.House_aEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Power_electronicsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapacitorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BatteryEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Frequency_genEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_meterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlugloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LightsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PqloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_spacingEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OfficeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LoadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Regulator_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HistogramEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.AuctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MotorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ShaperEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.EvchargerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.TransformerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SubstationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OccupantloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Dc_dc_converterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ZIPloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Controller2EditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WeatherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlayerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClimateEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DryerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RegulatorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.NodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Windturb_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicroturbineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicrowaveEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.GeneratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Csv_readerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapbankEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MultizoneEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DishwasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.VoltdumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.StubauctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ControllerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RefrigeratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Fault_checkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CommEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SolarEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RectifierEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Residential_enduseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BilldumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RelayEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Energy_storageEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RangeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CollectorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Series_reactorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FreezerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FuseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MeterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SwitchEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlcEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.InverterEditPart) {
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
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2078);
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
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2078);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Diesel_dgFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgGen_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgGen_statusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgRated_kVAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgRated_kVFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgRsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgXsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgRgFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgXgFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgVoltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgVoltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgVoltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgCurrent_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgCurrent_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgCurrent_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfBFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_A_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_B_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_C_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfA_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfB_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfC_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgSlackBusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPhasesFigure;

		/**
		 * @generated
		 */
		public Diesel_dgFigure() {

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

			fFigureDiesel_dgNameFigure = new WrappingLabel();
			fFigureDiesel_dgNameFigure.setText("<...>");

			this.add(fFigureDiesel_dgNameFigure);

			fFigureDiesel_dgGen_modeFigure = new WrappingLabel();
			fFigureDiesel_dgGen_modeFigure.setText("<...>");

			this.add(fFigureDiesel_dgGen_modeFigure);

			fFigureDiesel_dgGen_statusFigure = new WrappingLabel();
			fFigureDiesel_dgGen_statusFigure.setText("<...>");

			this.add(fFigureDiesel_dgGen_statusFigure);

			fFigureDiesel_dgRated_kVAFigure = new WrappingLabel();
			fFigureDiesel_dgRated_kVAFigure.setText("<...>");

			this.add(fFigureDiesel_dgRated_kVAFigure);

			fFigureDiesel_dgRated_kVFigure = new WrappingLabel();
			fFigureDiesel_dgRated_kVFigure.setText("<...>");

			this.add(fFigureDiesel_dgRated_kVFigure);

			fFigureDiesel_dgRsFigure = new WrappingLabel();
			fFigureDiesel_dgRsFigure.setText("<...>");

			this.add(fFigureDiesel_dgRsFigure);

			fFigureDiesel_dgXsFigure = new WrappingLabel();
			fFigureDiesel_dgXsFigure.setText("<...>");

			this.add(fFigureDiesel_dgXsFigure);

			fFigureDiesel_dgRgFigure = new WrappingLabel();
			fFigureDiesel_dgRgFigure.setText("<...>");

			this.add(fFigureDiesel_dgRgFigure);

			fFigureDiesel_dgXgFigure = new WrappingLabel();
			fFigureDiesel_dgXgFigure.setText("<...>");

			this.add(fFigureDiesel_dgXgFigure);

			fFigureDiesel_dgVoltage_AFigure = new WrappingLabel();
			fFigureDiesel_dgVoltage_AFigure.setText("<...>");

			this.add(fFigureDiesel_dgVoltage_AFigure);

			fFigureDiesel_dgVoltage_BFigure = new WrappingLabel();
			fFigureDiesel_dgVoltage_BFigure.setText("<...>");

			this.add(fFigureDiesel_dgVoltage_BFigure);

			fFigureDiesel_dgVoltage_CFigure = new WrappingLabel();
			fFigureDiesel_dgVoltage_CFigure.setText("<...>");

			this.add(fFigureDiesel_dgVoltage_CFigure);

			fFigureDiesel_dgCurrent_AFigure = new WrappingLabel();
			fFigureDiesel_dgCurrent_AFigure.setText("<...>");

			this.add(fFigureDiesel_dgCurrent_AFigure);

			fFigureDiesel_dgCurrent_BFigure = new WrappingLabel();
			fFigureDiesel_dgCurrent_BFigure.setText("<...>");

			this.add(fFigureDiesel_dgCurrent_BFigure);

			fFigureDiesel_dgCurrent_CFigure = new WrappingLabel();
			fFigureDiesel_dgCurrent_CFigure.setText("<...>");

			this.add(fFigureDiesel_dgCurrent_CFigure);

			fFigureDiesel_dgEfAFigure = new WrappingLabel();
			fFigureDiesel_dgEfAFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfAFigure);

			fFigureDiesel_dgEfBFigure = new WrappingLabel();
			fFigureDiesel_dgEfBFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfBFigure);

			fFigureDiesel_dgEfCFigure = new WrappingLabel();
			fFigureDiesel_dgEfCFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfCFigure);

			fFigureDiesel_dgPower_AFigure = new WrappingLabel();
			fFigureDiesel_dgPower_AFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_AFigure);

			fFigureDiesel_dgPower_BFigure = new WrappingLabel();
			fFigureDiesel_dgPower_BFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_BFigure);

			fFigureDiesel_dgPower_CFigure = new WrappingLabel();
			fFigureDiesel_dgPower_CFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_CFigure);

			fFigureDiesel_dgPower_A_schFigure = new WrappingLabel();
			fFigureDiesel_dgPower_A_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_A_schFigure);

			fFigureDiesel_dgPower_B_schFigure = new WrappingLabel();
			fFigureDiesel_dgPower_B_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_B_schFigure);

			fFigureDiesel_dgPower_C_schFigure = new WrappingLabel();
			fFigureDiesel_dgPower_C_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_C_schFigure);

			fFigureDiesel_dgEfA_schFigure = new WrappingLabel();
			fFigureDiesel_dgEfA_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfA_schFigure);

			fFigureDiesel_dgEfB_schFigure = new WrappingLabel();
			fFigureDiesel_dgEfB_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfB_schFigure);

			fFigureDiesel_dgEfC_schFigure = new WrappingLabel();
			fFigureDiesel_dgEfC_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfC_schFigure);

			fFigureDiesel_dgSlackBusFigure = new WrappingLabel();
			fFigureDiesel_dgSlackBusFigure.setText("<...>");

			this.add(fFigureDiesel_dgSlackBusFigure);

			fFigureDiesel_dgPhasesFigure = new WrappingLabel();
			fFigureDiesel_dgPhasesFigure.setText("<...>");

			this.add(fFigureDiesel_dgPhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgNameFigure() {
			return fFigureDiesel_dgNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgGen_modeFigure() {
			return fFigureDiesel_dgGen_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgGen_statusFigure() {
			return fFigureDiesel_dgGen_statusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgRated_kVAFigure() {
			return fFigureDiesel_dgRated_kVAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgRated_kVFigure() {
			return fFigureDiesel_dgRated_kVFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgRsFigure() {
			return fFigureDiesel_dgRsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgXsFigure() {
			return fFigureDiesel_dgXsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgRgFigure() {
			return fFigureDiesel_dgRgFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgXgFigure() {
			return fFigureDiesel_dgXgFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgVoltage_AFigure() {
			return fFigureDiesel_dgVoltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgVoltage_BFigure() {
			return fFigureDiesel_dgVoltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgVoltage_CFigure() {
			return fFigureDiesel_dgVoltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgCurrent_AFigure() {
			return fFigureDiesel_dgCurrent_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgCurrent_BFigure() {
			return fFigureDiesel_dgCurrent_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgCurrent_CFigure() {
			return fFigureDiesel_dgCurrent_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfAFigure() {
			return fFigureDiesel_dgEfAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfBFigure() {
			return fFigureDiesel_dgEfBFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfCFigure() {
			return fFigureDiesel_dgEfCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_AFigure() {
			return fFigureDiesel_dgPower_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_BFigure() {
			return fFigureDiesel_dgPower_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_CFigure() {
			return fFigureDiesel_dgPower_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_A_schFigure() {
			return fFigureDiesel_dgPower_A_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_B_schFigure() {
			return fFigureDiesel_dgPower_B_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_C_schFigure() {
			return fFigureDiesel_dgPower_C_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfA_schFigure() {
			return fFigureDiesel_dgEfA_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfB_schFigure() {
			return fFigureDiesel_dgEfB_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfC_schFigure() {
			return fFigureDiesel_dgEfC_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgSlackBusFigure() {
			return fFigureDiesel_dgSlackBusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPhasesFigure() {
			return fFigureDiesel_dgPhasesFigure;
		}

	}

}
