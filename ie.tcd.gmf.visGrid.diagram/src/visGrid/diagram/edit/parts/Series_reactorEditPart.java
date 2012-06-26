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
public class Series_reactorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2072;

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
	public Series_reactorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Series_reactorItemSemanticEditPolicy());
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
		return primaryShape = new Series_reactorFigure();
	}

	/**
	 * @generated
	 */
	public Series_reactorFigure getPrimaryShape() {
		return (Series_reactorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Series_reactorNameEditPart) {
			((visGrid.diagram.edit.parts.Series_reactorNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSeries_reactorNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Series_reactorNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Series_reactorNameEditPart.VISUAL_ID));
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
	public class Series_reactorFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_A_impedanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_A_resistanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_A_reactanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_B_impedanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_B_resistanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_B_reactanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_C_impedanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_C_resistanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_C_reactanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorRated_current_limitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorStatusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorFromFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorToFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_inFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_outFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_lossesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_in_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_in_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_in_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_out_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_out_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_out_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_losses_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_losses_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_losses_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorFlow_directionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorNominal_voltageFigure;

		/**
		 * @generated
		 */
		public Series_reactorFigure() {

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

			fFigureSeries_reactorNameFigure = new WrappingLabel();
			fFigureSeries_reactorNameFigure.setText("<...>");

			this.add(fFigureSeries_reactorNameFigure);

			fFigureSeries_reactorPhase_A_impedanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_A_impedanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_A_impedanceFigure);

			fFigureSeries_reactorPhase_A_resistanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_A_resistanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_A_resistanceFigure);

			fFigureSeries_reactorPhase_A_reactanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_A_reactanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_A_reactanceFigure);

			fFigureSeries_reactorPhase_B_impedanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_B_impedanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_B_impedanceFigure);

			fFigureSeries_reactorPhase_B_resistanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_B_resistanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_B_resistanceFigure);

			fFigureSeries_reactorPhase_B_reactanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_B_reactanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_B_reactanceFigure);

			fFigureSeries_reactorPhase_C_impedanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_C_impedanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_C_impedanceFigure);

			fFigureSeries_reactorPhase_C_resistanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_C_resistanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_C_resistanceFigure);

			fFigureSeries_reactorPhase_C_reactanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_C_reactanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_C_reactanceFigure);

			fFigureSeries_reactorRated_current_limitFigure = new WrappingLabel();
			fFigureSeries_reactorRated_current_limitFigure.setText("<...>");

			this.add(fFigureSeries_reactorRated_current_limitFigure);

			fFigureSeries_reactorStatusFigure = new WrappingLabel();
			fFigureSeries_reactorStatusFigure.setText("<...>");

			this.add(fFigureSeries_reactorStatusFigure);

			fFigureSeries_reactorFromFigure = new WrappingLabel();
			fFigureSeries_reactorFromFigure.setText("<...>");

			this.add(fFigureSeries_reactorFromFigure);

			fFigureSeries_reactorToFigure = new WrappingLabel();
			fFigureSeries_reactorToFigure.setText("<...>");

			this.add(fFigureSeries_reactorToFigure);

			fFigureSeries_reactorPower_inFigure = new WrappingLabel();
			fFigureSeries_reactorPower_inFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_inFigure);

			fFigureSeries_reactorPower_outFigure = new WrappingLabel();
			fFigureSeries_reactorPower_outFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_outFigure);

			fFigureSeries_reactorPower_lossesFigure = new WrappingLabel();
			fFigureSeries_reactorPower_lossesFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_lossesFigure);

			fFigureSeries_reactorPower_in_AFigure = new WrappingLabel();
			fFigureSeries_reactorPower_in_AFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_in_AFigure);

			fFigureSeries_reactorPower_in_BFigure = new WrappingLabel();
			fFigureSeries_reactorPower_in_BFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_in_BFigure);

			fFigureSeries_reactorPower_in_CFigure = new WrappingLabel();
			fFigureSeries_reactorPower_in_CFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_in_CFigure);

			fFigureSeries_reactorPower_out_AFigure = new WrappingLabel();
			fFigureSeries_reactorPower_out_AFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_out_AFigure);

			fFigureSeries_reactorPower_out_BFigure = new WrappingLabel();
			fFigureSeries_reactorPower_out_BFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_out_BFigure);

			fFigureSeries_reactorPower_out_CFigure = new WrappingLabel();
			fFigureSeries_reactorPower_out_CFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_out_CFigure);

			fFigureSeries_reactorPower_losses_AFigure = new WrappingLabel();
			fFigureSeries_reactorPower_losses_AFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_losses_AFigure);

			fFigureSeries_reactorPower_losses_BFigure = new WrappingLabel();
			fFigureSeries_reactorPower_losses_BFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_losses_BFigure);

			fFigureSeries_reactorPower_losses_CFigure = new WrappingLabel();
			fFigureSeries_reactorPower_losses_CFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_losses_CFigure);

			fFigureSeries_reactorFlow_directionFigure = new WrappingLabel();
			fFigureSeries_reactorFlow_directionFigure.setText("<...>");

			this.add(fFigureSeries_reactorFlow_directionFigure);

			fFigureSeries_reactorPhasesFigure = new WrappingLabel();
			fFigureSeries_reactorPhasesFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhasesFigure);

			fFigureSeries_reactorNominal_voltageFigure = new WrappingLabel();
			fFigureSeries_reactorNominal_voltageFigure.setText("<...>");

			this.add(fFigureSeries_reactorNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorNameFigure() {
			return fFigureSeries_reactorNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_A_impedanceFigure() {
			return fFigureSeries_reactorPhase_A_impedanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_A_resistanceFigure() {
			return fFigureSeries_reactorPhase_A_resistanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_A_reactanceFigure() {
			return fFigureSeries_reactorPhase_A_reactanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_B_impedanceFigure() {
			return fFigureSeries_reactorPhase_B_impedanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_B_resistanceFigure() {
			return fFigureSeries_reactorPhase_B_resistanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_B_reactanceFigure() {
			return fFigureSeries_reactorPhase_B_reactanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_C_impedanceFigure() {
			return fFigureSeries_reactorPhase_C_impedanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_C_resistanceFigure() {
			return fFigureSeries_reactorPhase_C_resistanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_C_reactanceFigure() {
			return fFigureSeries_reactorPhase_C_reactanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorRated_current_limitFigure() {
			return fFigureSeries_reactorRated_current_limitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorStatusFigure() {
			return fFigureSeries_reactorStatusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorFromFigure() {
			return fFigureSeries_reactorFromFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorToFigure() {
			return fFigureSeries_reactorToFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_inFigure() {
			return fFigureSeries_reactorPower_inFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_outFigure() {
			return fFigureSeries_reactorPower_outFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_lossesFigure() {
			return fFigureSeries_reactorPower_lossesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_in_AFigure() {
			return fFigureSeries_reactorPower_in_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_in_BFigure() {
			return fFigureSeries_reactorPower_in_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_in_CFigure() {
			return fFigureSeries_reactorPower_in_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_out_AFigure() {
			return fFigureSeries_reactorPower_out_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_out_BFigure() {
			return fFigureSeries_reactorPower_out_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_out_CFigure() {
			return fFigureSeries_reactorPower_out_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_losses_AFigure() {
			return fFigureSeries_reactorPower_losses_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_losses_BFigure() {
			return fFigureSeries_reactorPower_losses_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_losses_CFigure() {
			return fFigureSeries_reactorPower_losses_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorFlow_directionFigure() {
			return fFigureSeries_reactorFlow_directionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhasesFigure() {
			return fFigureSeries_reactorPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorNominal_voltageFigure() {
			return fFigureSeries_reactorNominal_voltageFigure;
		}

	}

}
