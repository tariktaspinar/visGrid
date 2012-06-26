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

import visGrid.Motor;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.MotorImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getVoltage_AB <em>Voltage AB</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getVoltage_BC <em>Voltage BC</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getVoltage_CA <em>Voltage CA</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getShunt_A <em>Shunt A</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getShunt_B <em>Shunt B</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getShunt_C <em>Shunt C</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.impl.MotorImpl#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MotorImpl extends ConnectionImpl implements Motor {
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
	protected MotorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getMotor();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBustype() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__BUSTYPE, oldBustype, bustype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusflags() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__BUSFLAGS, oldBusflags, busflags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference_bus() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__REFERENCE_BUS, oldReference_bus, reference_bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum_voltage_error() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__MAXIMUM_VOLTAGE_ERROR, oldMaximum_voltage_error, maximum_voltage_error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_A() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__VOLTAGE_A, oldVoltage_A, voltage_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_B() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__VOLTAGE_B, oldVoltage_B, voltage_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_C() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__VOLTAGE_C, oldVoltage_C, voltage_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_AB() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__VOLTAGE_AB, oldVoltage_AB, voltage_AB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_BC() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__VOLTAGE_BC, oldVoltage_BC, voltage_BC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_CA() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__VOLTAGE_CA, oldVoltage_CA, voltage_CA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_A() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__CURRENT_A, oldCurrent_A, current_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_B() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__CURRENT_B, oldCurrent_B, current_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_C() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__CURRENT_C, oldCurrent_C, current_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_A() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__POWER_A, oldPower_A, power_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_B() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__POWER_B, oldPower_B, power_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_C() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__POWER_C, oldPower_C, power_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_A() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__SHUNT_A, oldShunt_A, shunt_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_B() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__SHUNT_B, oldShunt_B, shunt_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_C() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__SHUNT_C, oldShunt_C, shunt_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhases() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominal_voltage() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MOTOR__NOMINAL_VOLTAGE, oldNominal_voltage, nominal_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.MOTOR__NAME:
				return getName();
			case VisGridPackage.MOTOR__BUSTYPE:
				return getBustype();
			case VisGridPackage.MOTOR__BUSFLAGS:
				return getBusflags();
			case VisGridPackage.MOTOR__REFERENCE_BUS:
				return getReference_bus();
			case VisGridPackage.MOTOR__MAXIMUM_VOLTAGE_ERROR:
				return getMaximum_voltage_error();
			case VisGridPackage.MOTOR__VOLTAGE_A:
				return getVoltage_A();
			case VisGridPackage.MOTOR__VOLTAGE_B:
				return getVoltage_B();
			case VisGridPackage.MOTOR__VOLTAGE_C:
				return getVoltage_C();
			case VisGridPackage.MOTOR__VOLTAGE_AB:
				return getVoltage_AB();
			case VisGridPackage.MOTOR__VOLTAGE_BC:
				return getVoltage_BC();
			case VisGridPackage.MOTOR__VOLTAGE_CA:
				return getVoltage_CA();
			case VisGridPackage.MOTOR__CURRENT_A:
				return getCurrent_A();
			case VisGridPackage.MOTOR__CURRENT_B:
				return getCurrent_B();
			case VisGridPackage.MOTOR__CURRENT_C:
				return getCurrent_C();
			case VisGridPackage.MOTOR__POWER_A:
				return getPower_A();
			case VisGridPackage.MOTOR__POWER_B:
				return getPower_B();
			case VisGridPackage.MOTOR__POWER_C:
				return getPower_C();
			case VisGridPackage.MOTOR__SHUNT_A:
				return getShunt_A();
			case VisGridPackage.MOTOR__SHUNT_B:
				return getShunt_B();
			case VisGridPackage.MOTOR__SHUNT_C:
				return getShunt_C();
			case VisGridPackage.MOTOR__PHASES:
				return getPhases();
			case VisGridPackage.MOTOR__NOMINAL_VOLTAGE:
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
			case VisGridPackage.MOTOR__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.MOTOR__BUSTYPE:
				setBustype((String)newValue);
				return;
			case VisGridPackage.MOTOR__BUSFLAGS:
				setBusflags((String)newValue);
				return;
			case VisGridPackage.MOTOR__REFERENCE_BUS:
				setReference_bus((String)newValue);
				return;
			case VisGridPackage.MOTOR__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error((String)newValue);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_A:
				setVoltage_A((String)newValue);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_B:
				setVoltage_B((String)newValue);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_C:
				setVoltage_C((String)newValue);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_AB:
				setVoltage_AB((String)newValue);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_BC:
				setVoltage_BC((String)newValue);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_CA:
				setVoltage_CA((String)newValue);
				return;
			case VisGridPackage.MOTOR__CURRENT_A:
				setCurrent_A((String)newValue);
				return;
			case VisGridPackage.MOTOR__CURRENT_B:
				setCurrent_B((String)newValue);
				return;
			case VisGridPackage.MOTOR__CURRENT_C:
				setCurrent_C((String)newValue);
				return;
			case VisGridPackage.MOTOR__POWER_A:
				setPower_A((String)newValue);
				return;
			case VisGridPackage.MOTOR__POWER_B:
				setPower_B((String)newValue);
				return;
			case VisGridPackage.MOTOR__POWER_C:
				setPower_C((String)newValue);
				return;
			case VisGridPackage.MOTOR__SHUNT_A:
				setShunt_A((String)newValue);
				return;
			case VisGridPackage.MOTOR__SHUNT_B:
				setShunt_B((String)newValue);
				return;
			case VisGridPackage.MOTOR__SHUNT_C:
				setShunt_C((String)newValue);
				return;
			case VisGridPackage.MOTOR__PHASES:
				setPhases((String)newValue);
				return;
			case VisGridPackage.MOTOR__NOMINAL_VOLTAGE:
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
			case VisGridPackage.MOTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__BUSTYPE:
				setBustype(BUSTYPE_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__BUSFLAGS:
				setBusflags(BUSFLAGS_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__REFERENCE_BUS:
				setReference_bus(REFERENCE_BUS_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error(MAXIMUM_VOLTAGE_ERROR_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_A:
				setVoltage_A(VOLTAGE_A_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_B:
				setVoltage_B(VOLTAGE_B_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_C:
				setVoltage_C(VOLTAGE_C_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_AB:
				setVoltage_AB(VOLTAGE_AB_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_BC:
				setVoltage_BC(VOLTAGE_BC_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__VOLTAGE_CA:
				setVoltage_CA(VOLTAGE_CA_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__CURRENT_A:
				setCurrent_A(CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__CURRENT_B:
				setCurrent_B(CURRENT_B_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__CURRENT_C:
				setCurrent_C(CURRENT_C_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__POWER_A:
				setPower_A(POWER_A_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__POWER_B:
				setPower_B(POWER_B_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__POWER_C:
				setPower_C(POWER_C_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__SHUNT_A:
				setShunt_A(SHUNT_A_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__SHUNT_B:
				setShunt_B(SHUNT_B_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__SHUNT_C:
				setShunt_C(SHUNT_C_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case VisGridPackage.MOTOR__NOMINAL_VOLTAGE:
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
			case VisGridPackage.MOTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.MOTOR__BUSTYPE:
				return BUSTYPE_EDEFAULT == null ? bustype != null : !BUSTYPE_EDEFAULT.equals(bustype);
			case VisGridPackage.MOTOR__BUSFLAGS:
				return BUSFLAGS_EDEFAULT == null ? busflags != null : !BUSFLAGS_EDEFAULT.equals(busflags);
			case VisGridPackage.MOTOR__REFERENCE_BUS:
				return REFERENCE_BUS_EDEFAULT == null ? reference_bus != null : !REFERENCE_BUS_EDEFAULT.equals(reference_bus);
			case VisGridPackage.MOTOR__MAXIMUM_VOLTAGE_ERROR:
				return MAXIMUM_VOLTAGE_ERROR_EDEFAULT == null ? maximum_voltage_error != null : !MAXIMUM_VOLTAGE_ERROR_EDEFAULT.equals(maximum_voltage_error);
			case VisGridPackage.MOTOR__VOLTAGE_A:
				return VOLTAGE_A_EDEFAULT == null ? voltage_A != null : !VOLTAGE_A_EDEFAULT.equals(voltage_A);
			case VisGridPackage.MOTOR__VOLTAGE_B:
				return VOLTAGE_B_EDEFAULT == null ? voltage_B != null : !VOLTAGE_B_EDEFAULT.equals(voltage_B);
			case VisGridPackage.MOTOR__VOLTAGE_C:
				return VOLTAGE_C_EDEFAULT == null ? voltage_C != null : !VOLTAGE_C_EDEFAULT.equals(voltage_C);
			case VisGridPackage.MOTOR__VOLTAGE_AB:
				return VOLTAGE_AB_EDEFAULT == null ? voltage_AB != null : !VOLTAGE_AB_EDEFAULT.equals(voltage_AB);
			case VisGridPackage.MOTOR__VOLTAGE_BC:
				return VOLTAGE_BC_EDEFAULT == null ? voltage_BC != null : !VOLTAGE_BC_EDEFAULT.equals(voltage_BC);
			case VisGridPackage.MOTOR__VOLTAGE_CA:
				return VOLTAGE_CA_EDEFAULT == null ? voltage_CA != null : !VOLTAGE_CA_EDEFAULT.equals(voltage_CA);
			case VisGridPackage.MOTOR__CURRENT_A:
				return CURRENT_A_EDEFAULT == null ? current_A != null : !CURRENT_A_EDEFAULT.equals(current_A);
			case VisGridPackage.MOTOR__CURRENT_B:
				return CURRENT_B_EDEFAULT == null ? current_B != null : !CURRENT_B_EDEFAULT.equals(current_B);
			case VisGridPackage.MOTOR__CURRENT_C:
				return CURRENT_C_EDEFAULT == null ? current_C != null : !CURRENT_C_EDEFAULT.equals(current_C);
			case VisGridPackage.MOTOR__POWER_A:
				return POWER_A_EDEFAULT == null ? power_A != null : !POWER_A_EDEFAULT.equals(power_A);
			case VisGridPackage.MOTOR__POWER_B:
				return POWER_B_EDEFAULT == null ? power_B != null : !POWER_B_EDEFAULT.equals(power_B);
			case VisGridPackage.MOTOR__POWER_C:
				return POWER_C_EDEFAULT == null ? power_C != null : !POWER_C_EDEFAULT.equals(power_C);
			case VisGridPackage.MOTOR__SHUNT_A:
				return SHUNT_A_EDEFAULT == null ? shunt_A != null : !SHUNT_A_EDEFAULT.equals(shunt_A);
			case VisGridPackage.MOTOR__SHUNT_B:
				return SHUNT_B_EDEFAULT == null ? shunt_B != null : !SHUNT_B_EDEFAULT.equals(shunt_B);
			case VisGridPackage.MOTOR__SHUNT_C:
				return SHUNT_C_EDEFAULT == null ? shunt_C != null : !SHUNT_C_EDEFAULT.equals(shunt_C);
			case VisGridPackage.MOTOR__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case VisGridPackage.MOTOR__NOMINAL_VOLTAGE:
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
		result.append(" (name: ");
		result.append(name);
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

} //MotorImpl
