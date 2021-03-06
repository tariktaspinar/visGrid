/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;
import java.util.HashMap;
        import java.util.Map;
        import java.util.Timer;
        import java.util.TimerTask;
        import java.io.File;
        import java.net.URI;
        import java.net.URISyntaxException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.Triplex_node;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triplex node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getVoltage_1 <em>Voltage 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getVoltage_2 <em>Voltage 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getVoltage_N <em>Voltage N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getVoltage_12 <em>Voltage 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getVoltage_1N <em>Voltage 1N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getVoltage_2N <em>Voltage 2N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_1 <em>Current 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_2 <em>Current 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_N <em>Current N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_1_real <em>Current 1real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_2_real <em>Current 2real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_N_real <em>Current Nreal</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_1_reac <em>Current 1reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_2_reac <em>Current 2reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_N_reac <em>Current Nreac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_12 <em>Current 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_12_real <em>Current 12 real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getCurrent_12_reac <em>Current 12 reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getResidential_nominal_current_1 <em>Residential nominal current 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getResidential_nominal_current_2 <em>Residential nominal current 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getResidential_nominal_current_12 <em>Residential nominal current 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getResidential_nominal_current_1_real <em>Residential nominal current 1real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getResidential_nominal_current_1_imag <em>Residential nominal current 1imag</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getResidential_nominal_current_2_real <em>Residential nominal current 2real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getResidential_nominal_current_2_imag <em>Residential nominal current 2imag</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getResidential_nominal_current_12_real <em>Residential nominal current 12 real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getResidential_nominal_current_12_imag <em>Residential nominal current 12 imag</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getPower_1 <em>Power 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getPower_2 <em>Power 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getPower_12 <em>Power 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getPower_1_real <em>Power 1real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getPower_2_real <em>Power 2real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getPower_12_real <em>Power 12 real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getPower_1_reac <em>Power 1reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getPower_2_reac <em>Power 2reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getPower_12_reac <em>Power 12 reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getShunt_1 <em>Shunt 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getShunt_2 <em>Shunt 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getShunt_12 <em>Shunt 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getImpedance_1 <em>Impedance 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getImpedance_2 <em>Impedance 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getImpedance_12 <em>Impedance 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getImpedance_1_real <em>Impedance 1real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getImpedance_2_real <em>Impedance 2real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getImpedance_12_real <em>Impedance 12 real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getImpedance_1_reac <em>Impedance 1reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getImpedance_2_reac <em>Impedance 2reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getImpedance_12_reac <em>Impedance 12 reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getHouse_present <em>House present</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getNR_mode <em>NR mode</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_nodeImpl#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Triplex_nodeImpl extends ConnectionImpl implements Triplex_node {
	// Generated by python script located in this directory
       boolean threadLock = false;
       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();

   private void checkUnlock() {
        if (threadLock) return;
        for (Map.Entry<String, Boolean> entry : lock.entrySet()){
            if (threadLock) return;
            if (entry.getValue() == false) return;
        }
        resetLock();
    }

    private void resetLock() {
        Timer timer = new Timer();
        class Task extends TimerTask{
            public void run() {
                threadLock = true;
                for (Map.Entry<String, Boolean> entry : lock.entrySet()){
                    entry.setValue(false);
                }
                threadLock = false;
            }   
        }
        timer.schedule(new Task(), lock.size()*30);
    }
    // END PYTHON GENERATED CODE
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
	 * The default value of the '{@link #getVoltage_1() <em>Voltage 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_1()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_1() <em>Voltage 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_1()
	 * @generated
	 * @ordered
	 */
	protected String voltage_1 = VOLTAGE_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_2() <em>Voltage 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_2()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_2() <em>Voltage 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_2()
	 * @generated
	 * @ordered
	 */
	protected String voltage_2 = VOLTAGE_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_N() <em>Voltage N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_N()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_N_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_N() <em>Voltage N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_N()
	 * @generated
	 * @ordered
	 */
	protected String voltage_N = VOLTAGE_N_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_12() <em>Voltage 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_12()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_12() <em>Voltage 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_12()
	 * @generated
	 * @ordered
	 */
	protected String voltage_12 = VOLTAGE_12_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_1N() <em>Voltage 1N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_1N()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_1N_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_1N() <em>Voltage 1N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_1N()
	 * @generated
	 * @ordered
	 */
	protected String voltage_1N = VOLTAGE_1N_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_2N() <em>Voltage 2N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_2N()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_2N_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_2N() <em>Voltage 2N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_2N()
	 * @generated
	 * @ordered
	 */
	protected String voltage_2N = VOLTAGE_2N_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_1() <em>Current 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_1()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_1() <em>Current 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_1()
	 * @generated
	 * @ordered
	 */
	protected String current_1 = CURRENT_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_2() <em>Current 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_2()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_2() <em>Current 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_2()
	 * @generated
	 * @ordered
	 */
	protected String current_2 = CURRENT_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_N() <em>Current N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_N()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_N_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_N() <em>Current N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_N()
	 * @generated
	 * @ordered
	 */
	protected String current_N = CURRENT_N_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_1_real() <em>Current 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_1_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_1REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_1_real() <em>Current 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_1_real()
	 * @generated
	 * @ordered
	 */
	protected String current_1_real = CURRENT_1REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_2_real() <em>Current 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_2_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_2REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_2_real() <em>Current 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_2_real()
	 * @generated
	 * @ordered
	 */
	protected String current_2_real = CURRENT_2REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_N_real() <em>Current Nreal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_N_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_NREAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_N_real() <em>Current Nreal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_N_real()
	 * @generated
	 * @ordered
	 */
	protected String current_N_real = CURRENT_NREAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_1_reac() <em>Current 1reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_1_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_1REAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_1_reac() <em>Current 1reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_1_reac()
	 * @generated
	 * @ordered
	 */
	protected String current_1_reac = CURRENT_1REAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_2_reac() <em>Current 2reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_2_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_2REAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_2_reac() <em>Current 2reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_2_reac()
	 * @generated
	 * @ordered
	 */
	protected String current_2_reac = CURRENT_2REAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_N_reac() <em>Current Nreac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_N_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_NREAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_N_reac() <em>Current Nreac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_N_reac()
	 * @generated
	 * @ordered
	 */
	protected String current_N_reac = CURRENT_NREAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_12() <em>Current 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_12()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_12() <em>Current 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_12()
	 * @generated
	 * @ordered
	 */
	protected String current_12 = CURRENT_12_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_12_real() <em>Current 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_12_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_12_REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_12_real() <em>Current 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_12_real()
	 * @generated
	 * @ordered
	 */
	protected String current_12_real = CURRENT_12_REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_12_reac() <em>Current 12 reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_12_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_12_REAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_12_reac() <em>Current 12 reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_12_reac()
	 * @generated
	 * @ordered
	 */
	protected String current_12_reac = CURRENT_12_REAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidential_nominal_current_1() <em>Residential nominal current 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_1()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDENTIAL_NOMINAL_CURRENT_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResidential_nominal_current_1() <em>Residential nominal current 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_1()
	 * @generated
	 * @ordered
	 */
	protected String residential_nominal_current_1 = RESIDENTIAL_NOMINAL_CURRENT_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidential_nominal_current_2() <em>Residential nominal current 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_2()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDENTIAL_NOMINAL_CURRENT_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResidential_nominal_current_2() <em>Residential nominal current 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_2()
	 * @generated
	 * @ordered
	 */
	protected String residential_nominal_current_2 = RESIDENTIAL_NOMINAL_CURRENT_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidential_nominal_current_12() <em>Residential nominal current 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_12()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDENTIAL_NOMINAL_CURRENT_12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResidential_nominal_current_12() <em>Residential nominal current 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_12()
	 * @generated
	 * @ordered
	 */
	protected String residential_nominal_current_12 = RESIDENTIAL_NOMINAL_CURRENT_12_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidential_nominal_current_1_real() <em>Residential nominal current 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_1_real()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDENTIAL_NOMINAL_CURRENT_1REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResidential_nominal_current_1_real() <em>Residential nominal current 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_1_real()
	 * @generated
	 * @ordered
	 */
	protected String residential_nominal_current_1_real = RESIDENTIAL_NOMINAL_CURRENT_1REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidential_nominal_current_1_imag() <em>Residential nominal current 1imag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_1_imag()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDENTIAL_NOMINAL_CURRENT_1IMAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResidential_nominal_current_1_imag() <em>Residential nominal current 1imag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_1_imag()
	 * @generated
	 * @ordered
	 */
	protected String residential_nominal_current_1_imag = RESIDENTIAL_NOMINAL_CURRENT_1IMAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidential_nominal_current_2_real() <em>Residential nominal current 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_2_real()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDENTIAL_NOMINAL_CURRENT_2REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResidential_nominal_current_2_real() <em>Residential nominal current 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_2_real()
	 * @generated
	 * @ordered
	 */
	protected String residential_nominal_current_2_real = RESIDENTIAL_NOMINAL_CURRENT_2REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidential_nominal_current_2_imag() <em>Residential nominal current 2imag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_2_imag()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDENTIAL_NOMINAL_CURRENT_2IMAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResidential_nominal_current_2_imag() <em>Residential nominal current 2imag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_2_imag()
	 * @generated
	 * @ordered
	 */
	protected String residential_nominal_current_2_imag = RESIDENTIAL_NOMINAL_CURRENT_2IMAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidential_nominal_current_12_real() <em>Residential nominal current 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_12_real()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDENTIAL_NOMINAL_CURRENT_12_REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResidential_nominal_current_12_real() <em>Residential nominal current 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_12_real()
	 * @generated
	 * @ordered
	 */
	protected String residential_nominal_current_12_real = RESIDENTIAL_NOMINAL_CURRENT_12_REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidential_nominal_current_12_imag() <em>Residential nominal current 12 imag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_12_imag()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDENTIAL_NOMINAL_CURRENT_12_IMAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResidential_nominal_current_12_imag() <em>Residential nominal current 12 imag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_nominal_current_12_imag()
	 * @generated
	 * @ordered
	 */
	protected String residential_nominal_current_12_imag = RESIDENTIAL_NOMINAL_CURRENT_12_IMAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_1() <em>Power 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_1()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_1() <em>Power 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_1()
	 * @generated
	 * @ordered
	 */
	protected String power_1 = POWER_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_2() <em>Power 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_2()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_2() <em>Power 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_2()
	 * @generated
	 * @ordered
	 */
	protected String power_2 = POWER_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_12() <em>Power 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_12()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_12() <em>Power 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_12()
	 * @generated
	 * @ordered
	 */
	protected String power_12 = POWER_12_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_1_real() <em>Power 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_1_real()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_1REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_1_real() <em>Power 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_1_real()
	 * @generated
	 * @ordered
	 */
	protected String power_1_real = POWER_1REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_2_real() <em>Power 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_2_real()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_2REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_2_real() <em>Power 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_2_real()
	 * @generated
	 * @ordered
	 */
	protected String power_2_real = POWER_2REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_12_real() <em>Power 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_12_real()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_12_REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_12_real() <em>Power 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_12_real()
	 * @generated
	 * @ordered
	 */
	protected String power_12_real = POWER_12_REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_1_reac() <em>Power 1reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_1_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_1REAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_1_reac() <em>Power 1reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_1_reac()
	 * @generated
	 * @ordered
	 */
	protected String power_1_reac = POWER_1REAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_2_reac() <em>Power 2reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_2_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_2REAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_2_reac() <em>Power 2reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_2_reac()
	 * @generated
	 * @ordered
	 */
	protected String power_2_reac = POWER_2REAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_12_reac() <em>Power 12 reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_12_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_12_REAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_12_reac() <em>Power 12 reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_12_reac()
	 * @generated
	 * @ordered
	 */
	protected String power_12_reac = POWER_12_REAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_1() <em>Shunt 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_1()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_1() <em>Shunt 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_1()
	 * @generated
	 * @ordered
	 */
	protected String shunt_1 = SHUNT_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_2() <em>Shunt 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_2()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_2() <em>Shunt 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_2()
	 * @generated
	 * @ordered
	 */
	protected String shunt_2 = SHUNT_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_12() <em>Shunt 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_12()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_12() <em>Shunt 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_12()
	 * @generated
	 * @ordered
	 */
	protected String shunt_12 = SHUNT_12_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_1() <em>Impedance 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_1()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_1() <em>Impedance 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_1()
	 * @generated
	 * @ordered
	 */
	protected String impedance_1 = IMPEDANCE_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_2() <em>Impedance 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_2()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_2() <em>Impedance 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_2()
	 * @generated
	 * @ordered
	 */
	protected String impedance_2 = IMPEDANCE_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_12() <em>Impedance 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_12()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_12_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_12() <em>Impedance 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_12()
	 * @generated
	 * @ordered
	 */
	protected String impedance_12 = IMPEDANCE_12_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_1_real() <em>Impedance 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_1_real()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_1REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_1_real() <em>Impedance 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_1_real()
	 * @generated
	 * @ordered
	 */
	protected String impedance_1_real = IMPEDANCE_1REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_2_real() <em>Impedance 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_2_real()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_2REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_2_real() <em>Impedance 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_2_real()
	 * @generated
	 * @ordered
	 */
	protected String impedance_2_real = IMPEDANCE_2REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_12_real() <em>Impedance 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_12_real()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_12_REAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_12_real() <em>Impedance 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_12_real()
	 * @generated
	 * @ordered
	 */
	protected String impedance_12_real = IMPEDANCE_12_REAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_1_reac() <em>Impedance 1reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_1_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_1REAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_1_reac() <em>Impedance 1reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_1_reac()
	 * @generated
	 * @ordered
	 */
	protected String impedance_1_reac = IMPEDANCE_1REAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_2_reac() <em>Impedance 2reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_2_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_2REAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_2_reac() <em>Impedance 2reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_2_reac()
	 * @generated
	 * @ordered
	 */
	protected String impedance_2_reac = IMPEDANCE_2REAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_12_reac() <em>Impedance 12 reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_12_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_12_REAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_12_reac() <em>Impedance 12 reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_12_reac()
	 * @generated
	 * @ordered
	 */
	protected String impedance_12_reac = IMPEDANCE_12_REAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouse_present() <em>House present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse_present()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSE_PRESENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouse_present() <em>House present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse_present()
	 * @generated
	 * @ordered
	 */
	protected String house_present = HOUSE_PRESENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNR_mode() <em>NR mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNR_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String NR_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNR_mode() <em>NR mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNR_mode()
	 * @generated
	 * @ordered
	 */
	protected String nR_mode = NR_MODE_EDEFAULT;

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
	protected Triplex_nodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getTriplex_node();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBustype() {
		// Generated by python script located in this directory
			if (!lock.containsKey("bustype")) lock.put("bustype", new Boolean(false));
			if (!(Boolean)lock.get("bustype")){
				lock.put("bustype", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"bustype");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Bustype");
					bustype= val;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__BUSTYPE, oldBustype, bustype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusflags() {
		// Generated by python script located in this directory
			if (!lock.containsKey("busflags")) lock.put("busflags", new Boolean(false));
			if (!(Boolean)lock.get("busflags")){
				lock.put("busflags", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"busflags");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Busflags");
					busflags= val;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__BUSFLAGS, oldBusflags, busflags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference_bus() {
		// Generated by python script located in this directory
			if (!lock.containsKey("reference_bus")) lock.put("reference_bus", new Boolean(false));
			if (!(Boolean)lock.get("reference_bus")){
				lock.put("reference_bus", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"reference_bus");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Reference_bus");
					reference_bus= val;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__REFERENCE_BUS, oldReference_bus, reference_bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum_voltage_error() {
		// Generated by python script located in this directory
			if (!lock.containsKey("maximum_voltage_error")) lock.put("maximum_voltage_error", new Boolean(false));
			if (!(Boolean)lock.get("maximum_voltage_error")){
				lock.put("maximum_voltage_error", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"maximum_voltage_error");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Maximum_voltage_error");
					maximum_voltage_error= val;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__MAXIMUM_VOLTAGE_ERROR, oldMaximum_voltage_error, maximum_voltage_error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_1() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_1")) lock.put("voltage_1", new Boolean(false));
			if (!(Boolean)lock.get("voltage_1")){
				lock.put("voltage_1", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_1");
					voltage_1= val;
			}
		return voltage_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_1(String newVoltage_1) {
		String oldVoltage_1 = voltage_1;
		voltage_1 = newVoltage_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__VOLTAGE_1, oldVoltage_1, voltage_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_2() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_2")) lock.put("voltage_2", new Boolean(false));
			if (!(Boolean)lock.get("voltage_2")){
				lock.put("voltage_2", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_2");
					voltage_2= val;
			}
		return voltage_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_2(String newVoltage_2) {
		String oldVoltage_2 = voltage_2;
		voltage_2 = newVoltage_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__VOLTAGE_2, oldVoltage_2, voltage_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_N() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_N")) lock.put("voltage_N", new Boolean(false));
			if (!(Boolean)lock.get("voltage_N")){
				lock.put("voltage_N", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_N");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_N");
					voltage_N= val;
			}
		return voltage_N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_N(String newVoltage_N) {
		String oldVoltage_N = voltage_N;
		voltage_N = newVoltage_N;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__VOLTAGE_N, oldVoltage_N, voltage_N));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_12() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_12")) lock.put("voltage_12", new Boolean(false));
			if (!(Boolean)lock.get("voltage_12")){
				lock.put("voltage_12", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_12");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_12");
					voltage_12= val;
			}
		return voltage_12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_12(String newVoltage_12) {
		String oldVoltage_12 = voltage_12;
		voltage_12 = newVoltage_12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__VOLTAGE_12, oldVoltage_12, voltage_12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_1N() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_1N")) lock.put("voltage_1N", new Boolean(false));
			if (!(Boolean)lock.get("voltage_1N")){
				lock.put("voltage_1N", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_1N");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_1N");
					voltage_1N= val;
			}
		return voltage_1N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_1N(String newVoltage_1N) {
		String oldVoltage_1N = voltage_1N;
		voltage_1N = newVoltage_1N;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__VOLTAGE_1N, oldVoltage_1N, voltage_1N));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_2N() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_2N")) lock.put("voltage_2N", new Boolean(false));
			if (!(Boolean)lock.get("voltage_2N")){
				lock.put("voltage_2N", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_2N");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_2N");
					voltage_2N= val;
			}
		return voltage_2N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_2N(String newVoltage_2N) {
		String oldVoltage_2N = voltage_2N;
		voltage_2N = newVoltage_2N;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__VOLTAGE_2N, oldVoltage_2N, voltage_2N));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_1() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_1")) lock.put("current_1", new Boolean(false));
			if (!(Boolean)lock.get("current_1")){
				lock.put("current_1", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_1");
					current_1= val;
			}
		return current_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_1(String newCurrent_1) {
		String oldCurrent_1 = current_1;
		current_1 = newCurrent_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_1, oldCurrent_1, current_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_2() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_2")) lock.put("current_2", new Boolean(false));
			if (!(Boolean)lock.get("current_2")){
				lock.put("current_2", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_2");
					current_2= val;
			}
		return current_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_2(String newCurrent_2) {
		String oldCurrent_2 = current_2;
		current_2 = newCurrent_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_2, oldCurrent_2, current_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_N() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_N")) lock.put("current_N", new Boolean(false));
			if (!(Boolean)lock.get("current_N")){
				lock.put("current_N", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_N");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_N");
					current_N= val;
			}
		return current_N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_N(String newCurrent_N) {
		String oldCurrent_N = current_N;
		current_N = newCurrent_N;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_N, oldCurrent_N, current_N));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_1_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_1_real")) lock.put("current_1_real", new Boolean(false));
			if (!(Boolean)lock.get("current_1_real")){
				lock.put("current_1_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_1_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_1_real");
					current_1_real= val;
			}
		return current_1_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_1_real(String newCurrent_1_real) {
		String oldCurrent_1_real = current_1_real;
		current_1_real = newCurrent_1_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_1REAL, oldCurrent_1_real, current_1_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_2_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_2_real")) lock.put("current_2_real", new Boolean(false));
			if (!(Boolean)lock.get("current_2_real")){
				lock.put("current_2_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_2_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_2_real");
					current_2_real= val;
			}
		return current_2_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_2_real(String newCurrent_2_real) {
		String oldCurrent_2_real = current_2_real;
		current_2_real = newCurrent_2_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_2REAL, oldCurrent_2_real, current_2_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_N_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_N_real")) lock.put("current_N_real", new Boolean(false));
			if (!(Boolean)lock.get("current_N_real")){
				lock.put("current_N_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_N_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_N_real");
					current_N_real= val;
			}
		return current_N_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_N_real(String newCurrent_N_real) {
		String oldCurrent_N_real = current_N_real;
		current_N_real = newCurrent_N_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_NREAL, oldCurrent_N_real, current_N_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_1_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_1_reac")) lock.put("current_1_reac", new Boolean(false));
			if (!(Boolean)lock.get("current_1_reac")){
				lock.put("current_1_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_1_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_1_reac");
					current_1_reac= val;
			}
		return current_1_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_1_reac(String newCurrent_1_reac) {
		String oldCurrent_1_reac = current_1_reac;
		current_1_reac = newCurrent_1_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_1REAC, oldCurrent_1_reac, current_1_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_2_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_2_reac")) lock.put("current_2_reac", new Boolean(false));
			if (!(Boolean)lock.get("current_2_reac")){
				lock.put("current_2_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_2_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_2_reac");
					current_2_reac= val;
			}
		return current_2_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_2_reac(String newCurrent_2_reac) {
		String oldCurrent_2_reac = current_2_reac;
		current_2_reac = newCurrent_2_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_2REAC, oldCurrent_2_reac, current_2_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_N_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_N_reac")) lock.put("current_N_reac", new Boolean(false));
			if (!(Boolean)lock.get("current_N_reac")){
				lock.put("current_N_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_N_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_N_reac");
					current_N_reac= val;
			}
		return current_N_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_N_reac(String newCurrent_N_reac) {
		String oldCurrent_N_reac = current_N_reac;
		current_N_reac = newCurrent_N_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_NREAC, oldCurrent_N_reac, current_N_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_12() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_12")) lock.put("current_12", new Boolean(false));
			if (!(Boolean)lock.get("current_12")){
				lock.put("current_12", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_12");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_12");
					current_12= val;
			}
		return current_12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_12(String newCurrent_12) {
		String oldCurrent_12 = current_12;
		current_12 = newCurrent_12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_12, oldCurrent_12, current_12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_12_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_12_real")) lock.put("current_12_real", new Boolean(false));
			if (!(Boolean)lock.get("current_12_real")){
				lock.put("current_12_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_12_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_12_real");
					current_12_real= val;
			}
		return current_12_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_12_real(String newCurrent_12_real) {
		String oldCurrent_12_real = current_12_real;
		current_12_real = newCurrent_12_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAL, oldCurrent_12_real, current_12_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_12_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_12_reac")) lock.put("current_12_reac", new Boolean(false));
			if (!(Boolean)lock.get("current_12_reac")){
				lock.put("current_12_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_12_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_12_reac");
					current_12_reac= val;
			}
		return current_12_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_12_reac(String newCurrent_12_reac) {
		String oldCurrent_12_reac = current_12_reac;
		current_12_reac = newCurrent_12_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAC, oldCurrent_12_reac, current_12_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResidential_nominal_current_1() {
		// Generated by python script located in this directory
			if (!lock.containsKey("residential_nominal_current_1")) lock.put("residential_nominal_current_1", new Boolean(false));
			if (!(Boolean)lock.get("residential_nominal_current_1")){
				lock.put("residential_nominal_current_1", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"residential_nominal_current_1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Residential_nominal_current_1");
					residential_nominal_current_1= val;
			}
		return residential_nominal_current_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidential_nominal_current_1(String newResidential_nominal_current_1) {
		String oldResidential_nominal_current_1 = residential_nominal_current_1;
		residential_nominal_current_1 = newResidential_nominal_current_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1, oldResidential_nominal_current_1, residential_nominal_current_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResidential_nominal_current_2() {
		// Generated by python script located in this directory
			if (!lock.containsKey("residential_nominal_current_2")) lock.put("residential_nominal_current_2", new Boolean(false));
			if (!(Boolean)lock.get("residential_nominal_current_2")){
				lock.put("residential_nominal_current_2", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"residential_nominal_current_2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Residential_nominal_current_2");
					residential_nominal_current_2= val;
			}
		return residential_nominal_current_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidential_nominal_current_2(String newResidential_nominal_current_2) {
		String oldResidential_nominal_current_2 = residential_nominal_current_2;
		residential_nominal_current_2 = newResidential_nominal_current_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2, oldResidential_nominal_current_2, residential_nominal_current_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResidential_nominal_current_12() {
		// Generated by python script located in this directory
			if (!lock.containsKey("residential_nominal_current_12")) lock.put("residential_nominal_current_12", new Boolean(false));
			if (!(Boolean)lock.get("residential_nominal_current_12")){
				lock.put("residential_nominal_current_12", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"residential_nominal_current_12");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Residential_nominal_current_12");
					residential_nominal_current_12= val;
			}
		return residential_nominal_current_12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidential_nominal_current_12(String newResidential_nominal_current_12) {
		String oldResidential_nominal_current_12 = residential_nominal_current_12;
		residential_nominal_current_12 = newResidential_nominal_current_12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12, oldResidential_nominal_current_12, residential_nominal_current_12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResidential_nominal_current_1_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("residential_nominal_current_1_real")) lock.put("residential_nominal_current_1_real", new Boolean(false));
			if (!(Boolean)lock.get("residential_nominal_current_1_real")){
				lock.put("residential_nominal_current_1_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"residential_nominal_current_1_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Residential_nominal_current_1_real");
					residential_nominal_current_1_real= val;
			}
		return residential_nominal_current_1_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidential_nominal_current_1_real(String newResidential_nominal_current_1_real) {
		String oldResidential_nominal_current_1_real = residential_nominal_current_1_real;
		residential_nominal_current_1_real = newResidential_nominal_current_1_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1REAL, oldResidential_nominal_current_1_real, residential_nominal_current_1_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResidential_nominal_current_1_imag() {
		// Generated by python script located in this directory
			if (!lock.containsKey("residential_nominal_current_1_imag")) lock.put("residential_nominal_current_1_imag", new Boolean(false));
			if (!(Boolean)lock.get("residential_nominal_current_1_imag")){
				lock.put("residential_nominal_current_1_imag", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"residential_nominal_current_1_imag");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Residential_nominal_current_1_imag");
					residential_nominal_current_1_imag= val;
			}
		return residential_nominal_current_1_imag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidential_nominal_current_1_imag(String newResidential_nominal_current_1_imag) {
		String oldResidential_nominal_current_1_imag = residential_nominal_current_1_imag;
		residential_nominal_current_1_imag = newResidential_nominal_current_1_imag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1IMAG, oldResidential_nominal_current_1_imag, residential_nominal_current_1_imag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResidential_nominal_current_2_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("residential_nominal_current_2_real")) lock.put("residential_nominal_current_2_real", new Boolean(false));
			if (!(Boolean)lock.get("residential_nominal_current_2_real")){
				lock.put("residential_nominal_current_2_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"residential_nominal_current_2_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Residential_nominal_current_2_real");
					residential_nominal_current_2_real= val;
			}
		return residential_nominal_current_2_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidential_nominal_current_2_real(String newResidential_nominal_current_2_real) {
		String oldResidential_nominal_current_2_real = residential_nominal_current_2_real;
		residential_nominal_current_2_real = newResidential_nominal_current_2_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2REAL, oldResidential_nominal_current_2_real, residential_nominal_current_2_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResidential_nominal_current_2_imag() {
		// Generated by python script located in this directory
			if (!lock.containsKey("residential_nominal_current_2_imag")) lock.put("residential_nominal_current_2_imag", new Boolean(false));
			if (!(Boolean)lock.get("residential_nominal_current_2_imag")){
				lock.put("residential_nominal_current_2_imag", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"residential_nominal_current_2_imag");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Residential_nominal_current_2_imag");
					residential_nominal_current_2_imag= val;
			}
		return residential_nominal_current_2_imag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidential_nominal_current_2_imag(String newResidential_nominal_current_2_imag) {
		String oldResidential_nominal_current_2_imag = residential_nominal_current_2_imag;
		residential_nominal_current_2_imag = newResidential_nominal_current_2_imag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2IMAG, oldResidential_nominal_current_2_imag, residential_nominal_current_2_imag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResidential_nominal_current_12_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("residential_nominal_current_12_real")) lock.put("residential_nominal_current_12_real", new Boolean(false));
			if (!(Boolean)lock.get("residential_nominal_current_12_real")){
				lock.put("residential_nominal_current_12_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"residential_nominal_current_12_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Residential_nominal_current_12_real");
					residential_nominal_current_12_real= val;
			}
		return residential_nominal_current_12_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidential_nominal_current_12_real(String newResidential_nominal_current_12_real) {
		String oldResidential_nominal_current_12_real = residential_nominal_current_12_real;
		residential_nominal_current_12_real = newResidential_nominal_current_12_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_REAL, oldResidential_nominal_current_12_real, residential_nominal_current_12_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResidential_nominal_current_12_imag() {
		// Generated by python script located in this directory
			if (!lock.containsKey("residential_nominal_current_12_imag")) lock.put("residential_nominal_current_12_imag", new Boolean(false));
			if (!(Boolean)lock.get("residential_nominal_current_12_imag")){
				lock.put("residential_nominal_current_12_imag", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"residential_nominal_current_12_imag");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Residential_nominal_current_12_imag");
					residential_nominal_current_12_imag= val;
			}
		return residential_nominal_current_12_imag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidential_nominal_current_12_imag(String newResidential_nominal_current_12_imag) {
		String oldResidential_nominal_current_12_imag = residential_nominal_current_12_imag;
		residential_nominal_current_12_imag = newResidential_nominal_current_12_imag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG, oldResidential_nominal_current_12_imag, residential_nominal_current_12_imag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_1() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_1")) lock.put("power_1", new Boolean(false));
			if (!(Boolean)lock.get("power_1")){
				lock.put("power_1", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_1");
					power_1= val;
			}
		return power_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_1(String newPower_1) {
		String oldPower_1 = power_1;
		power_1 = newPower_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__POWER_1, oldPower_1, power_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_2() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_2")) lock.put("power_2", new Boolean(false));
			if (!(Boolean)lock.get("power_2")){
				lock.put("power_2", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_2");
					power_2= val;
			}
		return power_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_2(String newPower_2) {
		String oldPower_2 = power_2;
		power_2 = newPower_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__POWER_2, oldPower_2, power_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_12() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_12")) lock.put("power_12", new Boolean(false));
			if (!(Boolean)lock.get("power_12")){
				lock.put("power_12", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_12");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_12");
					power_12= val;
			}
		return power_12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_12(String newPower_12) {
		String oldPower_12 = power_12;
		power_12 = newPower_12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__POWER_12, oldPower_12, power_12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_1_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_1_real")) lock.put("power_1_real", new Boolean(false));
			if (!(Boolean)lock.get("power_1_real")){
				lock.put("power_1_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_1_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_1_real");
					power_1_real= val;
			}
		return power_1_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_1_real(String newPower_1_real) {
		String oldPower_1_real = power_1_real;
		power_1_real = newPower_1_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__POWER_1REAL, oldPower_1_real, power_1_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_2_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_2_real")) lock.put("power_2_real", new Boolean(false));
			if (!(Boolean)lock.get("power_2_real")){
				lock.put("power_2_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_2_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_2_real");
					power_2_real= val;
			}
		return power_2_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_2_real(String newPower_2_real) {
		String oldPower_2_real = power_2_real;
		power_2_real = newPower_2_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__POWER_2REAL, oldPower_2_real, power_2_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_12_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_12_real")) lock.put("power_12_real", new Boolean(false));
			if (!(Boolean)lock.get("power_12_real")){
				lock.put("power_12_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_12_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_12_real");
					power_12_real= val;
			}
		return power_12_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_12_real(String newPower_12_real) {
		String oldPower_12_real = power_12_real;
		power_12_real = newPower_12_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__POWER_12_REAL, oldPower_12_real, power_12_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_1_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_1_reac")) lock.put("power_1_reac", new Boolean(false));
			if (!(Boolean)lock.get("power_1_reac")){
				lock.put("power_1_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_1_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_1_reac");
					power_1_reac= val;
			}
		return power_1_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_1_reac(String newPower_1_reac) {
		String oldPower_1_reac = power_1_reac;
		power_1_reac = newPower_1_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__POWER_1REAC, oldPower_1_reac, power_1_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_2_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_2_reac")) lock.put("power_2_reac", new Boolean(false));
			if (!(Boolean)lock.get("power_2_reac")){
				lock.put("power_2_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_2_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_2_reac");
					power_2_reac= val;
			}
		return power_2_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_2_reac(String newPower_2_reac) {
		String oldPower_2_reac = power_2_reac;
		power_2_reac = newPower_2_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__POWER_2REAC, oldPower_2_reac, power_2_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_12_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_12_reac")) lock.put("power_12_reac", new Boolean(false));
			if (!(Boolean)lock.get("power_12_reac")){
				lock.put("power_12_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_12_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_12_reac");
					power_12_reac= val;
			}
		return power_12_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_12_reac(String newPower_12_reac) {
		String oldPower_12_reac = power_12_reac;
		power_12_reac = newPower_12_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__POWER_12_REAC, oldPower_12_reac, power_12_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_1() {
		// Generated by python script located in this directory
			if (!lock.containsKey("shunt_1")) lock.put("shunt_1", new Boolean(false));
			if (!(Boolean)lock.get("shunt_1")){
				lock.put("shunt_1", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"shunt_1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Shunt_1");
					shunt_1= val;
			}
		return shunt_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_1(String newShunt_1) {
		String oldShunt_1 = shunt_1;
		shunt_1 = newShunt_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__SHUNT_1, oldShunt_1, shunt_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_2() {
		// Generated by python script located in this directory
			if (!lock.containsKey("shunt_2")) lock.put("shunt_2", new Boolean(false));
			if (!(Boolean)lock.get("shunt_2")){
				lock.put("shunt_2", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"shunt_2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Shunt_2");
					shunt_2= val;
			}
		return shunt_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_2(String newShunt_2) {
		String oldShunt_2 = shunt_2;
		shunt_2 = newShunt_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__SHUNT_2, oldShunt_2, shunt_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_12() {
		// Generated by python script located in this directory
			if (!lock.containsKey("shunt_12")) lock.put("shunt_12", new Boolean(false));
			if (!(Boolean)lock.get("shunt_12")){
				lock.put("shunt_12", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"shunt_12");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Shunt_12");
					shunt_12= val;
			}
		return shunt_12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_12(String newShunt_12) {
		String oldShunt_12 = shunt_12;
		shunt_12 = newShunt_12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__SHUNT_12, oldShunt_12, shunt_12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_1() {
		// Generated by python script located in this directory
			if (!lock.containsKey("impedance_1")) lock.put("impedance_1", new Boolean(false));
			if (!(Boolean)lock.get("impedance_1")){
				lock.put("impedance_1", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"impedance_1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Impedance_1");
					impedance_1= val;
			}
		return impedance_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_1(String newImpedance_1) {
		String oldImpedance_1 = impedance_1;
		impedance_1 = newImpedance_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1, oldImpedance_1, impedance_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_2() {
		// Generated by python script located in this directory
			if (!lock.containsKey("impedance_2")) lock.put("impedance_2", new Boolean(false));
			if (!(Boolean)lock.get("impedance_2")){
				lock.put("impedance_2", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"impedance_2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Impedance_2");
					impedance_2= val;
			}
		return impedance_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_2(String newImpedance_2) {
		String oldImpedance_2 = impedance_2;
		impedance_2 = newImpedance_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2, oldImpedance_2, impedance_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_12() {
		// Generated by python script located in this directory
			if (!lock.containsKey("impedance_12")) lock.put("impedance_12", new Boolean(false));
			if (!(Boolean)lock.get("impedance_12")){
				lock.put("impedance_12", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"impedance_12");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Impedance_12");
					impedance_12= val;
			}
		return impedance_12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_12(String newImpedance_12) {
		String oldImpedance_12 = impedance_12;
		impedance_12 = newImpedance_12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12, oldImpedance_12, impedance_12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_1_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("impedance_1_real")) lock.put("impedance_1_real", new Boolean(false));
			if (!(Boolean)lock.get("impedance_1_real")){
				lock.put("impedance_1_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"impedance_1_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Impedance_1_real");
					impedance_1_real= val;
			}
		return impedance_1_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_1_real(String newImpedance_1_real) {
		String oldImpedance_1_real = impedance_1_real;
		impedance_1_real = newImpedance_1_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAL, oldImpedance_1_real, impedance_1_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_2_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("impedance_2_real")) lock.put("impedance_2_real", new Boolean(false));
			if (!(Boolean)lock.get("impedance_2_real")){
				lock.put("impedance_2_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"impedance_2_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Impedance_2_real");
					impedance_2_real= val;
			}
		return impedance_2_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_2_real(String newImpedance_2_real) {
		String oldImpedance_2_real = impedance_2_real;
		impedance_2_real = newImpedance_2_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAL, oldImpedance_2_real, impedance_2_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_12_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("impedance_12_real")) lock.put("impedance_12_real", new Boolean(false));
			if (!(Boolean)lock.get("impedance_12_real")){
				lock.put("impedance_12_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"impedance_12_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Impedance_12_real");
					impedance_12_real= val;
			}
		return impedance_12_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_12_real(String newImpedance_12_real) {
		String oldImpedance_12_real = impedance_12_real;
		impedance_12_real = newImpedance_12_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAL, oldImpedance_12_real, impedance_12_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_1_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("impedance_1_reac")) lock.put("impedance_1_reac", new Boolean(false));
			if (!(Boolean)lock.get("impedance_1_reac")){
				lock.put("impedance_1_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"impedance_1_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Impedance_1_reac");
					impedance_1_reac= val;
			}
		return impedance_1_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_1_reac(String newImpedance_1_reac) {
		String oldImpedance_1_reac = impedance_1_reac;
		impedance_1_reac = newImpedance_1_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAC, oldImpedance_1_reac, impedance_1_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_2_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("impedance_2_reac")) lock.put("impedance_2_reac", new Boolean(false));
			if (!(Boolean)lock.get("impedance_2_reac")){
				lock.put("impedance_2_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"impedance_2_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Impedance_2_reac");
					impedance_2_reac= val;
			}
		return impedance_2_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_2_reac(String newImpedance_2_reac) {
		String oldImpedance_2_reac = impedance_2_reac;
		impedance_2_reac = newImpedance_2_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAC, oldImpedance_2_reac, impedance_2_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_12_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("impedance_12_reac")) lock.put("impedance_12_reac", new Boolean(false));
			if (!(Boolean)lock.get("impedance_12_reac")){
				lock.put("impedance_12_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"impedance_12_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Impedance_12_reac");
					impedance_12_reac= val;
			}
		return impedance_12_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_12_reac(String newImpedance_12_reac) {
		String oldImpedance_12_reac = impedance_12_reac;
		impedance_12_reac = newImpedance_12_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAC, oldImpedance_12_reac, impedance_12_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouse_present() {
		// Generated by python script located in this directory
			if (!lock.containsKey("house_present")) lock.put("house_present", new Boolean(false));
			if (!(Boolean)lock.get("house_present")){
				lock.put("house_present", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"house_present");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"House_present");
					house_present= val;
			}
		return house_present;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouse_present(String newHouse_present) {
		String oldHouse_present = house_present;
		house_present = newHouse_present;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__HOUSE_PRESENT, oldHouse_present, house_present));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNR_mode() {
		// Generated by python script located in this directory
			if (!lock.containsKey("nR_mode")) lock.put("nR_mode", new Boolean(false));
			if (!(Boolean)lock.get("nR_mode")){
				lock.put("nR_mode", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"nR_mode");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"NR_mode");
					nR_mode= val;
			}
		return nR_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNR_mode(String newNR_mode) {
		String oldNR_mode = nR_mode;
		nR_mode = newNR_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__NR_MODE, oldNR_mode, nR_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhases() {
		// Generated by python script located in this directory
			if (!lock.containsKey("phases")) lock.put("phases", new Boolean(false));
			if (!(Boolean)lock.get("phases")){
				lock.put("phases", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"phases");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Phases");
					phases= val;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominal_voltage() {
		// Generated by python script located in this directory
			if (!lock.containsKey("nominal_voltage")) lock.put("nominal_voltage", new Boolean(false));
			if (!(Boolean)lock.get("nominal_voltage")){
				lock.put("nominal_voltage", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"nominal_voltage");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Nominal_voltage");
					nominal_voltage= val;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_NODE__NOMINAL_VOLTAGE, oldNominal_voltage, nominal_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.TRIPLEX_NODE__BUSTYPE:
				return getBustype();
			case VisGridPackage.TRIPLEX_NODE__BUSFLAGS:
				return getBusflags();
			case VisGridPackage.TRIPLEX_NODE__REFERENCE_BUS:
				return getReference_bus();
			case VisGridPackage.TRIPLEX_NODE__MAXIMUM_VOLTAGE_ERROR:
				return getMaximum_voltage_error();
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_1:
				return getVoltage_1();
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_2:
				return getVoltage_2();
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_N:
				return getVoltage_N();
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_12:
				return getVoltage_12();
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_1N:
				return getVoltage_1N();
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_2N:
				return getVoltage_2N();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1:
				return getCurrent_1();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2:
				return getCurrent_2();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_N:
				return getCurrent_N();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1REAL:
				return getCurrent_1_real();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2REAL:
				return getCurrent_2_real();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_NREAL:
				return getCurrent_N_real();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1REAC:
				return getCurrent_1_reac();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2REAC:
				return getCurrent_2_reac();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_NREAC:
				return getCurrent_N_reac();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12:
				return getCurrent_12();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAL:
				return getCurrent_12_real();
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAC:
				return getCurrent_12_reac();
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1:
				return getResidential_nominal_current_1();
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2:
				return getResidential_nominal_current_2();
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12:
				return getResidential_nominal_current_12();
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1REAL:
				return getResidential_nominal_current_1_real();
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1IMAG:
				return getResidential_nominal_current_1_imag();
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2REAL:
				return getResidential_nominal_current_2_real();
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2IMAG:
				return getResidential_nominal_current_2_imag();
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_REAL:
				return getResidential_nominal_current_12_real();
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG:
				return getResidential_nominal_current_12_imag();
			case VisGridPackage.TRIPLEX_NODE__POWER_1:
				return getPower_1();
			case VisGridPackage.TRIPLEX_NODE__POWER_2:
				return getPower_2();
			case VisGridPackage.TRIPLEX_NODE__POWER_12:
				return getPower_12();
			case VisGridPackage.TRIPLEX_NODE__POWER_1REAL:
				return getPower_1_real();
			case VisGridPackage.TRIPLEX_NODE__POWER_2REAL:
				return getPower_2_real();
			case VisGridPackage.TRIPLEX_NODE__POWER_12_REAL:
				return getPower_12_real();
			case VisGridPackage.TRIPLEX_NODE__POWER_1REAC:
				return getPower_1_reac();
			case VisGridPackage.TRIPLEX_NODE__POWER_2REAC:
				return getPower_2_reac();
			case VisGridPackage.TRIPLEX_NODE__POWER_12_REAC:
				return getPower_12_reac();
			case VisGridPackage.TRIPLEX_NODE__SHUNT_1:
				return getShunt_1();
			case VisGridPackage.TRIPLEX_NODE__SHUNT_2:
				return getShunt_2();
			case VisGridPackage.TRIPLEX_NODE__SHUNT_12:
				return getShunt_12();
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1:
				return getImpedance_1();
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2:
				return getImpedance_2();
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12:
				return getImpedance_12();
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAL:
				return getImpedance_1_real();
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAL:
				return getImpedance_2_real();
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAL:
				return getImpedance_12_real();
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAC:
				return getImpedance_1_reac();
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAC:
				return getImpedance_2_reac();
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAC:
				return getImpedance_12_reac();
			case VisGridPackage.TRIPLEX_NODE__HOUSE_PRESENT:
				return getHouse_present();
			case VisGridPackage.TRIPLEX_NODE__NR_MODE:
				return getNR_mode();
			case VisGridPackage.TRIPLEX_NODE__PHASES:
				return getPhases();
			case VisGridPackage.TRIPLEX_NODE__NOMINAL_VOLTAGE:
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
			case VisGridPackage.TRIPLEX_NODE__BUSTYPE:
				setBustype((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__BUSFLAGS:
				setBusflags((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__REFERENCE_BUS:
				setReference_bus((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_1:
				setVoltage_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_2:
				setVoltage_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_N:
				setVoltage_N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_12:
				setVoltage_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_1N:
				setVoltage_1N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_2N:
				setVoltage_2N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1:
				setCurrent_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2:
				setCurrent_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_N:
				setCurrent_N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1REAL:
				setCurrent_1_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2REAL:
				setCurrent_2_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_NREAL:
				setCurrent_N_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1REAC:
				setCurrent_1_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2REAC:
				setCurrent_2_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_NREAC:
				setCurrent_N_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12:
				setCurrent_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAL:
				setCurrent_12_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAC:
				setCurrent_12_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1:
				setResidential_nominal_current_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2:
				setResidential_nominal_current_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12:
				setResidential_nominal_current_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1REAL:
				setResidential_nominal_current_1_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1IMAG:
				setResidential_nominal_current_1_imag((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2REAL:
				setResidential_nominal_current_2_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2IMAG:
				setResidential_nominal_current_2_imag((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_REAL:
				setResidential_nominal_current_12_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG:
				setResidential_nominal_current_12_imag((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_1:
				setPower_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_2:
				setPower_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_12:
				setPower_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_1REAL:
				setPower_1_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_2REAL:
				setPower_2_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_12_REAL:
				setPower_12_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_1REAC:
				setPower_1_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_2REAC:
				setPower_2_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_12_REAC:
				setPower_12_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__SHUNT_1:
				setShunt_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__SHUNT_2:
				setShunt_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__SHUNT_12:
				setShunt_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1:
				setImpedance_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2:
				setImpedance_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12:
				setImpedance_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAL:
				setImpedance_1_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAL:
				setImpedance_2_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAL:
				setImpedance_12_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAC:
				setImpedance_1_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAC:
				setImpedance_2_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAC:
				setImpedance_12_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__HOUSE_PRESENT:
				setHouse_present((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__NR_MODE:
				setNR_mode((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__PHASES:
				setPhases((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_NODE__NOMINAL_VOLTAGE:
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
			case VisGridPackage.TRIPLEX_NODE__BUSTYPE:
				setBustype(BUSTYPE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__BUSFLAGS:
				setBusflags(BUSFLAGS_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__REFERENCE_BUS:
				setReference_bus(REFERENCE_BUS_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error(MAXIMUM_VOLTAGE_ERROR_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_1:
				setVoltage_1(VOLTAGE_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_2:
				setVoltage_2(VOLTAGE_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_N:
				setVoltage_N(VOLTAGE_N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_12:
				setVoltage_12(VOLTAGE_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_1N:
				setVoltage_1N(VOLTAGE_1N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_2N:
				setVoltage_2N(VOLTAGE_2N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1:
				setCurrent_1(CURRENT_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2:
				setCurrent_2(CURRENT_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_N:
				setCurrent_N(CURRENT_N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1REAL:
				setCurrent_1_real(CURRENT_1REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2REAL:
				setCurrent_2_real(CURRENT_2REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_NREAL:
				setCurrent_N_real(CURRENT_NREAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1REAC:
				setCurrent_1_reac(CURRENT_1REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2REAC:
				setCurrent_2_reac(CURRENT_2REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_NREAC:
				setCurrent_N_reac(CURRENT_NREAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12:
				setCurrent_12(CURRENT_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAL:
				setCurrent_12_real(CURRENT_12_REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAC:
				setCurrent_12_reac(CURRENT_12_REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1:
				setResidential_nominal_current_1(RESIDENTIAL_NOMINAL_CURRENT_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2:
				setResidential_nominal_current_2(RESIDENTIAL_NOMINAL_CURRENT_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12:
				setResidential_nominal_current_12(RESIDENTIAL_NOMINAL_CURRENT_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1REAL:
				setResidential_nominal_current_1_real(RESIDENTIAL_NOMINAL_CURRENT_1REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1IMAG:
				setResidential_nominal_current_1_imag(RESIDENTIAL_NOMINAL_CURRENT_1IMAG_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2REAL:
				setResidential_nominal_current_2_real(RESIDENTIAL_NOMINAL_CURRENT_2REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2IMAG:
				setResidential_nominal_current_2_imag(RESIDENTIAL_NOMINAL_CURRENT_2IMAG_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_REAL:
				setResidential_nominal_current_12_real(RESIDENTIAL_NOMINAL_CURRENT_12_REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG:
				setResidential_nominal_current_12_imag(RESIDENTIAL_NOMINAL_CURRENT_12_IMAG_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_1:
				setPower_1(POWER_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_2:
				setPower_2(POWER_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_12:
				setPower_12(POWER_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_1REAL:
				setPower_1_real(POWER_1REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_2REAL:
				setPower_2_real(POWER_2REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_12_REAL:
				setPower_12_real(POWER_12_REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_1REAC:
				setPower_1_reac(POWER_1REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_2REAC:
				setPower_2_reac(POWER_2REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__POWER_12_REAC:
				setPower_12_reac(POWER_12_REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__SHUNT_1:
				setShunt_1(SHUNT_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__SHUNT_2:
				setShunt_2(SHUNT_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__SHUNT_12:
				setShunt_12(SHUNT_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1:
				setImpedance_1(IMPEDANCE_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2:
				setImpedance_2(IMPEDANCE_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12:
				setImpedance_12(IMPEDANCE_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAL:
				setImpedance_1_real(IMPEDANCE_1REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAL:
				setImpedance_2_real(IMPEDANCE_2REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAL:
				setImpedance_12_real(IMPEDANCE_12_REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAC:
				setImpedance_1_reac(IMPEDANCE_1REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAC:
				setImpedance_2_reac(IMPEDANCE_2REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAC:
				setImpedance_12_reac(IMPEDANCE_12_REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__HOUSE_PRESENT:
				setHouse_present(HOUSE_PRESENT_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__NR_MODE:
				setNR_mode(NR_MODE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_NODE__NOMINAL_VOLTAGE:
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
			case VisGridPackage.TRIPLEX_NODE__BUSTYPE:
				return BUSTYPE_EDEFAULT == null ? bustype != null : !BUSTYPE_EDEFAULT.equals(bustype);
			case VisGridPackage.TRIPLEX_NODE__BUSFLAGS:
				return BUSFLAGS_EDEFAULT == null ? busflags != null : !BUSFLAGS_EDEFAULT.equals(busflags);
			case VisGridPackage.TRIPLEX_NODE__REFERENCE_BUS:
				return REFERENCE_BUS_EDEFAULT == null ? reference_bus != null : !REFERENCE_BUS_EDEFAULT.equals(reference_bus);
			case VisGridPackage.TRIPLEX_NODE__MAXIMUM_VOLTAGE_ERROR:
				return MAXIMUM_VOLTAGE_ERROR_EDEFAULT == null ? maximum_voltage_error != null : !MAXIMUM_VOLTAGE_ERROR_EDEFAULT.equals(maximum_voltage_error);
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_1:
				return VOLTAGE_1_EDEFAULT == null ? voltage_1 != null : !VOLTAGE_1_EDEFAULT.equals(voltage_1);
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_2:
				return VOLTAGE_2_EDEFAULT == null ? voltage_2 != null : !VOLTAGE_2_EDEFAULT.equals(voltage_2);
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_N:
				return VOLTAGE_N_EDEFAULT == null ? voltage_N != null : !VOLTAGE_N_EDEFAULT.equals(voltage_N);
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_12:
				return VOLTAGE_12_EDEFAULT == null ? voltage_12 != null : !VOLTAGE_12_EDEFAULT.equals(voltage_12);
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_1N:
				return VOLTAGE_1N_EDEFAULT == null ? voltage_1N != null : !VOLTAGE_1N_EDEFAULT.equals(voltage_1N);
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_2N:
				return VOLTAGE_2N_EDEFAULT == null ? voltage_2N != null : !VOLTAGE_2N_EDEFAULT.equals(voltage_2N);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1:
				return CURRENT_1_EDEFAULT == null ? current_1 != null : !CURRENT_1_EDEFAULT.equals(current_1);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2:
				return CURRENT_2_EDEFAULT == null ? current_2 != null : !CURRENT_2_EDEFAULT.equals(current_2);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_N:
				return CURRENT_N_EDEFAULT == null ? current_N != null : !CURRENT_N_EDEFAULT.equals(current_N);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1REAL:
				return CURRENT_1REAL_EDEFAULT == null ? current_1_real != null : !CURRENT_1REAL_EDEFAULT.equals(current_1_real);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2REAL:
				return CURRENT_2REAL_EDEFAULT == null ? current_2_real != null : !CURRENT_2REAL_EDEFAULT.equals(current_2_real);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_NREAL:
				return CURRENT_NREAL_EDEFAULT == null ? current_N_real != null : !CURRENT_NREAL_EDEFAULT.equals(current_N_real);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1REAC:
				return CURRENT_1REAC_EDEFAULT == null ? current_1_reac != null : !CURRENT_1REAC_EDEFAULT.equals(current_1_reac);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2REAC:
				return CURRENT_2REAC_EDEFAULT == null ? current_2_reac != null : !CURRENT_2REAC_EDEFAULT.equals(current_2_reac);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_NREAC:
				return CURRENT_NREAC_EDEFAULT == null ? current_N_reac != null : !CURRENT_NREAC_EDEFAULT.equals(current_N_reac);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12:
				return CURRENT_12_EDEFAULT == null ? current_12 != null : !CURRENT_12_EDEFAULT.equals(current_12);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAL:
				return CURRENT_12_REAL_EDEFAULT == null ? current_12_real != null : !CURRENT_12_REAL_EDEFAULT.equals(current_12_real);
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAC:
				return CURRENT_12_REAC_EDEFAULT == null ? current_12_reac != null : !CURRENT_12_REAC_EDEFAULT.equals(current_12_reac);
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1:
				return RESIDENTIAL_NOMINAL_CURRENT_1_EDEFAULT == null ? residential_nominal_current_1 != null : !RESIDENTIAL_NOMINAL_CURRENT_1_EDEFAULT.equals(residential_nominal_current_1);
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2:
				return RESIDENTIAL_NOMINAL_CURRENT_2_EDEFAULT == null ? residential_nominal_current_2 != null : !RESIDENTIAL_NOMINAL_CURRENT_2_EDEFAULT.equals(residential_nominal_current_2);
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12:
				return RESIDENTIAL_NOMINAL_CURRENT_12_EDEFAULT == null ? residential_nominal_current_12 != null : !RESIDENTIAL_NOMINAL_CURRENT_12_EDEFAULT.equals(residential_nominal_current_12);
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1REAL:
				return RESIDENTIAL_NOMINAL_CURRENT_1REAL_EDEFAULT == null ? residential_nominal_current_1_real != null : !RESIDENTIAL_NOMINAL_CURRENT_1REAL_EDEFAULT.equals(residential_nominal_current_1_real);
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1IMAG:
				return RESIDENTIAL_NOMINAL_CURRENT_1IMAG_EDEFAULT == null ? residential_nominal_current_1_imag != null : !RESIDENTIAL_NOMINAL_CURRENT_1IMAG_EDEFAULT.equals(residential_nominal_current_1_imag);
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2REAL:
				return RESIDENTIAL_NOMINAL_CURRENT_2REAL_EDEFAULT == null ? residential_nominal_current_2_real != null : !RESIDENTIAL_NOMINAL_CURRENT_2REAL_EDEFAULT.equals(residential_nominal_current_2_real);
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2IMAG:
				return RESIDENTIAL_NOMINAL_CURRENT_2IMAG_EDEFAULT == null ? residential_nominal_current_2_imag != null : !RESIDENTIAL_NOMINAL_CURRENT_2IMAG_EDEFAULT.equals(residential_nominal_current_2_imag);
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_REAL:
				return RESIDENTIAL_NOMINAL_CURRENT_12_REAL_EDEFAULT == null ? residential_nominal_current_12_real != null : !RESIDENTIAL_NOMINAL_CURRENT_12_REAL_EDEFAULT.equals(residential_nominal_current_12_real);
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG:
				return RESIDENTIAL_NOMINAL_CURRENT_12_IMAG_EDEFAULT == null ? residential_nominal_current_12_imag != null : !RESIDENTIAL_NOMINAL_CURRENT_12_IMAG_EDEFAULT.equals(residential_nominal_current_12_imag);
			case VisGridPackage.TRIPLEX_NODE__POWER_1:
				return POWER_1_EDEFAULT == null ? power_1 != null : !POWER_1_EDEFAULT.equals(power_1);
			case VisGridPackage.TRIPLEX_NODE__POWER_2:
				return POWER_2_EDEFAULT == null ? power_2 != null : !POWER_2_EDEFAULT.equals(power_2);
			case VisGridPackage.TRIPLEX_NODE__POWER_12:
				return POWER_12_EDEFAULT == null ? power_12 != null : !POWER_12_EDEFAULT.equals(power_12);
			case VisGridPackage.TRIPLEX_NODE__POWER_1REAL:
				return POWER_1REAL_EDEFAULT == null ? power_1_real != null : !POWER_1REAL_EDEFAULT.equals(power_1_real);
			case VisGridPackage.TRIPLEX_NODE__POWER_2REAL:
				return POWER_2REAL_EDEFAULT == null ? power_2_real != null : !POWER_2REAL_EDEFAULT.equals(power_2_real);
			case VisGridPackage.TRIPLEX_NODE__POWER_12_REAL:
				return POWER_12_REAL_EDEFAULT == null ? power_12_real != null : !POWER_12_REAL_EDEFAULT.equals(power_12_real);
			case VisGridPackage.TRIPLEX_NODE__POWER_1REAC:
				return POWER_1REAC_EDEFAULT == null ? power_1_reac != null : !POWER_1REAC_EDEFAULT.equals(power_1_reac);
			case VisGridPackage.TRIPLEX_NODE__POWER_2REAC:
				return POWER_2REAC_EDEFAULT == null ? power_2_reac != null : !POWER_2REAC_EDEFAULT.equals(power_2_reac);
			case VisGridPackage.TRIPLEX_NODE__POWER_12_REAC:
				return POWER_12_REAC_EDEFAULT == null ? power_12_reac != null : !POWER_12_REAC_EDEFAULT.equals(power_12_reac);
			case VisGridPackage.TRIPLEX_NODE__SHUNT_1:
				return SHUNT_1_EDEFAULT == null ? shunt_1 != null : !SHUNT_1_EDEFAULT.equals(shunt_1);
			case VisGridPackage.TRIPLEX_NODE__SHUNT_2:
				return SHUNT_2_EDEFAULT == null ? shunt_2 != null : !SHUNT_2_EDEFAULT.equals(shunt_2);
			case VisGridPackage.TRIPLEX_NODE__SHUNT_12:
				return SHUNT_12_EDEFAULT == null ? shunt_12 != null : !SHUNT_12_EDEFAULT.equals(shunt_12);
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1:
				return IMPEDANCE_1_EDEFAULT == null ? impedance_1 != null : !IMPEDANCE_1_EDEFAULT.equals(impedance_1);
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2:
				return IMPEDANCE_2_EDEFAULT == null ? impedance_2 != null : !IMPEDANCE_2_EDEFAULT.equals(impedance_2);
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12:
				return IMPEDANCE_12_EDEFAULT == null ? impedance_12 != null : !IMPEDANCE_12_EDEFAULT.equals(impedance_12);
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAL:
				return IMPEDANCE_1REAL_EDEFAULT == null ? impedance_1_real != null : !IMPEDANCE_1REAL_EDEFAULT.equals(impedance_1_real);
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAL:
				return IMPEDANCE_2REAL_EDEFAULT == null ? impedance_2_real != null : !IMPEDANCE_2REAL_EDEFAULT.equals(impedance_2_real);
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAL:
				return IMPEDANCE_12_REAL_EDEFAULT == null ? impedance_12_real != null : !IMPEDANCE_12_REAL_EDEFAULT.equals(impedance_12_real);
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAC:
				return IMPEDANCE_1REAC_EDEFAULT == null ? impedance_1_reac != null : !IMPEDANCE_1REAC_EDEFAULT.equals(impedance_1_reac);
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAC:
				return IMPEDANCE_2REAC_EDEFAULT == null ? impedance_2_reac != null : !IMPEDANCE_2REAC_EDEFAULT.equals(impedance_2_reac);
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAC:
				return IMPEDANCE_12_REAC_EDEFAULT == null ? impedance_12_reac != null : !IMPEDANCE_12_REAC_EDEFAULT.equals(impedance_12_reac);
			case VisGridPackage.TRIPLEX_NODE__HOUSE_PRESENT:
				return HOUSE_PRESENT_EDEFAULT == null ? house_present != null : !HOUSE_PRESENT_EDEFAULT.equals(house_present);
			case VisGridPackage.TRIPLEX_NODE__NR_MODE:
				return NR_MODE_EDEFAULT == null ? nR_mode != null : !NR_MODE_EDEFAULT.equals(nR_mode);
			case VisGridPackage.TRIPLEX_NODE__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case VisGridPackage.TRIPLEX_NODE__NOMINAL_VOLTAGE:
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
		result.append(" (bustype: ");
		result.append(bustype);
		result.append(", busflags: ");
		result.append(busflags);
		result.append(", reference_bus: ");
		result.append(reference_bus);
		result.append(", maximum_voltage_error: ");
		result.append(maximum_voltage_error);
		result.append(", voltage_1: ");
		result.append(voltage_1);
		result.append(", voltage_2: ");
		result.append(voltage_2);
		result.append(", voltage_N: ");
		result.append(voltage_N);
		result.append(", voltage_12: ");
		result.append(voltage_12);
		result.append(", voltage_1N: ");
		result.append(voltage_1N);
		result.append(", voltage_2N: ");
		result.append(voltage_2N);
		result.append(", current_1: ");
		result.append(current_1);
		result.append(", current_2: ");
		result.append(current_2);
		result.append(", current_N: ");
		result.append(current_N);
		result.append(", current_1_real: ");
		result.append(current_1_real);
		result.append(", current_2_real: ");
		result.append(current_2_real);
		result.append(", current_N_real: ");
		result.append(current_N_real);
		result.append(", current_1_reac: ");
		result.append(current_1_reac);
		result.append(", current_2_reac: ");
		result.append(current_2_reac);
		result.append(", current_N_reac: ");
		result.append(current_N_reac);
		result.append(", current_12: ");
		result.append(current_12);
		result.append(", current_12_real: ");
		result.append(current_12_real);
		result.append(", current_12_reac: ");
		result.append(current_12_reac);
		result.append(", residential_nominal_current_1: ");
		result.append(residential_nominal_current_1);
		result.append(", residential_nominal_current_2: ");
		result.append(residential_nominal_current_2);
		result.append(", residential_nominal_current_12: ");
		result.append(residential_nominal_current_12);
		result.append(", residential_nominal_current_1_real: ");
		result.append(residential_nominal_current_1_real);
		result.append(", residential_nominal_current_1_imag: ");
		result.append(residential_nominal_current_1_imag);
		result.append(", residential_nominal_current_2_real: ");
		result.append(residential_nominal_current_2_real);
		result.append(", residential_nominal_current_2_imag: ");
		result.append(residential_nominal_current_2_imag);
		result.append(", residential_nominal_current_12_real: ");
		result.append(residential_nominal_current_12_real);
		result.append(", residential_nominal_current_12_imag: ");
		result.append(residential_nominal_current_12_imag);
		result.append(", power_1: ");
		result.append(power_1);
		result.append(", power_2: ");
		result.append(power_2);
		result.append(", power_12: ");
		result.append(power_12);
		result.append(", power_1_real: ");
		result.append(power_1_real);
		result.append(", power_2_real: ");
		result.append(power_2_real);
		result.append(", power_12_real: ");
		result.append(power_12_real);
		result.append(", power_1_reac: ");
		result.append(power_1_reac);
		result.append(", power_2_reac: ");
		result.append(power_2_reac);
		result.append(", power_12_reac: ");
		result.append(power_12_reac);
		result.append(", shunt_1: ");
		result.append(shunt_1);
		result.append(", shunt_2: ");
		result.append(shunt_2);
		result.append(", shunt_12: ");
		result.append(shunt_12);
		result.append(", impedance_1: ");
		result.append(impedance_1);
		result.append(", impedance_2: ");
		result.append(impedance_2);
		result.append(", impedance_12: ");
		result.append(impedance_12);
		result.append(", impedance_1_real: ");
		result.append(impedance_1_real);
		result.append(", impedance_2_real: ");
		result.append(impedance_2_real);
		result.append(", impedance_12_real: ");
		result.append(impedance_12_real);
		result.append(", impedance_1_reac: ");
		result.append(impedance_1_reac);
		result.append(", impedance_2_reac: ");
		result.append(impedance_2_reac);
		result.append(", impedance_12_reac: ");
		result.append(impedance_12_reac);
		result.append(", house_present: ");
		result.append(house_present);
		result.append(", NR_mode: ");
		result.append(nR_mode);
		result.append(", phases: ");
		result.append(phases);
		result.append(", nominal_voltage: ");
		result.append(nominal_voltage);
		result.append(')');
		return result.toString();
	}

} //Triplex_nodeImpl
