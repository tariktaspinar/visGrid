/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import visGrid.Connections;
import visGrid.Microwave;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microwave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getInstalled_power <em>Installed power</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getStandby_power <em>Standby power</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getCircuit_split <em>Circuit split</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getState <em>State</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getCycle_length <em>Cycle length</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getState_time <em>State time</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.MicrowaveImpl#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MicrowaveImpl extends EObjectImpl implements Microwave {
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connections> connection;

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
	 * The default value of the '{@link #getInstalled_power() <em>Installed power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalled_power()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALLED_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstalled_power() <em>Installed power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalled_power()
	 * @generated
	 * @ordered
	 */
	protected String installed_power = INSTALLED_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandby_power() <em>Standby power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandby_power()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDBY_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandby_power() <em>Standby power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandby_power()
	 * @generated
	 * @ordered
	 */
	protected String standby_power = STANDBY_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCircuit_split() <em>Circuit split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuit_split()
	 * @generated
	 * @ordered
	 */
	protected static final String CIRCUIT_SPLIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCircuit_split() <em>Circuit split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuit_split()
	 * @generated
	 * @ordered
	 */
	protected String circuit_split = CIRCUIT_SPLIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCycle_length() <em>Cycle length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle_length()
	 * @generated
	 * @ordered
	 */
	protected static final String CYCLE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCycle_length() <em>Cycle length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle_length()
	 * @generated
	 * @ordered
	 */
	protected String cycle_length = CYCLE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected String runtime = RUNTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState_time() <em>State time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_time()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState_time() <em>State time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_time()
	 * @generated
	 * @ordered
	 */
	protected String state_time = STATE_TIME_EDEFAULT;

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
	protected MicrowaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getMicrowave();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.MICROWAVE__CONNECTION);
		}
		return connection;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstalled_power() {
		return installed_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstalled_power(String newInstalled_power) {
		String oldInstalled_power = installed_power;
		installed_power = newInstalled_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__INSTALLED_POWER, oldInstalled_power, installed_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandby_power() {
		return standby_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandby_power(String newStandby_power) {
		String oldStandby_power = standby_power;
		standby_power = newStandby_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__STANDBY_POWER, oldStandby_power, standby_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCircuit_split() {
		return circuit_split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuit_split(String newCircuit_split) {
		String oldCircuit_split = circuit_split;
		circuit_split = newCircuit_split;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__CIRCUIT_SPLIT, oldCircuit_split, circuit_split));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCycle_length() {
		return cycle_length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycle_length(String newCycle_length) {
		String oldCycle_length = cycle_length;
		cycle_length = newCycle_length;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__CYCLE_LENGTH, oldCycle_length, cycle_length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntime(String newRuntime) {
		String oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__RUNTIME, oldRuntime, runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState_time() {
		return state_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState_time(String newState_time) {
		String oldState_time = state_time;
		state_time = newState_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__STATE_TIME, oldState_time, state_time));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__SHAPE, oldShape, shape));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__LOAD, oldLoad, load));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__ENERGY, oldEnergy, energy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__POWER, oldPower, power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__PEAK_DEMAND, oldPeak_demand, peak_demand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__HEATGAIN, oldHeatgain, heatgain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__HEATGAIN_FRACTION, oldHeatgain_fraction, heatgain_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__CURRENT_FRACTION, oldCurrent_fraction, current_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__IMPEDANCE_FRACTION, oldImpedance_fraction, impedance_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__POWER_FRACTION, oldPower_fraction, power_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__POWER_FACTOR, oldPower_factor, power_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__CONSTANT_POWER, oldConstant_power, constant_power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__CONSTANT_CURRENT, oldConstant_current, constant_current));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__CONSTANT_ADMITTANCE, oldConstant_admittance, constant_admittance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__VOLTAGE_FACTOR, oldVoltage_factor, voltage_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__CONFIGURATION, oldConfiguration, configuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROWAVE__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.MICROWAVE__CONNECTION:
				return getConnection();
			case VisGridPackage.MICROWAVE__NAME:
				return getName();
			case VisGridPackage.MICROWAVE__INSTALLED_POWER:
				return getInstalled_power();
			case VisGridPackage.MICROWAVE__STANDBY_POWER:
				return getStandby_power();
			case VisGridPackage.MICROWAVE__CIRCUIT_SPLIT:
				return getCircuit_split();
			case VisGridPackage.MICROWAVE__STATE:
				return getState();
			case VisGridPackage.MICROWAVE__CYCLE_LENGTH:
				return getCycle_length();
			case VisGridPackage.MICROWAVE__RUNTIME:
				return getRuntime();
			case VisGridPackage.MICROWAVE__STATE_TIME:
				return getState_time();
			case VisGridPackage.MICROWAVE__SHAPE:
				return getShape();
			case VisGridPackage.MICROWAVE__LOAD:
				return getLoad();
			case VisGridPackage.MICROWAVE__ENERGY:
				return getEnergy();
			case VisGridPackage.MICROWAVE__POWER:
				return getPower();
			case VisGridPackage.MICROWAVE__PEAK_DEMAND:
				return getPeak_demand();
			case VisGridPackage.MICROWAVE__HEATGAIN:
				return getHeatgain();
			case VisGridPackage.MICROWAVE__HEATGAIN_FRACTION:
				return getHeatgain_fraction();
			case VisGridPackage.MICROWAVE__CURRENT_FRACTION:
				return getCurrent_fraction();
			case VisGridPackage.MICROWAVE__IMPEDANCE_FRACTION:
				return getImpedance_fraction();
			case VisGridPackage.MICROWAVE__POWER_FRACTION:
				return getPower_fraction();
			case VisGridPackage.MICROWAVE__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.MICROWAVE__CONSTANT_POWER:
				return getConstant_power();
			case VisGridPackage.MICROWAVE__CONSTANT_CURRENT:
				return getConstant_current();
			case VisGridPackage.MICROWAVE__CONSTANT_ADMITTANCE:
				return getConstant_admittance();
			case VisGridPackage.MICROWAVE__VOLTAGE_FACTOR:
				return getVoltage_factor();
			case VisGridPackage.MICROWAVE__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.MICROWAVE__OVERRIDE:
				return getOverride();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisGridPackage.MICROWAVE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.MICROWAVE__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__INSTALLED_POWER:
				setInstalled_power((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__STANDBY_POWER:
				setStandby_power((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__CIRCUIT_SPLIT:
				setCircuit_split((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__STATE:
				setState((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__CYCLE_LENGTH:
				setCycle_length((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__RUNTIME:
				setRuntime((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__STATE_TIME:
				setState_time((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__SHAPE:
				setShape((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__PEAK_DEMAND:
				setPeak_demand((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__HEATGAIN:
				setHeatgain((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__HEATGAIN_FRACTION:
				setHeatgain_fraction((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__CURRENT_FRACTION:
				setCurrent_fraction((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__IMPEDANCE_FRACTION:
				setImpedance_fraction((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__POWER_FRACTION:
				setPower_fraction((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__CONSTANT_POWER:
				setConstant_power((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__CONSTANT_CURRENT:
				setConstant_current((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__CONSTANT_ADMITTANCE:
				setConstant_admittance((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__VOLTAGE_FACTOR:
				setVoltage_factor((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.MICROWAVE__OVERRIDE:
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
			case VisGridPackage.MICROWAVE__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.MICROWAVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__INSTALLED_POWER:
				setInstalled_power(INSTALLED_POWER_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__STANDBY_POWER:
				setStandby_power(STANDBY_POWER_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__CIRCUIT_SPLIT:
				setCircuit_split(CIRCUIT_SPLIT_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__CYCLE_LENGTH:
				setCycle_length(CYCLE_LENGTH_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__STATE_TIME:
				setState_time(STATE_TIME_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__PEAK_DEMAND:
				setPeak_demand(PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__HEATGAIN:
				setHeatgain(HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__HEATGAIN_FRACTION:
				setHeatgain_fraction(HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__CURRENT_FRACTION:
				setCurrent_fraction(CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__IMPEDANCE_FRACTION:
				setImpedance_fraction(IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__POWER_FRACTION:
				setPower_fraction(POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__CONSTANT_POWER:
				setConstant_power(CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__CONSTANT_CURRENT:
				setConstant_current(CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__CONSTANT_ADMITTANCE:
				setConstant_admittance(CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__VOLTAGE_FACTOR:
				setVoltage_factor(VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.MICROWAVE__OVERRIDE:
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
			case VisGridPackage.MICROWAVE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.MICROWAVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.MICROWAVE__INSTALLED_POWER:
				return INSTALLED_POWER_EDEFAULT == null ? installed_power != null : !INSTALLED_POWER_EDEFAULT.equals(installed_power);
			case VisGridPackage.MICROWAVE__STANDBY_POWER:
				return STANDBY_POWER_EDEFAULT == null ? standby_power != null : !STANDBY_POWER_EDEFAULT.equals(standby_power);
			case VisGridPackage.MICROWAVE__CIRCUIT_SPLIT:
				return CIRCUIT_SPLIT_EDEFAULT == null ? circuit_split != null : !CIRCUIT_SPLIT_EDEFAULT.equals(circuit_split);
			case VisGridPackage.MICROWAVE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case VisGridPackage.MICROWAVE__CYCLE_LENGTH:
				return CYCLE_LENGTH_EDEFAULT == null ? cycle_length != null : !CYCLE_LENGTH_EDEFAULT.equals(cycle_length);
			case VisGridPackage.MICROWAVE__RUNTIME:
				return RUNTIME_EDEFAULT == null ? runtime != null : !RUNTIME_EDEFAULT.equals(runtime);
			case VisGridPackage.MICROWAVE__STATE_TIME:
				return STATE_TIME_EDEFAULT == null ? state_time != null : !STATE_TIME_EDEFAULT.equals(state_time);
			case VisGridPackage.MICROWAVE__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case VisGridPackage.MICROWAVE__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.MICROWAVE__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.MICROWAVE__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.MICROWAVE__PEAK_DEMAND:
				return PEAK_DEMAND_EDEFAULT == null ? peak_demand != null : !PEAK_DEMAND_EDEFAULT.equals(peak_demand);
			case VisGridPackage.MICROWAVE__HEATGAIN:
				return HEATGAIN_EDEFAULT == null ? heatgain != null : !HEATGAIN_EDEFAULT.equals(heatgain);
			case VisGridPackage.MICROWAVE__HEATGAIN_FRACTION:
				return HEATGAIN_FRACTION_EDEFAULT == null ? heatgain_fraction != null : !HEATGAIN_FRACTION_EDEFAULT.equals(heatgain_fraction);
			case VisGridPackage.MICROWAVE__CURRENT_FRACTION:
				return CURRENT_FRACTION_EDEFAULT == null ? current_fraction != null : !CURRENT_FRACTION_EDEFAULT.equals(current_fraction);
			case VisGridPackage.MICROWAVE__IMPEDANCE_FRACTION:
				return IMPEDANCE_FRACTION_EDEFAULT == null ? impedance_fraction != null : !IMPEDANCE_FRACTION_EDEFAULT.equals(impedance_fraction);
			case VisGridPackage.MICROWAVE__POWER_FRACTION:
				return POWER_FRACTION_EDEFAULT == null ? power_fraction != null : !POWER_FRACTION_EDEFAULT.equals(power_fraction);
			case VisGridPackage.MICROWAVE__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.MICROWAVE__CONSTANT_POWER:
				return CONSTANT_POWER_EDEFAULT == null ? constant_power != null : !CONSTANT_POWER_EDEFAULT.equals(constant_power);
			case VisGridPackage.MICROWAVE__CONSTANT_CURRENT:
				return CONSTANT_CURRENT_EDEFAULT == null ? constant_current != null : !CONSTANT_CURRENT_EDEFAULT.equals(constant_current);
			case VisGridPackage.MICROWAVE__CONSTANT_ADMITTANCE:
				return CONSTANT_ADMITTANCE_EDEFAULT == null ? constant_admittance != null : !CONSTANT_ADMITTANCE_EDEFAULT.equals(constant_admittance);
			case VisGridPackage.MICROWAVE__VOLTAGE_FACTOR:
				return VOLTAGE_FACTOR_EDEFAULT == null ? voltage_factor != null : !VOLTAGE_FACTOR_EDEFAULT.equals(voltage_factor);
			case VisGridPackage.MICROWAVE__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.MICROWAVE__OVERRIDE:
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
		result.append(", installed_power: ");
		result.append(installed_power);
		result.append(", standby_power: ");
		result.append(standby_power);
		result.append(", circuit_split: ");
		result.append(circuit_split);
		result.append(", state: ");
		result.append(state);
		result.append(", cycle_length: ");
		result.append(cycle_length);
		result.append(", runtime: ");
		result.append(runtime);
		result.append(", state_time: ");
		result.append(state_time);
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

} //MicrowaveImpl
