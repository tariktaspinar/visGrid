package visGrid.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class VisGridPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createVisGrid1Group());
	}

	/**
	 * Creates "visGrid" palette tool group
	 * @generated
	 */
	private PaletteContainer createVisGrid1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				visGrid.diagram.part.Messages.VisGrid1Group_title);
		paletteContainer.setId("createVisGrid1Group"); //$NON-NLS-1$
		paletteContainer.add(createClimate1CreationTool());
		paletteContainer.add(createCsv_reader2CreationTool());
		paletteContainer.add(createEnergy_storage3CreationTool());
		paletteContainer.add(createInverter4CreationTool());
		paletteContainer.add(createDc_dc_converter5CreationTool());
		paletteContainer.add(createAuction6CreationTool());
		paletteContainer.add(createController7CreationTool());
		paletteContainer.add(createController28CreationTool());
		paletteContainer.add(createCapbank9CreationTool());
		paletteContainer.add(createComm10CreationTool());
		paletteContainer.add(createCapacitor11CreationTool());
		paletteContainer.add(createLine12CreationTool());
		paletteContainer.add(createLine_spacing13CreationTool());
		paletteContainer.add(createOverhead_line14CreationTool());
		paletteContainer.add(createUnderground_line15CreationTool());
		paletteContainer.add(createOverhead_line_conductor16CreationTool());
		paletteContainer.add(createUnderground_line_conductor17CreationTool());
		paletteContainer.add(createLine_configuration18CreationTool());
		paletteContainer.add(createTransformer_configuration19CreationTool());
		paletteContainer.add(createLoad20CreationTool());
		paletteContainer.add(createRegulator_configuration21CreationTool());
		paletteContainer.add(createTriplex_node22CreationTool());
		paletteContainer.add(createTriplex_meter23CreationTool());
		paletteContainer.add(createTriplex_line24CreationTool());
		paletteContainer.add(createTriplex_line_configuration25CreationTool());
		paletteContainer.add(createTriplex_line_conductor26CreationTool());
		paletteContainer.add(createSwitch27CreationTool());
		paletteContainer.add(createSubstation28CreationTool());
		paletteContainer.add(createPqload29CreationTool());
		paletteContainer.add(createVoltdump30CreationTool());
		paletteContainer.add(createSeries_reactor31CreationTool());
		paletteContainer.add(createRestoration32CreationTool());
		paletteContainer.add(createFrequency_gen33CreationTool());
		paletteContainer.add(createVolt_var_control34CreationTool());
		paletteContainer.add(createFault_check35CreationTool());
		paletteContainer.add(createMotor36CreationTool());
		paletteContainer.add(createBilldump37CreationTool());
		paletteContainer.add(createResidential_enduse38CreationTool());
		paletteContainer.add(createHouse_a39CreationTool());
		paletteContainer.add(createHouse40CreationTool());
		paletteContainer.add(createWaterheater41CreationTool());
		paletteContainer.add(createLights42CreationTool());
		paletteContainer.add(createRefrigerator43CreationTool());
		paletteContainer.add(createClotheswasher44CreationTool());
		paletteContainer.add(createDishwasher45CreationTool());
		paletteContainer.add(createOccupantload46CreationTool());
		paletteContainer.add(createPlugload47CreationTool());
		paletteContainer.add(createMicrowave48CreationTool());
		paletteContainer.add(createRange49CreationTool());
		paletteContainer.add(createFreezer50CreationTool());
		paletteContainer.add(createDryer51CreationTool());
		paletteContainer.add(createEvcharger52CreationTool());
		paletteContainer.add(createZIPload53CreationTool());
		paletteContainer.add(createPlayer54CreationTool());
		paletteContainer.add(createShaper55CreationTool());
		paletteContainer.add(createRecorder56CreationTool());
		paletteContainer.add(createCollector57CreationTool());
		paletteContainer.add(createHistogram58CreationTool());
		paletteContainer.add(createWeather59CreationTool());
		paletteContainer.add(createOffice60CreationTool());
		paletteContainer.add(createMultizone61CreationTool());
		paletteContainer.add(createWindturb_dg62CreationTool());
		paletteContainer.add(createPower_electronics63CreationTool());
		paletteContainer.add(createRectifier64CreationTool());
		paletteContainer.add(createMicroturbine65CreationTool());
		paletteContainer.add(createBattery66CreationTool());
		paletteContainer.add(createSolar67CreationTool());
		paletteContainer.add(createStubauction68CreationTool());
		paletteContainer.add(createLink69CreationTool());
		paletteContainer.add(createFuse70CreationTool());
		paletteContainer.add(createRelay71CreationTool());
		paletteContainer.add(createRegulator72CreationTool());
		paletteContainer.add(createTransformer73CreationTool());
		paletteContainer.add(createMeter74CreationTool());
		paletteContainer.add(createGenerator75CreationTool());
		paletteContainer.add(createPlc76CreationTool());
		paletteContainer.add(createNode77CreationTool());
		paletteContainer.add(createConnection78CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClimate1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Climate1CreationTool_title,
				visGrid.diagram.part.Messages.Climate1CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2001));
		entry.setId("createClimate1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCsv_reader2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Csv_reader2CreationTool_title,
				visGrid.diagram.part.Messages.Csv_reader2CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2002));
		entry.setId("createCsv_reader2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnergy_storage3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Energy_storage3CreationTool_title,
				visGrid.diagram.part.Messages.Energy_storage3CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2003));
		entry.setId("createEnergy_storage3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInverter4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Inverter4CreationTool_title,
				visGrid.diagram.part.Messages.Inverter4CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Multizone_2004));
		entry.setId("createInverter4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Multizone_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDc_dc_converter5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Dc_dc_converter5CreationTool_title,
				visGrid.diagram.part.Messages.Dc_dc_converter5CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Histogram_2005));
		entry.setId("createDc_dc_converter5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Histogram_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAuction6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Auction6CreationTool_title,
				visGrid.diagram.part.Messages.Auction6CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Generator_2006));
		entry.setId("createAuction6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Generator_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Controller7CreationTool_title,
				visGrid.diagram.part.Messages.Controller7CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Office_2007));
		entry.setId("createController7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Office_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController28CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Controller28CreationTool_title,
				visGrid.diagram.part.Messages.Controller28CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Microwave_2008));
		entry.setId("createController28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Microwave_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapbank9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Capbank9CreationTool_title,
				visGrid.diagram.part.Messages.Capbank9CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2009));
		entry.setId("createCapbank9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComm10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Comm10CreationTool_title,
				visGrid.diagram.part.Messages.Comm10CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Recorder_2010));
		entry.setId("createComm10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Recorder_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapacitor11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Capacitor11CreationTool_title,
				visGrid.diagram.part.Messages.Capacitor11CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Controller_2011));
		entry.setId("createCapacitor11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Controller_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line12CreationTool_title,
				visGrid.diagram.part.Messages.Line12CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Range_2012));
		entry.setId("createLine12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Range_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine_spacing13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line_spacing13CreationTool_title,
				visGrid.diagram.part.Messages.Line_spacing13CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2013));
		entry.setId("createLine_spacing13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOverhead_line14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Overhead_line14CreationTool_title,
				visGrid.diagram.part.Messages.Overhead_line14CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2014));
		entry.setId("createOverhead_line14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnderground_line15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Underground_line15CreationTool_title,
				visGrid.diagram.part.Messages.Underground_line15CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.House_2015));
		entry.setId("createUnderground_line15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.House_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOverhead_line_conductor16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Overhead_line_conductor16CreationTool_title,
				visGrid.diagram.part.Messages.Overhead_line_conductor16CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2016));
		entry.setId("createOverhead_line_conductor16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnderground_line_conductor17CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Underground_line_conductor17CreationTool_title,
				visGrid.diagram.part.Messages.Underground_line_conductor17CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2017));
		entry.setId("createUnderground_line_conductor17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine_configuration18CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line_configuration18CreationTool_title,
				visGrid.diagram.part.Messages.Line_configuration18CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2018));
		entry.setId("createLine_configuration18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer_configuration19CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Transformer_configuration19CreationTool_title,
				visGrid.diagram.part.Messages.Transformer_configuration19CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Relay_2019));
		entry.setId("createTransformer_configuration19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Relay_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoad20CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Load20CreationTool_title,
				visGrid.diagram.part.Messages.Load20CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2020));
		entry.setId("createLoad20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegulator_configuration21CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Regulator_configuration21CreationTool_title,
				visGrid.diagram.part.Messages.Regulator_configuration21CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2021));
		entry.setId("createRegulator_configuration21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_node22CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_node22CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_node22CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Transformer_2022));
		entry.setId("createTriplex_node22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Transformer_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_meter23CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_meter23CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_meter23CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Solar_2023));
		entry.setId("createTriplex_meter23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Solar_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line24CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_line24CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line24CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2024));
		entry.setId("createTriplex_line24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line_configuration25CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_line_configuration25CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line_configuration25CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2025));
		entry.setId("createTriplex_line_configuration25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line_conductor26CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_line_conductor26CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line_conductor26CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2026));
		entry.setId("createTriplex_line_conductor26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitch27CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Switch27CreationTool_title,
				visGrid.diagram.part.Messages.Switch27CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2027));
		entry.setId("createSwitch27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubstation28CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Substation28CreationTool_title,
				visGrid.diagram.part.Messages.Substation28CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Freezer_2028));
		entry.setId("createSubstation28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Freezer_2028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPqload29CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Pqload29CreationTool_title,
				visGrid.diagram.part.Messages.Pqload29CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Lights_2029));
		entry.setId("createPqload29CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Lights_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVoltdump30CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Voltdump30CreationTool_title,
				visGrid.diagram.part.Messages.Voltdump30CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Load_2030));
		entry.setId("createVoltdump30CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Load_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSeries_reactor31CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Series_reactor31CreationTool_title,
				visGrid.diagram.part.Messages.Series_reactor31CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Comm_2031));
		entry.setId("createSeries_reactor31CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Comm_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRestoration32CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Restoration32CreationTool_title,
				visGrid.diagram.part.Messages.Restoration32CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Plc_2032));
		entry.setId("createRestoration32CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Plc_2032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFrequency_gen33CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Frequency_gen33CreationTool_title,
				visGrid.diagram.part.Messages.Frequency_gen33CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2033));
		entry.setId("createFrequency_gen33CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVolt_var_control34CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Volt_var_control34CreationTool_title,
				visGrid.diagram.part.Messages.Volt_var_control34CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Plugload_2034));
		entry.setId("createVolt_var_control34CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Plugload_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFault_check35CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Fault_check35CreationTool_title,
				visGrid.diagram.part.Messages.Fault_check35CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Meter_2035));
		entry.setId("createFault_check35CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Meter_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMotor36CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Motor36CreationTool_title,
				visGrid.diagram.part.Messages.Motor36CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Auction_2036));
		entry.setId("createMotor36CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Auction_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBilldump37CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Billdump37CreationTool_title,
				visGrid.diagram.part.Messages.Billdump37CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2037));
		entry.setId("createBilldump37CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResidential_enduse38CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Residential_enduse38CreationTool_title,
				visGrid.diagram.part.Messages.Residential_enduse38CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Billdump_2038));
		entry.setId("createResidential_enduse38CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Billdump_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse_a39CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.House_a39CreationTool_title,
				visGrid.diagram.part.Messages.House_a39CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2039));
		entry.setId("createHouse_a39CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse40CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.House40CreationTool_title,
				visGrid.diagram.part.Messages.House40CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Restoration_2040));
		entry.setId("createHouse40CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Restoration_2040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWaterheater41CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Waterheater41CreationTool_title,
				visGrid.diagram.part.Messages.Waterheater41CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Inverter_2041));
		entry.setId("createWaterheater41CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Inverter_2041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLights42CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Lights42CreationTool_title,
				visGrid.diagram.part.Messages.Lights42CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.House_a_2042));
		entry.setId("createLights42CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.House_a_2042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefrigerator43CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Refrigerator43CreationTool_title,
				visGrid.diagram.part.Messages.Refrigerator43CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2043));
		entry.setId("createRefrigerator43CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClotheswasher44CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Clotheswasher44CreationTool_title,
				visGrid.diagram.part.Messages.Clotheswasher44CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Shaper_2044));
		entry.setId("createClotheswasher44CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Shaper_2044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDishwasher45CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Dishwasher45CreationTool_title,
				visGrid.diagram.part.Messages.Dishwasher45CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Pqload_2045));
		entry.setId("createDishwasher45CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Pqload_2045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOccupantload46CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Occupantload46CreationTool_title,
				visGrid.diagram.part.Messages.Occupantload46CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2046));
		entry.setId("createOccupantload46CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlugload47CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Plugload47CreationTool_title,
				visGrid.diagram.part.Messages.Plugload47CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2047));
		entry.setId("createPlugload47CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMicrowave48CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Microwave48CreationTool_title,
				visGrid.diagram.part.Messages.Microwave48CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Capbank_2048));
		entry.setId("createMicrowave48CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Capbank_2048));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRange49CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Range49CreationTool_title,
				visGrid.diagram.part.Messages.Range49CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Fuse_2049));
		entry.setId("createRange49CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Fuse_2049));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFreezer50CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Freezer50CreationTool_title,
				visGrid.diagram.part.Messages.Freezer50CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Substation_2050));
		entry.setId("createFreezer50CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Substation_2050));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDryer51CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Dryer51CreationTool_title,
				visGrid.diagram.part.Messages.Dryer51CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2051));
		entry.setId("createDryer51CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvcharger52CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Evcharger52CreationTool_title,
				visGrid.diagram.part.Messages.Evcharger52CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Controller2_2052));
		entry.setId("createEvcharger52CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Controller2_2052));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createZIPload53CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ZIPload53CreationTool_title,
				visGrid.diagram.part.Messages.ZIPload53CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Motor_2053));
		entry.setId("createZIPload53CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Motor_2053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlayer54CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Player54CreationTool_title,
				visGrid.diagram.part.Messages.Player54CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Switch_2054));
		entry.setId("createPlayer54CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Switch_2054));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShaper55CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Shaper55CreationTool_title,
				visGrid.diagram.part.Messages.Shaper55CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_2055));
		entry.setId("createShaper55CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_2055));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecorder56CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Recorder56CreationTool_title,
				visGrid.diagram.part.Messages.Recorder56CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056));
		entry.setId("createRecorder56CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollector57CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Collector57CreationTool_title,
				visGrid.diagram.part.Messages.Collector57CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Climate_2057));
		entry.setId("createCollector57CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Climate_2057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHistogram58CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Histogram58CreationTool_title,
				visGrid.diagram.part.Messages.Histogram58CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2058));
		entry.setId("createHistogram58CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeather59CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Weather59CreationTool_title,
				visGrid.diagram.part.Messages.Weather59CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059));
		entry.setId("createWeather59CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOffice60CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Office60CreationTool_title,
				visGrid.diagram.part.Messages.Office60CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2060));
		entry.setId("createOffice60CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2060));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultizone61CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Multizone61CreationTool_title,
				visGrid.diagram.part.Messages.Multizone61CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Collector_2061));
		entry.setId("createMultizone61CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Collector_2061));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindturb_dg62CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Windturb_dg62CreationTool_title,
				visGrid.diagram.part.Messages.Windturb_dg62CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Link_2062));
		entry.setId("createWindturb_dg62CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Link_2062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPower_electronics63CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Power_electronics63CreationTool_title,
				visGrid.diagram.part.Messages.Power_electronics63CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2063));
		entry.setId("createPower_electronics63CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2063));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRectifier64CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Rectifier64CreationTool_title,
				visGrid.diagram.part.Messages.Rectifier64CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2064));
		entry.setId("createRectifier64CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2064));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMicroturbine65CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Microturbine65CreationTool_title,
				visGrid.diagram.part.Messages.Microturbine65CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2065));
		entry.setId("createMicroturbine65CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2065));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBattery66CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Battery66CreationTool_title,
				visGrid.diagram.part.Messages.Battery66CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Player_2066));
		entry.setId("createBattery66CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Player_2066));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolar67CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Solar67CreationTool_title,
				visGrid.diagram.part.Messages.Solar67CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2067));
		entry.setId("createSolar67CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2067));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStubauction68CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Stubauction68CreationTool_title,
				visGrid.diagram.part.Messages.Stubauction68CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Weather_2068));
		entry.setId("createStubauction68CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Weather_2068));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink69CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Link69CreationTool_title,
				visGrid.diagram.part.Messages.Link69CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2069));
		entry.setId("createLink69CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2069));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFuse70CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Fuse70CreationTool_title,
				visGrid.diagram.part.Messages.Fuse70CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2070));
		entry.setId("createFuse70CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2070));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelay71CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Relay71CreationTool_title,
				visGrid.diagram.part.Messages.Relay71CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2071));
		entry.setId("createRelay71CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2071));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegulator72CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Regulator72CreationTool_title,
				visGrid.diagram.part.Messages.Regulator72CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072));
		entry.setId("createRegulator72CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer73CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Transformer73CreationTool_title,
				visGrid.diagram.part.Messages.Transformer73CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2073));
		entry.setId("createTransformer73CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2073));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeter74CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Meter74CreationTool_title,
				visGrid.diagram.part.Messages.Meter74CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dryer_2074));
		entry.setId("createMeter74CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dryer_2074));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGenerator75CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Generator75CreationTool_title,
				visGrid.diagram.part.Messages.Generator75CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Regulator_2075));
		entry.setId("createGenerator75CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Regulator_2075));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlc76CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Plc76CreationTool_title,
				visGrid.diagram.part.Messages.Plc76CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2076));
		entry.setId("createPlc76CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2076));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode77CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Node77CreationTool_title,
				visGrid.diagram.part.Messages.Node77CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Node_2077));
		entry.setId("createNode77CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Node_2077));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection78CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Connection78CreationTool_title,
				visGrid.diagram.part.Messages.Connection78CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Battery_2078));
		entry.setId("createConnection78CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Battery_2078));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
