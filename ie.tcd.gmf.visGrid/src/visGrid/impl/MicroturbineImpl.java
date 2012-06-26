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

import visGrid.Microturbine;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microturbine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getGenerator_status <em>Generator status</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPower_type <em>Power type</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getRinternal <em>Rinternal</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getRload <em>Rload</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getV_Max <em>VMax</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getI_Max <em>IMax</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getMax_Frequency <em>Max Frequency</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getMin_Frequency <em>Min Frequency</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getFuel_Used <em>Fuel Used</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getHeat_Out <em>Heat Out</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getKV <em>KV</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPower_Angle <em>Power Angle</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getMax_P <em>Max P</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getMin_P <em>Min P</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPhaseA_V_Out <em>Phase AVOut</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPhaseB_V_Out <em>Phase BVOut</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPhaseC_V_Out <em>Phase CVOut</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPhaseA_I_Out <em>Phase AIOut</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPhaseB_I_Out <em>Phase BIOut</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPhaseC_I_Out <em>Phase CIOut</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPower_A_Out <em>Power AOut</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPower_B_Out <em>Power BOut</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPower_C_Out <em>Power COut</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getVA_Out <em>VA Out</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPf_Out <em>Pf Out</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getE_A_Internal <em>EAInternal</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getE_B_Internal <em>EBInternal</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getE_C_Internal <em>ECInternal</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getRated_kVA <em>Rated kVA</em>}</li>
 *   <li>{@link visGrid.impl.MicroturbineImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MicroturbineImpl extends ConnectionImpl implements Microturbine {
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
	 * The default value of the '{@link #getPower_type() <em>Power type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_type()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_type() <em>Power type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_type()
	 * @generated
	 * @ordered
	 */
	protected String power_type = POWER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRinternal() <em>Rinternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRinternal()
	 * @generated
	 * @ordered
	 */
	protected static final String RINTERNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRinternal() <em>Rinternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRinternal()
	 * @generated
	 * @ordered
	 */
	protected String rinternal = RINTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRload() <em>Rload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRload()
	 * @generated
	 * @ordered
	 */
	protected static final String RLOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRload() <em>Rload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRload()
	 * @generated
	 * @ordered
	 */
	protected String rload = RLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getV_Max() <em>VMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_Max()
	 * @generated
	 * @ordered
	 */
	protected static final String VMAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV_Max() <em>VMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_Max()
	 * @generated
	 * @ordered
	 */
	protected String v_Max = VMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getI_Max() <em>IMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Max()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI_Max() <em>IMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Max()
	 * @generated
	 * @ordered
	 */
	protected String i_Max = IMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected String frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_Frequency() <em>Max Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_Frequency()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_Frequency() <em>Max Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_Frequency()
	 * @generated
	 * @ordered
	 */
	protected String max_Frequency = MAX_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_Frequency() <em>Min Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_Frequency()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin_Frequency() <em>Min Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_Frequency()
	 * @generated
	 * @ordered
	 */
	protected String min_Frequency = MIN_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuel_Used() <em>Fuel Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuel_Used()
	 * @generated
	 * @ordered
	 */
	protected static final String FUEL_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuel_Used() <em>Fuel Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuel_Used()
	 * @generated
	 * @ordered
	 */
	protected String fuel_Used = FUEL_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeat_Out() <em>Heat Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAT_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeat_Out() <em>Heat Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_Out()
	 * @generated
	 * @ordered
	 */
	protected String heat_Out = HEAT_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKV() <em>KV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKV()
	 * @generated
	 * @ordered
	 */
	protected static final String KV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKV() <em>KV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKV()
	 * @generated
	 * @ordered
	 */
	protected String kv = KV_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_Angle() <em>Power Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_Angle()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_Angle() <em>Power Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_Angle()
	 * @generated
	 * @ordered
	 */
	protected String power_Angle = POWER_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_P() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_P()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_P() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_P()
	 * @generated
	 * @ordered
	 */
	protected String max_P = MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_P() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_P()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin_P() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_P()
	 * @generated
	 * @ordered
	 */
	protected String min_P = MIN_P_EDEFAULT;

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
	 * The default value of the '{@link #getPower_A_Out() <em>Power AOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_AOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_A_Out() <em>Power AOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A_Out()
	 * @generated
	 * @ordered
	 */
	protected String power_A_Out = POWER_AOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_B_Out() <em>Power BOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_BOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_B_Out() <em>Power BOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B_Out()
	 * @generated
	 * @ordered
	 */
	protected String power_B_Out = POWER_BOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_C_Out() <em>Power COut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_COUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_C_Out() <em>Power COut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C_Out()
	 * @generated
	 * @ordered
	 */
	protected String power_C_Out = POWER_COUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVA_Out() <em>VA Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String VA_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVA_Out() <em>VA Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA_Out()
	 * @generated
	 * @ordered
	 */
	protected String vA_Out = VA_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPf_Out() <em>Pf Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPf_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String PF_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPf_Out() <em>Pf Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPf_Out()
	 * @generated
	 * @ordered
	 */
	protected String pf_Out = PF_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getE_A_Internal() <em>EAInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_A_Internal()
	 * @generated
	 * @ordered
	 */
	protected static final String EAINTERNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getE_A_Internal() <em>EAInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_A_Internal()
	 * @generated
	 * @ordered
	 */
	protected String e_A_Internal = EAINTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getE_B_Internal() <em>EBInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_B_Internal()
	 * @generated
	 * @ordered
	 */
	protected static final String EBINTERNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getE_B_Internal() <em>EBInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_B_Internal()
	 * @generated
	 * @ordered
	 */
	protected String e_B_Internal = EBINTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getE_C_Internal() <em>ECInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_C_Internal()
	 * @generated
	 * @ordered
	 */
	protected static final String ECINTERNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getE_C_Internal() <em>ECInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_C_Internal()
	 * @generated
	 * @ordered
	 */
	protected String e_C_Internal = ECINTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFICIENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected String efficiency = EFFICIENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRated_kVA() <em>Rated kVA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_kVA()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_KVA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRated_kVA() <em>Rated kVA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_kVA()
	 * @generated
	 * @ordered
	 */
	protected String rated_kVA = RATED_KVA_EDEFAULT;

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
	protected MicroturbineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getMicroturbine();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__GENERATOR_MODE, oldGenerator_mode, generator_mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__GENERATOR_STATUS, oldGenerator_status, generator_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_type() {
		return power_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_type(String newPower_type) {
		String oldPower_type = power_type;
		power_type = newPower_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__POWER_TYPE, oldPower_type, power_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRinternal() {
		return rinternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRinternal(String newRinternal) {
		String oldRinternal = rinternal;
		rinternal = newRinternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__RINTERNAL, oldRinternal, rinternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRload() {
		return rload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRload(String newRload) {
		String oldRload = rload;
		rload = newRload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__RLOAD, oldRload, rload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV_Max() {
		return v_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV_Max(String newV_Max) {
		String oldV_Max = v_Max;
		v_Max = newV_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__VMAX, oldV_Max, v_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI_Max() {
		return i_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI_Max(String newI_Max) {
		String oldI_Max = i_Max;
		i_Max = newI_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__IMAX, oldI_Max, i_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(String newFrequency) {
		String oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_Frequency() {
		return max_Frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_Frequency(String newMax_Frequency) {
		String oldMax_Frequency = max_Frequency;
		max_Frequency = newMax_Frequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__MAX_FREQUENCY, oldMax_Frequency, max_Frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin_Frequency() {
		return min_Frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_Frequency(String newMin_Frequency) {
		String oldMin_Frequency = min_Frequency;
		min_Frequency = newMin_Frequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__MIN_FREQUENCY, oldMin_Frequency, min_Frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFuel_Used() {
		return fuel_Used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuel_Used(String newFuel_Used) {
		String oldFuel_Used = fuel_Used;
		fuel_Used = newFuel_Used;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__FUEL_USED, oldFuel_Used, fuel_Used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeat_Out() {
		return heat_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeat_Out(String newHeat_Out) {
		String oldHeat_Out = heat_Out;
		heat_Out = newHeat_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__HEAT_OUT, oldHeat_Out, heat_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKV() {
		return kv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKV(String newKV) {
		String oldKV = kv;
		kv = newKV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__KV, oldKV, kv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_Angle() {
		return power_Angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_Angle(String newPower_Angle) {
		String oldPower_Angle = power_Angle;
		power_Angle = newPower_Angle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__POWER_ANGLE, oldPower_Angle, power_Angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_P() {
		return max_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_P(String newMax_P) {
		String oldMax_P = max_P;
		max_P = newMax_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__MAX_P, oldMax_P, max_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin_P() {
		return min_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_P(String newMin_P) {
		String oldMin_P = min_P;
		min_P = newMin_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__MIN_P, oldMin_P, min_P));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__PHASE_AVOUT, oldPhaseA_V_Out, phaseA_V_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__PHASE_BVOUT, oldPhaseB_V_Out, phaseB_V_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__PHASE_CVOUT, oldPhaseC_V_Out, phaseC_V_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__PHASE_AIOUT, oldPhaseA_I_Out, phaseA_I_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__PHASE_BIOUT, oldPhaseB_I_Out, phaseB_I_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__PHASE_CIOUT, oldPhaseC_I_Out, phaseC_I_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_A_Out() {
		return power_A_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_A_Out(String newPower_A_Out) {
		String oldPower_A_Out = power_A_Out;
		power_A_Out = newPower_A_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__POWER_AOUT, oldPower_A_Out, power_A_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_B_Out() {
		return power_B_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_B_Out(String newPower_B_Out) {
		String oldPower_B_Out = power_B_Out;
		power_B_Out = newPower_B_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__POWER_BOUT, oldPower_B_Out, power_B_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_C_Out() {
		return power_C_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_C_Out(String newPower_C_Out) {
		String oldPower_C_Out = power_C_Out;
		power_C_Out = newPower_C_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__POWER_COUT, oldPower_C_Out, power_C_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVA_Out() {
		return vA_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVA_Out(String newVA_Out) {
		String oldVA_Out = vA_Out;
		vA_Out = newVA_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__VA_OUT, oldVA_Out, vA_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPf_Out() {
		return pf_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPf_Out(String newPf_Out) {
		String oldPf_Out = pf_Out;
		pf_Out = newPf_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__PF_OUT, oldPf_Out, pf_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getE_A_Internal() {
		return e_A_Internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE_A_Internal(String newE_A_Internal) {
		String oldE_A_Internal = e_A_Internal;
		e_A_Internal = newE_A_Internal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__EAINTERNAL, oldE_A_Internal, e_A_Internal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getE_B_Internal() {
		return e_B_Internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE_B_Internal(String newE_B_Internal) {
		String oldE_B_Internal = e_B_Internal;
		e_B_Internal = newE_B_Internal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__EBINTERNAL, oldE_B_Internal, e_B_Internal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getE_C_Internal() {
		return e_C_Internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE_C_Internal(String newE_C_Internal) {
		String oldE_C_Internal = e_C_Internal;
		e_C_Internal = newE_C_Internal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__ECINTERNAL, oldE_C_Internal, e_C_Internal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfficiency() {
		return efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfficiency(String newEfficiency) {
		String oldEfficiency = efficiency;
		efficiency = newEfficiency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__EFFICIENCY, oldEfficiency, efficiency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRated_kVA() {
		return rated_kVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRated_kVA(String newRated_kVA) {
		String oldRated_kVA = rated_kVA;
		rated_kVA = newRated_kVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__RATED_KVA, oldRated_kVA, rated_kVA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.MICROTURBINE__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.MICROTURBINE__NAME:
				return getName();
			case VisGridPackage.MICROTURBINE__GENERATOR_MODE:
				return getGenerator_mode();
			case VisGridPackage.MICROTURBINE__GENERATOR_STATUS:
				return getGenerator_status();
			case VisGridPackage.MICROTURBINE__POWER_TYPE:
				return getPower_type();
			case VisGridPackage.MICROTURBINE__RINTERNAL:
				return getRinternal();
			case VisGridPackage.MICROTURBINE__RLOAD:
				return getRload();
			case VisGridPackage.MICROTURBINE__VMAX:
				return getV_Max();
			case VisGridPackage.MICROTURBINE__IMAX:
				return getI_Max();
			case VisGridPackage.MICROTURBINE__FREQUENCY:
				return getFrequency();
			case VisGridPackage.MICROTURBINE__MAX_FREQUENCY:
				return getMax_Frequency();
			case VisGridPackage.MICROTURBINE__MIN_FREQUENCY:
				return getMin_Frequency();
			case VisGridPackage.MICROTURBINE__FUEL_USED:
				return getFuel_Used();
			case VisGridPackage.MICROTURBINE__HEAT_OUT:
				return getHeat_Out();
			case VisGridPackage.MICROTURBINE__KV:
				return getKV();
			case VisGridPackage.MICROTURBINE__POWER_ANGLE:
				return getPower_Angle();
			case VisGridPackage.MICROTURBINE__MAX_P:
				return getMax_P();
			case VisGridPackage.MICROTURBINE__MIN_P:
				return getMin_P();
			case VisGridPackage.MICROTURBINE__PHASE_AVOUT:
				return getPhaseA_V_Out();
			case VisGridPackage.MICROTURBINE__PHASE_BVOUT:
				return getPhaseB_V_Out();
			case VisGridPackage.MICROTURBINE__PHASE_CVOUT:
				return getPhaseC_V_Out();
			case VisGridPackage.MICROTURBINE__PHASE_AIOUT:
				return getPhaseA_I_Out();
			case VisGridPackage.MICROTURBINE__PHASE_BIOUT:
				return getPhaseB_I_Out();
			case VisGridPackage.MICROTURBINE__PHASE_CIOUT:
				return getPhaseC_I_Out();
			case VisGridPackage.MICROTURBINE__POWER_AOUT:
				return getPower_A_Out();
			case VisGridPackage.MICROTURBINE__POWER_BOUT:
				return getPower_B_Out();
			case VisGridPackage.MICROTURBINE__POWER_COUT:
				return getPower_C_Out();
			case VisGridPackage.MICROTURBINE__VA_OUT:
				return getVA_Out();
			case VisGridPackage.MICROTURBINE__PF_OUT:
				return getPf_Out();
			case VisGridPackage.MICROTURBINE__EAINTERNAL:
				return getE_A_Internal();
			case VisGridPackage.MICROTURBINE__EBINTERNAL:
				return getE_B_Internal();
			case VisGridPackage.MICROTURBINE__ECINTERNAL:
				return getE_C_Internal();
			case VisGridPackage.MICROTURBINE__EFFICIENCY:
				return getEfficiency();
			case VisGridPackage.MICROTURBINE__RATED_KVA:
				return getRated_kVA();
			case VisGridPackage.MICROTURBINE__PHASES:
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
			case VisGridPackage.MICROTURBINE__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__GENERATOR_MODE:
				setGenerator_mode((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__GENERATOR_STATUS:
				setGenerator_status((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__POWER_TYPE:
				setPower_type((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__RINTERNAL:
				setRinternal((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__RLOAD:
				setRload((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__VMAX:
				setV_Max((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__IMAX:
				setI_Max((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__FREQUENCY:
				setFrequency((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__MAX_FREQUENCY:
				setMax_Frequency((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__MIN_FREQUENCY:
				setMin_Frequency((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__FUEL_USED:
				setFuel_Used((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__HEAT_OUT:
				setHeat_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__KV:
				setKV((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__POWER_ANGLE:
				setPower_Angle((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__MAX_P:
				setMax_P((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__MIN_P:
				setMin_P((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_AVOUT:
				setPhaseA_V_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_BVOUT:
				setPhaseB_V_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_CVOUT:
				setPhaseC_V_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_AIOUT:
				setPhaseA_I_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_BIOUT:
				setPhaseB_I_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_CIOUT:
				setPhaseC_I_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__POWER_AOUT:
				setPower_A_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__POWER_BOUT:
				setPower_B_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__POWER_COUT:
				setPower_C_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__VA_OUT:
				setVA_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__PF_OUT:
				setPf_Out((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__EAINTERNAL:
				setE_A_Internal((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__EBINTERNAL:
				setE_B_Internal((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__ECINTERNAL:
				setE_C_Internal((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__EFFICIENCY:
				setEfficiency((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__RATED_KVA:
				setRated_kVA((String)newValue);
				return;
			case VisGridPackage.MICROTURBINE__PHASES:
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
			case VisGridPackage.MICROTURBINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__GENERATOR_MODE:
				setGenerator_mode(GENERATOR_MODE_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__GENERATOR_STATUS:
				setGenerator_status(GENERATOR_STATUS_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__POWER_TYPE:
				setPower_type(POWER_TYPE_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__RINTERNAL:
				setRinternal(RINTERNAL_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__RLOAD:
				setRload(RLOAD_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__VMAX:
				setV_Max(VMAX_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__IMAX:
				setI_Max(IMAX_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__MAX_FREQUENCY:
				setMax_Frequency(MAX_FREQUENCY_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__MIN_FREQUENCY:
				setMin_Frequency(MIN_FREQUENCY_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__FUEL_USED:
				setFuel_Used(FUEL_USED_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__HEAT_OUT:
				setHeat_Out(HEAT_OUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__KV:
				setKV(KV_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__POWER_ANGLE:
				setPower_Angle(POWER_ANGLE_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__MAX_P:
				setMax_P(MAX_P_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__MIN_P:
				setMin_P(MIN_P_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_AVOUT:
				setPhaseA_V_Out(PHASE_AVOUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_BVOUT:
				setPhaseB_V_Out(PHASE_BVOUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_CVOUT:
				setPhaseC_V_Out(PHASE_CVOUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_AIOUT:
				setPhaseA_I_Out(PHASE_AIOUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_BIOUT:
				setPhaseB_I_Out(PHASE_BIOUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__PHASE_CIOUT:
				setPhaseC_I_Out(PHASE_CIOUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__POWER_AOUT:
				setPower_A_Out(POWER_AOUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__POWER_BOUT:
				setPower_B_Out(POWER_BOUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__POWER_COUT:
				setPower_C_Out(POWER_COUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__VA_OUT:
				setVA_Out(VA_OUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__PF_OUT:
				setPf_Out(PF_OUT_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__EAINTERNAL:
				setE_A_Internal(EAINTERNAL_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__EBINTERNAL:
				setE_B_Internal(EBINTERNAL_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__ECINTERNAL:
				setE_C_Internal(ECINTERNAL_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__EFFICIENCY:
				setEfficiency(EFFICIENCY_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__RATED_KVA:
				setRated_kVA(RATED_KVA_EDEFAULT);
				return;
			case VisGridPackage.MICROTURBINE__PHASES:
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
			case VisGridPackage.MICROTURBINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.MICROTURBINE__GENERATOR_MODE:
				return GENERATOR_MODE_EDEFAULT == null ? generator_mode != null : !GENERATOR_MODE_EDEFAULT.equals(generator_mode);
			case VisGridPackage.MICROTURBINE__GENERATOR_STATUS:
				return GENERATOR_STATUS_EDEFAULT == null ? generator_status != null : !GENERATOR_STATUS_EDEFAULT.equals(generator_status);
			case VisGridPackage.MICROTURBINE__POWER_TYPE:
				return POWER_TYPE_EDEFAULT == null ? power_type != null : !POWER_TYPE_EDEFAULT.equals(power_type);
			case VisGridPackage.MICROTURBINE__RINTERNAL:
				return RINTERNAL_EDEFAULT == null ? rinternal != null : !RINTERNAL_EDEFAULT.equals(rinternal);
			case VisGridPackage.MICROTURBINE__RLOAD:
				return RLOAD_EDEFAULT == null ? rload != null : !RLOAD_EDEFAULT.equals(rload);
			case VisGridPackage.MICROTURBINE__VMAX:
				return VMAX_EDEFAULT == null ? v_Max != null : !VMAX_EDEFAULT.equals(v_Max);
			case VisGridPackage.MICROTURBINE__IMAX:
				return IMAX_EDEFAULT == null ? i_Max != null : !IMAX_EDEFAULT.equals(i_Max);
			case VisGridPackage.MICROTURBINE__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
			case VisGridPackage.MICROTURBINE__MAX_FREQUENCY:
				return MAX_FREQUENCY_EDEFAULT == null ? max_Frequency != null : !MAX_FREQUENCY_EDEFAULT.equals(max_Frequency);
			case VisGridPackage.MICROTURBINE__MIN_FREQUENCY:
				return MIN_FREQUENCY_EDEFAULT == null ? min_Frequency != null : !MIN_FREQUENCY_EDEFAULT.equals(min_Frequency);
			case VisGridPackage.MICROTURBINE__FUEL_USED:
				return FUEL_USED_EDEFAULT == null ? fuel_Used != null : !FUEL_USED_EDEFAULT.equals(fuel_Used);
			case VisGridPackage.MICROTURBINE__HEAT_OUT:
				return HEAT_OUT_EDEFAULT == null ? heat_Out != null : !HEAT_OUT_EDEFAULT.equals(heat_Out);
			case VisGridPackage.MICROTURBINE__KV:
				return KV_EDEFAULT == null ? kv != null : !KV_EDEFAULT.equals(kv);
			case VisGridPackage.MICROTURBINE__POWER_ANGLE:
				return POWER_ANGLE_EDEFAULT == null ? power_Angle != null : !POWER_ANGLE_EDEFAULT.equals(power_Angle);
			case VisGridPackage.MICROTURBINE__MAX_P:
				return MAX_P_EDEFAULT == null ? max_P != null : !MAX_P_EDEFAULT.equals(max_P);
			case VisGridPackage.MICROTURBINE__MIN_P:
				return MIN_P_EDEFAULT == null ? min_P != null : !MIN_P_EDEFAULT.equals(min_P);
			case VisGridPackage.MICROTURBINE__PHASE_AVOUT:
				return PHASE_AVOUT_EDEFAULT == null ? phaseA_V_Out != null : !PHASE_AVOUT_EDEFAULT.equals(phaseA_V_Out);
			case VisGridPackage.MICROTURBINE__PHASE_BVOUT:
				return PHASE_BVOUT_EDEFAULT == null ? phaseB_V_Out != null : !PHASE_BVOUT_EDEFAULT.equals(phaseB_V_Out);
			case VisGridPackage.MICROTURBINE__PHASE_CVOUT:
				return PHASE_CVOUT_EDEFAULT == null ? phaseC_V_Out != null : !PHASE_CVOUT_EDEFAULT.equals(phaseC_V_Out);
			case VisGridPackage.MICROTURBINE__PHASE_AIOUT:
				return PHASE_AIOUT_EDEFAULT == null ? phaseA_I_Out != null : !PHASE_AIOUT_EDEFAULT.equals(phaseA_I_Out);
			case VisGridPackage.MICROTURBINE__PHASE_BIOUT:
				return PHASE_BIOUT_EDEFAULT == null ? phaseB_I_Out != null : !PHASE_BIOUT_EDEFAULT.equals(phaseB_I_Out);
			case VisGridPackage.MICROTURBINE__PHASE_CIOUT:
				return PHASE_CIOUT_EDEFAULT == null ? phaseC_I_Out != null : !PHASE_CIOUT_EDEFAULT.equals(phaseC_I_Out);
			case VisGridPackage.MICROTURBINE__POWER_AOUT:
				return POWER_AOUT_EDEFAULT == null ? power_A_Out != null : !POWER_AOUT_EDEFAULT.equals(power_A_Out);
			case VisGridPackage.MICROTURBINE__POWER_BOUT:
				return POWER_BOUT_EDEFAULT == null ? power_B_Out != null : !POWER_BOUT_EDEFAULT.equals(power_B_Out);
			case VisGridPackage.MICROTURBINE__POWER_COUT:
				return POWER_COUT_EDEFAULT == null ? power_C_Out != null : !POWER_COUT_EDEFAULT.equals(power_C_Out);
			case VisGridPackage.MICROTURBINE__VA_OUT:
				return VA_OUT_EDEFAULT == null ? vA_Out != null : !VA_OUT_EDEFAULT.equals(vA_Out);
			case VisGridPackage.MICROTURBINE__PF_OUT:
				return PF_OUT_EDEFAULT == null ? pf_Out != null : !PF_OUT_EDEFAULT.equals(pf_Out);
			case VisGridPackage.MICROTURBINE__EAINTERNAL:
				return EAINTERNAL_EDEFAULT == null ? e_A_Internal != null : !EAINTERNAL_EDEFAULT.equals(e_A_Internal);
			case VisGridPackage.MICROTURBINE__EBINTERNAL:
				return EBINTERNAL_EDEFAULT == null ? e_B_Internal != null : !EBINTERNAL_EDEFAULT.equals(e_B_Internal);
			case VisGridPackage.MICROTURBINE__ECINTERNAL:
				return ECINTERNAL_EDEFAULT == null ? e_C_Internal != null : !ECINTERNAL_EDEFAULT.equals(e_C_Internal);
			case VisGridPackage.MICROTURBINE__EFFICIENCY:
				return EFFICIENCY_EDEFAULT == null ? efficiency != null : !EFFICIENCY_EDEFAULT.equals(efficiency);
			case VisGridPackage.MICROTURBINE__RATED_KVA:
				return RATED_KVA_EDEFAULT == null ? rated_kVA != null : !RATED_KVA_EDEFAULT.equals(rated_kVA);
			case VisGridPackage.MICROTURBINE__PHASES:
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
		result.append(", generator_mode: ");
		result.append(generator_mode);
		result.append(", generator_status: ");
		result.append(generator_status);
		result.append(", power_type: ");
		result.append(power_type);
		result.append(", Rinternal: ");
		result.append(rinternal);
		result.append(", Rload: ");
		result.append(rload);
		result.append(", V_Max: ");
		result.append(v_Max);
		result.append(", I_Max: ");
		result.append(i_Max);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", Max_Frequency: ");
		result.append(max_Frequency);
		result.append(", Min_Frequency: ");
		result.append(min_Frequency);
		result.append(", Fuel_Used: ");
		result.append(fuel_Used);
		result.append(", Heat_Out: ");
		result.append(heat_Out);
		result.append(", KV: ");
		result.append(kv);
		result.append(", Power_Angle: ");
		result.append(power_Angle);
		result.append(", Max_P: ");
		result.append(max_P);
		result.append(", Min_P: ");
		result.append(min_P);
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
		result.append(", power_A_Out: ");
		result.append(power_A_Out);
		result.append(", power_B_Out: ");
		result.append(power_B_Out);
		result.append(", power_C_Out: ");
		result.append(power_C_Out);
		result.append(", VA_Out: ");
		result.append(vA_Out);
		result.append(", pf_Out: ");
		result.append(pf_Out);
		result.append(", E_A_Internal: ");
		result.append(e_A_Internal);
		result.append(", E_B_Internal: ");
		result.append(e_B_Internal);
		result.append(", E_C_Internal: ");
		result.append(e_C_Internal);
		result.append(", efficiency: ");
		result.append(efficiency);
		result.append(", Rated_kVA: ");
		result.append(rated_kVA);
		result.append(", phases: ");
		result.append(phases);
		result.append(')');
		return result.toString();
	}

} //MicroturbineImpl
