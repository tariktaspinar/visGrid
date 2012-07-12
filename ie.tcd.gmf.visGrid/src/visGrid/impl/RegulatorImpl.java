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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.Regulator;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.RegulatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getVmax <em>Vmax</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getVmin <em>Vmin</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getVstep <em>Vstep</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getCTlink <em>CTlink</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getPTbus <em>PTbus</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getTimeDelay <em>Time Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegulatorImpl extends ConnectionImpl implements Regulator {
	// Generated by python script located in this directory
       boolean threadLock = false;
       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();

   private void checkUnlock() {
        if (threadLock) return;
        for (Map.Entry<String, Boolean> entry : lock.entrySet()){
            if (threadLock) return;
            if (entry.getValue().equals(false)) return;
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmax() <em>Vmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmax()
	 * @generated
	 * @ordered
	 */
	protected static final String VMAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmax() <em>Vmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmax()
	 * @generated
	 * @ordered
	 */
	protected String vmax = VMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmin() <em>Vmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmin()
	 * @generated
	 * @ordered
	 */
	protected static final String VMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmin() <em>Vmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmin()
	 * @generated
	 * @ordered
	 */
	protected String vmin = VMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVstep() <em>Vstep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVstep()
	 * @generated
	 * @ordered
	 */
	protected static final String VSTEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVstep() <em>Vstep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVstep()
	 * @generated
	 * @ordered
	 */
	protected String vstep = VSTEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCTlink() <em>CTlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTlink()
	 * @generated
	 * @ordered
	 */
	protected static final String CTLINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTlink() <em>CTlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTlink()
	 * @generated
	 * @ordered
	 */
	protected String cTlink = CTLINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPTbus() <em>PTbus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTbus()
	 * @generated
	 * @ordered
	 */
	protected static final String PTBUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPTbus() <em>PTbus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTbus()
	 * @generated
	 * @ordered
	 */
	protected String pTbus = PTBUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeDelay() <em>Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeDelay() <em>Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected String timeDelay = TIME_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getRegulator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		// Generated by python script located in this directory
			if (!lock.containsKey("type")) lock.put("type", new Boolean(false));
			if (!(Boolean)lock.get("type")){
				lock.put("type", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"type");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Type");
					type= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmax() {
		// Generated by python script located in this directory
			if (!lock.containsKey("vmax")) lock.put("vmax", new Boolean(false));
			if (!(Boolean)lock.get("vmax")){
				lock.put("vmax", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"vmax");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Vmax");
					vmax= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return vmax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmax(String newVmax) {
		String oldVmax = vmax;
		vmax = newVmax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__VMAX, oldVmax, vmax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmin() {
		// Generated by python script located in this directory
			if (!lock.containsKey("vmin")) lock.put("vmin", new Boolean(false));
			if (!(Boolean)lock.get("vmin")){
				lock.put("vmin", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"vmin");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Vmin");
					vmin= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return vmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmin(String newVmin) {
		String oldVmin = vmin;
		vmin = newVmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__VMIN, oldVmin, vmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVstep() {
		// Generated by python script located in this directory
			if (!lock.containsKey("vstep")) lock.put("vstep", new Boolean(false));
			if (!(Boolean)lock.get("vstep")){
				lock.put("vstep", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"vstep");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Vstep");
					vstep= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return vstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVstep(String newVstep) {
		String oldVstep = vstep;
		vstep = newVstep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__VSTEP, oldVstep, vstep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTlink() {
		// Generated by python script located in this directory
			if (!lock.containsKey("cTlink")) lock.put("cTlink", new Boolean(false));
			if (!(Boolean)lock.get("cTlink")){
				lock.put("cTlink", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"cTlink");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"CTlink");
					cTlink= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return cTlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTlink(String newCTlink) {
		String oldCTlink = cTlink;
		cTlink = newCTlink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__CTLINK, oldCTlink, cTlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPTbus() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pTbus")) lock.put("pTbus", new Boolean(false));
			if (!(Boolean)lock.get("pTbus")){
				lock.put("pTbus", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pTbus");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"PTbus");
					pTbus= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return pTbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTbus(String newPTbus) {
		String oldPTbus = pTbus;
		pTbus = newPTbus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__PTBUS, oldPTbus, pTbus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeDelay() {
		// Generated by python script located in this directory
			if (!lock.containsKey("timeDelay")) lock.put("timeDelay", new Boolean(false));
			if (!(Boolean)lock.get("timeDelay")){
				lock.put("timeDelay", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"timeDelay");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"TimeDelay");
					timeDelay= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return timeDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDelay(String newTimeDelay) {
		String oldTimeDelay = timeDelay;
		timeDelay = newTimeDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__TIME_DELAY, oldTimeDelay, timeDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.REGULATOR__TYPE:
				return getType();
			case VisGridPackage.REGULATOR__VMAX:
				return getVmax();
			case VisGridPackage.REGULATOR__VMIN:
				return getVmin();
			case VisGridPackage.REGULATOR__VSTEP:
				return getVstep();
			case VisGridPackage.REGULATOR__CTLINK:
				return getCTlink();
			case VisGridPackage.REGULATOR__PTBUS:
				return getPTbus();
			case VisGridPackage.REGULATOR__TIME_DELAY:
				return getTimeDelay();
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
			case VisGridPackage.REGULATOR__TYPE:
				setType((String)newValue);
				return;
			case VisGridPackage.REGULATOR__VMAX:
				setVmax((String)newValue);
				return;
			case VisGridPackage.REGULATOR__VMIN:
				setVmin((String)newValue);
				return;
			case VisGridPackage.REGULATOR__VSTEP:
				setVstep((String)newValue);
				return;
			case VisGridPackage.REGULATOR__CTLINK:
				setCTlink((String)newValue);
				return;
			case VisGridPackage.REGULATOR__PTBUS:
				setPTbus((String)newValue);
				return;
			case VisGridPackage.REGULATOR__TIME_DELAY:
				setTimeDelay((String)newValue);
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
			case VisGridPackage.REGULATOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__VMAX:
				setVmax(VMAX_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__VMIN:
				setVmin(VMIN_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__VSTEP:
				setVstep(VSTEP_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__CTLINK:
				setCTlink(CTLINK_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__PTBUS:
				setPTbus(PTBUS_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__TIME_DELAY:
				setTimeDelay(TIME_DELAY_EDEFAULT);
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
			case VisGridPackage.REGULATOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case VisGridPackage.REGULATOR__VMAX:
				return VMAX_EDEFAULT == null ? vmax != null : !VMAX_EDEFAULT.equals(vmax);
			case VisGridPackage.REGULATOR__VMIN:
				return VMIN_EDEFAULT == null ? vmin != null : !VMIN_EDEFAULT.equals(vmin);
			case VisGridPackage.REGULATOR__VSTEP:
				return VSTEP_EDEFAULT == null ? vstep != null : !VSTEP_EDEFAULT.equals(vstep);
			case VisGridPackage.REGULATOR__CTLINK:
				return CTLINK_EDEFAULT == null ? cTlink != null : !CTLINK_EDEFAULT.equals(cTlink);
			case VisGridPackage.REGULATOR__PTBUS:
				return PTBUS_EDEFAULT == null ? pTbus != null : !PTBUS_EDEFAULT.equals(pTbus);
			case VisGridPackage.REGULATOR__TIME_DELAY:
				return TIME_DELAY_EDEFAULT == null ? timeDelay != null : !TIME_DELAY_EDEFAULT.equals(timeDelay);
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
		result.append(" (Type: ");
		result.append(type);
		result.append(", Vmax: ");
		result.append(vmax);
		result.append(", Vmin: ");
		result.append(vmin);
		result.append(", Vstep: ");
		result.append(vstep);
		result.append(", CTlink: ");
		result.append(cTlink);
		result.append(", PTbus: ");
		result.append(pTbus);
		result.append(", TimeDelay: ");
		result.append(timeDelay);
		result.append(')');
		return result.toString();
	}

} //RegulatorImpl
