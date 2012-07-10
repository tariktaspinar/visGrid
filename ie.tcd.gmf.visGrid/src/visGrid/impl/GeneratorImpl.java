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

import visGrid.Generator;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.GeneratorImpl#getPdesired_MW <em>Pdesired MW</em>}</li>
 *   <li>{@link visGrid.impl.GeneratorImpl#getQdesired_MVAR <em>Qdesired MVAR</em>}</li>
 *   <li>{@link visGrid.impl.GeneratorImpl#getQcontrolled <em>Qcontrolled</em>}</li>
 *   <li>{@link visGrid.impl.GeneratorImpl#getPmax_MW <em>Pmax MW</em>}</li>
 *   <li>{@link visGrid.impl.GeneratorImpl#getQmin_MVAR <em>Qmin MVAR</em>}</li>
 *   <li>{@link visGrid.impl.GeneratorImpl#getQmax_MVAR <em>Qmax MVAR</em>}</li>
 *   <li>{@link visGrid.impl.GeneratorImpl#getQVa <em>QVa</em>}</li>
 *   <li>{@link visGrid.impl.GeneratorImpl#getQVb <em>QVb</em>}</li>
 *   <li>{@link visGrid.impl.GeneratorImpl#getQVc <em>QVc</em>}</li>
 *   <li>{@link visGrid.impl.GeneratorImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorImpl extends ConnectionImpl implements Generator {
		boolean lock = false;
	/**
	 * The default value of the '{@link #getPdesired_MW() <em>Pdesired MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdesired_MW()
	 * @generated
	 * @ordered
	 */
	protected static final String PDESIRED_MW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPdesired_MW() <em>Pdesired MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdesired_MW()
	 * @generated
	 * @ordered
	 */
	protected String pdesired_MW = PDESIRED_MW_EDEFAULT;

	/**
	 * The default value of the '{@link #getQdesired_MVAR() <em>Qdesired MVAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQdesired_MVAR()
	 * @generated
	 * @ordered
	 */
	protected static final String QDESIRED_MVAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQdesired_MVAR() <em>Qdesired MVAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQdesired_MVAR()
	 * @generated
	 * @ordered
	 */
	protected String qdesired_MVAR = QDESIRED_MVAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getQcontrolled() <em>Qcontrolled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQcontrolled()
	 * @generated
	 * @ordered
	 */
	protected static final String QCONTROLLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQcontrolled() <em>Qcontrolled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQcontrolled()
	 * @generated
	 * @ordered
	 */
	protected String qcontrolled = QCONTROLLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPmax_MW() <em>Pmax MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPmax_MW()
	 * @generated
	 * @ordered
	 */
	protected static final String PMAX_MW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPmax_MW() <em>Pmax MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPmax_MW()
	 * @generated
	 * @ordered
	 */
	protected String pmax_MW = PMAX_MW_EDEFAULT;

	/**
	 * The default value of the '{@link #getQmin_MVAR() <em>Qmin MVAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQmin_MVAR()
	 * @generated
	 * @ordered
	 */
	protected static final String QMIN_MVAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQmin_MVAR() <em>Qmin MVAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQmin_MVAR()
	 * @generated
	 * @ordered
	 */
	protected String qmin_MVAR = QMIN_MVAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getQmax_MVAR() <em>Qmax MVAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQmax_MVAR()
	 * @generated
	 * @ordered
	 */
	protected static final String QMAX_MVAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQmax_MVAR() <em>Qmax MVAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQmax_MVAR()
	 * @generated
	 * @ordered
	 */
	protected String qmax_MVAR = QMAX_MVAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getQVa() <em>QVa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVa()
	 * @generated
	 * @ordered
	 */
	protected static final String QVA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQVa() <em>QVa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVa()
	 * @generated
	 * @ordered
	 */
	protected String qVa = QVA_EDEFAULT;

	/**
	 * The default value of the '{@link #getQVb() <em>QVb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVb()
	 * @generated
	 * @ordered
	 */
	protected static final String QVB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQVb() <em>QVb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVb()
	 * @generated
	 * @ordered
	 */
	protected String qVb = QVB_EDEFAULT;

	/**
	 * The default value of the '{@link #getQVc() <em>QVc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVc()
	 * @generated
	 * @ordered
	 */
	protected static final String QVC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQVc() <em>QVc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVc()
	 * @generated
	 * @ordered
	 */
	protected String qVc = QVC_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getGenerator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPdesired_MW() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"pdesired_MW");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Pdesired_MW");
				pdesired_MW= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pdesired_MW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPdesired_MW(String newPdesired_MW) {
		String oldPdesired_MW = pdesired_MW;
		pdesired_MW = newPdesired_MW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GENERATOR__PDESIRED_MW, oldPdesired_MW, pdesired_MW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQdesired_MVAR() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"qdesired_MVAR");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qdesired_MVAR");
				qdesired_MVAR= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return qdesired_MVAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQdesired_MVAR(String newQdesired_MVAR) {
		String oldQdesired_MVAR = qdesired_MVAR;
		qdesired_MVAR = newQdesired_MVAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GENERATOR__QDESIRED_MVAR, oldQdesired_MVAR, qdesired_MVAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQcontrolled() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"qcontrolled");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qcontrolled");
				qcontrolled= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return qcontrolled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQcontrolled(String newQcontrolled) {
		String oldQcontrolled = qcontrolled;
		qcontrolled = newQcontrolled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GENERATOR__QCONTROLLED, oldQcontrolled, qcontrolled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPmax_MW() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"pmax_MW");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Pmax_MW");
				pmax_MW= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pmax_MW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPmax_MW(String newPmax_MW) {
		String oldPmax_MW = pmax_MW;
		pmax_MW = newPmax_MW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GENERATOR__PMAX_MW, oldPmax_MW, pmax_MW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQmin_MVAR() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"qmin_MVAR");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qmin_MVAR");
				qmin_MVAR= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return qmin_MVAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQmin_MVAR(String newQmin_MVAR) {
		String oldQmin_MVAR = qmin_MVAR;
		qmin_MVAR = newQmin_MVAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GENERATOR__QMIN_MVAR, oldQmin_MVAR, qmin_MVAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQmax_MVAR() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"qmax_MVAR");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qmax_MVAR");
				qmax_MVAR= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return qmax_MVAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQmax_MVAR(String newQmax_MVAR) {
		String oldQmax_MVAR = qmax_MVAR;
		qmax_MVAR = newQmax_MVAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GENERATOR__QMAX_MVAR, oldQmax_MVAR, qmax_MVAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQVa() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"qVa");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"QVa");
				qVa= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return qVa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQVa(String newQVa) {
		String oldQVa = qVa;
		qVa = newQVa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GENERATOR__QVA, oldQVa, qVa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQVb() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"qVb");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"QVb");
				qVb= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return qVb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQVb(String newQVb) {
		String oldQVb = qVb;
		qVb = newQVb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GENERATOR__QVB, oldQVb, qVb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQVc() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"qVc");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"QVc");
				qVc= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return qVc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQVc(String newQVc) {
		String oldQVc = qVc;
		qVc = newQVc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GENERATOR__QVC, oldQVc, qVc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"state");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"State");
				state= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GENERATOR__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.GENERATOR__PDESIRED_MW:
				return getPdesired_MW();
			case VisGridPackage.GENERATOR__QDESIRED_MVAR:
				return getQdesired_MVAR();
			case VisGridPackage.GENERATOR__QCONTROLLED:
				return getQcontrolled();
			case VisGridPackage.GENERATOR__PMAX_MW:
				return getPmax_MW();
			case VisGridPackage.GENERATOR__QMIN_MVAR:
				return getQmin_MVAR();
			case VisGridPackage.GENERATOR__QMAX_MVAR:
				return getQmax_MVAR();
			case VisGridPackage.GENERATOR__QVA:
				return getQVa();
			case VisGridPackage.GENERATOR__QVB:
				return getQVb();
			case VisGridPackage.GENERATOR__QVC:
				return getQVc();
			case VisGridPackage.GENERATOR__STATE:
				return getState();
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
			case VisGridPackage.GENERATOR__PDESIRED_MW:
				setPdesired_MW((String)newValue);
				return;
			case VisGridPackage.GENERATOR__QDESIRED_MVAR:
				setQdesired_MVAR((String)newValue);
				return;
			case VisGridPackage.GENERATOR__QCONTROLLED:
				setQcontrolled((String)newValue);
				return;
			case VisGridPackage.GENERATOR__PMAX_MW:
				setPmax_MW((String)newValue);
				return;
			case VisGridPackage.GENERATOR__QMIN_MVAR:
				setQmin_MVAR((String)newValue);
				return;
			case VisGridPackage.GENERATOR__QMAX_MVAR:
				setQmax_MVAR((String)newValue);
				return;
			case VisGridPackage.GENERATOR__QVA:
				setQVa((String)newValue);
				return;
			case VisGridPackage.GENERATOR__QVB:
				setQVb((String)newValue);
				return;
			case VisGridPackage.GENERATOR__QVC:
				setQVc((String)newValue);
				return;
			case VisGridPackage.GENERATOR__STATE:
				setState((String)newValue);
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
			case VisGridPackage.GENERATOR__PDESIRED_MW:
				setPdesired_MW(PDESIRED_MW_EDEFAULT);
				return;
			case VisGridPackage.GENERATOR__QDESIRED_MVAR:
				setQdesired_MVAR(QDESIRED_MVAR_EDEFAULT);
				return;
			case VisGridPackage.GENERATOR__QCONTROLLED:
				setQcontrolled(QCONTROLLED_EDEFAULT);
				return;
			case VisGridPackage.GENERATOR__PMAX_MW:
				setPmax_MW(PMAX_MW_EDEFAULT);
				return;
			case VisGridPackage.GENERATOR__QMIN_MVAR:
				setQmin_MVAR(QMIN_MVAR_EDEFAULT);
				return;
			case VisGridPackage.GENERATOR__QMAX_MVAR:
				setQmax_MVAR(QMAX_MVAR_EDEFAULT);
				return;
			case VisGridPackage.GENERATOR__QVA:
				setQVa(QVA_EDEFAULT);
				return;
			case VisGridPackage.GENERATOR__QVB:
				setQVb(QVB_EDEFAULT);
				return;
			case VisGridPackage.GENERATOR__QVC:
				setQVc(QVC_EDEFAULT);
				return;
			case VisGridPackage.GENERATOR__STATE:
				setState(STATE_EDEFAULT);
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
			case VisGridPackage.GENERATOR__PDESIRED_MW:
				return PDESIRED_MW_EDEFAULT == null ? pdesired_MW != null : !PDESIRED_MW_EDEFAULT.equals(pdesired_MW);
			case VisGridPackage.GENERATOR__QDESIRED_MVAR:
				return QDESIRED_MVAR_EDEFAULT == null ? qdesired_MVAR != null : !QDESIRED_MVAR_EDEFAULT.equals(qdesired_MVAR);
			case VisGridPackage.GENERATOR__QCONTROLLED:
				return QCONTROLLED_EDEFAULT == null ? qcontrolled != null : !QCONTROLLED_EDEFAULT.equals(qcontrolled);
			case VisGridPackage.GENERATOR__PMAX_MW:
				return PMAX_MW_EDEFAULT == null ? pmax_MW != null : !PMAX_MW_EDEFAULT.equals(pmax_MW);
			case VisGridPackage.GENERATOR__QMIN_MVAR:
				return QMIN_MVAR_EDEFAULT == null ? qmin_MVAR != null : !QMIN_MVAR_EDEFAULT.equals(qmin_MVAR);
			case VisGridPackage.GENERATOR__QMAX_MVAR:
				return QMAX_MVAR_EDEFAULT == null ? qmax_MVAR != null : !QMAX_MVAR_EDEFAULT.equals(qmax_MVAR);
			case VisGridPackage.GENERATOR__QVA:
				return QVA_EDEFAULT == null ? qVa != null : !QVA_EDEFAULT.equals(qVa);
			case VisGridPackage.GENERATOR__QVB:
				return QVB_EDEFAULT == null ? qVb != null : !QVB_EDEFAULT.equals(qVb);
			case VisGridPackage.GENERATOR__QVC:
				return QVC_EDEFAULT == null ? qVc != null : !QVC_EDEFAULT.equals(qVc);
			case VisGridPackage.GENERATOR__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
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
		result.append(" (Pdesired_MW: ");
		result.append(pdesired_MW);
		result.append(", Qdesired_MVAR: ");
		result.append(qdesired_MVAR);
		result.append(", Qcontrolled: ");
		result.append(qcontrolled);
		result.append(", Pmax_MW: ");
		result.append(pmax_MW);
		result.append(", Qmin_MVAR: ");
		result.append(qmin_MVAR);
		result.append(", Qmax_MVAR: ");
		result.append(qmax_MVAR);
		result.append(", QVa: ");
		result.append(qVa);
		result.append(", QVb: ");
		result.append(qVb);
		result.append(", QVc: ");
		result.append(qVc);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //GeneratorImpl
