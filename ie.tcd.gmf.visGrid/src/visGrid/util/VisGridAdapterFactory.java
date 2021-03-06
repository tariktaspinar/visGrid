/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import visGrid.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see visGrid.VisGridPackage
 * @generated
 */
public class VisGridAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisGridPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisGridAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VisGridPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisGridSwitch<Adapter> modelSwitch =
		new VisGridSwitch<Adapter>() {
			@Override
			public Adapter caseClimate(Climate object) {
				return createClimateAdapter();
			}
			@Override
			public Adapter caseCsv_reader(Csv_reader object) {
				return createCsv_readerAdapter();
			}
			@Override
			public Adapter caseDiesel_dg(Diesel_dg object) {
				return createDiesel_dgAdapter();
			}
			@Override
			public Adapter caseEnergy_storage(Energy_storage object) {
				return createEnergy_storageAdapter();
			}
			@Override
			public Adapter caseInverter(Inverter object) {
				return createInverterAdapter();
			}
			@Override
			public Adapter caseDc_dc_converter(Dc_dc_converter object) {
				return createDc_dc_converterAdapter();
			}
			@Override
			public Adapter caseAuction(Auction object) {
				return createAuctionAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseController2(Controller2 object) {
				return createController2Adapter();
			}
			@Override
			public Adapter caseCapbank(Capbank object) {
				return createCapbankAdapter();
			}
			@Override
			public Adapter caseComm(Comm object) {
				return createCommAdapter();
			}
			@Override
			public Adapter caseCapacitor(Capacitor object) {
				return createCapacitorAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseLine_spacing(Line_spacing object) {
				return createLine_spacingAdapter();
			}
			@Override
			public Adapter caseOverhead_line(Overhead_line object) {
				return createOverhead_lineAdapter();
			}
			@Override
			public Adapter caseUnderground_line(Underground_line object) {
				return createUnderground_lineAdapter();
			}
			@Override
			public Adapter caseOverhead_line_conductor(Overhead_line_conductor object) {
				return createOverhead_line_conductorAdapter();
			}
			@Override
			public Adapter caseUnderground_line_conductor(Underground_line_conductor object) {
				return createUnderground_line_conductorAdapter();
			}
			@Override
			public Adapter caseLine_configuration(Line_configuration object) {
				return createLine_configurationAdapter();
			}
			@Override
			public Adapter caseTransformer_configuration(Transformer_configuration object) {
				return createTransformer_configurationAdapter();
			}
			@Override
			public Adapter caseLoad(Load object) {
				return createLoadAdapter();
			}
			@Override
			public Adapter caseRegulator_configuration(Regulator_configuration object) {
				return createRegulator_configurationAdapter();
			}
			@Override
			public Adapter caseTriplex_node(Triplex_node object) {
				return createTriplex_nodeAdapter();
			}
			@Override
			public Adapter caseTriplex_meter(Triplex_meter object) {
				return createTriplex_meterAdapter();
			}
			@Override
			public Adapter caseTriplex_line(Triplex_line object) {
				return createTriplex_lineAdapter();
			}
			@Override
			public Adapter caseTriplex_line_configuration(Triplex_line_configuration object) {
				return createTriplex_line_configurationAdapter();
			}
			@Override
			public Adapter caseTriplex_line_conductor(Triplex_line_conductor object) {
				return createTriplex_line_conductorAdapter();
			}
			@Override
			public Adapter caseSwitch(Switch object) {
				return createSwitchAdapter();
			}
			@Override
			public Adapter caseSubstation(Substation object) {
				return createSubstationAdapter();
			}
			@Override
			public Adapter casePqload(Pqload object) {
				return createPqloadAdapter();
			}
			@Override
			public Adapter caseVoltdump(Voltdump object) {
				return createVoltdumpAdapter();
			}
			@Override
			public Adapter caseSeries_reactor(Series_reactor object) {
				return createSeries_reactorAdapter();
			}
			@Override
			public Adapter caseRestoration(Restoration object) {
				return createRestorationAdapter();
			}
			@Override
			public Adapter caseFrequency_gen(Frequency_gen object) {
				return createFrequency_genAdapter();
			}
			@Override
			public Adapter caseVolt_var_control(Volt_var_control object) {
				return createVolt_var_controlAdapter();
			}
			@Override
			public Adapter caseFault_check(Fault_check object) {
				return createFault_checkAdapter();
			}
			@Override
			public Adapter caseMotor(Motor object) {
				return createMotorAdapter();
			}
			@Override
			public Adapter caseBilldump(Billdump object) {
				return createBilldumpAdapter();
			}
			@Override
			public Adapter caseResidential_enduse(Residential_enduse object) {
				return createResidential_enduseAdapter();
			}
			@Override
			public Adapter caseHouse_a(House_a object) {
				return createHouse_aAdapter();
			}
			@Override
			public Adapter caseHouse(House object) {
				return createHouseAdapter();
			}
			@Override
			public Adapter caseWaterheater(Waterheater object) {
				return createWaterheaterAdapter();
			}
			@Override
			public Adapter caseLights(Lights object) {
				return createLightsAdapter();
			}
			@Override
			public Adapter caseRefrigerator(Refrigerator object) {
				return createRefrigeratorAdapter();
			}
			@Override
			public Adapter caseClotheswasher(Clotheswasher object) {
				return createClotheswasherAdapter();
			}
			@Override
			public Adapter caseDishwasher(Dishwasher object) {
				return createDishwasherAdapter();
			}
			@Override
			public Adapter caseOccupantload(Occupantload object) {
				return createOccupantloadAdapter();
			}
			@Override
			public Adapter casePlugload(Plugload object) {
				return createPlugloadAdapter();
			}
			@Override
			public Adapter caseMicrowave(Microwave object) {
				return createMicrowaveAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseFreezer(Freezer object) {
				return createFreezerAdapter();
			}
			@Override
			public Adapter caseDryer(Dryer object) {
				return createDryerAdapter();
			}
			@Override
			public Adapter caseEvcharger(Evcharger object) {
				return createEvchargerAdapter();
			}
			@Override
			public Adapter caseZIPload(ZIPload object) {
				return createZIPloadAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter caseShaper(Shaper object) {
				return createShaperAdapter();
			}
			@Override
			public Adapter caseRecorder(Recorder object) {
				return createRecorderAdapter();
			}
			@Override
			public Adapter caseCollector(Collector object) {
				return createCollectorAdapter();
			}
			@Override
			public Adapter caseHistogram(Histogram object) {
				return createHistogramAdapter();
			}
			@Override
			public Adapter caseWeather(Weather object) {
				return createWeatherAdapter();
			}
			@Override
			public Adapter caseOffice(Office object) {
				return createOfficeAdapter();
			}
			@Override
			public Adapter caseMultizone(Multizone object) {
				return createMultizoneAdapter();
			}
			@Override
			public Adapter caseWindturb_dg(Windturb_dg object) {
				return createWindturb_dgAdapter();
			}
			@Override
			public Adapter casePower_electronics(Power_electronics object) {
				return createPower_electronicsAdapter();
			}
			@Override
			public Adapter caseRectifier(Rectifier object) {
				return createRectifierAdapter();
			}
			@Override
			public Adapter caseMicroturbine(Microturbine object) {
				return createMicroturbineAdapter();
			}
			@Override
			public Adapter caseBattery(Battery object) {
				return createBatteryAdapter();
			}
			@Override
			public Adapter caseSolar(Solar object) {
				return createSolarAdapter();
			}
			@Override
			public Adapter caseStubauction(Stubauction object) {
				return createStubauctionAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseFuse(Fuse object) {
				return createFuseAdapter();
			}
			@Override
			public Adapter caseRelay(Relay object) {
				return createRelayAdapter();
			}
			@Override
			public Adapter caseRegulator(Regulator object) {
				return createRegulatorAdapter();
			}
			@Override
			public Adapter caseTransformer(Transformer object) {
				return createTransformerAdapter();
			}
			@Override
			public Adapter caseMeter(Meter object) {
				return createMeterAdapter();
			}
			@Override
			public Adapter caseGenerator(Generator object) {
				return createGeneratorAdapter();
			}
			@Override
			public Adapter casePlc(Plc object) {
				return createPlcAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseGrid(Grid object) {
				return createGridAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Climate <em>Climate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Climate
	 * @generated
	 */
	public Adapter createClimateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Csv_reader <em>Csv reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Csv_reader
	 * @generated
	 */
	public Adapter createCsv_readerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Diesel_dg <em>Diesel dg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Diesel_dg
	 * @generated
	 */
	public Adapter createDiesel_dgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Energy_storage <em>Energy storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Energy_storage
	 * @generated
	 */
	public Adapter createEnergy_storageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Inverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Inverter
	 * @generated
	 */
	public Adapter createInverterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Dc_dc_converter <em>Dc dc converter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Dc_dc_converter
	 * @generated
	 */
	public Adapter createDc_dc_converterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Auction <em>Auction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Auction
	 * @generated
	 */
	public Adapter createAuctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Controller2 <em>Controller2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Controller2
	 * @generated
	 */
	public Adapter createController2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Capbank <em>Capbank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Capbank
	 * @generated
	 */
	public Adapter createCapbankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Comm <em>Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Comm
	 * @generated
	 */
	public Adapter createCommAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Capacitor <em>Capacitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Capacitor
	 * @generated
	 */
	public Adapter createCapacitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Line_spacing <em>Line spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Line_spacing
	 * @generated
	 */
	public Adapter createLine_spacingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Overhead_line <em>Overhead line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Overhead_line
	 * @generated
	 */
	public Adapter createOverhead_lineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Underground_line <em>Underground line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Underground_line
	 * @generated
	 */
	public Adapter createUnderground_lineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Overhead_line_conductor <em>Overhead line conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Overhead_line_conductor
	 * @generated
	 */
	public Adapter createOverhead_line_conductorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Underground_line_conductor <em>Underground line conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Underground_line_conductor
	 * @generated
	 */
	public Adapter createUnderground_line_conductorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Line_configuration <em>Line configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Line_configuration
	 * @generated
	 */
	public Adapter createLine_configurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Transformer_configuration <em>Transformer configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Transformer_configuration
	 * @generated
	 */
	public Adapter createTransformer_configurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Load
	 * @generated
	 */
	public Adapter createLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Regulator_configuration <em>Regulator configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Regulator_configuration
	 * @generated
	 */
	public Adapter createRegulator_configurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Triplex_node <em>Triplex node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Triplex_node
	 * @generated
	 */
	public Adapter createTriplex_nodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Triplex_meter <em>Triplex meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Triplex_meter
	 * @generated
	 */
	public Adapter createTriplex_meterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Triplex_line <em>Triplex line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Triplex_line
	 * @generated
	 */
	public Adapter createTriplex_lineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Triplex_line_configuration <em>Triplex line configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Triplex_line_configuration
	 * @generated
	 */
	public Adapter createTriplex_line_configurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Triplex_line_conductor <em>Triplex line conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Triplex_line_conductor
	 * @generated
	 */
	public Adapter createTriplex_line_conductorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Substation
	 * @generated
	 */
	public Adapter createSubstationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Pqload <em>Pqload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Pqload
	 * @generated
	 */
	public Adapter createPqloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Voltdump <em>Voltdump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Voltdump
	 * @generated
	 */
	public Adapter createVoltdumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Series_reactor <em>Series reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Series_reactor
	 * @generated
	 */
	public Adapter createSeries_reactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Restoration <em>Restoration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Restoration
	 * @generated
	 */
	public Adapter createRestorationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Frequency_gen <em>Frequency gen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Frequency_gen
	 * @generated
	 */
	public Adapter createFrequency_genAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Volt_var_control <em>Volt var control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Volt_var_control
	 * @generated
	 */
	public Adapter createVolt_var_controlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Fault_check <em>Fault check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Fault_check
	 * @generated
	 */
	public Adapter createFault_checkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Billdump <em>Billdump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Billdump
	 * @generated
	 */
	public Adapter createBilldumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Residential_enduse <em>Residential enduse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Residential_enduse
	 * @generated
	 */
	public Adapter createResidential_enduseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.House_a <em>House a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.House_a
	 * @generated
	 */
	public Adapter createHouse_aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.House
	 * @generated
	 */
	public Adapter createHouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Waterheater <em>Waterheater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Waterheater
	 * @generated
	 */
	public Adapter createWaterheaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Lights <em>Lights</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Lights
	 * @generated
	 */
	public Adapter createLightsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Refrigerator <em>Refrigerator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Refrigerator
	 * @generated
	 */
	public Adapter createRefrigeratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Clotheswasher <em>Clotheswasher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Clotheswasher
	 * @generated
	 */
	public Adapter createClotheswasherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Dishwasher <em>Dishwasher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Dishwasher
	 * @generated
	 */
	public Adapter createDishwasherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Occupantload <em>Occupantload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Occupantload
	 * @generated
	 */
	public Adapter createOccupantloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Plugload <em>Plugload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Plugload
	 * @generated
	 */
	public Adapter createPlugloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Microwave <em>Microwave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Microwave
	 * @generated
	 */
	public Adapter createMicrowaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Freezer <em>Freezer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Freezer
	 * @generated
	 */
	public Adapter createFreezerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Dryer <em>Dryer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Dryer
	 * @generated
	 */
	public Adapter createDryerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Evcharger <em>Evcharger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Evcharger
	 * @generated
	 */
	public Adapter createEvchargerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.ZIPload <em>ZI Pload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.ZIPload
	 * @generated
	 */
	public Adapter createZIPloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Shaper <em>Shaper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Shaper
	 * @generated
	 */
	public Adapter createShaperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Recorder <em>Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Recorder
	 * @generated
	 */
	public Adapter createRecorderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Collector <em>Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Collector
	 * @generated
	 */
	public Adapter createCollectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Histogram <em>Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Histogram
	 * @generated
	 */
	public Adapter createHistogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Weather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Weather
	 * @generated
	 */
	public Adapter createWeatherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Office <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Office
	 * @generated
	 */
	public Adapter createOfficeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Multizone <em>Multizone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Multizone
	 * @generated
	 */
	public Adapter createMultizoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Windturb_dg <em>Windturb dg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Windturb_dg
	 * @generated
	 */
	public Adapter createWindturb_dgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Power_electronics <em>Power electronics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Power_electronics
	 * @generated
	 */
	public Adapter createPower_electronicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Rectifier <em>Rectifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Rectifier
	 * @generated
	 */
	public Adapter createRectifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Microturbine <em>Microturbine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Microturbine
	 * @generated
	 */
	public Adapter createMicroturbineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Battery
	 * @generated
	 */
	public Adapter createBatteryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Solar <em>Solar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Solar
	 * @generated
	 */
	public Adapter createSolarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Stubauction <em>Stubauction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Stubauction
	 * @generated
	 */
	public Adapter createStubauctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Fuse <em>Fuse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Fuse
	 * @generated
	 */
	public Adapter createFuseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Relay <em>Relay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Relay
	 * @generated
	 */
	public Adapter createRelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Regulator <em>Regulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Regulator
	 * @generated
	 */
	public Adapter createRegulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Transformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Transformer
	 * @generated
	 */
	public Adapter createTransformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Generator
	 * @generated
	 */
	public Adapter createGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Plc <em>Plc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Plc
	 * @generated
	 */
	public Adapter createPlcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Grid
	 * @generated
	 */
	public Adapter createGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visGrid.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visGrid.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VisGridAdapterFactory
