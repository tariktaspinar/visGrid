package visGrid.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class VisGridElementTypes {

	/**
	 * @generated
	 */
	private VisGridElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Grid_1000 = getElementType("ie.tcd.gmf.visGrid.diagram.Grid_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_meter_2050 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_meter_2050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Climate_2059 = getElementType("ie.tcd.gmf.visGrid.diagram.Climate_2059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dryer_2052 = getElementType("ie.tcd.gmf.visGrid.diagram.Dryer_2052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Underground_line_conductor_2026 = getElementType("ie.tcd.gmf.visGrid.diagram.Underground_line_conductor_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capbank_2024 = getElementType("ie.tcd.gmf.visGrid.diagram.Capbank_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Histogram_2069 = getElementType("ie.tcd.gmf.visGrid.diagram.Histogram_2069"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relay_2017 = getElementType("ie.tcd.gmf.visGrid.diagram.Relay_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Battery_2002 = getElementType("ie.tcd.gmf.visGrid.diagram.Battery_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2054 = getElementType("ie.tcd.gmf.visGrid.diagram.Node_2054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Overhead_line_conductor_2039 = getElementType("ie.tcd.gmf.visGrid.diagram.Overhead_line_conductor_2039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType House_2016 = getElementType("ie.tcd.gmf.visGrid.diagram.House_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transformer_configuration_2007 = getElementType("ie.tcd.gmf.visGrid.diagram.Transformer_configuration_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Volt_var_control_2022 = getElementType("ie.tcd.gmf.visGrid.diagram.Volt_var_control_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Regulator_configuration_2009 = getElementType("ie.tcd.gmf.visGrid.diagram.Regulator_configuration_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Energy_storage_2076 = getElementType("ie.tcd.gmf.visGrid.diagram.Energy_storage_2076"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Csv_reader_2033 = getElementType("ie.tcd.gmf.visGrid.diagram.Csv_reader_2033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Load_2005 = getElementType("ie.tcd.gmf.visGrid.diagram.Load_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Multizone_2066 = getElementType("ie.tcd.gmf.visGrid.diagram.Multizone_2066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Refrigerator_2020 = getElementType("ie.tcd.gmf.visGrid.diagram.Refrigerator_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Series_reactor_2032 = getElementType("ie.tcd.gmf.visGrid.diagram.Series_reactor_2032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Auction_2047 = getElementType("ie.tcd.gmf.visGrid.diagram.Auction_2047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Link_2004 = getElementType("ie.tcd.gmf.visGrid.diagram.Link_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Inverter_2058 = getElementType("ie.tcd.gmf.visGrid.diagram.Inverter_2058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pqload_2006 = getElementType("ie.tcd.gmf.visGrid.diagram.Pqload_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Player_2015 = getElementType("ie.tcd.gmf.visGrid.diagram.Player_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Substation_2067 = getElementType("ie.tcd.gmf.visGrid.diagram.Substation_2067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Microturbine_2038 = getElementType("ie.tcd.gmf.visGrid.diagram.Microturbine_2038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_node_2042 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_node_2042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transformer_2001 = getElementType("ie.tcd.gmf.visGrid.diagram.Transformer_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Plugload_2019 = getElementType("ie.tcd.gmf.visGrid.diagram.Plugload_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Controller2_2029 = getElementType("ie.tcd.gmf.visGrid.diagram.Controller2_2029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Clotheswasher_2063 = getElementType("ie.tcd.gmf.visGrid.diagram.Clotheswasher_2063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Stubauction_2048 = getElementType("ie.tcd.gmf.visGrid.diagram.Stubauction_2048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rectifier_2075 = getElementType("ie.tcd.gmf.visGrid.diagram.Rectifier_2075"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Power_electronics_2061 = getElementType("ie.tcd.gmf.visGrid.diagram.Power_electronics_2061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Line_spacing_2025 = getElementType("ie.tcd.gmf.visGrid.diagram.Line_spacing_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Motor_2065 = getElementType("ie.tcd.gmf.visGrid.diagram.Motor_2065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType House_a_2008 = getElementType("ie.tcd.gmf.visGrid.diagram.House_a_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Controller_2040 = getElementType("ie.tcd.gmf.visGrid.diagram.Controller_2040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Underground_line_2041 = getElementType("ie.tcd.gmf.visGrid.diagram.Underground_line_2041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Line_configuration_2053 = getElementType("ie.tcd.gmf.visGrid.diagram.Line_configuration_2053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Occupantload_2037 = getElementType("ie.tcd.gmf.visGrid.diagram.Occupantload_2037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Evcharger_2012 = getElementType("ie.tcd.gmf.visGrid.diagram.Evcharger_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Overhead_line_2036 = getElementType("ie.tcd.gmf.visGrid.diagram.Overhead_line_2036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Line_2034 = getElementType("ie.tcd.gmf.visGrid.diagram.Line_2034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Office_2060 = getElementType("ie.tcd.gmf.visGrid.diagram.Office_2060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Waterheater_2062 = getElementType("ie.tcd.gmf.visGrid.diagram.Waterheater_2062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dc_dc_converter_2068 = getElementType("ie.tcd.gmf.visGrid.diagram.Dc_dc_converter_2068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_line_2027 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_line_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dishwasher_2010 = getElementType("ie.tcd.gmf.visGrid.diagram.Dishwasher_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Recorder_2046 = getElementType("ie.tcd.gmf.visGrid.diagram.Recorder_2046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Switch_2071 = getElementType("ie.tcd.gmf.visGrid.diagram.Switch_2071"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Comm_2074 = getElementType("ie.tcd.gmf.visGrid.diagram.Comm_2074"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Solar_2051 = getElementType("ie.tcd.gmf.visGrid.diagram.Solar_2051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Voltdump_2023 = getElementType("ie.tcd.gmf.visGrid.diagram.Voltdump_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Freezer_2014 = getElementType("ie.tcd.gmf.visGrid.diagram.Freezer_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Diesel_dg_2077 = getElementType("ie.tcd.gmf.visGrid.diagram.Diesel_dg_2077"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Meter_2049 = getElementType("ie.tcd.gmf.visGrid.diagram.Meter_2049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Shaper_2003 = getElementType("ie.tcd.gmf.visGrid.diagram.Shaper_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_line_conductor_2064 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_line_conductor_2064"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Microwave_2018 = getElementType("ie.tcd.gmf.visGrid.diagram.Microwave_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Plc_2073 = getElementType("ie.tcd.gmf.visGrid.diagram.Plc_2073"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fault_check_2028 = getElementType("ie.tcd.gmf.visGrid.diagram.Fault_check_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_line_configuration_2030 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_line_configuration_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fuse_2057 = getElementType("ie.tcd.gmf.visGrid.diagram.Fuse_2057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Billdump_2070 = getElementType("ie.tcd.gmf.visGrid.diagram.Billdump_2070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Frequency_gen_2035 = getElementType("ie.tcd.gmf.visGrid.diagram.Frequency_gen_2035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Lights_2056 = getElementType("ie.tcd.gmf.visGrid.diagram.Lights_2056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Residential_enduse_2011 = getElementType("ie.tcd.gmf.visGrid.diagram.Residential_enduse_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Collector_2021 = getElementType("ie.tcd.gmf.visGrid.diagram.Collector_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Time_2082 = getElementType("ie.tcd.gmf.visGrid.diagram.Time_2082"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Restoration_2013 = getElementType("ie.tcd.gmf.visGrid.diagram.Restoration_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ZIPload_2055 = getElementType("ie.tcd.gmf.visGrid.diagram.ZIPload_2055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Regulator_2031 = getElementType("ie.tcd.gmf.visGrid.diagram.Regulator_2031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Weather_2044 = getElementType("ie.tcd.gmf.visGrid.diagram.Weather_2044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Range_2043 = getElementType("ie.tcd.gmf.visGrid.diagram.Range_2043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generator_2072 = getElementType("ie.tcd.gmf.visGrid.diagram.Generator_2072"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capacitor_2045 = getElementType("ie.tcd.gmf.visGrid.diagram.Capacitor_2045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Windturb_dg_2078 = getElementType("ie.tcd.gmf.visGrid.diagram.Windturb_dg_2078"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionParent_4001 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionParent_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionConnections_4002 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionConnections_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return visGrid.diagram.part.VisGridDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Grid_1000, visGrid.VisGridPackage.eINSTANCE.getGrid());

			elements.put(Triplex_meter_2050,
					visGrid.VisGridPackage.eINSTANCE.getTriplex_meter());

			elements.put(Climate_2059,
					visGrid.VisGridPackage.eINSTANCE.getClimate());

			elements.put(Dryer_2052,
					visGrid.VisGridPackage.eINSTANCE.getDryer());

			elements.put(Underground_line_conductor_2026,
					visGrid.VisGridPackage.eINSTANCE
							.getUnderground_line_conductor());

			elements.put(Capbank_2024,
					visGrid.VisGridPackage.eINSTANCE.getCapbank());

			elements.put(Histogram_2069,
					visGrid.VisGridPackage.eINSTANCE.getHistogram());

			elements.put(Relay_2017,
					visGrid.VisGridPackage.eINSTANCE.getRelay());

			elements.put(Battery_2002,
					visGrid.VisGridPackage.eINSTANCE.getBattery());

			elements.put(Node_2054, visGrid.VisGridPackage.eINSTANCE.getNode());

			elements.put(Overhead_line_conductor_2039,
					visGrid.VisGridPackage.eINSTANCE
							.getOverhead_line_conductor());

			elements.put(House_2016,
					visGrid.VisGridPackage.eINSTANCE.getHouse());

			elements.put(Transformer_configuration_2007,
					visGrid.VisGridPackage.eINSTANCE
							.getTransformer_configuration());

			elements.put(Volt_var_control_2022,
					visGrid.VisGridPackage.eINSTANCE.getVolt_var_control());

			elements.put(Regulator_configuration_2009,
					visGrid.VisGridPackage.eINSTANCE
							.getRegulator_configuration());

			elements.put(Energy_storage_2076,
					visGrid.VisGridPackage.eINSTANCE.getEnergy_storage());

			elements.put(Csv_reader_2033,
					visGrid.VisGridPackage.eINSTANCE.getCsv_reader());

			elements.put(Load_2005, visGrid.VisGridPackage.eINSTANCE.getLoad());

			elements.put(Multizone_2066,
					visGrid.VisGridPackage.eINSTANCE.getMultizone());

			elements.put(Refrigerator_2020,
					visGrid.VisGridPackage.eINSTANCE.getRefrigerator());

			elements.put(Series_reactor_2032,
					visGrid.VisGridPackage.eINSTANCE.getSeries_reactor());

			elements.put(Auction_2047,
					visGrid.VisGridPackage.eINSTANCE.getAuction());

			elements.put(Link_2004, visGrid.VisGridPackage.eINSTANCE.getLink());

			elements.put(Inverter_2058,
					visGrid.VisGridPackage.eINSTANCE.getInverter());

			elements.put(Pqload_2006,
					visGrid.VisGridPackage.eINSTANCE.getPqload());

			elements.put(Player_2015,
					visGrid.VisGridPackage.eINSTANCE.getPlayer());

			elements.put(Substation_2067,
					visGrid.VisGridPackage.eINSTANCE.getSubstation());

			elements.put(Microturbine_2038,
					visGrid.VisGridPackage.eINSTANCE.getMicroturbine());

			elements.put(Triplex_node_2042,
					visGrid.VisGridPackage.eINSTANCE.getTriplex_node());

			elements.put(Transformer_2001,
					visGrid.VisGridPackage.eINSTANCE.getTransformer());

			elements.put(Plugload_2019,
					visGrid.VisGridPackage.eINSTANCE.getPlugload());

			elements.put(Controller2_2029,
					visGrid.VisGridPackage.eINSTANCE.getController2());

			elements.put(Clotheswasher_2063,
					visGrid.VisGridPackage.eINSTANCE.getClotheswasher());

			elements.put(Stubauction_2048,
					visGrid.VisGridPackage.eINSTANCE.getStubauction());

			elements.put(Rectifier_2075,
					visGrid.VisGridPackage.eINSTANCE.getRectifier());

			elements.put(Power_electronics_2061,
					visGrid.VisGridPackage.eINSTANCE.getPower_electronics());

			elements.put(Line_spacing_2025,
					visGrid.VisGridPackage.eINSTANCE.getLine_spacing());

			elements.put(Motor_2065,
					visGrid.VisGridPackage.eINSTANCE.getMotor());

			elements.put(House_a_2008,
					visGrid.VisGridPackage.eINSTANCE.getHouse_a());

			elements.put(Controller_2040,
					visGrid.VisGridPackage.eINSTANCE.getController());

			elements.put(Underground_line_2041,
					visGrid.VisGridPackage.eINSTANCE.getUnderground_line());

			elements.put(Line_configuration_2053,
					visGrid.VisGridPackage.eINSTANCE.getLine_configuration());

			elements.put(Occupantload_2037,
					visGrid.VisGridPackage.eINSTANCE.getOccupantload());

			elements.put(Evcharger_2012,
					visGrid.VisGridPackage.eINSTANCE.getEvcharger());

			elements.put(Overhead_line_2036,
					visGrid.VisGridPackage.eINSTANCE.getOverhead_line());

			elements.put(Line_2034, visGrid.VisGridPackage.eINSTANCE.getLine());

			elements.put(Office_2060,
					visGrid.VisGridPackage.eINSTANCE.getOffice());

			elements.put(Waterheater_2062,
					visGrid.VisGridPackage.eINSTANCE.getWaterheater());

			elements.put(Dc_dc_converter_2068,
					visGrid.VisGridPackage.eINSTANCE.getDc_dc_converter());

			elements.put(Triplex_line_2027,
					visGrid.VisGridPackage.eINSTANCE.getTriplex_line());

			elements.put(Dishwasher_2010,
					visGrid.VisGridPackage.eINSTANCE.getDishwasher());

			elements.put(Recorder_2046,
					visGrid.VisGridPackage.eINSTANCE.getRecorder());

			elements.put(Switch_2071,
					visGrid.VisGridPackage.eINSTANCE.getSwitch());

			elements.put(Comm_2074, visGrid.VisGridPackage.eINSTANCE.getComm());

			elements.put(Solar_2051,
					visGrid.VisGridPackage.eINSTANCE.getSolar());

			elements.put(Voltdump_2023,
					visGrid.VisGridPackage.eINSTANCE.getVoltdump());

			elements.put(Freezer_2014,
					visGrid.VisGridPackage.eINSTANCE.getFreezer());

			elements.put(Diesel_dg_2077,
					visGrid.VisGridPackage.eINSTANCE.getDiesel_dg());

			elements.put(Meter_2049,
					visGrid.VisGridPackage.eINSTANCE.getMeter());

			elements.put(Shaper_2003,
					visGrid.VisGridPackage.eINSTANCE.getShaper());

			elements.put(Triplex_line_conductor_2064,
					visGrid.VisGridPackage.eINSTANCE
							.getTriplex_line_conductor());

			elements.put(Microwave_2018,
					visGrid.VisGridPackage.eINSTANCE.getMicrowave());

			elements.put(Plc_2073, visGrid.VisGridPackage.eINSTANCE.getPlc());

			elements.put(Fault_check_2028,
					visGrid.VisGridPackage.eINSTANCE.getFault_check());

			elements.put(Triplex_line_configuration_2030,
					visGrid.VisGridPackage.eINSTANCE
							.getTriplex_line_configuration());

			elements.put(Fuse_2057, visGrid.VisGridPackage.eINSTANCE.getFuse());

			elements.put(Billdump_2070,
					visGrid.VisGridPackage.eINSTANCE.getBilldump());

			elements.put(Frequency_gen_2035,
					visGrid.VisGridPackage.eINSTANCE.getFrequency_gen());

			elements.put(Lights_2056,
					visGrid.VisGridPackage.eINSTANCE.getLights());

			elements.put(Residential_enduse_2011,
					visGrid.VisGridPackage.eINSTANCE.getResidential_enduse());

			elements.put(Collector_2021,
					visGrid.VisGridPackage.eINSTANCE.getCollector());

			elements.put(Time_2082, visGrid.VisGridPackage.eINSTANCE.getTime());

			elements.put(Restoration_2013,
					visGrid.VisGridPackage.eINSTANCE.getRestoration());

			elements.put(ZIPload_2055,
					visGrid.VisGridPackage.eINSTANCE.getZIPload());

			elements.put(Regulator_2031,
					visGrid.VisGridPackage.eINSTANCE.getRegulator());

			elements.put(Weather_2044,
					visGrid.VisGridPackage.eINSTANCE.getWeather());

			elements.put(Range_2043,
					visGrid.VisGridPackage.eINSTANCE.getRange());

			elements.put(Generator_2072,
					visGrid.VisGridPackage.eINSTANCE.getGenerator());

			elements.put(Capacitor_2045,
					visGrid.VisGridPackage.eINSTANCE.getCapacitor());

			elements.put(Windturb_dg_2078,
					visGrid.VisGridPackage.eINSTANCE.getWindturb_dg());

			elements.put(ConnectionParent_4001,
					visGrid.VisGridPackage.eINSTANCE.getConnection_Parent());

			elements.put(ConnectionConnections_4002,
					visGrid.VisGridPackage.eINSTANCE
							.getConnection_Connections());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Grid_1000);
			KNOWN_ELEMENT_TYPES.add(Triplex_meter_2050);
			KNOWN_ELEMENT_TYPES.add(Climate_2059);
			KNOWN_ELEMENT_TYPES.add(Dryer_2052);
			KNOWN_ELEMENT_TYPES.add(Underground_line_conductor_2026);
			KNOWN_ELEMENT_TYPES.add(Capbank_2024);
			KNOWN_ELEMENT_TYPES.add(Histogram_2069);
			KNOWN_ELEMENT_TYPES.add(Relay_2017);
			KNOWN_ELEMENT_TYPES.add(Battery_2002);
			KNOWN_ELEMENT_TYPES.add(Node_2054);
			KNOWN_ELEMENT_TYPES.add(Overhead_line_conductor_2039);
			KNOWN_ELEMENT_TYPES.add(House_2016);
			KNOWN_ELEMENT_TYPES.add(Transformer_configuration_2007);
			KNOWN_ELEMENT_TYPES.add(Volt_var_control_2022);
			KNOWN_ELEMENT_TYPES.add(Regulator_configuration_2009);
			KNOWN_ELEMENT_TYPES.add(Energy_storage_2076);
			KNOWN_ELEMENT_TYPES.add(Csv_reader_2033);
			KNOWN_ELEMENT_TYPES.add(Load_2005);
			KNOWN_ELEMENT_TYPES.add(Multizone_2066);
			KNOWN_ELEMENT_TYPES.add(Refrigerator_2020);
			KNOWN_ELEMENT_TYPES.add(Series_reactor_2032);
			KNOWN_ELEMENT_TYPES.add(Auction_2047);
			KNOWN_ELEMENT_TYPES.add(Link_2004);
			KNOWN_ELEMENT_TYPES.add(Inverter_2058);
			KNOWN_ELEMENT_TYPES.add(Pqload_2006);
			KNOWN_ELEMENT_TYPES.add(Player_2015);
			KNOWN_ELEMENT_TYPES.add(Substation_2067);
			KNOWN_ELEMENT_TYPES.add(Microturbine_2038);
			KNOWN_ELEMENT_TYPES.add(Triplex_node_2042);
			KNOWN_ELEMENT_TYPES.add(Transformer_2001);
			KNOWN_ELEMENT_TYPES.add(Plugload_2019);
			KNOWN_ELEMENT_TYPES.add(Controller2_2029);
			KNOWN_ELEMENT_TYPES.add(Clotheswasher_2063);
			KNOWN_ELEMENT_TYPES.add(Stubauction_2048);
			KNOWN_ELEMENT_TYPES.add(Rectifier_2075);
			KNOWN_ELEMENT_TYPES.add(Power_electronics_2061);
			KNOWN_ELEMENT_TYPES.add(Line_spacing_2025);
			KNOWN_ELEMENT_TYPES.add(Motor_2065);
			KNOWN_ELEMENT_TYPES.add(House_a_2008);
			KNOWN_ELEMENT_TYPES.add(Controller_2040);
			KNOWN_ELEMENT_TYPES.add(Underground_line_2041);
			KNOWN_ELEMENT_TYPES.add(Line_configuration_2053);
			KNOWN_ELEMENT_TYPES.add(Occupantload_2037);
			KNOWN_ELEMENT_TYPES.add(Evcharger_2012);
			KNOWN_ELEMENT_TYPES.add(Overhead_line_2036);
			KNOWN_ELEMENT_TYPES.add(Line_2034);
			KNOWN_ELEMENT_TYPES.add(Office_2060);
			KNOWN_ELEMENT_TYPES.add(Waterheater_2062);
			KNOWN_ELEMENT_TYPES.add(Dc_dc_converter_2068);
			KNOWN_ELEMENT_TYPES.add(Triplex_line_2027);
			KNOWN_ELEMENT_TYPES.add(Dishwasher_2010);
			KNOWN_ELEMENT_TYPES.add(Recorder_2046);
			KNOWN_ELEMENT_TYPES.add(Switch_2071);
			KNOWN_ELEMENT_TYPES.add(Comm_2074);
			KNOWN_ELEMENT_TYPES.add(Solar_2051);
			KNOWN_ELEMENT_TYPES.add(Voltdump_2023);
			KNOWN_ELEMENT_TYPES.add(Freezer_2014);
			KNOWN_ELEMENT_TYPES.add(Diesel_dg_2077);
			KNOWN_ELEMENT_TYPES.add(Meter_2049);
			KNOWN_ELEMENT_TYPES.add(Shaper_2003);
			KNOWN_ELEMENT_TYPES.add(Triplex_line_conductor_2064);
			KNOWN_ELEMENT_TYPES.add(Microwave_2018);
			KNOWN_ELEMENT_TYPES.add(Plc_2073);
			KNOWN_ELEMENT_TYPES.add(Fault_check_2028);
			KNOWN_ELEMENT_TYPES.add(Triplex_line_configuration_2030);
			KNOWN_ELEMENT_TYPES.add(Fuse_2057);
			KNOWN_ELEMENT_TYPES.add(Billdump_2070);
			KNOWN_ELEMENT_TYPES.add(Frequency_gen_2035);
			KNOWN_ELEMENT_TYPES.add(Lights_2056);
			KNOWN_ELEMENT_TYPES.add(Residential_enduse_2011);
			KNOWN_ELEMENT_TYPES.add(Collector_2021);
			KNOWN_ELEMENT_TYPES.add(Time_2082);
			KNOWN_ELEMENT_TYPES.add(Restoration_2013);
			KNOWN_ELEMENT_TYPES.add(ZIPload_2055);
			KNOWN_ELEMENT_TYPES.add(Regulator_2031);
			KNOWN_ELEMENT_TYPES.add(Weather_2044);
			KNOWN_ELEMENT_TYPES.add(Range_2043);
			KNOWN_ELEMENT_TYPES.add(Generator_2072);
			KNOWN_ELEMENT_TYPES.add(Capacitor_2045);
			KNOWN_ELEMENT_TYPES.add(Windturb_dg_2078);
			KNOWN_ELEMENT_TYPES.add(ConnectionParent_4001);
			KNOWN_ELEMENT_TYPES.add(ConnectionConnections_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return Grid_1000;
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return Triplex_meter_2050;
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return Climate_2059;
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return Dryer_2052;
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return Underground_line_conductor_2026;
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return Capbank_2024;
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return Histogram_2069;
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return Relay_2017;
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return Battery_2002;
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return Node_2054;
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return Overhead_line_conductor_2039;
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return House_2016;
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return Transformer_configuration_2007;
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return Volt_var_control_2022;
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return Regulator_configuration_2009;
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return Energy_storage_2076;
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return Csv_reader_2033;
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return Load_2005;
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return Multizone_2066;
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return Refrigerator_2020;
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return Series_reactor_2032;
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return Auction_2047;
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return Link_2004;
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return Inverter_2058;
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return Pqload_2006;
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return Player_2015;
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return Substation_2067;
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return Microturbine_2038;
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return Triplex_node_2042;
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return Transformer_2001;
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return Plugload_2019;
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return Controller2_2029;
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return Clotheswasher_2063;
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return Stubauction_2048;
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return Rectifier_2075;
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return Power_electronics_2061;
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return Line_spacing_2025;
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return Motor_2065;
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return House_a_2008;
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return Controller_2040;
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return Underground_line_2041;
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return Line_configuration_2053;
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return Occupantload_2037;
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return Evcharger_2012;
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return Overhead_line_2036;
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return Line_2034;
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return Office_2060;
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return Waterheater_2062;
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return Dc_dc_converter_2068;
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return Triplex_line_2027;
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return Dishwasher_2010;
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return Recorder_2046;
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return Switch_2071;
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return Comm_2074;
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return Solar_2051;
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return Voltdump_2023;
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return Freezer_2014;
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return Diesel_dg_2077;
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return Meter_2049;
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return Shaper_2003;
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return Triplex_line_conductor_2064;
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return Microwave_2018;
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return Plc_2073;
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return Fault_check_2028;
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return Triplex_line_configuration_2030;
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return Fuse_2057;
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return Billdump_2070;
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return Frequency_gen_2035;
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return Lights_2056;
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return Residential_enduse_2011;
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return Collector_2021;
		case visGrid.diagram.edit.parts.TimeEditPart.VISUAL_ID:
			return Time_2082;
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return Restoration_2013;
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return ZIPload_2055;
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return Regulator_2031;
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return Weather_2044;
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return Range_2043;
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return Generator_2072;
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return Capacitor_2045;
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return Windturb_dg_2078;
		case visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID:
			return ConnectionParent_4001;
		case visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID:
			return ConnectionConnections_4002;
		}
		return null;
	}

}
