/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import visGrid.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see visGrid.VisGridPackage
 * @generated
 */
public class VisGridSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisGridPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisGridSwitch() {
		if (modelPackage == null) {
			modelPackage = VisGridPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VisGridPackage.CLIMATE: {
				Climate climate = (Climate)theEObject;
				T result = caseClimate(climate);
				if (result == null) result = caseConnection(climate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.CSV_READER: {
				Csv_reader csv_reader = (Csv_reader)theEObject;
				T result = caseCsv_reader(csv_reader);
				if (result == null) result = caseConnection(csv_reader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.DIESEL_DG: {
				Diesel_dg diesel_dg = (Diesel_dg)theEObject;
				T result = caseDiesel_dg(diesel_dg);
				if (result == null) result = caseConnection(diesel_dg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.ENERGY_STORAGE: {
				Energy_storage energy_storage = (Energy_storage)theEObject;
				T result = caseEnergy_storage(energy_storage);
				if (result == null) result = caseConnection(energy_storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.INVERTER: {
				Inverter inverter = (Inverter)theEObject;
				T result = caseInverter(inverter);
				if (result == null) result = caseConnection(inverter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.DC_DC_CONVERTER: {
				Dc_dc_converter dc_dc_converter = (Dc_dc_converter)theEObject;
				T result = caseDc_dc_converter(dc_dc_converter);
				if (result == null) result = caseConnection(dc_dc_converter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.AUCTION: {
				Auction auction = (Auction)theEObject;
				T result = caseAuction(auction);
				if (result == null) result = caseConnection(auction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = caseConnection(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.CONTROLLER2: {
				Controller2 controller2 = (Controller2)theEObject;
				T result = caseController2(controller2);
				if (result == null) result = caseConnection(controller2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.CAPBANK: {
				Capbank capbank = (Capbank)theEObject;
				T result = caseCapbank(capbank);
				if (result == null) result = caseConnection(capbank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.COMM: {
				Comm comm = (Comm)theEObject;
				T result = caseComm(comm);
				if (result == null) result = caseConnection(comm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.CAPACITOR: {
				Capacitor capacitor = (Capacitor)theEObject;
				T result = caseCapacitor(capacitor);
				if (result == null) result = caseConnection(capacitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = caseConnection(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.LINE_SPACING: {
				Line_spacing line_spacing = (Line_spacing)theEObject;
				T result = caseLine_spacing(line_spacing);
				if (result == null) result = caseConnection(line_spacing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.OVERHEAD_LINE: {
				Overhead_line overhead_line = (Overhead_line)theEObject;
				T result = caseOverhead_line(overhead_line);
				if (result == null) result = caseConnection(overhead_line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.UNDERGROUND_LINE: {
				Underground_line underground_line = (Underground_line)theEObject;
				T result = caseUnderground_line(underground_line);
				if (result == null) result = caseConnection(underground_line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.OVERHEAD_LINE_CONDUCTOR: {
				Overhead_line_conductor overhead_line_conductor = (Overhead_line_conductor)theEObject;
				T result = caseOverhead_line_conductor(overhead_line_conductor);
				if (result == null) result = caseConnection(overhead_line_conductor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR: {
				Underground_line_conductor underground_line_conductor = (Underground_line_conductor)theEObject;
				T result = caseUnderground_line_conductor(underground_line_conductor);
				if (result == null) result = caseConnection(underground_line_conductor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.LINE_CONFIGURATION: {
				Line_configuration line_configuration = (Line_configuration)theEObject;
				T result = caseLine_configuration(line_configuration);
				if (result == null) result = caseConnection(line_configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.TRANSFORMER_CONFIGURATION: {
				Transformer_configuration transformer_configuration = (Transformer_configuration)theEObject;
				T result = caseTransformer_configuration(transformer_configuration);
				if (result == null) result = caseConnection(transformer_configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.LOAD: {
				Load load = (Load)theEObject;
				T result = caseLoad(load);
				if (result == null) result = caseConnection(load);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.REGULATOR_CONFIGURATION: {
				Regulator_configuration regulator_configuration = (Regulator_configuration)theEObject;
				T result = caseRegulator_configuration(regulator_configuration);
				if (result == null) result = caseConnection(regulator_configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.TRIPLEX_NODE: {
				Triplex_node triplex_node = (Triplex_node)theEObject;
				T result = caseTriplex_node(triplex_node);
				if (result == null) result = caseConnection(triplex_node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.TRIPLEX_METER: {
				Triplex_meter triplex_meter = (Triplex_meter)theEObject;
				T result = caseTriplex_meter(triplex_meter);
				if (result == null) result = caseConnection(triplex_meter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.TRIPLEX_LINE: {
				Triplex_line triplex_line = (Triplex_line)theEObject;
				T result = caseTriplex_line(triplex_line);
				if (result == null) result = caseConnection(triplex_line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.TRIPLEX_LINE_CONFIGURATION: {
				Triplex_line_configuration triplex_line_configuration = (Triplex_line_configuration)theEObject;
				T result = caseTriplex_line_configuration(triplex_line_configuration);
				if (result == null) result = caseConnection(triplex_line_configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR: {
				Triplex_line_conductor triplex_line_conductor = (Triplex_line_conductor)theEObject;
				T result = caseTriplex_line_conductor(triplex_line_conductor);
				if (result == null) result = caseConnection(triplex_line_conductor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.SWITCH: {
				visGrid.Switch switch_ = (visGrid.Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseConnection(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.SUBSTATION: {
				Substation substation = (Substation)theEObject;
				T result = caseSubstation(substation);
				if (result == null) result = caseConnection(substation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.PQLOAD: {
				Pqload pqload = (Pqload)theEObject;
				T result = casePqload(pqload);
				if (result == null) result = caseConnection(pqload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.VOLTDUMP: {
				Voltdump voltdump = (Voltdump)theEObject;
				T result = caseVoltdump(voltdump);
				if (result == null) result = caseConnection(voltdump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.SERIES_REACTOR: {
				Series_reactor series_reactor = (Series_reactor)theEObject;
				T result = caseSeries_reactor(series_reactor);
				if (result == null) result = caseConnection(series_reactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.RESTORATION: {
				Restoration restoration = (Restoration)theEObject;
				T result = caseRestoration(restoration);
				if (result == null) result = caseConnection(restoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.FREQUENCY_GEN: {
				Frequency_gen frequency_gen = (Frequency_gen)theEObject;
				T result = caseFrequency_gen(frequency_gen);
				if (result == null) result = caseConnection(frequency_gen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.VOLT_VAR_CONTROL: {
				Volt_var_control volt_var_control = (Volt_var_control)theEObject;
				T result = caseVolt_var_control(volt_var_control);
				if (result == null) result = caseConnection(volt_var_control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.FAULT_CHECK: {
				Fault_check fault_check = (Fault_check)theEObject;
				T result = caseFault_check(fault_check);
				if (result == null) result = caseConnection(fault_check);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.MOTOR: {
				Motor motor = (Motor)theEObject;
				T result = caseMotor(motor);
				if (result == null) result = caseConnection(motor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.BILLDUMP: {
				Billdump billdump = (Billdump)theEObject;
				T result = caseBilldump(billdump);
				if (result == null) result = caseConnection(billdump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.RESIDENTIAL_ENDUSE: {
				Residential_enduse residential_enduse = (Residential_enduse)theEObject;
				T result = caseResidential_enduse(residential_enduse);
				if (result == null) result = caseConnection(residential_enduse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.HOUSE_A: {
				House_a house_a = (House_a)theEObject;
				T result = caseHouse_a(house_a);
				if (result == null) result = caseConnection(house_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.HOUSE: {
				House house = (House)theEObject;
				T result = caseHouse(house);
				if (result == null) result = caseConnection(house);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.WATERHEATER: {
				Waterheater waterheater = (Waterheater)theEObject;
				T result = caseWaterheater(waterheater);
				if (result == null) result = caseConnection(waterheater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.LIGHTS: {
				Lights lights = (Lights)theEObject;
				T result = caseLights(lights);
				if (result == null) result = caseConnection(lights);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.REFRIGERATOR: {
				Refrigerator refrigerator = (Refrigerator)theEObject;
				T result = caseRefrigerator(refrigerator);
				if (result == null) result = caseConnection(refrigerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.CLOTHESWASHER: {
				Clotheswasher clotheswasher = (Clotheswasher)theEObject;
				T result = caseClotheswasher(clotheswasher);
				if (result == null) result = caseConnection(clotheswasher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.DISHWASHER: {
				Dishwasher dishwasher = (Dishwasher)theEObject;
				T result = caseDishwasher(dishwasher);
				if (result == null) result = caseConnection(dishwasher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.OCCUPANTLOAD: {
				Occupantload occupantload = (Occupantload)theEObject;
				T result = caseOccupantload(occupantload);
				if (result == null) result = caseConnection(occupantload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.PLUGLOAD: {
				Plugload plugload = (Plugload)theEObject;
				T result = casePlugload(plugload);
				if (result == null) result = caseConnection(plugload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.MICROWAVE: {
				Microwave microwave = (Microwave)theEObject;
				T result = caseMicrowave(microwave);
				if (result == null) result = caseConnection(microwave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseConnection(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.FREEZER: {
				Freezer freezer = (Freezer)theEObject;
				T result = caseFreezer(freezer);
				if (result == null) result = caseConnection(freezer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.DRYER: {
				Dryer dryer = (Dryer)theEObject;
				T result = caseDryer(dryer);
				if (result == null) result = caseConnection(dryer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.EVCHARGER: {
				Evcharger evcharger = (Evcharger)theEObject;
				T result = caseEvcharger(evcharger);
				if (result == null) result = caseConnection(evcharger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.ZI_PLOAD: {
				ZIPload ziPload = (ZIPload)theEObject;
				T result = caseZIPload(ziPload);
				if (result == null) result = caseConnection(ziPload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.PLAYER: {
				Player player = (Player)theEObject;
				T result = casePlayer(player);
				if (result == null) result = caseConnection(player);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.SHAPER: {
				Shaper shaper = (Shaper)theEObject;
				T result = caseShaper(shaper);
				if (result == null) result = caseConnection(shaper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.RECORDER: {
				Recorder recorder = (Recorder)theEObject;
				T result = caseRecorder(recorder);
				if (result == null) result = caseConnection(recorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.COLLECTOR: {
				Collector collector = (Collector)theEObject;
				T result = caseCollector(collector);
				if (result == null) result = caseConnection(collector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.HISTOGRAM: {
				Histogram histogram = (Histogram)theEObject;
				T result = caseHistogram(histogram);
				if (result == null) result = caseConnection(histogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.WEATHER: {
				Weather weather = (Weather)theEObject;
				T result = caseWeather(weather);
				if (result == null) result = caseConnection(weather);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.OFFICE: {
				Office office = (Office)theEObject;
				T result = caseOffice(office);
				if (result == null) result = caseConnection(office);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.MULTIZONE: {
				Multizone multizone = (Multizone)theEObject;
				T result = caseMultizone(multizone);
				if (result == null) result = caseConnection(multizone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.WINDTURB_DG: {
				Windturb_dg windturb_dg = (Windturb_dg)theEObject;
				T result = caseWindturb_dg(windturb_dg);
				if (result == null) result = caseConnection(windturb_dg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.POWER_ELECTRONICS: {
				Power_electronics power_electronics = (Power_electronics)theEObject;
				T result = casePower_electronics(power_electronics);
				if (result == null) result = caseConnection(power_electronics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.RECTIFIER: {
				Rectifier rectifier = (Rectifier)theEObject;
				T result = caseRectifier(rectifier);
				if (result == null) result = caseConnection(rectifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.MICROTURBINE: {
				Microturbine microturbine = (Microturbine)theEObject;
				T result = caseMicroturbine(microturbine);
				if (result == null) result = caseConnection(microturbine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.BATTERY: {
				Battery battery = (Battery)theEObject;
				T result = caseBattery(battery);
				if (result == null) result = caseConnection(battery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.SOLAR: {
				Solar solar = (Solar)theEObject;
				T result = caseSolar(solar);
				if (result == null) result = caseConnection(solar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.STUBAUCTION: {
				Stubauction stubauction = (Stubauction)theEObject;
				T result = caseStubauction(stubauction);
				if (result == null) result = caseConnection(stubauction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseConnection(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.FUSE: {
				Fuse fuse = (Fuse)theEObject;
				T result = caseFuse(fuse);
				if (result == null) result = caseConnection(fuse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.RELAY: {
				Relay relay = (Relay)theEObject;
				T result = caseRelay(relay);
				if (result == null) result = caseConnection(relay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.REGULATOR: {
				Regulator regulator = (Regulator)theEObject;
				T result = caseRegulator(regulator);
				if (result == null) result = caseConnection(regulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.TRANSFORMER: {
				Transformer transformer = (Transformer)theEObject;
				T result = caseTransformer(transformer);
				if (result == null) result = caseConnection(transformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.METER: {
				Meter meter = (Meter)theEObject;
				T result = caseMeter(meter);
				if (result == null) result = caseConnection(meter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.GENERATOR: {
				Generator generator = (Generator)theEObject;
				T result = caseGenerator(generator);
				if (result == null) result = caseConnection(generator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.PLC: {
				Plc plc = (Plc)theEObject;
				T result = casePlc(plc);
				if (result == null) result = caseConnection(plc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseConnection(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.GRID: {
				Grid grid = (Grid)theEObject;
				T result = caseGrid(grid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisGridPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Climate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Climate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClimate(Climate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Csv reader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Csv reader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsv_reader(Csv_reader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diesel dg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diesel dg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiesel_dg(Diesel_dg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergy_storage(Energy_storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverter(Inverter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dc dc converter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dc dc converter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDc_dc_converter(Dc_dc_converter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuction(Auction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController2(Controller2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capbank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capbank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapbank(Capbank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComm(Comm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capacitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capacitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapacitor(Capacitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line spacing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line spacing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine_spacing(Line_spacing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overhead line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overhead line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverhead_line(Overhead_line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underground line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underground line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderground_line(Underground_line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overhead line conductor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overhead line conductor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverhead_line_conductor(Overhead_line_conductor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underground line conductor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underground line conductor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderground_line_conductor(Underground_line_conductor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine_configuration(Line_configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformer_configuration(Transformer_configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoad(Load object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulator configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulator configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulator_configuration(Regulator_configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triplex node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triplex node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriplex_node(Triplex_node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triplex meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triplex meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriplex_meter(Triplex_meter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triplex line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triplex line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriplex_line(Triplex_line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triplex line configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triplex line configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriplex_line_configuration(Triplex_line_configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triplex line conductor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triplex line conductor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriplex_line_conductor(Triplex_line_conductor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(visGrid.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstation(Substation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pqload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pqload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePqload(Pqload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltdump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltdump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltdump(Voltdump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series reactor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series reactor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeries_reactor(Series_reactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestoration(Restoration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency gen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency gen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequency_gen(Frequency_gen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volt var control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volt var control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolt_var_control(Volt_var_control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFault_check(Fault_check object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotor(Motor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Billdump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Billdump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBilldump(Billdump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Residential enduse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Residential enduse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResidential_enduse(Residential_enduse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>House a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>House a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHouse_a(House_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>House</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHouse(House object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Waterheater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Waterheater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterheater(Waterheater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lights</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lights</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLights(Lights object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refrigerator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refrigerator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefrigerator(Refrigerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clotheswasher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clotheswasher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClotheswasher(Clotheswasher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dishwasher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dishwasher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDishwasher(Dishwasher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occupantload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occupantload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccupantload(Occupantload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlugload(Plugload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microwave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microwave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrowave(Microwave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freezer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freezer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreezer(Freezer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dryer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dryer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDryer(Dryer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evcharger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evcharger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvcharger(Evcharger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZI Pload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZI Pload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZIPload(ZIPload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayer(Player object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shaper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shaper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShaper(Shaper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recorder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recorder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecorder(Recorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollector(Collector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Histogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistogram(Histogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weather</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weather</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeather(Weather object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Office</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Office</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffice(Office object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multizone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multizone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultizone(Multizone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windturb dg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windturb dg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindturb_dg(Windturb_dg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power electronics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power electronics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePower_electronics(Power_electronics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectifier(Rectifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microturbine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microturbine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroturbine(Microturbine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBattery(Battery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolar(Solar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stubauction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stubauction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStubauction(Stubauction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuse(Fuse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelay(Relay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulator(Regulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformer(Transformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeter(Meter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerator(Generator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlc(Plc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrid(Grid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VisGridSwitch
