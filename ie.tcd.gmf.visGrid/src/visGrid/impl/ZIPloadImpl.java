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
import visGrid.ZIPload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZI Pload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getHeat_fraction <em>Heat fraction</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getBase_power <em>Base power</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getPower_pf <em>Power pf</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getCurrent_pf <em>Current pf</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getImpedance_pf <em>Impedance pf</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getIs_240 <em>Is 240</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getBreaker_val <em>Breaker val</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.ZIPloadImpl#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZIPloadImpl extends ConnectionImpl implements ZIPload {
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
	 * The default value of the '{@link #getHeat_fraction() <em>Heat fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAT_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeat_fraction() <em>Heat fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_fraction()
	 * @generated
	 * @ordered
	 */
	protected String heat_fraction = HEAT_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBase_power() <em>Base power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_power()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase_power() <em>Base power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_power()
	 * @generated
	 * @ordered
	 */
	protected String base_power = BASE_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_pf() <em>Power pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_pf()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_PF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_pf() <em>Power pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_pf()
	 * @generated
	 * @ordered
	 */
	protected String power_pf = POWER_PF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_pf() <em>Current pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_pf()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_PF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_pf() <em>Current pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_pf()
	 * @generated
	 * @ordered
	 */
	protected String current_pf = CURRENT_PF_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_pf() <em>Impedance pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_pf()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_PF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_pf() <em>Impedance pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_pf()
	 * @generated
	 * @ordered
	 */
	protected String impedance_pf = IMPEDANCE_PF_EDEFAULT;

	/**
	 * The default value of the '{@link #getIs_240() <em>Is 240</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_240()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_240_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIs_240() <em>Is 240</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_240()
	 * @generated
	 * @ordered
	 */
	protected String is_240 = IS_240_EDEFAULT;

	/**
	 * The default value of the '{@link #getBreaker_val() <em>Breaker val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreaker_val()
	 * @generated
	 * @ordered
	 */
	protected static final String BREAKER_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBreaker_val() <em>Breaker val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreaker_val()
	 * @generated
	 * @ordered
	 */
	protected String breaker_val = BREAKER_VAL_EDEFAULT;

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
	protected ZIPloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getZIPload();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeat_fraction() {
		return heat_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeat_fraction(String newHeat_fraction) {
		String oldHeat_fraction = heat_fraction;
		heat_fraction = newHeat_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__HEAT_FRACTION, oldHeat_fraction, heat_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase_power() {
		return base_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_power(String newBase_power) {
		String oldBase_power = base_power;
		base_power = newBase_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__BASE_POWER, oldBase_power, base_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_pf() {
		return power_pf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_pf(String newPower_pf) {
		String oldPower_pf = power_pf;
		power_pf = newPower_pf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__POWER_PF, oldPower_pf, power_pf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_pf() {
		return current_pf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_pf(String newCurrent_pf) {
		String oldCurrent_pf = current_pf;
		current_pf = newCurrent_pf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__CURRENT_PF, oldCurrent_pf, current_pf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_pf() {
		return impedance_pf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_pf(String newImpedance_pf) {
		String oldImpedance_pf = impedance_pf;
		impedance_pf = newImpedance_pf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__IMPEDANCE_PF, oldImpedance_pf, impedance_pf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIs_240() {
		return is_240;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_240(String newIs_240) {
		String oldIs_240 = is_240;
		is_240 = newIs_240;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__IS_240, oldIs_240, is_240));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBreaker_val() {
		return breaker_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreaker_val(String newBreaker_val) {
		String oldBreaker_val = breaker_val;
		breaker_val = newBreaker_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__BREAKER_VAL, oldBreaker_val, breaker_val));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__SHAPE, oldShape, shape));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__LOAD, oldLoad, load));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__ENERGY, oldEnergy, energy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__POWER, oldPower, power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__PEAK_DEMAND, oldPeak_demand, peak_demand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__HEATGAIN, oldHeatgain, heatgain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__HEATGAIN_FRACTION, oldHeatgain_fraction, heatgain_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__CURRENT_FRACTION, oldCurrent_fraction, current_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__IMPEDANCE_FRACTION, oldImpedance_fraction, impedance_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__POWER_FRACTION, oldPower_fraction, power_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__POWER_FACTOR, oldPower_factor, power_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__CONSTANT_POWER, oldConstant_power, constant_power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__CONSTANT_CURRENT, oldConstant_current, constant_current));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__CONSTANT_ADMITTANCE, oldConstant_admittance, constant_admittance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__VOLTAGE_FACTOR, oldVoltage_factor, voltage_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__CONFIGURATION, oldConfiguration, configuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ZI_PLOAD__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.ZI_PLOAD__NAME:
				return getName();
			case VisGridPackage.ZI_PLOAD__HEAT_FRACTION:
				return getHeat_fraction();
			case VisGridPackage.ZI_PLOAD__BASE_POWER:
				return getBase_power();
			case VisGridPackage.ZI_PLOAD__POWER_PF:
				return getPower_pf();
			case VisGridPackage.ZI_PLOAD__CURRENT_PF:
				return getCurrent_pf();
			case VisGridPackage.ZI_PLOAD__IMPEDANCE_PF:
				return getImpedance_pf();
			case VisGridPackage.ZI_PLOAD__IS_240:
				return getIs_240();
			case VisGridPackage.ZI_PLOAD__BREAKER_VAL:
				return getBreaker_val();
			case VisGridPackage.ZI_PLOAD__SHAPE:
				return getShape();
			case VisGridPackage.ZI_PLOAD__LOAD:
				return getLoad();
			case VisGridPackage.ZI_PLOAD__ENERGY:
				return getEnergy();
			case VisGridPackage.ZI_PLOAD__POWER:
				return getPower();
			case VisGridPackage.ZI_PLOAD__PEAK_DEMAND:
				return getPeak_demand();
			case VisGridPackage.ZI_PLOAD__HEATGAIN:
				return getHeatgain();
			case VisGridPackage.ZI_PLOAD__HEATGAIN_FRACTION:
				return getHeatgain_fraction();
			case VisGridPackage.ZI_PLOAD__CURRENT_FRACTION:
				return getCurrent_fraction();
			case VisGridPackage.ZI_PLOAD__IMPEDANCE_FRACTION:
				return getImpedance_fraction();
			case VisGridPackage.ZI_PLOAD__POWER_FRACTION:
				return getPower_fraction();
			case VisGridPackage.ZI_PLOAD__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.ZI_PLOAD__CONSTANT_POWER:
				return getConstant_power();
			case VisGridPackage.ZI_PLOAD__CONSTANT_CURRENT:
				return getConstant_current();
			case VisGridPackage.ZI_PLOAD__CONSTANT_ADMITTANCE:
				return getConstant_admittance();
			case VisGridPackage.ZI_PLOAD__VOLTAGE_FACTOR:
				return getVoltage_factor();
			case VisGridPackage.ZI_PLOAD__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.ZI_PLOAD__OVERRIDE:
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
			case VisGridPackage.ZI_PLOAD__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__HEAT_FRACTION:
				setHeat_fraction((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__BASE_POWER:
				setBase_power((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__POWER_PF:
				setPower_pf((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__CURRENT_PF:
				setCurrent_pf((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__IMPEDANCE_PF:
				setImpedance_pf((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__IS_240:
				setIs_240((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__BREAKER_VAL:
				setBreaker_val((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__SHAPE:
				setShape((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__PEAK_DEMAND:
				setPeak_demand((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__HEATGAIN:
				setHeatgain((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__HEATGAIN_FRACTION:
				setHeatgain_fraction((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__CURRENT_FRACTION:
				setCurrent_fraction((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__IMPEDANCE_FRACTION:
				setImpedance_fraction((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__POWER_FRACTION:
				setPower_fraction((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__CONSTANT_POWER:
				setConstant_power((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__CONSTANT_CURRENT:
				setConstant_current((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__CONSTANT_ADMITTANCE:
				setConstant_admittance((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__VOLTAGE_FACTOR:
				setVoltage_factor((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.ZI_PLOAD__OVERRIDE:
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
			case VisGridPackage.ZI_PLOAD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__HEAT_FRACTION:
				setHeat_fraction(HEAT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__BASE_POWER:
				setBase_power(BASE_POWER_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__POWER_PF:
				setPower_pf(POWER_PF_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__CURRENT_PF:
				setCurrent_pf(CURRENT_PF_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__IMPEDANCE_PF:
				setImpedance_pf(IMPEDANCE_PF_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__IS_240:
				setIs_240(IS_240_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__BREAKER_VAL:
				setBreaker_val(BREAKER_VAL_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__PEAK_DEMAND:
				setPeak_demand(PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__HEATGAIN:
				setHeatgain(HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__HEATGAIN_FRACTION:
				setHeatgain_fraction(HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__CURRENT_FRACTION:
				setCurrent_fraction(CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__IMPEDANCE_FRACTION:
				setImpedance_fraction(IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__POWER_FRACTION:
				setPower_fraction(POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__CONSTANT_POWER:
				setConstant_power(CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__CONSTANT_CURRENT:
				setConstant_current(CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__CONSTANT_ADMITTANCE:
				setConstant_admittance(CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__VOLTAGE_FACTOR:
				setVoltage_factor(VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.ZI_PLOAD__OVERRIDE:
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
			case VisGridPackage.ZI_PLOAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.ZI_PLOAD__HEAT_FRACTION:
				return HEAT_FRACTION_EDEFAULT == null ? heat_fraction != null : !HEAT_FRACTION_EDEFAULT.equals(heat_fraction);
			case VisGridPackage.ZI_PLOAD__BASE_POWER:
				return BASE_POWER_EDEFAULT == null ? base_power != null : !BASE_POWER_EDEFAULT.equals(base_power);
			case VisGridPackage.ZI_PLOAD__POWER_PF:
				return POWER_PF_EDEFAULT == null ? power_pf != null : !POWER_PF_EDEFAULT.equals(power_pf);
			case VisGridPackage.ZI_PLOAD__CURRENT_PF:
				return CURRENT_PF_EDEFAULT == null ? current_pf != null : !CURRENT_PF_EDEFAULT.equals(current_pf);
			case VisGridPackage.ZI_PLOAD__IMPEDANCE_PF:
				return IMPEDANCE_PF_EDEFAULT == null ? impedance_pf != null : !IMPEDANCE_PF_EDEFAULT.equals(impedance_pf);
			case VisGridPackage.ZI_PLOAD__IS_240:
				return IS_240_EDEFAULT == null ? is_240 != null : !IS_240_EDEFAULT.equals(is_240);
			case VisGridPackage.ZI_PLOAD__BREAKER_VAL:
				return BREAKER_VAL_EDEFAULT == null ? breaker_val != null : !BREAKER_VAL_EDEFAULT.equals(breaker_val);
			case VisGridPackage.ZI_PLOAD__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case VisGridPackage.ZI_PLOAD__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.ZI_PLOAD__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.ZI_PLOAD__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.ZI_PLOAD__PEAK_DEMAND:
				return PEAK_DEMAND_EDEFAULT == null ? peak_demand != null : !PEAK_DEMAND_EDEFAULT.equals(peak_demand);
			case VisGridPackage.ZI_PLOAD__HEATGAIN:
				return HEATGAIN_EDEFAULT == null ? heatgain != null : !HEATGAIN_EDEFAULT.equals(heatgain);
			case VisGridPackage.ZI_PLOAD__HEATGAIN_FRACTION:
				return HEATGAIN_FRACTION_EDEFAULT == null ? heatgain_fraction != null : !HEATGAIN_FRACTION_EDEFAULT.equals(heatgain_fraction);
			case VisGridPackage.ZI_PLOAD__CURRENT_FRACTION:
				return CURRENT_FRACTION_EDEFAULT == null ? current_fraction != null : !CURRENT_FRACTION_EDEFAULT.equals(current_fraction);
			case VisGridPackage.ZI_PLOAD__IMPEDANCE_FRACTION:
				return IMPEDANCE_FRACTION_EDEFAULT == null ? impedance_fraction != null : !IMPEDANCE_FRACTION_EDEFAULT.equals(impedance_fraction);
			case VisGridPackage.ZI_PLOAD__POWER_FRACTION:
				return POWER_FRACTION_EDEFAULT == null ? power_fraction != null : !POWER_FRACTION_EDEFAULT.equals(power_fraction);
			case VisGridPackage.ZI_PLOAD__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.ZI_PLOAD__CONSTANT_POWER:
				return CONSTANT_POWER_EDEFAULT == null ? constant_power != null : !CONSTANT_POWER_EDEFAULT.equals(constant_power);
			case VisGridPackage.ZI_PLOAD__CONSTANT_CURRENT:
				return CONSTANT_CURRENT_EDEFAULT == null ? constant_current != null : !CONSTANT_CURRENT_EDEFAULT.equals(constant_current);
			case VisGridPackage.ZI_PLOAD__CONSTANT_ADMITTANCE:
				return CONSTANT_ADMITTANCE_EDEFAULT == null ? constant_admittance != null : !CONSTANT_ADMITTANCE_EDEFAULT.equals(constant_admittance);
			case VisGridPackage.ZI_PLOAD__VOLTAGE_FACTOR:
				return VOLTAGE_FACTOR_EDEFAULT == null ? voltage_factor != null : !VOLTAGE_FACTOR_EDEFAULT.equals(voltage_factor);
			case VisGridPackage.ZI_PLOAD__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.ZI_PLOAD__OVERRIDE:
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
		result.append(", heat_fraction: ");
		result.append(heat_fraction);
		result.append(", base_power: ");
		result.append(base_power);
		result.append(", power_pf: ");
		result.append(power_pf);
		result.append(", current_pf: ");
		result.append(current_pf);
		result.append(", impedance_pf: ");
		result.append(impedance_pf);
		result.append(", is_240: ");
		result.append(is_240);
		result.append(", breaker_val: ");
		result.append(breaker_val);
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

} //ZIPloadImpl
