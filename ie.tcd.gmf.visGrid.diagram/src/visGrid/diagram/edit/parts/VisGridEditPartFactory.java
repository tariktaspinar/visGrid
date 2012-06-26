package visGrid.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class VisGridEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(view)) {

			case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.GridEditPart(view);

			case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ClimateEditPart(view);

			case visGrid.diagram.edit.parts.ClimateNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ClimateNameEditPart(view);

			case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MeterEditPart(view);

			case visGrid.diagram.edit.parts.MeterNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MeterNameEditPart(view);

			case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Line_spacingEditPart(view);

			case visGrid.diagram.edit.parts.Line_spacingNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Line_spacingNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Overhead_line_conductorEditPart(
						view);

			case visGrid.diagram.edit.parts.Overhead_line_conductorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Overhead_line_conductorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RegulatorEditPart(view);

			case visGrid.diagram.edit.parts.RegulatorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RegulatorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ControllerEditPart(view);

			case visGrid.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ControllerNameEditPart(
						view);

			case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.NodeEditPart(view);

			case visGrid.diagram.edit.parts.NodeNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.NodeNameEditPart(view);

			case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RectifierEditPart(view);

			case visGrid.diagram.edit.parts.RectifierNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RectifierNameEditPart(
						view);

			case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RelayEditPart(view);

			case visGrid.diagram.edit.parts.RelayNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RelayNameEditPart(view);

			case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Regulator_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.Regulator_configurationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Regulator_configurationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PqloadEditPart(view);

			case visGrid.diagram.edit.parts.PqloadNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PqloadNameEditPart(view);

			case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HouseEditPart(view);

			case visGrid.diagram.edit.parts.HouseNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HouseNameEditPart(view);

			case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Residential_enduseEditPart(
						view);

			case visGrid.diagram.edit.parts.Residential_enduseNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Residential_enduseNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Energy_storageEditPart(
						view);

			case visGrid.diagram.edit.parts.Energy_storageNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Energy_storageNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Controller2EditPart(view);

			case visGrid.diagram.edit.parts.Controller2NameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Controller2NameEditPart(
						view);

			case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BilldumpEditPart(view);

			case visGrid.diagram.edit.parts.BilldumpNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BilldumpNameEditPart(view);

			case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CapbankEditPart(view);

			case visGrid.diagram.edit.parts.CapbankNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CapbankNameEditPart(view);

			case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlayerEditPart(view);

			case visGrid.diagram.edit.parts.PlayerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlayerNameEditPart(view);

			case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Dc_dc_converterEditPart(
						view);

			case visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart(
						view);

			case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.StubauctionEditPart(view);

			case visGrid.diagram.edit.parts.StubauctionNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.StubauctionNameEditPart(
						view);

			case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LineEditPart(view);

			case visGrid.diagram.edit.parts.LineNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LineNameEditPart(view);

			case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RangeEditPart(view);

			case visGrid.diagram.edit.parts.RangeNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RangeNameEditPart(view);

			case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CapacitorEditPart(view);

			case visGrid.diagram.edit.parts.CapacitorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CapacitorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MicroturbineEditPart(view);

			case visGrid.diagram.edit.parts.MicroturbineNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MicroturbineNameEditPart(
						view);

			case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.AuctionEditPart(view);

			case visGrid.diagram.edit.parts.AuctionNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.AuctionNameEditPart(view);

			case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SolarEditPart(view);

			case visGrid.diagram.edit.parts.SolarNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SolarNameEditPart(view);

			case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MultizoneEditPart(view);

			case visGrid.diagram.edit.parts.MultizoneNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MultizoneNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Line_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.Line_configurationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Line_configurationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RefrigeratorEditPart(view);

			case visGrid.diagram.edit.parts.RefrigeratorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RefrigeratorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_lineEditPart(view);

			case visGrid.diagram.edit.parts.Triplex_lineNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_lineNameEditPart(
						view);

			case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlugloadEditPart(view);

			case visGrid.diagram.edit.parts.PlugloadNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlugloadNameEditPart(view);

			case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LinkEditPart(view);

			case visGrid.diagram.edit.parts.LinkNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LinkNameEditPart(view);

			case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Power_electronicsEditPart(
						view);

			case visGrid.diagram.edit.parts.Power_electronicsNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Power_electronicsNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Overhead_lineEditPart(
						view);

			case visGrid.diagram.edit.parts.Overhead_lineNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Overhead_lineNameEditPart(
						view);

			case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.TransformerEditPart(view);

			case visGrid.diagram.edit.parts.TransformerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.TransformerNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Underground_line_conductorEditPart(
						view);

			case visGrid.diagram.edit.parts.Underground_line_conductorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Underground_line_conductorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Underground_lineEditPart(
						view);

			case visGrid.diagram.edit.parts.Underground_lineNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Underground_lineNameEditPart(
						view);

			case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.House_aEditPart(view);

			case visGrid.diagram.edit.parts.House_aNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.House_aNameEditPart(view);

			case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LightsEditPart(view);

			case visGrid.diagram.edit.parts.LightsNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LightsNameEditPart(view);

			case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RestorationEditPart(view);

			case visGrid.diagram.edit.parts.RestorationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RestorationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Series_reactorEditPart(
						view);

			case visGrid.diagram.edit.parts.Series_reactorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Series_reactorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_nodeEditPart(view);

			case visGrid.diagram.edit.parts.Triplex_nodeNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_nodeNameEditPart(
						view);

			case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LoadEditPart(view);

			case visGrid.diagram.edit.parts.LoadNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LoadNameEditPart(view);

			case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.WeatherEditPart(view);

			case visGrid.diagram.edit.parts.WeatherNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.WeatherNameEditPart(view);

			case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.InverterEditPart(view);

			case visGrid.diagram.edit.parts.InverterNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.InverterNameEditPart(view);

			case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.VoltdumpEditPart(view);

			case visGrid.diagram.edit.parts.VoltdumpNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.VoltdumpNameEditPart(view);

			case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_line_conductorEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_line_conductorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_line_conductorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SubstationEditPart(view);

			case visGrid.diagram.edit.parts.SubstationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SubstationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ClotheswasherEditPart(
						view);

			case visGrid.diagram.edit.parts.ClotheswasherNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ClotheswasherNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Frequency_genEditPart(
						view);

			case visGrid.diagram.edit.parts.Frequency_genNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Frequency_genNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Windturb_dgEditPart(view);

			case visGrid.diagram.edit.parts.Windturb_dgNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Windturb_dgNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_meterEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_meterNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_meterNameEditPart(
						view);

			case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CollectorEditPart(view);

			case visGrid.diagram.edit.parts.CollectorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CollectorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.OfficeEditPart(view);

			case visGrid.diagram.edit.parts.OfficeNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.OfficeNameEditPart(view);

			case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MicrowaveEditPart(view);

			case visGrid.diagram.edit.parts.MicrowaveNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MicrowaveNameEditPart(
						view);

			case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CommEditPart(view);

			case visGrid.diagram.edit.parts.CommNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CommNameEditPart(view);

			case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Transformer_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.Transformer_configurationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Transformer_configurationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.FreezerEditPart(view);

			case visGrid.diagram.edit.parts.FreezerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.FreezerNameEditPart(view);

			case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.EvchargerEditPart(view);

			case visGrid.diagram.edit.parts.EvchargerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.EvchargerNameEditPart(
						view);

			case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.DryerEditPart(view);

			case visGrid.diagram.edit.parts.DryerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.DryerNameEditPart(view);

			case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlcEditPart(view);

			case visGrid.diagram.edit.parts.PlcNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlcNameEditPart(view);

			case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ZIPloadEditPart(view);

			case visGrid.diagram.edit.parts.ZIPloadNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ZIPloadNameEditPart(view);

			case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Fault_checkEditPart(view);

			case visGrid.diagram.edit.parts.Fault_checkNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Fault_checkNameEditPart(
						view);

			case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RecorderEditPart(view);

			case visGrid.diagram.edit.parts.RecorderNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RecorderNameEditPart(view);

			case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.OccupantloadEditPart(view);

			case visGrid.diagram.edit.parts.OccupantloadNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.OccupantloadNameEditPart(
						view);

			case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.FuseEditPart(view);

			case visGrid.diagram.edit.parts.FuseNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.FuseNameEditPart(view);

			case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Volt_var_controlEditPart(
						view);

			case visGrid.diagram.edit.parts.Volt_var_controlNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Volt_var_controlNameEditPart(
						view);

			case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.WaterheaterEditPart(view);

			case visGrid.diagram.edit.parts.WaterheaterNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.WaterheaterNameEditPart(
						view);

			case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BatteryEditPart(view);

			case visGrid.diagram.edit.parts.BatteryNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BatteryNameEditPart(view);

			case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Csv_readerEditPart(view);

			case visGrid.diagram.edit.parts.Csv_readerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Csv_readerNameEditPart(
						view);

			case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SwitchEditPart(view);

			case visGrid.diagram.edit.parts.SwitchNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SwitchNameEditPart(view);

			case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.DishwasherEditPart(view);

			case visGrid.diagram.edit.parts.DishwasherNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.DishwasherNameEditPart(
						view);

			case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HistogramEditPart(view);

			case visGrid.diagram.edit.parts.HistogramNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HistogramNameEditPart(
						view);

			case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ShaperEditPart(view);

			case visGrid.diagram.edit.parts.ShaperNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ShaperNameEditPart(view);

			case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.GeneratorEditPart(view);

			case visGrid.diagram.edit.parts.GeneratorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.GeneratorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_line_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsEditPart(view);

			case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MotorEditPart(view);

			case visGrid.diagram.edit.parts.MotorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MotorNameEditPart(view);

			case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Diesel_dgEditPart(view);

			case visGrid.diagram.edit.parts.Diesel_dgNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Diesel_dgNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart(
						view);

			case visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsHouseEditPart(
						view);

			case visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ZIPloadConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsClimateEditPart(
						view);

			case visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Line_configurationConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SwitchConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LinkConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart(
						view);

			case visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ClimateConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CapbankConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart(
						view);

			case visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.OccupantloadConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.WaterheaterConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.NodeConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsShaperEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsPlcEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsOfficeEditPart(
						view);

			case visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MeterConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SolarConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RelayConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Csv_readerConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsAuctionEditPart(
						view);

			case visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LightsConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart(
						view);

			case visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlugloadConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart(
						view);

			case visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MicroturbineConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BilldumpConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsInverterEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsSubstationEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.TransformerConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.WeatherConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Energy_storageConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart(
						view);

			case visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.House_aConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart(
						view);

			case visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.DryerConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsPlayerEditPart(
						view);

			case visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Fault_checkConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsFuseEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsCommEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsLightsEditPart(
						view);

			case visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MultizoneConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsControllerEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsPqloadEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MotorConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart(
						view);

			case visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.InverterConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart(
						view);

			case visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SubstationConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsSolarEditPart(
						view);

			case visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PqloadConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.OfficeConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart(
						view);

			case visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HouseConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RectifierConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart(
						view);

			case visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RestorationConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BatteryConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsFreezerEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsRangeEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsRecorderEditPart(
						view);

			case visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Frequency_genConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart(
						view);

			case visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RegulatorConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ControllerConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CommConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsCollectorEditPart(
						view);

			case visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.FreezerConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsMeterEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsController2EditPart(
						view);

			case visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsDryerEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart(
						view);

			case visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.EvchargerConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsLinkEditPart(
						view);

			case visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.StubauctionConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.GeneratorConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart(
						view);

			case visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ShaperConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart(
						view);

			case visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RecorderConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart(
						view);

			case visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.DishwasherConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsRectifierEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsHistogramEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart(
						view);

			case visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart(
						view);

			case visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CollectorConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart(
						view);

			case visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsSwitchEditPart(
						view);

			case visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LoadConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsTransformerEditPart(
						view);

			case visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlayerConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlcConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Controller2ConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsLineEditPart(
						view);

			case visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HistogramConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Line_spacingConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart(
						view);

			case visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.VoltdumpConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CapacitorConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart(
						view);

			case visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Series_reactorConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsNodeEditPart(
						view);

			case visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart(
						view);

			case visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LineConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.AuctionConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MicrowaveConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsLoadEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsRestorationEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsMotorEditPart(
						view);

			case visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsWeatherEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsBatteryEditPart(
						view);

			case visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Underground_lineConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart(
						view);

			case visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RangeConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsCapbankEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart(
						view);

			case visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.FuseConnectionEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsRelayEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
