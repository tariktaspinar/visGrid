/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;
import java.util.HashMap;
        import java.util.Iterator;
        import java.util.Map;
        import java.util.Timer;
        import java.util.TimerTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.House;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.HouseImpl#getWeather <em>Weather</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getFloor_area <em>Floor area</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getGross_wall_area <em>Gross wall area</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getCeiling_height <em>Ceiling height</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAspect_ratio <em>Aspect ratio</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getEnvelope_UA <em>Envelope UA</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getWindow_wall_ratio <em>Window wall ratio</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getNumber_of_doors <em>Number of doors</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getExterior_wall_fraction <em>Exterior wall fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getInterior_exterior_wall_ratio <em>Interior exterior wall ratio</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getExterior_ceiling_fraction <em>Exterior ceiling fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getExterior_floor_fraction <em>Exterior floor fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getWindow_shading <em>Window shading</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getWindow_exterior_transmission_coefficient <em>Window exterior transmission coefficient</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getSolar_heatgain_factor <em>Solar heatgain factor</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAirchange_per_hour <em>Airchange per hour</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAirchange_UA <em>Airchange UA</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getInternal_gain <em>Internal gain</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getSolar_gain <em>Solar gain</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHeat_cool_gain <em>Heat cool gain</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getThermostat_deadband <em>Thermostat deadband</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getThermostat_cycle_time <em>Thermostat cycle time</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getThermostat_last_cycle_time <em>Thermostat last cycle time</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHeating_setpoint <em>Heating setpoint</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getCooling_setpoint <em>Cooling setpoint</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getDesign_heating_setpoint <em>Design heating setpoint</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getDesign_cooling_setpoint <em>Design cooling setpoint</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getDesign_heating_capacity <em>Design heating capacity</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getDesign_cooling_capacity <em>Design cooling capacity</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAdj_heating_cap <em>Adj heating cap</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getSys_rated_cap <em>Sys rated cap</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getCooling_design_temperature <em>Cooling design temperature</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHeating_design_temperature <em>Heating design temperature</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getDesign_peak_solar <em>Design peak solar</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getDesign_internal_gains <em>Design internal gains</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAir_heat_fraction <em>Air heat fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAuxiliary_heat_capacity <em>Auxiliary heat capacity</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAux_heat_deadband <em>Aux heat deadband</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAux_heat_temperature_lockout <em>Aux heat temperature lockout</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAux_heat_time_delay <em>Aux heat time delay</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getCooling_supply_air_temp <em>Cooling supply air temp</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHeating_supply_air_temp <em>Heating supply air temp</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getDuct_pressure_drop <em>Duct pressure drop</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getFan_design_power <em>Fan design power</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getFan_low_power_fraction <em>Fan low power fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getFan_power <em>Fan power</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getFan_design_airflow <em>Fan design airflow</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getFan_impedance_fraction <em>Fan impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getFan_power_fraction <em>Fan power fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getFan_current_fraction <em>Fan current fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getFan_power_factor <em>Fan power factor</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHeating_demand <em>Heating demand</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getCooling_demand <em>Cooling demand</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHeating_COP <em>Heating COP</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getCooling_COP <em>Cooling COP</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAdj_heating_cop <em>Adj heating cop</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAir_temperature <em>Air temperature</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getOutdoor_temperature <em>Outdoor temperature</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getMass_heat_capacity <em>Mass heat capacity</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getMass_heat_coeff <em>Mass heat coeff</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getMass_temperature <em>Mass temperature</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAir_volume <em>Air volume</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAir_mass <em>Air mass</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAir_heat_capacity <em>Air heat capacity</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getLatent_load_fraction <em>Latent load fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getTotal_thermal_mass_per_floor_area <em>Total thermal mass per floor area</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getInterior_surface_heat_transfer_coeff <em>Interior surface heat transfer coeff</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getNumber_of_stories <em>Number of stories</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getSystem_type <em>System type</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAuxiliary_strategy <em>Auxiliary strategy</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getSystem_mode <em>System mode</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHeating_system_type <em>Heating system type</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getCooling_system_type <em>Cooling system type</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getAuxiliary_system_type <em>Auxiliary system type</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getFan_type <em>Fan type</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getThermal_integrity_level <em>Thermal integrity level</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getGlass_type <em>Glass type</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getWindow_frame <em>Window frame</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getGlazing_treatment <em>Glazing treatment</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getGlazing_layers <em>Glazing layers</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getMotor_model <em>Motor model</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getMotor_efficiency <em>Motor efficiency</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHvac_motor_efficiency <em>Hvac motor efficiency</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHvac_motor_loss_power_factor <em>Hvac motor loss power factor</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getRroof <em>Rroof</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getRwall <em>Rwall</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getRfloor <em>Rfloor</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getRwindows <em>Rwindows</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getRdoors <em>Rdoors</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHvac_breaker_rating <em>Hvac breaker rating</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHvac_power_factor <em>Hvac power factor</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHvac_load <em>Hvac load</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel <em>Panel</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__energy <em>Panel energy</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__power <em>Panel power</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__peak_demand <em>Panel peak demand</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__heatgain <em>Panel heatgain</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__heatgain_fraction <em>Panel heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__current_fraction <em>Panel current fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__impedance_fraction <em>Panel impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__power_fraction <em>Panel power fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__power_factor <em>Panel power factor</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__constant_power <em>Panel constant power</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__constant_current <em>Panel constant current</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__constant_admittance <em>Panel constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__voltage_factor <em>Panel voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPanel__configuration <em>Panel configuration</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getDesign_internal_gain_density <em>Design internal gain density</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getA <em>A</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getB <em>B</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getC <em>C</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getD <em>D</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getC1 <em>C1</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getC2 <em>C2</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getA3 <em>A3</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getA4 <em>A4</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getK1 <em>K1</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getK2 <em>K2</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getR1 <em>R1</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getR2 <em>R2</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getTeq <em>Teq</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getTevent <em>Tevent</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getQi <em>Qi</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getQa <em>Qa</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getQm <em>Qm</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getQh <em>Qh</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getDTair <em>DTair</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getSol_inc <em>Sol inc</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.HouseImpl#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HouseImpl extends ConnectionImpl implements House {
		// Generated by python script located in this directory
       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();
   private void checkUnlock() {
        for (Map.Entry<String, Boolean> entry : lock.entrySet()){
            if (entry.getValue().equals(false)) return;
        }
        resetLock();
    }

    private void resetLock() {
        Timer timer = new Timer();
        class Task extends TimerTask{
            public void run() {
                for (Map.Entry<String, Boolean> entry : lock.entrySet()){
                    entry.setValue(false);
                }
            }   
        }
        timer.schedule(new Task(), 4000);
    }
    // END PYTHON GENERATED CODE
	/**
	 * The default value of the '{@link #getWeather() <em>Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeather()
	 * @generated
	 * @ordered
	 */
	protected static final String WEATHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeather() <em>Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeather()
	 * @generated
	 * @ordered
	 */
	protected String weather = WEATHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloor_area() <em>Floor area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor_area()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOOR_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloor_area() <em>Floor area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor_area()
	 * @generated
	 * @ordered
	 */
	protected String floor_area = FLOOR_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getGross_wall_area() <em>Gross wall area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGross_wall_area()
	 * @generated
	 * @ordered
	 */
	protected static final String GROSS_WALL_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGross_wall_area() <em>Gross wall area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGross_wall_area()
	 * @generated
	 * @ordered
	 */
	protected String gross_wall_area = GROSS_WALL_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCeiling_height() <em>Ceiling height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeiling_height()
	 * @generated
	 * @ordered
	 */
	protected static final String CEILING_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCeiling_height() <em>Ceiling height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeiling_height()
	 * @generated
	 * @ordered
	 */
	protected String ceiling_height = CEILING_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAspect_ratio() <em>Aspect ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect_ratio()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPECT_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAspect_ratio() <em>Aspect ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect_ratio()
	 * @generated
	 * @ordered
	 */
	protected String aspect_ratio = ASPECT_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvelope_UA() <em>Envelope UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvelope_UA()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVELOPE_UA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvelope_UA() <em>Envelope UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvelope_UA()
	 * @generated
	 * @ordered
	 */
	protected String envelope_UA = ENVELOPE_UA_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindow_wall_ratio() <em>Window wall ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow_wall_ratio()
	 * @generated
	 * @ordered
	 */
	protected static final String WINDOW_WALL_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindow_wall_ratio() <em>Window wall ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow_wall_ratio()
	 * @generated
	 * @ordered
	 */
	protected String window_wall_ratio = WINDOW_WALL_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber_of_doors() <em>Number of doors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_doors()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_OF_DOORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber_of_doors() <em>Number of doors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_doors()
	 * @generated
	 * @ordered
	 */
	protected String number_of_doors = NUMBER_OF_DOORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExterior_wall_fraction() <em>Exterior wall fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterior_wall_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERIOR_WALL_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExterior_wall_fraction() <em>Exterior wall fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterior_wall_fraction()
	 * @generated
	 * @ordered
	 */
	protected String exterior_wall_fraction = EXTERIOR_WALL_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterior_exterior_wall_ratio() <em>Interior exterior wall ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior_exterior_wall_ratio()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERIOR_EXTERIOR_WALL_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterior_exterior_wall_ratio() <em>Interior exterior wall ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior_exterior_wall_ratio()
	 * @generated
	 * @ordered
	 */
	protected String interior_exterior_wall_ratio = INTERIOR_EXTERIOR_WALL_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getExterior_ceiling_fraction() <em>Exterior ceiling fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterior_ceiling_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERIOR_CEILING_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExterior_ceiling_fraction() <em>Exterior ceiling fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterior_ceiling_fraction()
	 * @generated
	 * @ordered
	 */
	protected String exterior_ceiling_fraction = EXTERIOR_CEILING_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExterior_floor_fraction() <em>Exterior floor fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterior_floor_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERIOR_FLOOR_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExterior_floor_fraction() <em>Exterior floor fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterior_floor_fraction()
	 * @generated
	 * @ordered
	 */
	protected String exterior_floor_fraction = EXTERIOR_FLOOR_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindow_shading() <em>Window shading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow_shading()
	 * @generated
	 * @ordered
	 */
	protected static final String WINDOW_SHADING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindow_shading() <em>Window shading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow_shading()
	 * @generated
	 * @ordered
	 */
	protected String window_shading = WINDOW_SHADING_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindow_exterior_transmission_coefficient() <em>Window exterior transmission coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow_exterior_transmission_coefficient()
	 * @generated
	 * @ordered
	 */
	protected static final String WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindow_exterior_transmission_coefficient() <em>Window exterior transmission coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow_exterior_transmission_coefficient()
	 * @generated
	 * @ordered
	 */
	protected String window_exterior_transmission_coefficient = WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_heatgain_factor() <em>Solar heatgain factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_heatgain_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_HEATGAIN_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolar_heatgain_factor() <em>Solar heatgain factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_heatgain_factor()
	 * @generated
	 * @ordered
	 */
	protected String solar_heatgain_factor = SOLAR_HEATGAIN_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAirchange_per_hour() <em>Airchange per hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirchange_per_hour()
	 * @generated
	 * @ordered
	 */
	protected static final String AIRCHANGE_PER_HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAirchange_per_hour() <em>Airchange per hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirchange_per_hour()
	 * @generated
	 * @ordered
	 */
	protected String airchange_per_hour = AIRCHANGE_PER_HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAirchange_UA() <em>Airchange UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirchange_UA()
	 * @generated
	 * @ordered
	 */
	protected static final String AIRCHANGE_UA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAirchange_UA() <em>Airchange UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirchange_UA()
	 * @generated
	 * @ordered
	 */
	protected String airchange_UA = AIRCHANGE_UA_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternal_gain() <em>Internal gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternal_gain()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_GAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternal_gain() <em>Internal gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternal_gain()
	 * @generated
	 * @ordered
	 */
	protected String internal_gain = INTERNAL_GAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_gain() <em>Solar gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_gain()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_GAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolar_gain() <em>Solar gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_gain()
	 * @generated
	 * @ordered
	 */
	protected String solar_gain = SOLAR_GAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeat_cool_gain() <em>Heat cool gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_cool_gain()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAT_COOL_GAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeat_cool_gain() <em>Heat cool gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_cool_gain()
	 * @generated
	 * @ordered
	 */
	protected String heat_cool_gain = HEAT_COOL_GAIN_EDEFAULT;

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
	 * The default value of the '{@link #getThermostat_cycle_time() <em>Thermostat cycle time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermostat_cycle_time()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMOSTAT_CYCLE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermostat_cycle_time() <em>Thermostat cycle time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermostat_cycle_time()
	 * @generated
	 * @ordered
	 */
	protected String thermostat_cycle_time = THERMOSTAT_CYCLE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermostat_last_cycle_time() <em>Thermostat last cycle time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermostat_last_cycle_time()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMOSTAT_LAST_CYCLE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermostat_last_cycle_time() <em>Thermostat last cycle time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermostat_last_cycle_time()
	 * @generated
	 * @ordered
	 */
	protected String thermostat_last_cycle_time = THERMOSTAT_LAST_CYCLE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeating_setpoint() <em>Heating setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_setpoint() <em>Heating setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String heating_setpoint = HEATING_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooling_setpoint() <em>Cooling setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String COOLING_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCooling_setpoint() <em>Cooling setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String cooling_setpoint = COOLING_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesign_heating_setpoint() <em>Design heating setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_heating_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_HEATING_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesign_heating_setpoint() <em>Design heating setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_heating_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String design_heating_setpoint = DESIGN_HEATING_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesign_cooling_setpoint() <em>Design cooling setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_cooling_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_COOLING_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesign_cooling_setpoint() <em>Design cooling setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_cooling_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String design_cooling_setpoint = DESIGN_COOLING_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesign_heating_capacity() <em>Design heating capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_heating_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_HEATING_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesign_heating_capacity() <em>Design heating capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_heating_capacity()
	 * @generated
	 * @ordered
	 */
	protected String design_heating_capacity = DESIGN_HEATING_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesign_cooling_capacity() <em>Design cooling capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_cooling_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_COOLING_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesign_cooling_capacity() <em>Design cooling capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_cooling_capacity()
	 * @generated
	 * @ordered
	 */
	protected String design_cooling_capacity = DESIGN_COOLING_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdj_heating_cap() <em>Adj heating cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdj_heating_cap()
	 * @generated
	 * @ordered
	 */
	protected static final String ADJ_HEATING_CAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdj_heating_cap() <em>Adj heating cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdj_heating_cap()
	 * @generated
	 * @ordered
	 */
	protected String adj_heating_cap = ADJ_HEATING_CAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSys_rated_cap() <em>Sys rated cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSys_rated_cap()
	 * @generated
	 * @ordered
	 */
	protected static final String SYS_RATED_CAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSys_rated_cap() <em>Sys rated cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSys_rated_cap()
	 * @generated
	 * @ordered
	 */
	protected String sys_rated_cap = SYS_RATED_CAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooling_design_temperature() <em>Cooling design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_design_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String COOLING_DESIGN_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCooling_design_temperature() <em>Cooling design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_design_temperature()
	 * @generated
	 * @ordered
	 */
	protected String cooling_design_temperature = COOLING_DESIGN_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeating_design_temperature() <em>Heating design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_design_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_DESIGN_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_design_temperature() <em>Heating design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_design_temperature()
	 * @generated
	 * @ordered
	 */
	protected String heating_design_temperature = HEATING_DESIGN_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesign_peak_solar() <em>Design peak solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_peak_solar()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_PEAK_SOLAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesign_peak_solar() <em>Design peak solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_peak_solar()
	 * @generated
	 * @ordered
	 */
	protected String design_peak_solar = DESIGN_PEAK_SOLAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesign_internal_gains() <em>Design internal gains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_internal_gains()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_INTERNAL_GAINS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesign_internal_gains() <em>Design internal gains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_internal_gains()
	 * @generated
	 * @ordered
	 */
	protected String design_internal_gains = DESIGN_INTERNAL_GAINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAir_heat_fraction() <em>Air heat fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_heat_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String AIR_HEAT_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAir_heat_fraction() <em>Air heat fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_heat_fraction()
	 * @generated
	 * @ordered
	 */
	protected String air_heat_fraction = AIR_HEAT_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxiliary_heat_capacity() <em>Auxiliary heat capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliary_heat_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String AUXILIARY_HEAT_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxiliary_heat_capacity() <em>Auxiliary heat capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliary_heat_capacity()
	 * @generated
	 * @ordered
	 */
	protected String auxiliary_heat_capacity = AUXILIARY_HEAT_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAux_heat_deadband() <em>Aux heat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_heat_deadband()
	 * @generated
	 * @ordered
	 */
	protected static final String AUX_HEAT_DEADBAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux_heat_deadband() <em>Aux heat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_heat_deadband()
	 * @generated
	 * @ordered
	 */
	protected String aux_heat_deadband = AUX_HEAT_DEADBAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getAux_heat_temperature_lockout() <em>Aux heat temperature lockout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_heat_temperature_lockout()
	 * @generated
	 * @ordered
	 */
	protected static final String AUX_HEAT_TEMPERATURE_LOCKOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux_heat_temperature_lockout() <em>Aux heat temperature lockout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_heat_temperature_lockout()
	 * @generated
	 * @ordered
	 */
	protected String aux_heat_temperature_lockout = AUX_HEAT_TEMPERATURE_LOCKOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAux_heat_time_delay() <em>Aux heat time delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_heat_time_delay()
	 * @generated
	 * @ordered
	 */
	protected static final String AUX_HEAT_TIME_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux_heat_time_delay() <em>Aux heat time delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_heat_time_delay()
	 * @generated
	 * @ordered
	 */
	protected String aux_heat_time_delay = AUX_HEAT_TIME_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooling_supply_air_temp() <em>Cooling supply air temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_supply_air_temp()
	 * @generated
	 * @ordered
	 */
	protected static final String COOLING_SUPPLY_AIR_TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCooling_supply_air_temp() <em>Cooling supply air temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_supply_air_temp()
	 * @generated
	 * @ordered
	 */
	protected String cooling_supply_air_temp = COOLING_SUPPLY_AIR_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeating_supply_air_temp() <em>Heating supply air temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_supply_air_temp()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_SUPPLY_AIR_TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_supply_air_temp() <em>Heating supply air temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_supply_air_temp()
	 * @generated
	 * @ordered
	 */
	protected String heating_supply_air_temp = HEATING_SUPPLY_AIR_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuct_pressure_drop() <em>Duct pressure drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuct_pressure_drop()
	 * @generated
	 * @ordered
	 */
	protected static final String DUCT_PRESSURE_DROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuct_pressure_drop() <em>Duct pressure drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuct_pressure_drop()
	 * @generated
	 * @ordered
	 */
	protected String duct_pressure_drop = DUCT_PRESSURE_DROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFan_design_power() <em>Fan design power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_design_power()
	 * @generated
	 * @ordered
	 */
	protected static final String FAN_DESIGN_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFan_design_power() <em>Fan design power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_design_power()
	 * @generated
	 * @ordered
	 */
	protected String fan_design_power = FAN_DESIGN_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFan_low_power_fraction() <em>Fan low power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_low_power_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String FAN_LOW_POWER_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFan_low_power_fraction() <em>Fan low power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_low_power_fraction()
	 * @generated
	 * @ordered
	 */
	protected String fan_low_power_fraction = FAN_LOW_POWER_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFan_power() <em>Fan power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_power()
	 * @generated
	 * @ordered
	 */
	protected static final String FAN_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFan_power() <em>Fan power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_power()
	 * @generated
	 * @ordered
	 */
	protected String fan_power = FAN_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFan_design_airflow() <em>Fan design airflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_design_airflow()
	 * @generated
	 * @ordered
	 */
	protected static final String FAN_DESIGN_AIRFLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFan_design_airflow() <em>Fan design airflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_design_airflow()
	 * @generated
	 * @ordered
	 */
	protected String fan_design_airflow = FAN_DESIGN_AIRFLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getFan_impedance_fraction() <em>Fan impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_impedance_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String FAN_IMPEDANCE_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFan_impedance_fraction() <em>Fan impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_impedance_fraction()
	 * @generated
	 * @ordered
	 */
	protected String fan_impedance_fraction = FAN_IMPEDANCE_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFan_power_fraction() <em>Fan power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_power_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String FAN_POWER_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFan_power_fraction() <em>Fan power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_power_fraction()
	 * @generated
	 * @ordered
	 */
	protected String fan_power_fraction = FAN_POWER_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFan_current_fraction() <em>Fan current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_current_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String FAN_CURRENT_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFan_current_fraction() <em>Fan current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_current_fraction()
	 * @generated
	 * @ordered
	 */
	protected String fan_current_fraction = FAN_CURRENT_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFan_power_factor() <em>Fan power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_power_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String FAN_POWER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFan_power_factor() <em>Fan power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_power_factor()
	 * @generated
	 * @ordered
	 */
	protected String fan_power_factor = FAN_POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeating_demand() <em>Heating demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_demand()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_demand() <em>Heating demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_demand()
	 * @generated
	 * @ordered
	 */
	protected String heating_demand = HEATING_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooling_demand() <em>Cooling demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_demand()
	 * @generated
	 * @ordered
	 */
	protected static final String COOLING_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCooling_demand() <em>Cooling demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_demand()
	 * @generated
	 * @ordered
	 */
	protected String cooling_demand = COOLING_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeating_COP() <em>Heating COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_COP()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_COP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_COP() <em>Heating COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_COP()
	 * @generated
	 * @ordered
	 */
	protected String heating_COP = HEATING_COP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooling_COP() <em>Cooling COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_COP()
	 * @generated
	 * @ordered
	 */
	protected static final String COOLING_COP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCooling_COP() <em>Cooling COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_COP()
	 * @generated
	 * @ordered
	 */
	protected String cooling_COP = COOLING_COP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdj_heating_cop() <em>Adj heating cop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdj_heating_cop()
	 * @generated
	 * @ordered
	 */
	protected static final String ADJ_HEATING_COP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdj_heating_cop() <em>Adj heating cop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdj_heating_cop()
	 * @generated
	 * @ordered
	 */
	protected String adj_heating_cop = ADJ_HEATING_COP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAir_temperature() <em>Air temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String AIR_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAir_temperature() <em>Air temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_temperature()
	 * @generated
	 * @ordered
	 */
	protected String air_temperature = AIR_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutdoor_temperature() <em>Outdoor temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdoor_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTDOOR_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutdoor_temperature() <em>Outdoor temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdoor_temperature()
	 * @generated
	 * @ordered
	 */
	protected String outdoor_temperature = OUTDOOR_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMass_heat_capacity() <em>Mass heat capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass_heat_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String MASS_HEAT_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMass_heat_capacity() <em>Mass heat capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass_heat_capacity()
	 * @generated
	 * @ordered
	 */
	protected String mass_heat_capacity = MASS_HEAT_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMass_heat_coeff() <em>Mass heat coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass_heat_coeff()
	 * @generated
	 * @ordered
	 */
	protected static final String MASS_HEAT_COEFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMass_heat_coeff() <em>Mass heat coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass_heat_coeff()
	 * @generated
	 * @ordered
	 */
	protected String mass_heat_coeff = MASS_HEAT_COEFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMass_temperature() <em>Mass temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String MASS_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMass_temperature() <em>Mass temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass_temperature()
	 * @generated
	 * @ordered
	 */
	protected String mass_temperature = MASS_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAir_volume() <em>Air volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_volume()
	 * @generated
	 * @ordered
	 */
	protected static final String AIR_VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAir_volume() <em>Air volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_volume()
	 * @generated
	 * @ordered
	 */
	protected String air_volume = AIR_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAir_mass() <em>Air mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_mass()
	 * @generated
	 * @ordered
	 */
	protected static final String AIR_MASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAir_mass() <em>Air mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_mass()
	 * @generated
	 * @ordered
	 */
	protected String air_mass = AIR_MASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAir_heat_capacity() <em>Air heat capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_heat_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String AIR_HEAT_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAir_heat_capacity() <em>Air heat capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_heat_capacity()
	 * @generated
	 * @ordered
	 */
	protected String air_heat_capacity = AIR_HEAT_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatent_load_fraction() <em>Latent load fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatent_load_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String LATENT_LOAD_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatent_load_fraction() <em>Latent load fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatent_load_fraction()
	 * @generated
	 * @ordered
	 */
	protected String latent_load_fraction = LATENT_LOAD_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_thermal_mass_per_floor_area() <em>Total thermal mass per floor area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_thermal_mass_per_floor_area()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_THERMAL_MASS_PER_FLOOR_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotal_thermal_mass_per_floor_area() <em>Total thermal mass per floor area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_thermal_mass_per_floor_area()
	 * @generated
	 * @ordered
	 */
	protected String total_thermal_mass_per_floor_area = TOTAL_THERMAL_MASS_PER_FLOOR_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterior_surface_heat_transfer_coeff() <em>Interior surface heat transfer coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior_surface_heat_transfer_coeff()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERIOR_SURFACE_HEAT_TRANSFER_COEFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterior_surface_heat_transfer_coeff() <em>Interior surface heat transfer coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior_surface_heat_transfer_coeff()
	 * @generated
	 * @ordered
	 */
	protected String interior_surface_heat_transfer_coeff = INTERIOR_SURFACE_HEAT_TRANSFER_COEFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber_of_stories() <em>Number of stories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_stories()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_OF_STORIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber_of_stories() <em>Number of stories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_stories()
	 * @generated
	 * @ordered
	 */
	protected String number_of_stories = NUMBER_OF_STORIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystem_type() <em>System type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_type()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystem_type() <em>System type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_type()
	 * @generated
	 * @ordered
	 */
	protected String system_type = SYSTEM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxiliary_strategy() <em>Auxiliary strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliary_strategy()
	 * @generated
	 * @ordered
	 */
	protected static final String AUXILIARY_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxiliary_strategy() <em>Auxiliary strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliary_strategy()
	 * @generated
	 * @ordered
	 */
	protected String auxiliary_strategy = AUXILIARY_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystem_mode() <em>System mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystem_mode() <em>System mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_mode()
	 * @generated
	 * @ordered
	 */
	protected String system_mode = SYSTEM_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeating_system_type() <em>Heating system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_system_type()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_SYSTEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_system_type() <em>Heating system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_system_type()
	 * @generated
	 * @ordered
	 */
	protected String heating_system_type = HEATING_SYSTEM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooling_system_type() <em>Cooling system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_system_type()
	 * @generated
	 * @ordered
	 */
	protected static final String COOLING_SYSTEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCooling_system_type() <em>Cooling system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_system_type()
	 * @generated
	 * @ordered
	 */
	protected String cooling_system_type = COOLING_SYSTEM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxiliary_system_type() <em>Auxiliary system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliary_system_type()
	 * @generated
	 * @ordered
	 */
	protected static final String AUXILIARY_SYSTEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxiliary_system_type() <em>Auxiliary system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliary_system_type()
	 * @generated
	 * @ordered
	 */
	protected String auxiliary_system_type = AUXILIARY_SYSTEM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFan_type() <em>Fan type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_type()
	 * @generated
	 * @ordered
	 */
	protected static final String FAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFan_type() <em>Fan type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFan_type()
	 * @generated
	 * @ordered
	 */
	protected String fan_type = FAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermal_integrity_level() <em>Thermal integrity level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermal_integrity_level()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMAL_INTEGRITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermal_integrity_level() <em>Thermal integrity level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermal_integrity_level()
	 * @generated
	 * @ordered
	 */
	protected String thermal_integrity_level = THERMAL_INTEGRITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlass_type() <em>Glass type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlass_type()
	 * @generated
	 * @ordered
	 */
	protected static final String GLASS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlass_type() <em>Glass type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlass_type()
	 * @generated
	 * @ordered
	 */
	protected String glass_type = GLASS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindow_frame() <em>Window frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow_frame()
	 * @generated
	 * @ordered
	 */
	protected static final String WINDOW_FRAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindow_frame() <em>Window frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow_frame()
	 * @generated
	 * @ordered
	 */
	protected String window_frame = WINDOW_FRAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing_treatment() <em>Glazing treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing_treatment()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_TREATMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing_treatment() <em>Glazing treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing_treatment()
	 * @generated
	 * @ordered
	 */
	protected String glazing_treatment = GLAZING_TREATMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing_layers() <em>Glazing layers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing_layers()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_LAYERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing_layers() <em>Glazing layers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing_layers()
	 * @generated
	 * @ordered
	 */
	protected String glazing_layers = GLAZING_LAYERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotor_model() <em>Motor model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_model()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTOR_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotor_model() <em>Motor model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_model()
	 * @generated
	 * @ordered
	 */
	protected String motor_model = MOTOR_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotor_efficiency() <em>Motor efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_efficiency()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTOR_EFFICIENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotor_efficiency() <em>Motor efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_efficiency()
	 * @generated
	 * @ordered
	 */
	protected String motor_efficiency = MOTOR_EFFICIENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac_motor_efficiency() <em>Hvac motor efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_motor_efficiency()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_MOTOR_EFFICIENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac_motor_efficiency() <em>Hvac motor efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_motor_efficiency()
	 * @generated
	 * @ordered
	 */
	protected String hvac_motor_efficiency = HVAC_MOTOR_EFFICIENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac_motor_loss_power_factor() <em>Hvac motor loss power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_motor_loss_power_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_MOTOR_LOSS_POWER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac_motor_loss_power_factor() <em>Hvac motor loss power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_motor_loss_power_factor()
	 * @generated
	 * @ordered
	 */
	protected String hvac_motor_loss_power_factor = HVAC_MOTOR_LOSS_POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRroof() <em>Rroof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRroof()
	 * @generated
	 * @ordered
	 */
	protected static final String RROOF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRroof() <em>Rroof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRroof()
	 * @generated
	 * @ordered
	 */
	protected String rroof = RROOF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRwall() <em>Rwall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRwall()
	 * @generated
	 * @ordered
	 */
	protected static final String RWALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRwall() <em>Rwall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRwall()
	 * @generated
	 * @ordered
	 */
	protected String rwall = RWALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRfloor() <em>Rfloor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfloor()
	 * @generated
	 * @ordered
	 */
	protected static final String RFLOOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRfloor() <em>Rfloor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfloor()
	 * @generated
	 * @ordered
	 */
	protected String rfloor = RFLOOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRwindows() <em>Rwindows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRwindows()
	 * @generated
	 * @ordered
	 */
	protected static final String RWINDOWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRwindows() <em>Rwindows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRwindows()
	 * @generated
	 * @ordered
	 */
	protected String rwindows = RWINDOWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRdoors() <em>Rdoors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdoors()
	 * @generated
	 * @ordered
	 */
	protected static final String RDOORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRdoors() <em>Rdoors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdoors()
	 * @generated
	 * @ordered
	 */
	protected String rdoors = RDOORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac_breaker_rating() <em>Hvac breaker rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_breaker_rating()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_BREAKER_RATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac_breaker_rating() <em>Hvac breaker rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_breaker_rating()
	 * @generated
	 * @ordered
	 */
	protected String hvac_breaker_rating = HVAC_BREAKER_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac_power_factor() <em>Hvac power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_power_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_POWER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac_power_factor() <em>Hvac power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_power_factor()
	 * @generated
	 * @ordered
	 */
	protected String hvac_power_factor = HVAC_POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac_load() <em>Hvac load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_load()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac_load() <em>Hvac load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_load()
	 * @generated
	 * @ordered
	 */
	protected String hvac_load = HVAC_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel() <em>Panel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel() <em>Panel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel()
	 * @generated
	 * @ordered
	 */
	protected String panel = PANEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__energy() <em>Panel energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__energy()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__energy() <em>Panel energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__energy()
	 * @generated
	 * @ordered
	 */
	protected String panel__energy = PANEL_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__power() <em>Panel power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__power()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__power() <em>Panel power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__power()
	 * @generated
	 * @ordered
	 */
	protected String panel__power = PANEL_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__peak_demand() <em>Panel peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__peak_demand()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_PEAK_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__peak_demand() <em>Panel peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__peak_demand()
	 * @generated
	 * @ordered
	 */
	protected String panel__peak_demand = PANEL_PEAK_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__heatgain() <em>Panel heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__heatgain()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_HEATGAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__heatgain() <em>Panel heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__heatgain()
	 * @generated
	 * @ordered
	 */
	protected String panel__heatgain = PANEL_HEATGAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__heatgain_fraction() <em>Panel heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__heatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_HEATGAIN_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__heatgain_fraction() <em>Panel heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__heatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected String panel__heatgain_fraction = PANEL_HEATGAIN_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__current_fraction() <em>Panel current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__current_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_CURRENT_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__current_fraction() <em>Panel current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__current_fraction()
	 * @generated
	 * @ordered
	 */
	protected String panel__current_fraction = PANEL_CURRENT_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__impedance_fraction() <em>Panel impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__impedance_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_IMPEDANCE_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__impedance_fraction() <em>Panel impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__impedance_fraction()
	 * @generated
	 * @ordered
	 */
	protected String panel__impedance_fraction = PANEL_IMPEDANCE_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__power_fraction() <em>Panel power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__power_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_POWER_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__power_fraction() <em>Panel power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__power_fraction()
	 * @generated
	 * @ordered
	 */
	protected String panel__power_fraction = PANEL_POWER_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__power_factor() <em>Panel power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__power_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_POWER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__power_factor() <em>Panel power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__power_factor()
	 * @generated
	 * @ordered
	 */
	protected String panel__power_factor = PANEL_POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__constant_power() <em>Panel constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__constant_power()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_CONSTANT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__constant_power() <em>Panel constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__constant_power()
	 * @generated
	 * @ordered
	 */
	protected String panel__constant_power = PANEL_CONSTANT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__constant_current() <em>Panel constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__constant_current()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_CONSTANT_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__constant_current() <em>Panel constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__constant_current()
	 * @generated
	 * @ordered
	 */
	protected String panel__constant_current = PANEL_CONSTANT_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__constant_admittance() <em>Panel constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__constant_admittance()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_CONSTANT_ADMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__constant_admittance() <em>Panel constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__constant_admittance()
	 * @generated
	 * @ordered
	 */
	protected String panel__constant_admittance = PANEL_CONSTANT_ADMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__voltage_factor() <em>Panel voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__voltage_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_VOLTAGE_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__voltage_factor() <em>Panel voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__voltage_factor()
	 * @generated
	 * @ordered
	 */
	protected String panel__voltage_factor = PANEL_VOLTAGE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel__configuration() <em>Panel configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__configuration()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_CONFIGURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel__configuration() <em>Panel configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel__configuration()
	 * @generated
	 * @ordered
	 */
	protected String panel__configuration = PANEL_CONFIGURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesign_internal_gain_density() <em>Design internal gain density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_internal_gain_density()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_INTERNAL_GAIN_DENSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesign_internal_gain_density() <em>Design internal gain density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_internal_gain_density()
	 * @generated
	 * @ordered
	 */
	protected String design_internal_gain_density = DESIGN_INTERNAL_GAIN_DENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final String A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected String a = A_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final String B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected String b = B_EDEFAULT;

	/**
	 * The default value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final String C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected String c = C_EDEFAULT;

	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final String D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected String d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getC1() <em>C1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1()
	 * @generated
	 * @ordered
	 */
	protected static final String C1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC1() <em>C1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1()
	 * @generated
	 * @ordered
	 */
	protected String c1 = C1_EDEFAULT;

	/**
	 * The default value of the '{@link #getC2() <em>C2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2()
	 * @generated
	 * @ordered
	 */
	protected static final String C2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC2() <em>C2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2()
	 * @generated
	 * @ordered
	 */
	protected String c2 = C2_EDEFAULT;

	/**
	 * The default value of the '{@link #getA3() <em>A3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA3()
	 * @generated
	 * @ordered
	 */
	protected static final String A3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getA3() <em>A3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA3()
	 * @generated
	 * @ordered
	 */
	protected String a3 = A3_EDEFAULT;

	/**
	 * The default value of the '{@link #getA4() <em>A4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA4()
	 * @generated
	 * @ordered
	 */
	protected static final String A4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getA4() <em>A4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA4()
	 * @generated
	 * @ordered
	 */
	protected String a4 = A4_EDEFAULT;

	/**
	 * The default value of the '{@link #getK1() <em>K1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK1()
	 * @generated
	 * @ordered
	 */
	protected static final String K1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getK1() <em>K1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK1()
	 * @generated
	 * @ordered
	 */
	protected String k1 = K1_EDEFAULT;

	/**
	 * The default value of the '{@link #getK2() <em>K2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK2()
	 * @generated
	 * @ordered
	 */
	protected static final String K2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getK2() <em>K2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK2()
	 * @generated
	 * @ordered
	 */
	protected String k2 = K2_EDEFAULT;

	/**
	 * The default value of the '{@link #getR1() <em>R1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR1()
	 * @generated
	 * @ordered
	 */
	protected static final String R1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getR1() <em>R1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR1()
	 * @generated
	 * @ordered
	 */
	protected String r1 = R1_EDEFAULT;

	/**
	 * The default value of the '{@link #getR2() <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected static final String R2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getR2() <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected String r2 = R2_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeq() <em>Teq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeq()
	 * @generated
	 * @ordered
	 */
	protected static final String TEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeq() <em>Teq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeq()
	 * @generated
	 * @ordered
	 */
	protected String teq = TEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getTevent() <em>Tevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTevent()
	 * @generated
	 * @ordered
	 */
	protected static final String TEVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTevent() <em>Tevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTevent()
	 * @generated
	 * @ordered
	 */
	protected String tevent = TEVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQi() <em>Qi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQi()
	 * @generated
	 * @ordered
	 */
	protected static final String QI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQi() <em>Qi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQi()
	 * @generated
	 * @ordered
	 */
	protected String qi = QI_EDEFAULT;

	/**
	 * The default value of the '{@link #getQa() <em>Qa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQa()
	 * @generated
	 * @ordered
	 */
	protected static final String QA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQa() <em>Qa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQa()
	 * @generated
	 * @ordered
	 */
	protected String qa = QA_EDEFAULT;

	/**
	 * The default value of the '{@link #getQm() <em>Qm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQm()
	 * @generated
	 * @ordered
	 */
	protected static final String QM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQm() <em>Qm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQm()
	 * @generated
	 * @ordered
	 */
	protected String qm = QM_EDEFAULT;

	/**
	 * The default value of the '{@link #getQh() <em>Qh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQh()
	 * @generated
	 * @ordered
	 */
	protected static final String QH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQh() <em>Qh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQh()
	 * @generated
	 * @ordered
	 */
	protected String qh = QH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDTair() <em>DTair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTair()
	 * @generated
	 * @ordered
	 */
	protected static final String DTAIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDTair() <em>DTair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTair()
	 * @generated
	 * @ordered
	 */
	protected String dTair = DTAIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSol_inc() <em>Sol inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSol_inc()
	 * @generated
	 * @ordered
	 */
	protected static final String SOL_INC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSol_inc() <em>Sol inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSol_inc()
	 * @generated
	 * @ordered
	 */
	protected String sol_inc = SOL_INC_EDEFAULT;

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
	protected HouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getHouse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeather() {
		// Generated by python script located in this directory
		if (!lock.containsKey("weather")) lock.put("weather", new Boolean(false));
			if (!(Boolean)lock.get("weather")){
				lock.put("weather", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"weather");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Weather");
					weather= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeather(String newWeather) {
		String oldWeather = weather;
		weather = newWeather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__WEATHER, oldWeather, weather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloor_area() {
		// Generated by python script located in this directory
		if (!lock.containsKey("floor_area")) lock.put("floor_area", new Boolean(false));
			if (!(Boolean)lock.get("floor_area")){
				lock.put("floor_area", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"floor_area");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Floor_area");
					floor_area= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return floor_area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor_area(String newFloor_area) {
		String oldFloor_area = floor_area;
		floor_area = newFloor_area;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__FLOOR_AREA, oldFloor_area, floor_area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGross_wall_area() {
		// Generated by python script located in this directory
		if (!lock.containsKey("gross_wall_area")) lock.put("gross_wall_area", new Boolean(false));
			if (!(Boolean)lock.get("gross_wall_area")){
				lock.put("gross_wall_area", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"gross_wall_area");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Gross_wall_area");
					gross_wall_area= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return gross_wall_area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGross_wall_area(String newGross_wall_area) {
		String oldGross_wall_area = gross_wall_area;
		gross_wall_area = newGross_wall_area;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__GROSS_WALL_AREA, oldGross_wall_area, gross_wall_area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCeiling_height() {
		// Generated by python script located in this directory
		if (!lock.containsKey("ceiling_height")) lock.put("ceiling_height", new Boolean(false));
			if (!(Boolean)lock.get("ceiling_height")){
				lock.put("ceiling_height", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"ceiling_height");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Ceiling_height");
					ceiling_height= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return ceiling_height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCeiling_height(String newCeiling_height) {
		String oldCeiling_height = ceiling_height;
		ceiling_height = newCeiling_height;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__CEILING_HEIGHT, oldCeiling_height, ceiling_height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspect_ratio() {
		// Generated by python script located in this directory
		if (!lock.containsKey("aspect_ratio")) lock.put("aspect_ratio", new Boolean(false));
			if (!(Boolean)lock.get("aspect_ratio")){
				lock.put("aspect_ratio", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"aspect_ratio");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Aspect_ratio");
					aspect_ratio= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return aspect_ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspect_ratio(String newAspect_ratio) {
		String oldAspect_ratio = aspect_ratio;
		aspect_ratio = newAspect_ratio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__ASPECT_RATIO, oldAspect_ratio, aspect_ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvelope_UA() {
		// Generated by python script located in this directory
		if (!lock.containsKey("envelope_UA")) lock.put("envelope_UA", new Boolean(false));
			if (!(Boolean)lock.get("envelope_UA")){
				lock.put("envelope_UA", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"envelope_UA");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Envelope_UA");
					envelope_UA= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return envelope_UA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvelope_UA(String newEnvelope_UA) {
		String oldEnvelope_UA = envelope_UA;
		envelope_UA = newEnvelope_UA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__ENVELOPE_UA, oldEnvelope_UA, envelope_UA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWindow_wall_ratio() {
		// Generated by python script located in this directory
		if (!lock.containsKey("window_wall_ratio")) lock.put("window_wall_ratio", new Boolean(false));
			if (!(Boolean)lock.get("window_wall_ratio")){
				lock.put("window_wall_ratio", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"window_wall_ratio");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Window_wall_ratio");
					window_wall_ratio= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return window_wall_ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow_wall_ratio(String newWindow_wall_ratio) {
		String oldWindow_wall_ratio = window_wall_ratio;
		window_wall_ratio = newWindow_wall_ratio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__WINDOW_WALL_RATIO, oldWindow_wall_ratio, window_wall_ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber_of_doors() {
		// Generated by python script located in this directory
		if (!lock.containsKey("number_of_doors")) lock.put("number_of_doors", new Boolean(false));
			if (!(Boolean)lock.get("number_of_doors")){
				lock.put("number_of_doors", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"number_of_doors");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Number_of_doors");
					number_of_doors= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return number_of_doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_of_doors(String newNumber_of_doors) {
		String oldNumber_of_doors = number_of_doors;
		number_of_doors = newNumber_of_doors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__NUMBER_OF_DOORS, oldNumber_of_doors, number_of_doors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExterior_wall_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("exterior_wall_fraction")) lock.put("exterior_wall_fraction", new Boolean(false));
			if (!(Boolean)lock.get("exterior_wall_fraction")){
				lock.put("exterior_wall_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"exterior_wall_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Exterior_wall_fraction");
					exterior_wall_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return exterior_wall_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExterior_wall_fraction(String newExterior_wall_fraction) {
		String oldExterior_wall_fraction = exterior_wall_fraction;
		exterior_wall_fraction = newExterior_wall_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__EXTERIOR_WALL_FRACTION, oldExterior_wall_fraction, exterior_wall_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterior_exterior_wall_ratio() {
		// Generated by python script located in this directory
		if (!lock.containsKey("interior_exterior_wall_ratio")) lock.put("interior_exterior_wall_ratio", new Boolean(false));
			if (!(Boolean)lock.get("interior_exterior_wall_ratio")){
				lock.put("interior_exterior_wall_ratio", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"interior_exterior_wall_ratio");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Interior_exterior_wall_ratio");
					interior_exterior_wall_ratio= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return interior_exterior_wall_ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterior_exterior_wall_ratio(String newInterior_exterior_wall_ratio) {
		String oldInterior_exterior_wall_ratio = interior_exterior_wall_ratio;
		interior_exterior_wall_ratio = newInterior_exterior_wall_ratio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__INTERIOR_EXTERIOR_WALL_RATIO, oldInterior_exterior_wall_ratio, interior_exterior_wall_ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExterior_ceiling_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("exterior_ceiling_fraction")) lock.put("exterior_ceiling_fraction", new Boolean(false));
			if (!(Boolean)lock.get("exterior_ceiling_fraction")){
				lock.put("exterior_ceiling_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"exterior_ceiling_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Exterior_ceiling_fraction");
					exterior_ceiling_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return exterior_ceiling_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExterior_ceiling_fraction(String newExterior_ceiling_fraction) {
		String oldExterior_ceiling_fraction = exterior_ceiling_fraction;
		exterior_ceiling_fraction = newExterior_ceiling_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__EXTERIOR_CEILING_FRACTION, oldExterior_ceiling_fraction, exterior_ceiling_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExterior_floor_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("exterior_floor_fraction")) lock.put("exterior_floor_fraction", new Boolean(false));
			if (!(Boolean)lock.get("exterior_floor_fraction")){
				lock.put("exterior_floor_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"exterior_floor_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Exterior_floor_fraction");
					exterior_floor_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return exterior_floor_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExterior_floor_fraction(String newExterior_floor_fraction) {
		String oldExterior_floor_fraction = exterior_floor_fraction;
		exterior_floor_fraction = newExterior_floor_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__EXTERIOR_FLOOR_FRACTION, oldExterior_floor_fraction, exterior_floor_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWindow_shading() {
		// Generated by python script located in this directory
		if (!lock.containsKey("window_shading")) lock.put("window_shading", new Boolean(false));
			if (!(Boolean)lock.get("window_shading")){
				lock.put("window_shading", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"window_shading");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Window_shading");
					window_shading= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return window_shading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow_shading(String newWindow_shading) {
		String oldWindow_shading = window_shading;
		window_shading = newWindow_shading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__WINDOW_SHADING, oldWindow_shading, window_shading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWindow_exterior_transmission_coefficient() {
		// Generated by python script located in this directory
		if (!lock.containsKey("window_exterior_transmission_coefficient")) lock.put("window_exterior_transmission_coefficient", new Boolean(false));
			if (!(Boolean)lock.get("window_exterior_transmission_coefficient")){
				lock.put("window_exterior_transmission_coefficient", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"window_exterior_transmission_coefficient");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Window_exterior_transmission_coefficient");
					window_exterior_transmission_coefficient= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return window_exterior_transmission_coefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow_exterior_transmission_coefficient(String newWindow_exterior_transmission_coefficient) {
		String oldWindow_exterior_transmission_coefficient = window_exterior_transmission_coefficient;
		window_exterior_transmission_coefficient = newWindow_exterior_transmission_coefficient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT, oldWindow_exterior_transmission_coefficient, window_exterior_transmission_coefficient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_heatgain_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("solar_heatgain_factor")) lock.put("solar_heatgain_factor", new Boolean(false));
			if (!(Boolean)lock.get("solar_heatgain_factor")){
				lock.put("solar_heatgain_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"solar_heatgain_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Solar_heatgain_factor");
					solar_heatgain_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return solar_heatgain_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_heatgain_factor(String newSolar_heatgain_factor) {
		String oldSolar_heatgain_factor = solar_heatgain_factor;
		solar_heatgain_factor = newSolar_heatgain_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__SOLAR_HEATGAIN_FACTOR, oldSolar_heatgain_factor, solar_heatgain_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAirchange_per_hour() {
		// Generated by python script located in this directory
		if (!lock.containsKey("airchange_per_hour")) lock.put("airchange_per_hour", new Boolean(false));
			if (!(Boolean)lock.get("airchange_per_hour")){
				lock.put("airchange_per_hour", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"airchange_per_hour");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Airchange_per_hour");
					airchange_per_hour= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return airchange_per_hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAirchange_per_hour(String newAirchange_per_hour) {
		String oldAirchange_per_hour = airchange_per_hour;
		airchange_per_hour = newAirchange_per_hour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AIRCHANGE_PER_HOUR, oldAirchange_per_hour, airchange_per_hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAirchange_UA() {
		// Generated by python script located in this directory
		if (!lock.containsKey("airchange_UA")) lock.put("airchange_UA", new Boolean(false));
			if (!(Boolean)lock.get("airchange_UA")){
				lock.put("airchange_UA", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"airchange_UA");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Airchange_UA");
					airchange_UA= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return airchange_UA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAirchange_UA(String newAirchange_UA) {
		String oldAirchange_UA = airchange_UA;
		airchange_UA = newAirchange_UA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AIRCHANGE_UA, oldAirchange_UA, airchange_UA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternal_gain() {
		// Generated by python script located in this directory
		if (!lock.containsKey("internal_gain")) lock.put("internal_gain", new Boolean(false));
			if (!(Boolean)lock.get("internal_gain")){
				lock.put("internal_gain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"internal_gain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Internal_gain");
					internal_gain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return internal_gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternal_gain(String newInternal_gain) {
		String oldInternal_gain = internal_gain;
		internal_gain = newInternal_gain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__INTERNAL_GAIN, oldInternal_gain, internal_gain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_gain() {
		// Generated by python script located in this directory
		if (!lock.containsKey("solar_gain")) lock.put("solar_gain", new Boolean(false));
			if (!(Boolean)lock.get("solar_gain")){
				lock.put("solar_gain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"solar_gain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Solar_gain");
					solar_gain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return solar_gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_gain(String newSolar_gain) {
		String oldSolar_gain = solar_gain;
		solar_gain = newSolar_gain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__SOLAR_GAIN, oldSolar_gain, solar_gain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeat_cool_gain() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heat_cool_gain")) lock.put("heat_cool_gain", new Boolean(false));
			if (!(Boolean)lock.get("heat_cool_gain")){
				lock.put("heat_cool_gain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heat_cool_gain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heat_cool_gain");
					heat_cool_gain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heat_cool_gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeat_cool_gain(String newHeat_cool_gain) {
		String oldHeat_cool_gain = heat_cool_gain;
		heat_cool_gain = newHeat_cool_gain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HEAT_COOL_GAIN, oldHeat_cool_gain, heat_cool_gain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermostat_deadband() {
		// Generated by python script located in this directory
		if (!lock.containsKey("thermostat_deadband")) lock.put("thermostat_deadband", new Boolean(false));
			if (!(Boolean)lock.get("thermostat_deadband")){
				lock.put("thermostat_deadband", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"thermostat_deadband");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Thermostat_deadband");
					thermostat_deadband= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__THERMOSTAT_DEADBAND, oldThermostat_deadband, thermostat_deadband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermostat_cycle_time() {
		// Generated by python script located in this directory
		if (!lock.containsKey("thermostat_cycle_time")) lock.put("thermostat_cycle_time", new Boolean(false));
			if (!(Boolean)lock.get("thermostat_cycle_time")){
				lock.put("thermostat_cycle_time", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"thermostat_cycle_time");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Thermostat_cycle_time");
					thermostat_cycle_time= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return thermostat_cycle_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermostat_cycle_time(String newThermostat_cycle_time) {
		String oldThermostat_cycle_time = thermostat_cycle_time;
		thermostat_cycle_time = newThermostat_cycle_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__THERMOSTAT_CYCLE_TIME, oldThermostat_cycle_time, thermostat_cycle_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermostat_last_cycle_time() {
		// Generated by python script located in this directory
		if (!lock.containsKey("thermostat_last_cycle_time")) lock.put("thermostat_last_cycle_time", new Boolean(false));
			if (!(Boolean)lock.get("thermostat_last_cycle_time")){
				lock.put("thermostat_last_cycle_time", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"thermostat_last_cycle_time");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Thermostat_last_cycle_time");
					thermostat_last_cycle_time= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return thermostat_last_cycle_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermostat_last_cycle_time(String newThermostat_last_cycle_time) {
		String oldThermostat_last_cycle_time = thermostat_last_cycle_time;
		thermostat_last_cycle_time = newThermostat_last_cycle_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__THERMOSTAT_LAST_CYCLE_TIME, oldThermostat_last_cycle_time, thermostat_last_cycle_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_setpoint() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heating_setpoint")) lock.put("heating_setpoint", new Boolean(false));
			if (!(Boolean)lock.get("heating_setpoint")){
				lock.put("heating_setpoint", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heating_setpoint");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heating_setpoint");
					heating_setpoint= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heating_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_setpoint(String newHeating_setpoint) {
		String oldHeating_setpoint = heating_setpoint;
		heating_setpoint = newHeating_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HEATING_SETPOINT, oldHeating_setpoint, heating_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCooling_setpoint() {
		// Generated by python script located in this directory
		if (!lock.containsKey("cooling_setpoint")) lock.put("cooling_setpoint", new Boolean(false));
			if (!(Boolean)lock.get("cooling_setpoint")){
				lock.put("cooling_setpoint", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"cooling_setpoint");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Cooling_setpoint");
					cooling_setpoint= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return cooling_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooling_setpoint(String newCooling_setpoint) {
		String oldCooling_setpoint = cooling_setpoint;
		cooling_setpoint = newCooling_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__COOLING_SETPOINT, oldCooling_setpoint, cooling_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesign_heating_setpoint() {
		// Generated by python script located in this directory
		if (!lock.containsKey("design_heating_setpoint")) lock.put("design_heating_setpoint", new Boolean(false));
			if (!(Boolean)lock.get("design_heating_setpoint")){
				lock.put("design_heating_setpoint", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"design_heating_setpoint");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Design_heating_setpoint");
					design_heating_setpoint= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return design_heating_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign_heating_setpoint(String newDesign_heating_setpoint) {
		String oldDesign_heating_setpoint = design_heating_setpoint;
		design_heating_setpoint = newDesign_heating_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__DESIGN_HEATING_SETPOINT, oldDesign_heating_setpoint, design_heating_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesign_cooling_setpoint() {
		// Generated by python script located in this directory
		if (!lock.containsKey("design_cooling_setpoint")) lock.put("design_cooling_setpoint", new Boolean(false));
			if (!(Boolean)lock.get("design_cooling_setpoint")){
				lock.put("design_cooling_setpoint", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"design_cooling_setpoint");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Design_cooling_setpoint");
					design_cooling_setpoint= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return design_cooling_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign_cooling_setpoint(String newDesign_cooling_setpoint) {
		String oldDesign_cooling_setpoint = design_cooling_setpoint;
		design_cooling_setpoint = newDesign_cooling_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__DESIGN_COOLING_SETPOINT, oldDesign_cooling_setpoint, design_cooling_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesign_heating_capacity() {
		// Generated by python script located in this directory
		if (!lock.containsKey("design_heating_capacity")) lock.put("design_heating_capacity", new Boolean(false));
			if (!(Boolean)lock.get("design_heating_capacity")){
				lock.put("design_heating_capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"design_heating_capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Design_heating_capacity");
					design_heating_capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return design_heating_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign_heating_capacity(String newDesign_heating_capacity) {
		String oldDesign_heating_capacity = design_heating_capacity;
		design_heating_capacity = newDesign_heating_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__DESIGN_HEATING_CAPACITY, oldDesign_heating_capacity, design_heating_capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesign_cooling_capacity() {
		// Generated by python script located in this directory
		if (!lock.containsKey("design_cooling_capacity")) lock.put("design_cooling_capacity", new Boolean(false));
			if (!(Boolean)lock.get("design_cooling_capacity")){
				lock.put("design_cooling_capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"design_cooling_capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Design_cooling_capacity");
					design_cooling_capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return design_cooling_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign_cooling_capacity(String newDesign_cooling_capacity) {
		String oldDesign_cooling_capacity = design_cooling_capacity;
		design_cooling_capacity = newDesign_cooling_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__DESIGN_COOLING_CAPACITY, oldDesign_cooling_capacity, design_cooling_capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdj_heating_cap() {
		// Generated by python script located in this directory
		if (!lock.containsKey("adj_heating_cap")) lock.put("adj_heating_cap", new Boolean(false));
			if (!(Boolean)lock.get("adj_heating_cap")){
				lock.put("adj_heating_cap", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"adj_heating_cap");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Adj_heating_cap");
					adj_heating_cap= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return adj_heating_cap;
	}

	private void checkUnlock() {
		Iterator i = lock.values().iterator();
		while (i.hasNext()){
			if (i.next().equals(false)) return;
		}
		resetLock();
	}

	private void resetLock() {
		Timer timer = new Timer();
		class Task extends TimerTask{
			public void run() {
				Iterator i = lock.values().iterator();
				while (i.hasNext()){
					Map.Entry<String,Boolean> m = (Map.Entry<String,Boolean>) i.next();
					Boolean b = m.getValue();
					b = false;
				}
			}	
		}
		timer.schedule(new Task(), 3000);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdj_heating_cap(String newAdj_heating_cap) {
		String oldAdj_heating_cap = adj_heating_cap;
		adj_heating_cap = newAdj_heating_cap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__ADJ_HEATING_CAP, oldAdj_heating_cap, adj_heating_cap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSys_rated_cap() {
		// Generated by python script located in this directory
		if (!lock.containsKey("sys_rated_cap")) lock.put("sys_rated_cap", new Boolean(false));
			if (!(Boolean)lock.get("sys_rated_cap")){
				lock.put("sys_rated_cap", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"sys_rated_cap");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Sys_rated_cap");
					sys_rated_cap= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return sys_rated_cap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSys_rated_cap(String newSys_rated_cap) {
		String oldSys_rated_cap = sys_rated_cap;
		sys_rated_cap = newSys_rated_cap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__SYS_RATED_CAP, oldSys_rated_cap, sys_rated_cap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCooling_design_temperature() {
		// Generated by python script located in this directory
		if (!lock.containsKey("cooling_design_temperature")) lock.put("cooling_design_temperature", new Boolean(false));
			if (!(Boolean)lock.get("cooling_design_temperature")){
				lock.put("cooling_design_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"cooling_design_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Cooling_design_temperature");
					cooling_design_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return cooling_design_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooling_design_temperature(String newCooling_design_temperature) {
		String oldCooling_design_temperature = cooling_design_temperature;
		cooling_design_temperature = newCooling_design_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__COOLING_DESIGN_TEMPERATURE, oldCooling_design_temperature, cooling_design_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_design_temperature() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heating_design_temperature")) lock.put("heating_design_temperature", new Boolean(false));
			if (!(Boolean)lock.get("heating_design_temperature")){
				lock.put("heating_design_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heating_design_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heating_design_temperature");
					heating_design_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heating_design_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_design_temperature(String newHeating_design_temperature) {
		String oldHeating_design_temperature = heating_design_temperature;
		heating_design_temperature = newHeating_design_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HEATING_DESIGN_TEMPERATURE, oldHeating_design_temperature, heating_design_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesign_peak_solar() {
		// Generated by python script located in this directory
		if (!lock.containsKey("design_peak_solar")) lock.put("design_peak_solar", new Boolean(false));
			if (!(Boolean)lock.get("design_peak_solar")){
				lock.put("design_peak_solar", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"design_peak_solar");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Design_peak_solar");
					design_peak_solar= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return design_peak_solar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign_peak_solar(String newDesign_peak_solar) {
		String oldDesign_peak_solar = design_peak_solar;
		design_peak_solar = newDesign_peak_solar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__DESIGN_PEAK_SOLAR, oldDesign_peak_solar, design_peak_solar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesign_internal_gains() {
		// Generated by python script located in this directory
		if (!lock.containsKey("design_internal_gains")) lock.put("design_internal_gains", new Boolean(false));
			if (!(Boolean)lock.get("design_internal_gains")){
				lock.put("design_internal_gains", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"design_internal_gains");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Design_internal_gains");
					design_internal_gains= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return design_internal_gains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign_internal_gains(String newDesign_internal_gains) {
		String oldDesign_internal_gains = design_internal_gains;
		design_internal_gains = newDesign_internal_gains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__DESIGN_INTERNAL_GAINS, oldDesign_internal_gains, design_internal_gains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAir_heat_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("air_heat_fraction")) lock.put("air_heat_fraction", new Boolean(false));
			if (!(Boolean)lock.get("air_heat_fraction")){
				lock.put("air_heat_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"air_heat_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Air_heat_fraction");
					air_heat_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return air_heat_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAir_heat_fraction(String newAir_heat_fraction) {
		String oldAir_heat_fraction = air_heat_fraction;
		air_heat_fraction = newAir_heat_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AIR_HEAT_FRACTION, oldAir_heat_fraction, air_heat_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuxiliary_heat_capacity() {
		// Generated by python script located in this directory
		if (!lock.containsKey("auxiliary_heat_capacity")) lock.put("auxiliary_heat_capacity", new Boolean(false));
			if (!(Boolean)lock.get("auxiliary_heat_capacity")){
				lock.put("auxiliary_heat_capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"auxiliary_heat_capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Auxiliary_heat_capacity");
					auxiliary_heat_capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return auxiliary_heat_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliary_heat_capacity(String newAuxiliary_heat_capacity) {
		String oldAuxiliary_heat_capacity = auxiliary_heat_capacity;
		auxiliary_heat_capacity = newAuxiliary_heat_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AUXILIARY_HEAT_CAPACITY, oldAuxiliary_heat_capacity, auxiliary_heat_capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAux_heat_deadband() {
		// Generated by python script located in this directory
		if (!lock.containsKey("aux_heat_deadband")) lock.put("aux_heat_deadband", new Boolean(false));
			if (!(Boolean)lock.get("aux_heat_deadband")){
				lock.put("aux_heat_deadband", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"aux_heat_deadband");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Aux_heat_deadband");
					aux_heat_deadband= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return aux_heat_deadband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux_heat_deadband(String newAux_heat_deadband) {
		String oldAux_heat_deadband = aux_heat_deadband;
		aux_heat_deadband = newAux_heat_deadband;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AUX_HEAT_DEADBAND, oldAux_heat_deadband, aux_heat_deadband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAux_heat_temperature_lockout() {
		// Generated by python script located in this directory
		if (!lock.containsKey("aux_heat_temperature_lockout")) lock.put("aux_heat_temperature_lockout", new Boolean(false));
			if (!(Boolean)lock.get("aux_heat_temperature_lockout")){
				lock.put("aux_heat_temperature_lockout", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"aux_heat_temperature_lockout");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Aux_heat_temperature_lockout");
					aux_heat_temperature_lockout= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return aux_heat_temperature_lockout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux_heat_temperature_lockout(String newAux_heat_temperature_lockout) {
		String oldAux_heat_temperature_lockout = aux_heat_temperature_lockout;
		aux_heat_temperature_lockout = newAux_heat_temperature_lockout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT, oldAux_heat_temperature_lockout, aux_heat_temperature_lockout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAux_heat_time_delay() {
		// Generated by python script located in this directory
		if (!lock.containsKey("aux_heat_time_delay")) lock.put("aux_heat_time_delay", new Boolean(false));
			if (!(Boolean)lock.get("aux_heat_time_delay")){
				lock.put("aux_heat_time_delay", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"aux_heat_time_delay");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Aux_heat_time_delay");
					aux_heat_time_delay= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return aux_heat_time_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux_heat_time_delay(String newAux_heat_time_delay) {
		String oldAux_heat_time_delay = aux_heat_time_delay;
		aux_heat_time_delay = newAux_heat_time_delay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AUX_HEAT_TIME_DELAY, oldAux_heat_time_delay, aux_heat_time_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCooling_supply_air_temp() {
		// Generated by python script located in this directory
		if (!lock.containsKey("cooling_supply_air_temp")) lock.put("cooling_supply_air_temp", new Boolean(false));
			if (!(Boolean)lock.get("cooling_supply_air_temp")){
				lock.put("cooling_supply_air_temp", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"cooling_supply_air_temp");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Cooling_supply_air_temp");
					cooling_supply_air_temp= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return cooling_supply_air_temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooling_supply_air_temp(String newCooling_supply_air_temp) {
		String oldCooling_supply_air_temp = cooling_supply_air_temp;
		cooling_supply_air_temp = newCooling_supply_air_temp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__COOLING_SUPPLY_AIR_TEMP, oldCooling_supply_air_temp, cooling_supply_air_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_supply_air_temp() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heating_supply_air_temp")) lock.put("heating_supply_air_temp", new Boolean(false));
			if (!(Boolean)lock.get("heating_supply_air_temp")){
				lock.put("heating_supply_air_temp", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heating_supply_air_temp");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heating_supply_air_temp");
					heating_supply_air_temp= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heating_supply_air_temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_supply_air_temp(String newHeating_supply_air_temp) {
		String oldHeating_supply_air_temp = heating_supply_air_temp;
		heating_supply_air_temp = newHeating_supply_air_temp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HEATING_SUPPLY_AIR_TEMP, oldHeating_supply_air_temp, heating_supply_air_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuct_pressure_drop() {
		// Generated by python script located in this directory
		if (!lock.containsKey("duct_pressure_drop")) lock.put("duct_pressure_drop", new Boolean(false));
			if (!(Boolean)lock.get("duct_pressure_drop")){
				lock.put("duct_pressure_drop", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"duct_pressure_drop");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Duct_pressure_drop");
					duct_pressure_drop= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return duct_pressure_drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuct_pressure_drop(String newDuct_pressure_drop) {
		String oldDuct_pressure_drop = duct_pressure_drop;
		duct_pressure_drop = newDuct_pressure_drop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__DUCT_PRESSURE_DROP, oldDuct_pressure_drop, duct_pressure_drop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFan_design_power() {
		// Generated by python script located in this directory
		if (!lock.containsKey("fan_design_power")) lock.put("fan_design_power", new Boolean(false));
			if (!(Boolean)lock.get("fan_design_power")){
				lock.put("fan_design_power", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"fan_design_power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Fan_design_power");
					fan_design_power= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return fan_design_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFan_design_power(String newFan_design_power) {
		String oldFan_design_power = fan_design_power;
		fan_design_power = newFan_design_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__FAN_DESIGN_POWER, oldFan_design_power, fan_design_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFan_low_power_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("fan_low_power_fraction")) lock.put("fan_low_power_fraction", new Boolean(false));
			if (!(Boolean)lock.get("fan_low_power_fraction")){
				lock.put("fan_low_power_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"fan_low_power_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Fan_low_power_fraction");
					fan_low_power_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return fan_low_power_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFan_low_power_fraction(String newFan_low_power_fraction) {
		String oldFan_low_power_fraction = fan_low_power_fraction;
		fan_low_power_fraction = newFan_low_power_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__FAN_LOW_POWER_FRACTION, oldFan_low_power_fraction, fan_low_power_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFan_power() {
		// Generated by python script located in this directory
		if (!lock.containsKey("fan_power")) lock.put("fan_power", new Boolean(false));
			if (!(Boolean)lock.get("fan_power")){
				lock.put("fan_power", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"fan_power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Fan_power");
					fan_power= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return fan_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFan_power(String newFan_power) {
		String oldFan_power = fan_power;
		fan_power = newFan_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__FAN_POWER, oldFan_power, fan_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFan_design_airflow() {
		// Generated by python script located in this directory
		if (!lock.containsKey("fan_design_airflow")) lock.put("fan_design_airflow", new Boolean(false));
			if (!(Boolean)lock.get("fan_design_airflow")){
				lock.put("fan_design_airflow", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"fan_design_airflow");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Fan_design_airflow");
					fan_design_airflow= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return fan_design_airflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFan_design_airflow(String newFan_design_airflow) {
		String oldFan_design_airflow = fan_design_airflow;
		fan_design_airflow = newFan_design_airflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__FAN_DESIGN_AIRFLOW, oldFan_design_airflow, fan_design_airflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFan_impedance_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("fan_impedance_fraction")) lock.put("fan_impedance_fraction", new Boolean(false));
			if (!(Boolean)lock.get("fan_impedance_fraction")){
				lock.put("fan_impedance_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"fan_impedance_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Fan_impedance_fraction");
					fan_impedance_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return fan_impedance_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFan_impedance_fraction(String newFan_impedance_fraction) {
		String oldFan_impedance_fraction = fan_impedance_fraction;
		fan_impedance_fraction = newFan_impedance_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__FAN_IMPEDANCE_FRACTION, oldFan_impedance_fraction, fan_impedance_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFan_power_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("fan_power_fraction")) lock.put("fan_power_fraction", new Boolean(false));
			if (!(Boolean)lock.get("fan_power_fraction")){
				lock.put("fan_power_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"fan_power_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Fan_power_fraction");
					fan_power_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return fan_power_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFan_power_fraction(String newFan_power_fraction) {
		String oldFan_power_fraction = fan_power_fraction;
		fan_power_fraction = newFan_power_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__FAN_POWER_FRACTION, oldFan_power_fraction, fan_power_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFan_current_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("fan_current_fraction")) lock.put("fan_current_fraction", new Boolean(false));
			if (!(Boolean)lock.get("fan_current_fraction")){
				lock.put("fan_current_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"fan_current_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Fan_current_fraction");
					fan_current_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return fan_current_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFan_current_fraction(String newFan_current_fraction) {
		String oldFan_current_fraction = fan_current_fraction;
		fan_current_fraction = newFan_current_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__FAN_CURRENT_FRACTION, oldFan_current_fraction, fan_current_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFan_power_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("fan_power_factor")) lock.put("fan_power_factor", new Boolean(false));
			if (!(Boolean)lock.get("fan_power_factor")){
				lock.put("fan_power_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"fan_power_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Fan_power_factor");
					fan_power_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return fan_power_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFan_power_factor(String newFan_power_factor) {
		String oldFan_power_factor = fan_power_factor;
		fan_power_factor = newFan_power_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__FAN_POWER_FACTOR, oldFan_power_factor, fan_power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_demand() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heating_demand")) lock.put("heating_demand", new Boolean(false));
			if (!(Boolean)lock.get("heating_demand")){
				lock.put("heating_demand", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heating_demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heating_demand");
					heating_demand= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heating_demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_demand(String newHeating_demand) {
		String oldHeating_demand = heating_demand;
		heating_demand = newHeating_demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HEATING_DEMAND, oldHeating_demand, heating_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCooling_demand() {
		// Generated by python script located in this directory
		if (!lock.containsKey("cooling_demand")) lock.put("cooling_demand", new Boolean(false));
			if (!(Boolean)lock.get("cooling_demand")){
				lock.put("cooling_demand", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"cooling_demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Cooling_demand");
					cooling_demand= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return cooling_demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooling_demand(String newCooling_demand) {
		String oldCooling_demand = cooling_demand;
		cooling_demand = newCooling_demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__COOLING_DEMAND, oldCooling_demand, cooling_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_COP() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heating_COP")) lock.put("heating_COP", new Boolean(false));
			if (!(Boolean)lock.get("heating_COP")){
				lock.put("heating_COP", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heating_COP");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heating_COP");
					heating_COP= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heating_COP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_COP(String newHeating_COP) {
		String oldHeating_COP = heating_COP;
		heating_COP = newHeating_COP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HEATING_COP, oldHeating_COP, heating_COP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCooling_COP() {
		// Generated by python script located in this directory
		if (!lock.containsKey("cooling_COP")) lock.put("cooling_COP", new Boolean(false));
			if (!(Boolean)lock.get("cooling_COP")){
				lock.put("cooling_COP", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"cooling_COP");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Cooling_COP");
					cooling_COP= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return cooling_COP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooling_COP(String newCooling_COP) {
		String oldCooling_COP = cooling_COP;
		cooling_COP = newCooling_COP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__COOLING_COP, oldCooling_COP, cooling_COP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdj_heating_cop() {
		// Generated by python script located in this directory
		if (!lock.containsKey("adj_heating_cop")) lock.put("adj_heating_cop", new Boolean(false));
			if (!(Boolean)lock.get("adj_heating_cop")){
				lock.put("adj_heating_cop", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"adj_heating_cop");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Adj_heating_cop");
					adj_heating_cop= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return adj_heating_cop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdj_heating_cop(String newAdj_heating_cop) {
		String oldAdj_heating_cop = adj_heating_cop;
		adj_heating_cop = newAdj_heating_cop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__ADJ_HEATING_COP, oldAdj_heating_cop, adj_heating_cop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAir_temperature() {
		// Generated by python script located in this directory
		if (!lock.containsKey("air_temperature")) lock.put("air_temperature", new Boolean(false));
			if (!(Boolean)lock.get("air_temperature")){
				lock.put("air_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"air_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Air_temperature");
					air_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return air_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAir_temperature(String newAir_temperature) {
		String oldAir_temperature = air_temperature;
		air_temperature = newAir_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AIR_TEMPERATURE, oldAir_temperature, air_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutdoor_temperature() {
		// Generated by python script located in this directory
		if (!lock.containsKey("outdoor_temperature")) lock.put("outdoor_temperature", new Boolean(false));
			if (!(Boolean)lock.get("outdoor_temperature")){
				lock.put("outdoor_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"outdoor_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Outdoor_temperature");
					outdoor_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return outdoor_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutdoor_temperature(String newOutdoor_temperature) {
		String oldOutdoor_temperature = outdoor_temperature;
		outdoor_temperature = newOutdoor_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__OUTDOOR_TEMPERATURE, oldOutdoor_temperature, outdoor_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMass_heat_capacity() {
		// Generated by python script located in this directory
		if (!lock.containsKey("mass_heat_capacity")) lock.put("mass_heat_capacity", new Boolean(false));
			if (!(Boolean)lock.get("mass_heat_capacity")){
				lock.put("mass_heat_capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"mass_heat_capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Mass_heat_capacity");
					mass_heat_capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return mass_heat_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMass_heat_capacity(String newMass_heat_capacity) {
		String oldMass_heat_capacity = mass_heat_capacity;
		mass_heat_capacity = newMass_heat_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__MASS_HEAT_CAPACITY, oldMass_heat_capacity, mass_heat_capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMass_heat_coeff() {
		// Generated by python script located in this directory
		if (!lock.containsKey("mass_heat_coeff")) lock.put("mass_heat_coeff", new Boolean(false));
			if (!(Boolean)lock.get("mass_heat_coeff")){
				lock.put("mass_heat_coeff", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"mass_heat_coeff");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Mass_heat_coeff");
					mass_heat_coeff= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return mass_heat_coeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMass_heat_coeff(String newMass_heat_coeff) {
		String oldMass_heat_coeff = mass_heat_coeff;
		mass_heat_coeff = newMass_heat_coeff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__MASS_HEAT_COEFF, oldMass_heat_coeff, mass_heat_coeff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMass_temperature() {
		// Generated by python script located in this directory
		if (!lock.containsKey("mass_temperature")) lock.put("mass_temperature", new Boolean(false));
			if (!(Boolean)lock.get("mass_temperature")){
				lock.put("mass_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"mass_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Mass_temperature");
					mass_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return mass_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMass_temperature(String newMass_temperature) {
		String oldMass_temperature = mass_temperature;
		mass_temperature = newMass_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__MASS_TEMPERATURE, oldMass_temperature, mass_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAir_volume() {
		// Generated by python script located in this directory
		if (!lock.containsKey("air_volume")) lock.put("air_volume", new Boolean(false));
			if (!(Boolean)lock.get("air_volume")){
				lock.put("air_volume", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"air_volume");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Air_volume");
					air_volume= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return air_volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAir_volume(String newAir_volume) {
		String oldAir_volume = air_volume;
		air_volume = newAir_volume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AIR_VOLUME, oldAir_volume, air_volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAir_mass() {
		// Generated by python script located in this directory
		if (!lock.containsKey("air_mass")) lock.put("air_mass", new Boolean(false));
			if (!(Boolean)lock.get("air_mass")){
				lock.put("air_mass", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"air_mass");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Air_mass");
					air_mass= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return air_mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAir_mass(String newAir_mass) {
		String oldAir_mass = air_mass;
		air_mass = newAir_mass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AIR_MASS, oldAir_mass, air_mass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAir_heat_capacity() {
		// Generated by python script located in this directory
		if (!lock.containsKey("air_heat_capacity")) lock.put("air_heat_capacity", new Boolean(false));
			if (!(Boolean)lock.get("air_heat_capacity")){
				lock.put("air_heat_capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"air_heat_capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Air_heat_capacity");
					air_heat_capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return air_heat_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAir_heat_capacity(String newAir_heat_capacity) {
		String oldAir_heat_capacity = air_heat_capacity;
		air_heat_capacity = newAir_heat_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AIR_HEAT_CAPACITY, oldAir_heat_capacity, air_heat_capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLatent_load_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("latent_load_fraction")) lock.put("latent_load_fraction", new Boolean(false));
			if (!(Boolean)lock.get("latent_load_fraction")){
				lock.put("latent_load_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"latent_load_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Latent_load_fraction");
					latent_load_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return latent_load_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatent_load_fraction(String newLatent_load_fraction) {
		String oldLatent_load_fraction = latent_load_fraction;
		latent_load_fraction = newLatent_load_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__LATENT_LOAD_FRACTION, oldLatent_load_fraction, latent_load_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotal_thermal_mass_per_floor_area() {
		// Generated by python script located in this directory
		if (!lock.containsKey("total_thermal_mass_per_floor_area")) lock.put("total_thermal_mass_per_floor_area", new Boolean(false));
			if (!(Boolean)lock.get("total_thermal_mass_per_floor_area")){
				lock.put("total_thermal_mass_per_floor_area", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"total_thermal_mass_per_floor_area");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Total_thermal_mass_per_floor_area");
					total_thermal_mass_per_floor_area= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return total_thermal_mass_per_floor_area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_thermal_mass_per_floor_area(String newTotal_thermal_mass_per_floor_area) {
		String oldTotal_thermal_mass_per_floor_area = total_thermal_mass_per_floor_area;
		total_thermal_mass_per_floor_area = newTotal_thermal_mass_per_floor_area;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__TOTAL_THERMAL_MASS_PER_FLOOR_AREA, oldTotal_thermal_mass_per_floor_area, total_thermal_mass_per_floor_area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterior_surface_heat_transfer_coeff() {
		// Generated by python script located in this directory
		if (!lock.containsKey("interior_surface_heat_transfer_coeff")) lock.put("interior_surface_heat_transfer_coeff", new Boolean(false));
			if (!(Boolean)lock.get("interior_surface_heat_transfer_coeff")){
				lock.put("interior_surface_heat_transfer_coeff", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"interior_surface_heat_transfer_coeff");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Interior_surface_heat_transfer_coeff");
					interior_surface_heat_transfer_coeff= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return interior_surface_heat_transfer_coeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterior_surface_heat_transfer_coeff(String newInterior_surface_heat_transfer_coeff) {
		String oldInterior_surface_heat_transfer_coeff = interior_surface_heat_transfer_coeff;
		interior_surface_heat_transfer_coeff = newInterior_surface_heat_transfer_coeff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__INTERIOR_SURFACE_HEAT_TRANSFER_COEFF, oldInterior_surface_heat_transfer_coeff, interior_surface_heat_transfer_coeff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber_of_stories() {
		// Generated by python script located in this directory
		if (!lock.containsKey("number_of_stories")) lock.put("number_of_stories", new Boolean(false));
			if (!(Boolean)lock.get("number_of_stories")){
				lock.put("number_of_stories", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"number_of_stories");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Number_of_stories");
					number_of_stories= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return number_of_stories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_of_stories(String newNumber_of_stories) {
		String oldNumber_of_stories = number_of_stories;
		number_of_stories = newNumber_of_stories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__NUMBER_OF_STORIES, oldNumber_of_stories, number_of_stories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystem_type() {
		// Generated by python script located in this directory
		if (!lock.containsKey("system_type")) lock.put("system_type", new Boolean(false));
			if (!(Boolean)lock.get("system_type")){
				lock.put("system_type", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"system_type");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"System_type");
					system_type= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return system_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem_type(String newSystem_type) {
		String oldSystem_type = system_type;
		system_type = newSystem_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__SYSTEM_TYPE, oldSystem_type, system_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuxiliary_strategy() {
		// Generated by python script located in this directory
		if (!lock.containsKey("auxiliary_strategy")) lock.put("auxiliary_strategy", new Boolean(false));
			if (!(Boolean)lock.get("auxiliary_strategy")){
				lock.put("auxiliary_strategy", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"auxiliary_strategy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Auxiliary_strategy");
					auxiliary_strategy= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return auxiliary_strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliary_strategy(String newAuxiliary_strategy) {
		String oldAuxiliary_strategy = auxiliary_strategy;
		auxiliary_strategy = newAuxiliary_strategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AUXILIARY_STRATEGY, oldAuxiliary_strategy, auxiliary_strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystem_mode() {
		// Generated by python script located in this directory
		if (!lock.containsKey("system_mode")) lock.put("system_mode", new Boolean(false));
			if (!(Boolean)lock.get("system_mode")){
				lock.put("system_mode", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"system_mode");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"System_mode");
					system_mode= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return system_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem_mode(String newSystem_mode) {
		String oldSystem_mode = system_mode;
		system_mode = newSystem_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__SYSTEM_MODE, oldSystem_mode, system_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_system_type() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heating_system_type")) lock.put("heating_system_type", new Boolean(false));
			if (!(Boolean)lock.get("heating_system_type")){
				lock.put("heating_system_type", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heating_system_type");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heating_system_type");
					heating_system_type= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heating_system_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_system_type(String newHeating_system_type) {
		String oldHeating_system_type = heating_system_type;
		heating_system_type = newHeating_system_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HEATING_SYSTEM_TYPE, oldHeating_system_type, heating_system_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCooling_system_type() {
		// Generated by python script located in this directory
		if (!lock.containsKey("cooling_system_type")) lock.put("cooling_system_type", new Boolean(false));
			if (!(Boolean)lock.get("cooling_system_type")){
				lock.put("cooling_system_type", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"cooling_system_type");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Cooling_system_type");
					cooling_system_type= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return cooling_system_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooling_system_type(String newCooling_system_type) {
		String oldCooling_system_type = cooling_system_type;
		cooling_system_type = newCooling_system_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__COOLING_SYSTEM_TYPE, oldCooling_system_type, cooling_system_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuxiliary_system_type() {
		// Generated by python script located in this directory
		if (!lock.containsKey("auxiliary_system_type")) lock.put("auxiliary_system_type", new Boolean(false));
			if (!(Boolean)lock.get("auxiliary_system_type")){
				lock.put("auxiliary_system_type", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"auxiliary_system_type");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Auxiliary_system_type");
					auxiliary_system_type= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return auxiliary_system_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliary_system_type(String newAuxiliary_system_type) {
		String oldAuxiliary_system_type = auxiliary_system_type;
		auxiliary_system_type = newAuxiliary_system_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE, oldAuxiliary_system_type, auxiliary_system_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFan_type() {
		// Generated by python script located in this directory
		if (!lock.containsKey("fan_type")) lock.put("fan_type", new Boolean(false));
			if (!(Boolean)lock.get("fan_type")){
				lock.put("fan_type", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"fan_type");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Fan_type");
					fan_type= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return fan_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFan_type(String newFan_type) {
		String oldFan_type = fan_type;
		fan_type = newFan_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__FAN_TYPE, oldFan_type, fan_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermal_integrity_level() {
		// Generated by python script located in this directory
		if (!lock.containsKey("thermal_integrity_level")) lock.put("thermal_integrity_level", new Boolean(false));
			if (!(Boolean)lock.get("thermal_integrity_level")){
				lock.put("thermal_integrity_level", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"thermal_integrity_level");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Thermal_integrity_level");
					thermal_integrity_level= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return thermal_integrity_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermal_integrity_level(String newThermal_integrity_level) {
		String oldThermal_integrity_level = thermal_integrity_level;
		thermal_integrity_level = newThermal_integrity_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL, oldThermal_integrity_level, thermal_integrity_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlass_type() {
		// Generated by python script located in this directory
		if (!lock.containsKey("glass_type")) lock.put("glass_type", new Boolean(false));
			if (!(Boolean)lock.get("glass_type")){
				lock.put("glass_type", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glass_type");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Glass_type");
					glass_type= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glass_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlass_type(String newGlass_type) {
		String oldGlass_type = glass_type;
		glass_type = newGlass_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__GLASS_TYPE, oldGlass_type, glass_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWindow_frame() {
		// Generated by python script located in this directory
		if (!lock.containsKey("window_frame")) lock.put("window_frame", new Boolean(false));
			if (!(Boolean)lock.get("window_frame")){
				lock.put("window_frame", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"window_frame");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Window_frame");
					window_frame= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return window_frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow_frame(String newWindow_frame) {
		String oldWindow_frame = window_frame;
		window_frame = newWindow_frame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__WINDOW_FRAME, oldWindow_frame, window_frame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing_treatment() {
		// Generated by python script located in this directory
		if (!lock.containsKey("glazing_treatment")) lock.put("glazing_treatment", new Boolean(false));
			if (!(Boolean)lock.get("glazing_treatment")){
				lock.put("glazing_treatment", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing_treatment");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Glazing_treatment");
					glazing_treatment= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing_treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing_treatment(String newGlazing_treatment) {
		String oldGlazing_treatment = glazing_treatment;
		glazing_treatment = newGlazing_treatment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__GLAZING_TREATMENT, oldGlazing_treatment, glazing_treatment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing_layers() {
		// Generated by python script located in this directory
		if (!lock.containsKey("glazing_layers")) lock.put("glazing_layers", new Boolean(false));
			if (!(Boolean)lock.get("glazing_layers")){
				lock.put("glazing_layers", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing_layers");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Glazing_layers");
					glazing_layers= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing_layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing_layers(String newGlazing_layers) {
		String oldGlazing_layers = glazing_layers;
		glazing_layers = newGlazing_layers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__GLAZING_LAYERS, oldGlazing_layers, glazing_layers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotor_model() {
		// Generated by python script located in this directory
		if (!lock.containsKey("motor_model")) lock.put("motor_model", new Boolean(false));
			if (!(Boolean)lock.get("motor_model")){
				lock.put("motor_model", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"motor_model");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Motor_model");
					motor_model= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return motor_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotor_model(String newMotor_model) {
		String oldMotor_model = motor_model;
		motor_model = newMotor_model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__MOTOR_MODEL, oldMotor_model, motor_model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotor_efficiency() {
		// Generated by python script located in this directory
		if (!lock.containsKey("motor_efficiency")) lock.put("motor_efficiency", new Boolean(false));
			if (!(Boolean)lock.get("motor_efficiency")){
				lock.put("motor_efficiency", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"motor_efficiency");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Motor_efficiency");
					motor_efficiency= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return motor_efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotor_efficiency(String newMotor_efficiency) {
		String oldMotor_efficiency = motor_efficiency;
		motor_efficiency = newMotor_efficiency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__MOTOR_EFFICIENCY, oldMotor_efficiency, motor_efficiency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac_motor_efficiency() {
		// Generated by python script located in this directory
		if (!lock.containsKey("hvac_motor_efficiency")) lock.put("hvac_motor_efficiency", new Boolean(false));
			if (!(Boolean)lock.get("hvac_motor_efficiency")){
				lock.put("hvac_motor_efficiency", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac_motor_efficiency");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Hvac_motor_efficiency");
					hvac_motor_efficiency= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac_motor_efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac_motor_efficiency(String newHvac_motor_efficiency) {
		String oldHvac_motor_efficiency = hvac_motor_efficiency;
		hvac_motor_efficiency = newHvac_motor_efficiency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HVAC_MOTOR_EFFICIENCY, oldHvac_motor_efficiency, hvac_motor_efficiency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac_motor_loss_power_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("hvac_motor_loss_power_factor")) lock.put("hvac_motor_loss_power_factor", new Boolean(false));
			if (!(Boolean)lock.get("hvac_motor_loss_power_factor")){
				lock.put("hvac_motor_loss_power_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac_motor_loss_power_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Hvac_motor_loss_power_factor");
					hvac_motor_loss_power_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac_motor_loss_power_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac_motor_loss_power_factor(String newHvac_motor_loss_power_factor) {
		String oldHvac_motor_loss_power_factor = hvac_motor_loss_power_factor;
		hvac_motor_loss_power_factor = newHvac_motor_loss_power_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HVAC_MOTOR_LOSS_POWER_FACTOR, oldHvac_motor_loss_power_factor, hvac_motor_loss_power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRroof() {
		// Generated by python script located in this directory
		if (!lock.containsKey("rroof")) lock.put("rroof", new Boolean(false));
			if (!(Boolean)lock.get("rroof")){
				lock.put("rroof", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"rroof");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Rroof");
					rroof= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return rroof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRroof(String newRroof) {
		String oldRroof = rroof;
		rroof = newRroof;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__RROOF, oldRroof, rroof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRwall() {
		// Generated by python script located in this directory
		if (!lock.containsKey("rwall")) lock.put("rwall", new Boolean(false));
			if (!(Boolean)lock.get("rwall")){
				lock.put("rwall", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"rwall");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Rwall");
					rwall= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return rwall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRwall(String newRwall) {
		String oldRwall = rwall;
		rwall = newRwall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__RWALL, oldRwall, rwall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRfloor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("rfloor")) lock.put("rfloor", new Boolean(false));
			if (!(Boolean)lock.get("rfloor")){
				lock.put("rfloor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"rfloor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Rfloor");
					rfloor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return rfloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRfloor(String newRfloor) {
		String oldRfloor = rfloor;
		rfloor = newRfloor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__RFLOOR, oldRfloor, rfloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRwindows() {
		// Generated by python script located in this directory
		if (!lock.containsKey("rwindows")) lock.put("rwindows", new Boolean(false));
			if (!(Boolean)lock.get("rwindows")){
				lock.put("rwindows", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"rwindows");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Rwindows");
					rwindows= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return rwindows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRwindows(String newRwindows) {
		String oldRwindows = rwindows;
		rwindows = newRwindows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__RWINDOWS, oldRwindows, rwindows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRdoors() {
		// Generated by python script located in this directory
		if (!lock.containsKey("rdoors")) lock.put("rdoors", new Boolean(false));
			if (!(Boolean)lock.get("rdoors")){
				lock.put("rdoors", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"rdoors");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Rdoors");
					rdoors= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return rdoors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdoors(String newRdoors) {
		String oldRdoors = rdoors;
		rdoors = newRdoors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__RDOORS, oldRdoors, rdoors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac_breaker_rating() {
		// Generated by python script located in this directory
		if (!lock.containsKey("hvac_breaker_rating")) lock.put("hvac_breaker_rating", new Boolean(false));
			if (!(Boolean)lock.get("hvac_breaker_rating")){
				lock.put("hvac_breaker_rating", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac_breaker_rating");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Hvac_breaker_rating");
					hvac_breaker_rating= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac_breaker_rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac_breaker_rating(String newHvac_breaker_rating) {
		String oldHvac_breaker_rating = hvac_breaker_rating;
		hvac_breaker_rating = newHvac_breaker_rating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HVAC_BREAKER_RATING, oldHvac_breaker_rating, hvac_breaker_rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac_power_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("hvac_power_factor")) lock.put("hvac_power_factor", new Boolean(false));
			if (!(Boolean)lock.get("hvac_power_factor")){
				lock.put("hvac_power_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac_power_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Hvac_power_factor");
					hvac_power_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac_power_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac_power_factor(String newHvac_power_factor) {
		String oldHvac_power_factor = hvac_power_factor;
		hvac_power_factor = newHvac_power_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HVAC_POWER_FACTOR, oldHvac_power_factor, hvac_power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac_load() {
		// Generated by python script located in this directory
		if (!lock.containsKey("hvac_load")) lock.put("hvac_load", new Boolean(false));
			if (!(Boolean)lock.get("hvac_load")){
				lock.put("hvac_load", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac_load");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Hvac_load");
					hvac_load= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac_load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac_load(String newHvac_load) {
		String oldHvac_load = hvac_load;
		hvac_load = newHvac_load;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HVAC_LOAD, oldHvac_load, hvac_load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel")) lock.put("panel", new Boolean(false));
			if (!(Boolean)lock.get("panel")){
				lock.put("panel", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Panel");
					panel= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel(String newPanel) {
		String oldPanel = panel;
		panel = newPanel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL, oldPanel, panel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__energy() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__energy")) lock.put("panel__energy", new Boolean(false));
			if (!(Boolean)lock.get("panel__energy")){
				lock.put("panel__energy", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20ENERGY");
					panel__energy= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__energy(String newPanel__energy) {
		String oldPanel__energy = panel__energy;
		panel__energy = newPanel__energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_ENERGY, oldPanel__energy, panel__energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__power() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__power")) lock.put("panel__power", new Boolean(false));
			if (!(Boolean)lock.get("panel__power")){
				lock.put("panel__power", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20POWER");
					panel__power= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__power(String newPanel__power) {
		String oldPanel__power = panel__power;
		panel__power = newPanel__power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_POWER, oldPanel__power, panel__power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__peak_demand() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__peak_demand")) lock.put("panel__peak_demand", new Boolean(false));
			if (!(Boolean)lock.get("panel__peak_demand")){
				lock.put("panel__peak_demand", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20peak_demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20PEAK_DEMAND");
					panel__peak_demand= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__peak_demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__peak_demand(String newPanel__peak_demand) {
		String oldPanel__peak_demand = panel__peak_demand;
		panel__peak_demand = newPanel__peak_demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_PEAK_DEMAND, oldPanel__peak_demand, panel__peak_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__heatgain() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__heatgain")) lock.put("panel__heatgain", new Boolean(false));
			if (!(Boolean)lock.get("panel__heatgain")){
				lock.put("panel__heatgain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20heatgain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20HEATGAIN");
					panel__heatgain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__heatgain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__heatgain(String newPanel__heatgain) {
		String oldPanel__heatgain = panel__heatgain;
		panel__heatgain = newPanel__heatgain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_HEATGAIN, oldPanel__heatgain, panel__heatgain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__heatgain_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__heatgain_fraction")) lock.put("panel__heatgain_fraction", new Boolean(false));
			if (!(Boolean)lock.get("panel__heatgain_fraction")){
				lock.put("panel__heatgain_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20heatgain_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20HEATGAIN_FRACTION");
					panel__heatgain_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__heatgain_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__heatgain_fraction(String newPanel__heatgain_fraction) {
		String oldPanel__heatgain_fraction = panel__heatgain_fraction;
		panel__heatgain_fraction = newPanel__heatgain_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_HEATGAIN_FRACTION, oldPanel__heatgain_fraction, panel__heatgain_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__current_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__current_fraction")) lock.put("panel__current_fraction", new Boolean(false));
			if (!(Boolean)lock.get("panel__current_fraction")){
				lock.put("panel__current_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20current_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20CURRENT_FRACTION");
					panel__current_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__current_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__current_fraction(String newPanel__current_fraction) {
		String oldPanel__current_fraction = panel__current_fraction;
		panel__current_fraction = newPanel__current_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_CURRENT_FRACTION, oldPanel__current_fraction, panel__current_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__impedance_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__impedance_fraction")) lock.put("panel__impedance_fraction", new Boolean(false));
			if (!(Boolean)lock.get("panel__impedance_fraction")){
				lock.put("panel__impedance_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20impedance_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20IMPEDANCE_FRACTION");
					panel__impedance_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__impedance_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__impedance_fraction(String newPanel__impedance_fraction) {
		String oldPanel__impedance_fraction = panel__impedance_fraction;
		panel__impedance_fraction = newPanel__impedance_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_IMPEDANCE_FRACTION, oldPanel__impedance_fraction, panel__impedance_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__power_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__power_fraction")) lock.put("panel__power_fraction", new Boolean(false));
			if (!(Boolean)lock.get("panel__power_fraction")){
				lock.put("panel__power_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20power_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20POWER_FRACTION");
					panel__power_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__power_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__power_fraction(String newPanel__power_fraction) {
		String oldPanel__power_fraction = panel__power_fraction;
		panel__power_fraction = newPanel__power_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_POWER_FRACTION, oldPanel__power_fraction, panel__power_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__power_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__power_factor")) lock.put("panel__power_factor", new Boolean(false));
			if (!(Boolean)lock.get("panel__power_factor")){
				lock.put("panel__power_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20power_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20POWER_FACTOR");
					panel__power_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__power_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__power_factor(String newPanel__power_factor) {
		String oldPanel__power_factor = panel__power_factor;
		panel__power_factor = newPanel__power_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_POWER_FACTOR, oldPanel__power_factor, panel__power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__constant_power() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__constant_power")) lock.put("panel__constant_power", new Boolean(false));
			if (!(Boolean)lock.get("panel__constant_power")){
				lock.put("panel__constant_power", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20constant_power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20CONSTANT_POWER");
					panel__constant_power= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__constant_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__constant_power(String newPanel__constant_power) {
		String oldPanel__constant_power = panel__constant_power;
		panel__constant_power = newPanel__constant_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_CONSTANT_POWER, oldPanel__constant_power, panel__constant_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__constant_current() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__constant_current")) lock.put("panel__constant_current", new Boolean(false));
			if (!(Boolean)lock.get("panel__constant_current")){
				lock.put("panel__constant_current", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20constant_current");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20CONSTANT_CURRENT");
					panel__constant_current= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__constant_current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__constant_current(String newPanel__constant_current) {
		String oldPanel__constant_current = panel__constant_current;
		panel__constant_current = newPanel__constant_current;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_CONSTANT_CURRENT, oldPanel__constant_current, panel__constant_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__constant_admittance() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__constant_admittance")) lock.put("panel__constant_admittance", new Boolean(false));
			if (!(Boolean)lock.get("panel__constant_admittance")){
				lock.put("panel__constant_admittance", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20constant_admittance");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20CONSTANT_ADMITTANCE");
					panel__constant_admittance= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__constant_admittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__constant_admittance(String newPanel__constant_admittance) {
		String oldPanel__constant_admittance = panel__constant_admittance;
		panel__constant_admittance = newPanel__constant_admittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_CONSTANT_ADMITTANCE, oldPanel__constant_admittance, panel__constant_admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__voltage_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__voltage_factor")) lock.put("panel__voltage_factor", new Boolean(false));
			if (!(Boolean)lock.get("panel__voltage_factor")){
				lock.put("panel__voltage_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20voltage_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20VOLTAGE_FACTOR");
					panel__voltage_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__voltage_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__voltage_factor(String newPanel__voltage_factor) {
		String oldPanel__voltage_factor = panel__voltage_factor;
		panel__voltage_factor = newPanel__voltage_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_VOLTAGE_FACTOR, oldPanel__voltage_factor, panel__voltage_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel__configuration() {
		// Generated by python script located in this directory
		if (!lock.containsKey("panel__configuration")) lock.put("panel__configuration", new Boolean(false));
			if (!(Boolean)lock.get("panel__configuration")){
				lock.put("panel__configuration", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"panel%20configuration");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PANEL%20CONFIGURATION");
					panel__configuration= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return panel__configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel__configuration(String newPanel__configuration) {
		String oldPanel__configuration = panel__configuration;
		panel__configuration = newPanel__configuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PANEL_CONFIGURATION, oldPanel__configuration, panel__configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesign_internal_gain_density() {
		// Generated by python script located in this directory
		if (!lock.containsKey("design_internal_gain_density")) lock.put("design_internal_gain_density", new Boolean(false));
			if (!(Boolean)lock.get("design_internal_gain_density")){
				lock.put("design_internal_gain_density", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"design_internal_gain_density");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Design_internal_gain_density");
					design_internal_gain_density= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return design_internal_gain_density;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign_internal_gain_density(String newDesign_internal_gain_density) {
		String oldDesign_internal_gain_density = design_internal_gain_density;
		design_internal_gain_density = newDesign_internal_gain_density;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__DESIGN_INTERNAL_GAIN_DENSITY, oldDesign_internal_gain_density, design_internal_gain_density));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getA() {
		// Generated by python script located in this directory
		if (!lock.containsKey("a")) lock.put("a", new Boolean(false));
			if (!(Boolean)lock.get("a")){
				lock.put("a", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"a");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"A");
					a= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(String newA) {
		String oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getB() {
		// Generated by python script located in this directory
		if (!lock.containsKey("b")) lock.put("b", new Boolean(false));
			if (!(Boolean)lock.get("b")){
				lock.put("b", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"b");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"B");
					b= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(String newB) {
		String oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getC() {
		// Generated by python script located in this directory
		if (!lock.containsKey("c")) lock.put("c", new Boolean(false));
			if (!(Boolean)lock.get("c")){
				lock.put("c", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"c");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"C");
					c= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(String newC) {
		String oldC = c;
		c = newC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__C, oldC, c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getD() {
		// Generated by python script located in this directory
		if (!lock.containsKey("d")) lock.put("d", new Boolean(false));
			if (!(Boolean)lock.get("d")){
				lock.put("d", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"d");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"D");
					d= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(String newD) {
		String oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getC1() {
		// Generated by python script located in this directory
		if (!lock.containsKey("c1")) lock.put("c1", new Boolean(false));
			if (!(Boolean)lock.get("c1")){
				lock.put("c1", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"c1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"C1");
					c1= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return c1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC1(String newC1) {
		String oldC1 = c1;
		c1 = newC1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__C1, oldC1, c1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getC2() {
		// Generated by python script located in this directory
		if (!lock.containsKey("c2")) lock.put("c2", new Boolean(false));
			if (!(Boolean)lock.get("c2")){
				lock.put("c2", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"c2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"C2");
					c2= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return c2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC2(String newC2) {
		String oldC2 = c2;
		c2 = newC2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__C2, oldC2, c2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getA3() {
		// Generated by python script located in this directory
		if (!lock.containsKey("a3")) lock.put("a3", new Boolean(false));
			if (!(Boolean)lock.get("a3")){
				lock.put("a3", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"a3");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"A3");
					a3= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return a3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA3(String newA3) {
		String oldA3 = a3;
		a3 = newA3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__A3, oldA3, a3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getA4() {
		// Generated by python script located in this directory
		if (!lock.containsKey("a4")) lock.put("a4", new Boolean(false));
			if (!(Boolean)lock.get("a4")){
				lock.put("a4", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"a4");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"A4");
					a4= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return a4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA4(String newA4) {
		String oldA4 = a4;
		a4 = newA4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__A4, oldA4, a4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getK1() {
		// Generated by python script located in this directory
		if (!lock.containsKey("k1")) lock.put("k1", new Boolean(false));
			if (!(Boolean)lock.get("k1")){
				lock.put("k1", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"k1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"K1");
					k1= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return k1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK1(String newK1) {
		String oldK1 = k1;
		k1 = newK1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__K1, oldK1, k1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getK2() {
		// Generated by python script located in this directory
		if (!lock.containsKey("k2")) lock.put("k2", new Boolean(false));
			if (!(Boolean)lock.get("k2")){
				lock.put("k2", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"k2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"K2");
					k2= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return k2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK2(String newK2) {
		String oldK2 = k2;
		k2 = newK2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__K2, oldK2, k2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getR1() {
		// Generated by python script located in this directory
		if (!lock.containsKey("r1")) lock.put("r1", new Boolean(false));
			if (!(Boolean)lock.get("r1")){
				lock.put("r1", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"r1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"R1");
					r1= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR1(String newR1) {
		String oldR1 = r1;
		r1 = newR1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__R1, oldR1, r1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getR2() {
		// Generated by python script located in this directory
		if (!lock.containsKey("r2")) lock.put("r2", new Boolean(false));
			if (!(Boolean)lock.get("r2")){
				lock.put("r2", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"r2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"R2");
					r2= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR2(String newR2) {
		String oldR2 = r2;
		r2 = newR2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__R2, oldR2, r2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeq() {
		// Generated by python script located in this directory
		if (!lock.containsKey("teq")) lock.put("teq", new Boolean(false));
			if (!(Boolean)lock.get("teq")){
				lock.put("teq", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"teq");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Teq");
					teq= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return teq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeq(String newTeq) {
		String oldTeq = teq;
		teq = newTeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__TEQ, oldTeq, teq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTevent() {
		// Generated by python script located in this directory
		if (!lock.containsKey("tevent")) lock.put("tevent", new Boolean(false));
			if (!(Boolean)lock.get("tevent")){
				lock.put("tevent", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"tevent");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Tevent");
					tevent= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return tevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTevent(String newTevent) {
		String oldTevent = tevent;
		tevent = newTevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__TEVENT, oldTevent, tevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQi() {
		// Generated by python script located in this directory
		if (!lock.containsKey("qi")) lock.put("qi", new Boolean(false));
			if (!(Boolean)lock.get("qi")){
				lock.put("qi", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"qi");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qi");
					qi= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return qi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQi(String newQi) {
		String oldQi = qi;
		qi = newQi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__QI, oldQi, qi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQa() {
		// Generated by python script located in this directory
		if (!lock.containsKey("qa")) lock.put("qa", new Boolean(false));
			if (!(Boolean)lock.get("qa")){
				lock.put("qa", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"qa");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qa");
					qa= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return qa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQa(String newQa) {
		String oldQa = qa;
		qa = newQa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__QA, oldQa, qa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQm() {
		// Generated by python script located in this directory
		if (!lock.containsKey("qm")) lock.put("qm", new Boolean(false));
			if (!(Boolean)lock.get("qm")){
				lock.put("qm", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"qm");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qm");
					qm= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return qm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQm(String newQm) {
		String oldQm = qm;
		qm = newQm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__QM, oldQm, qm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQh() {
		// Generated by python script located in this directory
		if (!lock.containsKey("qh")) lock.put("qh", new Boolean(false));
			if (!(Boolean)lock.get("qh")){
				lock.put("qh", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"qh");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qh");
					qh= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return qh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQh(String newQh) {
		String oldQh = qh;
		qh = newQh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__QH, oldQh, qh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDTair() {
		// Generated by python script located in this directory
		if (!lock.containsKey("dTair")) lock.put("dTair", new Boolean(false));
			if (!(Boolean)lock.get("dTair")){
				lock.put("dTair", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"dTair");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"DTair");
					dTair= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return dTair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDTair(String newDTair) {
		String oldDTair = dTair;
		dTair = newDTair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__DTAIR, oldDTair, dTair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSol_inc() {
		// Generated by python script located in this directory
		if (!lock.containsKey("sol_inc")) lock.put("sol_inc", new Boolean(false));
			if (!(Boolean)lock.get("sol_inc")){
				lock.put("sol_inc", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"sol_inc");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Sol_inc");
					sol_inc= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return sol_inc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSol_inc(String newSol_inc) {
		String oldSol_inc = sol_inc;
		sol_inc = newSol_inc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__SOL_INC, oldSol_inc, sol_inc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShape() {
		// Generated by python script located in this directory
		if (!lock.containsKey("shape")) lock.put("shape", new Boolean(false));
			if (!(Boolean)lock.get("shape")){
				lock.put("shape", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"shape");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Shape");
					shape= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoad() {
		// Generated by python script located in this directory
		if (!lock.containsKey("load")) lock.put("load", new Boolean(false));
			if (!(Boolean)lock.get("load")){
				lock.put("load", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"load");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Load");
					load= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnergy() {
		// Generated by python script located in this directory
		if (!lock.containsKey("energy")) lock.put("energy", new Boolean(false));
			if (!(Boolean)lock.get("energy")){
				lock.put("energy", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Energy");
					energy= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__ENERGY, oldEnergy, energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower() {
		// Generated by python script located in this directory
		if (!lock.containsKey("power")) lock.put("power", new Boolean(false));
			if (!(Boolean)lock.get("power")){
				lock.put("power", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Power");
					power= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeak_demand() {
		// Generated by python script located in this directory
		if (!lock.containsKey("peak_demand")) lock.put("peak_demand", new Boolean(false));
			if (!(Boolean)lock.get("peak_demand")){
				lock.put("peak_demand", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"peak_demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Peak_demand");
					peak_demand= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__PEAK_DEMAND, oldPeak_demand, peak_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heatgain")) lock.put("heatgain", new Boolean(false));
			if (!(Boolean)lock.get("heatgain")){
				lock.put("heatgain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heatgain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heatgain");
					heatgain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HEATGAIN, oldHeatgain, heatgain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heatgain_fraction")) lock.put("heatgain_fraction", new Boolean(false));
			if (!(Boolean)lock.get("heatgain_fraction")){
				lock.put("heatgain_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heatgain_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heatgain_fraction");
					heatgain_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__HEATGAIN_FRACTION, oldHeatgain_fraction, heatgain_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("current_fraction")) lock.put("current_fraction", new Boolean(false));
			if (!(Boolean)lock.get("current_fraction")){
				lock.put("current_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"current_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Current_fraction");
					current_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__CURRENT_FRACTION, oldCurrent_fraction, current_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("impedance_fraction")) lock.put("impedance_fraction", new Boolean(false));
			if (!(Boolean)lock.get("impedance_fraction")){
				lock.put("impedance_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"impedance_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Impedance_fraction");
					impedance_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__IMPEDANCE_FRACTION, oldImpedance_fraction, impedance_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("power_fraction")) lock.put("power_fraction", new Boolean(false));
			if (!(Boolean)lock.get("power_fraction")){
				lock.put("power_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"power_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Power_fraction");
					power_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__POWER_FRACTION, oldPower_fraction, power_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("power_factor")) lock.put("power_factor", new Boolean(false));
			if (!(Boolean)lock.get("power_factor")){
				lock.put("power_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"power_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Power_factor");
					power_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__POWER_FACTOR, oldPower_factor, power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power() {
		// Generated by python script located in this directory
		if (!lock.containsKey("constant_power")) lock.put("constant_power", new Boolean(false));
			if (!(Boolean)lock.get("constant_power")){
				lock.put("constant_power", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"constant_power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Constant_power");
					constant_power= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__CONSTANT_POWER, oldConstant_power, constant_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current() {
		// Generated by python script located in this directory
		if (!lock.containsKey("constant_current")) lock.put("constant_current", new Boolean(false));
			if (!(Boolean)lock.get("constant_current")){
				lock.put("constant_current", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"constant_current");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Constant_current");
					constant_current= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__CONSTANT_CURRENT, oldConstant_current, constant_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_admittance() {
		// Generated by python script located in this directory
		if (!lock.containsKey("constant_admittance")) lock.put("constant_admittance", new Boolean(false));
			if (!(Boolean)lock.get("constant_admittance")){
				lock.put("constant_admittance", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"constant_admittance");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Constant_admittance");
					constant_admittance= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__CONSTANT_ADMITTANCE, oldConstant_admittance, constant_admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("voltage_factor")) lock.put("voltage_factor", new Boolean(false));
			if (!(Boolean)lock.get("voltage_factor")){
				lock.put("voltage_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"voltage_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Voltage_factor");
					voltage_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__VOLTAGE_FACTOR, oldVoltage_factor, voltage_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfiguration() {
		// Generated by python script located in this directory
		if (!lock.containsKey("configuration")) lock.put("configuration", new Boolean(false));
			if (!(Boolean)lock.get("configuration")){
				lock.put("configuration", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"configuration");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Configuration");
					configuration= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverride() {
		// Generated by python script located in this directory
		if (!lock.containsKey("override")) lock.put("override", new Boolean(false));
			if (!(Boolean)lock.get("override")){
				lock.put("override", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"override");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Override");
					override= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.HOUSE__WEATHER:
				return getWeather();
			case VisGridPackage.HOUSE__FLOOR_AREA:
				return getFloor_area();
			case VisGridPackage.HOUSE__GROSS_WALL_AREA:
				return getGross_wall_area();
			case VisGridPackage.HOUSE__CEILING_HEIGHT:
				return getCeiling_height();
			case VisGridPackage.HOUSE__ASPECT_RATIO:
				return getAspect_ratio();
			case VisGridPackage.HOUSE__ENVELOPE_UA:
				return getEnvelope_UA();
			case VisGridPackage.HOUSE__WINDOW_WALL_RATIO:
				return getWindow_wall_ratio();
			case VisGridPackage.HOUSE__NUMBER_OF_DOORS:
				return getNumber_of_doors();
			case VisGridPackage.HOUSE__EXTERIOR_WALL_FRACTION:
				return getExterior_wall_fraction();
			case VisGridPackage.HOUSE__INTERIOR_EXTERIOR_WALL_RATIO:
				return getInterior_exterior_wall_ratio();
			case VisGridPackage.HOUSE__EXTERIOR_CEILING_FRACTION:
				return getExterior_ceiling_fraction();
			case VisGridPackage.HOUSE__EXTERIOR_FLOOR_FRACTION:
				return getExterior_floor_fraction();
			case VisGridPackage.HOUSE__WINDOW_SHADING:
				return getWindow_shading();
			case VisGridPackage.HOUSE__WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT:
				return getWindow_exterior_transmission_coefficient();
			case VisGridPackage.HOUSE__SOLAR_HEATGAIN_FACTOR:
				return getSolar_heatgain_factor();
			case VisGridPackage.HOUSE__AIRCHANGE_PER_HOUR:
				return getAirchange_per_hour();
			case VisGridPackage.HOUSE__AIRCHANGE_UA:
				return getAirchange_UA();
			case VisGridPackage.HOUSE__INTERNAL_GAIN:
				return getInternal_gain();
			case VisGridPackage.HOUSE__SOLAR_GAIN:
				return getSolar_gain();
			case VisGridPackage.HOUSE__HEAT_COOL_GAIN:
				return getHeat_cool_gain();
			case VisGridPackage.HOUSE__THERMOSTAT_DEADBAND:
				return getThermostat_deadband();
			case VisGridPackage.HOUSE__THERMOSTAT_CYCLE_TIME:
				return getThermostat_cycle_time();
			case VisGridPackage.HOUSE__THERMOSTAT_LAST_CYCLE_TIME:
				return getThermostat_last_cycle_time();
			case VisGridPackage.HOUSE__HEATING_SETPOINT:
				return getHeating_setpoint();
			case VisGridPackage.HOUSE__COOLING_SETPOINT:
				return getCooling_setpoint();
			case VisGridPackage.HOUSE__DESIGN_HEATING_SETPOINT:
				return getDesign_heating_setpoint();
			case VisGridPackage.HOUSE__DESIGN_COOLING_SETPOINT:
				return getDesign_cooling_setpoint();
			case VisGridPackage.HOUSE__DESIGN_HEATING_CAPACITY:
				return getDesign_heating_capacity();
			case VisGridPackage.HOUSE__DESIGN_COOLING_CAPACITY:
				return getDesign_cooling_capacity();
			case VisGridPackage.HOUSE__ADJ_HEATING_CAP:
				return getAdj_heating_cap();
			case VisGridPackage.HOUSE__SYS_RATED_CAP:
				return getSys_rated_cap();
			case VisGridPackage.HOUSE__COOLING_DESIGN_TEMPERATURE:
				return getCooling_design_temperature();
			case VisGridPackage.HOUSE__HEATING_DESIGN_TEMPERATURE:
				return getHeating_design_temperature();
			case VisGridPackage.HOUSE__DESIGN_PEAK_SOLAR:
				return getDesign_peak_solar();
			case VisGridPackage.HOUSE__DESIGN_INTERNAL_GAINS:
				return getDesign_internal_gains();
			case VisGridPackage.HOUSE__AIR_HEAT_FRACTION:
				return getAir_heat_fraction();
			case VisGridPackage.HOUSE__AUXILIARY_HEAT_CAPACITY:
				return getAuxiliary_heat_capacity();
			case VisGridPackage.HOUSE__AUX_HEAT_DEADBAND:
				return getAux_heat_deadband();
			case VisGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT:
				return getAux_heat_temperature_lockout();
			case VisGridPackage.HOUSE__AUX_HEAT_TIME_DELAY:
				return getAux_heat_time_delay();
			case VisGridPackage.HOUSE__COOLING_SUPPLY_AIR_TEMP:
				return getCooling_supply_air_temp();
			case VisGridPackage.HOUSE__HEATING_SUPPLY_AIR_TEMP:
				return getHeating_supply_air_temp();
			case VisGridPackage.HOUSE__DUCT_PRESSURE_DROP:
				return getDuct_pressure_drop();
			case VisGridPackage.HOUSE__FAN_DESIGN_POWER:
				return getFan_design_power();
			case VisGridPackage.HOUSE__FAN_LOW_POWER_FRACTION:
				return getFan_low_power_fraction();
			case VisGridPackage.HOUSE__FAN_POWER:
				return getFan_power();
			case VisGridPackage.HOUSE__FAN_DESIGN_AIRFLOW:
				return getFan_design_airflow();
			case VisGridPackage.HOUSE__FAN_IMPEDANCE_FRACTION:
				return getFan_impedance_fraction();
			case VisGridPackage.HOUSE__FAN_POWER_FRACTION:
				return getFan_power_fraction();
			case VisGridPackage.HOUSE__FAN_CURRENT_FRACTION:
				return getFan_current_fraction();
			case VisGridPackage.HOUSE__FAN_POWER_FACTOR:
				return getFan_power_factor();
			case VisGridPackage.HOUSE__HEATING_DEMAND:
				return getHeating_demand();
			case VisGridPackage.HOUSE__COOLING_DEMAND:
				return getCooling_demand();
			case VisGridPackage.HOUSE__HEATING_COP:
				return getHeating_COP();
			case VisGridPackage.HOUSE__COOLING_COP:
				return getCooling_COP();
			case VisGridPackage.HOUSE__ADJ_HEATING_COP:
				return getAdj_heating_cop();
			case VisGridPackage.HOUSE__AIR_TEMPERATURE:
				return getAir_temperature();
			case VisGridPackage.HOUSE__OUTDOOR_TEMPERATURE:
				return getOutdoor_temperature();
			case VisGridPackage.HOUSE__MASS_HEAT_CAPACITY:
				return getMass_heat_capacity();
			case VisGridPackage.HOUSE__MASS_HEAT_COEFF:
				return getMass_heat_coeff();
			case VisGridPackage.HOUSE__MASS_TEMPERATURE:
				return getMass_temperature();
			case VisGridPackage.HOUSE__AIR_VOLUME:
				return getAir_volume();
			case VisGridPackage.HOUSE__AIR_MASS:
				return getAir_mass();
			case VisGridPackage.HOUSE__AIR_HEAT_CAPACITY:
				return getAir_heat_capacity();
			case VisGridPackage.HOUSE__LATENT_LOAD_FRACTION:
				return getLatent_load_fraction();
			case VisGridPackage.HOUSE__TOTAL_THERMAL_MASS_PER_FLOOR_AREA:
				return getTotal_thermal_mass_per_floor_area();
			case VisGridPackage.HOUSE__INTERIOR_SURFACE_HEAT_TRANSFER_COEFF:
				return getInterior_surface_heat_transfer_coeff();
			case VisGridPackage.HOUSE__NUMBER_OF_STORIES:
				return getNumber_of_stories();
			case VisGridPackage.HOUSE__SYSTEM_TYPE:
				return getSystem_type();
			case VisGridPackage.HOUSE__AUXILIARY_STRATEGY:
				return getAuxiliary_strategy();
			case VisGridPackage.HOUSE__SYSTEM_MODE:
				return getSystem_mode();
			case VisGridPackage.HOUSE__HEATING_SYSTEM_TYPE:
				return getHeating_system_type();
			case VisGridPackage.HOUSE__COOLING_SYSTEM_TYPE:
				return getCooling_system_type();
			case VisGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE:
				return getAuxiliary_system_type();
			case VisGridPackage.HOUSE__FAN_TYPE:
				return getFan_type();
			case VisGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL:
				return getThermal_integrity_level();
			case VisGridPackage.HOUSE__GLASS_TYPE:
				return getGlass_type();
			case VisGridPackage.HOUSE__WINDOW_FRAME:
				return getWindow_frame();
			case VisGridPackage.HOUSE__GLAZING_TREATMENT:
				return getGlazing_treatment();
			case VisGridPackage.HOUSE__GLAZING_LAYERS:
				return getGlazing_layers();
			case VisGridPackage.HOUSE__MOTOR_MODEL:
				return getMotor_model();
			case VisGridPackage.HOUSE__MOTOR_EFFICIENCY:
				return getMotor_efficiency();
			case VisGridPackage.HOUSE__HVAC_MOTOR_EFFICIENCY:
				return getHvac_motor_efficiency();
			case VisGridPackage.HOUSE__HVAC_MOTOR_LOSS_POWER_FACTOR:
				return getHvac_motor_loss_power_factor();
			case VisGridPackage.HOUSE__RROOF:
				return getRroof();
			case VisGridPackage.HOUSE__RWALL:
				return getRwall();
			case VisGridPackage.HOUSE__RFLOOR:
				return getRfloor();
			case VisGridPackage.HOUSE__RWINDOWS:
				return getRwindows();
			case VisGridPackage.HOUSE__RDOORS:
				return getRdoors();
			case VisGridPackage.HOUSE__HVAC_BREAKER_RATING:
				return getHvac_breaker_rating();
			case VisGridPackage.HOUSE__HVAC_POWER_FACTOR:
				return getHvac_power_factor();
			case VisGridPackage.HOUSE__HVAC_LOAD:
				return getHvac_load();
			case VisGridPackage.HOUSE__PANEL:
				return getPanel();
			case VisGridPackage.HOUSE__PANEL_ENERGY:
				return getPanel__energy();
			case VisGridPackage.HOUSE__PANEL_POWER:
				return getPanel__power();
			case VisGridPackage.HOUSE__PANEL_PEAK_DEMAND:
				return getPanel__peak_demand();
			case VisGridPackage.HOUSE__PANEL_HEATGAIN:
				return getPanel__heatgain();
			case VisGridPackage.HOUSE__PANEL_HEATGAIN_FRACTION:
				return getPanel__heatgain_fraction();
			case VisGridPackage.HOUSE__PANEL_CURRENT_FRACTION:
				return getPanel__current_fraction();
			case VisGridPackage.HOUSE__PANEL_IMPEDANCE_FRACTION:
				return getPanel__impedance_fraction();
			case VisGridPackage.HOUSE__PANEL_POWER_FRACTION:
				return getPanel__power_fraction();
			case VisGridPackage.HOUSE__PANEL_POWER_FACTOR:
				return getPanel__power_factor();
			case VisGridPackage.HOUSE__PANEL_CONSTANT_POWER:
				return getPanel__constant_power();
			case VisGridPackage.HOUSE__PANEL_CONSTANT_CURRENT:
				return getPanel__constant_current();
			case VisGridPackage.HOUSE__PANEL_CONSTANT_ADMITTANCE:
				return getPanel__constant_admittance();
			case VisGridPackage.HOUSE__PANEL_VOLTAGE_FACTOR:
				return getPanel__voltage_factor();
			case VisGridPackage.HOUSE__PANEL_CONFIGURATION:
				return getPanel__configuration();
			case VisGridPackage.HOUSE__DESIGN_INTERNAL_GAIN_DENSITY:
				return getDesign_internal_gain_density();
			case VisGridPackage.HOUSE__A:
				return getA();
			case VisGridPackage.HOUSE__B:
				return getB();
			case VisGridPackage.HOUSE__C:
				return getC();
			case VisGridPackage.HOUSE__D:
				return getD();
			case VisGridPackage.HOUSE__C1:
				return getC1();
			case VisGridPackage.HOUSE__C2:
				return getC2();
			case VisGridPackage.HOUSE__A3:
				return getA3();
			case VisGridPackage.HOUSE__A4:
				return getA4();
			case VisGridPackage.HOUSE__K1:
				return getK1();
			case VisGridPackage.HOUSE__K2:
				return getK2();
			case VisGridPackage.HOUSE__R1:
				return getR1();
			case VisGridPackage.HOUSE__R2:
				return getR2();
			case VisGridPackage.HOUSE__TEQ:
				return getTeq();
			case VisGridPackage.HOUSE__TEVENT:
				return getTevent();
			case VisGridPackage.HOUSE__QI:
				return getQi();
			case VisGridPackage.HOUSE__QA:
				return getQa();
			case VisGridPackage.HOUSE__QM:
				return getQm();
			case VisGridPackage.HOUSE__QH:
				return getQh();
			case VisGridPackage.HOUSE__DTAIR:
				return getDTair();
			case VisGridPackage.HOUSE__SOL_INC:
				return getSol_inc();
			case VisGridPackage.HOUSE__SHAPE:
				return getShape();
			case VisGridPackage.HOUSE__LOAD:
				return getLoad();
			case VisGridPackage.HOUSE__ENERGY:
				return getEnergy();
			case VisGridPackage.HOUSE__POWER:
				return getPower();
			case VisGridPackage.HOUSE__PEAK_DEMAND:
				return getPeak_demand();
			case VisGridPackage.HOUSE__HEATGAIN:
				return getHeatgain();
			case VisGridPackage.HOUSE__HEATGAIN_FRACTION:
				return getHeatgain_fraction();
			case VisGridPackage.HOUSE__CURRENT_FRACTION:
				return getCurrent_fraction();
			case VisGridPackage.HOUSE__IMPEDANCE_FRACTION:
				return getImpedance_fraction();
			case VisGridPackage.HOUSE__POWER_FRACTION:
				return getPower_fraction();
			case VisGridPackage.HOUSE__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.HOUSE__CONSTANT_POWER:
				return getConstant_power();
			case VisGridPackage.HOUSE__CONSTANT_CURRENT:
				return getConstant_current();
			case VisGridPackage.HOUSE__CONSTANT_ADMITTANCE:
				return getConstant_admittance();
			case VisGridPackage.HOUSE__VOLTAGE_FACTOR:
				return getVoltage_factor();
			case VisGridPackage.HOUSE__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.HOUSE__OVERRIDE:
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
			case VisGridPackage.HOUSE__WEATHER:
				setWeather((String)newValue);
				return;
			case VisGridPackage.HOUSE__FLOOR_AREA:
				setFloor_area((String)newValue);
				return;
			case VisGridPackage.HOUSE__GROSS_WALL_AREA:
				setGross_wall_area((String)newValue);
				return;
			case VisGridPackage.HOUSE__CEILING_HEIGHT:
				setCeiling_height((String)newValue);
				return;
			case VisGridPackage.HOUSE__ASPECT_RATIO:
				setAspect_ratio((String)newValue);
				return;
			case VisGridPackage.HOUSE__ENVELOPE_UA:
				setEnvelope_UA((String)newValue);
				return;
			case VisGridPackage.HOUSE__WINDOW_WALL_RATIO:
				setWindow_wall_ratio((String)newValue);
				return;
			case VisGridPackage.HOUSE__NUMBER_OF_DOORS:
				setNumber_of_doors((String)newValue);
				return;
			case VisGridPackage.HOUSE__EXTERIOR_WALL_FRACTION:
				setExterior_wall_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__INTERIOR_EXTERIOR_WALL_RATIO:
				setInterior_exterior_wall_ratio((String)newValue);
				return;
			case VisGridPackage.HOUSE__EXTERIOR_CEILING_FRACTION:
				setExterior_ceiling_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__EXTERIOR_FLOOR_FRACTION:
				setExterior_floor_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__WINDOW_SHADING:
				setWindow_shading((String)newValue);
				return;
			case VisGridPackage.HOUSE__WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT:
				setWindow_exterior_transmission_coefficient((String)newValue);
				return;
			case VisGridPackage.HOUSE__SOLAR_HEATGAIN_FACTOR:
				setSolar_heatgain_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE__AIRCHANGE_PER_HOUR:
				setAirchange_per_hour((String)newValue);
				return;
			case VisGridPackage.HOUSE__AIRCHANGE_UA:
				setAirchange_UA((String)newValue);
				return;
			case VisGridPackage.HOUSE__INTERNAL_GAIN:
				setInternal_gain((String)newValue);
				return;
			case VisGridPackage.HOUSE__SOLAR_GAIN:
				setSolar_gain((String)newValue);
				return;
			case VisGridPackage.HOUSE__HEAT_COOL_GAIN:
				setHeat_cool_gain((String)newValue);
				return;
			case VisGridPackage.HOUSE__THERMOSTAT_DEADBAND:
				setThermostat_deadband((String)newValue);
				return;
			case VisGridPackage.HOUSE__THERMOSTAT_CYCLE_TIME:
				setThermostat_cycle_time((String)newValue);
				return;
			case VisGridPackage.HOUSE__THERMOSTAT_LAST_CYCLE_TIME:
				setThermostat_last_cycle_time((String)newValue);
				return;
			case VisGridPackage.HOUSE__HEATING_SETPOINT:
				setHeating_setpoint((String)newValue);
				return;
			case VisGridPackage.HOUSE__COOLING_SETPOINT:
				setCooling_setpoint((String)newValue);
				return;
			case VisGridPackage.HOUSE__DESIGN_HEATING_SETPOINT:
				setDesign_heating_setpoint((String)newValue);
				return;
			case VisGridPackage.HOUSE__DESIGN_COOLING_SETPOINT:
				setDesign_cooling_setpoint((String)newValue);
				return;
			case VisGridPackage.HOUSE__DESIGN_HEATING_CAPACITY:
				setDesign_heating_capacity((String)newValue);
				return;
			case VisGridPackage.HOUSE__DESIGN_COOLING_CAPACITY:
				setDesign_cooling_capacity((String)newValue);
				return;
			case VisGridPackage.HOUSE__ADJ_HEATING_CAP:
				setAdj_heating_cap((String)newValue);
				return;
			case VisGridPackage.HOUSE__SYS_RATED_CAP:
				setSys_rated_cap((String)newValue);
				return;
			case VisGridPackage.HOUSE__COOLING_DESIGN_TEMPERATURE:
				setCooling_design_temperature((String)newValue);
				return;
			case VisGridPackage.HOUSE__HEATING_DESIGN_TEMPERATURE:
				setHeating_design_temperature((String)newValue);
				return;
			case VisGridPackage.HOUSE__DESIGN_PEAK_SOLAR:
				setDesign_peak_solar((String)newValue);
				return;
			case VisGridPackage.HOUSE__DESIGN_INTERNAL_GAINS:
				setDesign_internal_gains((String)newValue);
				return;
			case VisGridPackage.HOUSE__AIR_HEAT_FRACTION:
				setAir_heat_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__AUXILIARY_HEAT_CAPACITY:
				setAuxiliary_heat_capacity((String)newValue);
				return;
			case VisGridPackage.HOUSE__AUX_HEAT_DEADBAND:
				setAux_heat_deadband((String)newValue);
				return;
			case VisGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT:
				setAux_heat_temperature_lockout((String)newValue);
				return;
			case VisGridPackage.HOUSE__AUX_HEAT_TIME_DELAY:
				setAux_heat_time_delay((String)newValue);
				return;
			case VisGridPackage.HOUSE__COOLING_SUPPLY_AIR_TEMP:
				setCooling_supply_air_temp((String)newValue);
				return;
			case VisGridPackage.HOUSE__HEATING_SUPPLY_AIR_TEMP:
				setHeating_supply_air_temp((String)newValue);
				return;
			case VisGridPackage.HOUSE__DUCT_PRESSURE_DROP:
				setDuct_pressure_drop((String)newValue);
				return;
			case VisGridPackage.HOUSE__FAN_DESIGN_POWER:
				setFan_design_power((String)newValue);
				return;
			case VisGridPackage.HOUSE__FAN_LOW_POWER_FRACTION:
				setFan_low_power_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__FAN_POWER:
				setFan_power((String)newValue);
				return;
			case VisGridPackage.HOUSE__FAN_DESIGN_AIRFLOW:
				setFan_design_airflow((String)newValue);
				return;
			case VisGridPackage.HOUSE__FAN_IMPEDANCE_FRACTION:
				setFan_impedance_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__FAN_POWER_FRACTION:
				setFan_power_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__FAN_CURRENT_FRACTION:
				setFan_current_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__FAN_POWER_FACTOR:
				setFan_power_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE__HEATING_DEMAND:
				setHeating_demand((String)newValue);
				return;
			case VisGridPackage.HOUSE__COOLING_DEMAND:
				setCooling_demand((String)newValue);
				return;
			case VisGridPackage.HOUSE__HEATING_COP:
				setHeating_COP((String)newValue);
				return;
			case VisGridPackage.HOUSE__COOLING_COP:
				setCooling_COP((String)newValue);
				return;
			case VisGridPackage.HOUSE__ADJ_HEATING_COP:
				setAdj_heating_cop((String)newValue);
				return;
			case VisGridPackage.HOUSE__AIR_TEMPERATURE:
				setAir_temperature((String)newValue);
				return;
			case VisGridPackage.HOUSE__OUTDOOR_TEMPERATURE:
				setOutdoor_temperature((String)newValue);
				return;
			case VisGridPackage.HOUSE__MASS_HEAT_CAPACITY:
				setMass_heat_capacity((String)newValue);
				return;
			case VisGridPackage.HOUSE__MASS_HEAT_COEFF:
				setMass_heat_coeff((String)newValue);
				return;
			case VisGridPackage.HOUSE__MASS_TEMPERATURE:
				setMass_temperature((String)newValue);
				return;
			case VisGridPackage.HOUSE__AIR_VOLUME:
				setAir_volume((String)newValue);
				return;
			case VisGridPackage.HOUSE__AIR_MASS:
				setAir_mass((String)newValue);
				return;
			case VisGridPackage.HOUSE__AIR_HEAT_CAPACITY:
				setAir_heat_capacity((String)newValue);
				return;
			case VisGridPackage.HOUSE__LATENT_LOAD_FRACTION:
				setLatent_load_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__TOTAL_THERMAL_MASS_PER_FLOOR_AREA:
				setTotal_thermal_mass_per_floor_area((String)newValue);
				return;
			case VisGridPackage.HOUSE__INTERIOR_SURFACE_HEAT_TRANSFER_COEFF:
				setInterior_surface_heat_transfer_coeff((String)newValue);
				return;
			case VisGridPackage.HOUSE__NUMBER_OF_STORIES:
				setNumber_of_stories((String)newValue);
				return;
			case VisGridPackage.HOUSE__SYSTEM_TYPE:
				setSystem_type((String)newValue);
				return;
			case VisGridPackage.HOUSE__AUXILIARY_STRATEGY:
				setAuxiliary_strategy((String)newValue);
				return;
			case VisGridPackage.HOUSE__SYSTEM_MODE:
				setSystem_mode((String)newValue);
				return;
			case VisGridPackage.HOUSE__HEATING_SYSTEM_TYPE:
				setHeating_system_type((String)newValue);
				return;
			case VisGridPackage.HOUSE__COOLING_SYSTEM_TYPE:
				setCooling_system_type((String)newValue);
				return;
			case VisGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE:
				setAuxiliary_system_type((String)newValue);
				return;
			case VisGridPackage.HOUSE__FAN_TYPE:
				setFan_type((String)newValue);
				return;
			case VisGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL:
				setThermal_integrity_level((String)newValue);
				return;
			case VisGridPackage.HOUSE__GLASS_TYPE:
				setGlass_type((String)newValue);
				return;
			case VisGridPackage.HOUSE__WINDOW_FRAME:
				setWindow_frame((String)newValue);
				return;
			case VisGridPackage.HOUSE__GLAZING_TREATMENT:
				setGlazing_treatment((String)newValue);
				return;
			case VisGridPackage.HOUSE__GLAZING_LAYERS:
				setGlazing_layers((String)newValue);
				return;
			case VisGridPackage.HOUSE__MOTOR_MODEL:
				setMotor_model((String)newValue);
				return;
			case VisGridPackage.HOUSE__MOTOR_EFFICIENCY:
				setMotor_efficiency((String)newValue);
				return;
			case VisGridPackage.HOUSE__HVAC_MOTOR_EFFICIENCY:
				setHvac_motor_efficiency((String)newValue);
				return;
			case VisGridPackage.HOUSE__HVAC_MOTOR_LOSS_POWER_FACTOR:
				setHvac_motor_loss_power_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE__RROOF:
				setRroof((String)newValue);
				return;
			case VisGridPackage.HOUSE__RWALL:
				setRwall((String)newValue);
				return;
			case VisGridPackage.HOUSE__RFLOOR:
				setRfloor((String)newValue);
				return;
			case VisGridPackage.HOUSE__RWINDOWS:
				setRwindows((String)newValue);
				return;
			case VisGridPackage.HOUSE__RDOORS:
				setRdoors((String)newValue);
				return;
			case VisGridPackage.HOUSE__HVAC_BREAKER_RATING:
				setHvac_breaker_rating((String)newValue);
				return;
			case VisGridPackage.HOUSE__HVAC_POWER_FACTOR:
				setHvac_power_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE__HVAC_LOAD:
				setHvac_load((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL:
				setPanel((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_ENERGY:
				setPanel__energy((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_POWER:
				setPanel__power((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_PEAK_DEMAND:
				setPanel__peak_demand((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_HEATGAIN:
				setPanel__heatgain((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_HEATGAIN_FRACTION:
				setPanel__heatgain_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_CURRENT_FRACTION:
				setPanel__current_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_IMPEDANCE_FRACTION:
				setPanel__impedance_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_POWER_FRACTION:
				setPanel__power_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_POWER_FACTOR:
				setPanel__power_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_CONSTANT_POWER:
				setPanel__constant_power((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_CONSTANT_CURRENT:
				setPanel__constant_current((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_CONSTANT_ADMITTANCE:
				setPanel__constant_admittance((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_VOLTAGE_FACTOR:
				setPanel__voltage_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE__PANEL_CONFIGURATION:
				setPanel__configuration((String)newValue);
				return;
			case VisGridPackage.HOUSE__DESIGN_INTERNAL_GAIN_DENSITY:
				setDesign_internal_gain_density((String)newValue);
				return;
			case VisGridPackage.HOUSE__A:
				setA((String)newValue);
				return;
			case VisGridPackage.HOUSE__B:
				setB((String)newValue);
				return;
			case VisGridPackage.HOUSE__C:
				setC((String)newValue);
				return;
			case VisGridPackage.HOUSE__D:
				setD((String)newValue);
				return;
			case VisGridPackage.HOUSE__C1:
				setC1((String)newValue);
				return;
			case VisGridPackage.HOUSE__C2:
				setC2((String)newValue);
				return;
			case VisGridPackage.HOUSE__A3:
				setA3((String)newValue);
				return;
			case VisGridPackage.HOUSE__A4:
				setA4((String)newValue);
				return;
			case VisGridPackage.HOUSE__K1:
				setK1((String)newValue);
				return;
			case VisGridPackage.HOUSE__K2:
				setK2((String)newValue);
				return;
			case VisGridPackage.HOUSE__R1:
				setR1((String)newValue);
				return;
			case VisGridPackage.HOUSE__R2:
				setR2((String)newValue);
				return;
			case VisGridPackage.HOUSE__TEQ:
				setTeq((String)newValue);
				return;
			case VisGridPackage.HOUSE__TEVENT:
				setTevent((String)newValue);
				return;
			case VisGridPackage.HOUSE__QI:
				setQi((String)newValue);
				return;
			case VisGridPackage.HOUSE__QA:
				setQa((String)newValue);
				return;
			case VisGridPackage.HOUSE__QM:
				setQm((String)newValue);
				return;
			case VisGridPackage.HOUSE__QH:
				setQh((String)newValue);
				return;
			case VisGridPackage.HOUSE__DTAIR:
				setDTair((String)newValue);
				return;
			case VisGridPackage.HOUSE__SOL_INC:
				setSol_inc((String)newValue);
				return;
			case VisGridPackage.HOUSE__SHAPE:
				setShape((String)newValue);
				return;
			case VisGridPackage.HOUSE__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.HOUSE__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.HOUSE__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.HOUSE__PEAK_DEMAND:
				setPeak_demand((String)newValue);
				return;
			case VisGridPackage.HOUSE__HEATGAIN:
				setHeatgain((String)newValue);
				return;
			case VisGridPackage.HOUSE__HEATGAIN_FRACTION:
				setHeatgain_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__CURRENT_FRACTION:
				setCurrent_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__IMPEDANCE_FRACTION:
				setImpedance_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__POWER_FRACTION:
				setPower_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE__CONSTANT_POWER:
				setConstant_power((String)newValue);
				return;
			case VisGridPackage.HOUSE__CONSTANT_CURRENT:
				setConstant_current((String)newValue);
				return;
			case VisGridPackage.HOUSE__CONSTANT_ADMITTANCE:
				setConstant_admittance((String)newValue);
				return;
			case VisGridPackage.HOUSE__VOLTAGE_FACTOR:
				setVoltage_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.HOUSE__OVERRIDE:
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
			case VisGridPackage.HOUSE__WEATHER:
				setWeather(WEATHER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__FLOOR_AREA:
				setFloor_area(FLOOR_AREA_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__GROSS_WALL_AREA:
				setGross_wall_area(GROSS_WALL_AREA_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__CEILING_HEIGHT:
				setCeiling_height(CEILING_HEIGHT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__ASPECT_RATIO:
				setAspect_ratio(ASPECT_RATIO_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__ENVELOPE_UA:
				setEnvelope_UA(ENVELOPE_UA_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__WINDOW_WALL_RATIO:
				setWindow_wall_ratio(WINDOW_WALL_RATIO_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__NUMBER_OF_DOORS:
				setNumber_of_doors(NUMBER_OF_DOORS_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__EXTERIOR_WALL_FRACTION:
				setExterior_wall_fraction(EXTERIOR_WALL_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__INTERIOR_EXTERIOR_WALL_RATIO:
				setInterior_exterior_wall_ratio(INTERIOR_EXTERIOR_WALL_RATIO_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__EXTERIOR_CEILING_FRACTION:
				setExterior_ceiling_fraction(EXTERIOR_CEILING_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__EXTERIOR_FLOOR_FRACTION:
				setExterior_floor_fraction(EXTERIOR_FLOOR_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__WINDOW_SHADING:
				setWindow_shading(WINDOW_SHADING_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT:
				setWindow_exterior_transmission_coefficient(WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__SOLAR_HEATGAIN_FACTOR:
				setSolar_heatgain_factor(SOLAR_HEATGAIN_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AIRCHANGE_PER_HOUR:
				setAirchange_per_hour(AIRCHANGE_PER_HOUR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AIRCHANGE_UA:
				setAirchange_UA(AIRCHANGE_UA_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__INTERNAL_GAIN:
				setInternal_gain(INTERNAL_GAIN_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__SOLAR_GAIN:
				setSolar_gain(SOLAR_GAIN_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HEAT_COOL_GAIN:
				setHeat_cool_gain(HEAT_COOL_GAIN_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__THERMOSTAT_DEADBAND:
				setThermostat_deadband(THERMOSTAT_DEADBAND_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__THERMOSTAT_CYCLE_TIME:
				setThermostat_cycle_time(THERMOSTAT_CYCLE_TIME_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__THERMOSTAT_LAST_CYCLE_TIME:
				setThermostat_last_cycle_time(THERMOSTAT_LAST_CYCLE_TIME_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HEATING_SETPOINT:
				setHeating_setpoint(HEATING_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__COOLING_SETPOINT:
				setCooling_setpoint(COOLING_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__DESIGN_HEATING_SETPOINT:
				setDesign_heating_setpoint(DESIGN_HEATING_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__DESIGN_COOLING_SETPOINT:
				setDesign_cooling_setpoint(DESIGN_COOLING_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__DESIGN_HEATING_CAPACITY:
				setDesign_heating_capacity(DESIGN_HEATING_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__DESIGN_COOLING_CAPACITY:
				setDesign_cooling_capacity(DESIGN_COOLING_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__ADJ_HEATING_CAP:
				setAdj_heating_cap(ADJ_HEATING_CAP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__SYS_RATED_CAP:
				setSys_rated_cap(SYS_RATED_CAP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__COOLING_DESIGN_TEMPERATURE:
				setCooling_design_temperature(COOLING_DESIGN_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HEATING_DESIGN_TEMPERATURE:
				setHeating_design_temperature(HEATING_DESIGN_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__DESIGN_PEAK_SOLAR:
				setDesign_peak_solar(DESIGN_PEAK_SOLAR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__DESIGN_INTERNAL_GAINS:
				setDesign_internal_gains(DESIGN_INTERNAL_GAINS_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AIR_HEAT_FRACTION:
				setAir_heat_fraction(AIR_HEAT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AUXILIARY_HEAT_CAPACITY:
				setAuxiliary_heat_capacity(AUXILIARY_HEAT_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AUX_HEAT_DEADBAND:
				setAux_heat_deadband(AUX_HEAT_DEADBAND_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT:
				setAux_heat_temperature_lockout(AUX_HEAT_TEMPERATURE_LOCKOUT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AUX_HEAT_TIME_DELAY:
				setAux_heat_time_delay(AUX_HEAT_TIME_DELAY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__COOLING_SUPPLY_AIR_TEMP:
				setCooling_supply_air_temp(COOLING_SUPPLY_AIR_TEMP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HEATING_SUPPLY_AIR_TEMP:
				setHeating_supply_air_temp(HEATING_SUPPLY_AIR_TEMP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__DUCT_PRESSURE_DROP:
				setDuct_pressure_drop(DUCT_PRESSURE_DROP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__FAN_DESIGN_POWER:
				setFan_design_power(FAN_DESIGN_POWER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__FAN_LOW_POWER_FRACTION:
				setFan_low_power_fraction(FAN_LOW_POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__FAN_POWER:
				setFan_power(FAN_POWER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__FAN_DESIGN_AIRFLOW:
				setFan_design_airflow(FAN_DESIGN_AIRFLOW_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__FAN_IMPEDANCE_FRACTION:
				setFan_impedance_fraction(FAN_IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__FAN_POWER_FRACTION:
				setFan_power_fraction(FAN_POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__FAN_CURRENT_FRACTION:
				setFan_current_fraction(FAN_CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__FAN_POWER_FACTOR:
				setFan_power_factor(FAN_POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HEATING_DEMAND:
				setHeating_demand(HEATING_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__COOLING_DEMAND:
				setCooling_demand(COOLING_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HEATING_COP:
				setHeating_COP(HEATING_COP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__COOLING_COP:
				setCooling_COP(COOLING_COP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__ADJ_HEATING_COP:
				setAdj_heating_cop(ADJ_HEATING_COP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AIR_TEMPERATURE:
				setAir_temperature(AIR_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__OUTDOOR_TEMPERATURE:
				setOutdoor_temperature(OUTDOOR_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__MASS_HEAT_CAPACITY:
				setMass_heat_capacity(MASS_HEAT_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__MASS_HEAT_COEFF:
				setMass_heat_coeff(MASS_HEAT_COEFF_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__MASS_TEMPERATURE:
				setMass_temperature(MASS_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AIR_VOLUME:
				setAir_volume(AIR_VOLUME_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AIR_MASS:
				setAir_mass(AIR_MASS_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AIR_HEAT_CAPACITY:
				setAir_heat_capacity(AIR_HEAT_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__LATENT_LOAD_FRACTION:
				setLatent_load_fraction(LATENT_LOAD_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__TOTAL_THERMAL_MASS_PER_FLOOR_AREA:
				setTotal_thermal_mass_per_floor_area(TOTAL_THERMAL_MASS_PER_FLOOR_AREA_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__INTERIOR_SURFACE_HEAT_TRANSFER_COEFF:
				setInterior_surface_heat_transfer_coeff(INTERIOR_SURFACE_HEAT_TRANSFER_COEFF_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__NUMBER_OF_STORIES:
				setNumber_of_stories(NUMBER_OF_STORIES_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__SYSTEM_TYPE:
				setSystem_type(SYSTEM_TYPE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AUXILIARY_STRATEGY:
				setAuxiliary_strategy(AUXILIARY_STRATEGY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__SYSTEM_MODE:
				setSystem_mode(SYSTEM_MODE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HEATING_SYSTEM_TYPE:
				setHeating_system_type(HEATING_SYSTEM_TYPE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__COOLING_SYSTEM_TYPE:
				setCooling_system_type(COOLING_SYSTEM_TYPE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE:
				setAuxiliary_system_type(AUXILIARY_SYSTEM_TYPE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__FAN_TYPE:
				setFan_type(FAN_TYPE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL:
				setThermal_integrity_level(THERMAL_INTEGRITY_LEVEL_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__GLASS_TYPE:
				setGlass_type(GLASS_TYPE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__WINDOW_FRAME:
				setWindow_frame(WINDOW_FRAME_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__GLAZING_TREATMENT:
				setGlazing_treatment(GLAZING_TREATMENT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__GLAZING_LAYERS:
				setGlazing_layers(GLAZING_LAYERS_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__MOTOR_MODEL:
				setMotor_model(MOTOR_MODEL_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__MOTOR_EFFICIENCY:
				setMotor_efficiency(MOTOR_EFFICIENCY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HVAC_MOTOR_EFFICIENCY:
				setHvac_motor_efficiency(HVAC_MOTOR_EFFICIENCY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HVAC_MOTOR_LOSS_POWER_FACTOR:
				setHvac_motor_loss_power_factor(HVAC_MOTOR_LOSS_POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__RROOF:
				setRroof(RROOF_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__RWALL:
				setRwall(RWALL_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__RFLOOR:
				setRfloor(RFLOOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__RWINDOWS:
				setRwindows(RWINDOWS_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__RDOORS:
				setRdoors(RDOORS_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HVAC_BREAKER_RATING:
				setHvac_breaker_rating(HVAC_BREAKER_RATING_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HVAC_POWER_FACTOR:
				setHvac_power_factor(HVAC_POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HVAC_LOAD:
				setHvac_load(HVAC_LOAD_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL:
				setPanel(PANEL_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_ENERGY:
				setPanel__energy(PANEL_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_POWER:
				setPanel__power(PANEL_POWER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_PEAK_DEMAND:
				setPanel__peak_demand(PANEL_PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_HEATGAIN:
				setPanel__heatgain(PANEL_HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_HEATGAIN_FRACTION:
				setPanel__heatgain_fraction(PANEL_HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_CURRENT_FRACTION:
				setPanel__current_fraction(PANEL_CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_IMPEDANCE_FRACTION:
				setPanel__impedance_fraction(PANEL_IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_POWER_FRACTION:
				setPanel__power_fraction(PANEL_POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_POWER_FACTOR:
				setPanel__power_factor(PANEL_POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_CONSTANT_POWER:
				setPanel__constant_power(PANEL_CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_CONSTANT_CURRENT:
				setPanel__constant_current(PANEL_CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_CONSTANT_ADMITTANCE:
				setPanel__constant_admittance(PANEL_CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_VOLTAGE_FACTOR:
				setPanel__voltage_factor(PANEL_VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PANEL_CONFIGURATION:
				setPanel__configuration(PANEL_CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__DESIGN_INTERNAL_GAIN_DENSITY:
				setDesign_internal_gain_density(DESIGN_INTERNAL_GAIN_DENSITY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__A:
				setA(A_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__B:
				setB(B_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__C:
				setC(C_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__D:
				setD(D_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__C1:
				setC1(C1_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__C2:
				setC2(C2_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__A3:
				setA3(A3_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__A4:
				setA4(A4_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__K1:
				setK1(K1_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__K2:
				setK2(K2_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__R1:
				setR1(R1_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__R2:
				setR2(R2_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__TEQ:
				setTeq(TEQ_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__TEVENT:
				setTevent(TEVENT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__QI:
				setQi(QI_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__QA:
				setQa(QA_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__QM:
				setQm(QM_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__QH:
				setQh(QH_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__DTAIR:
				setDTair(DTAIR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__SOL_INC:
				setSol_inc(SOL_INC_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__PEAK_DEMAND:
				setPeak_demand(PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HEATGAIN:
				setHeatgain(HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__HEATGAIN_FRACTION:
				setHeatgain_fraction(HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__CURRENT_FRACTION:
				setCurrent_fraction(CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__IMPEDANCE_FRACTION:
				setImpedance_fraction(IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__POWER_FRACTION:
				setPower_fraction(POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__CONSTANT_POWER:
				setConstant_power(CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__CONSTANT_CURRENT:
				setConstant_current(CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__CONSTANT_ADMITTANCE:
				setConstant_admittance(CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__VOLTAGE_FACTOR:
				setVoltage_factor(VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE__OVERRIDE:
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
			case VisGridPackage.HOUSE__WEATHER:
				return WEATHER_EDEFAULT == null ? weather != null : !WEATHER_EDEFAULT.equals(weather);
			case VisGridPackage.HOUSE__FLOOR_AREA:
				return FLOOR_AREA_EDEFAULT == null ? floor_area != null : !FLOOR_AREA_EDEFAULT.equals(floor_area);
			case VisGridPackage.HOUSE__GROSS_WALL_AREA:
				return GROSS_WALL_AREA_EDEFAULT == null ? gross_wall_area != null : !GROSS_WALL_AREA_EDEFAULT.equals(gross_wall_area);
			case VisGridPackage.HOUSE__CEILING_HEIGHT:
				return CEILING_HEIGHT_EDEFAULT == null ? ceiling_height != null : !CEILING_HEIGHT_EDEFAULT.equals(ceiling_height);
			case VisGridPackage.HOUSE__ASPECT_RATIO:
				return ASPECT_RATIO_EDEFAULT == null ? aspect_ratio != null : !ASPECT_RATIO_EDEFAULT.equals(aspect_ratio);
			case VisGridPackage.HOUSE__ENVELOPE_UA:
				return ENVELOPE_UA_EDEFAULT == null ? envelope_UA != null : !ENVELOPE_UA_EDEFAULT.equals(envelope_UA);
			case VisGridPackage.HOUSE__WINDOW_WALL_RATIO:
				return WINDOW_WALL_RATIO_EDEFAULT == null ? window_wall_ratio != null : !WINDOW_WALL_RATIO_EDEFAULT.equals(window_wall_ratio);
			case VisGridPackage.HOUSE__NUMBER_OF_DOORS:
				return NUMBER_OF_DOORS_EDEFAULT == null ? number_of_doors != null : !NUMBER_OF_DOORS_EDEFAULT.equals(number_of_doors);
			case VisGridPackage.HOUSE__EXTERIOR_WALL_FRACTION:
				return EXTERIOR_WALL_FRACTION_EDEFAULT == null ? exterior_wall_fraction != null : !EXTERIOR_WALL_FRACTION_EDEFAULT.equals(exterior_wall_fraction);
			case VisGridPackage.HOUSE__INTERIOR_EXTERIOR_WALL_RATIO:
				return INTERIOR_EXTERIOR_WALL_RATIO_EDEFAULT == null ? interior_exterior_wall_ratio != null : !INTERIOR_EXTERIOR_WALL_RATIO_EDEFAULT.equals(interior_exterior_wall_ratio);
			case VisGridPackage.HOUSE__EXTERIOR_CEILING_FRACTION:
				return EXTERIOR_CEILING_FRACTION_EDEFAULT == null ? exterior_ceiling_fraction != null : !EXTERIOR_CEILING_FRACTION_EDEFAULT.equals(exterior_ceiling_fraction);
			case VisGridPackage.HOUSE__EXTERIOR_FLOOR_FRACTION:
				return EXTERIOR_FLOOR_FRACTION_EDEFAULT == null ? exterior_floor_fraction != null : !EXTERIOR_FLOOR_FRACTION_EDEFAULT.equals(exterior_floor_fraction);
			case VisGridPackage.HOUSE__WINDOW_SHADING:
				return WINDOW_SHADING_EDEFAULT == null ? window_shading != null : !WINDOW_SHADING_EDEFAULT.equals(window_shading);
			case VisGridPackage.HOUSE__WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT:
				return WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT_EDEFAULT == null ? window_exterior_transmission_coefficient != null : !WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT_EDEFAULT.equals(window_exterior_transmission_coefficient);
			case VisGridPackage.HOUSE__SOLAR_HEATGAIN_FACTOR:
				return SOLAR_HEATGAIN_FACTOR_EDEFAULT == null ? solar_heatgain_factor != null : !SOLAR_HEATGAIN_FACTOR_EDEFAULT.equals(solar_heatgain_factor);
			case VisGridPackage.HOUSE__AIRCHANGE_PER_HOUR:
				return AIRCHANGE_PER_HOUR_EDEFAULT == null ? airchange_per_hour != null : !AIRCHANGE_PER_HOUR_EDEFAULT.equals(airchange_per_hour);
			case VisGridPackage.HOUSE__AIRCHANGE_UA:
				return AIRCHANGE_UA_EDEFAULT == null ? airchange_UA != null : !AIRCHANGE_UA_EDEFAULT.equals(airchange_UA);
			case VisGridPackage.HOUSE__INTERNAL_GAIN:
				return INTERNAL_GAIN_EDEFAULT == null ? internal_gain != null : !INTERNAL_GAIN_EDEFAULT.equals(internal_gain);
			case VisGridPackage.HOUSE__SOLAR_GAIN:
				return SOLAR_GAIN_EDEFAULT == null ? solar_gain != null : !SOLAR_GAIN_EDEFAULT.equals(solar_gain);
			case VisGridPackage.HOUSE__HEAT_COOL_GAIN:
				return HEAT_COOL_GAIN_EDEFAULT == null ? heat_cool_gain != null : !HEAT_COOL_GAIN_EDEFAULT.equals(heat_cool_gain);
			case VisGridPackage.HOUSE__THERMOSTAT_DEADBAND:
				return THERMOSTAT_DEADBAND_EDEFAULT == null ? thermostat_deadband != null : !THERMOSTAT_DEADBAND_EDEFAULT.equals(thermostat_deadband);
			case VisGridPackage.HOUSE__THERMOSTAT_CYCLE_TIME:
				return THERMOSTAT_CYCLE_TIME_EDEFAULT == null ? thermostat_cycle_time != null : !THERMOSTAT_CYCLE_TIME_EDEFAULT.equals(thermostat_cycle_time);
			case VisGridPackage.HOUSE__THERMOSTAT_LAST_CYCLE_TIME:
				return THERMOSTAT_LAST_CYCLE_TIME_EDEFAULT == null ? thermostat_last_cycle_time != null : !THERMOSTAT_LAST_CYCLE_TIME_EDEFAULT.equals(thermostat_last_cycle_time);
			case VisGridPackage.HOUSE__HEATING_SETPOINT:
				return HEATING_SETPOINT_EDEFAULT == null ? heating_setpoint != null : !HEATING_SETPOINT_EDEFAULT.equals(heating_setpoint);
			case VisGridPackage.HOUSE__COOLING_SETPOINT:
				return COOLING_SETPOINT_EDEFAULT == null ? cooling_setpoint != null : !COOLING_SETPOINT_EDEFAULT.equals(cooling_setpoint);
			case VisGridPackage.HOUSE__DESIGN_HEATING_SETPOINT:
				return DESIGN_HEATING_SETPOINT_EDEFAULT == null ? design_heating_setpoint != null : !DESIGN_HEATING_SETPOINT_EDEFAULT.equals(design_heating_setpoint);
			case VisGridPackage.HOUSE__DESIGN_COOLING_SETPOINT:
				return DESIGN_COOLING_SETPOINT_EDEFAULT == null ? design_cooling_setpoint != null : !DESIGN_COOLING_SETPOINT_EDEFAULT.equals(design_cooling_setpoint);
			case VisGridPackage.HOUSE__DESIGN_HEATING_CAPACITY:
				return DESIGN_HEATING_CAPACITY_EDEFAULT == null ? design_heating_capacity != null : !DESIGN_HEATING_CAPACITY_EDEFAULT.equals(design_heating_capacity);
			case VisGridPackage.HOUSE__DESIGN_COOLING_CAPACITY:
				return DESIGN_COOLING_CAPACITY_EDEFAULT == null ? design_cooling_capacity != null : !DESIGN_COOLING_CAPACITY_EDEFAULT.equals(design_cooling_capacity);
			case VisGridPackage.HOUSE__ADJ_HEATING_CAP:
				return ADJ_HEATING_CAP_EDEFAULT == null ? adj_heating_cap != null : !ADJ_HEATING_CAP_EDEFAULT.equals(adj_heating_cap);
			case VisGridPackage.HOUSE__SYS_RATED_CAP:
				return SYS_RATED_CAP_EDEFAULT == null ? sys_rated_cap != null : !SYS_RATED_CAP_EDEFAULT.equals(sys_rated_cap);
			case VisGridPackage.HOUSE__COOLING_DESIGN_TEMPERATURE:
				return COOLING_DESIGN_TEMPERATURE_EDEFAULT == null ? cooling_design_temperature != null : !COOLING_DESIGN_TEMPERATURE_EDEFAULT.equals(cooling_design_temperature);
			case VisGridPackage.HOUSE__HEATING_DESIGN_TEMPERATURE:
				return HEATING_DESIGN_TEMPERATURE_EDEFAULT == null ? heating_design_temperature != null : !HEATING_DESIGN_TEMPERATURE_EDEFAULT.equals(heating_design_temperature);
			case VisGridPackage.HOUSE__DESIGN_PEAK_SOLAR:
				return DESIGN_PEAK_SOLAR_EDEFAULT == null ? design_peak_solar != null : !DESIGN_PEAK_SOLAR_EDEFAULT.equals(design_peak_solar);
			case VisGridPackage.HOUSE__DESIGN_INTERNAL_GAINS:
				return DESIGN_INTERNAL_GAINS_EDEFAULT == null ? design_internal_gains != null : !DESIGN_INTERNAL_GAINS_EDEFAULT.equals(design_internal_gains);
			case VisGridPackage.HOUSE__AIR_HEAT_FRACTION:
				return AIR_HEAT_FRACTION_EDEFAULT == null ? air_heat_fraction != null : !AIR_HEAT_FRACTION_EDEFAULT.equals(air_heat_fraction);
			case VisGridPackage.HOUSE__AUXILIARY_HEAT_CAPACITY:
				return AUXILIARY_HEAT_CAPACITY_EDEFAULT == null ? auxiliary_heat_capacity != null : !AUXILIARY_HEAT_CAPACITY_EDEFAULT.equals(auxiliary_heat_capacity);
			case VisGridPackage.HOUSE__AUX_HEAT_DEADBAND:
				return AUX_HEAT_DEADBAND_EDEFAULT == null ? aux_heat_deadband != null : !AUX_HEAT_DEADBAND_EDEFAULT.equals(aux_heat_deadband);
			case VisGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT:
				return AUX_HEAT_TEMPERATURE_LOCKOUT_EDEFAULT == null ? aux_heat_temperature_lockout != null : !AUX_HEAT_TEMPERATURE_LOCKOUT_EDEFAULT.equals(aux_heat_temperature_lockout);
			case VisGridPackage.HOUSE__AUX_HEAT_TIME_DELAY:
				return AUX_HEAT_TIME_DELAY_EDEFAULT == null ? aux_heat_time_delay != null : !AUX_HEAT_TIME_DELAY_EDEFAULT.equals(aux_heat_time_delay);
			case VisGridPackage.HOUSE__COOLING_SUPPLY_AIR_TEMP:
				return COOLING_SUPPLY_AIR_TEMP_EDEFAULT == null ? cooling_supply_air_temp != null : !COOLING_SUPPLY_AIR_TEMP_EDEFAULT.equals(cooling_supply_air_temp);
			case VisGridPackage.HOUSE__HEATING_SUPPLY_AIR_TEMP:
				return HEATING_SUPPLY_AIR_TEMP_EDEFAULT == null ? heating_supply_air_temp != null : !HEATING_SUPPLY_AIR_TEMP_EDEFAULT.equals(heating_supply_air_temp);
			case VisGridPackage.HOUSE__DUCT_PRESSURE_DROP:
				return DUCT_PRESSURE_DROP_EDEFAULT == null ? duct_pressure_drop != null : !DUCT_PRESSURE_DROP_EDEFAULT.equals(duct_pressure_drop);
			case VisGridPackage.HOUSE__FAN_DESIGN_POWER:
				return FAN_DESIGN_POWER_EDEFAULT == null ? fan_design_power != null : !FAN_DESIGN_POWER_EDEFAULT.equals(fan_design_power);
			case VisGridPackage.HOUSE__FAN_LOW_POWER_FRACTION:
				return FAN_LOW_POWER_FRACTION_EDEFAULT == null ? fan_low_power_fraction != null : !FAN_LOW_POWER_FRACTION_EDEFAULT.equals(fan_low_power_fraction);
			case VisGridPackage.HOUSE__FAN_POWER:
				return FAN_POWER_EDEFAULT == null ? fan_power != null : !FAN_POWER_EDEFAULT.equals(fan_power);
			case VisGridPackage.HOUSE__FAN_DESIGN_AIRFLOW:
				return FAN_DESIGN_AIRFLOW_EDEFAULT == null ? fan_design_airflow != null : !FAN_DESIGN_AIRFLOW_EDEFAULT.equals(fan_design_airflow);
			case VisGridPackage.HOUSE__FAN_IMPEDANCE_FRACTION:
				return FAN_IMPEDANCE_FRACTION_EDEFAULT == null ? fan_impedance_fraction != null : !FAN_IMPEDANCE_FRACTION_EDEFAULT.equals(fan_impedance_fraction);
			case VisGridPackage.HOUSE__FAN_POWER_FRACTION:
				return FAN_POWER_FRACTION_EDEFAULT == null ? fan_power_fraction != null : !FAN_POWER_FRACTION_EDEFAULT.equals(fan_power_fraction);
			case VisGridPackage.HOUSE__FAN_CURRENT_FRACTION:
				return FAN_CURRENT_FRACTION_EDEFAULT == null ? fan_current_fraction != null : !FAN_CURRENT_FRACTION_EDEFAULT.equals(fan_current_fraction);
			case VisGridPackage.HOUSE__FAN_POWER_FACTOR:
				return FAN_POWER_FACTOR_EDEFAULT == null ? fan_power_factor != null : !FAN_POWER_FACTOR_EDEFAULT.equals(fan_power_factor);
			case VisGridPackage.HOUSE__HEATING_DEMAND:
				return HEATING_DEMAND_EDEFAULT == null ? heating_demand != null : !HEATING_DEMAND_EDEFAULT.equals(heating_demand);
			case VisGridPackage.HOUSE__COOLING_DEMAND:
				return COOLING_DEMAND_EDEFAULT == null ? cooling_demand != null : !COOLING_DEMAND_EDEFAULT.equals(cooling_demand);
			case VisGridPackage.HOUSE__HEATING_COP:
				return HEATING_COP_EDEFAULT == null ? heating_COP != null : !HEATING_COP_EDEFAULT.equals(heating_COP);
			case VisGridPackage.HOUSE__COOLING_COP:
				return COOLING_COP_EDEFAULT == null ? cooling_COP != null : !COOLING_COP_EDEFAULT.equals(cooling_COP);
			case VisGridPackage.HOUSE__ADJ_HEATING_COP:
				return ADJ_HEATING_COP_EDEFAULT == null ? adj_heating_cop != null : !ADJ_HEATING_COP_EDEFAULT.equals(adj_heating_cop);
			case VisGridPackage.HOUSE__AIR_TEMPERATURE:
				return AIR_TEMPERATURE_EDEFAULT == null ? air_temperature != null : !AIR_TEMPERATURE_EDEFAULT.equals(air_temperature);
			case VisGridPackage.HOUSE__OUTDOOR_TEMPERATURE:
				return OUTDOOR_TEMPERATURE_EDEFAULT == null ? outdoor_temperature != null : !OUTDOOR_TEMPERATURE_EDEFAULT.equals(outdoor_temperature);
			case VisGridPackage.HOUSE__MASS_HEAT_CAPACITY:
				return MASS_HEAT_CAPACITY_EDEFAULT == null ? mass_heat_capacity != null : !MASS_HEAT_CAPACITY_EDEFAULT.equals(mass_heat_capacity);
			case VisGridPackage.HOUSE__MASS_HEAT_COEFF:
				return MASS_HEAT_COEFF_EDEFAULT == null ? mass_heat_coeff != null : !MASS_HEAT_COEFF_EDEFAULT.equals(mass_heat_coeff);
			case VisGridPackage.HOUSE__MASS_TEMPERATURE:
				return MASS_TEMPERATURE_EDEFAULT == null ? mass_temperature != null : !MASS_TEMPERATURE_EDEFAULT.equals(mass_temperature);
			case VisGridPackage.HOUSE__AIR_VOLUME:
				return AIR_VOLUME_EDEFAULT == null ? air_volume != null : !AIR_VOLUME_EDEFAULT.equals(air_volume);
			case VisGridPackage.HOUSE__AIR_MASS:
				return AIR_MASS_EDEFAULT == null ? air_mass != null : !AIR_MASS_EDEFAULT.equals(air_mass);
			case VisGridPackage.HOUSE__AIR_HEAT_CAPACITY:
				return AIR_HEAT_CAPACITY_EDEFAULT == null ? air_heat_capacity != null : !AIR_HEAT_CAPACITY_EDEFAULT.equals(air_heat_capacity);
			case VisGridPackage.HOUSE__LATENT_LOAD_FRACTION:
				return LATENT_LOAD_FRACTION_EDEFAULT == null ? latent_load_fraction != null : !LATENT_LOAD_FRACTION_EDEFAULT.equals(latent_load_fraction);
			case VisGridPackage.HOUSE__TOTAL_THERMAL_MASS_PER_FLOOR_AREA:
				return TOTAL_THERMAL_MASS_PER_FLOOR_AREA_EDEFAULT == null ? total_thermal_mass_per_floor_area != null : !TOTAL_THERMAL_MASS_PER_FLOOR_AREA_EDEFAULT.equals(total_thermal_mass_per_floor_area);
			case VisGridPackage.HOUSE__INTERIOR_SURFACE_HEAT_TRANSFER_COEFF:
				return INTERIOR_SURFACE_HEAT_TRANSFER_COEFF_EDEFAULT == null ? interior_surface_heat_transfer_coeff != null : !INTERIOR_SURFACE_HEAT_TRANSFER_COEFF_EDEFAULT.equals(interior_surface_heat_transfer_coeff);
			case VisGridPackage.HOUSE__NUMBER_OF_STORIES:
				return NUMBER_OF_STORIES_EDEFAULT == null ? number_of_stories != null : !NUMBER_OF_STORIES_EDEFAULT.equals(number_of_stories);
			case VisGridPackage.HOUSE__SYSTEM_TYPE:
				return SYSTEM_TYPE_EDEFAULT == null ? system_type != null : !SYSTEM_TYPE_EDEFAULT.equals(system_type);
			case VisGridPackage.HOUSE__AUXILIARY_STRATEGY:
				return AUXILIARY_STRATEGY_EDEFAULT == null ? auxiliary_strategy != null : !AUXILIARY_STRATEGY_EDEFAULT.equals(auxiliary_strategy);
			case VisGridPackage.HOUSE__SYSTEM_MODE:
				return SYSTEM_MODE_EDEFAULT == null ? system_mode != null : !SYSTEM_MODE_EDEFAULT.equals(system_mode);
			case VisGridPackage.HOUSE__HEATING_SYSTEM_TYPE:
				return HEATING_SYSTEM_TYPE_EDEFAULT == null ? heating_system_type != null : !HEATING_SYSTEM_TYPE_EDEFAULT.equals(heating_system_type);
			case VisGridPackage.HOUSE__COOLING_SYSTEM_TYPE:
				return COOLING_SYSTEM_TYPE_EDEFAULT == null ? cooling_system_type != null : !COOLING_SYSTEM_TYPE_EDEFAULT.equals(cooling_system_type);
			case VisGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE:
				return AUXILIARY_SYSTEM_TYPE_EDEFAULT == null ? auxiliary_system_type != null : !AUXILIARY_SYSTEM_TYPE_EDEFAULT.equals(auxiliary_system_type);
			case VisGridPackage.HOUSE__FAN_TYPE:
				return FAN_TYPE_EDEFAULT == null ? fan_type != null : !FAN_TYPE_EDEFAULT.equals(fan_type);
			case VisGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL:
				return THERMAL_INTEGRITY_LEVEL_EDEFAULT == null ? thermal_integrity_level != null : !THERMAL_INTEGRITY_LEVEL_EDEFAULT.equals(thermal_integrity_level);
			case VisGridPackage.HOUSE__GLASS_TYPE:
				return GLASS_TYPE_EDEFAULT == null ? glass_type != null : !GLASS_TYPE_EDEFAULT.equals(glass_type);
			case VisGridPackage.HOUSE__WINDOW_FRAME:
				return WINDOW_FRAME_EDEFAULT == null ? window_frame != null : !WINDOW_FRAME_EDEFAULT.equals(window_frame);
			case VisGridPackage.HOUSE__GLAZING_TREATMENT:
				return GLAZING_TREATMENT_EDEFAULT == null ? glazing_treatment != null : !GLAZING_TREATMENT_EDEFAULT.equals(glazing_treatment);
			case VisGridPackage.HOUSE__GLAZING_LAYERS:
				return GLAZING_LAYERS_EDEFAULT == null ? glazing_layers != null : !GLAZING_LAYERS_EDEFAULT.equals(glazing_layers);
			case VisGridPackage.HOUSE__MOTOR_MODEL:
				return MOTOR_MODEL_EDEFAULT == null ? motor_model != null : !MOTOR_MODEL_EDEFAULT.equals(motor_model);
			case VisGridPackage.HOUSE__MOTOR_EFFICIENCY:
				return MOTOR_EFFICIENCY_EDEFAULT == null ? motor_efficiency != null : !MOTOR_EFFICIENCY_EDEFAULT.equals(motor_efficiency);
			case VisGridPackage.HOUSE__HVAC_MOTOR_EFFICIENCY:
				return HVAC_MOTOR_EFFICIENCY_EDEFAULT == null ? hvac_motor_efficiency != null : !HVAC_MOTOR_EFFICIENCY_EDEFAULT.equals(hvac_motor_efficiency);
			case VisGridPackage.HOUSE__HVAC_MOTOR_LOSS_POWER_FACTOR:
				return HVAC_MOTOR_LOSS_POWER_FACTOR_EDEFAULT == null ? hvac_motor_loss_power_factor != null : !HVAC_MOTOR_LOSS_POWER_FACTOR_EDEFAULT.equals(hvac_motor_loss_power_factor);
			case VisGridPackage.HOUSE__RROOF:
				return RROOF_EDEFAULT == null ? rroof != null : !RROOF_EDEFAULT.equals(rroof);
			case VisGridPackage.HOUSE__RWALL:
				return RWALL_EDEFAULT == null ? rwall != null : !RWALL_EDEFAULT.equals(rwall);
			case VisGridPackage.HOUSE__RFLOOR:
				return RFLOOR_EDEFAULT == null ? rfloor != null : !RFLOOR_EDEFAULT.equals(rfloor);
			case VisGridPackage.HOUSE__RWINDOWS:
				return RWINDOWS_EDEFAULT == null ? rwindows != null : !RWINDOWS_EDEFAULT.equals(rwindows);
			case VisGridPackage.HOUSE__RDOORS:
				return RDOORS_EDEFAULT == null ? rdoors != null : !RDOORS_EDEFAULT.equals(rdoors);
			case VisGridPackage.HOUSE__HVAC_BREAKER_RATING:
				return HVAC_BREAKER_RATING_EDEFAULT == null ? hvac_breaker_rating != null : !HVAC_BREAKER_RATING_EDEFAULT.equals(hvac_breaker_rating);
			case VisGridPackage.HOUSE__HVAC_POWER_FACTOR:
				return HVAC_POWER_FACTOR_EDEFAULT == null ? hvac_power_factor != null : !HVAC_POWER_FACTOR_EDEFAULT.equals(hvac_power_factor);
			case VisGridPackage.HOUSE__HVAC_LOAD:
				return HVAC_LOAD_EDEFAULT == null ? hvac_load != null : !HVAC_LOAD_EDEFAULT.equals(hvac_load);
			case VisGridPackage.HOUSE__PANEL:
				return PANEL_EDEFAULT == null ? panel != null : !PANEL_EDEFAULT.equals(panel);
			case VisGridPackage.HOUSE__PANEL_ENERGY:
				return PANEL_ENERGY_EDEFAULT == null ? panel__energy != null : !PANEL_ENERGY_EDEFAULT.equals(panel__energy);
			case VisGridPackage.HOUSE__PANEL_POWER:
				return PANEL_POWER_EDEFAULT == null ? panel__power != null : !PANEL_POWER_EDEFAULT.equals(panel__power);
			case VisGridPackage.HOUSE__PANEL_PEAK_DEMAND:
				return PANEL_PEAK_DEMAND_EDEFAULT == null ? panel__peak_demand != null : !PANEL_PEAK_DEMAND_EDEFAULT.equals(panel__peak_demand);
			case VisGridPackage.HOUSE__PANEL_HEATGAIN:
				return PANEL_HEATGAIN_EDEFAULT == null ? panel__heatgain != null : !PANEL_HEATGAIN_EDEFAULT.equals(panel__heatgain);
			case VisGridPackage.HOUSE__PANEL_HEATGAIN_FRACTION:
				return PANEL_HEATGAIN_FRACTION_EDEFAULT == null ? panel__heatgain_fraction != null : !PANEL_HEATGAIN_FRACTION_EDEFAULT.equals(panel__heatgain_fraction);
			case VisGridPackage.HOUSE__PANEL_CURRENT_FRACTION:
				return PANEL_CURRENT_FRACTION_EDEFAULT == null ? panel__current_fraction != null : !PANEL_CURRENT_FRACTION_EDEFAULT.equals(panel__current_fraction);
			case VisGridPackage.HOUSE__PANEL_IMPEDANCE_FRACTION:
				return PANEL_IMPEDANCE_FRACTION_EDEFAULT == null ? panel__impedance_fraction != null : !PANEL_IMPEDANCE_FRACTION_EDEFAULT.equals(panel__impedance_fraction);
			case VisGridPackage.HOUSE__PANEL_POWER_FRACTION:
				return PANEL_POWER_FRACTION_EDEFAULT == null ? panel__power_fraction != null : !PANEL_POWER_FRACTION_EDEFAULT.equals(panel__power_fraction);
			case VisGridPackage.HOUSE__PANEL_POWER_FACTOR:
				return PANEL_POWER_FACTOR_EDEFAULT == null ? panel__power_factor != null : !PANEL_POWER_FACTOR_EDEFAULT.equals(panel__power_factor);
			case VisGridPackage.HOUSE__PANEL_CONSTANT_POWER:
				return PANEL_CONSTANT_POWER_EDEFAULT == null ? panel__constant_power != null : !PANEL_CONSTANT_POWER_EDEFAULT.equals(panel__constant_power);
			case VisGridPackage.HOUSE__PANEL_CONSTANT_CURRENT:
				return PANEL_CONSTANT_CURRENT_EDEFAULT == null ? panel__constant_current != null : !PANEL_CONSTANT_CURRENT_EDEFAULT.equals(panel__constant_current);
			case VisGridPackage.HOUSE__PANEL_CONSTANT_ADMITTANCE:
				return PANEL_CONSTANT_ADMITTANCE_EDEFAULT == null ? panel__constant_admittance != null : !PANEL_CONSTANT_ADMITTANCE_EDEFAULT.equals(panel__constant_admittance);
			case VisGridPackage.HOUSE__PANEL_VOLTAGE_FACTOR:
				return PANEL_VOLTAGE_FACTOR_EDEFAULT == null ? panel__voltage_factor != null : !PANEL_VOLTAGE_FACTOR_EDEFAULT.equals(panel__voltage_factor);
			case VisGridPackage.HOUSE__PANEL_CONFIGURATION:
				return PANEL_CONFIGURATION_EDEFAULT == null ? panel__configuration != null : !PANEL_CONFIGURATION_EDEFAULT.equals(panel__configuration);
			case VisGridPackage.HOUSE__DESIGN_INTERNAL_GAIN_DENSITY:
				return DESIGN_INTERNAL_GAIN_DENSITY_EDEFAULT == null ? design_internal_gain_density != null : !DESIGN_INTERNAL_GAIN_DENSITY_EDEFAULT.equals(design_internal_gain_density);
			case VisGridPackage.HOUSE__A:
				return A_EDEFAULT == null ? a != null : !A_EDEFAULT.equals(a);
			case VisGridPackage.HOUSE__B:
				return B_EDEFAULT == null ? b != null : !B_EDEFAULT.equals(b);
			case VisGridPackage.HOUSE__C:
				return C_EDEFAULT == null ? c != null : !C_EDEFAULT.equals(c);
			case VisGridPackage.HOUSE__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case VisGridPackage.HOUSE__C1:
				return C1_EDEFAULT == null ? c1 != null : !C1_EDEFAULT.equals(c1);
			case VisGridPackage.HOUSE__C2:
				return C2_EDEFAULT == null ? c2 != null : !C2_EDEFAULT.equals(c2);
			case VisGridPackage.HOUSE__A3:
				return A3_EDEFAULT == null ? a3 != null : !A3_EDEFAULT.equals(a3);
			case VisGridPackage.HOUSE__A4:
				return A4_EDEFAULT == null ? a4 != null : !A4_EDEFAULT.equals(a4);
			case VisGridPackage.HOUSE__K1:
				return K1_EDEFAULT == null ? k1 != null : !K1_EDEFAULT.equals(k1);
			case VisGridPackage.HOUSE__K2:
				return K2_EDEFAULT == null ? k2 != null : !K2_EDEFAULT.equals(k2);
			case VisGridPackage.HOUSE__R1:
				return R1_EDEFAULT == null ? r1 != null : !R1_EDEFAULT.equals(r1);
			case VisGridPackage.HOUSE__R2:
				return R2_EDEFAULT == null ? r2 != null : !R2_EDEFAULT.equals(r2);
			case VisGridPackage.HOUSE__TEQ:
				return TEQ_EDEFAULT == null ? teq != null : !TEQ_EDEFAULT.equals(teq);
			case VisGridPackage.HOUSE__TEVENT:
				return TEVENT_EDEFAULT == null ? tevent != null : !TEVENT_EDEFAULT.equals(tevent);
			case VisGridPackage.HOUSE__QI:
				return QI_EDEFAULT == null ? qi != null : !QI_EDEFAULT.equals(qi);
			case VisGridPackage.HOUSE__QA:
				return QA_EDEFAULT == null ? qa != null : !QA_EDEFAULT.equals(qa);
			case VisGridPackage.HOUSE__QM:
				return QM_EDEFAULT == null ? qm != null : !QM_EDEFAULT.equals(qm);
			case VisGridPackage.HOUSE__QH:
				return QH_EDEFAULT == null ? qh != null : !QH_EDEFAULT.equals(qh);
			case VisGridPackage.HOUSE__DTAIR:
				return DTAIR_EDEFAULT == null ? dTair != null : !DTAIR_EDEFAULT.equals(dTair);
			case VisGridPackage.HOUSE__SOL_INC:
				return SOL_INC_EDEFAULT == null ? sol_inc != null : !SOL_INC_EDEFAULT.equals(sol_inc);
			case VisGridPackage.HOUSE__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case VisGridPackage.HOUSE__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.HOUSE__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.HOUSE__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.HOUSE__PEAK_DEMAND:
				return PEAK_DEMAND_EDEFAULT == null ? peak_demand != null : !PEAK_DEMAND_EDEFAULT.equals(peak_demand);
			case VisGridPackage.HOUSE__HEATGAIN:
				return HEATGAIN_EDEFAULT == null ? heatgain != null : !HEATGAIN_EDEFAULT.equals(heatgain);
			case VisGridPackage.HOUSE__HEATGAIN_FRACTION:
				return HEATGAIN_FRACTION_EDEFAULT == null ? heatgain_fraction != null : !HEATGAIN_FRACTION_EDEFAULT.equals(heatgain_fraction);
			case VisGridPackage.HOUSE__CURRENT_FRACTION:
				return CURRENT_FRACTION_EDEFAULT == null ? current_fraction != null : !CURRENT_FRACTION_EDEFAULT.equals(current_fraction);
			case VisGridPackage.HOUSE__IMPEDANCE_FRACTION:
				return IMPEDANCE_FRACTION_EDEFAULT == null ? impedance_fraction != null : !IMPEDANCE_FRACTION_EDEFAULT.equals(impedance_fraction);
			case VisGridPackage.HOUSE__POWER_FRACTION:
				return POWER_FRACTION_EDEFAULT == null ? power_fraction != null : !POWER_FRACTION_EDEFAULT.equals(power_fraction);
			case VisGridPackage.HOUSE__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.HOUSE__CONSTANT_POWER:
				return CONSTANT_POWER_EDEFAULT == null ? constant_power != null : !CONSTANT_POWER_EDEFAULT.equals(constant_power);
			case VisGridPackage.HOUSE__CONSTANT_CURRENT:
				return CONSTANT_CURRENT_EDEFAULT == null ? constant_current != null : !CONSTANT_CURRENT_EDEFAULT.equals(constant_current);
			case VisGridPackage.HOUSE__CONSTANT_ADMITTANCE:
				return CONSTANT_ADMITTANCE_EDEFAULT == null ? constant_admittance != null : !CONSTANT_ADMITTANCE_EDEFAULT.equals(constant_admittance);
			case VisGridPackage.HOUSE__VOLTAGE_FACTOR:
				return VOLTAGE_FACTOR_EDEFAULT == null ? voltage_factor != null : !VOLTAGE_FACTOR_EDEFAULT.equals(voltage_factor);
			case VisGridPackage.HOUSE__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.HOUSE__OVERRIDE:
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
		result.append(" (weather: ");
		result.append(weather);
		result.append(", floor_area: ");
		result.append(floor_area);
		result.append(", gross_wall_area: ");
		result.append(gross_wall_area);
		result.append(", ceiling_height: ");
		result.append(ceiling_height);
		result.append(", aspect_ratio: ");
		result.append(aspect_ratio);
		result.append(", envelope_UA: ");
		result.append(envelope_UA);
		result.append(", window_wall_ratio: ");
		result.append(window_wall_ratio);
		result.append(", number_of_doors: ");
		result.append(number_of_doors);
		result.append(", exterior_wall_fraction: ");
		result.append(exterior_wall_fraction);
		result.append(", interior_exterior_wall_ratio: ");
		result.append(interior_exterior_wall_ratio);
		result.append(", exterior_ceiling_fraction: ");
		result.append(exterior_ceiling_fraction);
		result.append(", exterior_floor_fraction: ");
		result.append(exterior_floor_fraction);
		result.append(", window_shading: ");
		result.append(window_shading);
		result.append(", window_exterior_transmission_coefficient: ");
		result.append(window_exterior_transmission_coefficient);
		result.append(", solar_heatgain_factor: ");
		result.append(solar_heatgain_factor);
		result.append(", airchange_per_hour: ");
		result.append(airchange_per_hour);
		result.append(", airchange_UA: ");
		result.append(airchange_UA);
		result.append(", internal_gain: ");
		result.append(internal_gain);
		result.append(", solar_gain: ");
		result.append(solar_gain);
		result.append(", heat_cool_gain: ");
		result.append(heat_cool_gain);
		result.append(", thermostat_deadband: ");
		result.append(thermostat_deadband);
		result.append(", thermostat_cycle_time: ");
		result.append(thermostat_cycle_time);
		result.append(", thermostat_last_cycle_time: ");
		result.append(thermostat_last_cycle_time);
		result.append(", heating_setpoint: ");
		result.append(heating_setpoint);
		result.append(", cooling_setpoint: ");
		result.append(cooling_setpoint);
		result.append(", design_heating_setpoint: ");
		result.append(design_heating_setpoint);
		result.append(", design_cooling_setpoint: ");
		result.append(design_cooling_setpoint);
		result.append(", design_heating_capacity: ");
		result.append(design_heating_capacity);
		result.append(", design_cooling_capacity: ");
		result.append(design_cooling_capacity);
		result.append(", adj_heating_cap: ");
		result.append(adj_heating_cap);
		result.append(", sys_rated_cap: ");
		result.append(sys_rated_cap);
		result.append(", cooling_design_temperature: ");
		result.append(cooling_design_temperature);
		result.append(", heating_design_temperature: ");
		result.append(heating_design_temperature);
		result.append(", design_peak_solar: ");
		result.append(design_peak_solar);
		result.append(", design_internal_gains: ");
		result.append(design_internal_gains);
		result.append(", air_heat_fraction: ");
		result.append(air_heat_fraction);
		result.append(", auxiliary_heat_capacity: ");
		result.append(auxiliary_heat_capacity);
		result.append(", aux_heat_deadband: ");
		result.append(aux_heat_deadband);
		result.append(", aux_heat_temperature_lockout: ");
		result.append(aux_heat_temperature_lockout);
		result.append(", aux_heat_time_delay: ");
		result.append(aux_heat_time_delay);
		result.append(", cooling_supply_air_temp: ");
		result.append(cooling_supply_air_temp);
		result.append(", heating_supply_air_temp: ");
		result.append(heating_supply_air_temp);
		result.append(", duct_pressure_drop: ");
		result.append(duct_pressure_drop);
		result.append(", fan_design_power: ");
		result.append(fan_design_power);
		result.append(", fan_low_power_fraction: ");
		result.append(fan_low_power_fraction);
		result.append(", fan_power: ");
		result.append(fan_power);
		result.append(", fan_design_airflow: ");
		result.append(fan_design_airflow);
		result.append(", fan_impedance_fraction: ");
		result.append(fan_impedance_fraction);
		result.append(", fan_power_fraction: ");
		result.append(fan_power_fraction);
		result.append(", fan_current_fraction: ");
		result.append(fan_current_fraction);
		result.append(", fan_power_factor: ");
		result.append(fan_power_factor);
		result.append(", heating_demand: ");
		result.append(heating_demand);
		result.append(", cooling_demand: ");
		result.append(cooling_demand);
		result.append(", heating_COP: ");
		result.append(heating_COP);
		result.append(", cooling_COP: ");
		result.append(cooling_COP);
		result.append(", adj_heating_cop: ");
		result.append(adj_heating_cop);
		result.append(", air_temperature: ");
		result.append(air_temperature);
		result.append(", outdoor_temperature: ");
		result.append(outdoor_temperature);
		result.append(", mass_heat_capacity: ");
		result.append(mass_heat_capacity);
		result.append(", mass_heat_coeff: ");
		result.append(mass_heat_coeff);
		result.append(", mass_temperature: ");
		result.append(mass_temperature);
		result.append(", air_volume: ");
		result.append(air_volume);
		result.append(", air_mass: ");
		result.append(air_mass);
		result.append(", air_heat_capacity: ");
		result.append(air_heat_capacity);
		result.append(", latent_load_fraction: ");
		result.append(latent_load_fraction);
		result.append(", total_thermal_mass_per_floor_area: ");
		result.append(total_thermal_mass_per_floor_area);
		result.append(", interior_surface_heat_transfer_coeff: ");
		result.append(interior_surface_heat_transfer_coeff);
		result.append(", number_of_stories: ");
		result.append(number_of_stories);
		result.append(", system_type: ");
		result.append(system_type);
		result.append(", auxiliary_strategy: ");
		result.append(auxiliary_strategy);
		result.append(", system_mode: ");
		result.append(system_mode);
		result.append(", heating_system_type: ");
		result.append(heating_system_type);
		result.append(", cooling_system_type: ");
		result.append(cooling_system_type);
		result.append(", auxiliary_system_type: ");
		result.append(auxiliary_system_type);
		result.append(", fan_type: ");
		result.append(fan_type);
		result.append(", thermal_integrity_level: ");
		result.append(thermal_integrity_level);
		result.append(", glass_type: ");
		result.append(glass_type);
		result.append(", window_frame: ");
		result.append(window_frame);
		result.append(", glazing_treatment: ");
		result.append(glazing_treatment);
		result.append(", glazing_layers: ");
		result.append(glazing_layers);
		result.append(", motor_model: ");
		result.append(motor_model);
		result.append(", motor_efficiency: ");
		result.append(motor_efficiency);
		result.append(", hvac_motor_efficiency: ");
		result.append(hvac_motor_efficiency);
		result.append(", hvac_motor_loss_power_factor: ");
		result.append(hvac_motor_loss_power_factor);
		result.append(", Rroof: ");
		result.append(rroof);
		result.append(", Rwall: ");
		result.append(rwall);
		result.append(", Rfloor: ");
		result.append(rfloor);
		result.append(", Rwindows: ");
		result.append(rwindows);
		result.append(", Rdoors: ");
		result.append(rdoors);
		result.append(", hvac_breaker_rating: ");
		result.append(hvac_breaker_rating);
		result.append(", hvac_power_factor: ");
		result.append(hvac_power_factor);
		result.append(", hvac_load: ");
		result.append(hvac_load);
		result.append(", panel: ");
		result.append(panel);
		result.append(", panel__energy: ");
		result.append(panel__energy);
		result.append(", panel__power: ");
		result.append(panel__power);
		result.append(", panel__peak_demand: ");
		result.append(panel__peak_demand);
		result.append(", panel__heatgain: ");
		result.append(panel__heatgain);
		result.append(", panel__heatgain_fraction: ");
		result.append(panel__heatgain_fraction);
		result.append(", panel__current_fraction: ");
		result.append(panel__current_fraction);
		result.append(", panel__impedance_fraction: ");
		result.append(panel__impedance_fraction);
		result.append(", panel__power_fraction: ");
		result.append(panel__power_fraction);
		result.append(", panel__power_factor: ");
		result.append(panel__power_factor);
		result.append(", panel__constant_power: ");
		result.append(panel__constant_power);
		result.append(", panel__constant_current: ");
		result.append(panel__constant_current);
		result.append(", panel__constant_admittance: ");
		result.append(panel__constant_admittance);
		result.append(", panel__voltage_factor: ");
		result.append(panel__voltage_factor);
		result.append(", panel__configuration: ");
		result.append(panel__configuration);
		result.append(", design_internal_gain_density: ");
		result.append(design_internal_gain_density);
		result.append(", a: ");
		result.append(a);
		result.append(", b: ");
		result.append(b);
		result.append(", c: ");
		result.append(c);
		result.append(", d: ");
		result.append(d);
		result.append(", c1: ");
		result.append(c1);
		result.append(", c2: ");
		result.append(c2);
		result.append(", A3: ");
		result.append(a3);
		result.append(", A4: ");
		result.append(a4);
		result.append(", k1: ");
		result.append(k1);
		result.append(", k2: ");
		result.append(k2);
		result.append(", r1: ");
		result.append(r1);
		result.append(", r2: ");
		result.append(r2);
		result.append(", Teq: ");
		result.append(teq);
		result.append(", Tevent: ");
		result.append(tevent);
		result.append(", Qi: ");
		result.append(qi);
		result.append(", Qa: ");
		result.append(qa);
		result.append(", Qm: ");
		result.append(qm);
		result.append(", Qh: ");
		result.append(qh);
		result.append(", dTair: ");
		result.append(dTair);
		result.append(", sol_inc: ");
		result.append(sol_inc);
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

} //HouseImpl
