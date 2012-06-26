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
import visGrid.Inverter;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inverter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.InverterImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getInverter_type <em>Inverter type</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getGenerator_status <em>Generator status</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getV_In <em>VIn</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getI_In <em>IIn</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getVA_In <em>VA In</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getVdc <em>Vdc</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPhaseA_V_Out <em>Phase AVOut</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPhaseB_V_Out <em>Phase BVOut</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPhaseC_V_Out <em>Phase CVOut</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPhaseA_I_Out <em>Phase AIOut</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPhaseB_I_Out <em>Phase BIOut</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPhaseC_I_Out <em>Phase CIOut</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getP_Out <em>POut</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getQ_Out <em>QOut</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.InverterImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InverterImpl extends EObjectImpl implements Inverter {
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
	 * The default value of the '{@link #getInverter_type() <em>Inverter type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverter_type()
	 * @generated
	 * @ordered
	 */
	protected static final String INVERTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInverter_type() <em>Inverter type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverter_type()
	 * @generated
	 * @ordered
	 */
	protected String inverter_type = INVERTER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerator_status() <em>Generator status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator_status()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerator_status() <em>Generator status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator_status()
	 * @generated
	 * @ordered
	 */
	protected String generator_status = GENERATOR_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerator_mode() <em>Generator mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerator_mode() <em>Generator mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator_mode()
	 * @generated
	 * @ordered
	 */
	protected String generator_mode = GENERATOR_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getV_In() <em>VIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_In()
	 * @generated
	 * @ordered
	 */
	protected static final String VIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV_In() <em>VIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_In()
	 * @generated
	 * @ordered
	 */
	protected String v_In = VIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getI_In() <em>IIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_In()
	 * @generated
	 * @ordered
	 */
	protected static final String IIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI_In() <em>IIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_In()
	 * @generated
	 * @ordered
	 */
	protected String i_In = IIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVA_In() <em>VA In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA_In()
	 * @generated
	 * @ordered
	 */
	protected static final String VA_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVA_In() <em>VA In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA_In()
	 * @generated
	 * @ordered
	 */
	protected String vA_In = VA_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVdc() <em>Vdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdc()
	 * @generated
	 * @ordered
	 */
	protected static final String VDC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVdc() <em>Vdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdc()
	 * @generated
	 * @ordered
	 */
	protected String vdc = VDC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseA_V_Out() <em>Phase AVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseA_V_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_AVOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseA_V_Out() <em>Phase AVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseA_V_Out()
	 * @generated
	 * @ordered
	 */
	protected String phaseA_V_Out = PHASE_AVOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseB_V_Out() <em>Phase BVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseB_V_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_BVOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseB_V_Out() <em>Phase BVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseB_V_Out()
	 * @generated
	 * @ordered
	 */
	protected String phaseB_V_Out = PHASE_BVOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseC_V_Out() <em>Phase CVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseC_V_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_CVOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseC_V_Out() <em>Phase CVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseC_V_Out()
	 * @generated
	 * @ordered
	 */
	protected String phaseC_V_Out = PHASE_CVOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseA_I_Out() <em>Phase AIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseA_I_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_AIOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseA_I_Out() <em>Phase AIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseA_I_Out()
	 * @generated
	 * @ordered
	 */
	protected String phaseA_I_Out = PHASE_AIOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseB_I_Out() <em>Phase BIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseB_I_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_BIOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseB_I_Out() <em>Phase BIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseB_I_Out()
	 * @generated
	 * @ordered
	 */
	protected String phaseB_I_Out = PHASE_BIOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseC_I_Out() <em>Phase CIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseC_I_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_CIOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseC_I_Out() <em>Phase CIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseC_I_Out()
	 * @generated
	 * @ordered
	 */
	protected String phaseC_I_Out = PHASE_CIOUT_EDEFAULT;

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
	 * The default value of the '{@link #getP_Out() <em>POut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String POUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getP_Out() <em>POut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Out()
	 * @generated
	 * @ordered
	 */
	protected String p_Out = POUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQ_Out() <em>QOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String QOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQ_Out() <em>QOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ_Out()
	 * @generated
	 * @ordered
	 */
	protected String q_Out = QOUT_EDEFAULT;

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
	protected InverterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getInverter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.INVERTER__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInverter_type() {
		return inverter_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverter_type(String newInverter_type) {
		String oldInverter_type = inverter_type;
		inverter_type = newInverter_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__INVERTER_TYPE, oldInverter_type, inverter_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerator_status() {
		return generator_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator_status(String newGenerator_status) {
		String oldGenerator_status = generator_status;
		generator_status = newGenerator_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__GENERATOR_STATUS, oldGenerator_status, generator_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerator_mode() {
		return generator_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator_mode(String newGenerator_mode) {
		String oldGenerator_mode = generator_mode;
		generator_mode = newGenerator_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__GENERATOR_MODE, oldGenerator_mode, generator_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV_In() {
		return v_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV_In(String newV_In) {
		String oldV_In = v_In;
		v_In = newV_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__VIN, oldV_In, v_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI_In() {
		return i_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI_In(String newI_In) {
		String oldI_In = i_In;
		i_In = newI_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__IIN, oldI_In, i_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVA_In() {
		return vA_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVA_In(String newVA_In) {
		String oldVA_In = vA_In;
		vA_In = newVA_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__VA_IN, oldVA_In, vA_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVdc() {
		return vdc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVdc(String newVdc) {
		String oldVdc = vdc;
		vdc = newVdc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__VDC, oldVdc, vdc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseA_V_Out() {
		return phaseA_V_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseA_V_Out(String newPhaseA_V_Out) {
		String oldPhaseA_V_Out = phaseA_V_Out;
		phaseA_V_Out = newPhaseA_V_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__PHASE_AVOUT, oldPhaseA_V_Out, phaseA_V_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseB_V_Out() {
		return phaseB_V_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseB_V_Out(String newPhaseB_V_Out) {
		String oldPhaseB_V_Out = phaseB_V_Out;
		phaseB_V_Out = newPhaseB_V_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__PHASE_BVOUT, oldPhaseB_V_Out, phaseB_V_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseC_V_Out() {
		return phaseC_V_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseC_V_Out(String newPhaseC_V_Out) {
		String oldPhaseC_V_Out = phaseC_V_Out;
		phaseC_V_Out = newPhaseC_V_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__PHASE_CVOUT, oldPhaseC_V_Out, phaseC_V_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseA_I_Out() {
		return phaseA_I_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseA_I_Out(String newPhaseA_I_Out) {
		String oldPhaseA_I_Out = phaseA_I_Out;
		phaseA_I_Out = newPhaseA_I_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__PHASE_AIOUT, oldPhaseA_I_Out, phaseA_I_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseB_I_Out() {
		return phaseB_I_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseB_I_Out(String newPhaseB_I_Out) {
		String oldPhaseB_I_Out = phaseB_I_Out;
		phaseB_I_Out = newPhaseB_I_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__PHASE_BIOUT, oldPhaseB_I_Out, phaseB_I_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseC_I_Out() {
		return phaseC_I_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseC_I_Out(String newPhaseC_I_Out) {
		String oldPhaseC_I_Out = phaseC_I_Out;
		phaseC_I_Out = newPhaseC_I_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__PHASE_CIOUT, oldPhaseC_I_Out, phaseC_I_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__POWER_A, oldPower_A, power_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__POWER_B, oldPower_B, power_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__POWER_C, oldPower_C, power_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getP_Out() {
		return p_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP_Out(String newP_Out) {
		String oldP_Out = p_Out;
		p_Out = newP_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__POUT, oldP_Out, p_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQ_Out() {
		return q_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ_Out(String newQ_Out) {
		String oldQ_Out = q_Out;
		q_Out = newQ_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__QOUT, oldQ_Out, q_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__POWER_FACTOR, oldPower_factor, power_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.INVERTER__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.INVERTER__CONNECTION:
				return getConnection();
			case VisGridPackage.INVERTER__NAME:
				return getName();
			case VisGridPackage.INVERTER__INVERTER_TYPE:
				return getInverter_type();
			case VisGridPackage.INVERTER__GENERATOR_STATUS:
				return getGenerator_status();
			case VisGridPackage.INVERTER__GENERATOR_MODE:
				return getGenerator_mode();
			case VisGridPackage.INVERTER__VIN:
				return getV_In();
			case VisGridPackage.INVERTER__IIN:
				return getI_In();
			case VisGridPackage.INVERTER__VA_IN:
				return getVA_In();
			case VisGridPackage.INVERTER__VDC:
				return getVdc();
			case VisGridPackage.INVERTER__PHASE_AVOUT:
				return getPhaseA_V_Out();
			case VisGridPackage.INVERTER__PHASE_BVOUT:
				return getPhaseB_V_Out();
			case VisGridPackage.INVERTER__PHASE_CVOUT:
				return getPhaseC_V_Out();
			case VisGridPackage.INVERTER__PHASE_AIOUT:
				return getPhaseA_I_Out();
			case VisGridPackage.INVERTER__PHASE_BIOUT:
				return getPhaseB_I_Out();
			case VisGridPackage.INVERTER__PHASE_CIOUT:
				return getPhaseC_I_Out();
			case VisGridPackage.INVERTER__POWER_A:
				return getPower_A();
			case VisGridPackage.INVERTER__POWER_B:
				return getPower_B();
			case VisGridPackage.INVERTER__POWER_C:
				return getPower_C();
			case VisGridPackage.INVERTER__POUT:
				return getP_Out();
			case VisGridPackage.INVERTER__QOUT:
				return getQ_Out();
			case VisGridPackage.INVERTER__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.INVERTER__PHASES:
				return getPhases();
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
			case VisGridPackage.INVERTER__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.INVERTER__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.INVERTER__INVERTER_TYPE:
				setInverter_type((String)newValue);
				return;
			case VisGridPackage.INVERTER__GENERATOR_STATUS:
				setGenerator_status((String)newValue);
				return;
			case VisGridPackage.INVERTER__GENERATOR_MODE:
				setGenerator_mode((String)newValue);
				return;
			case VisGridPackage.INVERTER__VIN:
				setV_In((String)newValue);
				return;
			case VisGridPackage.INVERTER__IIN:
				setI_In((String)newValue);
				return;
			case VisGridPackage.INVERTER__VA_IN:
				setVA_In((String)newValue);
				return;
			case VisGridPackage.INVERTER__VDC:
				setVdc((String)newValue);
				return;
			case VisGridPackage.INVERTER__PHASE_AVOUT:
				setPhaseA_V_Out((String)newValue);
				return;
			case VisGridPackage.INVERTER__PHASE_BVOUT:
				setPhaseB_V_Out((String)newValue);
				return;
			case VisGridPackage.INVERTER__PHASE_CVOUT:
				setPhaseC_V_Out((String)newValue);
				return;
			case VisGridPackage.INVERTER__PHASE_AIOUT:
				setPhaseA_I_Out((String)newValue);
				return;
			case VisGridPackage.INVERTER__PHASE_BIOUT:
				setPhaseB_I_Out((String)newValue);
				return;
			case VisGridPackage.INVERTER__PHASE_CIOUT:
				setPhaseC_I_Out((String)newValue);
				return;
			case VisGridPackage.INVERTER__POWER_A:
				setPower_A((String)newValue);
				return;
			case VisGridPackage.INVERTER__POWER_B:
				setPower_B((String)newValue);
				return;
			case VisGridPackage.INVERTER__POWER_C:
				setPower_C((String)newValue);
				return;
			case VisGridPackage.INVERTER__POUT:
				setP_Out((String)newValue);
				return;
			case VisGridPackage.INVERTER__QOUT:
				setQ_Out((String)newValue);
				return;
			case VisGridPackage.INVERTER__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.INVERTER__PHASES:
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
			case VisGridPackage.INVERTER__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.INVERTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__INVERTER_TYPE:
				setInverter_type(INVERTER_TYPE_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__GENERATOR_STATUS:
				setGenerator_status(GENERATOR_STATUS_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__GENERATOR_MODE:
				setGenerator_mode(GENERATOR_MODE_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__VIN:
				setV_In(VIN_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__IIN:
				setI_In(IIN_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__VA_IN:
				setVA_In(VA_IN_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__VDC:
				setVdc(VDC_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__PHASE_AVOUT:
				setPhaseA_V_Out(PHASE_AVOUT_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__PHASE_BVOUT:
				setPhaseB_V_Out(PHASE_BVOUT_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__PHASE_CVOUT:
				setPhaseC_V_Out(PHASE_CVOUT_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__PHASE_AIOUT:
				setPhaseA_I_Out(PHASE_AIOUT_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__PHASE_BIOUT:
				setPhaseB_I_Out(PHASE_BIOUT_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__PHASE_CIOUT:
				setPhaseC_I_Out(PHASE_CIOUT_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__POWER_A:
				setPower_A(POWER_A_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__POWER_B:
				setPower_B(POWER_B_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__POWER_C:
				setPower_C(POWER_C_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__POUT:
				setP_Out(POUT_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__QOUT:
				setQ_Out(QOUT_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.INVERTER__PHASES:
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
			case VisGridPackage.INVERTER__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.INVERTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.INVERTER__INVERTER_TYPE:
				return INVERTER_TYPE_EDEFAULT == null ? inverter_type != null : !INVERTER_TYPE_EDEFAULT.equals(inverter_type);
			case VisGridPackage.INVERTER__GENERATOR_STATUS:
				return GENERATOR_STATUS_EDEFAULT == null ? generator_status != null : !GENERATOR_STATUS_EDEFAULT.equals(generator_status);
			case VisGridPackage.INVERTER__GENERATOR_MODE:
				return GENERATOR_MODE_EDEFAULT == null ? generator_mode != null : !GENERATOR_MODE_EDEFAULT.equals(generator_mode);
			case VisGridPackage.INVERTER__VIN:
				return VIN_EDEFAULT == null ? v_In != null : !VIN_EDEFAULT.equals(v_In);
			case VisGridPackage.INVERTER__IIN:
				return IIN_EDEFAULT == null ? i_In != null : !IIN_EDEFAULT.equals(i_In);
			case VisGridPackage.INVERTER__VA_IN:
				return VA_IN_EDEFAULT == null ? vA_In != null : !VA_IN_EDEFAULT.equals(vA_In);
			case VisGridPackage.INVERTER__VDC:
				return VDC_EDEFAULT == null ? vdc != null : !VDC_EDEFAULT.equals(vdc);
			case VisGridPackage.INVERTER__PHASE_AVOUT:
				return PHASE_AVOUT_EDEFAULT == null ? phaseA_V_Out != null : !PHASE_AVOUT_EDEFAULT.equals(phaseA_V_Out);
			case VisGridPackage.INVERTER__PHASE_BVOUT:
				return PHASE_BVOUT_EDEFAULT == null ? phaseB_V_Out != null : !PHASE_BVOUT_EDEFAULT.equals(phaseB_V_Out);
			case VisGridPackage.INVERTER__PHASE_CVOUT:
				return PHASE_CVOUT_EDEFAULT == null ? phaseC_V_Out != null : !PHASE_CVOUT_EDEFAULT.equals(phaseC_V_Out);
			case VisGridPackage.INVERTER__PHASE_AIOUT:
				return PHASE_AIOUT_EDEFAULT == null ? phaseA_I_Out != null : !PHASE_AIOUT_EDEFAULT.equals(phaseA_I_Out);
			case VisGridPackage.INVERTER__PHASE_BIOUT:
				return PHASE_BIOUT_EDEFAULT == null ? phaseB_I_Out != null : !PHASE_BIOUT_EDEFAULT.equals(phaseB_I_Out);
			case VisGridPackage.INVERTER__PHASE_CIOUT:
				return PHASE_CIOUT_EDEFAULT == null ? phaseC_I_Out != null : !PHASE_CIOUT_EDEFAULT.equals(phaseC_I_Out);
			case VisGridPackage.INVERTER__POWER_A:
				return POWER_A_EDEFAULT == null ? power_A != null : !POWER_A_EDEFAULT.equals(power_A);
			case VisGridPackage.INVERTER__POWER_B:
				return POWER_B_EDEFAULT == null ? power_B != null : !POWER_B_EDEFAULT.equals(power_B);
			case VisGridPackage.INVERTER__POWER_C:
				return POWER_C_EDEFAULT == null ? power_C != null : !POWER_C_EDEFAULT.equals(power_C);
			case VisGridPackage.INVERTER__POUT:
				return POUT_EDEFAULT == null ? p_Out != null : !POUT_EDEFAULT.equals(p_Out);
			case VisGridPackage.INVERTER__QOUT:
				return QOUT_EDEFAULT == null ? q_Out != null : !QOUT_EDEFAULT.equals(q_Out);
			case VisGridPackage.INVERTER__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.INVERTER__PHASES:
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
		result.append(", inverter_type: ");
		result.append(inverter_type);
		result.append(", generator_status: ");
		result.append(generator_status);
		result.append(", generator_mode: ");
		result.append(generator_mode);
		result.append(", V_In: ");
		result.append(v_In);
		result.append(", I_In: ");
		result.append(i_In);
		result.append(", VA_In: ");
		result.append(vA_In);
		result.append(", Vdc: ");
		result.append(vdc);
		result.append(", phaseA_V_Out: ");
		result.append(phaseA_V_Out);
		result.append(", phaseB_V_Out: ");
		result.append(phaseB_V_Out);
		result.append(", phaseC_V_Out: ");
		result.append(phaseC_V_Out);
		result.append(", phaseA_I_Out: ");
		result.append(phaseA_I_Out);
		result.append(", phaseB_I_Out: ");
		result.append(phaseB_I_Out);
		result.append(", phaseC_I_Out: ");
		result.append(phaseC_I_Out);
		result.append(", power_A: ");
		result.append(power_A);
		result.append(", power_B: ");
		result.append(power_B);
		result.append(", power_C: ");
		result.append(power_C);
		result.append(", P_Out: ");
		result.append(p_Out);
		result.append(", Q_Out: ");
		result.append(q_Out);
		result.append(", power_factor: ");
		result.append(power_factor);
		result.append(", phases: ");
		result.append(phases);
		result.append(')');
		return result.toString();
	}

} //InverterImpl
