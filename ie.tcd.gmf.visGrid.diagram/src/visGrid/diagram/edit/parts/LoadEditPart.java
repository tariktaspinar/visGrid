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
public class LoadEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2030;

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
	public LoadEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.LoadItemSemanticEditPolicy());
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
		return primaryShape = new LoadFigure();
	}

	/**
	 * @generated
	 */
	public LoadFigure getPrimaryShape() {
		return (LoadFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.LoadNameEditPart) {
			((visGrid.diagram.edit.parts.LoadNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLoadNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.LoadNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.LoadNameEditPart.VISUAL_ID));
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
	public class LoadFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadLoad_classFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_A_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_B_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_C_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_A_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_B_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_C_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_A_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_B_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_C_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_A_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_B_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_C_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_A_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_B_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_C_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_A_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_B_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_C_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_CAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadBustypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadBusflagsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadReference_busFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMaximum_voltage_errorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_CAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadCurrent_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadCurrent_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadCurrent_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadPower_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadPower_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadPower_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadShunt_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadShunt_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadShunt_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadNominal_voltageFigure;

		/**
		 * @generated
		 */
		public LoadFigure() {

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

			fFigureLoadNameFigure = new WrappingLabel();
			fFigureLoadNameFigure.setText("<...>");

			this.add(fFigureLoadNameFigure);

			fFigureLoadLoad_classFigure = new WrappingLabel();
			fFigureLoadLoad_classFigure.setText("<...>");

			this.add(fFigureLoadLoad_classFigure);

			fFigureLoadConstant_power_AFigure = new WrappingLabel();
			fFigureLoadConstant_power_AFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_AFigure);

			fFigureLoadConstant_power_BFigure = new WrappingLabel();
			fFigureLoadConstant_power_BFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_BFigure);

			fFigureLoadConstant_power_CFigure = new WrappingLabel();
			fFigureLoadConstant_power_CFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_CFigure);

			fFigureLoadConstant_power_A_realFigure = new WrappingLabel();
			fFigureLoadConstant_power_A_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_A_realFigure);

			fFigureLoadConstant_power_B_realFigure = new WrappingLabel();
			fFigureLoadConstant_power_B_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_B_realFigure);

			fFigureLoadConstant_power_C_realFigure = new WrappingLabel();
			fFigureLoadConstant_power_C_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_C_realFigure);

			fFigureLoadConstant_power_A_reacFigure = new WrappingLabel();
			fFigureLoadConstant_power_A_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_A_reacFigure);

			fFigureLoadConstant_power_B_reacFigure = new WrappingLabel();
			fFigureLoadConstant_power_B_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_B_reacFigure);

			fFigureLoadConstant_power_C_reacFigure = new WrappingLabel();
			fFigureLoadConstant_power_C_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_C_reacFigure);

			fFigureLoadConstant_current_AFigure = new WrappingLabel();
			fFigureLoadConstant_current_AFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_AFigure);

			fFigureLoadConstant_current_BFigure = new WrappingLabel();
			fFigureLoadConstant_current_BFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_BFigure);

			fFigureLoadConstant_current_CFigure = new WrappingLabel();
			fFigureLoadConstant_current_CFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_CFigure);

			fFigureLoadConstant_current_A_realFigure = new WrappingLabel();
			fFigureLoadConstant_current_A_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_A_realFigure);

			fFigureLoadConstant_current_B_realFigure = new WrappingLabel();
			fFigureLoadConstant_current_B_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_B_realFigure);

			fFigureLoadConstant_current_C_realFigure = new WrappingLabel();
			fFigureLoadConstant_current_C_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_C_realFigure);

			fFigureLoadConstant_current_A_reacFigure = new WrappingLabel();
			fFigureLoadConstant_current_A_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_A_reacFigure);

			fFigureLoadConstant_current_B_reacFigure = new WrappingLabel();
			fFigureLoadConstant_current_B_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_B_reacFigure);

			fFigureLoadConstant_current_C_reacFigure = new WrappingLabel();
			fFigureLoadConstant_current_C_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_C_reacFigure);

			fFigureLoadConstant_impedance_AFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_AFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_AFigure);

			fFigureLoadConstant_impedance_BFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_BFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_BFigure);

			fFigureLoadConstant_impedance_CFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_CFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_CFigure);

			fFigureLoadConstant_impedance_A_realFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_A_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_A_realFigure);

			fFigureLoadConstant_impedance_B_realFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_B_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_B_realFigure);

			fFigureLoadConstant_impedance_C_realFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_C_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_C_realFigure);

			fFigureLoadConstant_impedance_A_reacFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_A_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_A_reacFigure);

			fFigureLoadConstant_impedance_B_reacFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_B_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_B_reacFigure);

			fFigureLoadConstant_impedance_C_reacFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_C_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_C_reacFigure);

			fFigureLoadMeasured_voltage_AFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_AFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_AFigure);

			fFigureLoadMeasured_voltage_BFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_BFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_BFigure);

			fFigureLoadMeasured_voltage_CFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_CFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_CFigure);

			fFigureLoadMeasured_voltage_ABFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_ABFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_ABFigure);

			fFigureLoadMeasured_voltage_BCFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_BCFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_BCFigure);

			fFigureLoadMeasured_voltage_CAFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_CAFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_CAFigure);

			fFigureLoadBustypeFigure = new WrappingLabel();
			fFigureLoadBustypeFigure.setText("<...>");

			this.add(fFigureLoadBustypeFigure);

			fFigureLoadBusflagsFigure = new WrappingLabel();
			fFigureLoadBusflagsFigure.setText("<...>");

			this.add(fFigureLoadBusflagsFigure);

			fFigureLoadReference_busFigure = new WrappingLabel();
			fFigureLoadReference_busFigure.setText("<...>");

			this.add(fFigureLoadReference_busFigure);

			fFigureLoadMaximum_voltage_errorFigure = new WrappingLabel();
			fFigureLoadMaximum_voltage_errorFigure.setText("<...>");

			this.add(fFigureLoadMaximum_voltage_errorFigure);

			fFigureLoadVoltage_AFigure = new WrappingLabel();
			fFigureLoadVoltage_AFigure.setText("<...>");

			this.add(fFigureLoadVoltage_AFigure);

			fFigureLoadVoltage_BFigure = new WrappingLabel();
			fFigureLoadVoltage_BFigure.setText("<...>");

			this.add(fFigureLoadVoltage_BFigure);

			fFigureLoadVoltage_CFigure = new WrappingLabel();
			fFigureLoadVoltage_CFigure.setText("<...>");

			this.add(fFigureLoadVoltage_CFigure);

			fFigureLoadVoltage_ABFigure = new WrappingLabel();
			fFigureLoadVoltage_ABFigure.setText("<...>");

			this.add(fFigureLoadVoltage_ABFigure);

			fFigureLoadVoltage_BCFigure = new WrappingLabel();
			fFigureLoadVoltage_BCFigure.setText("<...>");

			this.add(fFigureLoadVoltage_BCFigure);

			fFigureLoadVoltage_CAFigure = new WrappingLabel();
			fFigureLoadVoltage_CAFigure.setText("<...>");

			this.add(fFigureLoadVoltage_CAFigure);

			fFigureLoadCurrent_AFigure = new WrappingLabel();
			fFigureLoadCurrent_AFigure.setText("<...>");

			this.add(fFigureLoadCurrent_AFigure);

			fFigureLoadCurrent_BFigure = new WrappingLabel();
			fFigureLoadCurrent_BFigure.setText("<...>");

			this.add(fFigureLoadCurrent_BFigure);

			fFigureLoadCurrent_CFigure = new WrappingLabel();
			fFigureLoadCurrent_CFigure.setText("<...>");

			this.add(fFigureLoadCurrent_CFigure);

			fFigureLoadPower_AFigure = new WrappingLabel();
			fFigureLoadPower_AFigure.setText("<...>");

			this.add(fFigureLoadPower_AFigure);

			fFigureLoadPower_BFigure = new WrappingLabel();
			fFigureLoadPower_BFigure.setText("<...>");

			this.add(fFigureLoadPower_BFigure);

			fFigureLoadPower_CFigure = new WrappingLabel();
			fFigureLoadPower_CFigure.setText("<...>");

			this.add(fFigureLoadPower_CFigure);

			fFigureLoadShunt_AFigure = new WrappingLabel();
			fFigureLoadShunt_AFigure.setText("<...>");

			this.add(fFigureLoadShunt_AFigure);

			fFigureLoadShunt_BFigure = new WrappingLabel();
			fFigureLoadShunt_BFigure.setText("<...>");

			this.add(fFigureLoadShunt_BFigure);

			fFigureLoadShunt_CFigure = new WrappingLabel();
			fFigureLoadShunt_CFigure.setText("<...>");

			this.add(fFigureLoadShunt_CFigure);

			fFigureLoadPhasesFigure = new WrappingLabel();
			fFigureLoadPhasesFigure.setText("<...>");

			this.add(fFigureLoadPhasesFigure);

			fFigureLoadNominal_voltageFigure = new WrappingLabel();
			fFigureLoadNominal_voltageFigure.setText("<...>");

			this.add(fFigureLoadNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadNameFigure() {
			return fFigureLoadNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadLoad_classFigure() {
			return fFigureLoadLoad_classFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_AFigure() {
			return fFigureLoadConstant_power_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_BFigure() {
			return fFigureLoadConstant_power_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_CFigure() {
			return fFigureLoadConstant_power_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_A_realFigure() {
			return fFigureLoadConstant_power_A_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_B_realFigure() {
			return fFigureLoadConstant_power_B_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_C_realFigure() {
			return fFigureLoadConstant_power_C_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_A_reacFigure() {
			return fFigureLoadConstant_power_A_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_B_reacFigure() {
			return fFigureLoadConstant_power_B_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_C_reacFigure() {
			return fFigureLoadConstant_power_C_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_AFigure() {
			return fFigureLoadConstant_current_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_BFigure() {
			return fFigureLoadConstant_current_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_CFigure() {
			return fFigureLoadConstant_current_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_A_realFigure() {
			return fFigureLoadConstant_current_A_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_B_realFigure() {
			return fFigureLoadConstant_current_B_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_C_realFigure() {
			return fFigureLoadConstant_current_C_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_A_reacFigure() {
			return fFigureLoadConstant_current_A_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_B_reacFigure() {
			return fFigureLoadConstant_current_B_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_C_reacFigure() {
			return fFigureLoadConstant_current_C_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_AFigure() {
			return fFigureLoadConstant_impedance_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_BFigure() {
			return fFigureLoadConstant_impedance_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_CFigure() {
			return fFigureLoadConstant_impedance_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_A_realFigure() {
			return fFigureLoadConstant_impedance_A_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_B_realFigure() {
			return fFigureLoadConstant_impedance_B_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_C_realFigure() {
			return fFigureLoadConstant_impedance_C_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_A_reacFigure() {
			return fFigureLoadConstant_impedance_A_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_B_reacFigure() {
			return fFigureLoadConstant_impedance_B_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_C_reacFigure() {
			return fFigureLoadConstant_impedance_C_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_AFigure() {
			return fFigureLoadMeasured_voltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_BFigure() {
			return fFigureLoadMeasured_voltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_CFigure() {
			return fFigureLoadMeasured_voltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_ABFigure() {
			return fFigureLoadMeasured_voltage_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_BCFigure() {
			return fFigureLoadMeasured_voltage_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_CAFigure() {
			return fFigureLoadMeasured_voltage_CAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadBustypeFigure() {
			return fFigureLoadBustypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadBusflagsFigure() {
			return fFigureLoadBusflagsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadReference_busFigure() {
			return fFigureLoadReference_busFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMaximum_voltage_errorFigure() {
			return fFigureLoadMaximum_voltage_errorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_AFigure() {
			return fFigureLoadVoltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_BFigure() {
			return fFigureLoadVoltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_CFigure() {
			return fFigureLoadVoltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_ABFigure() {
			return fFigureLoadVoltage_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_BCFigure() {
			return fFigureLoadVoltage_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_CAFigure() {
			return fFigureLoadVoltage_CAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadCurrent_AFigure() {
			return fFigureLoadCurrent_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadCurrent_BFigure() {
			return fFigureLoadCurrent_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadCurrent_CFigure() {
			return fFigureLoadCurrent_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadPower_AFigure() {
			return fFigureLoadPower_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadPower_BFigure() {
			return fFigureLoadPower_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadPower_CFigure() {
			return fFigureLoadPower_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadShunt_AFigure() {
			return fFigureLoadShunt_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadShunt_BFigure() {
			return fFigureLoadShunt_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadShunt_CFigure() {
			return fFigureLoadShunt_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadPhasesFigure() {
			return fFigureLoadPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadNominal_voltageFigure() {
			return fFigureLoadNominal_voltageFigure;
		}

	}

}
