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
		paletteContainer.add(createConnectionConnections2CreationTool());
		paletteContainer.add(createConnectionParent3CreationTool());
		paletteContainer.add(createCsv_reader4CreationTool());
		paletteContainer.add(createConnectionConnections25CreationTool());
		paletteContainer.add(createConnectionParent26CreationTool());
		paletteContainer.add(createDiesel_dg7CreationTool());
		paletteContainer.add(createConnectionConnections38CreationTool());
		paletteContainer.add(createConnectionParent39CreationTool());
		paletteContainer.add(createEnergy_storage10CreationTool());
		paletteContainer.add(createConnectionConnections411CreationTool());
		paletteContainer.add(createConnectionParent412CreationTool());
		paletteContainer.add(createInverter13CreationTool());
		paletteContainer.add(createConnectionConnections514CreationTool());
		paletteContainer.add(createConnectionParent515CreationTool());
		paletteContainer.add(createDc_dc_converter16CreationTool());
		paletteContainer.add(createConnectionConnections617CreationTool());
		paletteContainer.add(createConnectionParent618CreationTool());
		paletteContainer.add(createAuction19CreationTool());
		paletteContainer.add(createConnectionConnections720CreationTool());
		paletteContainer.add(createConnectionParent721CreationTool());
		paletteContainer.add(createController22CreationTool());
		paletteContainer.add(createConnectionConnections823CreationTool());
		paletteContainer.add(createConnectionParent824CreationTool());
		paletteContainer.add(createController225CreationTool());
		paletteContainer.add(createConnectionConnections926CreationTool());
		paletteContainer.add(createConnectionParent927CreationTool());
		paletteContainer.add(createCapbank28CreationTool());
		paletteContainer.add(createConnectionConnections1029CreationTool());
		paletteContainer.add(createConnectionParent1030CreationTool());
		paletteContainer.add(createComm31CreationTool());
		paletteContainer.add(createConnectionConnections1132CreationTool());
		paletteContainer.add(createConnectionParent1133CreationTool());
		paletteContainer.add(createCapacitor34CreationTool());
		paletteContainer.add(createConnectionConnections1235CreationTool());
		paletteContainer.add(createConnectionParent1236CreationTool());
		paletteContainer.add(createLine37CreationTool());
		paletteContainer.add(createConnectionConnections1338CreationTool());
		paletteContainer.add(createConnectionParent1339CreationTool());
		paletteContainer.add(createLine_spacing40CreationTool());
		paletteContainer.add(createConnectionConnections1441CreationTool());
		paletteContainer.add(createConnectionParent1442CreationTool());
		paletteContainer.add(createOverhead_line43CreationTool());
		paletteContainer.add(createConnectionConnections1544CreationTool());
		paletteContainer.add(createConnectionParent1545CreationTool());
		paletteContainer.add(createUnderground_line46CreationTool());
		paletteContainer.add(createConnectionConnections1647CreationTool());
		paletteContainer.add(createConnectionParent1648CreationTool());
		paletteContainer.add(createOverhead_line_conductor49CreationTool());
		paletteContainer.add(createConnectionConnections1750CreationTool());
		paletteContainer.add(createConnectionParent1751CreationTool());
		paletteContainer.add(createUnderground_line_conductor52CreationTool());
		paletteContainer.add(createConnectionConnections1853CreationTool());
		paletteContainer.add(createConnectionParent1854CreationTool());
		paletteContainer.add(createLine_configuration55CreationTool());
		paletteContainer.add(createConnectionConnections1956CreationTool());
		paletteContainer.add(createConnectionParent1957CreationTool());
		paletteContainer.add(createTransformer_configuration58CreationTool());
		paletteContainer.add(createConnectionConnections2059CreationTool());
		paletteContainer.add(createConnectionParent2060CreationTool());
		paletteContainer.add(createLoad61CreationTool());
		paletteContainer.add(createConnectionConnections2162CreationTool());
		paletteContainer.add(createConnectionParent2163CreationTool());
		paletteContainer.add(createRegulator_configuration64CreationTool());
		paletteContainer.add(createConnectionConnections2265CreationTool());
		paletteContainer.add(createConnectionParent2266CreationTool());
		paletteContainer.add(createTriplex_node67CreationTool());
		paletteContainer.add(createConnectionConnections2368CreationTool());
		paletteContainer.add(createConnectionParent2369CreationTool());
		paletteContainer.add(createTriplex_meter70CreationTool());
		paletteContainer.add(createConnectionConnections2471CreationTool());
		paletteContainer.add(createConnectionParent2472CreationTool());
		paletteContainer.add(createTriplex_line73CreationTool());
		paletteContainer.add(createConnectionConnections2574CreationTool());
		paletteContainer.add(createConnectionParent2575CreationTool());
		paletteContainer.add(createTriplex_line_configuration76CreationTool());
		paletteContainer.add(createConnectionConnections2677CreationTool());
		paletteContainer.add(createConnectionParent2678CreationTool());
		paletteContainer.add(createTriplex_line_conductor79CreationTool());
		paletteContainer.add(createConnectionConnections2780CreationTool());
		paletteContainer.add(createConnectionParent2781CreationTool());
		paletteContainer.add(createSwitch82CreationTool());
		paletteContainer.add(createConnectionConnections2883CreationTool());
		paletteContainer.add(createConnectionParent2884CreationTool());
		paletteContainer.add(createSubstation85CreationTool());
		paletteContainer.add(createConnectionConnections2986CreationTool());
		paletteContainer.add(createConnectionParent2987CreationTool());
		paletteContainer.add(createPqload88CreationTool());
		paletteContainer.add(createConnectionConnections3089CreationTool());
		paletteContainer.add(createConnectionParent3090CreationTool());
		paletteContainer.add(createVoltdump91CreationTool());
		paletteContainer.add(createConnectionConnections3192CreationTool());
		paletteContainer.add(createConnectionParent3193CreationTool());
		paletteContainer.add(createSeries_reactor94CreationTool());
		paletteContainer.add(createConnectionConnections3295CreationTool());
		paletteContainer.add(createConnectionParent3296CreationTool());
		paletteContainer.add(createRestoration97CreationTool());
		paletteContainer.add(createConnectionConnections3398CreationTool());
		paletteContainer.add(createConnectionParent3399CreationTool());
		paletteContainer.add(createFrequency_gen100CreationTool());
		paletteContainer.add(createConnectionConnections34101CreationTool());
		paletteContainer.add(createConnectionParent34102CreationTool());
		paletteContainer.add(createVolt_var_control103CreationTool());
		paletteContainer.add(createConnectionConnections35104CreationTool());
		paletteContainer.add(createConnectionParent35105CreationTool());
		paletteContainer.add(createFault_check106CreationTool());
		paletteContainer.add(createConnectionConnections36107CreationTool());
		paletteContainer.add(createConnectionParent36108CreationTool());
		paletteContainer.add(createMotor109CreationTool());
		paletteContainer.add(createConnectionConnections37110CreationTool());
		paletteContainer.add(createConnectionParent37111CreationTool());
		paletteContainer.add(createBilldump112CreationTool());
		paletteContainer.add(createConnectionConnections38113CreationTool());
		paletteContainer.add(createConnectionParent38114CreationTool());
		paletteContainer.add(createResidential_enduse115CreationTool());
		paletteContainer.add(createConnectionConnections39116CreationTool());
		paletteContainer.add(createConnectionParent39117CreationTool());
		paletteContainer.add(createHouse_a118CreationTool());
		paletteContainer.add(createConnectionConnections40119CreationTool());
		paletteContainer.add(createConnectionParent40120CreationTool());
		paletteContainer.add(createHouse121CreationTool());
		paletteContainer.add(createConnectionConnections41122CreationTool());
		paletteContainer.add(createConnectionParent41123CreationTool());
		paletteContainer.add(createWaterheater124CreationTool());
		paletteContainer.add(createConnectionConnections42125CreationTool());
		paletteContainer.add(createConnectionParent42126CreationTool());
		paletteContainer.add(createLights127CreationTool());
		paletteContainer.add(createConnectionConnections43128CreationTool());
		paletteContainer.add(createConnectionParent43129CreationTool());
		paletteContainer.add(createRefrigerator130CreationTool());
		paletteContainer.add(createConnectionConnections44131CreationTool());
		paletteContainer.add(createConnectionParent44132CreationTool());
		paletteContainer.add(createClotheswasher133CreationTool());
		paletteContainer.add(createConnectionConnections45134CreationTool());
		paletteContainer.add(createConnectionParent45135CreationTool());
		paletteContainer.add(createDishwasher136CreationTool());
		paletteContainer.add(createConnectionConnections46137CreationTool());
		paletteContainer.add(createConnectionParent46138CreationTool());
		paletteContainer.add(createOccupantload139CreationTool());
		paletteContainer.add(createConnectionConnections47140CreationTool());
		paletteContainer.add(createConnectionParent47141CreationTool());
		paletteContainer.add(createPlugload142CreationTool());
		paletteContainer.add(createConnectionConnections48143CreationTool());
		paletteContainer.add(createConnectionParent48144CreationTool());
		paletteContainer.add(createMicrowave145CreationTool());
		paletteContainer.add(createConnectionConnections49146CreationTool());
		paletteContainer.add(createConnectionParent49147CreationTool());
		paletteContainer.add(createRange148CreationTool());
		paletteContainer.add(createConnectionConnections50149CreationTool());
		paletteContainer.add(createConnectionParent50150CreationTool());
		paletteContainer.add(createFreezer151CreationTool());
		paletteContainer.add(createConnectionConnections51152CreationTool());
		paletteContainer.add(createConnectionParent51153CreationTool());
		paletteContainer.add(createDryer154CreationTool());
		paletteContainer.add(createConnectionConnections52155CreationTool());
		paletteContainer.add(createConnectionParent52156CreationTool());
		paletteContainer.add(createEvcharger157CreationTool());
		paletteContainer.add(createConnectionConnections53158CreationTool());
		paletteContainer.add(createConnectionParent53159CreationTool());
		paletteContainer.add(createZIPload160CreationTool());
		paletteContainer.add(createConnectionConnections54161CreationTool());
		paletteContainer.add(createConnectionParent54162CreationTool());
		paletteContainer.add(createPlayer163CreationTool());
		paletteContainer.add(createConnectionConnections55164CreationTool());
		paletteContainer.add(createConnectionParent55165CreationTool());
		paletteContainer.add(createShaper166CreationTool());
		paletteContainer.add(createConnectionConnections56167CreationTool());
		paletteContainer.add(createConnectionParent56168CreationTool());
		paletteContainer.add(createRecorder169CreationTool());
		paletteContainer.add(createConnectionConnections57170CreationTool());
		paletteContainer.add(createConnectionParent57171CreationTool());
		paletteContainer.add(createCollector172CreationTool());
		paletteContainer.add(createConnectionConnections58173CreationTool());
		paletteContainer.add(createConnectionParent58174CreationTool());
		paletteContainer.add(createHistogram175CreationTool());
		paletteContainer.add(createConnectionConnections59176CreationTool());
		paletteContainer.add(createConnectionParent59177CreationTool());
		paletteContainer.add(createWeather178CreationTool());
		paletteContainer.add(createConnectionConnections60179CreationTool());
		paletteContainer.add(createConnectionParent60180CreationTool());
		paletteContainer.add(createOffice181CreationTool());
		paletteContainer.add(createConnectionConnections61182CreationTool());
		paletteContainer.add(createConnectionParent61183CreationTool());
		paletteContainer.add(createMultizone184CreationTool());
		paletteContainer.add(createConnectionConnections62185CreationTool());
		paletteContainer.add(createConnectionParent62186CreationTool());
		paletteContainer.add(createWindturb_dg187CreationTool());
		paletteContainer.add(createConnectionConnections63188CreationTool());
		paletteContainer.add(createConnectionParent63189CreationTool());
		paletteContainer.add(createPower_electronics190CreationTool());
		paletteContainer.add(createConnectionConnections64191CreationTool());
		paletteContainer.add(createConnectionParent64192CreationTool());
		paletteContainer.add(createRectifier193CreationTool());
		paletteContainer.add(createConnectionConnections65194CreationTool());
		paletteContainer.add(createConnectionParent65195CreationTool());
		paletteContainer.add(createMicroturbine196CreationTool());
		paletteContainer.add(createConnectionConnections66197CreationTool());
		paletteContainer.add(createConnectionParent66198CreationTool());
		paletteContainer.add(createBattery199CreationTool());
		paletteContainer.add(createConnectionConnections67200CreationTool());
		paletteContainer.add(createConnectionParent67201CreationTool());
		paletteContainer.add(createSolar202CreationTool());
		paletteContainer.add(createConnectionConnections68203CreationTool());
		paletteContainer.add(createConnectionParent68204CreationTool());
		paletteContainer.add(createStubauction205CreationTool());
		paletteContainer.add(createConnectionConnections69206CreationTool());
		paletteContainer.add(createConnectionParent69207CreationTool());
		paletteContainer.add(createLink208CreationTool());
		paletteContainer.add(createConnectionConnections70209CreationTool());
		paletteContainer.add(createConnectionParent70210CreationTool());
		paletteContainer.add(createFuse211CreationTool());
		paletteContainer.add(createConnectionConnections71212CreationTool());
		paletteContainer.add(createConnectionParent71213CreationTool());
		paletteContainer.add(createRelay214CreationTool());
		paletteContainer.add(createConnectionConnections72215CreationTool());
		paletteContainer.add(createConnectionParent72216CreationTool());
		paletteContainer.add(createRegulator217CreationTool());
		paletteContainer.add(createConnectionConnections73218CreationTool());
		paletteContainer.add(createConnectionParent73219CreationTool());
		paletteContainer.add(createTransformer220CreationTool());
		paletteContainer.add(createConnectionConnections74221CreationTool());
		paletteContainer.add(createConnectionParent74222CreationTool());
		paletteContainer.add(createMeter223CreationTool());
		paletteContainer.add(createConnectionConnections75224CreationTool());
		paletteContainer.add(createConnectionParent75225CreationTool());
		paletteContainer.add(createGenerator226CreationTool());
		paletteContainer.add(createConnectionConnections76227CreationTool());
		paletteContainer.add(createConnectionParent76228CreationTool());
		paletteContainer.add(createPlc229CreationTool());
		paletteContainer.add(createConnectionConnections77230CreationTool());
		paletteContainer.add(createConnectionParent77231CreationTool());
		paletteContainer.add(createNode232CreationTool());
		paletteContainer.add(createConnectionConnections78233CreationTool());
		paletteContainer.add(createConnectionParent78234CreationTool());
		paletteContainer.add(createConnection235CreationTool());
		paletteContainer.add(createConnectionConnections79236CreationTool());
		paletteContainer.add(createConnectionParent79237CreationTool());
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042));
		entry.setId("createClimate1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2077));
		entry.setId("createConnectionConnections2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2077));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent3CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent3CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2061));
		entry.setId("createConnectionParent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2061));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCsv_reader4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Csv_reader4CreationTool_title,
				visGrid.diagram.part.Messages.Csv_reader4CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2068));
		entry.setId("createCsv_reader4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2068));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections25CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections25CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections25CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Pqload_2006));
		entry.setId("createConnectionConnections25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Pqload_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent26CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent26CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent26CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dryer_2052));
		entry.setId("createConnectionParent26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dryer_2052));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiesel_dg7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Diesel_dg7CreationTool_title,
				visGrid.diagram.part.Messages.Diesel_dg7CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Shaper_2003));
		entry.setId("createDiesel_dg7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Shaper_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections38CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections38CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections38CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2045));
		entry.setId("createConnectionConnections38CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent39CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent39CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent39CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Weather_2044));
		entry.setId("createConnectionParent39CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Weather_2044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnergy_storage10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Energy_storage10CreationTool_title,
				visGrid.diagram.part.Messages.Energy_storage10CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2055));
		entry.setId("createEnergy_storage10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2055));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections411CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections411CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections411CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2078));
		entry.setId("createConnectionConnections411CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2078));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent412CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent412CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent412CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2011));
		entry.setId("createConnectionParent412CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInverter13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Inverter13CreationTool_title,
				visGrid.diagram.part.Messages.Inverter13CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2064));
		entry.setId("createInverter13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2064));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections514CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections514CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections514CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2023));
		entry.setId("createConnectionConnections514CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent515CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent515CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent515CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2030));
		entry.setId("createConnectionParent515CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDc_dc_converter16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Dc_dc_converter16CreationTool_title,
				visGrid.diagram.part.Messages.Dc_dc_converter16CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Load_2005));
		entry.setId("createDc_dc_converter16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Load_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections617CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections617CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections617CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Relay_2017));
		entry.setId("createConnectionConnections617CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Relay_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent618CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent618CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent618CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Range_2043));
		entry.setId("createConnectionParent618CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Range_2043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAuction19CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Auction19CreationTool_title,
				visGrid.diagram.part.Messages.Auction19CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2026));
		entry.setId("createAuction19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections720CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections720CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections720CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2033));
		entry.setId("createConnectionConnections720CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent721CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent721CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent721CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Collector_2021));
		entry.setId("createConnectionParent721CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Collector_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController22CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Controller22CreationTool_title,
				visGrid.diagram.part.Messages.Controller22CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2009));
		entry.setId("createController22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections823CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections823CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections823CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2032));
		entry.setId("createConnectionConnections823CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent824CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent824CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent824CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Office_2060));
		entry.setId("createConnectionParent824CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Office_2060));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController225CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Controller225CreationTool_title,
				visGrid.diagram.part.Messages.Controller225CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Regulator_2031));
		entry.setId("createController225CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Regulator_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections926CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections926CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections926CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2027));
		entry.setId("createConnectionConnections926CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent927CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent927CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent927CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2035));
		entry.setId("createConnectionParent927CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapbank28CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Capbank28CreationTool_title,
				visGrid.diagram.part.Messages.Capbank28CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2053));
		entry.setId("createCapbank28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1029CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1029CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1029CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Meter_2049));
		entry.setId("createConnectionConnections1029CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Meter_2049));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent1030CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent1030CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent1030CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Motor_2065));
		entry.setId("createConnectionParent1030CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Motor_2065));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComm31CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Comm31CreationTool_title,
				visGrid.diagram.part.Messages.Comm31CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Node_2054));
		entry.setId("createComm31CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Node_2054));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1132CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1132CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1132CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Climate_2059));
		entry.setId("createConnectionConnections1132CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Climate_2059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent1133CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent1133CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent1133CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Auction_2047));
		entry.setId("createConnectionParent1133CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Auction_2047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapacitor34CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Capacitor34CreationTool_title,
				visGrid.diagram.part.Messages.Capacitor34CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.House_2016));
		entry.setId("createCapacitor34CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.House_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1235CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1235CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1235CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2020));
		entry.setId("createConnectionConnections1235CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent1236CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent1236CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent1236CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Battery_2002));
		entry.setId("createConnectionParent1236CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Battery_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine37CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line37CreationTool_title,
				visGrid.diagram.part.Messages.Line37CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Solar_2051));
		entry.setId("createLine37CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Solar_2051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1338CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1338CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1338CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Controller_2040));
		entry.setId("createConnectionConnections1338CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Controller_2040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent1339CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent1339CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent1339CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2062));
		entry.setId("createConnectionParent1339CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine_spacing40CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line_spacing40CreationTool_title,
				visGrid.diagram.part.Messages.Line_spacing40CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2076));
		entry.setId("createLine_spacing40CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2076));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1441CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1441CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1441CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2041));
		entry.setId("createConnectionConnections1441CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent1442CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent1442CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent1442CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Recorder_2046));
		entry.setId("createConnectionParent1442CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Recorder_2046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOverhead_line43CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Overhead_line43CreationTool_title,
				visGrid.diagram.part.Messages.Overhead_line43CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Link_2004));
		entry.setId("createOverhead_line43CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Link_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1544CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1544CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1544CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2075));
		entry.setId("createConnectionConnections1544CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2075));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent1545CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent1545CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent1545CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2050));
		entry.setId("createConnectionParent1545CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2050));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnderground_line46CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Underground_line46CreationTool_title,
				visGrid.diagram.part.Messages.Underground_line46CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Plugload_2019));
		entry.setId("createUnderground_line46CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Plugload_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1647CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1647CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1647CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2022));
		entry.setId("createConnectionConnections1647CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent1648CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent1648CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent1648CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2010));
		entry.setId("createConnectionParent1648CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOverhead_line_conductor49CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Overhead_line_conductor49CreationTool_title,
				visGrid.diagram.part.Messages.Overhead_line_conductor49CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2038));
		entry.setId("createOverhead_line_conductor49CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1750CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1750CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1750CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Player_2015));
		entry.setId("createConnectionConnections1750CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Player_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent1751CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent1751CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent1751CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Histogram_2069));
		entry.setId("createConnectionParent1751CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Histogram_2069));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnderground_line_conductor52CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Underground_line_conductor52CreationTool_title,
				visGrid.diagram.part.Messages.Underground_line_conductor52CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Multizone_2066));
		entry.setId("createUnderground_line_conductor52CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Multizone_2066));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1853CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1853CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1853CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2063));
		entry.setId("createConnectionConnections1853CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2063));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent1854CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent1854CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent1854CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Inverter_2058));
		entry.setId("createConnectionParent1854CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Inverter_2058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine_configuration55CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line_configuration55CreationTool_title,
				visGrid.diagram.part.Messages.Line_configuration55CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Freezer_2014));
		entry.setId("createLine_configuration55CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Freezer_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1956CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1956CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1956CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2025));
		entry.setId("createConnectionConnections1956CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent1957CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent1957CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent1957CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2028));
		entry.setId("createConnectionParent1957CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer_configuration58CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Transformer_configuration58CreationTool_title,
				visGrid.diagram.part.Messages.Transformer_configuration58CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Capbank_2024));
		entry.setId("createTransformer_configuration58CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Capbank_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2059CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2059CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2059CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Controller2_2029));
		entry.setId("createConnectionConnections2059CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Controller2_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent2060CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent2060CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent2060CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2037));
		entry.setId("createConnectionParent2060CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoad61CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Load61CreationTool_title,
				visGrid.diagram.part.Messages.Load61CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2012));
		entry.setId("createLoad61CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2162CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2162CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2162CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2036));
		entry.setId("createConnectionConnections2162CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent2163CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent2163CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent2163CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2039));
		entry.setId("createConnectionParent2163CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegulator_configuration64CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Regulator_configuration64CreationTool_title,
				visGrid.diagram.part.Messages.Regulator_configuration64CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Switch_2071));
		entry.setId("createRegulator_configuration64CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Switch_2071));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2265CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2265CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2265CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Fuse_2057));
		entry.setId("createConnectionConnections2265CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Fuse_2057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent2266CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent2266CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent2266CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Comm_2074));
		entry.setId("createConnectionParent2266CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Comm_2074));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_node67CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_node67CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_node67CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2048));
		entry.setId("createTriplex_node67CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2048));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2368CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2368CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2368CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Microwave_2018));
		entry.setId("createConnectionConnections2368CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Microwave_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent2369CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent2369CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent2369CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Generator_2072));
		entry.setId("createConnectionParent2369CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Generator_2072));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_meter70CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_meter70CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_meter70CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Billdump_2070));
		entry.setId("createTriplex_meter70CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Billdump_2070));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2471CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2471CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2471CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Transformer_2001));
		entry.setId("createConnectionConnections2471CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Transformer_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent2472CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent2472CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent2472CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Substation_2067));
		entry.setId("createConnectionParent2472CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Substation_2067));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line73CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_line73CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line73CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Restoration_2013));
		entry.setId("createTriplex_line73CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Restoration_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2574CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2574CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2574CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_2034));
		entry.setId("createConnectionConnections2574CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent2575CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent2575CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent2575CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Plc_2073));
		entry.setId("createConnectionParent2575CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Plc_2073));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line_configuration76CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_line_configuration76CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line_configuration76CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Lights_2056));
		entry.setId("createTriplex_line_configuration76CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Lights_2056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2677CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2677CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2677CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2007));
		entry.setId("createConnectionConnections2677CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent2678CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent2678CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent2678CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.House_a_2008));
		entry.setId("createConnectionParent2678CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.House_a_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line_conductor79CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Triplex_line_conductor79CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line_conductor79CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002));
		entry.setId("createTriplex_line_conductor79CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2780CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2780CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2780CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001));
		entry.setId("createConnectionConnections2780CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent2781CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent2781CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent2781CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent2781CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitch82CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Switch82CreationTool_title,
				visGrid.diagram.part.Messages.Switch82CreationTool_desc, null,
				null) {
		};
		entry.setId("createSwitch82CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2883CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2883CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2883CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections2883CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent2884CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent2884CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent2884CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent2884CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubstation85CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Substation85CreationTool_title,
				visGrid.diagram.part.Messages.Substation85CreationTool_desc,
				null, null) {
		};
		entry.setId("createSubstation85CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2986CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2986CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2986CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections2986CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent2987CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent2987CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent2987CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent2987CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPqload88CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Pqload88CreationTool_title,
				visGrid.diagram.part.Messages.Pqload88CreationTool_desc, null,
				null) {
		};
		entry.setId("createPqload88CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3089CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3089CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3089CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections3089CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent3090CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent3090CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent3090CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent3090CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVoltdump91CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Voltdump91CreationTool_title,
				visGrid.diagram.part.Messages.Voltdump91CreationTool_desc,
				null, null) {
		};
		entry.setId("createVoltdump91CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3192CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3192CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3192CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections3192CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent3193CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent3193CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent3193CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent3193CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSeries_reactor94CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Series_reactor94CreationTool_title,
				visGrid.diagram.part.Messages.Series_reactor94CreationTool_desc,
				null, null) {
		};
		entry.setId("createSeries_reactor94CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3295CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3295CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3295CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections3295CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent3296CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent3296CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent3296CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent3296CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRestoration97CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Restoration97CreationTool_title,
				visGrid.diagram.part.Messages.Restoration97CreationTool_desc,
				null, null) {
		};
		entry.setId("createRestoration97CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3398CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3398CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3398CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections3398CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent3399CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent3399CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent3399CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent3399CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFrequency_gen100CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Frequency_gen100CreationTool_title,
				visGrid.diagram.part.Messages.Frequency_gen100CreationTool_desc,
				null, null) {
		};
		entry.setId("createFrequency_gen100CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections34101CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections34101CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections34101CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections34101CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent34102CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent34102CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent34102CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent34102CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVolt_var_control103CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Volt_var_control103CreationTool_title,
				visGrid.diagram.part.Messages.Volt_var_control103CreationTool_desc,
				null, null) {
		};
		entry.setId("createVolt_var_control103CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections35104CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections35104CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections35104CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections35104CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent35105CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent35105CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent35105CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent35105CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFault_check106CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Fault_check106CreationTool_title,
				visGrid.diagram.part.Messages.Fault_check106CreationTool_desc,
				null, null) {
		};
		entry.setId("createFault_check106CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections36107CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections36107CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections36107CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections36107CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent36108CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent36108CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent36108CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent36108CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMotor109CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Motor109CreationTool_title,
				visGrid.diagram.part.Messages.Motor109CreationTool_desc, null,
				null) {
		};
		entry.setId("createMotor109CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections37110CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections37110CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections37110CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections37110CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent37111CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent37111CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent37111CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent37111CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBilldump112CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Billdump112CreationTool_title,
				visGrid.diagram.part.Messages.Billdump112CreationTool_desc,
				null, null) {
		};
		entry.setId("createBilldump112CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections38113CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections38113CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections38113CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections38113CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent38114CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent38114CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent38114CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent38114CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResidential_enduse115CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Residential_enduse115CreationTool_title,
				visGrid.diagram.part.Messages.Residential_enduse115CreationTool_desc,
				null, null) {
		};
		entry.setId("createResidential_enduse115CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections39116CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections39116CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections39116CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections39116CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent39117CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent39117CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent39117CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent39117CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse_a118CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.House_a118CreationTool_title,
				visGrid.diagram.part.Messages.House_a118CreationTool_desc,
				null, null) {
		};
		entry.setId("createHouse_a118CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections40119CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections40119CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections40119CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections40119CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent40120CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent40120CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent40120CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent40120CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse121CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.House121CreationTool_title,
				visGrid.diagram.part.Messages.House121CreationTool_desc, null,
				null) {
		};
		entry.setId("createHouse121CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections41122CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections41122CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections41122CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections41122CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent41123CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent41123CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent41123CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent41123CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWaterheater124CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Waterheater124CreationTool_title,
				visGrid.diagram.part.Messages.Waterheater124CreationTool_desc,
				null, null) {
		};
		entry.setId("createWaterheater124CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections42125CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections42125CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections42125CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections42125CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent42126CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent42126CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent42126CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent42126CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLights127CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Lights127CreationTool_title,
				visGrid.diagram.part.Messages.Lights127CreationTool_desc, null,
				null) {
		};
		entry.setId("createLights127CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections43128CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections43128CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections43128CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections43128CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent43129CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent43129CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent43129CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent43129CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefrigerator130CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Refrigerator130CreationTool_title,
				visGrid.diagram.part.Messages.Refrigerator130CreationTool_desc,
				null, null) {
		};
		entry.setId("createRefrigerator130CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections44131CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections44131CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections44131CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections44131CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent44132CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent44132CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent44132CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent44132CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClotheswasher133CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Clotheswasher133CreationTool_title,
				visGrid.diagram.part.Messages.Clotheswasher133CreationTool_desc,
				null, null) {
		};
		entry.setId("createClotheswasher133CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections45134CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections45134CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections45134CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections45134CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent45135CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent45135CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent45135CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent45135CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDishwasher136CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Dishwasher136CreationTool_title,
				visGrid.diagram.part.Messages.Dishwasher136CreationTool_desc,
				null, null) {
		};
		entry.setId("createDishwasher136CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections46137CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections46137CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections46137CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections46137CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent46138CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent46138CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent46138CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent46138CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOccupantload139CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Occupantload139CreationTool_title,
				visGrid.diagram.part.Messages.Occupantload139CreationTool_desc,
				null, null) {
		};
		entry.setId("createOccupantload139CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections47140CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections47140CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections47140CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections47140CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent47141CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent47141CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent47141CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent47141CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlugload142CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Plugload142CreationTool_title,
				visGrid.diagram.part.Messages.Plugload142CreationTool_desc,
				null, null) {
		};
		entry.setId("createPlugload142CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections48143CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections48143CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections48143CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections48143CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent48144CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent48144CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent48144CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent48144CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMicrowave145CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Microwave145CreationTool_title,
				visGrid.diagram.part.Messages.Microwave145CreationTool_desc,
				null, null) {
		};
		entry.setId("createMicrowave145CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections49146CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections49146CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections49146CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections49146CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent49147CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent49147CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent49147CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent49147CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRange148CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Range148CreationTool_title,
				visGrid.diagram.part.Messages.Range148CreationTool_desc, null,
				null) {
		};
		entry.setId("createRange148CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections50149CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections50149CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections50149CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections50149CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent50150CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent50150CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent50150CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent50150CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFreezer151CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Freezer151CreationTool_title,
				visGrid.diagram.part.Messages.Freezer151CreationTool_desc,
				null, null) {
		};
		entry.setId("createFreezer151CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections51152CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections51152CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections51152CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections51152CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent51153CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent51153CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent51153CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent51153CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDryer154CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Dryer154CreationTool_title,
				visGrid.diagram.part.Messages.Dryer154CreationTool_desc, null,
				null) {
		};
		entry.setId("createDryer154CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections52155CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections52155CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections52155CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections52155CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent52156CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent52156CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent52156CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent52156CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvcharger157CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Evcharger157CreationTool_title,
				visGrid.diagram.part.Messages.Evcharger157CreationTool_desc,
				null, null) {
		};
		entry.setId("createEvcharger157CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections53158CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections53158CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections53158CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections53158CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent53159CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent53159CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent53159CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent53159CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createZIPload160CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ZIPload160CreationTool_title,
				visGrid.diagram.part.Messages.ZIPload160CreationTool_desc,
				null, null) {
		};
		entry.setId("createZIPload160CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections54161CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections54161CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections54161CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections54161CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent54162CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent54162CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent54162CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent54162CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlayer163CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Player163CreationTool_title,
				visGrid.diagram.part.Messages.Player163CreationTool_desc, null,
				null) {
		};
		entry.setId("createPlayer163CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections55164CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections55164CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections55164CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections55164CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent55165CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent55165CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent55165CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent55165CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShaper166CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Shaper166CreationTool_title,
				visGrid.diagram.part.Messages.Shaper166CreationTool_desc, null,
				null) {
		};
		entry.setId("createShaper166CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections56167CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections56167CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections56167CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections56167CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent56168CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent56168CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent56168CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent56168CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecorder169CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Recorder169CreationTool_title,
				visGrid.diagram.part.Messages.Recorder169CreationTool_desc,
				null, null) {
		};
		entry.setId("createRecorder169CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections57170CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections57170CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections57170CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections57170CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent57171CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent57171CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent57171CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent57171CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollector172CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Collector172CreationTool_title,
				visGrid.diagram.part.Messages.Collector172CreationTool_desc,
				null, null) {
		};
		entry.setId("createCollector172CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections58173CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections58173CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections58173CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections58173CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent58174CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent58174CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent58174CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent58174CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHistogram175CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Histogram175CreationTool_title,
				visGrid.diagram.part.Messages.Histogram175CreationTool_desc,
				null, null) {
		};
		entry.setId("createHistogram175CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections59176CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections59176CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections59176CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections59176CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent59177CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent59177CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent59177CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent59177CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeather178CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Weather178CreationTool_title,
				visGrid.diagram.part.Messages.Weather178CreationTool_desc,
				null, null) {
		};
		entry.setId("createWeather178CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections60179CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections60179CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections60179CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections60179CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent60180CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent60180CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent60180CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent60180CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOffice181CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Office181CreationTool_title,
				visGrid.diagram.part.Messages.Office181CreationTool_desc, null,
				null) {
		};
		entry.setId("createOffice181CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections61182CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections61182CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections61182CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections61182CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent61183CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent61183CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent61183CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent61183CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultizone184CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Multizone184CreationTool_title,
				visGrid.diagram.part.Messages.Multizone184CreationTool_desc,
				null, null) {
		};
		entry.setId("createMultizone184CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections62185CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections62185CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections62185CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections62185CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent62186CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent62186CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent62186CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent62186CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindturb_dg187CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Windturb_dg187CreationTool_title,
				visGrid.diagram.part.Messages.Windturb_dg187CreationTool_desc,
				null, null) {
		};
		entry.setId("createWindturb_dg187CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections63188CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections63188CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections63188CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections63188CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent63189CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent63189CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent63189CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent63189CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPower_electronics190CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Power_electronics190CreationTool_title,
				visGrid.diagram.part.Messages.Power_electronics190CreationTool_desc,
				null, null) {
		};
		entry.setId("createPower_electronics190CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections64191CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections64191CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections64191CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections64191CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent64192CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent64192CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent64192CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent64192CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRectifier193CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Rectifier193CreationTool_title,
				visGrid.diagram.part.Messages.Rectifier193CreationTool_desc,
				null, null) {
		};
		entry.setId("createRectifier193CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections65194CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections65194CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections65194CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections65194CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent65195CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent65195CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent65195CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent65195CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMicroturbine196CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Microturbine196CreationTool_title,
				visGrid.diagram.part.Messages.Microturbine196CreationTool_desc,
				null, null) {
		};
		entry.setId("createMicroturbine196CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections66197CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections66197CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections66197CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections66197CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent66198CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent66198CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent66198CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent66198CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBattery199CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Battery199CreationTool_title,
				visGrid.diagram.part.Messages.Battery199CreationTool_desc,
				null, null) {
		};
		entry.setId("createBattery199CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections67200CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections67200CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections67200CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections67200CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent67201CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent67201CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent67201CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent67201CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolar202CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Solar202CreationTool_title,
				visGrid.diagram.part.Messages.Solar202CreationTool_desc, null,
				null) {
		};
		entry.setId("createSolar202CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections68203CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections68203CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections68203CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections68203CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent68204CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent68204CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent68204CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent68204CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStubauction205CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Stubauction205CreationTool_title,
				visGrid.diagram.part.Messages.Stubauction205CreationTool_desc,
				null, null) {
		};
		entry.setId("createStubauction205CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections69206CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections69206CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections69206CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections69206CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent69207CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent69207CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent69207CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent69207CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink208CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Link208CreationTool_title,
				visGrid.diagram.part.Messages.Link208CreationTool_desc, null,
				null) {
		};
		entry.setId("createLink208CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections70209CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections70209CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections70209CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections70209CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent70210CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent70210CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent70210CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent70210CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFuse211CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Fuse211CreationTool_title,
				visGrid.diagram.part.Messages.Fuse211CreationTool_desc, null,
				null) {
		};
		entry.setId("createFuse211CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections71212CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections71212CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections71212CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections71212CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent71213CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent71213CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent71213CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent71213CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelay214CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Relay214CreationTool_title,
				visGrid.diagram.part.Messages.Relay214CreationTool_desc, null,
				null) {
		};
		entry.setId("createRelay214CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections72215CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections72215CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections72215CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections72215CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent72216CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent72216CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent72216CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent72216CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegulator217CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Regulator217CreationTool_title,
				visGrid.diagram.part.Messages.Regulator217CreationTool_desc,
				null, null) {
		};
		entry.setId("createRegulator217CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections73218CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections73218CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections73218CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections73218CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent73219CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent73219CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent73219CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent73219CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer220CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Transformer220CreationTool_title,
				visGrid.diagram.part.Messages.Transformer220CreationTool_desc,
				null, null) {
		};
		entry.setId("createTransformer220CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections74221CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections74221CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections74221CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections74221CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent74222CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent74222CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent74222CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent74222CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeter223CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Meter223CreationTool_title,
				visGrid.diagram.part.Messages.Meter223CreationTool_desc, null,
				null) {
		};
		entry.setId("createMeter223CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections75224CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections75224CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections75224CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections75224CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent75225CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent75225CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent75225CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent75225CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGenerator226CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Generator226CreationTool_title,
				visGrid.diagram.part.Messages.Generator226CreationTool_desc,
				null, null) {
		};
		entry.setId("createGenerator226CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections76227CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections76227CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections76227CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections76227CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent76228CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent76228CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent76228CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent76228CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlc229CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Plc229CreationTool_title,
				visGrid.diagram.part.Messages.Plc229CreationTool_desc, null,
				null) {
		};
		entry.setId("createPlc229CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections77230CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections77230CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections77230CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections77230CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent77231CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent77231CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent77231CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent77231CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode232CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Node232CreationTool_title,
				visGrid.diagram.part.Messages.Node232CreationTool_desc, null,
				null) {
		};
		entry.setId("createNode232CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections78233CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections78233CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections78233CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections78233CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent78234CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent78234CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent78234CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent78234CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection235CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Connection235CreationTool_title,
				visGrid.diagram.part.Messages.Connection235CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnection235CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections79236CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections79236CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections79236CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections79236CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionParent79237CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionParent79237CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionParent79237CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionParent79237CreationTool"); //$NON-NLS-1$
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
