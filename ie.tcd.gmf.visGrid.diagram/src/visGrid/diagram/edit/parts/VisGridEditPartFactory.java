package visGrid.diagram.edit.parts;
    import java.io.File;

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

			case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_meterEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_meterNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_meterNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_meterMeasured_real_energyEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_meterMeasured_real_energyEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_meterMeasured_real_powerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_meterMeasured_real_powerEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_meterMeasured_voltage_1EditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_meterMeasured_voltage_1EditPart(
						view);

			case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ClimateEditPart(view);

			case visGrid.diagram.edit.parts.ClimateNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ClimateNameEditPart(view);

			case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.DryerEditPart(view);

			case visGrid.diagram.edit.parts.DryerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.DryerNameEditPart(view);

			case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Underground_line_conductorEditPart(
						view);

			case visGrid.diagram.edit.parts.Underground_line_conductorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Underground_line_conductorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CapbankEditPart(view);

			case visGrid.diagram.edit.parts.CapbankNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CapbankNameEditPart(view);

			case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HistogramEditPart(view);

			case visGrid.diagram.edit.parts.HistogramNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HistogramNameEditPart(
						view);

			case visGrid.diagram.edit.parts.HistogramFilenameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HistogramFilenameEditPart(
						view);

			case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RelayEditPart(view);

			case visGrid.diagram.edit.parts.RelayNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RelayNameEditPart(view);

			case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BatteryEditPart(view);

			case visGrid.diagram.edit.parts.BatteryNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BatteryNameEditPart(view);

			case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.NodeEditPart(view);

			case visGrid.diagram.edit.parts.NodeNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.NodeNameEditPart(view);

			case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Overhead_line_conductorEditPart(
						view);

			case visGrid.diagram.edit.parts.Overhead_line_conductorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Overhead_line_conductorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HouseEditPart(view);

			case visGrid.diagram.edit.parts.HouseNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HouseNameEditPart(view);

			case visGrid.diagram.edit.parts.HouseAir_temperatureEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.HouseAir_temperatureEditPart(
						view);

			case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Transformer_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.Transformer_configurationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Transformer_configurationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Volt_var_controlEditPart(
						view);

			case visGrid.diagram.edit.parts.Volt_var_controlNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Volt_var_controlNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Regulator_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.Regulator_configurationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Regulator_configurationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Energy_storageEditPart(
						view);

			case visGrid.diagram.edit.parts.Energy_storageNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Energy_storageNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Csv_readerEditPart(view);

			case visGrid.diagram.edit.parts.Csv_readerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Csv_readerNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Csv_readerCity_nameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Csv_readerCity_nameEditPart(
						view);

			case visGrid.diagram.edit.parts.Csv_readerState_nameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Csv_readerState_nameEditPart(
						view);

			case visGrid.diagram.edit.parts.Csv_readerFilenameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Csv_readerFilenameEditPart(
						view);

			case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LoadEditPart(view);

			case visGrid.diagram.edit.parts.LoadNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LoadNameEditPart(view);

			case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MultizoneEditPart(view);

			case visGrid.diagram.edit.parts.MultizoneNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MultizoneNameEditPart(
						view);

			case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RefrigeratorEditPart(view);

			case visGrid.diagram.edit.parts.RefrigeratorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RefrigeratorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Series_reactorEditPart(
						view);

			case visGrid.diagram.edit.parts.Series_reactorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Series_reactorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.AuctionEditPart(view);

			case visGrid.diagram.edit.parts.AuctionNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.AuctionNameEditPart(view);

			case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LinkEditPart(view);

			case visGrid.diagram.edit.parts.LinkNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LinkNameEditPart(view);

			case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.InverterEditPart(view);

			case visGrid.diagram.edit.parts.InverterNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.InverterNameEditPart(view);

			case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PqloadEditPart(view);

			case visGrid.diagram.edit.parts.PqloadNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PqloadNameEditPart(view);

			case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlayerEditPart(view);

			case visGrid.diagram.edit.parts.PlayerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlayerNameEditPart(view);

			case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SubstationEditPart(view);

			case visGrid.diagram.edit.parts.SubstationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SubstationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MicroturbineEditPart(view);

			case visGrid.diagram.edit.parts.MicroturbineNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MicroturbineNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_nodeEditPart(view);

			case visGrid.diagram.edit.parts.Triplex_nodeNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_nodeNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_nodeVoltage_12EditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_nodeVoltage_12EditPart(
						view);

			case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.TransformerEditPart(view);

			case visGrid.diagram.edit.parts.TransformerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.TransformerNameEditPart(
						view);

			case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlugloadEditPart(view);

			case visGrid.diagram.edit.parts.PlugloadNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlugloadNameEditPart(view);

			case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Controller2EditPart(view);

			case visGrid.diagram.edit.parts.Controller2NameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Controller2NameEditPart(
						view);

			case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ClotheswasherEditPart(
						view);

			case visGrid.diagram.edit.parts.ClotheswasherNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ClotheswasherNameEditPart(
						view);

			case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.StubauctionEditPart(view);

			case visGrid.diagram.edit.parts.StubauctionNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.StubauctionNameEditPart(
						view);

			case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RectifierEditPart(view);

			case visGrid.diagram.edit.parts.RectifierNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RectifierNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Power_electronicsEditPart(
						view);

			case visGrid.diagram.edit.parts.Power_electronicsNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Power_electronicsNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Line_spacingEditPart(view);

			case visGrid.diagram.edit.parts.Line_spacingNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Line_spacingNameEditPart(
						view);

			case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MotorEditPart(view);

			case visGrid.diagram.edit.parts.MotorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MotorNameEditPart(view);

			case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.House_aEditPart(view);

			case visGrid.diagram.edit.parts.House_aNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.House_aNameEditPart(view);

			case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ControllerEditPart(view);

			case visGrid.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ControllerNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Underground_lineEditPart(
						view);

			case visGrid.diagram.edit.parts.Underground_lineNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Underground_lineNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Line_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.Line_configurationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Line_configurationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.OccupantloadEditPart(view);

			case visGrid.diagram.edit.parts.OccupantloadNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.OccupantloadNameEditPart(
						view);

			case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.EvchargerEditPart(view);

			case visGrid.diagram.edit.parts.EvchargerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.EvchargerNameEditPart(
						view);

			case visGrid.diagram.edit.parts.EvchargerStateEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.EvchargerStateEditPart(
						view);

			case visGrid.diagram.edit.parts.EvchargerChargeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.EvchargerChargeEditPart(
						view);

			case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Overhead_lineEditPart(
						view);

			case visGrid.diagram.edit.parts.Overhead_lineNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Overhead_lineNameEditPart(
						view);

			case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LineEditPart(view);

			case visGrid.diagram.edit.parts.LineNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LineNameEditPart(view);

			case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.OfficeEditPart(view);

			case visGrid.diagram.edit.parts.OfficeNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.OfficeNameEditPart(view);

			case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.WaterheaterEditPart(view);

			case visGrid.diagram.edit.parts.WaterheaterNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.WaterheaterNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Dc_dc_converterEditPart(
						view);

			case visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_lineEditPart(view);

			case visGrid.diagram.edit.parts.Triplex_lineNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_lineNameEditPart(
						view);

			case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.DishwasherEditPart(view);

			case visGrid.diagram.edit.parts.DishwasherNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.DishwasherNameEditPart(
						view);

			case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RecorderEditPart(view);

			case visGrid.diagram.edit.parts.RecorderNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RecorderNameEditPart(view);

			case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SwitchEditPart(view);

			case visGrid.diagram.edit.parts.SwitchNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SwitchNameEditPart(view);

			case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CommEditPart(view);

			case visGrid.diagram.edit.parts.CommNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CommNameEditPart(view);

			case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SolarEditPart(view);

			case visGrid.diagram.edit.parts.SolarNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.SolarNameEditPart(view);

			case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.VoltdumpEditPart(view);

			case visGrid.diagram.edit.parts.VoltdumpNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.VoltdumpNameEditPart(view);

			case visGrid.diagram.edit.parts.VoltdumpFilenameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.VoltdumpFilenameEditPart(
						view);

			case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.FreezerEditPart(view);

			case visGrid.diagram.edit.parts.FreezerNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.FreezerNameEditPart(view);

			case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Diesel_dgEditPart(view);

			case visGrid.diagram.edit.parts.Diesel_dgNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Diesel_dgNameEditPart(
						view);

			case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MeterEditPart(view);

			case visGrid.diagram.edit.parts.MeterNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MeterNameEditPart(view);

			case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ShaperEditPart(view);

			case visGrid.diagram.edit.parts.ShaperNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ShaperNameEditPart(view);

			case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_line_conductorEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_line_conductorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_line_conductorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MicrowaveEditPart(view);

			case visGrid.diagram.edit.parts.MicrowaveNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.MicrowaveNameEditPart(
						view);

			case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlcEditPart(view);

			case visGrid.diagram.edit.parts.PlcNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.PlcNameEditPart(view);

			case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Fault_checkEditPart(view);

			case visGrid.diagram.edit.parts.Fault_checkNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Fault_checkNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_line_configurationEditPart(
						view);

			case visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.FuseEditPart(view);

			case visGrid.diagram.edit.parts.FuseNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.FuseNameEditPart(view);

			case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BilldumpEditPart(view);

			case visGrid.diagram.edit.parts.BilldumpNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BilldumpNameEditPart(view);

			case visGrid.diagram.edit.parts.BilldumpFilenameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.BilldumpFilenameEditPart(
						view);

			case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Frequency_genEditPart(
						view);

			case visGrid.diagram.edit.parts.Frequency_genNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Frequency_genNameEditPart(
						view);

			case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LightsEditPart(view);

			case visGrid.diagram.edit.parts.LightsNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.LightsNameEditPart(view);

			case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Residential_enduseEditPart(
						view);

			case visGrid.diagram.edit.parts.Residential_enduseNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Residential_enduseNameEditPart(
						view);

			case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CollectorEditPart(view);

			case visGrid.diagram.edit.parts.CollectorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CollectorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.TimeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.TimeEditPart(view);

			case visGrid.diagram.edit.parts.TimeSimulatorTimeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.TimeSimulatorTimeEditPart(
						view);

			case visGrid.diagram.edit.parts.TimeRealtimeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.TimeRealtimeEditPart(view);

			case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RestorationEditPart(view);

			case visGrid.diagram.edit.parts.RestorationNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RestorationNameEditPart(
						view);

			case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ZIPloadEditPart(view);

			case visGrid.diagram.edit.parts.ZIPloadNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ZIPloadNameEditPart(view);

			case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RegulatorEditPart(view);

			case visGrid.diagram.edit.parts.RegulatorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RegulatorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.WeatherEditPart(view);

			case visGrid.diagram.edit.parts.WeatherNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.WeatherNameEditPart(view);

			case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RangeEditPart(view);

			case visGrid.diagram.edit.parts.RangeNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.RangeNameEditPart(view);

			case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.GeneratorEditPart(view);

			case visGrid.diagram.edit.parts.GeneratorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.GeneratorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CapacitorEditPart(view);

			case visGrid.diagram.edit.parts.CapacitorNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.CapacitorNameEditPart(
						view);

			case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Windturb_dgEditPart(view);

			case visGrid.diagram.edit.parts.Windturb_dgNameEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.Windturb_dgNameEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionParentEditPart(
						view);

			case visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID:
				return new visGrid.diagram.edit.parts.ConnectionConnectionsEditPart(
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
