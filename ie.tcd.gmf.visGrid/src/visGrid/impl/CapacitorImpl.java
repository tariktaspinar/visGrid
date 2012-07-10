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

import visGrid.Capacitor;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capacitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.CapacitorImpl#getPt_phase <em>Pt phase</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getPhases_connected <em>Phases connected</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getSwitchA <em>Switch A</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getSwitchB <em>Switch B</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getSwitchC <em>Switch C</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getControl <em>Control</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getVoltage_set_high <em>Voltage set high</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getVoltage_set_low <em>Voltage set low</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getVAr_set_high <em>VAr set high</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getVAr_set_low <em>VAr set low</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getCurrent_set_low <em>Current set low</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getCurrent_set_high <em>Current set high</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getCapacitor_A <em>Capacitor A</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getCapacitor_B <em>Capacitor B</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getCapacitor_C <em>Capacitor C</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getCap_nominal_voltage <em>Cap nominal voltage</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getTime_delay <em>Time delay</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getDwell_time <em>Dwell time</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getLockout_time <em>Lockout time</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getRemote_sense <em>Remote sense</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getRemote_sense_B <em>Remote sense B</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getControl_level <em>Control level</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getVoltage_AB <em>Voltage AB</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getVoltage_BC <em>Voltage BC</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getVoltage_CA <em>Voltage CA</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getShunt_A <em>Shunt A</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getShunt_B <em>Shunt B</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getShunt_C <em>Shunt C</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.impl.CapacitorImpl#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapacitorImpl extends ConnectionImpl implements Capacitor {
		boolean lock = false;
	/**
	 * The default value of the '{@link #getPt_phase() <em>Pt phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPt_phase()
	 * @generated
	 * @ordered
	 */
	protected static final String PT_PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPt_phase() <em>Pt phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPt_phase()
	 * @generated
	 * @ordered
	 */
	protected String pt_phase = PT_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhases_connected() <em>Phases connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases_connected()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASES_CONNECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhases_connected() <em>Phases connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases_connected()
	 * @generated
	 * @ordered
	 */
	protected String phases_connected = PHASES_CONNECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitchA() <em>Switch A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchA()
	 * @generated
	 * @ordered
	 */
	protected static final String SWITCH_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwitchA() <em>Switch A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchA()
	 * @generated
	 * @ordered
	 */
	protected String switchA = SWITCH_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitchB() <em>Switch B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchB()
	 * @generated
	 * @ordered
	 */
	protected static final String SWITCH_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwitchB() <em>Switch B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchB()
	 * @generated
	 * @ordered
	 */
	protected String switchB = SWITCH_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitchC() <em>Switch C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchC()
	 * @generated
	 * @ordered
	 */
	protected static final String SWITCH_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwitchC() <em>Switch C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchC()
	 * @generated
	 * @ordered
	 */
	protected String switchC = SWITCH_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getControl() <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected String control = CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_set_high() <em>Voltage set high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_set_high()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_SET_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_set_high() <em>Voltage set high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_set_high()
	 * @generated
	 * @ordered
	 */
	protected String voltage_set_high = VOLTAGE_SET_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_set_low() <em>Voltage set low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_set_low()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_SET_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_set_low() <em>Voltage set low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_set_low()
	 * @generated
	 * @ordered
	 */
	protected String voltage_set_low = VOLTAGE_SET_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getVAr_set_high() <em>VAr set high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAr_set_high()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_SET_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVAr_set_high() <em>VAr set high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAr_set_high()
	 * @generated
	 * @ordered
	 */
	protected String vAr_set_high = VAR_SET_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVAr_set_low() <em>VAr set low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAr_set_low()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_SET_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVAr_set_low() <em>VAr set low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAr_set_low()
	 * @generated
	 * @ordered
	 */
	protected String vAr_set_low = VAR_SET_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_set_low() <em>Current set low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_set_low()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_SET_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_set_low() <em>Current set low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_set_low()
	 * @generated
	 * @ordered
	 */
	protected String current_set_low = CURRENT_SET_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_set_high() <em>Current set high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_set_high()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_SET_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_set_high() <em>Current set high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_set_high()
	 * @generated
	 * @ordered
	 */
	protected String current_set_high = CURRENT_SET_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacitor_A() <em>Capacitor A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitor_A()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITOR_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacitor_A() <em>Capacitor A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitor_A()
	 * @generated
	 * @ordered
	 */
	protected String capacitor_A = CAPACITOR_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacitor_B() <em>Capacitor B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitor_B()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITOR_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacitor_B() <em>Capacitor B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitor_B()
	 * @generated
	 * @ordered
	 */
	protected String capacitor_B = CAPACITOR_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacitor_C() <em>Capacitor C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitor_C()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITOR_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacitor_C() <em>Capacitor C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitor_C()
	 * @generated
	 * @ordered
	 */
	protected String capacitor_C = CAPACITOR_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getCap_nominal_voltage() <em>Cap nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap_nominal_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String CAP_NOMINAL_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCap_nominal_voltage() <em>Cap nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap_nominal_voltage()
	 * @generated
	 * @ordered
	 */
	protected String cap_nominal_voltage = CAP_NOMINAL_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime_delay() <em>Time delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_delay()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime_delay() <em>Time delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_delay()
	 * @generated
	 * @ordered
	 */
	protected String time_delay = TIME_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDwell_time() <em>Dwell time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDwell_time()
	 * @generated
	 * @ordered
	 */
	protected static final String DWELL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDwell_time() <em>Dwell time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDwell_time()
	 * @generated
	 * @ordered
	 */
	protected String dwell_time = DWELL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockout_time() <em>Lockout time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockout_time()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCKOUT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLockout_time() <em>Lockout time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockout_time()
	 * @generated
	 * @ordered
	 */
	protected String lockout_time = LOCKOUT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemote_sense() <em>Remote sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote_sense()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_SENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemote_sense() <em>Remote sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote_sense()
	 * @generated
	 * @ordered
	 */
	protected String remote_sense = REMOTE_SENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemote_sense_B() <em>Remote sense B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote_sense_B()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_SENSE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemote_sense_B() <em>Remote sense B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote_sense_B()
	 * @generated
	 * @ordered
	 */
	protected String remote_sense_B = REMOTE_SENSE_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getControl_level() <em>Control level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl_level()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControl_level() <em>Control level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl_level()
	 * @generated
	 * @ordered
	 */
	protected String control_level = CONTROL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBustype() <em>Bustype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBustype()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBustype() <em>Bustype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBustype()
	 * @generated
	 * @ordered
	 */
	protected String bustype = BUSTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusflags() <em>Busflags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusflags()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSFLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusflags() <em>Busflags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusflags()
	 * @generated
	 * @ordered
	 */
	protected String busflags = BUSFLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReference_bus() <em>Reference bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_bus()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_BUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference_bus() <em>Reference bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_bus()
	 * @generated
	 * @ordered
	 */
	protected String reference_bus = REFERENCE_BUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum_voltage_error() <em>Maximum voltage error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_voltage_error()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_VOLTAGE_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum_voltage_error() <em>Maximum voltage error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_voltage_error()
	 * @generated
	 * @ordered
	 */
	protected String maximum_voltage_error = MAXIMUM_VOLTAGE_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_A() <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_A()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_A() <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_A()
	 * @generated
	 * @ordered
	 */
	protected String voltage_A = VOLTAGE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_B() <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_B()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_B() <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_B()
	 * @generated
	 * @ordered
	 */
	protected String voltage_B = VOLTAGE_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_C() <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_C()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_C() <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_C()
	 * @generated
	 * @ordered
	 */
	protected String voltage_C = VOLTAGE_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_AB() <em>Voltage AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_AB()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_AB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_AB() <em>Voltage AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_AB()
	 * @generated
	 * @ordered
	 */
	protected String voltage_AB = VOLTAGE_AB_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_BC() <em>Voltage BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_BC()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_BC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_BC() <em>Voltage BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_BC()
	 * @generated
	 * @ordered
	 */
	protected String voltage_BC = VOLTAGE_BC_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_CA() <em>Voltage CA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_CA()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_CA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_CA() <em>Voltage CA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_CA()
	 * @generated
	 * @ordered
	 */
	protected String voltage_CA = VOLTAGE_CA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_A() <em>Current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_A()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_A() <em>Current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_A()
	 * @generated
	 * @ordered
	 */
	protected String current_A = CURRENT_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_B() <em>Current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_B()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_B() <em>Current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_B()
	 * @generated
	 * @ordered
	 */
	protected String current_B = CURRENT_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_C() <em>Current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_C()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_C() <em>Current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_C()
	 * @generated
	 * @ordered
	 */
	protected String current_C = CURRENT_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_A() <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_A() <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A()
	 * @generated
	 * @ordered
	 */
	protected String power_A = POWER_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_B() <em>Power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_B() <em>Power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B()
	 * @generated
	 * @ordered
	 */
	protected String power_B = POWER_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_C() <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_C() <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C()
	 * @generated
	 * @ordered
	 */
	protected String power_C = POWER_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_A() <em>Shunt A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_A()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_A() <em>Shunt A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_A()
	 * @generated
	 * @ordered
	 */
	protected String shunt_A = SHUNT_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_B() <em>Shunt B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_B()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_B() <em>Shunt B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_B()
	 * @generated
	 * @ordered
	 */
	protected String shunt_B = SHUNT_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_C() <em>Shunt C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_C()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_C() <em>Shunt C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_C()
	 * @generated
	 * @ordered
	 */
	protected String shunt_C = SHUNT_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected String phases = PHASES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominal_voltage() <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMINAL_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominal_voltage() <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal_voltage()
	 * @generated
	 * @ordered
	 */
	protected String nominal_voltage = NOMINAL_VOLTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getCapacitor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPt_phase() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"pt_phase");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Pt_phase");
				pt_phase= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pt_phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPt_phase(String newPt_phase) {
		String oldPt_phase = pt_phase;
		pt_phase = newPt_phase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__PT_PHASE, oldPt_phase, pt_phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhases_connected() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"phases_connected");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Phases_connected");
				phases_connected= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return phases_connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhases_connected(String newPhases_connected) {
		String oldPhases_connected = phases_connected;
		phases_connected = newPhases_connected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__PHASES_CONNECTED, oldPhases_connected, phases_connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwitchA() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"switchA");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"SwitchA");
				switchA= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return switchA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchA(String newSwitchA) {
		String oldSwitchA = switchA;
		switchA = newSwitchA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__SWITCH_A, oldSwitchA, switchA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwitchB() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"switchB");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"SwitchB");
				switchB= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return switchB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchB(String newSwitchB) {
		String oldSwitchB = switchB;
		switchB = newSwitchB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__SWITCH_B, oldSwitchB, switchB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwitchC() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"switchC");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"SwitchC");
				switchC= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return switchC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchC(String newSwitchC) {
		String oldSwitchC = switchC;
		switchC = newSwitchC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__SWITCH_C, oldSwitchC, switchC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControl() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"control");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Control");
				control= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(String newControl) {
		String oldControl = control;
		control = newControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CONTROL, oldControl, control));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_set_high() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"voltage_set_high");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Voltage_set_high");
				voltage_set_high= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return voltage_set_high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_set_high(String newVoltage_set_high) {
		String oldVoltage_set_high = voltage_set_high;
		voltage_set_high = newVoltage_set_high;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__VOLTAGE_SET_HIGH, oldVoltage_set_high, voltage_set_high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_set_low() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"voltage_set_low");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Voltage_set_low");
				voltage_set_low= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return voltage_set_low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_set_low(String newVoltage_set_low) {
		String oldVoltage_set_low = voltage_set_low;
		voltage_set_low = newVoltage_set_low;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__VOLTAGE_SET_LOW, oldVoltage_set_low, voltage_set_low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVAr_set_high() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"vAr_set_high");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"VAr_set_high");
				vAr_set_high= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vAr_set_high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAr_set_high(String newVAr_set_high) {
		String oldVAr_set_high = vAr_set_high;
		vAr_set_high = newVAr_set_high;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__VAR_SET_HIGH, oldVAr_set_high, vAr_set_high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVAr_set_low() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"vAr_set_low");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"VAr_set_low");
				vAr_set_low= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vAr_set_low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAr_set_low(String newVAr_set_low) {
		String oldVAr_set_low = vAr_set_low;
		vAr_set_low = newVAr_set_low;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__VAR_SET_LOW, oldVAr_set_low, vAr_set_low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_set_low() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"current_set_low");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Current_set_low");
				current_set_low= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return current_set_low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_set_low(String newCurrent_set_low) {
		String oldCurrent_set_low = current_set_low;
		current_set_low = newCurrent_set_low;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CURRENT_SET_LOW, oldCurrent_set_low, current_set_low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_set_high() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"current_set_high");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Current_set_high");
				current_set_high= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return current_set_high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_set_high(String newCurrent_set_high) {
		String oldCurrent_set_high = current_set_high;
		current_set_high = newCurrent_set_high;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CURRENT_SET_HIGH, oldCurrent_set_high, current_set_high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacitor_A() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"capacitor_A");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Capacitor_A");
				capacitor_A= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return capacitor_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacitor_A(String newCapacitor_A) {
		String oldCapacitor_A = capacitor_A;
		capacitor_A = newCapacitor_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CAPACITOR_A, oldCapacitor_A, capacitor_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacitor_B() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"capacitor_B");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Capacitor_B");
				capacitor_B= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return capacitor_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacitor_B(String newCapacitor_B) {
		String oldCapacitor_B = capacitor_B;
		capacitor_B = newCapacitor_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CAPACITOR_B, oldCapacitor_B, capacitor_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacitor_C() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"capacitor_C");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Capacitor_C");
				capacitor_C= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return capacitor_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacitor_C(String newCapacitor_C) {
		String oldCapacitor_C = capacitor_C;
		capacitor_C = newCapacitor_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CAPACITOR_C, oldCapacitor_C, capacitor_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCap_nominal_voltage() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"cap_nominal_voltage");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Cap_nominal_voltage");
				cap_nominal_voltage= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cap_nominal_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCap_nominal_voltage(String newCap_nominal_voltage) {
		String oldCap_nominal_voltage = cap_nominal_voltage;
		cap_nominal_voltage = newCap_nominal_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CAP_NOMINAL_VOLTAGE, oldCap_nominal_voltage, cap_nominal_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime_delay() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"time_delay");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Time_delay");
				time_delay= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return time_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_delay(String newTime_delay) {
		String oldTime_delay = time_delay;
		time_delay = newTime_delay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__TIME_DELAY, oldTime_delay, time_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDwell_time() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"dwell_time");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Dwell_time");
				dwell_time= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dwell_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDwell_time(String newDwell_time) {
		String oldDwell_time = dwell_time;
		dwell_time = newDwell_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__DWELL_TIME, oldDwell_time, dwell_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLockout_time() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"lockout_time");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Lockout_time");
				lockout_time= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return lockout_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockout_time(String newLockout_time) {
		String oldLockout_time = lockout_time;
		lockout_time = newLockout_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__LOCKOUT_TIME, oldLockout_time, lockout_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemote_sense() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"remote_sense");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Remote_sense");
				remote_sense= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return remote_sense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote_sense(String newRemote_sense) {
		String oldRemote_sense = remote_sense;
		remote_sense = newRemote_sense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__REMOTE_SENSE, oldRemote_sense, remote_sense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemote_sense_B() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"remote_sense_B");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Remote_sense_B");
				remote_sense_B= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return remote_sense_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote_sense_B(String newRemote_sense_B) {
		String oldRemote_sense_B = remote_sense_B;
		remote_sense_B = newRemote_sense_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__REMOTE_SENSE_B, oldRemote_sense_B, remote_sense_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControl_level() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"control_level");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Control_level");
				control_level= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return control_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl_level(String newControl_level) {
		String oldControl_level = control_level;
		control_level = newControl_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CONTROL_LEVEL, oldControl_level, control_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBustype() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"bustype");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Bustype");
				bustype= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bustype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBustype(String newBustype) {
		String oldBustype = bustype;
		bustype = newBustype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__BUSTYPE, oldBustype, bustype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusflags() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"busflags");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Busflags");
				busflags= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return busflags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusflags(String newBusflags) {
		String oldBusflags = busflags;
		busflags = newBusflags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__BUSFLAGS, oldBusflags, busflags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference_bus() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"reference_bus");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Reference_bus");
				reference_bus= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return reference_bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference_bus(String newReference_bus) {
		String oldReference_bus = reference_bus;
		reference_bus = newReference_bus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__REFERENCE_BUS, oldReference_bus, reference_bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum_voltage_error() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"maximum_voltage_error");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Maximum_voltage_error");
				maximum_voltage_error= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return maximum_voltage_error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum_voltage_error(String newMaximum_voltage_error) {
		String oldMaximum_voltage_error = maximum_voltage_error;
		maximum_voltage_error = newMaximum_voltage_error;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__MAXIMUM_VOLTAGE_ERROR, oldMaximum_voltage_error, maximum_voltage_error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_A() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"voltage_A");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Voltage_A");
				voltage_A= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return voltage_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_A(String newVoltage_A) {
		String oldVoltage_A = voltage_A;
		voltage_A = newVoltage_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__VOLTAGE_A, oldVoltage_A, voltage_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_B() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"voltage_B");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Voltage_B");
				voltage_B= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return voltage_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_B(String newVoltage_B) {
		String oldVoltage_B = voltage_B;
		voltage_B = newVoltage_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__VOLTAGE_B, oldVoltage_B, voltage_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_C() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"voltage_C");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Voltage_C");
				voltage_C= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return voltage_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_C(String newVoltage_C) {
		String oldVoltage_C = voltage_C;
		voltage_C = newVoltage_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__VOLTAGE_C, oldVoltage_C, voltage_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_AB() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"voltage_AB");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Voltage_AB");
				voltage_AB= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return voltage_AB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_AB(String newVoltage_AB) {
		String oldVoltage_AB = voltage_AB;
		voltage_AB = newVoltage_AB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__VOLTAGE_AB, oldVoltage_AB, voltage_AB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_BC() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"voltage_BC");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Voltage_BC");
				voltage_BC= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return voltage_BC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_BC(String newVoltage_BC) {
		String oldVoltage_BC = voltage_BC;
		voltage_BC = newVoltage_BC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__VOLTAGE_BC, oldVoltage_BC, voltage_BC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_CA() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"voltage_CA");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Voltage_CA");
				voltage_CA= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return voltage_CA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_CA(String newVoltage_CA) {
		String oldVoltage_CA = voltage_CA;
		voltage_CA = newVoltage_CA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__VOLTAGE_CA, oldVoltage_CA, voltage_CA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_A() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"current_A");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Current_A");
				current_A= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return current_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_A(String newCurrent_A) {
		String oldCurrent_A = current_A;
		current_A = newCurrent_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CURRENT_A, oldCurrent_A, current_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_B() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"current_B");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Current_B");
				current_B= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return current_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_B(String newCurrent_B) {
		String oldCurrent_B = current_B;
		current_B = newCurrent_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CURRENT_B, oldCurrent_B, current_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_C() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"current_C");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Current_C");
				current_C= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return current_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_C(String newCurrent_C) {
		String oldCurrent_C = current_C;
		current_C = newCurrent_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__CURRENT_C, oldCurrent_C, current_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_A() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"power_A");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Power_A");
				power_A= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return power_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_A(String newPower_A) {
		String oldPower_A = power_A;
		power_A = newPower_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__POWER_A, oldPower_A, power_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_B() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"power_B");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Power_B");
				power_B= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return power_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_B(String newPower_B) {
		String oldPower_B = power_B;
		power_B = newPower_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__POWER_B, oldPower_B, power_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_C() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"power_C");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Power_C");
				power_C= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return power_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_C(String newPower_C) {
		String oldPower_C = power_C;
		power_C = newPower_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__POWER_C, oldPower_C, power_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_A() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"shunt_A");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Shunt_A");
				shunt_A= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return shunt_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_A(String newShunt_A) {
		String oldShunt_A = shunt_A;
		shunt_A = newShunt_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__SHUNT_A, oldShunt_A, shunt_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_B() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"shunt_B");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Shunt_B");
				shunt_B= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return shunt_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_B(String newShunt_B) {
		String oldShunt_B = shunt_B;
		shunt_B = newShunt_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__SHUNT_B, oldShunt_B, shunt_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_C() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"shunt_C");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Shunt_C");
				shunt_C= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return shunt_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_C(String newShunt_C) {
		String oldShunt_C = shunt_C;
		shunt_C = newShunt_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__SHUNT_C, oldShunt_C, shunt_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhases() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"phases");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Phases");
				phases= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhases(String newPhases) {
		String oldPhases = phases;
		phases = newPhases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominal_voltage() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"nominal_voltage");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Nominal_voltage");
				nominal_voltage= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return nominal_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominal_voltage(String newNominal_voltage) {
		String oldNominal_voltage = nominal_voltage;
		nominal_voltage = newNominal_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPACITOR__NOMINAL_VOLTAGE, oldNominal_voltage, nominal_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.CAPACITOR__PT_PHASE:
				return getPt_phase();
			case VisGridPackage.CAPACITOR__PHASES_CONNECTED:
				return getPhases_connected();
			case VisGridPackage.CAPACITOR__SWITCH_A:
				return getSwitchA();
			case VisGridPackage.CAPACITOR__SWITCH_B:
				return getSwitchB();
			case VisGridPackage.CAPACITOR__SWITCH_C:
				return getSwitchC();
			case VisGridPackage.CAPACITOR__CONTROL:
				return getControl();
			case VisGridPackage.CAPACITOR__VOLTAGE_SET_HIGH:
				return getVoltage_set_high();
			case VisGridPackage.CAPACITOR__VOLTAGE_SET_LOW:
				return getVoltage_set_low();
			case VisGridPackage.CAPACITOR__VAR_SET_HIGH:
				return getVAr_set_high();
			case VisGridPackage.CAPACITOR__VAR_SET_LOW:
				return getVAr_set_low();
			case VisGridPackage.CAPACITOR__CURRENT_SET_LOW:
				return getCurrent_set_low();
			case VisGridPackage.CAPACITOR__CURRENT_SET_HIGH:
				return getCurrent_set_high();
			case VisGridPackage.CAPACITOR__CAPACITOR_A:
				return getCapacitor_A();
			case VisGridPackage.CAPACITOR__CAPACITOR_B:
				return getCapacitor_B();
			case VisGridPackage.CAPACITOR__CAPACITOR_C:
				return getCapacitor_C();
			case VisGridPackage.CAPACITOR__CAP_NOMINAL_VOLTAGE:
				return getCap_nominal_voltage();
			case VisGridPackage.CAPACITOR__TIME_DELAY:
				return getTime_delay();
			case VisGridPackage.CAPACITOR__DWELL_TIME:
				return getDwell_time();
			case VisGridPackage.CAPACITOR__LOCKOUT_TIME:
				return getLockout_time();
			case VisGridPackage.CAPACITOR__REMOTE_SENSE:
				return getRemote_sense();
			case VisGridPackage.CAPACITOR__REMOTE_SENSE_B:
				return getRemote_sense_B();
			case VisGridPackage.CAPACITOR__CONTROL_LEVEL:
				return getControl_level();
			case VisGridPackage.CAPACITOR__BUSTYPE:
				return getBustype();
			case VisGridPackage.CAPACITOR__BUSFLAGS:
				return getBusflags();
			case VisGridPackage.CAPACITOR__REFERENCE_BUS:
				return getReference_bus();
			case VisGridPackage.CAPACITOR__MAXIMUM_VOLTAGE_ERROR:
				return getMaximum_voltage_error();
			case VisGridPackage.CAPACITOR__VOLTAGE_A:
				return getVoltage_A();
			case VisGridPackage.CAPACITOR__VOLTAGE_B:
				return getVoltage_B();
			case VisGridPackage.CAPACITOR__VOLTAGE_C:
				return getVoltage_C();
			case VisGridPackage.CAPACITOR__VOLTAGE_AB:
				return getVoltage_AB();
			case VisGridPackage.CAPACITOR__VOLTAGE_BC:
				return getVoltage_BC();
			case VisGridPackage.CAPACITOR__VOLTAGE_CA:
				return getVoltage_CA();
			case VisGridPackage.CAPACITOR__CURRENT_A:
				return getCurrent_A();
			case VisGridPackage.CAPACITOR__CURRENT_B:
				return getCurrent_B();
			case VisGridPackage.CAPACITOR__CURRENT_C:
				return getCurrent_C();
			case VisGridPackage.CAPACITOR__POWER_A:
				return getPower_A();
			case VisGridPackage.CAPACITOR__POWER_B:
				return getPower_B();
			case VisGridPackage.CAPACITOR__POWER_C:
				return getPower_C();
			case VisGridPackage.CAPACITOR__SHUNT_A:
				return getShunt_A();
			case VisGridPackage.CAPACITOR__SHUNT_B:
				return getShunt_B();
			case VisGridPackage.CAPACITOR__SHUNT_C:
				return getShunt_C();
			case VisGridPackage.CAPACITOR__PHASES:
				return getPhases();
			case VisGridPackage.CAPACITOR__NOMINAL_VOLTAGE:
				return getNominal_voltage();
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
			case VisGridPackage.CAPACITOR__PT_PHASE:
				setPt_phase((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__PHASES_CONNECTED:
				setPhases_connected((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__SWITCH_A:
				setSwitchA((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__SWITCH_B:
				setSwitchB((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__SWITCH_C:
				setSwitchC((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CONTROL:
				setControl((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_SET_HIGH:
				setVoltage_set_high((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_SET_LOW:
				setVoltage_set_low((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__VAR_SET_HIGH:
				setVAr_set_high((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__VAR_SET_LOW:
				setVAr_set_low((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CURRENT_SET_LOW:
				setCurrent_set_low((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CURRENT_SET_HIGH:
				setCurrent_set_high((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CAPACITOR_A:
				setCapacitor_A((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CAPACITOR_B:
				setCapacitor_B((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CAPACITOR_C:
				setCapacitor_C((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CAP_NOMINAL_VOLTAGE:
				setCap_nominal_voltage((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__TIME_DELAY:
				setTime_delay((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__DWELL_TIME:
				setDwell_time((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__LOCKOUT_TIME:
				setLockout_time((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__REMOTE_SENSE:
				setRemote_sense((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__REMOTE_SENSE_B:
				setRemote_sense_B((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CONTROL_LEVEL:
				setControl_level((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__BUSTYPE:
				setBustype((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__BUSFLAGS:
				setBusflags((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__REFERENCE_BUS:
				setReference_bus((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_A:
				setVoltage_A((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_B:
				setVoltage_B((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_C:
				setVoltage_C((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_AB:
				setVoltage_AB((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_BC:
				setVoltage_BC((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_CA:
				setVoltage_CA((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CURRENT_A:
				setCurrent_A((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CURRENT_B:
				setCurrent_B((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__CURRENT_C:
				setCurrent_C((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__POWER_A:
				setPower_A((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__POWER_B:
				setPower_B((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__POWER_C:
				setPower_C((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__SHUNT_A:
				setShunt_A((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__SHUNT_B:
				setShunt_B((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__SHUNT_C:
				setShunt_C((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__PHASES:
				setPhases((String)newValue);
				return;
			case VisGridPackage.CAPACITOR__NOMINAL_VOLTAGE:
				setNominal_voltage((String)newValue);
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
			case VisGridPackage.CAPACITOR__PT_PHASE:
				setPt_phase(PT_PHASE_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__PHASES_CONNECTED:
				setPhases_connected(PHASES_CONNECTED_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__SWITCH_A:
				setSwitchA(SWITCH_A_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__SWITCH_B:
				setSwitchB(SWITCH_B_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__SWITCH_C:
				setSwitchC(SWITCH_C_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CONTROL:
				setControl(CONTROL_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_SET_HIGH:
				setVoltage_set_high(VOLTAGE_SET_HIGH_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_SET_LOW:
				setVoltage_set_low(VOLTAGE_SET_LOW_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__VAR_SET_HIGH:
				setVAr_set_high(VAR_SET_HIGH_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__VAR_SET_LOW:
				setVAr_set_low(VAR_SET_LOW_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CURRENT_SET_LOW:
				setCurrent_set_low(CURRENT_SET_LOW_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CURRENT_SET_HIGH:
				setCurrent_set_high(CURRENT_SET_HIGH_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CAPACITOR_A:
				setCapacitor_A(CAPACITOR_A_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CAPACITOR_B:
				setCapacitor_B(CAPACITOR_B_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CAPACITOR_C:
				setCapacitor_C(CAPACITOR_C_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CAP_NOMINAL_VOLTAGE:
				setCap_nominal_voltage(CAP_NOMINAL_VOLTAGE_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__TIME_DELAY:
				setTime_delay(TIME_DELAY_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__DWELL_TIME:
				setDwell_time(DWELL_TIME_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__LOCKOUT_TIME:
				setLockout_time(LOCKOUT_TIME_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__REMOTE_SENSE:
				setRemote_sense(REMOTE_SENSE_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__REMOTE_SENSE_B:
				setRemote_sense_B(REMOTE_SENSE_B_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CONTROL_LEVEL:
				setControl_level(CONTROL_LEVEL_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__BUSTYPE:
				setBustype(BUSTYPE_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__BUSFLAGS:
				setBusflags(BUSFLAGS_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__REFERENCE_BUS:
				setReference_bus(REFERENCE_BUS_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error(MAXIMUM_VOLTAGE_ERROR_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_A:
				setVoltage_A(VOLTAGE_A_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_B:
				setVoltage_B(VOLTAGE_B_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_C:
				setVoltage_C(VOLTAGE_C_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_AB:
				setVoltage_AB(VOLTAGE_AB_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_BC:
				setVoltage_BC(VOLTAGE_BC_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__VOLTAGE_CA:
				setVoltage_CA(VOLTAGE_CA_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CURRENT_A:
				setCurrent_A(CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CURRENT_B:
				setCurrent_B(CURRENT_B_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__CURRENT_C:
				setCurrent_C(CURRENT_C_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__POWER_A:
				setPower_A(POWER_A_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__POWER_B:
				setPower_B(POWER_B_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__POWER_C:
				setPower_C(POWER_C_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__SHUNT_A:
				setShunt_A(SHUNT_A_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__SHUNT_B:
				setShunt_B(SHUNT_B_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__SHUNT_C:
				setShunt_C(SHUNT_C_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case VisGridPackage.CAPACITOR__NOMINAL_VOLTAGE:
				setNominal_voltage(NOMINAL_VOLTAGE_EDEFAULT);
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
			case VisGridPackage.CAPACITOR__PT_PHASE:
				return PT_PHASE_EDEFAULT == null ? pt_phase != null : !PT_PHASE_EDEFAULT.equals(pt_phase);
			case VisGridPackage.CAPACITOR__PHASES_CONNECTED:
				return PHASES_CONNECTED_EDEFAULT == null ? phases_connected != null : !PHASES_CONNECTED_EDEFAULT.equals(phases_connected);
			case VisGridPackage.CAPACITOR__SWITCH_A:
				return SWITCH_A_EDEFAULT == null ? switchA != null : !SWITCH_A_EDEFAULT.equals(switchA);
			case VisGridPackage.CAPACITOR__SWITCH_B:
				return SWITCH_B_EDEFAULT == null ? switchB != null : !SWITCH_B_EDEFAULT.equals(switchB);
			case VisGridPackage.CAPACITOR__SWITCH_C:
				return SWITCH_C_EDEFAULT == null ? switchC != null : !SWITCH_C_EDEFAULT.equals(switchC);
			case VisGridPackage.CAPACITOR__CONTROL:
				return CONTROL_EDEFAULT == null ? control != null : !CONTROL_EDEFAULT.equals(control);
			case VisGridPackage.CAPACITOR__VOLTAGE_SET_HIGH:
				return VOLTAGE_SET_HIGH_EDEFAULT == null ? voltage_set_high != null : !VOLTAGE_SET_HIGH_EDEFAULT.equals(voltage_set_high);
			case VisGridPackage.CAPACITOR__VOLTAGE_SET_LOW:
				return VOLTAGE_SET_LOW_EDEFAULT == null ? voltage_set_low != null : !VOLTAGE_SET_LOW_EDEFAULT.equals(voltage_set_low);
			case VisGridPackage.CAPACITOR__VAR_SET_HIGH:
				return VAR_SET_HIGH_EDEFAULT == null ? vAr_set_high != null : !VAR_SET_HIGH_EDEFAULT.equals(vAr_set_high);
			case VisGridPackage.CAPACITOR__VAR_SET_LOW:
				return VAR_SET_LOW_EDEFAULT == null ? vAr_set_low != null : !VAR_SET_LOW_EDEFAULT.equals(vAr_set_low);
			case VisGridPackage.CAPACITOR__CURRENT_SET_LOW:
				return CURRENT_SET_LOW_EDEFAULT == null ? current_set_low != null : !CURRENT_SET_LOW_EDEFAULT.equals(current_set_low);
			case VisGridPackage.CAPACITOR__CURRENT_SET_HIGH:
				return CURRENT_SET_HIGH_EDEFAULT == null ? current_set_high != null : !CURRENT_SET_HIGH_EDEFAULT.equals(current_set_high);
			case VisGridPackage.CAPACITOR__CAPACITOR_A:
				return CAPACITOR_A_EDEFAULT == null ? capacitor_A != null : !CAPACITOR_A_EDEFAULT.equals(capacitor_A);
			case VisGridPackage.CAPACITOR__CAPACITOR_B:
				return CAPACITOR_B_EDEFAULT == null ? capacitor_B != null : !CAPACITOR_B_EDEFAULT.equals(capacitor_B);
			case VisGridPackage.CAPACITOR__CAPACITOR_C:
				return CAPACITOR_C_EDEFAULT == null ? capacitor_C != null : !CAPACITOR_C_EDEFAULT.equals(capacitor_C);
			case VisGridPackage.CAPACITOR__CAP_NOMINAL_VOLTAGE:
				return CAP_NOMINAL_VOLTAGE_EDEFAULT == null ? cap_nominal_voltage != null : !CAP_NOMINAL_VOLTAGE_EDEFAULT.equals(cap_nominal_voltage);
			case VisGridPackage.CAPACITOR__TIME_DELAY:
				return TIME_DELAY_EDEFAULT == null ? time_delay != null : !TIME_DELAY_EDEFAULT.equals(time_delay);
			case VisGridPackage.CAPACITOR__DWELL_TIME:
				return DWELL_TIME_EDEFAULT == null ? dwell_time != null : !DWELL_TIME_EDEFAULT.equals(dwell_time);
			case VisGridPackage.CAPACITOR__LOCKOUT_TIME:
				return LOCKOUT_TIME_EDEFAULT == null ? lockout_time != null : !LOCKOUT_TIME_EDEFAULT.equals(lockout_time);
			case VisGridPackage.CAPACITOR__REMOTE_SENSE:
				return REMOTE_SENSE_EDEFAULT == null ? remote_sense != null : !REMOTE_SENSE_EDEFAULT.equals(remote_sense);
			case VisGridPackage.CAPACITOR__REMOTE_SENSE_B:
				return REMOTE_SENSE_B_EDEFAULT == null ? remote_sense_B != null : !REMOTE_SENSE_B_EDEFAULT.equals(remote_sense_B);
			case VisGridPackage.CAPACITOR__CONTROL_LEVEL:
				return CONTROL_LEVEL_EDEFAULT == null ? control_level != null : !CONTROL_LEVEL_EDEFAULT.equals(control_level);
			case VisGridPackage.CAPACITOR__BUSTYPE:
				return BUSTYPE_EDEFAULT == null ? bustype != null : !BUSTYPE_EDEFAULT.equals(bustype);
			case VisGridPackage.CAPACITOR__BUSFLAGS:
				return BUSFLAGS_EDEFAULT == null ? busflags != null : !BUSFLAGS_EDEFAULT.equals(busflags);
			case VisGridPackage.CAPACITOR__REFERENCE_BUS:
				return REFERENCE_BUS_EDEFAULT == null ? reference_bus != null : !REFERENCE_BUS_EDEFAULT.equals(reference_bus);
			case VisGridPackage.CAPACITOR__MAXIMUM_VOLTAGE_ERROR:
				return MAXIMUM_VOLTAGE_ERROR_EDEFAULT == null ? maximum_voltage_error != null : !MAXIMUM_VOLTAGE_ERROR_EDEFAULT.equals(maximum_voltage_error);
			case VisGridPackage.CAPACITOR__VOLTAGE_A:
				return VOLTAGE_A_EDEFAULT == null ? voltage_A != null : !VOLTAGE_A_EDEFAULT.equals(voltage_A);
			case VisGridPackage.CAPACITOR__VOLTAGE_B:
				return VOLTAGE_B_EDEFAULT == null ? voltage_B != null : !VOLTAGE_B_EDEFAULT.equals(voltage_B);
			case VisGridPackage.CAPACITOR__VOLTAGE_C:
				return VOLTAGE_C_EDEFAULT == null ? voltage_C != null : !VOLTAGE_C_EDEFAULT.equals(voltage_C);
			case VisGridPackage.CAPACITOR__VOLTAGE_AB:
				return VOLTAGE_AB_EDEFAULT == null ? voltage_AB != null : !VOLTAGE_AB_EDEFAULT.equals(voltage_AB);
			case VisGridPackage.CAPACITOR__VOLTAGE_BC:
				return VOLTAGE_BC_EDEFAULT == null ? voltage_BC != null : !VOLTAGE_BC_EDEFAULT.equals(voltage_BC);
			case VisGridPackage.CAPACITOR__VOLTAGE_CA:
				return VOLTAGE_CA_EDEFAULT == null ? voltage_CA != null : !VOLTAGE_CA_EDEFAULT.equals(voltage_CA);
			case VisGridPackage.CAPACITOR__CURRENT_A:
				return CURRENT_A_EDEFAULT == null ? current_A != null : !CURRENT_A_EDEFAULT.equals(current_A);
			case VisGridPackage.CAPACITOR__CURRENT_B:
				return CURRENT_B_EDEFAULT == null ? current_B != null : !CURRENT_B_EDEFAULT.equals(current_B);
			case VisGridPackage.CAPACITOR__CURRENT_C:
				return CURRENT_C_EDEFAULT == null ? current_C != null : !CURRENT_C_EDEFAULT.equals(current_C);
			case VisGridPackage.CAPACITOR__POWER_A:
				return POWER_A_EDEFAULT == null ? power_A != null : !POWER_A_EDEFAULT.equals(power_A);
			case VisGridPackage.CAPACITOR__POWER_B:
				return POWER_B_EDEFAULT == null ? power_B != null : !POWER_B_EDEFAULT.equals(power_B);
			case VisGridPackage.CAPACITOR__POWER_C:
				return POWER_C_EDEFAULT == null ? power_C != null : !POWER_C_EDEFAULT.equals(power_C);
			case VisGridPackage.CAPACITOR__SHUNT_A:
				return SHUNT_A_EDEFAULT == null ? shunt_A != null : !SHUNT_A_EDEFAULT.equals(shunt_A);
			case VisGridPackage.CAPACITOR__SHUNT_B:
				return SHUNT_B_EDEFAULT == null ? shunt_B != null : !SHUNT_B_EDEFAULT.equals(shunt_B);
			case VisGridPackage.CAPACITOR__SHUNT_C:
				return SHUNT_C_EDEFAULT == null ? shunt_C != null : !SHUNT_C_EDEFAULT.equals(shunt_C);
			case VisGridPackage.CAPACITOR__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case VisGridPackage.CAPACITOR__NOMINAL_VOLTAGE:
				return NOMINAL_VOLTAGE_EDEFAULT == null ? nominal_voltage != null : !NOMINAL_VOLTAGE_EDEFAULT.equals(nominal_voltage);
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
		result.append(" (pt_phase: ");
		result.append(pt_phase);
		result.append(", phases_connected: ");
		result.append(phases_connected);
		result.append(", switchA: ");
		result.append(switchA);
		result.append(", switchB: ");
		result.append(switchB);
		result.append(", switchC: ");
		result.append(switchC);
		result.append(", control: ");
		result.append(control);
		result.append(", voltage_set_high: ");
		result.append(voltage_set_high);
		result.append(", voltage_set_low: ");
		result.append(voltage_set_low);
		result.append(", VAr_set_high: ");
		result.append(vAr_set_high);
		result.append(", VAr_set_low: ");
		result.append(vAr_set_low);
		result.append(", current_set_low: ");
		result.append(current_set_low);
		result.append(", current_set_high: ");
		result.append(current_set_high);
		result.append(", capacitor_A: ");
		result.append(capacitor_A);
		result.append(", capacitor_B: ");
		result.append(capacitor_B);
		result.append(", capacitor_C: ");
		result.append(capacitor_C);
		result.append(", cap_nominal_voltage: ");
		result.append(cap_nominal_voltage);
		result.append(", time_delay: ");
		result.append(time_delay);
		result.append(", dwell_time: ");
		result.append(dwell_time);
		result.append(", lockout_time: ");
		result.append(lockout_time);
		result.append(", remote_sense: ");
		result.append(remote_sense);
		result.append(", remote_sense_B: ");
		result.append(remote_sense_B);
		result.append(", control_level: ");
		result.append(control_level);
		result.append(", bustype: ");
		result.append(bustype);
		result.append(", busflags: ");
		result.append(busflags);
		result.append(", reference_bus: ");
		result.append(reference_bus);
		result.append(", maximum_voltage_error: ");
		result.append(maximum_voltage_error);
		result.append(", voltage_A: ");
		result.append(voltage_A);
		result.append(", voltage_B: ");
		result.append(voltage_B);
		result.append(", voltage_C: ");
		result.append(voltage_C);
		result.append(", voltage_AB: ");
		result.append(voltage_AB);
		result.append(", voltage_BC: ");
		result.append(voltage_BC);
		result.append(", voltage_CA: ");
		result.append(voltage_CA);
		result.append(", current_A: ");
		result.append(current_A);
		result.append(", current_B: ");
		result.append(current_B);
		result.append(", current_C: ");
		result.append(current_C);
		result.append(", power_A: ");
		result.append(power_A);
		result.append(", power_B: ");
		result.append(power_B);
		result.append(", power_C: ");
		result.append(power_C);
		result.append(", shunt_A: ");
		result.append(shunt_A);
		result.append(", shunt_B: ");
		result.append(shunt_B);
		result.append(", shunt_C: ");
		result.append(shunt_C);
		result.append(", phases: ");
		result.append(phases);
		result.append(", nominal_voltage: ");
		result.append(nominal_voltage);
		result.append(')');
		return result.toString();
	}

} //CapacitorImpl
