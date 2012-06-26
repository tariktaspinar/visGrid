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
import visGrid.Windturb_dg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Windturb dg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getGen_status <em>Gen status</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getGen_type <em>Gen type</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getGen_mode <em>Gen mode</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getTurbine_Model <em>Turbine Model</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getRated_VA <em>Rated VA</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getRated_V <em>Rated V</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getPconv <em>Pconv</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getWSadj <em>WSadj</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getWind_Speed <em>Wind Speed</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getPf <em>Pf</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getGenElecEff <em>Gen Elec Eff</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getTotalRealPow <em>Total Real Pow</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getTotalReacPow <em>Total Reac Pow</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getEfA <em>Ef A</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getEfB <em>Ef B</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getEfC <em>Ef C</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getVrotor_A <em>Vrotor A</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getVrotor_B <em>Vrotor B</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getVrotor_C <em>Vrotor C</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getIrotor_A <em>Irotor A</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getIrotor_B <em>Irotor B</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getIrotor_C <em>Irotor C</em>}</li>
 *   <li>{@link visGrid.impl.Windturb_dgImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Windturb_dgImpl extends ConnectionImpl implements Windturb_dg {
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
	 * The default value of the '{@link #getGen_status() <em>Gen status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_status()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGen_status() <em>Gen status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_status()
	 * @generated
	 * @ordered
	 */
	protected String gen_status = GEN_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGen_type() <em>Gen type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_type()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGen_type() <em>Gen type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_type()
	 * @generated
	 * @ordered
	 */
	protected String gen_type = GEN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGen_mode() <em>Gen mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGen_mode() <em>Gen mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_mode()
	 * @generated
	 * @ordered
	 */
	protected String gen_mode = GEN_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTurbine_Model() <em>Turbine Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbine_Model()
	 * @generated
	 * @ordered
	 */
	protected static final String TURBINE_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTurbine_Model() <em>Turbine Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbine_Model()
	 * @generated
	 * @ordered
	 */
	protected String turbine_Model = TURBINE_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRated_VA() <em>Rated VA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_VA()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_VA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRated_VA() <em>Rated VA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_VA()
	 * @generated
	 * @ordered
	 */
	protected String rated_VA = RATED_VA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRated_V() <em>Rated V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_V()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_V_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRated_V() <em>Rated V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_V()
	 * @generated
	 * @ordered
	 */
	protected String rated_V = RATED_V_EDEFAULT;

	/**
	 * The default value of the '{@link #getPconv() <em>Pconv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPconv()
	 * @generated
	 * @ordered
	 */
	protected static final String PCONV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPconv() <em>Pconv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPconv()
	 * @generated
	 * @ordered
	 */
	protected String pconv = PCONV_EDEFAULT;

	/**
	 * The default value of the '{@link #getWSadj() <em>WSadj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWSadj()
	 * @generated
	 * @ordered
	 */
	protected static final String WSADJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWSadj() <em>WSadj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWSadj()
	 * @generated
	 * @ordered
	 */
	protected String wSadj = WSADJ_EDEFAULT;

	/**
	 * The default value of the '{@link #getWind_Speed() <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind_Speed()
	 * @generated
	 * @ordered
	 */
	protected static final String WIND_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWind_Speed() <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind_Speed()
	 * @generated
	 * @ordered
	 */
	protected String wind_Speed = WIND_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPf() <em>Pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPf()
	 * @generated
	 * @ordered
	 */
	protected static final String PF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPf() <em>Pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPf()
	 * @generated
	 * @ordered
	 */
	protected String pf = PF_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenElecEff() <em>Gen Elec Eff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenElecEff()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_ELEC_EFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenElecEff() <em>Gen Elec Eff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenElecEff()
	 * @generated
	 * @ordered
	 */
	protected String genElecEff = GEN_ELEC_EFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalRealPow() <em>Total Real Pow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRealPow()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_REAL_POW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalRealPow() <em>Total Real Pow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRealPow()
	 * @generated
	 * @ordered
	 */
	protected String totalRealPow = TOTAL_REAL_POW_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalReacPow() <em>Total Reac Pow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalReacPow()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_REAC_POW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalReacPow() <em>Total Reac Pow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalReacPow()
	 * @generated
	 * @ordered
	 */
	protected String totalReacPow = TOTAL_REAC_POW_EDEFAULT;

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
	 * The default value of the '{@link #getEfA() <em>Ef A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfA()
	 * @generated
	 * @ordered
	 */
	protected static final String EF_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfA() <em>Ef A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfA()
	 * @generated
	 * @ordered
	 */
	protected String efA = EF_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfB() <em>Ef B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfB()
	 * @generated
	 * @ordered
	 */
	protected static final String EF_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfB() <em>Ef B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfB()
	 * @generated
	 * @ordered
	 */
	protected String efB = EF_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfC() <em>Ef C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfC()
	 * @generated
	 * @ordered
	 */
	protected static final String EF_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfC() <em>Ef C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfC()
	 * @generated
	 * @ordered
	 */
	protected String efC = EF_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getVrotor_A() <em>Vrotor A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrotor_A()
	 * @generated
	 * @ordered
	 */
	protected static final String VROTOR_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVrotor_A() <em>Vrotor A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrotor_A()
	 * @generated
	 * @ordered
	 */
	protected String vrotor_A = VROTOR_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getVrotor_B() <em>Vrotor B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrotor_B()
	 * @generated
	 * @ordered
	 */
	protected static final String VROTOR_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVrotor_B() <em>Vrotor B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrotor_B()
	 * @generated
	 * @ordered
	 */
	protected String vrotor_B = VROTOR_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getVrotor_C() <em>Vrotor C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrotor_C()
	 * @generated
	 * @ordered
	 */
	protected static final String VROTOR_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVrotor_C() <em>Vrotor C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrotor_C()
	 * @generated
	 * @ordered
	 */
	protected String vrotor_C = VROTOR_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getIrotor_A() <em>Irotor A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrotor_A()
	 * @generated
	 * @ordered
	 */
	protected static final String IROTOR_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIrotor_A() <em>Irotor A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrotor_A()
	 * @generated
	 * @ordered
	 */
	protected String irotor_A = IROTOR_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getIrotor_B() <em>Irotor B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrotor_B()
	 * @generated
	 * @ordered
	 */
	protected static final String IROTOR_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIrotor_B() <em>Irotor B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrotor_B()
	 * @generated
	 * @ordered
	 */
	protected String irotor_B = IROTOR_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getIrotor_C() <em>Irotor C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrotor_C()
	 * @generated
	 * @ordered
	 */
	protected static final String IROTOR_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIrotor_C() <em>Irotor C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrotor_C()
	 * @generated
	 * @ordered
	 */
	protected String irotor_C = IROTOR_C_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Windturb_dgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getWindturb_dg();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGen_status() {
		return gen_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGen_status(String newGen_status) {
		String oldGen_status = gen_status;
		gen_status = newGen_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__GEN_STATUS, oldGen_status, gen_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGen_type() {
		return gen_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGen_type(String newGen_type) {
		String oldGen_type = gen_type;
		gen_type = newGen_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__GEN_TYPE, oldGen_type, gen_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGen_mode() {
		return gen_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGen_mode(String newGen_mode) {
		String oldGen_mode = gen_mode;
		gen_mode = newGen_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__GEN_MODE, oldGen_mode, gen_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTurbine_Model() {
		return turbine_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurbine_Model(String newTurbine_Model) {
		String oldTurbine_Model = turbine_Model;
		turbine_Model = newTurbine_Model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__TURBINE_MODEL, oldTurbine_Model, turbine_Model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRated_VA() {
		return rated_VA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRated_VA(String newRated_VA) {
		String oldRated_VA = rated_VA;
		rated_VA = newRated_VA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__RATED_VA, oldRated_VA, rated_VA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRated_V() {
		return rated_V;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRated_V(String newRated_V) {
		String oldRated_V = rated_V;
		rated_V = newRated_V;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__RATED_V, oldRated_V, rated_V));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPconv() {
		return pconv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPconv(String newPconv) {
		String oldPconv = pconv;
		pconv = newPconv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__PCONV, oldPconv, pconv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWSadj() {
		return wSadj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWSadj(String newWSadj) {
		String oldWSadj = wSadj;
		wSadj = newWSadj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__WSADJ, oldWSadj, wSadj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWind_Speed() {
		return wind_Speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWind_Speed(String newWind_Speed) {
		String oldWind_Speed = wind_Speed;
		wind_Speed = newWind_Speed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__WIND_SPEED, oldWind_Speed, wind_Speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPf() {
		return pf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPf(String newPf) {
		String oldPf = pf;
		pf = newPf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__PF, oldPf, pf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenElecEff() {
		return genElecEff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenElecEff(String newGenElecEff) {
		String oldGenElecEff = genElecEff;
		genElecEff = newGenElecEff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__GEN_ELEC_EFF, oldGenElecEff, genElecEff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalRealPow() {
		return totalRealPow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalRealPow(String newTotalRealPow) {
		String oldTotalRealPow = totalRealPow;
		totalRealPow = newTotalRealPow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__TOTAL_REAL_POW, oldTotalRealPow, totalRealPow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalReacPow() {
		return totalReacPow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalReacPow(String newTotalReacPow) {
		String oldTotalReacPow = totalReacPow;
		totalReacPow = newTotalReacPow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__TOTAL_REAC_POW, oldTotalReacPow, totalReacPow));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__VOLTAGE_A, oldVoltage_A, voltage_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__VOLTAGE_B, oldVoltage_B, voltage_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__VOLTAGE_C, oldVoltage_C, voltage_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__CURRENT_A, oldCurrent_A, current_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__CURRENT_B, oldCurrent_B, current_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__CURRENT_C, oldCurrent_C, current_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfA() {
		return efA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfA(String newEfA) {
		String oldEfA = efA;
		efA = newEfA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__EF_A, oldEfA, efA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfB() {
		return efB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfB(String newEfB) {
		String oldEfB = efB;
		efB = newEfB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__EF_B, oldEfB, efB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfC() {
		return efC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfC(String newEfC) {
		String oldEfC = efC;
		efC = newEfC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__EF_C, oldEfC, efC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVrotor_A() {
		return vrotor_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVrotor_A(String newVrotor_A) {
		String oldVrotor_A = vrotor_A;
		vrotor_A = newVrotor_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__VROTOR_A, oldVrotor_A, vrotor_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVrotor_B() {
		return vrotor_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVrotor_B(String newVrotor_B) {
		String oldVrotor_B = vrotor_B;
		vrotor_B = newVrotor_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__VROTOR_B, oldVrotor_B, vrotor_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVrotor_C() {
		return vrotor_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVrotor_C(String newVrotor_C) {
		String oldVrotor_C = vrotor_C;
		vrotor_C = newVrotor_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__VROTOR_C, oldVrotor_C, vrotor_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIrotor_A() {
		return irotor_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIrotor_A(String newIrotor_A) {
		String oldIrotor_A = irotor_A;
		irotor_A = newIrotor_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__IROTOR_A, oldIrotor_A, irotor_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIrotor_B() {
		return irotor_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIrotor_B(String newIrotor_B) {
		String oldIrotor_B = irotor_B;
		irotor_B = newIrotor_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__IROTOR_B, oldIrotor_B, irotor_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIrotor_C() {
		return irotor_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIrotor_C(String newIrotor_C) {
		String oldIrotor_C = irotor_C;
		irotor_C = newIrotor_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__IROTOR_C, oldIrotor_C, irotor_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WINDTURB_DG__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.WINDTURB_DG__NAME:
				return getName();
			case VisGridPackage.WINDTURB_DG__GEN_STATUS:
				return getGen_status();
			case VisGridPackage.WINDTURB_DG__GEN_TYPE:
				return getGen_type();
			case VisGridPackage.WINDTURB_DG__GEN_MODE:
				return getGen_mode();
			case VisGridPackage.WINDTURB_DG__TURBINE_MODEL:
				return getTurbine_Model();
			case VisGridPackage.WINDTURB_DG__RATED_VA:
				return getRated_VA();
			case VisGridPackage.WINDTURB_DG__RATED_V:
				return getRated_V();
			case VisGridPackage.WINDTURB_DG__PCONV:
				return getPconv();
			case VisGridPackage.WINDTURB_DG__WSADJ:
				return getWSadj();
			case VisGridPackage.WINDTURB_DG__WIND_SPEED:
				return getWind_Speed();
			case VisGridPackage.WINDTURB_DG__PF:
				return getPf();
			case VisGridPackage.WINDTURB_DG__GEN_ELEC_EFF:
				return getGenElecEff();
			case VisGridPackage.WINDTURB_DG__TOTAL_REAL_POW:
				return getTotalRealPow();
			case VisGridPackage.WINDTURB_DG__TOTAL_REAC_POW:
				return getTotalReacPow();
			case VisGridPackage.WINDTURB_DG__VOLTAGE_A:
				return getVoltage_A();
			case VisGridPackage.WINDTURB_DG__VOLTAGE_B:
				return getVoltage_B();
			case VisGridPackage.WINDTURB_DG__VOLTAGE_C:
				return getVoltage_C();
			case VisGridPackage.WINDTURB_DG__CURRENT_A:
				return getCurrent_A();
			case VisGridPackage.WINDTURB_DG__CURRENT_B:
				return getCurrent_B();
			case VisGridPackage.WINDTURB_DG__CURRENT_C:
				return getCurrent_C();
			case VisGridPackage.WINDTURB_DG__EF_A:
				return getEfA();
			case VisGridPackage.WINDTURB_DG__EF_B:
				return getEfB();
			case VisGridPackage.WINDTURB_DG__EF_C:
				return getEfC();
			case VisGridPackage.WINDTURB_DG__VROTOR_A:
				return getVrotor_A();
			case VisGridPackage.WINDTURB_DG__VROTOR_B:
				return getVrotor_B();
			case VisGridPackage.WINDTURB_DG__VROTOR_C:
				return getVrotor_C();
			case VisGridPackage.WINDTURB_DG__IROTOR_A:
				return getIrotor_A();
			case VisGridPackage.WINDTURB_DG__IROTOR_B:
				return getIrotor_B();
			case VisGridPackage.WINDTURB_DG__IROTOR_C:
				return getIrotor_C();
			case VisGridPackage.WINDTURB_DG__PHASES:
				return getPhases();
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
			case VisGridPackage.WINDTURB_DG__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__GEN_STATUS:
				setGen_status((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__GEN_TYPE:
				setGen_type((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__GEN_MODE:
				setGen_mode((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__TURBINE_MODEL:
				setTurbine_Model((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__RATED_VA:
				setRated_VA((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__RATED_V:
				setRated_V((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__PCONV:
				setPconv((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__WSADJ:
				setWSadj((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__WIND_SPEED:
				setWind_Speed((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__PF:
				setPf((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__GEN_ELEC_EFF:
				setGenElecEff((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__TOTAL_REAL_POW:
				setTotalRealPow((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__TOTAL_REAC_POW:
				setTotalReacPow((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__VOLTAGE_A:
				setVoltage_A((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__VOLTAGE_B:
				setVoltage_B((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__VOLTAGE_C:
				setVoltage_C((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__CURRENT_A:
				setCurrent_A((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__CURRENT_B:
				setCurrent_B((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__CURRENT_C:
				setCurrent_C((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__EF_A:
				setEfA((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__EF_B:
				setEfB((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__EF_C:
				setEfC((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__VROTOR_A:
				setVrotor_A((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__VROTOR_B:
				setVrotor_B((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__VROTOR_C:
				setVrotor_C((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__IROTOR_A:
				setIrotor_A((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__IROTOR_B:
				setIrotor_B((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__IROTOR_C:
				setIrotor_C((String)newValue);
				return;
			case VisGridPackage.WINDTURB_DG__PHASES:
				setPhases((String)newValue);
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
			case VisGridPackage.WINDTURB_DG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__GEN_STATUS:
				setGen_status(GEN_STATUS_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__GEN_TYPE:
				setGen_type(GEN_TYPE_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__GEN_MODE:
				setGen_mode(GEN_MODE_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__TURBINE_MODEL:
				setTurbine_Model(TURBINE_MODEL_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__RATED_VA:
				setRated_VA(RATED_VA_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__RATED_V:
				setRated_V(RATED_V_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__PCONV:
				setPconv(PCONV_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__WSADJ:
				setWSadj(WSADJ_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__WIND_SPEED:
				setWind_Speed(WIND_SPEED_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__PF:
				setPf(PF_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__GEN_ELEC_EFF:
				setGenElecEff(GEN_ELEC_EFF_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__TOTAL_REAL_POW:
				setTotalRealPow(TOTAL_REAL_POW_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__TOTAL_REAC_POW:
				setTotalReacPow(TOTAL_REAC_POW_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__VOLTAGE_A:
				setVoltage_A(VOLTAGE_A_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__VOLTAGE_B:
				setVoltage_B(VOLTAGE_B_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__VOLTAGE_C:
				setVoltage_C(VOLTAGE_C_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__CURRENT_A:
				setCurrent_A(CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__CURRENT_B:
				setCurrent_B(CURRENT_B_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__CURRENT_C:
				setCurrent_C(CURRENT_C_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__EF_A:
				setEfA(EF_A_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__EF_B:
				setEfB(EF_B_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__EF_C:
				setEfC(EF_C_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__VROTOR_A:
				setVrotor_A(VROTOR_A_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__VROTOR_B:
				setVrotor_B(VROTOR_B_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__VROTOR_C:
				setVrotor_C(VROTOR_C_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__IROTOR_A:
				setIrotor_A(IROTOR_A_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__IROTOR_B:
				setIrotor_B(IROTOR_B_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__IROTOR_C:
				setIrotor_C(IROTOR_C_EDEFAULT);
				return;
			case VisGridPackage.WINDTURB_DG__PHASES:
				setPhases(PHASES_EDEFAULT);
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
			case VisGridPackage.WINDTURB_DG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.WINDTURB_DG__GEN_STATUS:
				return GEN_STATUS_EDEFAULT == null ? gen_status != null : !GEN_STATUS_EDEFAULT.equals(gen_status);
			case VisGridPackage.WINDTURB_DG__GEN_TYPE:
				return GEN_TYPE_EDEFAULT == null ? gen_type != null : !GEN_TYPE_EDEFAULT.equals(gen_type);
			case VisGridPackage.WINDTURB_DG__GEN_MODE:
				return GEN_MODE_EDEFAULT == null ? gen_mode != null : !GEN_MODE_EDEFAULT.equals(gen_mode);
			case VisGridPackage.WINDTURB_DG__TURBINE_MODEL:
				return TURBINE_MODEL_EDEFAULT == null ? turbine_Model != null : !TURBINE_MODEL_EDEFAULT.equals(turbine_Model);
			case VisGridPackage.WINDTURB_DG__RATED_VA:
				return RATED_VA_EDEFAULT == null ? rated_VA != null : !RATED_VA_EDEFAULT.equals(rated_VA);
			case VisGridPackage.WINDTURB_DG__RATED_V:
				return RATED_V_EDEFAULT == null ? rated_V != null : !RATED_V_EDEFAULT.equals(rated_V);
			case VisGridPackage.WINDTURB_DG__PCONV:
				return PCONV_EDEFAULT == null ? pconv != null : !PCONV_EDEFAULT.equals(pconv);
			case VisGridPackage.WINDTURB_DG__WSADJ:
				return WSADJ_EDEFAULT == null ? wSadj != null : !WSADJ_EDEFAULT.equals(wSadj);
			case VisGridPackage.WINDTURB_DG__WIND_SPEED:
				return WIND_SPEED_EDEFAULT == null ? wind_Speed != null : !WIND_SPEED_EDEFAULT.equals(wind_Speed);
			case VisGridPackage.WINDTURB_DG__PF:
				return PF_EDEFAULT == null ? pf != null : !PF_EDEFAULT.equals(pf);
			case VisGridPackage.WINDTURB_DG__GEN_ELEC_EFF:
				return GEN_ELEC_EFF_EDEFAULT == null ? genElecEff != null : !GEN_ELEC_EFF_EDEFAULT.equals(genElecEff);
			case VisGridPackage.WINDTURB_DG__TOTAL_REAL_POW:
				return TOTAL_REAL_POW_EDEFAULT == null ? totalRealPow != null : !TOTAL_REAL_POW_EDEFAULT.equals(totalRealPow);
			case VisGridPackage.WINDTURB_DG__TOTAL_REAC_POW:
				return TOTAL_REAC_POW_EDEFAULT == null ? totalReacPow != null : !TOTAL_REAC_POW_EDEFAULT.equals(totalReacPow);
			case VisGridPackage.WINDTURB_DG__VOLTAGE_A:
				return VOLTAGE_A_EDEFAULT == null ? voltage_A != null : !VOLTAGE_A_EDEFAULT.equals(voltage_A);
			case VisGridPackage.WINDTURB_DG__VOLTAGE_B:
				return VOLTAGE_B_EDEFAULT == null ? voltage_B != null : !VOLTAGE_B_EDEFAULT.equals(voltage_B);
			case VisGridPackage.WINDTURB_DG__VOLTAGE_C:
				return VOLTAGE_C_EDEFAULT == null ? voltage_C != null : !VOLTAGE_C_EDEFAULT.equals(voltage_C);
			case VisGridPackage.WINDTURB_DG__CURRENT_A:
				return CURRENT_A_EDEFAULT == null ? current_A != null : !CURRENT_A_EDEFAULT.equals(current_A);
			case VisGridPackage.WINDTURB_DG__CURRENT_B:
				return CURRENT_B_EDEFAULT == null ? current_B != null : !CURRENT_B_EDEFAULT.equals(current_B);
			case VisGridPackage.WINDTURB_DG__CURRENT_C:
				return CURRENT_C_EDEFAULT == null ? current_C != null : !CURRENT_C_EDEFAULT.equals(current_C);
			case VisGridPackage.WINDTURB_DG__EF_A:
				return EF_A_EDEFAULT == null ? efA != null : !EF_A_EDEFAULT.equals(efA);
			case VisGridPackage.WINDTURB_DG__EF_B:
				return EF_B_EDEFAULT == null ? efB != null : !EF_B_EDEFAULT.equals(efB);
			case VisGridPackage.WINDTURB_DG__EF_C:
				return EF_C_EDEFAULT == null ? efC != null : !EF_C_EDEFAULT.equals(efC);
			case VisGridPackage.WINDTURB_DG__VROTOR_A:
				return VROTOR_A_EDEFAULT == null ? vrotor_A != null : !VROTOR_A_EDEFAULT.equals(vrotor_A);
			case VisGridPackage.WINDTURB_DG__VROTOR_B:
				return VROTOR_B_EDEFAULT == null ? vrotor_B != null : !VROTOR_B_EDEFAULT.equals(vrotor_B);
			case VisGridPackage.WINDTURB_DG__VROTOR_C:
				return VROTOR_C_EDEFAULT == null ? vrotor_C != null : !VROTOR_C_EDEFAULT.equals(vrotor_C);
			case VisGridPackage.WINDTURB_DG__IROTOR_A:
				return IROTOR_A_EDEFAULT == null ? irotor_A != null : !IROTOR_A_EDEFAULT.equals(irotor_A);
			case VisGridPackage.WINDTURB_DG__IROTOR_B:
				return IROTOR_B_EDEFAULT == null ? irotor_B != null : !IROTOR_B_EDEFAULT.equals(irotor_B);
			case VisGridPackage.WINDTURB_DG__IROTOR_C:
				return IROTOR_C_EDEFAULT == null ? irotor_C != null : !IROTOR_C_EDEFAULT.equals(irotor_C);
			case VisGridPackage.WINDTURB_DG__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
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
		result.append(", Gen_status: ");
		result.append(gen_status);
		result.append(", Gen_type: ");
		result.append(gen_type);
		result.append(", Gen_mode: ");
		result.append(gen_mode);
		result.append(", Turbine_Model: ");
		result.append(turbine_Model);
		result.append(", Rated_VA: ");
		result.append(rated_VA);
		result.append(", Rated_V: ");
		result.append(rated_V);
		result.append(", Pconv: ");
		result.append(pconv);
		result.append(", WSadj: ");
		result.append(wSadj);
		result.append(", Wind_Speed: ");
		result.append(wind_Speed);
		result.append(", pf: ");
		result.append(pf);
		result.append(", GenElecEff: ");
		result.append(genElecEff);
		result.append(", TotalRealPow: ");
		result.append(totalRealPow);
		result.append(", TotalReacPow: ");
		result.append(totalReacPow);
		result.append(", voltage_A: ");
		result.append(voltage_A);
		result.append(", voltage_B: ");
		result.append(voltage_B);
		result.append(", voltage_C: ");
		result.append(voltage_C);
		result.append(", current_A: ");
		result.append(current_A);
		result.append(", current_B: ");
		result.append(current_B);
		result.append(", current_C: ");
		result.append(current_C);
		result.append(", EfA: ");
		result.append(efA);
		result.append(", EfB: ");
		result.append(efB);
		result.append(", EfC: ");
		result.append(efC);
		result.append(", Vrotor_A: ");
		result.append(vrotor_A);
		result.append(", Vrotor_B: ");
		result.append(vrotor_B);
		result.append(", Vrotor_C: ");
		result.append(vrotor_C);
		result.append(", Irotor_A: ");
		result.append(irotor_A);
		result.append(", Irotor_B: ");
		result.append(irotor_B);
		result.append(", Irotor_C: ");
		result.append(irotor_C);
		result.append(", phases: ");
		result.append(phases);
		result.append(')');
		return result.toString();
	}

} //Windturb_dgImpl
