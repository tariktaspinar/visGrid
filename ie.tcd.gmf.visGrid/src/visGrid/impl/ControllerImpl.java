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

import visGrid.Controller;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.ControllerImpl#getSimple_mode <em>Simple mode</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getBid_mode <em>Bid mode</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getRamp_low <em>Ramp low</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getRamp_high <em>Ramp high</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getTmin <em>Tmin</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getTmax <em>Tmax</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getSetpoint <em>Setpoint</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getMarket <em>Market</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getBid_price <em>Bid price</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getBid_quant <em>Bid quant</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getSet_temp <em>Set temp</em>}</li>
 *   <li>{@link visGrid.impl.ControllerImpl#getBase_setpoint <em>Base setpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerImpl extends ConnectionImpl implements Controller {
	// Generated by python script located in this directory
       boolean threadLock = false;
       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();
       URI imagesURI;
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
	 * The default value of the '{@link #getSimple_mode() <em>Simple mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimple_mode() <em>Simple mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple_mode()
	 * @generated
	 * @ordered
	 */
	protected String simple_mode = SIMPLE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBid_mode() <em>Bid mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBid_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String BID_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBid_mode() <em>Bid mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBid_mode()
	 * @generated
	 * @ordered
	 */
	protected String bid_mode = BID_MODE_EDEFAULT;

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
	 * The default value of the '{@link #getTmin() <em>Tmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmin()
	 * @generated
	 * @ordered
	 */
	protected static final String TMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTmin() <em>Tmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmin()
	 * @generated
	 * @ordered
	 */
	protected String tmin = TMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTmax() <em>Tmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmax()
	 * @generated
	 * @ordered
	 */
	protected static final String TMAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTmax() <em>Tmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmax()
	 * @generated
	 * @ordered
	 */
	protected String tmax = TMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

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
	 * The default value of the '{@link #getDemand() <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand()
	 * @generated
	 * @ordered
	 */
	protected static final String DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDemand() <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand()
	 * @generated
	 * @ordered
	 */
	protected String demand = DEMAND_EDEFAULT;

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
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected String total = TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarket() <em>Market</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarket()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarket() <em>Market</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarket()
	 * @generated
	 * @ordered
	 */
	protected String market = MARKET_EDEFAULT;

	/**
	 * The default value of the '{@link #getBid_price() <em>Bid price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBid_price()
	 * @generated
	 * @ordered
	 */
	protected static final String BID_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBid_price() <em>Bid price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBid_price()
	 * @generated
	 * @ordered
	 */
	protected String bid_price = BID_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBid_quant() <em>Bid quant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBid_quant()
	 * @generated
	 * @ordered
	 */
	protected static final String BID_QUANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBid_quant() <em>Bid quant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBid_quant()
	 * @generated
	 * @ordered
	 */
	protected String bid_quant = BID_QUANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSet_temp() <em>Set temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet_temp()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSet_temp() <em>Set temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet_temp()
	 * @generated
	 * @ordered
	 */
	protected String set_temp = SET_TEMP_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
		File tempFile = new File("");
        try {
                imagesURI = new URI(tempFile.getAbsolutePath() +"/visGridImages/");
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimple_mode() {
		// Generated by python script located in this directory
			if (!lock.containsKey("simple_mode")) lock.put("simple_mode", new Boolean(false));
			if (!(Boolean)lock.get("simple_mode")){
				lock.put("simple_mode", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"simple_mode");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Simple_mode");
					simple_mode= val;
			}
		return simple_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimple_mode(String newSimple_mode) {
		String oldSimple_mode = simple_mode;
		simple_mode = newSimple_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__SIMPLE_MODE, oldSimple_mode, simple_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBid_mode() {
		// Generated by python script located in this directory
			if (!lock.containsKey("bid_mode")) lock.put("bid_mode", new Boolean(false));
			if (!(Boolean)lock.get("bid_mode")){
				lock.put("bid_mode", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"bid_mode");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Bid_mode");
					bid_mode= val;
			}
		return bid_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBid_mode(String newBid_mode) {
		String oldBid_mode = bid_mode;
		bid_mode = newBid_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__BID_MODE, oldBid_mode, bid_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRamp_low() {
		// Generated by python script located in this directory
			if (!lock.containsKey("ramp_low")) lock.put("ramp_low", new Boolean(false));
			if (!(Boolean)lock.get("ramp_low")){
				lock.put("ramp_low", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"ramp_low");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Ramp_low");
					ramp_low= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__RAMP_LOW, oldRamp_low, ramp_low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRamp_high() {
		// Generated by python script located in this directory
			if (!lock.containsKey("ramp_high")) lock.put("ramp_high", new Boolean(false));
			if (!(Boolean)lock.get("ramp_high")){
				lock.put("ramp_high", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"ramp_high");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Ramp_high");
					ramp_high= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__RAMP_HIGH, oldRamp_high, ramp_high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTmin() {
		// Generated by python script located in this directory
			if (!lock.containsKey("tmin")) lock.put("tmin", new Boolean(false));
			if (!(Boolean)lock.get("tmin")){
				lock.put("tmin", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"tmin");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Tmin");
					tmin= val;
			}
		return tmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmin(String newTmin) {
		String oldTmin = tmin;
		tmin = newTmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__TMIN, oldTmin, tmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTmax() {
		// Generated by python script located in this directory
			if (!lock.containsKey("tmax")) lock.put("tmax", new Boolean(false));
			if (!(Boolean)lock.get("tmax")){
				lock.put("tmax", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"tmax");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Tmax");
					tmax= val;
			}
		return tmax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmax(String newTmax) {
		String oldTmax = tmax;
		tmax = newTmax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__TMAX, oldTmax, tmax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		// Generated by python script located in this directory
			if (!lock.containsKey("target")) lock.put("target", new Boolean(false));
			if (!(Boolean)lock.get("target")){
				lock.put("target", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"target");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Target");
					target= val;
			}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetpoint() {
		// Generated by python script located in this directory
			if (!lock.containsKey("setpoint")) lock.put("setpoint", new Boolean(false));
			if (!(Boolean)lock.get("setpoint")){
				lock.put("setpoint", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"setpoint");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Setpoint");
					setpoint= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__SETPOINT, oldSetpoint, setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDemand() {
		// Generated by python script located in this directory
			if (!lock.containsKey("demand")) lock.put("demand", new Boolean(false));
			if (!(Boolean)lock.get("demand")){
				lock.put("demand", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Demand");
					demand= val;
			}
		return demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemand(String newDemand) {
		String oldDemand = demand;
		demand = newDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__DEMAND, oldDemand, demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoad() {
		// Generated by python script located in this directory
			if (!lock.containsKey("load")) lock.put("load", new Boolean(false));
			if (!(Boolean)lock.get("load")){
				lock.put("load", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"load");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Load");
					load= val;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotal() {
		// Generated by python script located in this directory
			if (!lock.containsKey("total")) lock.put("total", new Boolean(false));
			if (!(Boolean)lock.get("total")){
				lock.put("total", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"total");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Total");
					total= val;
			}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(String newTotal) {
		String oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarket() {
		// Generated by python script located in this directory
			if (!lock.containsKey("market")) lock.put("market", new Boolean(false));
			if (!(Boolean)lock.get("market")){
				lock.put("market", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"market");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Market");
					market= val;
			}
		return market;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarket(String newMarket) {
		String oldMarket = market;
		market = newMarket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__MARKET, oldMarket, market));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBid_price() {
		// Generated by python script located in this directory
			if (!lock.containsKey("bid_price")) lock.put("bid_price", new Boolean(false));
			if (!(Boolean)lock.get("bid_price")){
				lock.put("bid_price", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"bid_price");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Bid_price");
					bid_price= val;
			}
		return bid_price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBid_price(String newBid_price) {
		String oldBid_price = bid_price;
		bid_price = newBid_price;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__BID_PRICE, oldBid_price, bid_price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBid_quant() {
		// Generated by python script located in this directory
			if (!lock.containsKey("bid_quant")) lock.put("bid_quant", new Boolean(false));
			if (!(Boolean)lock.get("bid_quant")){
				lock.put("bid_quant", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"bid_quant");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Bid_quant");
					bid_quant= val;
			}
		return bid_quant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBid_quant(String newBid_quant) {
		String oldBid_quant = bid_quant;
		bid_quant = newBid_quant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__BID_QUANT, oldBid_quant, bid_quant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSet_temp() {
		// Generated by python script located in this directory
			if (!lock.containsKey("set_temp")) lock.put("set_temp", new Boolean(false));
			if (!(Boolean)lock.get("set_temp")){
				lock.put("set_temp", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"set_temp");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Set_temp");
					set_temp= val;
			}
		return set_temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet_temp(String newSet_temp) {
		String oldSet_temp = set_temp;
		set_temp = newSet_temp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__SET_TEMP, oldSet_temp, set_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase_setpoint() {
		// Generated by python script located in this directory
			if (!lock.containsKey("base_setpoint")) lock.put("base_setpoint", new Boolean(false));
			if (!(Boolean)lock.get("base_setpoint")){
				lock.put("base_setpoint", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"base_setpoint");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Base_setpoint");
					base_setpoint= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CONTROLLER__BASE_SETPOINT, oldBase_setpoint, base_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.CONTROLLER__SIMPLE_MODE:
				return getSimple_mode();
			case VisGridPackage.CONTROLLER__BID_MODE:
				return getBid_mode();
			case VisGridPackage.CONTROLLER__RAMP_LOW:
				return getRamp_low();
			case VisGridPackage.CONTROLLER__RAMP_HIGH:
				return getRamp_high();
			case VisGridPackage.CONTROLLER__TMIN:
				return getTmin();
			case VisGridPackage.CONTROLLER__TMAX:
				return getTmax();
			case VisGridPackage.CONTROLLER__TARGET:
				return getTarget();
			case VisGridPackage.CONTROLLER__SETPOINT:
				return getSetpoint();
			case VisGridPackage.CONTROLLER__DEMAND:
				return getDemand();
			case VisGridPackage.CONTROLLER__LOAD:
				return getLoad();
			case VisGridPackage.CONTROLLER__TOTAL:
				return getTotal();
			case VisGridPackage.CONTROLLER__MARKET:
				return getMarket();
			case VisGridPackage.CONTROLLER__BID_PRICE:
				return getBid_price();
			case VisGridPackage.CONTROLLER__BID_QUANT:
				return getBid_quant();
			case VisGridPackage.CONTROLLER__SET_TEMP:
				return getSet_temp();
			case VisGridPackage.CONTROLLER__BASE_SETPOINT:
				return getBase_setpoint();
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
			case VisGridPackage.CONTROLLER__SIMPLE_MODE:
				setSimple_mode((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__BID_MODE:
				setBid_mode((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__RAMP_LOW:
				setRamp_low((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__RAMP_HIGH:
				setRamp_high((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__TMIN:
				setTmin((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__TMAX:
				setTmax((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__TARGET:
				setTarget((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__SETPOINT:
				setSetpoint((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__DEMAND:
				setDemand((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__TOTAL:
				setTotal((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__MARKET:
				setMarket((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__BID_PRICE:
				setBid_price((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__BID_QUANT:
				setBid_quant((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__SET_TEMP:
				setSet_temp((String)newValue);
				return;
			case VisGridPackage.CONTROLLER__BASE_SETPOINT:
				setBase_setpoint((String)newValue);
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
			case VisGridPackage.CONTROLLER__SIMPLE_MODE:
				setSimple_mode(SIMPLE_MODE_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__BID_MODE:
				setBid_mode(BID_MODE_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__RAMP_LOW:
				setRamp_low(RAMP_LOW_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__RAMP_HIGH:
				setRamp_high(RAMP_HIGH_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__TMIN:
				setTmin(TMIN_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__TMAX:
				setTmax(TMAX_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__SETPOINT:
				setSetpoint(SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__DEMAND:
				setDemand(DEMAND_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__TOTAL:
				setTotal(TOTAL_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__MARKET:
				setMarket(MARKET_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__BID_PRICE:
				setBid_price(BID_PRICE_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__BID_QUANT:
				setBid_quant(BID_QUANT_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__SET_TEMP:
				setSet_temp(SET_TEMP_EDEFAULT);
				return;
			case VisGridPackage.CONTROLLER__BASE_SETPOINT:
				setBase_setpoint(BASE_SETPOINT_EDEFAULT);
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
			case VisGridPackage.CONTROLLER__SIMPLE_MODE:
				return SIMPLE_MODE_EDEFAULT == null ? simple_mode != null : !SIMPLE_MODE_EDEFAULT.equals(simple_mode);
			case VisGridPackage.CONTROLLER__BID_MODE:
				return BID_MODE_EDEFAULT == null ? bid_mode != null : !BID_MODE_EDEFAULT.equals(bid_mode);
			case VisGridPackage.CONTROLLER__RAMP_LOW:
				return RAMP_LOW_EDEFAULT == null ? ramp_low != null : !RAMP_LOW_EDEFAULT.equals(ramp_low);
			case VisGridPackage.CONTROLLER__RAMP_HIGH:
				return RAMP_HIGH_EDEFAULT == null ? ramp_high != null : !RAMP_HIGH_EDEFAULT.equals(ramp_high);
			case VisGridPackage.CONTROLLER__TMIN:
				return TMIN_EDEFAULT == null ? tmin != null : !TMIN_EDEFAULT.equals(tmin);
			case VisGridPackage.CONTROLLER__TMAX:
				return TMAX_EDEFAULT == null ? tmax != null : !TMAX_EDEFAULT.equals(tmax);
			case VisGridPackage.CONTROLLER__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case VisGridPackage.CONTROLLER__SETPOINT:
				return SETPOINT_EDEFAULT == null ? setpoint != null : !SETPOINT_EDEFAULT.equals(setpoint);
			case VisGridPackage.CONTROLLER__DEMAND:
				return DEMAND_EDEFAULT == null ? demand != null : !DEMAND_EDEFAULT.equals(demand);
			case VisGridPackage.CONTROLLER__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.CONTROLLER__TOTAL:
				return TOTAL_EDEFAULT == null ? total != null : !TOTAL_EDEFAULT.equals(total);
			case VisGridPackage.CONTROLLER__MARKET:
				return MARKET_EDEFAULT == null ? market != null : !MARKET_EDEFAULT.equals(market);
			case VisGridPackage.CONTROLLER__BID_PRICE:
				return BID_PRICE_EDEFAULT == null ? bid_price != null : !BID_PRICE_EDEFAULT.equals(bid_price);
			case VisGridPackage.CONTROLLER__BID_QUANT:
				return BID_QUANT_EDEFAULT == null ? bid_quant != null : !BID_QUANT_EDEFAULT.equals(bid_quant);
			case VisGridPackage.CONTROLLER__SET_TEMP:
				return SET_TEMP_EDEFAULT == null ? set_temp != null : !SET_TEMP_EDEFAULT.equals(set_temp);
			case VisGridPackage.CONTROLLER__BASE_SETPOINT:
				return BASE_SETPOINT_EDEFAULT == null ? base_setpoint != null : !BASE_SETPOINT_EDEFAULT.equals(base_setpoint);
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
		result.append(" (simple_mode: ");
		result.append(simple_mode);
		result.append(", bid_mode: ");
		result.append(bid_mode);
		result.append(", ramp_low: ");
		result.append(ramp_low);
		result.append(", ramp_high: ");
		result.append(ramp_high);
		result.append(", Tmin: ");
		result.append(tmin);
		result.append(", Tmax: ");
		result.append(tmax);
		result.append(", target: ");
		result.append(target);
		result.append(", setpoint: ");
		result.append(setpoint);
		result.append(", demand: ");
		result.append(demand);
		result.append(", load: ");
		result.append(load);
		result.append(", total: ");
		result.append(total);
		result.append(", market: ");
		result.append(market);
		result.append(", bid_price: ");
		result.append(bid_price);
		result.append(", bid_quant: ");
		result.append(bid_quant);
		result.append(", set_temp: ");
		result.append(set_temp);
		result.append(", base_setpoint: ");
		result.append(base_setpoint);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
