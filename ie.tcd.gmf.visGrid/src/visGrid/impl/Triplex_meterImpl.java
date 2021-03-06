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

import visGrid.Triplex_meter;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triplex meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_real_energy <em>Measured real energy</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_reactive_energy <em>Measured reactive energy</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_power <em>Measured power</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getIndiv_measured_power_1 <em>Indiv measured power 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getIndiv_measured_power_2 <em>Indiv measured power 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getIndiv_measured_power_N <em>Indiv measured power N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_demand <em>Measured demand</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_real_power <em>Measured real power</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_reactive_power <em>Measured reactive power</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_voltage_1 <em>Measured voltage 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_voltage_2 <em>Measured voltage 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_voltage_N <em>Measured voltage N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_current_1 <em>Measured current 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_current_2 <em>Measured current 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMeasured_current_N <em>Measured current N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMonthly_bill <em>Monthly bill</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPrevious_monthly_bill <em>Previous monthly bill</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPrevious_monthly_energy <em>Previous monthly energy</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMonthly_fee <em>Monthly fee</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMonthly_energy <em>Monthly energy</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getBill_mode <em>Bill mode</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPower_market <em>Power market</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getBill_day <em>Bill day</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getFirst_tier_price <em>First tier price</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getFirst_tier_energy <em>First tier energy</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getSecond_tier_price <em>Second tier price</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getSecond_tier_energy <em>Second tier energy</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getThird_tier_price <em>Third tier price</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getThird_tier_energy <em>Third tier energy</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getVoltage_1 <em>Voltage 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getVoltage_2 <em>Voltage 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getVoltage_N <em>Voltage N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getVoltage_12 <em>Voltage 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getVoltage_1N <em>Voltage 1N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getVoltage_2N <em>Voltage 2N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_1 <em>Current 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_2 <em>Current 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_N <em>Current N</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_1_real <em>Current 1real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_2_real <em>Current 2real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_N_real <em>Current Nreal</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_1_reac <em>Current 1reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_2_reac <em>Current 2reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_N_reac <em>Current Nreac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_12 <em>Current 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_12_real <em>Current 12 real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getCurrent_12_reac <em>Current 12 reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getResidential_nominal_current_1 <em>Residential nominal current 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getResidential_nominal_current_2 <em>Residential nominal current 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getResidential_nominal_current_12 <em>Residential nominal current 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getResidential_nominal_current_1_real <em>Residential nominal current 1real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getResidential_nominal_current_1_imag <em>Residential nominal current 1imag</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getResidential_nominal_current_2_real <em>Residential nominal current 2real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getResidential_nominal_current_2_imag <em>Residential nominal current 2imag</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getResidential_nominal_current_12_real <em>Residential nominal current 12 real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getResidential_nominal_current_12_imag <em>Residential nominal current 12 imag</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPower_1 <em>Power 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPower_2 <em>Power 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPower_12 <em>Power 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPower_1_real <em>Power 1real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPower_2_real <em>Power 2real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPower_12_real <em>Power 12 real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPower_1_reac <em>Power 1reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPower_2_reac <em>Power 2reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPower_12_reac <em>Power 12 reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getShunt_1 <em>Shunt 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getShunt_2 <em>Shunt 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getShunt_12 <em>Shunt 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getImpedance_1 <em>Impedance 1</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getImpedance_2 <em>Impedance 2</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getImpedance_12 <em>Impedance 12</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getImpedance_1_real <em>Impedance 1real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getImpedance_2_real <em>Impedance 2real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getImpedance_12_real <em>Impedance 12 real</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getImpedance_1_reac <em>Impedance 1reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getImpedance_2_reac <em>Impedance 2reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getImpedance_12_reac <em>Impedance 12 reac</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getHouse_present <em>House present</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getNR_mode <em>NR mode</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_meterImpl#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Triplex_meterImpl extends ConnectionImpl implements Triplex_meter {
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
	 * The default value of the '{@link #getMeasured_real_energy() <em>Measured real energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_real_energy()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_REAL_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_real_energy() <em>Measured real energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_real_energy()
	 * @generated
	 * @ordered
	 */
	protected String measured_real_energy = MEASURED_REAL_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_reactive_energy() <em>Measured reactive energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_reactive_energy()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_REACTIVE_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_reactive_energy() <em>Measured reactive energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_reactive_energy()
	 * @generated
	 * @ordered
	 */
	protected String measured_reactive_energy = MEASURED_REACTIVE_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_power() <em>Measured power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_power()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_power() <em>Measured power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_power()
	 * @generated
	 * @ordered
	 */
	protected String measured_power = MEASURED_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndiv_measured_power_1() <em>Indiv measured power 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiv_measured_power_1()
	 * @generated
	 * @ordered
	 */
	protected static final String INDIV_MEASURED_POWER_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndiv_measured_power_1() <em>Indiv measured power 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiv_measured_power_1()
	 * @generated
	 * @ordered
	 */
	protected String indiv_measured_power_1 = INDIV_MEASURED_POWER_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndiv_measured_power_2() <em>Indiv measured power 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiv_measured_power_2()
	 * @generated
	 * @ordered
	 */
	protected static final String INDIV_MEASURED_POWER_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndiv_measured_power_2() <em>Indiv measured power 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiv_measured_power_2()
	 * @generated
	 * @ordered
	 */
	protected String indiv_measured_power_2 = INDIV_MEASURED_POWER_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndiv_measured_power_N() <em>Indiv measured power N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiv_measured_power_N()
	 * @generated
	 * @ordered
	 */
	protected static final String INDIV_MEASURED_POWER_N_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndiv_measured_power_N() <em>Indiv measured power N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiv_measured_power_N()
	 * @generated
	 * @ordered
	 */
	protected String indiv_measured_power_N = INDIV_MEASURED_POWER_N_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_demand() <em>Measured demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_demand()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_demand() <em>Measured demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_demand()
	 * @generated
	 * @ordered
	 */
	protected String measured_demand = MEASURED_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_real_power() <em>Measured real power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_real_power()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_REAL_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_real_power() <em>Measured real power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_real_power()
	 * @generated
	 * @ordered
	 */
	protected String measured_real_power = MEASURED_REAL_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_reactive_power() <em>Measured reactive power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_reactive_power()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_REACTIVE_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_reactive_power() <em>Measured reactive power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_reactive_power()
	 * @generated
	 * @ordered
	 */
	protected String measured_reactive_power = MEASURED_REACTIVE_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_voltage_1() <em>Measured voltage 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_1()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_VOLTAGE_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_voltage_1() <em>Measured voltage 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_1()
	 * @generated
	 * @ordered
	 */
	protected String measured_voltage_1 = MEASURED_VOLTAGE_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_voltage_2() <em>Measured voltage 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_2()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_VOLTAGE_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_voltage_2() <em>Measured voltage 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_2()
	 * @generated
	 * @ordered
	 */
	protected String measured_voltage_2 = MEASURED_VOLTAGE_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_voltage_N() <em>Measured voltage N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_N()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_VOLTAGE_N_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_voltage_N() <em>Measured voltage N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_N()
	 * @generated
	 * @ordered
	 */
	protected String measured_voltage_N = MEASURED_VOLTAGE_N_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_current_1() <em>Measured current 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_current_1()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_CURRENT_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_current_1() <em>Measured current 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_current_1()
	 * @generated
	 * @ordered
	 */
	protected String measured_current_1 = MEASURED_CURRENT_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_current_2() <em>Measured current 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_current_2()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_CURRENT_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_current_2() <em>Measured current 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_current_2()
	 * @generated
	 * @ordered
	 */
	protected String measured_current_2 = MEASURED_CURRENT_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_current_N() <em>Measured current N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_current_N()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_CURRENT_N_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_current_N() <em>Measured current N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_current_N()
	 * @generated
	 * @ordered
	 */
	protected String measured_current_N = MEASURED_CURRENT_N_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonthly_bill() <em>Monthly bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthly_bill()
	 * @generated
	 * @ordered
	 */
	protected static final String MONTHLY_BILL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonthly_bill() <em>Monthly bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthly_bill()
	 * @generated
	 * @ordered
	 */
	protected String monthly_bill = MONTHLY_BILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrevious_monthly_bill() <em>Previous monthly bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious_monthly_bill()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_MONTHLY_BILL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrevious_monthly_bill() <em>Previous monthly bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious_monthly_bill()
	 * @generated
	 * @ordered
	 */
	protected String previous_monthly_bill = PREVIOUS_MONTHLY_BILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrevious_monthly_energy() <em>Previous monthly energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious_monthly_energy()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_MONTHLY_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrevious_monthly_energy() <em>Previous monthly energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious_monthly_energy()
	 * @generated
	 * @ordered
	 */
	protected String previous_monthly_energy = PREVIOUS_MONTHLY_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonthly_fee() <em>Monthly fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthly_fee()
	 * @generated
	 * @ordered
	 */
	protected static final String MONTHLY_FEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonthly_fee() <em>Monthly fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthly_fee()
	 * @generated
	 * @ordered
	 */
	protected String monthly_fee = MONTHLY_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonthly_energy() <em>Monthly energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthly_energy()
	 * @generated
	 * @ordered
	 */
	protected static final String MONTHLY_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonthly_energy() <em>Monthly energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthly_energy()
	 * @generated
	 * @ordered
	 */
	protected String monthly_energy = MONTHLY_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBill_mode() <em>Bill mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBill_mode() <em>Bill mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill_mode()
	 * @generated
	 * @ordered
	 */
	protected String bill_mode = BILL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_market() <em>Power market</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_market()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_MARKET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_market() <em>Power market</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_market()
	 * @generated
	 * @ordered
	 */
	protected String power_market = POWER_MARKET_EDEFAULT;

	/**
	 * The default value of the '{@link #getBill_day() <em>Bill day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill_day()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBill_day() <em>Bill day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill_day()
	 * @generated
	 * @ordered
	 */
	protected String bill_day = BILL_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final String PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected String price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirst_tier_price() <em>First tier price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_tier_price()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_TIER_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirst_tier_price() <em>First tier price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_tier_price()
	 * @generated
	 * @ordered
	 */
	protected String first_tier_price = FIRST_TIER_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirst_tier_energy() <em>First tier energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_tier_energy()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_TIER_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirst_tier_energy() <em>First tier energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_tier_energy()
	 * @generated
	 * @ordered
	 */
	protected String first_tier_energy = FIRST_TIER_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond_tier_price() <em>Second tier price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond_tier_price()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_TIER_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecond_tier_price() <em>Second tier price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond_tier_price()
	 * @generated
	 * @ordered
	 */
	protected String second_tier_price = SECOND_TIER_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond_tier_energy() <em>Second tier energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond_tier_energy()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_TIER_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecond_tier_energy() <em>Second tier energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond_tier_energy()
	 * @generated
	 * @ordered
	 */
	protected String second_tier_energy = SECOND_TIER_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThird_tier_price() <em>Third tier price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThird_tier_price()
	 * @generated
	 * @ordered
	 */
	protected static final String THIRD_TIER_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThird_tier_price() <em>Third tier price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThird_tier_price()
	 * @generated
	 * @ordered
	 */
	protected String third_tier_price = THIRD_TIER_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThird_tier_energy() <em>Third tier energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThird_tier_energy()
	 * @generated
	 * @ordered
	 */
	protected static final String THIRD_TIER_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThird_tier_energy() <em>Third tier energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThird_tier_energy()
	 * @generated
	 * @ordered
	 */
	protected String third_tier_energy = THIRD_TIER_ENERGY_EDEFAULT;

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
	protected Triplex_meterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getTriplex_meter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_real_energy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_real_energy")) lock.put("measured_real_energy", new Boolean(false));
			if (!(Boolean)lock.get("measured_real_energy")){
				lock.put("measured_real_energy", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_real_energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_real_energy");
					measured_real_energy= val;
			}
		return measured_real_energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_real_energy(String newMeasured_real_energy) {
		String oldMeasured_real_energy = measured_real_energy;
		measured_real_energy = newMeasured_real_energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_REAL_ENERGY, oldMeasured_real_energy, measured_real_energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_reactive_energy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_reactive_energy")) lock.put("measured_reactive_energy", new Boolean(false));
			if (!(Boolean)lock.get("measured_reactive_energy")){
				lock.put("measured_reactive_energy", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_reactive_energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_reactive_energy");
					measured_reactive_energy= val;
			}
		return measured_reactive_energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_reactive_energy(String newMeasured_reactive_energy) {
		String oldMeasured_reactive_energy = measured_reactive_energy;
		measured_reactive_energy = newMeasured_reactive_energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_ENERGY, oldMeasured_reactive_energy, measured_reactive_energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_power() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_power")) lock.put("measured_power", new Boolean(false));
			if (!(Boolean)lock.get("measured_power")){
				lock.put("measured_power", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_power");
					measured_power= val;
			}
		return measured_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_power(String newMeasured_power) {
		String oldMeasured_power = measured_power;
		measured_power = newMeasured_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_POWER, oldMeasured_power, measured_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndiv_measured_power_1() {
		// Generated by python script located in this directory
			if (!lock.containsKey("indiv_measured_power_1")) lock.put("indiv_measured_power_1", new Boolean(false));
			if (!(Boolean)lock.get("indiv_measured_power_1")){
				lock.put("indiv_measured_power_1", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"indiv_measured_power_1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Indiv_measured_power_1");
					indiv_measured_power_1= val;
			}
		return indiv_measured_power_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndiv_measured_power_1(String newIndiv_measured_power_1) {
		String oldIndiv_measured_power_1 = indiv_measured_power_1;
		indiv_measured_power_1 = newIndiv_measured_power_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_1, oldIndiv_measured_power_1, indiv_measured_power_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndiv_measured_power_2() {
		// Generated by python script located in this directory
			if (!lock.containsKey("indiv_measured_power_2")) lock.put("indiv_measured_power_2", new Boolean(false));
			if (!(Boolean)lock.get("indiv_measured_power_2")){
				lock.put("indiv_measured_power_2", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"indiv_measured_power_2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Indiv_measured_power_2");
					indiv_measured_power_2= val;
			}
		return indiv_measured_power_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndiv_measured_power_2(String newIndiv_measured_power_2) {
		String oldIndiv_measured_power_2 = indiv_measured_power_2;
		indiv_measured_power_2 = newIndiv_measured_power_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_2, oldIndiv_measured_power_2, indiv_measured_power_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndiv_measured_power_N() {
		// Generated by python script located in this directory
			if (!lock.containsKey("indiv_measured_power_N")) lock.put("indiv_measured_power_N", new Boolean(false));
			if (!(Boolean)lock.get("indiv_measured_power_N")){
				lock.put("indiv_measured_power_N", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"indiv_measured_power_N");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Indiv_measured_power_N");
					indiv_measured_power_N= val;
			}
		return indiv_measured_power_N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndiv_measured_power_N(String newIndiv_measured_power_N) {
		String oldIndiv_measured_power_N = indiv_measured_power_N;
		indiv_measured_power_N = newIndiv_measured_power_N;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_N, oldIndiv_measured_power_N, indiv_measured_power_N));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_demand() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_demand")) lock.put("measured_demand", new Boolean(false));
			if (!(Boolean)lock.get("measured_demand")){
				lock.put("measured_demand", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_demand");
					measured_demand= val;
			}
		return measured_demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_demand(String newMeasured_demand) {
		String oldMeasured_demand = measured_demand;
		measured_demand = newMeasured_demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_DEMAND, oldMeasured_demand, measured_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_real_power() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_real_power")) lock.put("measured_real_power", new Boolean(false));
			if (!(Boolean)lock.get("measured_real_power")){
				lock.put("measured_real_power", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_real_power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_real_power");
					measured_real_power= val;
			}
		return measured_real_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_real_power(String newMeasured_real_power) {
		String oldMeasured_real_power = measured_real_power;
		measured_real_power = newMeasured_real_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_REAL_POWER, oldMeasured_real_power, measured_real_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_reactive_power() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_reactive_power")) lock.put("measured_reactive_power", new Boolean(false));
			if (!(Boolean)lock.get("measured_reactive_power")){
				lock.put("measured_reactive_power", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_reactive_power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_reactive_power");
					measured_reactive_power= val;
			}
		return measured_reactive_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_reactive_power(String newMeasured_reactive_power) {
		String oldMeasured_reactive_power = measured_reactive_power;
		measured_reactive_power = newMeasured_reactive_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_POWER, oldMeasured_reactive_power, measured_reactive_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_voltage_1() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_voltage_1")) lock.put("measured_voltage_1", new Boolean(false));
			if (!(Boolean)lock.get("measured_voltage_1")){
				lock.put("measured_voltage_1", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_voltage_1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_voltage_1");
					measured_voltage_1= val;
			}
		return measured_voltage_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_voltage_1(String newMeasured_voltage_1) {
		String oldMeasured_voltage_1 = measured_voltage_1;
		measured_voltage_1 = newMeasured_voltage_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_1, oldMeasured_voltage_1, measured_voltage_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_voltage_2() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_voltage_2")) lock.put("measured_voltage_2", new Boolean(false));
			if (!(Boolean)lock.get("measured_voltage_2")){
				lock.put("measured_voltage_2", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_voltage_2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_voltage_2");
					measured_voltage_2= val;
			}
		return measured_voltage_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_voltage_2(String newMeasured_voltage_2) {
		String oldMeasured_voltage_2 = measured_voltage_2;
		measured_voltage_2 = newMeasured_voltage_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_2, oldMeasured_voltage_2, measured_voltage_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_voltage_N() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_voltage_N")) lock.put("measured_voltage_N", new Boolean(false));
			if (!(Boolean)lock.get("measured_voltage_N")){
				lock.put("measured_voltage_N", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_voltage_N");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_voltage_N");
					measured_voltage_N= val;
			}
		return measured_voltage_N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_voltage_N(String newMeasured_voltage_N) {
		String oldMeasured_voltage_N = measured_voltage_N;
		measured_voltage_N = newMeasured_voltage_N;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_N, oldMeasured_voltage_N, measured_voltage_N));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_current_1() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_current_1")) lock.put("measured_current_1", new Boolean(false));
			if (!(Boolean)lock.get("measured_current_1")){
				lock.put("measured_current_1", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_current_1");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_current_1");
					measured_current_1= val;
			}
		return measured_current_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_current_1(String newMeasured_current_1) {
		String oldMeasured_current_1 = measured_current_1;
		measured_current_1 = newMeasured_current_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_1, oldMeasured_current_1, measured_current_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_current_2() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_current_2")) lock.put("measured_current_2", new Boolean(false));
			if (!(Boolean)lock.get("measured_current_2")){
				lock.put("measured_current_2", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_current_2");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_current_2");
					measured_current_2= val;
			}
		return measured_current_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_current_2(String newMeasured_current_2) {
		String oldMeasured_current_2 = measured_current_2;
		measured_current_2 = newMeasured_current_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_2, oldMeasured_current_2, measured_current_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_current_N() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_current_N")) lock.put("measured_current_N", new Boolean(false));
			if (!(Boolean)lock.get("measured_current_N")){
				lock.put("measured_current_N", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_current_N");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_current_N");
					measured_current_N= val;
			}
		return measured_current_N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_current_N(String newMeasured_current_N) {
		String oldMeasured_current_N = measured_current_N;
		measured_current_N = newMeasured_current_N;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_N, oldMeasured_current_N, measured_current_N));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMonthly_bill() {
		// Generated by python script located in this directory
			if (!lock.containsKey("monthly_bill")) lock.put("monthly_bill", new Boolean(false));
			if (!(Boolean)lock.get("monthly_bill")){
				lock.put("monthly_bill", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"monthly_bill");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Monthly_bill");
					monthly_bill= val;
			}
		return monthly_bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthly_bill(String newMonthly_bill) {
		String oldMonthly_bill = monthly_bill;
		monthly_bill = newMonthly_bill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MONTHLY_BILL, oldMonthly_bill, monthly_bill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrevious_monthly_bill() {
		// Generated by python script located in this directory
			if (!lock.containsKey("previous_monthly_bill")) lock.put("previous_monthly_bill", new Boolean(false));
			if (!(Boolean)lock.get("previous_monthly_bill")){
				lock.put("previous_monthly_bill", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"previous_monthly_bill");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Previous_monthly_bill");
					previous_monthly_bill= val;
			}
		return previous_monthly_bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious_monthly_bill(String newPrevious_monthly_bill) {
		String oldPrevious_monthly_bill = previous_monthly_bill;
		previous_monthly_bill = newPrevious_monthly_bill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_BILL, oldPrevious_monthly_bill, previous_monthly_bill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrevious_monthly_energy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("previous_monthly_energy")) lock.put("previous_monthly_energy", new Boolean(false));
			if (!(Boolean)lock.get("previous_monthly_energy")){
				lock.put("previous_monthly_energy", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"previous_monthly_energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Previous_monthly_energy");
					previous_monthly_energy= val;
			}
		return previous_monthly_energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious_monthly_energy(String newPrevious_monthly_energy) {
		String oldPrevious_monthly_energy = previous_monthly_energy;
		previous_monthly_energy = newPrevious_monthly_energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_ENERGY, oldPrevious_monthly_energy, previous_monthly_energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMonthly_fee() {
		// Generated by python script located in this directory
			if (!lock.containsKey("monthly_fee")) lock.put("monthly_fee", new Boolean(false));
			if (!(Boolean)lock.get("monthly_fee")){
				lock.put("monthly_fee", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"monthly_fee");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Monthly_fee");
					monthly_fee= val;
			}
		return monthly_fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthly_fee(String newMonthly_fee) {
		String oldMonthly_fee = monthly_fee;
		monthly_fee = newMonthly_fee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MONTHLY_FEE, oldMonthly_fee, monthly_fee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMonthly_energy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("monthly_energy")) lock.put("monthly_energy", new Boolean(false));
			if (!(Boolean)lock.get("monthly_energy")){
				lock.put("monthly_energy", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"monthly_energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Monthly_energy");
					monthly_energy= val;
			}
		return monthly_energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthly_energy(String newMonthly_energy) {
		String oldMonthly_energy = monthly_energy;
		monthly_energy = newMonthly_energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MONTHLY_ENERGY, oldMonthly_energy, monthly_energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBill_mode() {
		// Generated by python script located in this directory
			if (!lock.containsKey("bill_mode")) lock.put("bill_mode", new Boolean(false));
			if (!(Boolean)lock.get("bill_mode")){
				lock.put("bill_mode", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"bill_mode");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Bill_mode");
					bill_mode= val;
			}
		return bill_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBill_mode(String newBill_mode) {
		String oldBill_mode = bill_mode;
		bill_mode = newBill_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__BILL_MODE, oldBill_mode, bill_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_market() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_market")) lock.put("power_market", new Boolean(false));
			if (!(Boolean)lock.get("power_market")){
				lock.put("power_market", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_market");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_market");
					power_market= val;
			}
		return power_market;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_market(String newPower_market) {
		String oldPower_market = power_market;
		power_market = newPower_market;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__POWER_MARKET, oldPower_market, power_market));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBill_day() {
		// Generated by python script located in this directory
			if (!lock.containsKey("bill_day")) lock.put("bill_day", new Boolean(false));
			if (!(Boolean)lock.get("bill_day")){
				lock.put("bill_day", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"bill_day");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Bill_day");
					bill_day= val;
			}
		return bill_day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBill_day(String newBill_day) {
		String oldBill_day = bill_day;
		bill_day = newBill_day;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__BILL_DAY, oldBill_day, bill_day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrice() {
		// Generated by python script located in this directory
			if (!lock.containsKey("price")) lock.put("price", new Boolean(false));
			if (!(Boolean)lock.get("price")){
				lock.put("price", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"price");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Price");
					price= val;
			}
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(String newPrice) {
		String oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirst_tier_price() {
		// Generated by python script located in this directory
			if (!lock.containsKey("first_tier_price")) lock.put("first_tier_price", new Boolean(false));
			if (!(Boolean)lock.get("first_tier_price")){
				lock.put("first_tier_price", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"first_tier_price");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"First_tier_price");
					first_tier_price= val;
			}
		return first_tier_price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst_tier_price(String newFirst_tier_price) {
		String oldFirst_tier_price = first_tier_price;
		first_tier_price = newFirst_tier_price;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__FIRST_TIER_PRICE, oldFirst_tier_price, first_tier_price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirst_tier_energy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("first_tier_energy")) lock.put("first_tier_energy", new Boolean(false));
			if (!(Boolean)lock.get("first_tier_energy")){
				lock.put("first_tier_energy", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"first_tier_energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"First_tier_energy");
					first_tier_energy= val;
			}
		return first_tier_energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst_tier_energy(String newFirst_tier_energy) {
		String oldFirst_tier_energy = first_tier_energy;
		first_tier_energy = newFirst_tier_energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__FIRST_TIER_ENERGY, oldFirst_tier_energy, first_tier_energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecond_tier_price() {
		// Generated by python script located in this directory
			if (!lock.containsKey("second_tier_price")) lock.put("second_tier_price", new Boolean(false));
			if (!(Boolean)lock.get("second_tier_price")){
				lock.put("second_tier_price", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"second_tier_price");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Second_tier_price");
					second_tier_price= val;
			}
		return second_tier_price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond_tier_price(String newSecond_tier_price) {
		String oldSecond_tier_price = second_tier_price;
		second_tier_price = newSecond_tier_price;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__SECOND_TIER_PRICE, oldSecond_tier_price, second_tier_price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecond_tier_energy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("second_tier_energy")) lock.put("second_tier_energy", new Boolean(false));
			if (!(Boolean)lock.get("second_tier_energy")){
				lock.put("second_tier_energy", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"second_tier_energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Second_tier_energy");
					second_tier_energy= val;
			}
		return second_tier_energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond_tier_energy(String newSecond_tier_energy) {
		String oldSecond_tier_energy = second_tier_energy;
		second_tier_energy = newSecond_tier_energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__SECOND_TIER_ENERGY, oldSecond_tier_energy, second_tier_energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThird_tier_price() {
		// Generated by python script located in this directory
			if (!lock.containsKey("third_tier_price")) lock.put("third_tier_price", new Boolean(false));
			if (!(Boolean)lock.get("third_tier_price")){
				lock.put("third_tier_price", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"third_tier_price");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Third_tier_price");
					third_tier_price= val;
			}
		return third_tier_price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThird_tier_price(String newThird_tier_price) {
		String oldThird_tier_price = third_tier_price;
		third_tier_price = newThird_tier_price;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__THIRD_TIER_PRICE, oldThird_tier_price, third_tier_price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThird_tier_energy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("third_tier_energy")) lock.put("third_tier_energy", new Boolean(false));
			if (!(Boolean)lock.get("third_tier_energy")){
				lock.put("third_tier_energy", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"third_tier_energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Third_tier_energy");
					third_tier_energy= val;
			}
		return third_tier_energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThird_tier_energy(String newThird_tier_energy) {
		String oldThird_tier_energy = third_tier_energy;
		third_tier_energy = newThird_tier_energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__THIRD_TIER_ENERGY, oldThird_tier_energy, third_tier_energy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__BUSTYPE, oldBustype, bustype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__BUSFLAGS, oldBusflags, busflags));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__REFERENCE_BUS, oldReference_bus, reference_bus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__MAXIMUM_VOLTAGE_ERROR, oldMaximum_voltage_error, maximum_voltage_error));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__VOLTAGE_1, oldVoltage_1, voltage_1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__VOLTAGE_2, oldVoltage_2, voltage_2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__VOLTAGE_N, oldVoltage_N, voltage_N));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__VOLTAGE_12, oldVoltage_12, voltage_12));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__VOLTAGE_1N, oldVoltage_1N, voltage_1N));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__VOLTAGE_2N, oldVoltage_2N, voltage_2N));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_1, oldCurrent_1, current_1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_2, oldCurrent_2, current_2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_N, oldCurrent_N, current_N));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_1REAL, oldCurrent_1_real, current_1_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_2REAL, oldCurrent_2_real, current_2_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_NREAL, oldCurrent_N_real, current_N_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_1REAC, oldCurrent_1_reac, current_1_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_2REAC, oldCurrent_2_reac, current_2_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_NREAC, oldCurrent_N_reac, current_N_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_12, oldCurrent_12, current_12));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_12_REAL, oldCurrent_12_real, current_12_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__CURRENT_12_REAC, oldCurrent_12_reac, current_12_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1, oldResidential_nominal_current_1, residential_nominal_current_1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2, oldResidential_nominal_current_2, residential_nominal_current_2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12, oldResidential_nominal_current_12, residential_nominal_current_12));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1REAL, oldResidential_nominal_current_1_real, residential_nominal_current_1_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1IMAG, oldResidential_nominal_current_1_imag, residential_nominal_current_1_imag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2REAL, oldResidential_nominal_current_2_real, residential_nominal_current_2_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2IMAG, oldResidential_nominal_current_2_imag, residential_nominal_current_2_imag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_REAL, oldResidential_nominal_current_12_real, residential_nominal_current_12_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG, oldResidential_nominal_current_12_imag, residential_nominal_current_12_imag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__POWER_1, oldPower_1, power_1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__POWER_2, oldPower_2, power_2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__POWER_12, oldPower_12, power_12));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__POWER_1REAL, oldPower_1_real, power_1_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__POWER_2REAL, oldPower_2_real, power_2_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__POWER_12_REAL, oldPower_12_real, power_12_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__POWER_1REAC, oldPower_1_reac, power_1_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__POWER_2REAC, oldPower_2_reac, power_2_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__POWER_12_REAC, oldPower_12_reac, power_12_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__SHUNT_1, oldShunt_1, shunt_1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__SHUNT_2, oldShunt_2, shunt_2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__SHUNT_12, oldShunt_12, shunt_12));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__IMPEDANCE_1, oldImpedance_1, impedance_1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__IMPEDANCE_2, oldImpedance_2, impedance_2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__IMPEDANCE_12, oldImpedance_12, impedance_12));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAL, oldImpedance_1_real, impedance_1_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAL, oldImpedance_2_real, impedance_2_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAL, oldImpedance_12_real, impedance_12_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAC, oldImpedance_1_reac, impedance_1_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAC, oldImpedance_2_reac, impedance_2_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAC, oldImpedance_12_reac, impedance_12_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__HOUSE_PRESENT, oldHouse_present, house_present));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__NR_MODE, oldNR_mode, nR_mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__PHASES, oldPhases, phases));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_METER__NOMINAL_VOLTAGE, oldNominal_voltage, nominal_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.TRIPLEX_METER__MEASURED_REAL_ENERGY:
				return getMeasured_real_energy();
			case VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_ENERGY:
				return getMeasured_reactive_energy();
			case VisGridPackage.TRIPLEX_METER__MEASURED_POWER:
				return getMeasured_power();
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_1:
				return getIndiv_measured_power_1();
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_2:
				return getIndiv_measured_power_2();
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_N:
				return getIndiv_measured_power_N();
			case VisGridPackage.TRIPLEX_METER__MEASURED_DEMAND:
				return getMeasured_demand();
			case VisGridPackage.TRIPLEX_METER__MEASURED_REAL_POWER:
				return getMeasured_real_power();
			case VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_POWER:
				return getMeasured_reactive_power();
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_1:
				return getMeasured_voltage_1();
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_2:
				return getMeasured_voltage_2();
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_N:
				return getMeasured_voltage_N();
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_1:
				return getMeasured_current_1();
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_2:
				return getMeasured_current_2();
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_N:
				return getMeasured_current_N();
			case VisGridPackage.TRIPLEX_METER__MONTHLY_BILL:
				return getMonthly_bill();
			case VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_BILL:
				return getPrevious_monthly_bill();
			case VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_ENERGY:
				return getPrevious_monthly_energy();
			case VisGridPackage.TRIPLEX_METER__MONTHLY_FEE:
				return getMonthly_fee();
			case VisGridPackage.TRIPLEX_METER__MONTHLY_ENERGY:
				return getMonthly_energy();
			case VisGridPackage.TRIPLEX_METER__BILL_MODE:
				return getBill_mode();
			case VisGridPackage.TRIPLEX_METER__POWER_MARKET:
				return getPower_market();
			case VisGridPackage.TRIPLEX_METER__BILL_DAY:
				return getBill_day();
			case VisGridPackage.TRIPLEX_METER__PRICE:
				return getPrice();
			case VisGridPackage.TRIPLEX_METER__FIRST_TIER_PRICE:
				return getFirst_tier_price();
			case VisGridPackage.TRIPLEX_METER__FIRST_TIER_ENERGY:
				return getFirst_tier_energy();
			case VisGridPackage.TRIPLEX_METER__SECOND_TIER_PRICE:
				return getSecond_tier_price();
			case VisGridPackage.TRIPLEX_METER__SECOND_TIER_ENERGY:
				return getSecond_tier_energy();
			case VisGridPackage.TRIPLEX_METER__THIRD_TIER_PRICE:
				return getThird_tier_price();
			case VisGridPackage.TRIPLEX_METER__THIRD_TIER_ENERGY:
				return getThird_tier_energy();
			case VisGridPackage.TRIPLEX_METER__BUSTYPE:
				return getBustype();
			case VisGridPackage.TRIPLEX_METER__BUSFLAGS:
				return getBusflags();
			case VisGridPackage.TRIPLEX_METER__REFERENCE_BUS:
				return getReference_bus();
			case VisGridPackage.TRIPLEX_METER__MAXIMUM_VOLTAGE_ERROR:
				return getMaximum_voltage_error();
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_1:
				return getVoltage_1();
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_2:
				return getVoltage_2();
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_N:
				return getVoltage_N();
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_12:
				return getVoltage_12();
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_1N:
				return getVoltage_1N();
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_2N:
				return getVoltage_2N();
			case VisGridPackage.TRIPLEX_METER__CURRENT_1:
				return getCurrent_1();
			case VisGridPackage.TRIPLEX_METER__CURRENT_2:
				return getCurrent_2();
			case VisGridPackage.TRIPLEX_METER__CURRENT_N:
				return getCurrent_N();
			case VisGridPackage.TRIPLEX_METER__CURRENT_1REAL:
				return getCurrent_1_real();
			case VisGridPackage.TRIPLEX_METER__CURRENT_2REAL:
				return getCurrent_2_real();
			case VisGridPackage.TRIPLEX_METER__CURRENT_NREAL:
				return getCurrent_N_real();
			case VisGridPackage.TRIPLEX_METER__CURRENT_1REAC:
				return getCurrent_1_reac();
			case VisGridPackage.TRIPLEX_METER__CURRENT_2REAC:
				return getCurrent_2_reac();
			case VisGridPackage.TRIPLEX_METER__CURRENT_NREAC:
				return getCurrent_N_reac();
			case VisGridPackage.TRIPLEX_METER__CURRENT_12:
				return getCurrent_12();
			case VisGridPackage.TRIPLEX_METER__CURRENT_12_REAL:
				return getCurrent_12_real();
			case VisGridPackage.TRIPLEX_METER__CURRENT_12_REAC:
				return getCurrent_12_reac();
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1:
				return getResidential_nominal_current_1();
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2:
				return getResidential_nominal_current_2();
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12:
				return getResidential_nominal_current_12();
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1REAL:
				return getResidential_nominal_current_1_real();
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1IMAG:
				return getResidential_nominal_current_1_imag();
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2REAL:
				return getResidential_nominal_current_2_real();
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2IMAG:
				return getResidential_nominal_current_2_imag();
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_REAL:
				return getResidential_nominal_current_12_real();
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG:
				return getResidential_nominal_current_12_imag();
			case VisGridPackage.TRIPLEX_METER__POWER_1:
				return getPower_1();
			case VisGridPackage.TRIPLEX_METER__POWER_2:
				return getPower_2();
			case VisGridPackage.TRIPLEX_METER__POWER_12:
				return getPower_12();
			case VisGridPackage.TRIPLEX_METER__POWER_1REAL:
				return getPower_1_real();
			case VisGridPackage.TRIPLEX_METER__POWER_2REAL:
				return getPower_2_real();
			case VisGridPackage.TRIPLEX_METER__POWER_12_REAL:
				return getPower_12_real();
			case VisGridPackage.TRIPLEX_METER__POWER_1REAC:
				return getPower_1_reac();
			case VisGridPackage.TRIPLEX_METER__POWER_2REAC:
				return getPower_2_reac();
			case VisGridPackage.TRIPLEX_METER__POWER_12_REAC:
				return getPower_12_reac();
			case VisGridPackage.TRIPLEX_METER__SHUNT_1:
				return getShunt_1();
			case VisGridPackage.TRIPLEX_METER__SHUNT_2:
				return getShunt_2();
			case VisGridPackage.TRIPLEX_METER__SHUNT_12:
				return getShunt_12();
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1:
				return getImpedance_1();
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2:
				return getImpedance_2();
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12:
				return getImpedance_12();
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAL:
				return getImpedance_1_real();
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAL:
				return getImpedance_2_real();
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAL:
				return getImpedance_12_real();
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAC:
				return getImpedance_1_reac();
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAC:
				return getImpedance_2_reac();
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAC:
				return getImpedance_12_reac();
			case VisGridPackage.TRIPLEX_METER__HOUSE_PRESENT:
				return getHouse_present();
			case VisGridPackage.TRIPLEX_METER__NR_MODE:
				return getNR_mode();
			case VisGridPackage.TRIPLEX_METER__PHASES:
				return getPhases();
			case VisGridPackage.TRIPLEX_METER__NOMINAL_VOLTAGE:
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
			case VisGridPackage.TRIPLEX_METER__MEASURED_REAL_ENERGY:
				setMeasured_real_energy((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_ENERGY:
				setMeasured_reactive_energy((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_POWER:
				setMeasured_power((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_1:
				setIndiv_measured_power_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_2:
				setIndiv_measured_power_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_N:
				setIndiv_measured_power_N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_DEMAND:
				setMeasured_demand((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_REAL_POWER:
				setMeasured_real_power((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_POWER:
				setMeasured_reactive_power((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_1:
				setMeasured_voltage_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_2:
				setMeasured_voltage_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_N:
				setMeasured_voltage_N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_1:
				setMeasured_current_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_2:
				setMeasured_current_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_N:
				setMeasured_current_N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MONTHLY_BILL:
				setMonthly_bill((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_BILL:
				setPrevious_monthly_bill((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_ENERGY:
				setPrevious_monthly_energy((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MONTHLY_FEE:
				setMonthly_fee((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MONTHLY_ENERGY:
				setMonthly_energy((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__BILL_MODE:
				setBill_mode((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_MARKET:
				setPower_market((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__BILL_DAY:
				setBill_day((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__PRICE:
				setPrice((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__FIRST_TIER_PRICE:
				setFirst_tier_price((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__FIRST_TIER_ENERGY:
				setFirst_tier_energy((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__SECOND_TIER_PRICE:
				setSecond_tier_price((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__SECOND_TIER_ENERGY:
				setSecond_tier_energy((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__THIRD_TIER_PRICE:
				setThird_tier_price((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__THIRD_TIER_ENERGY:
				setThird_tier_energy((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__BUSTYPE:
				setBustype((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__BUSFLAGS:
				setBusflags((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__REFERENCE_BUS:
				setReference_bus((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_1:
				setVoltage_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_2:
				setVoltage_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_N:
				setVoltage_N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_12:
				setVoltage_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_1N:
				setVoltage_1N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_2N:
				setVoltage_2N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_1:
				setCurrent_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_2:
				setCurrent_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_N:
				setCurrent_N((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_1REAL:
				setCurrent_1_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_2REAL:
				setCurrent_2_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_NREAL:
				setCurrent_N_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_1REAC:
				setCurrent_1_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_2REAC:
				setCurrent_2_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_NREAC:
				setCurrent_N_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_12:
				setCurrent_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_12_REAL:
				setCurrent_12_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_12_REAC:
				setCurrent_12_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1:
				setResidential_nominal_current_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2:
				setResidential_nominal_current_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12:
				setResidential_nominal_current_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1REAL:
				setResidential_nominal_current_1_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1IMAG:
				setResidential_nominal_current_1_imag((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2REAL:
				setResidential_nominal_current_2_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2IMAG:
				setResidential_nominal_current_2_imag((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_REAL:
				setResidential_nominal_current_12_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG:
				setResidential_nominal_current_12_imag((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_1:
				setPower_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_2:
				setPower_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_12:
				setPower_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_1REAL:
				setPower_1_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_2REAL:
				setPower_2_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_12_REAL:
				setPower_12_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_1REAC:
				setPower_1_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_2REAC:
				setPower_2_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_12_REAC:
				setPower_12_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__SHUNT_1:
				setShunt_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__SHUNT_2:
				setShunt_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__SHUNT_12:
				setShunt_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1:
				setImpedance_1((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2:
				setImpedance_2((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12:
				setImpedance_12((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAL:
				setImpedance_1_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAL:
				setImpedance_2_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAL:
				setImpedance_12_real((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAC:
				setImpedance_1_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAC:
				setImpedance_2_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAC:
				setImpedance_12_reac((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__HOUSE_PRESENT:
				setHouse_present((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__NR_MODE:
				setNR_mode((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__PHASES:
				setPhases((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_METER__NOMINAL_VOLTAGE:
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
			case VisGridPackage.TRIPLEX_METER__MEASURED_REAL_ENERGY:
				setMeasured_real_energy(MEASURED_REAL_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_ENERGY:
				setMeasured_reactive_energy(MEASURED_REACTIVE_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_POWER:
				setMeasured_power(MEASURED_POWER_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_1:
				setIndiv_measured_power_1(INDIV_MEASURED_POWER_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_2:
				setIndiv_measured_power_2(INDIV_MEASURED_POWER_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_N:
				setIndiv_measured_power_N(INDIV_MEASURED_POWER_N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_DEMAND:
				setMeasured_demand(MEASURED_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_REAL_POWER:
				setMeasured_real_power(MEASURED_REAL_POWER_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_POWER:
				setMeasured_reactive_power(MEASURED_REACTIVE_POWER_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_1:
				setMeasured_voltage_1(MEASURED_VOLTAGE_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_2:
				setMeasured_voltage_2(MEASURED_VOLTAGE_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_N:
				setMeasured_voltage_N(MEASURED_VOLTAGE_N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_1:
				setMeasured_current_1(MEASURED_CURRENT_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_2:
				setMeasured_current_2(MEASURED_CURRENT_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_N:
				setMeasured_current_N(MEASURED_CURRENT_N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MONTHLY_BILL:
				setMonthly_bill(MONTHLY_BILL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_BILL:
				setPrevious_monthly_bill(PREVIOUS_MONTHLY_BILL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_ENERGY:
				setPrevious_monthly_energy(PREVIOUS_MONTHLY_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MONTHLY_FEE:
				setMonthly_fee(MONTHLY_FEE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MONTHLY_ENERGY:
				setMonthly_energy(MONTHLY_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__BILL_MODE:
				setBill_mode(BILL_MODE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_MARKET:
				setPower_market(POWER_MARKET_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__BILL_DAY:
				setBill_day(BILL_DAY_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__FIRST_TIER_PRICE:
				setFirst_tier_price(FIRST_TIER_PRICE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__FIRST_TIER_ENERGY:
				setFirst_tier_energy(FIRST_TIER_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__SECOND_TIER_PRICE:
				setSecond_tier_price(SECOND_TIER_PRICE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__SECOND_TIER_ENERGY:
				setSecond_tier_energy(SECOND_TIER_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__THIRD_TIER_PRICE:
				setThird_tier_price(THIRD_TIER_PRICE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__THIRD_TIER_ENERGY:
				setThird_tier_energy(THIRD_TIER_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__BUSTYPE:
				setBustype(BUSTYPE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__BUSFLAGS:
				setBusflags(BUSFLAGS_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__REFERENCE_BUS:
				setReference_bus(REFERENCE_BUS_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error(MAXIMUM_VOLTAGE_ERROR_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_1:
				setVoltage_1(VOLTAGE_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_2:
				setVoltage_2(VOLTAGE_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_N:
				setVoltage_N(VOLTAGE_N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_12:
				setVoltage_12(VOLTAGE_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_1N:
				setVoltage_1N(VOLTAGE_1N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_2N:
				setVoltage_2N(VOLTAGE_2N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_1:
				setCurrent_1(CURRENT_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_2:
				setCurrent_2(CURRENT_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_N:
				setCurrent_N(CURRENT_N_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_1REAL:
				setCurrent_1_real(CURRENT_1REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_2REAL:
				setCurrent_2_real(CURRENT_2REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_NREAL:
				setCurrent_N_real(CURRENT_NREAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_1REAC:
				setCurrent_1_reac(CURRENT_1REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_2REAC:
				setCurrent_2_reac(CURRENT_2REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_NREAC:
				setCurrent_N_reac(CURRENT_NREAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_12:
				setCurrent_12(CURRENT_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_12_REAL:
				setCurrent_12_real(CURRENT_12_REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__CURRENT_12_REAC:
				setCurrent_12_reac(CURRENT_12_REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1:
				setResidential_nominal_current_1(RESIDENTIAL_NOMINAL_CURRENT_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2:
				setResidential_nominal_current_2(RESIDENTIAL_NOMINAL_CURRENT_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12:
				setResidential_nominal_current_12(RESIDENTIAL_NOMINAL_CURRENT_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1REAL:
				setResidential_nominal_current_1_real(RESIDENTIAL_NOMINAL_CURRENT_1REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1IMAG:
				setResidential_nominal_current_1_imag(RESIDENTIAL_NOMINAL_CURRENT_1IMAG_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2REAL:
				setResidential_nominal_current_2_real(RESIDENTIAL_NOMINAL_CURRENT_2REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2IMAG:
				setResidential_nominal_current_2_imag(RESIDENTIAL_NOMINAL_CURRENT_2IMAG_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_REAL:
				setResidential_nominal_current_12_real(RESIDENTIAL_NOMINAL_CURRENT_12_REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG:
				setResidential_nominal_current_12_imag(RESIDENTIAL_NOMINAL_CURRENT_12_IMAG_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_1:
				setPower_1(POWER_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_2:
				setPower_2(POWER_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_12:
				setPower_12(POWER_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_1REAL:
				setPower_1_real(POWER_1REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_2REAL:
				setPower_2_real(POWER_2REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_12_REAL:
				setPower_12_real(POWER_12_REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_1REAC:
				setPower_1_reac(POWER_1REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_2REAC:
				setPower_2_reac(POWER_2REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__POWER_12_REAC:
				setPower_12_reac(POWER_12_REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__SHUNT_1:
				setShunt_1(SHUNT_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__SHUNT_2:
				setShunt_2(SHUNT_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__SHUNT_12:
				setShunt_12(SHUNT_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1:
				setImpedance_1(IMPEDANCE_1_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2:
				setImpedance_2(IMPEDANCE_2_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12:
				setImpedance_12(IMPEDANCE_12_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAL:
				setImpedance_1_real(IMPEDANCE_1REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAL:
				setImpedance_2_real(IMPEDANCE_2REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAL:
				setImpedance_12_real(IMPEDANCE_12_REAL_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAC:
				setImpedance_1_reac(IMPEDANCE_1REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAC:
				setImpedance_2_reac(IMPEDANCE_2REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAC:
				setImpedance_12_reac(IMPEDANCE_12_REAC_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__HOUSE_PRESENT:
				setHouse_present(HOUSE_PRESENT_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__NR_MODE:
				setNR_mode(NR_MODE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_METER__NOMINAL_VOLTAGE:
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
			case VisGridPackage.TRIPLEX_METER__MEASURED_REAL_ENERGY:
				return MEASURED_REAL_ENERGY_EDEFAULT == null ? measured_real_energy != null : !MEASURED_REAL_ENERGY_EDEFAULT.equals(measured_real_energy);
			case VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_ENERGY:
				return MEASURED_REACTIVE_ENERGY_EDEFAULT == null ? measured_reactive_energy != null : !MEASURED_REACTIVE_ENERGY_EDEFAULT.equals(measured_reactive_energy);
			case VisGridPackage.TRIPLEX_METER__MEASURED_POWER:
				return MEASURED_POWER_EDEFAULT == null ? measured_power != null : !MEASURED_POWER_EDEFAULT.equals(measured_power);
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_1:
				return INDIV_MEASURED_POWER_1_EDEFAULT == null ? indiv_measured_power_1 != null : !INDIV_MEASURED_POWER_1_EDEFAULT.equals(indiv_measured_power_1);
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_2:
				return INDIV_MEASURED_POWER_2_EDEFAULT == null ? indiv_measured_power_2 != null : !INDIV_MEASURED_POWER_2_EDEFAULT.equals(indiv_measured_power_2);
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_N:
				return INDIV_MEASURED_POWER_N_EDEFAULT == null ? indiv_measured_power_N != null : !INDIV_MEASURED_POWER_N_EDEFAULT.equals(indiv_measured_power_N);
			case VisGridPackage.TRIPLEX_METER__MEASURED_DEMAND:
				return MEASURED_DEMAND_EDEFAULT == null ? measured_demand != null : !MEASURED_DEMAND_EDEFAULT.equals(measured_demand);
			case VisGridPackage.TRIPLEX_METER__MEASURED_REAL_POWER:
				return MEASURED_REAL_POWER_EDEFAULT == null ? measured_real_power != null : !MEASURED_REAL_POWER_EDEFAULT.equals(measured_real_power);
			case VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_POWER:
				return MEASURED_REACTIVE_POWER_EDEFAULT == null ? measured_reactive_power != null : !MEASURED_REACTIVE_POWER_EDEFAULT.equals(measured_reactive_power);
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_1:
				return MEASURED_VOLTAGE_1_EDEFAULT == null ? measured_voltage_1 != null : !MEASURED_VOLTAGE_1_EDEFAULT.equals(measured_voltage_1);
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_2:
				return MEASURED_VOLTAGE_2_EDEFAULT == null ? measured_voltage_2 != null : !MEASURED_VOLTAGE_2_EDEFAULT.equals(measured_voltage_2);
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_N:
				return MEASURED_VOLTAGE_N_EDEFAULT == null ? measured_voltage_N != null : !MEASURED_VOLTAGE_N_EDEFAULT.equals(measured_voltage_N);
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_1:
				return MEASURED_CURRENT_1_EDEFAULT == null ? measured_current_1 != null : !MEASURED_CURRENT_1_EDEFAULT.equals(measured_current_1);
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_2:
				return MEASURED_CURRENT_2_EDEFAULT == null ? measured_current_2 != null : !MEASURED_CURRENT_2_EDEFAULT.equals(measured_current_2);
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_N:
				return MEASURED_CURRENT_N_EDEFAULT == null ? measured_current_N != null : !MEASURED_CURRENT_N_EDEFAULT.equals(measured_current_N);
			case VisGridPackage.TRIPLEX_METER__MONTHLY_BILL:
				return MONTHLY_BILL_EDEFAULT == null ? monthly_bill != null : !MONTHLY_BILL_EDEFAULT.equals(monthly_bill);
			case VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_BILL:
				return PREVIOUS_MONTHLY_BILL_EDEFAULT == null ? previous_monthly_bill != null : !PREVIOUS_MONTHLY_BILL_EDEFAULT.equals(previous_monthly_bill);
			case VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_ENERGY:
				return PREVIOUS_MONTHLY_ENERGY_EDEFAULT == null ? previous_monthly_energy != null : !PREVIOUS_MONTHLY_ENERGY_EDEFAULT.equals(previous_monthly_energy);
			case VisGridPackage.TRIPLEX_METER__MONTHLY_FEE:
				return MONTHLY_FEE_EDEFAULT == null ? monthly_fee != null : !MONTHLY_FEE_EDEFAULT.equals(monthly_fee);
			case VisGridPackage.TRIPLEX_METER__MONTHLY_ENERGY:
				return MONTHLY_ENERGY_EDEFAULT == null ? monthly_energy != null : !MONTHLY_ENERGY_EDEFAULT.equals(monthly_energy);
			case VisGridPackage.TRIPLEX_METER__BILL_MODE:
				return BILL_MODE_EDEFAULT == null ? bill_mode != null : !BILL_MODE_EDEFAULT.equals(bill_mode);
			case VisGridPackage.TRIPLEX_METER__POWER_MARKET:
				return POWER_MARKET_EDEFAULT == null ? power_market != null : !POWER_MARKET_EDEFAULT.equals(power_market);
			case VisGridPackage.TRIPLEX_METER__BILL_DAY:
				return BILL_DAY_EDEFAULT == null ? bill_day != null : !BILL_DAY_EDEFAULT.equals(bill_day);
			case VisGridPackage.TRIPLEX_METER__PRICE:
				return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
			case VisGridPackage.TRIPLEX_METER__FIRST_TIER_PRICE:
				return FIRST_TIER_PRICE_EDEFAULT == null ? first_tier_price != null : !FIRST_TIER_PRICE_EDEFAULT.equals(first_tier_price);
			case VisGridPackage.TRIPLEX_METER__FIRST_TIER_ENERGY:
				return FIRST_TIER_ENERGY_EDEFAULT == null ? first_tier_energy != null : !FIRST_TIER_ENERGY_EDEFAULT.equals(first_tier_energy);
			case VisGridPackage.TRIPLEX_METER__SECOND_TIER_PRICE:
				return SECOND_TIER_PRICE_EDEFAULT == null ? second_tier_price != null : !SECOND_TIER_PRICE_EDEFAULT.equals(second_tier_price);
			case VisGridPackage.TRIPLEX_METER__SECOND_TIER_ENERGY:
				return SECOND_TIER_ENERGY_EDEFAULT == null ? second_tier_energy != null : !SECOND_TIER_ENERGY_EDEFAULT.equals(second_tier_energy);
			case VisGridPackage.TRIPLEX_METER__THIRD_TIER_PRICE:
				return THIRD_TIER_PRICE_EDEFAULT == null ? third_tier_price != null : !THIRD_TIER_PRICE_EDEFAULT.equals(third_tier_price);
			case VisGridPackage.TRIPLEX_METER__THIRD_TIER_ENERGY:
				return THIRD_TIER_ENERGY_EDEFAULT == null ? third_tier_energy != null : !THIRD_TIER_ENERGY_EDEFAULT.equals(third_tier_energy);
			case VisGridPackage.TRIPLEX_METER__BUSTYPE:
				return BUSTYPE_EDEFAULT == null ? bustype != null : !BUSTYPE_EDEFAULT.equals(bustype);
			case VisGridPackage.TRIPLEX_METER__BUSFLAGS:
				return BUSFLAGS_EDEFAULT == null ? busflags != null : !BUSFLAGS_EDEFAULT.equals(busflags);
			case VisGridPackage.TRIPLEX_METER__REFERENCE_BUS:
				return REFERENCE_BUS_EDEFAULT == null ? reference_bus != null : !REFERENCE_BUS_EDEFAULT.equals(reference_bus);
			case VisGridPackage.TRIPLEX_METER__MAXIMUM_VOLTAGE_ERROR:
				return MAXIMUM_VOLTAGE_ERROR_EDEFAULT == null ? maximum_voltage_error != null : !MAXIMUM_VOLTAGE_ERROR_EDEFAULT.equals(maximum_voltage_error);
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_1:
				return VOLTAGE_1_EDEFAULT == null ? voltage_1 != null : !VOLTAGE_1_EDEFAULT.equals(voltage_1);
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_2:
				return VOLTAGE_2_EDEFAULT == null ? voltage_2 != null : !VOLTAGE_2_EDEFAULT.equals(voltage_2);
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_N:
				return VOLTAGE_N_EDEFAULT == null ? voltage_N != null : !VOLTAGE_N_EDEFAULT.equals(voltage_N);
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_12:
				return VOLTAGE_12_EDEFAULT == null ? voltage_12 != null : !VOLTAGE_12_EDEFAULT.equals(voltage_12);
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_1N:
				return VOLTAGE_1N_EDEFAULT == null ? voltage_1N != null : !VOLTAGE_1N_EDEFAULT.equals(voltage_1N);
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_2N:
				return VOLTAGE_2N_EDEFAULT == null ? voltage_2N != null : !VOLTAGE_2N_EDEFAULT.equals(voltage_2N);
			case VisGridPackage.TRIPLEX_METER__CURRENT_1:
				return CURRENT_1_EDEFAULT == null ? current_1 != null : !CURRENT_1_EDEFAULT.equals(current_1);
			case VisGridPackage.TRIPLEX_METER__CURRENT_2:
				return CURRENT_2_EDEFAULT == null ? current_2 != null : !CURRENT_2_EDEFAULT.equals(current_2);
			case VisGridPackage.TRIPLEX_METER__CURRENT_N:
				return CURRENT_N_EDEFAULT == null ? current_N != null : !CURRENT_N_EDEFAULT.equals(current_N);
			case VisGridPackage.TRIPLEX_METER__CURRENT_1REAL:
				return CURRENT_1REAL_EDEFAULT == null ? current_1_real != null : !CURRENT_1REAL_EDEFAULT.equals(current_1_real);
			case VisGridPackage.TRIPLEX_METER__CURRENT_2REAL:
				return CURRENT_2REAL_EDEFAULT == null ? current_2_real != null : !CURRENT_2REAL_EDEFAULT.equals(current_2_real);
			case VisGridPackage.TRIPLEX_METER__CURRENT_NREAL:
				return CURRENT_NREAL_EDEFAULT == null ? current_N_real != null : !CURRENT_NREAL_EDEFAULT.equals(current_N_real);
			case VisGridPackage.TRIPLEX_METER__CURRENT_1REAC:
				return CURRENT_1REAC_EDEFAULT == null ? current_1_reac != null : !CURRENT_1REAC_EDEFAULT.equals(current_1_reac);
			case VisGridPackage.TRIPLEX_METER__CURRENT_2REAC:
				return CURRENT_2REAC_EDEFAULT == null ? current_2_reac != null : !CURRENT_2REAC_EDEFAULT.equals(current_2_reac);
			case VisGridPackage.TRIPLEX_METER__CURRENT_NREAC:
				return CURRENT_NREAC_EDEFAULT == null ? current_N_reac != null : !CURRENT_NREAC_EDEFAULT.equals(current_N_reac);
			case VisGridPackage.TRIPLEX_METER__CURRENT_12:
				return CURRENT_12_EDEFAULT == null ? current_12 != null : !CURRENT_12_EDEFAULT.equals(current_12);
			case VisGridPackage.TRIPLEX_METER__CURRENT_12_REAL:
				return CURRENT_12_REAL_EDEFAULT == null ? current_12_real != null : !CURRENT_12_REAL_EDEFAULT.equals(current_12_real);
			case VisGridPackage.TRIPLEX_METER__CURRENT_12_REAC:
				return CURRENT_12_REAC_EDEFAULT == null ? current_12_reac != null : !CURRENT_12_REAC_EDEFAULT.equals(current_12_reac);
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1:
				return RESIDENTIAL_NOMINAL_CURRENT_1_EDEFAULT == null ? residential_nominal_current_1 != null : !RESIDENTIAL_NOMINAL_CURRENT_1_EDEFAULT.equals(residential_nominal_current_1);
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2:
				return RESIDENTIAL_NOMINAL_CURRENT_2_EDEFAULT == null ? residential_nominal_current_2 != null : !RESIDENTIAL_NOMINAL_CURRENT_2_EDEFAULT.equals(residential_nominal_current_2);
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12:
				return RESIDENTIAL_NOMINAL_CURRENT_12_EDEFAULT == null ? residential_nominal_current_12 != null : !RESIDENTIAL_NOMINAL_CURRENT_12_EDEFAULT.equals(residential_nominal_current_12);
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1REAL:
				return RESIDENTIAL_NOMINAL_CURRENT_1REAL_EDEFAULT == null ? residential_nominal_current_1_real != null : !RESIDENTIAL_NOMINAL_CURRENT_1REAL_EDEFAULT.equals(residential_nominal_current_1_real);
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1IMAG:
				return RESIDENTIAL_NOMINAL_CURRENT_1IMAG_EDEFAULT == null ? residential_nominal_current_1_imag != null : !RESIDENTIAL_NOMINAL_CURRENT_1IMAG_EDEFAULT.equals(residential_nominal_current_1_imag);
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2REAL:
				return RESIDENTIAL_NOMINAL_CURRENT_2REAL_EDEFAULT == null ? residential_nominal_current_2_real != null : !RESIDENTIAL_NOMINAL_CURRENT_2REAL_EDEFAULT.equals(residential_nominal_current_2_real);
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2IMAG:
				return RESIDENTIAL_NOMINAL_CURRENT_2IMAG_EDEFAULT == null ? residential_nominal_current_2_imag != null : !RESIDENTIAL_NOMINAL_CURRENT_2IMAG_EDEFAULT.equals(residential_nominal_current_2_imag);
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_REAL:
				return RESIDENTIAL_NOMINAL_CURRENT_12_REAL_EDEFAULT == null ? residential_nominal_current_12_real != null : !RESIDENTIAL_NOMINAL_CURRENT_12_REAL_EDEFAULT.equals(residential_nominal_current_12_real);
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG:
				return RESIDENTIAL_NOMINAL_CURRENT_12_IMAG_EDEFAULT == null ? residential_nominal_current_12_imag != null : !RESIDENTIAL_NOMINAL_CURRENT_12_IMAG_EDEFAULT.equals(residential_nominal_current_12_imag);
			case VisGridPackage.TRIPLEX_METER__POWER_1:
				return POWER_1_EDEFAULT == null ? power_1 != null : !POWER_1_EDEFAULT.equals(power_1);
			case VisGridPackage.TRIPLEX_METER__POWER_2:
				return POWER_2_EDEFAULT == null ? power_2 != null : !POWER_2_EDEFAULT.equals(power_2);
			case VisGridPackage.TRIPLEX_METER__POWER_12:
				return POWER_12_EDEFAULT == null ? power_12 != null : !POWER_12_EDEFAULT.equals(power_12);
			case VisGridPackage.TRIPLEX_METER__POWER_1REAL:
				return POWER_1REAL_EDEFAULT == null ? power_1_real != null : !POWER_1REAL_EDEFAULT.equals(power_1_real);
			case VisGridPackage.TRIPLEX_METER__POWER_2REAL:
				return POWER_2REAL_EDEFAULT == null ? power_2_real != null : !POWER_2REAL_EDEFAULT.equals(power_2_real);
			case VisGridPackage.TRIPLEX_METER__POWER_12_REAL:
				return POWER_12_REAL_EDEFAULT == null ? power_12_real != null : !POWER_12_REAL_EDEFAULT.equals(power_12_real);
			case VisGridPackage.TRIPLEX_METER__POWER_1REAC:
				return POWER_1REAC_EDEFAULT == null ? power_1_reac != null : !POWER_1REAC_EDEFAULT.equals(power_1_reac);
			case VisGridPackage.TRIPLEX_METER__POWER_2REAC:
				return POWER_2REAC_EDEFAULT == null ? power_2_reac != null : !POWER_2REAC_EDEFAULT.equals(power_2_reac);
			case VisGridPackage.TRIPLEX_METER__POWER_12_REAC:
				return POWER_12_REAC_EDEFAULT == null ? power_12_reac != null : !POWER_12_REAC_EDEFAULT.equals(power_12_reac);
			case VisGridPackage.TRIPLEX_METER__SHUNT_1:
				return SHUNT_1_EDEFAULT == null ? shunt_1 != null : !SHUNT_1_EDEFAULT.equals(shunt_1);
			case VisGridPackage.TRIPLEX_METER__SHUNT_2:
				return SHUNT_2_EDEFAULT == null ? shunt_2 != null : !SHUNT_2_EDEFAULT.equals(shunt_2);
			case VisGridPackage.TRIPLEX_METER__SHUNT_12:
				return SHUNT_12_EDEFAULT == null ? shunt_12 != null : !SHUNT_12_EDEFAULT.equals(shunt_12);
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1:
				return IMPEDANCE_1_EDEFAULT == null ? impedance_1 != null : !IMPEDANCE_1_EDEFAULT.equals(impedance_1);
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2:
				return IMPEDANCE_2_EDEFAULT == null ? impedance_2 != null : !IMPEDANCE_2_EDEFAULT.equals(impedance_2);
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12:
				return IMPEDANCE_12_EDEFAULT == null ? impedance_12 != null : !IMPEDANCE_12_EDEFAULT.equals(impedance_12);
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAL:
				return IMPEDANCE_1REAL_EDEFAULT == null ? impedance_1_real != null : !IMPEDANCE_1REAL_EDEFAULT.equals(impedance_1_real);
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAL:
				return IMPEDANCE_2REAL_EDEFAULT == null ? impedance_2_real != null : !IMPEDANCE_2REAL_EDEFAULT.equals(impedance_2_real);
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAL:
				return IMPEDANCE_12_REAL_EDEFAULT == null ? impedance_12_real != null : !IMPEDANCE_12_REAL_EDEFAULT.equals(impedance_12_real);
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAC:
				return IMPEDANCE_1REAC_EDEFAULT == null ? impedance_1_reac != null : !IMPEDANCE_1REAC_EDEFAULT.equals(impedance_1_reac);
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAC:
				return IMPEDANCE_2REAC_EDEFAULT == null ? impedance_2_reac != null : !IMPEDANCE_2REAC_EDEFAULT.equals(impedance_2_reac);
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAC:
				return IMPEDANCE_12_REAC_EDEFAULT == null ? impedance_12_reac != null : !IMPEDANCE_12_REAC_EDEFAULT.equals(impedance_12_reac);
			case VisGridPackage.TRIPLEX_METER__HOUSE_PRESENT:
				return HOUSE_PRESENT_EDEFAULT == null ? house_present != null : !HOUSE_PRESENT_EDEFAULT.equals(house_present);
			case VisGridPackage.TRIPLEX_METER__NR_MODE:
				return NR_MODE_EDEFAULT == null ? nR_mode != null : !NR_MODE_EDEFAULT.equals(nR_mode);
			case VisGridPackage.TRIPLEX_METER__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case VisGridPackage.TRIPLEX_METER__NOMINAL_VOLTAGE:
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
		result.append(" (measured_real_energy: ");
		result.append(measured_real_energy);
		result.append(", measured_reactive_energy: ");
		result.append(measured_reactive_energy);
		result.append(", measured_power: ");
		result.append(measured_power);
		result.append(", indiv_measured_power_1: ");
		result.append(indiv_measured_power_1);
		result.append(", indiv_measured_power_2: ");
		result.append(indiv_measured_power_2);
		result.append(", indiv_measured_power_N: ");
		result.append(indiv_measured_power_N);
		result.append(", measured_demand: ");
		result.append(measured_demand);
		result.append(", measured_real_power: ");
		result.append(measured_real_power);
		result.append(", measured_reactive_power: ");
		result.append(measured_reactive_power);
		result.append(", measured_voltage_1: ");
		result.append(measured_voltage_1);
		result.append(", measured_voltage_2: ");
		result.append(measured_voltage_2);
		result.append(", measured_voltage_N: ");
		result.append(measured_voltage_N);
		result.append(", measured_current_1: ");
		result.append(measured_current_1);
		result.append(", measured_current_2: ");
		result.append(measured_current_2);
		result.append(", measured_current_N: ");
		result.append(measured_current_N);
		result.append(", monthly_bill: ");
		result.append(monthly_bill);
		result.append(", previous_monthly_bill: ");
		result.append(previous_monthly_bill);
		result.append(", previous_monthly_energy: ");
		result.append(previous_monthly_energy);
		result.append(", monthly_fee: ");
		result.append(monthly_fee);
		result.append(", monthly_energy: ");
		result.append(monthly_energy);
		result.append(", bill_mode: ");
		result.append(bill_mode);
		result.append(", power_market: ");
		result.append(power_market);
		result.append(", bill_day: ");
		result.append(bill_day);
		result.append(", price: ");
		result.append(price);
		result.append(", first_tier_price: ");
		result.append(first_tier_price);
		result.append(", first_tier_energy: ");
		result.append(first_tier_energy);
		result.append(", second_tier_price: ");
		result.append(second_tier_price);
		result.append(", second_tier_energy: ");
		result.append(second_tier_energy);
		result.append(", third_tier_price: ");
		result.append(third_tier_price);
		result.append(", third_tier_energy: ");
		result.append(third_tier_energy);
		result.append(", bustype: ");
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

} //Triplex_meterImpl
