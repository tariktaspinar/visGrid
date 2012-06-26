/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.VisGridPackage;
import visGrid.Waterheater;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waterheater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getTank_volume <em>Tank volume</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getTank_UA <em>Tank UA</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getTank_diameter <em>Tank diameter</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getWater_demand <em>Water demand</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getHeating_element_capacity <em>Heating element capacity</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getInlet_water_temperature <em>Inlet water temperature</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getHeat_mode <em>Heat mode</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getTank_setpoint <em>Tank setpoint</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getThermostat_deadband <em>Thermostat deadband</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getActual_load <em>Actual load</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.WaterheaterImpl#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaterheaterImpl extends ConnectionImpl implements Waterheater {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTank_volume() <em>Tank volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_volume()
	 * @generated
	 * @ordered
	 */
	protected static final String TANK_VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTank_volume() <em>Tank volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_volume()
	 * @generated
	 * @ordered
	 */
	protected String tank_volume = TANK_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTank_UA() <em>Tank UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_UA()
	 * @generated
	 * @ordered
	 */
	protected static final String TANK_UA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTank_UA() <em>Tank UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_UA()
	 * @generated
	 * @ordered
	 */
	protected String tank_UA = TANK_UA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTank_diameter() <em>Tank diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_diameter()
	 * @generated
	 * @ordered
	 */
	protected static final String TANK_DIAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTank_diameter() <em>Tank diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_diameter()
	 * @generated
	 * @ordered
	 */
	protected String tank_diameter = TANK_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWater_demand() <em>Water demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater_demand()
	 * @generated
	 * @ordered
	 */
	protected static final String WATER_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWater_demand() <em>Water demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater_demand()
	 * @generated
	 * @ordered
	 */
	protected String water_demand = WATER_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeating_element_capacity() <em>Heating element capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_element_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_ELEMENT_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_element_capacity() <em>Heating element capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_element_capacity()
	 * @generated
	 * @ordered
	 */
	protected String heating_element_capacity = HEATING_ELEMENT_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInlet_water_temperature() <em>Inlet water temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlet_water_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String INLET_WATER_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInlet_water_temperature() <em>Inlet water temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlet_water_temperature()
	 * @generated
	 * @ordered
	 */
	protected String inlet_water_temperature = INLET_WATER_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeat_mode() <em>Heat mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeat_mode() <em>Heat mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_mode()
	 * @generated
	 * @ordered
	 */
	protected String heat_mode = HEAT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTank_setpoint() <em>Tank setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String TANK_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTank_setpoint() <em>Tank setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String tank_setpoint = TANK_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermostat_deadband() <em>Thermostat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermostat_deadband()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMOSTAT_DEADBAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermostat_deadband() <em>Thermostat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermostat_deadband()
	 * @generated
	 * @ordered
	 */
	protected String thermostat_deadband = THERMOSTAT_DEADBAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected String temperature = TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDemand() <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand()
	 * @generated
	 * @ordered
	 */
	protected static final String DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDemand() <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand()
	 * @generated
	 * @ordered
	 */
	protected String demand = DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getActual_load() <em>Actual load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual_load()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActual_load() <em>Actual load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual_load()
	 * @generated
	 * @ordered
	 */
	protected String actual_load = ACTUAL_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected String shape = SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected String load = LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final String ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected String energy = ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected String power = POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeak_demand() <em>Peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeak_demand()
	 * @generated
	 * @ordered
	 */
	protected static final String PEAK_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeak_demand() <em>Peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeak_demand()
	 * @generated
	 * @ordered
	 */
	protected String peak_demand = PEAK_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeatgain() <em>Heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatgain()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATGAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeatgain() <em>Heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatgain()
	 * @generated
	 * @ordered
	 */
	protected String heatgain = HEATGAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeatgain_fraction() <em>Heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATGAIN_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeatgain_fraction() <em>Heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected String heatgain_fraction = HEATGAIN_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_fraction() <em>Current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_fraction() <em>Current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_fraction()
	 * @generated
	 * @ordered
	 */
	protected String current_fraction = CURRENT_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_fraction() <em>Impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_fraction() <em>Impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_fraction()
	 * @generated
	 * @ordered
	 */
	protected String impedance_fraction = IMPEDANCE_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_fraction() <em>Power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_fraction() <em>Power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_fraction()
	 * @generated
	 * @ordered
	 */
	protected String power_fraction = POWER_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_factor() <em>Power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_factor() <em>Power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_factor()
	 * @generated
	 * @ordered
	 */
	protected String power_factor = POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power() <em>Constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power() <em>Constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power()
	 * @generated
	 * @ordered
	 */
	protected String constant_power = CONSTANT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current() <em>Constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current() <em>Constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current()
	 * @generated
	 * @ordered
	 */
	protected String constant_current = CONSTANT_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_admittance() <em>Constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_admittance()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_ADMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_admittance() <em>Constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_admittance()
	 * @generated
	 * @ordered
	 */
	protected String constant_admittance = CONSTANT_ADMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_factor() <em>Voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_factor() <em>Voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_factor()
	 * @generated
	 * @ordered
	 */
	protected String voltage_factor = VOLTAGE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected String configuration = CONFIGURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverride() <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverride() <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverride()
	 * @generated
	 * @ordered
	 */
	protected String override = OVERRIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaterheaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getWaterheater();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTank_volume() {
		return tank_volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTank_volume(String newTank_volume) {
		String oldTank_volume = tank_volume;
		tank_volume = newTank_volume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__TANK_VOLUME, oldTank_volume, tank_volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTank_UA() {
		return tank_UA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTank_UA(String newTank_UA) {
		String oldTank_UA = tank_UA;
		tank_UA = newTank_UA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__TANK_UA, oldTank_UA, tank_UA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTank_diameter() {
		return tank_diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTank_diameter(String newTank_diameter) {
		String oldTank_diameter = tank_diameter;
		tank_diameter = newTank_diameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__TANK_DIAMETER, oldTank_diameter, tank_diameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWater_demand() {
		return water_demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWater_demand(String newWater_demand) {
		String oldWater_demand = water_demand;
		water_demand = newWater_demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__WATER_DEMAND, oldWater_demand, water_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_element_capacity() {
		return heating_element_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_element_capacity(String newHeating_element_capacity) {
		String oldHeating_element_capacity = heating_element_capacity;
		heating_element_capacity = newHeating_element_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY, oldHeating_element_capacity, heating_element_capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInlet_water_temperature() {
		return inlet_water_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInlet_water_temperature(String newInlet_water_temperature) {
		String oldInlet_water_temperature = inlet_water_temperature;
		inlet_water_temperature = newInlet_water_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__INLET_WATER_TEMPERATURE, oldInlet_water_temperature, inlet_water_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeat_mode() {
		return heat_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeat_mode(String newHeat_mode) {
		String oldHeat_mode = heat_mode;
		heat_mode = newHeat_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__HEAT_MODE, oldHeat_mode, heat_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTank_setpoint() {
		return tank_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTank_setpoint(String newTank_setpoint) {
		String oldTank_setpoint = tank_setpoint;
		tank_setpoint = newTank_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__TANK_SETPOINT, oldTank_setpoint, tank_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermostat_deadband() {
		return thermostat_deadband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermostat_deadband(String newThermostat_deadband) {
		String oldThermostat_deadband = thermostat_deadband;
		thermostat_deadband = newThermostat_deadband;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__THERMOSTAT_DEADBAND, oldThermostat_deadband, thermostat_deadband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(String newTemperature) {
		String oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDemand() {
		return demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemand(String newDemand) {
		String oldDemand = demand;
		demand = newDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__DEMAND, oldDemand, demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActual_load() {
		return actual_load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActual_load(String newActual_load) {
		String oldActual_load = actual_load;
		actual_load = newActual_load;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__ACTUAL_LOAD, oldActual_load, actual_load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(String newShape) {
		String oldShape = shape;
		shape = newShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoad() {
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad(String newLoad) {
		String oldLoad = load;
		load = newLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnergy() {
		return energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergy(String newEnergy) {
		String oldEnergy = energy;
		energy = newEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__ENERGY, oldEnergy, energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(String newPower) {
		String oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeak_demand() {
		return peak_demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeak_demand(String newPeak_demand) {
		String oldPeak_demand = peak_demand;
		peak_demand = newPeak_demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__PEAK_DEMAND, oldPeak_demand, peak_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain() {
		return heatgain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatgain(String newHeatgain) {
		String oldHeatgain = heatgain;
		heatgain = newHeatgain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__HEATGAIN, oldHeatgain, heatgain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain_fraction() {
		return heatgain_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatgain_fraction(String newHeatgain_fraction) {
		String oldHeatgain_fraction = heatgain_fraction;
		heatgain_fraction = newHeatgain_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__HEATGAIN_FRACTION, oldHeatgain_fraction, heatgain_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_fraction() {
		return current_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_fraction(String newCurrent_fraction) {
		String oldCurrent_fraction = current_fraction;
		current_fraction = newCurrent_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__CURRENT_FRACTION, oldCurrent_fraction, current_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_fraction() {
		return impedance_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_fraction(String newImpedance_fraction) {
		String oldImpedance_fraction = impedance_fraction;
		impedance_fraction = newImpedance_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__IMPEDANCE_FRACTION, oldImpedance_fraction, impedance_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_fraction() {
		return power_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_fraction(String newPower_fraction) {
		String oldPower_fraction = power_fraction;
		power_fraction = newPower_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__POWER_FRACTION, oldPower_fraction, power_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_factor() {
		return power_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_factor(String newPower_factor) {
		String oldPower_factor = power_factor;
		power_factor = newPower_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__POWER_FACTOR, oldPower_factor, power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power() {
		return constant_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power(String newConstant_power) {
		String oldConstant_power = constant_power;
		constant_power = newConstant_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__CONSTANT_POWER, oldConstant_power, constant_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current() {
		return constant_current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current(String newConstant_current) {
		String oldConstant_current = constant_current;
		constant_current = newConstant_current;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__CONSTANT_CURRENT, oldConstant_current, constant_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_admittance() {
		return constant_admittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_admittance(String newConstant_admittance) {
		String oldConstant_admittance = constant_admittance;
		constant_admittance = newConstant_admittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__CONSTANT_ADMITTANCE, oldConstant_admittance, constant_admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_factor() {
		return voltage_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_factor(String newVoltage_factor) {
		String oldVoltage_factor = voltage_factor;
		voltage_factor = newVoltage_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__VOLTAGE_FACTOR, oldVoltage_factor, voltage_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(String newConfiguration) {
		String oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverride() {
		return override;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverride(String newOverride) {
		String oldOverride = override;
		override = newOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WATERHEATER__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.WATERHEATER__NAME:
				return getName();
			case VisGridPackage.WATERHEATER__TANK_VOLUME:
				return getTank_volume();
			case VisGridPackage.WATERHEATER__TANK_UA:
				return getTank_UA();
			case VisGridPackage.WATERHEATER__TANK_DIAMETER:
				return getTank_diameter();
			case VisGridPackage.WATERHEATER__WATER_DEMAND:
				return getWater_demand();
			case VisGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY:
				return getHeating_element_capacity();
			case VisGridPackage.WATERHEATER__INLET_WATER_TEMPERATURE:
				return getInlet_water_temperature();
			case VisGridPackage.WATERHEATER__HEAT_MODE:
				return getHeat_mode();
			case VisGridPackage.WATERHEATER__LOCATION:
				return getLocation();
			case VisGridPackage.WATERHEATER__TANK_SETPOINT:
				return getTank_setpoint();
			case VisGridPackage.WATERHEATER__THERMOSTAT_DEADBAND:
				return getThermostat_deadband();
			case VisGridPackage.WATERHEATER__TEMPERATURE:
				return getTemperature();
			case VisGridPackage.WATERHEATER__HEIGHT:
				return getHeight();
			case VisGridPackage.WATERHEATER__DEMAND:
				return getDemand();
			case VisGridPackage.WATERHEATER__ACTUAL_LOAD:
				return getActual_load();
			case VisGridPackage.WATERHEATER__SHAPE:
				return getShape();
			case VisGridPackage.WATERHEATER__LOAD:
				return getLoad();
			case VisGridPackage.WATERHEATER__ENERGY:
				return getEnergy();
			case VisGridPackage.WATERHEATER__POWER:
				return getPower();
			case VisGridPackage.WATERHEATER__PEAK_DEMAND:
				return getPeak_demand();
			case VisGridPackage.WATERHEATER__HEATGAIN:
				return getHeatgain();
			case VisGridPackage.WATERHEATER__HEATGAIN_FRACTION:
				return getHeatgain_fraction();
			case VisGridPackage.WATERHEATER__CURRENT_FRACTION:
				return getCurrent_fraction();
			case VisGridPackage.WATERHEATER__IMPEDANCE_FRACTION:
				return getImpedance_fraction();
			case VisGridPackage.WATERHEATER__POWER_FRACTION:
				return getPower_fraction();
			case VisGridPackage.WATERHEATER__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.WATERHEATER__CONSTANT_POWER:
				return getConstant_power();
			case VisGridPackage.WATERHEATER__CONSTANT_CURRENT:
				return getConstant_current();
			case VisGridPackage.WATERHEATER__CONSTANT_ADMITTANCE:
				return getConstant_admittance();
			case VisGridPackage.WATERHEATER__VOLTAGE_FACTOR:
				return getVoltage_factor();
			case VisGridPackage.WATERHEATER__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.WATERHEATER__OVERRIDE:
				return getOverride();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisGridPackage.WATERHEATER__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__TANK_VOLUME:
				setTank_volume((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__TANK_UA:
				setTank_UA((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__TANK_DIAMETER:
				setTank_diameter((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__WATER_DEMAND:
				setWater_demand((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY:
				setHeating_element_capacity((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__INLET_WATER_TEMPERATURE:
				setInlet_water_temperature((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__HEAT_MODE:
				setHeat_mode((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__LOCATION:
				setLocation((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__TANK_SETPOINT:
				setTank_setpoint((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__THERMOSTAT_DEADBAND:
				setThermostat_deadband((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__TEMPERATURE:
				setTemperature((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__HEIGHT:
				setHeight((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__DEMAND:
				setDemand((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__ACTUAL_LOAD:
				setActual_load((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__SHAPE:
				setShape((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__PEAK_DEMAND:
				setPeak_demand((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__HEATGAIN:
				setHeatgain((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__HEATGAIN_FRACTION:
				setHeatgain_fraction((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__CURRENT_FRACTION:
				setCurrent_fraction((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__IMPEDANCE_FRACTION:
				setImpedance_fraction((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__POWER_FRACTION:
				setPower_fraction((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__CONSTANT_POWER:
				setConstant_power((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__CONSTANT_CURRENT:
				setConstant_current((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__CONSTANT_ADMITTANCE:
				setConstant_admittance((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__VOLTAGE_FACTOR:
				setVoltage_factor((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.WATERHEATER__OVERRIDE:
				setOverride((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisGridPackage.WATERHEATER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__TANK_VOLUME:
				setTank_volume(TANK_VOLUME_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__TANK_UA:
				setTank_UA(TANK_UA_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__TANK_DIAMETER:
				setTank_diameter(TANK_DIAMETER_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__WATER_DEMAND:
				setWater_demand(WATER_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY:
				setHeating_element_capacity(HEATING_ELEMENT_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__INLET_WATER_TEMPERATURE:
				setInlet_water_temperature(INLET_WATER_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__HEAT_MODE:
				setHeat_mode(HEAT_MODE_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__TANK_SETPOINT:
				setTank_setpoint(TANK_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__THERMOSTAT_DEADBAND:
				setThermostat_deadband(THERMOSTAT_DEADBAND_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__DEMAND:
				setDemand(DEMAND_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__ACTUAL_LOAD:
				setActual_load(ACTUAL_LOAD_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__PEAK_DEMAND:
				setPeak_demand(PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__HEATGAIN:
				setHeatgain(HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__HEATGAIN_FRACTION:
				setHeatgain_fraction(HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__CURRENT_FRACTION:
				setCurrent_fraction(CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__IMPEDANCE_FRACTION:
				setImpedance_fraction(IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__POWER_FRACTION:
				setPower_fraction(POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__CONSTANT_POWER:
				setConstant_power(CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__CONSTANT_CURRENT:
				setConstant_current(CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__CONSTANT_ADMITTANCE:
				setConstant_admittance(CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__VOLTAGE_FACTOR:
				setVoltage_factor(VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.WATERHEATER__OVERRIDE:
				setOverride(OVERRIDE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisGridPackage.WATERHEATER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.WATERHEATER__TANK_VOLUME:
				return TANK_VOLUME_EDEFAULT == null ? tank_volume != null : !TANK_VOLUME_EDEFAULT.equals(tank_volume);
			case VisGridPackage.WATERHEATER__TANK_UA:
				return TANK_UA_EDEFAULT == null ? tank_UA != null : !TANK_UA_EDEFAULT.equals(tank_UA);
			case VisGridPackage.WATERHEATER__TANK_DIAMETER:
				return TANK_DIAMETER_EDEFAULT == null ? tank_diameter != null : !TANK_DIAMETER_EDEFAULT.equals(tank_diameter);
			case VisGridPackage.WATERHEATER__WATER_DEMAND:
				return WATER_DEMAND_EDEFAULT == null ? water_demand != null : !WATER_DEMAND_EDEFAULT.equals(water_demand);
			case VisGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY:
				return HEATING_ELEMENT_CAPACITY_EDEFAULT == null ? heating_element_capacity != null : !HEATING_ELEMENT_CAPACITY_EDEFAULT.equals(heating_element_capacity);
			case VisGridPackage.WATERHEATER__INLET_WATER_TEMPERATURE:
				return INLET_WATER_TEMPERATURE_EDEFAULT == null ? inlet_water_temperature != null : !INLET_WATER_TEMPERATURE_EDEFAULT.equals(inlet_water_temperature);
			case VisGridPackage.WATERHEATER__HEAT_MODE:
				return HEAT_MODE_EDEFAULT == null ? heat_mode != null : !HEAT_MODE_EDEFAULT.equals(heat_mode);
			case VisGridPackage.WATERHEATER__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case VisGridPackage.WATERHEATER__TANK_SETPOINT:
				return TANK_SETPOINT_EDEFAULT == null ? tank_setpoint != null : !TANK_SETPOINT_EDEFAULT.equals(tank_setpoint);
			case VisGridPackage.WATERHEATER__THERMOSTAT_DEADBAND:
				return THERMOSTAT_DEADBAND_EDEFAULT == null ? thermostat_deadband != null : !THERMOSTAT_DEADBAND_EDEFAULT.equals(thermostat_deadband);
			case VisGridPackage.WATERHEATER__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? temperature != null : !TEMPERATURE_EDEFAULT.equals(temperature);
			case VisGridPackage.WATERHEATER__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case VisGridPackage.WATERHEATER__DEMAND:
				return DEMAND_EDEFAULT == null ? demand != null : !DEMAND_EDEFAULT.equals(demand);
			case VisGridPackage.WATERHEATER__ACTUAL_LOAD:
				return ACTUAL_LOAD_EDEFAULT == null ? actual_load != null : !ACTUAL_LOAD_EDEFAULT.equals(actual_load);
			case VisGridPackage.WATERHEATER__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case VisGridPackage.WATERHEATER__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.WATERHEATER__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.WATERHEATER__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.WATERHEATER__PEAK_DEMAND:
				return PEAK_DEMAND_EDEFAULT == null ? peak_demand != null : !PEAK_DEMAND_EDEFAULT.equals(peak_demand);
			case VisGridPackage.WATERHEATER__HEATGAIN:
				return HEATGAIN_EDEFAULT == null ? heatgain != null : !HEATGAIN_EDEFAULT.equals(heatgain);
			case VisGridPackage.WATERHEATER__HEATGAIN_FRACTION:
				return HEATGAIN_FRACTION_EDEFAULT == null ? heatgain_fraction != null : !HEATGAIN_FRACTION_EDEFAULT.equals(heatgain_fraction);
			case VisGridPackage.WATERHEATER__CURRENT_FRACTION:
				return CURRENT_FRACTION_EDEFAULT == null ? current_fraction != null : !CURRENT_FRACTION_EDEFAULT.equals(current_fraction);
			case VisGridPackage.WATERHEATER__IMPEDANCE_FRACTION:
				return IMPEDANCE_FRACTION_EDEFAULT == null ? impedance_fraction != null : !IMPEDANCE_FRACTION_EDEFAULT.equals(impedance_fraction);
			case VisGridPackage.WATERHEATER__POWER_FRACTION:
				return POWER_FRACTION_EDEFAULT == null ? power_fraction != null : !POWER_FRACTION_EDEFAULT.equals(power_fraction);
			case VisGridPackage.WATERHEATER__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.WATERHEATER__CONSTANT_POWER:
				return CONSTANT_POWER_EDEFAULT == null ? constant_power != null : !CONSTANT_POWER_EDEFAULT.equals(constant_power);
			case VisGridPackage.WATERHEATER__CONSTANT_CURRENT:
				return CONSTANT_CURRENT_EDEFAULT == null ? constant_current != null : !CONSTANT_CURRENT_EDEFAULT.equals(constant_current);
			case VisGridPackage.WATERHEATER__CONSTANT_ADMITTANCE:
				return CONSTANT_ADMITTANCE_EDEFAULT == null ? constant_admittance != null : !CONSTANT_ADMITTANCE_EDEFAULT.equals(constant_admittance);
			case VisGridPackage.WATERHEATER__VOLTAGE_FACTOR:
				return VOLTAGE_FACTOR_EDEFAULT == null ? voltage_factor != null : !VOLTAGE_FACTOR_EDEFAULT.equals(voltage_factor);
			case VisGridPackage.WATERHEATER__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.WATERHEATER__OVERRIDE:
				return OVERRIDE_EDEFAULT == null ? override != null : !OVERRIDE_EDEFAULT.equals(override);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", tank_volume: ");
		result.append(tank_volume);
		result.append(", tank_UA: ");
		result.append(tank_UA);
		result.append(", tank_diameter: ");
		result.append(tank_diameter);
		result.append(", water_demand: ");
		result.append(water_demand);
		result.append(", heating_element_capacity: ");
		result.append(heating_element_capacity);
		result.append(", inlet_water_temperature: ");
		result.append(inlet_water_temperature);
		result.append(", heat_mode: ");
		result.append(heat_mode);
		result.append(", location: ");
		result.append(location);
		result.append(", tank_setpoint: ");
		result.append(tank_setpoint);
		result.append(", thermostat_deadband: ");
		result.append(thermostat_deadband);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", height: ");
		result.append(height);
		result.append(", demand: ");
		result.append(demand);
		result.append(", actual_load: ");
		result.append(actual_load);
		result.append(", shape: ");
		result.append(shape);
		result.append(", load: ");
		result.append(load);
		result.append(", energy: ");
		result.append(energy);
		result.append(", power: ");
		result.append(power);
		result.append(", peak_demand: ");
		result.append(peak_demand);
		result.append(", heatgain: ");
		result.append(heatgain);
		result.append(", heatgain_fraction: ");
		result.append(heatgain_fraction);
		result.append(", current_fraction: ");
		result.append(current_fraction);
		result.append(", impedance_fraction: ");
		result.append(impedance_fraction);
		result.append(", power_fraction: ");
		result.append(power_fraction);
		result.append(", power_factor: ");
		result.append(power_factor);
		result.append(", constant_power: ");
		result.append(constant_power);
		result.append(", constant_current: ");
		result.append(constant_current);
		result.append(", constant_admittance: ");
		result.append(constant_admittance);
		result.append(", voltage_factor: ");
		result.append(voltage_factor);
		result.append(", configuration: ");
		result.append(configuration);
		result.append(", override: ");
		result.append(override);
		result.append(')');
		return result.toString();
	}

} //WaterheaterImpl
