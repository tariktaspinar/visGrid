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

import visGrid.Controller2;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Controller2Impl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getInput_state <em>Input state</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getInput_setpoint <em>Input setpoint</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getInput_chained <em>Input chained</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getObservation <em>Observation</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getMean_observation <em>Mean observation</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getStdev_observation <em>Stdev observation</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getExpectation <em>Expectation</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getSetpoint <em>Setpoint</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getSensitivity <em>Sensitivity</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getPeriod <em>Period</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getExpectation_prop <em>Expectation prop</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getExpectation_obj <em>Expectation obj</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getSetpoint_prop <em>Setpoint prop</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getState_prop <em>State prop</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getObservation_obj <em>Observation obj</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getObservation_prop <em>Observation prop</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getMean_observation_prop <em>Mean observation prop</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getStdev_observation_prop <em>Stdev observation prop</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getCycle_length <em>Cycle length</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getBase_setpoint <em>Base setpoint</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getRamp_high <em>Ramp high</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getRamp_low <em>Ramp low</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getRange_high <em>Range high</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getRange_low <em>Range low</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getProb_off <em>Prob off</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getOutput_state <em>Output state</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getOutput_setpoint <em>Output setpoint</em>}</li>
 *   <li>{@link visGrid.impl.Controller2Impl#getControl_mode <em>Control mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Controller2Impl extends ConnectionImpl implements Controller2 {
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
	 * The default value of the '{@link #getInput_state() <em>Input state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_state()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput_state() <em>Input state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_state()
	 * @generated
	 * @ordered
	 */
	protected String input_state = INPUT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput_setpoint() <em>Input setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput_setpoint() <em>Input setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String input_setpoint = INPUT_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput_chained() <em>Input chained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_chained()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_CHAINED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput_chained() <em>Input chained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_chained()
	 * @generated
	 * @ordered
	 */
	protected String input_chained = INPUT_CHAINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected String observation = OBSERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMean_observation() <em>Mean observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean_observation()
	 * @generated
	 * @ordered
	 */
	protected static final String MEAN_OBSERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMean_observation() <em>Mean observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean_observation()
	 * @generated
	 * @ordered
	 */
	protected String mean_observation = MEAN_OBSERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStdev_observation() <em>Stdev observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdev_observation()
	 * @generated
	 * @ordered
	 */
	protected static final String STDEV_OBSERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStdev_observation() <em>Stdev observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdev_observation()
	 * @generated
	 * @ordered
	 */
	protected String stdev_observation = STDEV_OBSERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectation() <em>Expectation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectation() <em>Expectation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectation()
	 * @generated
	 * @ordered
	 */
	protected String expectation = EXPECTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetpoint() <em>Setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetpoint() <em>Setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetpoint()
	 * @generated
	 * @ordered
	 */
	protected String setpoint = SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensitivity() <em>Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivity()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSITIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensitivity() <em>Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivity()
	 * @generated
	 * @ordered
	 */
	protected String sensitivity = SENSITIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected String period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectation_prop() <em>Expectation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectation_prop()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTATION_PROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectation_prop() <em>Expectation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectation_prop()
	 * @generated
	 * @ordered
	 */
	protected String expectation_prop = EXPECTATION_PROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectation_obj() <em>Expectation obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectation_obj()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTATION_OBJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectation_obj() <em>Expectation obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectation_obj()
	 * @generated
	 * @ordered
	 */
	protected String expectation_obj = EXPECTATION_OBJ_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetpoint_prop() <em>Setpoint prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetpoint_prop()
	 * @generated
	 * @ordered
	 */
	protected static final String SETPOINT_PROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetpoint_prop() <em>Setpoint prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetpoint_prop()
	 * @generated
	 * @ordered
	 */
	protected String setpoint_prop = SETPOINT_PROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getState_prop() <em>State prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_prop()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_PROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState_prop() <em>State prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_prop()
	 * @generated
	 * @ordered
	 */
	protected String state_prop = STATE_PROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservation_obj() <em>Observation obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation_obj()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATION_OBJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservation_obj() <em>Observation obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation_obj()
	 * @generated
	 * @ordered
	 */
	protected String observation_obj = OBSERVATION_OBJ_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservation_prop() <em>Observation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation_prop()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATION_PROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservation_prop() <em>Observation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation_prop()
	 * @generated
	 * @ordered
	 */
	protected String observation_prop = OBSERVATION_PROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMean_observation_prop() <em>Mean observation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean_observation_prop()
	 * @generated
	 * @ordered
	 */
	protected static final String MEAN_OBSERVATION_PROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMean_observation_prop() <em>Mean observation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean_observation_prop()
	 * @generated
	 * @ordered
	 */
	protected String mean_observation_prop = MEAN_OBSERVATION_PROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStdev_observation_prop() <em>Stdev observation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdev_observation_prop()
	 * @generated
	 * @ordered
	 */
	protected static final String STDEV_OBSERVATION_PROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStdev_observation_prop() <em>Stdev observation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdev_observation_prop()
	 * @generated
	 * @ordered
	 */
	protected String stdev_observation_prop = STDEV_OBSERVATION_PROP_EDEFAULT;

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
	 * The default value of the '{@link #getBase_setpoint() <em>Base setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase_setpoint() <em>Base setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String base_setpoint = BASE_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamp_high() <em>Ramp high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamp_high()
	 * @generated
	 * @ordered
	 */
	protected static final String RAMP_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRamp_high() <em>Ramp high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamp_high()
	 * @generated
	 * @ordered
	 */
	protected String ramp_high = RAMP_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamp_low() <em>Ramp low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamp_low()
	 * @generated
	 * @ordered
	 */
	protected static final String RAMP_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRamp_low() <em>Ramp low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamp_low()
	 * @generated
	 * @ordered
	 */
	protected String ramp_low = RAMP_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange_high() <em>Range high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange_high()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGE_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange_high() <em>Range high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange_high()
	 * @generated
	 * @ordered
	 */
	protected String range_high = RANGE_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange_low() <em>Range low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange_low()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGE_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange_low() <em>Range low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange_low()
	 * @generated
	 * @ordered
	 */
	protected String range_low = RANGE_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getProb_off() <em>Prob off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb_off()
	 * @generated
	 * @ordered
	 */
	protected static final String PROB_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProb_off() <em>Prob off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb_off()
	 * @generated
	 * @ordered
	 */
	protected String prob_off = PROB_OFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_state() <em>Output state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_state()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_state() <em>Output state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_state()
	 * @generated
	 * @ordered
	 */
	protected String output_state = OUTPUT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_setpoint() <em>Output setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_setpoint() <em>Output setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String output_setpoint = OUTPUT_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getControl_mode() <em>Control mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControl_mode() <em>Control mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl_mode()
	 * @generated
	 * @ordered
	 */
	protected String control_mode = CONTROL_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Controller2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getController2();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput_state() {
		return input_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_state(String newInput_state) {
		String oldInput_state = input_state;
		input_state = newInput_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__INPUT_STATE, oldInput_state, input_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput_setpoint() {
		return input_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_setpoint(String newInput_setpoint) {
		String oldInput_setpoint = input_setpoint;
		input_setpoint = newInput_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__INPUT_SETPOINT, oldInput_setpoint, input_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput_chained() {
		return input_chained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_chained(String newInput_chained) {
		String oldInput_chained = input_chained;
		input_chained = newInput_chained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__INPUT_CHAINED, oldInput_chained, input_chained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(String newObservation) {
		String oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__OBSERVATION, oldObservation, observation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMean_observation() {
		return mean_observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean_observation(String newMean_observation) {
		String oldMean_observation = mean_observation;
		mean_observation = newMean_observation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__MEAN_OBSERVATION, oldMean_observation, mean_observation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStdev_observation() {
		return stdev_observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdev_observation(String newStdev_observation) {
		String oldStdev_observation = stdev_observation;
		stdev_observation = newStdev_observation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__STDEV_OBSERVATION, oldStdev_observation, stdev_observation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpectation() {
		return expectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectation(String newExpectation) {
		String oldExpectation = expectation;
		expectation = newExpectation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__EXPECTATION, oldExpectation, expectation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetpoint() {
		return setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetpoint(String newSetpoint) {
		String oldSetpoint = setpoint;
		setpoint = newSetpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__SETPOINT, oldSetpoint, setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSensitivity() {
		return sensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensitivity(String newSensitivity) {
		String oldSensitivity = sensitivity;
		sensitivity = newSensitivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__SENSITIVITY, oldSensitivity, sensitivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(String newPeriod) {
		String oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpectation_prop() {
		return expectation_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectation_prop(String newExpectation_prop) {
		String oldExpectation_prop = expectation_prop;
		expectation_prop = newExpectation_prop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__EXPECTATION_PROP, oldExpectation_prop, expectation_prop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpectation_obj() {
		return expectation_obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectation_obj(String newExpectation_obj) {
		String oldExpectation_obj = expectation_obj;
		expectation_obj = newExpectation_obj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__EXPECTATION_OBJ, oldExpectation_obj, expectation_obj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetpoint_prop() {
		return setpoint_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetpoint_prop(String newSetpoint_prop) {
		String oldSetpoint_prop = setpoint_prop;
		setpoint_prop = newSetpoint_prop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__SETPOINT_PROP, oldSetpoint_prop, setpoint_prop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState_prop() {
		return state_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState_prop(String newState_prop) {
		String oldState_prop = state_prop;
		state_prop = newState_prop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__STATE_PROP, oldState_prop, state_prop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservation_obj() {
		return observation_obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation_obj(String newObservation_obj) {
		String oldObservation_obj = observation_obj;
		observation_obj = newObservation_obj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__OBSERVATION_OBJ, oldObservation_obj, observation_obj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservation_prop() {
		return observation_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation_prop(String newObservation_prop) {
		String oldObservation_prop = observation_prop;
		observation_prop = newObservation_prop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__OBSERVATION_PROP, oldObservation_prop, observation_prop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMean_observation_prop() {
		return mean_observation_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean_observation_prop(String newMean_observation_prop) {
		String oldMean_observation_prop = mean_observation_prop;
		mean_observation_prop = newMean_observation_prop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__MEAN_OBSERVATION_PROP, oldMean_observation_prop, mean_observation_prop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStdev_observation_prop() {
		return stdev_observation_prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdev_observation_prop(String newStdev_observation_prop) {
		String oldStdev_observation_prop = stdev_observation_prop;
		stdev_observation_prop = newStdev_observation_prop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__STDEV_OBSERVATION_PROP, oldStdev_observation_prop, stdev_observation_prop));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__CYCLE_LENGTH, oldCycle_length, cycle_length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase_setpoint() {
		return base_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_setpoint(String newBase_setpoint) {
		String oldBase_setpoint = base_setpoint;
		base_setpoint = newBase_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__BASE_SETPOINT, oldBase_setpoint, base_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRamp_high() {
		return ramp_high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamp_high(String newRamp_high) {
		String oldRamp_high = ramp_high;
		ramp_high = newRamp_high;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__RAMP_HIGH, oldRamp_high, ramp_high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRamp_low() {
		return ramp_low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamp_low(String newRamp_low) {
		String oldRamp_low = ramp_low;
		ramp_low = newRamp_low;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__RAMP_LOW, oldRamp_low, ramp_low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRange_high() {
		return range_high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange_high(String newRange_high) {
		String oldRange_high = range_high;
		range_high = newRange_high;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__RANGE_HIGH, oldRange_high, range_high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRange_low() {
		return range_low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange_low(String newRange_low) {
		String oldRange_low = range_low;
		range_low = newRange_low;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__RANGE_LOW, oldRange_low, range_low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProb_off() {
		return prob_off;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProb_off(String newProb_off) {
		String oldProb_off = prob_off;
		prob_off = newProb_off;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__PROB_OFF, oldProb_off, prob_off));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_state() {
		return output_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_state(String newOutput_state) {
		String oldOutput_state = output_state;
		output_state = newOutput_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__OUTPUT_STATE, oldOutput_state, output_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_setpoint() {
		return output_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_setpoint(String newOutput_setpoint) {
		String oldOutput_setpoint = output_setpoint;
		output_setpoint = newOutput_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__OUTPUT_SETPOINT, oldOutput_setpoint, output_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControl_mode() {
		return control_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl_mode(String newControl_mode) {
		String oldControl_mode = control_mode;
		control_mode = newControl_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER2__CONTROL_MODE, oldControl_mode, control_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.CONTROLLER2__NAME:
				return getName();
			case VisGridPackage.CONTROLLER2__INPUT_STATE:
				return getInput_state();
			case VisGridPackage.CONTROLLER2__INPUT_SETPOINT:
				return getInput_setpoint();
			case VisGridPackage.CONTROLLER2__INPUT_CHAINED:
				return getInput_chained();
			case VisGridPackage.CONTROLLER2__OBSERVATION:
				return getObservation();
			case VisGridPackage.CONTROLLER2__MEAN_OBSERVATION:
				return getMean_observation();
			case VisGridPackage.CONTROLLER2__STDEV_OBSERVATION:
				return getStdev_observation();
			case VisGridPackage.CONTROLLER2__EXPECTATION:
				return getExpectation();
			case VisGridPackage.CONTROLLER2__SETPOINT:
				return getSetpoint();
			case VisGridPackage.CONTROLLER2__SENSITIVITY:
				return getSensitivity();
			case VisGridPackage.CONTROLLER2__PERIOD:
				return getPeriod();
			case VisGridPackage.CONTROLLER2__EXPECTATION_PROP:
				return getExpectation_prop();
			case VisGridPackage.CONTROLLER2__EXPECTATION_OBJ:
				return getExpectation_obj();
			case VisGridPackage.CONTROLLER2__SETPOINT_PROP:
				return getSetpoint_prop();
			case VisGridPackage.CONTROLLER2__STATE_PROP:
				return getState_prop();
			case VisGridPackage.CONTROLLER2__OBSERVATION_OBJ:
				return getObservation_obj();
			case VisGridPackage.CONTROLLER2__OBSERVATION_PROP:
				return getObservation_prop();
			case VisGridPackage.CONTROLLER2__MEAN_OBSERVATION_PROP:
				return getMean_observation_prop();
			case VisGridPackage.CONTROLLER2__STDEV_OBSERVATION_PROP:
				return getStdev_observation_prop();
			case VisGridPackage.CONTROLLER2__CYCLE_LENGTH:
				return getCycle_length();
			case VisGridPackage.CONTROLLER2__BASE_SETPOINT:
				return getBase_setpoint();
			case VisGridPackage.CONTROLLER2__RAMP_HIGH:
				return getRamp_high();
			case VisGridPackage.CONTROLLER2__RAMP_LOW:
				return getRamp_low();
			case VisGridPackage.CONTROLLER2__RANGE_HIGH:
				return getRange_high();
			case VisGridPackage.CONTROLLER2__RANGE_LOW:
				return getRange_low();
			case VisGridPackage.CONTROLLER2__PROB_OFF:
				return getProb_off();
			case VisGridPackage.CONTROLLER2__OUTPUT_STATE:
				return getOutput_state();
			case VisGridPackage.CONTROLLER2__OUTPUT_SETPOINT:
				return getOutput_setpoint();
			case VisGridPackage.CONTROLLER2__CONTROL_MODE:
				return getControl_mode();
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
			case VisGridPackage.CONTROLLER2__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__INPUT_STATE:
				setInput_state((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__INPUT_SETPOINT:
				setInput_setpoint((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__INPUT_CHAINED:
				setInput_chained((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__OBSERVATION:
				setObservation((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__MEAN_OBSERVATION:
				setMean_observation((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__STDEV_OBSERVATION:
				setStdev_observation((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__EXPECTATION:
				setExpectation((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__SETPOINT:
				setSetpoint((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__SENSITIVITY:
				setSensitivity((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__PERIOD:
				setPeriod((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__EXPECTATION_PROP:
				setExpectation_prop((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__EXPECTATION_OBJ:
				setExpectation_obj((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__SETPOINT_PROP:
				setSetpoint_prop((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__STATE_PROP:
				setState_prop((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__OBSERVATION_OBJ:
				setObservation_obj((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__OBSERVATION_PROP:
				setObservation_prop((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__MEAN_OBSERVATION_PROP:
				setMean_observation_prop((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__STDEV_OBSERVATION_PROP:
				setStdev_observation_prop((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__CYCLE_LENGTH:
				setCycle_length((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__BASE_SETPOINT:
				setBase_setpoint((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__RAMP_HIGH:
				setRamp_high((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__RAMP_LOW:
				setRamp_low((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__RANGE_HIGH:
				setRange_high((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__RANGE_LOW:
				setRange_low((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__PROB_OFF:
				setProb_off((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__OUTPUT_STATE:
				setOutput_state((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__OUTPUT_SETPOINT:
				setOutput_setpoint((String)newValue);
				return;
			case VisGridPackage.CONTROLLER2__CONTROL_MODE:
				setControl_mode((String)newValue);
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
			case VisGridPackage.CONTROLLER2__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__INPUT_STATE:
				setInput_state(INPUT_STATE_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__INPUT_SETPOINT:
				setInput_setpoint(INPUT_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__INPUT_CHAINED:
				setInput_chained(INPUT_CHAINED_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__OBSERVATION:
				setObservation(OBSERVATION_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__MEAN_OBSERVATION:
				setMean_observation(MEAN_OBSERVATION_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__STDEV_OBSERVATION:
				setStdev_observation(STDEV_OBSERVATION_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__EXPECTATION:
				setExpectation(EXPECTATION_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__SETPOINT:
				setSetpoint(SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__SENSITIVITY:
				setSensitivity(SENSITIVITY_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__EXPECTATION_PROP:
				setExpectation_prop(EXPECTATION_PROP_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__EXPECTATION_OBJ:
				setExpectation_obj(EXPECTATION_OBJ_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__SETPOINT_PROP:
				setSetpoint_prop(SETPOINT_PROP_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__STATE_PROP:
				setState_prop(STATE_PROP_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__OBSERVATION_OBJ:
				setObservation_obj(OBSERVATION_OBJ_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__OBSERVATION_PROP:
				setObservation_prop(OBSERVATION_PROP_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__MEAN_OBSERVATION_PROP:
				setMean_observation_prop(MEAN_OBSERVATION_PROP_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__STDEV_OBSERVATION_PROP:
				setStdev_observation_prop(STDEV_OBSERVATION_PROP_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__CYCLE_LENGTH:
				setCycle_length(CYCLE_LENGTH_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__BASE_SETPOINT:
				setBase_setpoint(BASE_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__RAMP_HIGH:
				setRamp_high(RAMP_HIGH_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__RAMP_LOW:
				setRamp_low(RAMP_LOW_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__RANGE_HIGH:
				setRange_high(RANGE_HIGH_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__RANGE_LOW:
				setRange_low(RANGE_LOW_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__PROB_OFF:
				setProb_off(PROB_OFF_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__OUTPUT_STATE:
				setOutput_state(OUTPUT_STATE_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__OUTPUT_SETPOINT:
				setOutput_setpoint(OUTPUT_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER2__CONTROL_MODE:
				setControl_mode(CONTROL_MODE_EDEFAULT);
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
			case VisGridPackage.CONTROLLER2__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.CONTROLLER2__INPUT_STATE:
				return INPUT_STATE_EDEFAULT == null ? input_state != null : !INPUT_STATE_EDEFAULT.equals(input_state);
			case VisGridPackage.CONTROLLER2__INPUT_SETPOINT:
				return INPUT_SETPOINT_EDEFAULT == null ? input_setpoint != null : !INPUT_SETPOINT_EDEFAULT.equals(input_setpoint);
			case VisGridPackage.CONTROLLER2__INPUT_CHAINED:
				return INPUT_CHAINED_EDEFAULT == null ? input_chained != null : !INPUT_CHAINED_EDEFAULT.equals(input_chained);
			case VisGridPackage.CONTROLLER2__OBSERVATION:
				return OBSERVATION_EDEFAULT == null ? observation != null : !OBSERVATION_EDEFAULT.equals(observation);
			case VisGridPackage.CONTROLLER2__MEAN_OBSERVATION:
				return MEAN_OBSERVATION_EDEFAULT == null ? mean_observation != null : !MEAN_OBSERVATION_EDEFAULT.equals(mean_observation);
			case VisGridPackage.CONTROLLER2__STDEV_OBSERVATION:
				return STDEV_OBSERVATION_EDEFAULT == null ? stdev_observation != null : !STDEV_OBSERVATION_EDEFAULT.equals(stdev_observation);
			case VisGridPackage.CONTROLLER2__EXPECTATION:
				return EXPECTATION_EDEFAULT == null ? expectation != null : !EXPECTATION_EDEFAULT.equals(expectation);
			case VisGridPackage.CONTROLLER2__SETPOINT:
				return SETPOINT_EDEFAULT == null ? setpoint != null : !SETPOINT_EDEFAULT.equals(setpoint);
			case VisGridPackage.CONTROLLER2__SENSITIVITY:
				return SENSITIVITY_EDEFAULT == null ? sensitivity != null : !SENSITIVITY_EDEFAULT.equals(sensitivity);
			case VisGridPackage.CONTROLLER2__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case VisGridPackage.CONTROLLER2__EXPECTATION_PROP:
				return EXPECTATION_PROP_EDEFAULT == null ? expectation_prop != null : !EXPECTATION_PROP_EDEFAULT.equals(expectation_prop);
			case VisGridPackage.CONTROLLER2__EXPECTATION_OBJ:
				return EXPECTATION_OBJ_EDEFAULT == null ? expectation_obj != null : !EXPECTATION_OBJ_EDEFAULT.equals(expectation_obj);
			case VisGridPackage.CONTROLLER2__SETPOINT_PROP:
				return SETPOINT_PROP_EDEFAULT == null ? setpoint_prop != null : !SETPOINT_PROP_EDEFAULT.equals(setpoint_prop);
			case VisGridPackage.CONTROLLER2__STATE_PROP:
				return STATE_PROP_EDEFAULT == null ? state_prop != null : !STATE_PROP_EDEFAULT.equals(state_prop);
			case VisGridPackage.CONTROLLER2__OBSERVATION_OBJ:
				return OBSERVATION_OBJ_EDEFAULT == null ? observation_obj != null : !OBSERVATION_OBJ_EDEFAULT.equals(observation_obj);
			case VisGridPackage.CONTROLLER2__OBSERVATION_PROP:
				return OBSERVATION_PROP_EDEFAULT == null ? observation_prop != null : !OBSERVATION_PROP_EDEFAULT.equals(observation_prop);
			case VisGridPackage.CONTROLLER2__MEAN_OBSERVATION_PROP:
				return MEAN_OBSERVATION_PROP_EDEFAULT == null ? mean_observation_prop != null : !MEAN_OBSERVATION_PROP_EDEFAULT.equals(mean_observation_prop);
			case VisGridPackage.CONTROLLER2__STDEV_OBSERVATION_PROP:
				return STDEV_OBSERVATION_PROP_EDEFAULT == null ? stdev_observation_prop != null : !STDEV_OBSERVATION_PROP_EDEFAULT.equals(stdev_observation_prop);
			case VisGridPackage.CONTROLLER2__CYCLE_LENGTH:
				return CYCLE_LENGTH_EDEFAULT == null ? cycle_length != null : !CYCLE_LENGTH_EDEFAULT.equals(cycle_length);
			case VisGridPackage.CONTROLLER2__BASE_SETPOINT:
				return BASE_SETPOINT_EDEFAULT == null ? base_setpoint != null : !BASE_SETPOINT_EDEFAULT.equals(base_setpoint);
			case VisGridPackage.CONTROLLER2__RAMP_HIGH:
				return RAMP_HIGH_EDEFAULT == null ? ramp_high != null : !RAMP_HIGH_EDEFAULT.equals(ramp_high);
			case VisGridPackage.CONTROLLER2__RAMP_LOW:
				return RAMP_LOW_EDEFAULT == null ? ramp_low != null : !RAMP_LOW_EDEFAULT.equals(ramp_low);
			case VisGridPackage.CONTROLLER2__RANGE_HIGH:
				return RANGE_HIGH_EDEFAULT == null ? range_high != null : !RANGE_HIGH_EDEFAULT.equals(range_high);
			case VisGridPackage.CONTROLLER2__RANGE_LOW:
				return RANGE_LOW_EDEFAULT == null ? range_low != null : !RANGE_LOW_EDEFAULT.equals(range_low);
			case VisGridPackage.CONTROLLER2__PROB_OFF:
				return PROB_OFF_EDEFAULT == null ? prob_off != null : !PROB_OFF_EDEFAULT.equals(prob_off);
			case VisGridPackage.CONTROLLER2__OUTPUT_STATE:
				return OUTPUT_STATE_EDEFAULT == null ? output_state != null : !OUTPUT_STATE_EDEFAULT.equals(output_state);
			case VisGridPackage.CONTROLLER2__OUTPUT_SETPOINT:
				return OUTPUT_SETPOINT_EDEFAULT == null ? output_setpoint != null : !OUTPUT_SETPOINT_EDEFAULT.equals(output_setpoint);
			case VisGridPackage.CONTROLLER2__CONTROL_MODE:
				return CONTROL_MODE_EDEFAULT == null ? control_mode != null : !CONTROL_MODE_EDEFAULT.equals(control_mode);
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
		result.append(", input_state: ");
		result.append(input_state);
		result.append(", input_setpoint: ");
		result.append(input_setpoint);
		result.append(", input_chained: ");
		result.append(input_chained);
		result.append(", observation: ");
		result.append(observation);
		result.append(", mean_observation: ");
		result.append(mean_observation);
		result.append(", stdev_observation: ");
		result.append(stdev_observation);
		result.append(", expectation: ");
		result.append(expectation);
		result.append(", setpoint: ");
		result.append(setpoint);
		result.append(", sensitivity: ");
		result.append(sensitivity);
		result.append(", period: ");
		result.append(period);
		result.append(", expectation_prop: ");
		result.append(expectation_prop);
		result.append(", expectation_obj: ");
		result.append(expectation_obj);
		result.append(", setpoint_prop: ");
		result.append(setpoint_prop);
		result.append(", state_prop: ");
		result.append(state_prop);
		result.append(", observation_obj: ");
		result.append(observation_obj);
		result.append(", observation_prop: ");
		result.append(observation_prop);
		result.append(", mean_observation_prop: ");
		result.append(mean_observation_prop);
		result.append(", stdev_observation_prop: ");
		result.append(stdev_observation_prop);
		result.append(", cycle_length: ");
		result.append(cycle_length);
		result.append(", base_setpoint: ");
		result.append(base_setpoint);
		result.append(", ramp_high: ");
		result.append(ramp_high);
		result.append(", ramp_low: ");
		result.append(ramp_low);
		result.append(", range_high: ");
		result.append(range_high);
		result.append(", range_low: ");
		result.append(range_low);
		result.append(", prob_off: ");
		result.append(prob_off);
		result.append(", output_state: ");
		result.append(output_state);
		result.append(", output_setpoint: ");
		result.append(output_setpoint);
		result.append(", control_mode: ");
		result.append(control_mode);
		result.append(')');
		return result.toString();
	}

} //Controller2Impl
