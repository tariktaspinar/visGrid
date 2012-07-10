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

import visGrid.Occupantload;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occupantload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getNumber_of_occupants <em>Number of occupants</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getOccupancy_fraction <em>Occupancy fraction</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getHeatgain_per_person <em>Heatgain per person</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.OccupantloadImpl#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccupantloadImpl extends ConnectionImpl implements Occupantload {
		boolean lock = false;
	/**
	 * The default value of the '{@link #getNumber_of_occupants() <em>Number of occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_occupants()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_OF_OCCUPANTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber_of_occupants() <em>Number of occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_occupants()
	 * @generated
	 * @ordered
	 */
	protected String number_of_occupants = NUMBER_OF_OCCUPANTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccupancy_fraction() <em>Occupancy fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancy_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCUPANCY_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccupancy_fraction() <em>Occupancy fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancy_fraction()
	 * @generated
	 * @ordered
	 */
	protected String occupancy_fraction = OCCUPANCY_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeatgain_per_person() <em>Heatgain per person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatgain_per_person()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATGAIN_PER_PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeatgain_per_person() <em>Heatgain per person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatgain_per_person()
	 * @generated
	 * @ordered
	 */
	protected String heatgain_per_person = HEATGAIN_PER_PERSON_EDEFAULT;

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
	protected OccupantloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getOccupantload();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber_of_occupants() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"number_of_occupants");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Number_of_occupants");
				number_of_occupants= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return number_of_occupants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_of_occupants(String newNumber_of_occupants) {
		String oldNumber_of_occupants = number_of_occupants;
		number_of_occupants = newNumber_of_occupants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__NUMBER_OF_OCCUPANTS, oldNumber_of_occupants, number_of_occupants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOccupancy_fraction() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"occupancy_fraction");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Occupancy_fraction");
				occupancy_fraction= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return occupancy_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupancy_fraction(String newOccupancy_fraction) {
		String oldOccupancy_fraction = occupancy_fraction;
		occupancy_fraction = newOccupancy_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__OCCUPANCY_FRACTION, oldOccupancy_fraction, occupancy_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain_per_person() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"heatgain_per_person");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heatgain_per_person");
				heatgain_per_person= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return heatgain_per_person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatgain_per_person(String newHeatgain_per_person) {
		String oldHeatgain_per_person = heatgain_per_person;
		heatgain_per_person = newHeatgain_per_person;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__HEATGAIN_PER_PERSON, oldHeatgain_per_person, heatgain_per_person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShape() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoad() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnergy() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__ENERGY, oldEnergy, energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeak_demand() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__PEAK_DEMAND, oldPeak_demand, peak_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__HEATGAIN, oldHeatgain, heatgain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain_fraction() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__HEATGAIN_FRACTION, oldHeatgain_fraction, heatgain_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_fraction() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__CURRENT_FRACTION, oldCurrent_fraction, current_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_fraction() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__IMPEDANCE_FRACTION, oldImpedance_fraction, impedance_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_fraction() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__POWER_FRACTION, oldPower_fraction, power_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_factor() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__POWER_FACTOR, oldPower_factor, power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__CONSTANT_POWER, oldConstant_power, constant_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__CONSTANT_CURRENT, oldConstant_current, constant_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_admittance() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__CONSTANT_ADMITTANCE, oldConstant_admittance, constant_admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_factor() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__VOLTAGE_FACTOR, oldVoltage_factor, voltage_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfiguration() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverride() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OCCUPANTLOAD__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.OCCUPANTLOAD__NUMBER_OF_OCCUPANTS:
				return getNumber_of_occupants();
			case VisGridPackage.OCCUPANTLOAD__OCCUPANCY_FRACTION:
				return getOccupancy_fraction();
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN_PER_PERSON:
				return getHeatgain_per_person();
			case VisGridPackage.OCCUPANTLOAD__SHAPE:
				return getShape();
			case VisGridPackage.OCCUPANTLOAD__LOAD:
				return getLoad();
			case VisGridPackage.OCCUPANTLOAD__ENERGY:
				return getEnergy();
			case VisGridPackage.OCCUPANTLOAD__POWER:
				return getPower();
			case VisGridPackage.OCCUPANTLOAD__PEAK_DEMAND:
				return getPeak_demand();
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN:
				return getHeatgain();
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN_FRACTION:
				return getHeatgain_fraction();
			case VisGridPackage.OCCUPANTLOAD__CURRENT_FRACTION:
				return getCurrent_fraction();
			case VisGridPackage.OCCUPANTLOAD__IMPEDANCE_FRACTION:
				return getImpedance_fraction();
			case VisGridPackage.OCCUPANTLOAD__POWER_FRACTION:
				return getPower_fraction();
			case VisGridPackage.OCCUPANTLOAD__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_POWER:
				return getConstant_power();
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_CURRENT:
				return getConstant_current();
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_ADMITTANCE:
				return getConstant_admittance();
			case VisGridPackage.OCCUPANTLOAD__VOLTAGE_FACTOR:
				return getVoltage_factor();
			case VisGridPackage.OCCUPANTLOAD__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.OCCUPANTLOAD__OVERRIDE:
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
			case VisGridPackage.OCCUPANTLOAD__NUMBER_OF_OCCUPANTS:
				setNumber_of_occupants((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__OCCUPANCY_FRACTION:
				setOccupancy_fraction((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN_PER_PERSON:
				setHeatgain_per_person((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__SHAPE:
				setShape((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__PEAK_DEMAND:
				setPeak_demand((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN:
				setHeatgain((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN_FRACTION:
				setHeatgain_fraction((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__CURRENT_FRACTION:
				setCurrent_fraction((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__IMPEDANCE_FRACTION:
				setImpedance_fraction((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__POWER_FRACTION:
				setPower_fraction((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_POWER:
				setConstant_power((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_CURRENT:
				setConstant_current((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_ADMITTANCE:
				setConstant_admittance((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__VOLTAGE_FACTOR:
				setVoltage_factor((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.OCCUPANTLOAD__OVERRIDE:
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
			case VisGridPackage.OCCUPANTLOAD__NUMBER_OF_OCCUPANTS:
				setNumber_of_occupants(NUMBER_OF_OCCUPANTS_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__OCCUPANCY_FRACTION:
				setOccupancy_fraction(OCCUPANCY_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN_PER_PERSON:
				setHeatgain_per_person(HEATGAIN_PER_PERSON_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__PEAK_DEMAND:
				setPeak_demand(PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN:
				setHeatgain(HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN_FRACTION:
				setHeatgain_fraction(HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__CURRENT_FRACTION:
				setCurrent_fraction(CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__IMPEDANCE_FRACTION:
				setImpedance_fraction(IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__POWER_FRACTION:
				setPower_fraction(POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_POWER:
				setConstant_power(CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_CURRENT:
				setConstant_current(CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_ADMITTANCE:
				setConstant_admittance(CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__VOLTAGE_FACTOR:
				setVoltage_factor(VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.OCCUPANTLOAD__OVERRIDE:
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
			case VisGridPackage.OCCUPANTLOAD__NUMBER_OF_OCCUPANTS:
				return NUMBER_OF_OCCUPANTS_EDEFAULT == null ? number_of_occupants != null : !NUMBER_OF_OCCUPANTS_EDEFAULT.equals(number_of_occupants);
			case VisGridPackage.OCCUPANTLOAD__OCCUPANCY_FRACTION:
				return OCCUPANCY_FRACTION_EDEFAULT == null ? occupancy_fraction != null : !OCCUPANCY_FRACTION_EDEFAULT.equals(occupancy_fraction);
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN_PER_PERSON:
				return HEATGAIN_PER_PERSON_EDEFAULT == null ? heatgain_per_person != null : !HEATGAIN_PER_PERSON_EDEFAULT.equals(heatgain_per_person);
			case VisGridPackage.OCCUPANTLOAD__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case VisGridPackage.OCCUPANTLOAD__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.OCCUPANTLOAD__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.OCCUPANTLOAD__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.OCCUPANTLOAD__PEAK_DEMAND:
				return PEAK_DEMAND_EDEFAULT == null ? peak_demand != null : !PEAK_DEMAND_EDEFAULT.equals(peak_demand);
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN:
				return HEATGAIN_EDEFAULT == null ? heatgain != null : !HEATGAIN_EDEFAULT.equals(heatgain);
			case VisGridPackage.OCCUPANTLOAD__HEATGAIN_FRACTION:
				return HEATGAIN_FRACTION_EDEFAULT == null ? heatgain_fraction != null : !HEATGAIN_FRACTION_EDEFAULT.equals(heatgain_fraction);
			case VisGridPackage.OCCUPANTLOAD__CURRENT_FRACTION:
				return CURRENT_FRACTION_EDEFAULT == null ? current_fraction != null : !CURRENT_FRACTION_EDEFAULT.equals(current_fraction);
			case VisGridPackage.OCCUPANTLOAD__IMPEDANCE_FRACTION:
				return IMPEDANCE_FRACTION_EDEFAULT == null ? impedance_fraction != null : !IMPEDANCE_FRACTION_EDEFAULT.equals(impedance_fraction);
			case VisGridPackage.OCCUPANTLOAD__POWER_FRACTION:
				return POWER_FRACTION_EDEFAULT == null ? power_fraction != null : !POWER_FRACTION_EDEFAULT.equals(power_fraction);
			case VisGridPackage.OCCUPANTLOAD__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_POWER:
				return CONSTANT_POWER_EDEFAULT == null ? constant_power != null : !CONSTANT_POWER_EDEFAULT.equals(constant_power);
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_CURRENT:
				return CONSTANT_CURRENT_EDEFAULT == null ? constant_current != null : !CONSTANT_CURRENT_EDEFAULT.equals(constant_current);
			case VisGridPackage.OCCUPANTLOAD__CONSTANT_ADMITTANCE:
				return CONSTANT_ADMITTANCE_EDEFAULT == null ? constant_admittance != null : !CONSTANT_ADMITTANCE_EDEFAULT.equals(constant_admittance);
			case VisGridPackage.OCCUPANTLOAD__VOLTAGE_FACTOR:
				return VOLTAGE_FACTOR_EDEFAULT == null ? voltage_factor != null : !VOLTAGE_FACTOR_EDEFAULT.equals(voltage_factor);
			case VisGridPackage.OCCUPANTLOAD__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.OCCUPANTLOAD__OVERRIDE:
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
		result.append(" (number_of_occupants: ");
		result.append(number_of_occupants);
		result.append(", occupancy_fraction: ");
		result.append(occupancy_fraction);
		result.append(", heatgain_per_person: ");
		result.append(heatgain_per_person);
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

} //OccupantloadImpl
