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

import visGrid.Stubauction;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stubauction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.StubauctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getLast__P <em>Last P</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getNext__P <em>Next P</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getAvg24 <em>Avg24</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getStd24 <em>Std24</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getAvg72 <em>Avg72</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getStd72 <em>Std72</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getAvg168 <em>Avg168</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getStd168 <em>Std168</em>}</li>
 *   <li>{@link visGrid.impl.StubauctionImpl#getVerbose <em>Verbose</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StubauctionImpl extends ConnectionImpl implements Stubauction {
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
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

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
	 * The default value of the '{@link #getLast__P() <em>Last P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast__P()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLast__P() <em>Last P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast__P()
	 * @generated
	 * @ordered
	 */
	protected String last__P = LAST_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getNext__P() <em>Next P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext__P()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNext__P() <em>Next P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext__P()
	 * @generated
	 * @ordered
	 */
	protected String next__P = NEXT_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvg24() <em>Avg24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg24()
	 * @generated
	 * @ordered
	 */
	protected static final String AVG24_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvg24() <em>Avg24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg24()
	 * @generated
	 * @ordered
	 */
	protected String avg24 = AVG24_EDEFAULT;

	/**
	 * The default value of the '{@link #getStd24() <em>Std24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd24()
	 * @generated
	 * @ordered
	 */
	protected static final String STD24_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStd24() <em>Std24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd24()
	 * @generated
	 * @ordered
	 */
	protected String std24 = STD24_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvg72() <em>Avg72</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg72()
	 * @generated
	 * @ordered
	 */
	protected static final String AVG72_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvg72() <em>Avg72</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg72()
	 * @generated
	 * @ordered
	 */
	protected String avg72 = AVG72_EDEFAULT;

	/**
	 * The default value of the '{@link #getStd72() <em>Std72</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd72()
	 * @generated
	 * @ordered
	 */
	protected static final String STD72_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStd72() <em>Std72</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd72()
	 * @generated
	 * @ordered
	 */
	protected String std72 = STD72_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvg168() <em>Avg168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg168()
	 * @generated
	 * @ordered
	 */
	protected static final String AVG168_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvg168() <em>Avg168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg168()
	 * @generated
	 * @ordered
	 */
	protected String avg168 = AVG168_EDEFAULT;

	/**
	 * The default value of the '{@link #getStd168() <em>Std168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd168()
	 * @generated
	 * @ordered
	 */
	protected static final String STD168_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStd168() <em>Std168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd168()
	 * @generated
	 * @ordered
	 */
	protected String std168 = STD168_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerbose() <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbose()
	 * @generated
	 * @ordered
	 */
	protected static final String VERBOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerbose() <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbose()
	 * @generated
	 * @ordered
	 */
	protected String verbose = VERBOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StubauctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getStubauction();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__UNIT, oldUnit, unit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLast__P() {
		return last__P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast__P(String newLast__P) {
		String oldLast__P = last__P;
		last__P = newLast__P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__LAST_P, oldLast__P, last__P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNext__P() {
		return next__P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext__P(String newNext__P) {
		String oldNext__P = next__P;
		next__P = newNext__P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__NEXT_P, oldNext__P, next__P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvg24() {
		return avg24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvg24(String newAvg24) {
		String oldAvg24 = avg24;
		avg24 = newAvg24;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__AVG24, oldAvg24, avg24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStd24() {
		return std24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStd24(String newStd24) {
		String oldStd24 = std24;
		std24 = newStd24;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__STD24, oldStd24, std24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvg72() {
		return avg72;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvg72(String newAvg72) {
		String oldAvg72 = avg72;
		avg72 = newAvg72;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__AVG72, oldAvg72, avg72));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStd72() {
		return std72;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStd72(String newStd72) {
		String oldStd72 = std72;
		std72 = newStd72;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__STD72, oldStd72, std72));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvg168() {
		return avg168;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvg168(String newAvg168) {
		String oldAvg168 = avg168;
		avg168 = newAvg168;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__AVG168, oldAvg168, avg168));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStd168() {
		return std168;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStd168(String newStd168) {
		String oldStd168 = std168;
		std168 = newStd168;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__STD168, oldStd168, std168));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerbose() {
		return verbose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerbose(String newVerbose) {
		String oldVerbose = verbose;
		verbose = newVerbose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.STUBAUCTION__VERBOSE, oldVerbose, verbose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.STUBAUCTION__NAME:
				return getName();
			case VisGridPackage.STUBAUCTION__UNIT:
				return getUnit();
			case VisGridPackage.STUBAUCTION__PERIOD:
				return getPeriod();
			case VisGridPackage.STUBAUCTION__LAST_P:
				return getLast__P();
			case VisGridPackage.STUBAUCTION__NEXT_P:
				return getNext__P();
			case VisGridPackage.STUBAUCTION__AVG24:
				return getAvg24();
			case VisGridPackage.STUBAUCTION__STD24:
				return getStd24();
			case VisGridPackage.STUBAUCTION__AVG72:
				return getAvg72();
			case VisGridPackage.STUBAUCTION__STD72:
				return getStd72();
			case VisGridPackage.STUBAUCTION__AVG168:
				return getAvg168();
			case VisGridPackage.STUBAUCTION__STD168:
				return getStd168();
			case VisGridPackage.STUBAUCTION__VERBOSE:
				return getVerbose();
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
			case VisGridPackage.STUBAUCTION__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__UNIT:
				setUnit((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__PERIOD:
				setPeriod((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__LAST_P:
				setLast__P((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__NEXT_P:
				setNext__P((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__AVG24:
				setAvg24((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__STD24:
				setStd24((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__AVG72:
				setAvg72((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__STD72:
				setStd72((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__AVG168:
				setAvg168((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__STD168:
				setStd168((String)newValue);
				return;
			case VisGridPackage.STUBAUCTION__VERBOSE:
				setVerbose((String)newValue);
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
			case VisGridPackage.STUBAUCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__LAST_P:
				setLast__P(LAST_P_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__NEXT_P:
				setNext__P(NEXT_P_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__AVG24:
				setAvg24(AVG24_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__STD24:
				setStd24(STD24_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__AVG72:
				setAvg72(AVG72_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__STD72:
				setStd72(STD72_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__AVG168:
				setAvg168(AVG168_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__STD168:
				setStd168(STD168_EDEFAULT);
				return;
			case VisGridPackage.STUBAUCTION__VERBOSE:
				setVerbose(VERBOSE_EDEFAULT);
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
			case VisGridPackage.STUBAUCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.STUBAUCTION__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case VisGridPackage.STUBAUCTION__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case VisGridPackage.STUBAUCTION__LAST_P:
				return LAST_P_EDEFAULT == null ? last__P != null : !LAST_P_EDEFAULT.equals(last__P);
			case VisGridPackage.STUBAUCTION__NEXT_P:
				return NEXT_P_EDEFAULT == null ? next__P != null : !NEXT_P_EDEFAULT.equals(next__P);
			case VisGridPackage.STUBAUCTION__AVG24:
				return AVG24_EDEFAULT == null ? avg24 != null : !AVG24_EDEFAULT.equals(avg24);
			case VisGridPackage.STUBAUCTION__STD24:
				return STD24_EDEFAULT == null ? std24 != null : !STD24_EDEFAULT.equals(std24);
			case VisGridPackage.STUBAUCTION__AVG72:
				return AVG72_EDEFAULT == null ? avg72 != null : !AVG72_EDEFAULT.equals(avg72);
			case VisGridPackage.STUBAUCTION__STD72:
				return STD72_EDEFAULT == null ? std72 != null : !STD72_EDEFAULT.equals(std72);
			case VisGridPackage.STUBAUCTION__AVG168:
				return AVG168_EDEFAULT == null ? avg168 != null : !AVG168_EDEFAULT.equals(avg168);
			case VisGridPackage.STUBAUCTION__STD168:
				return STD168_EDEFAULT == null ? std168 != null : !STD168_EDEFAULT.equals(std168);
			case VisGridPackage.STUBAUCTION__VERBOSE:
				return VERBOSE_EDEFAULT == null ? verbose != null : !VERBOSE_EDEFAULT.equals(verbose);
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
		result.append(", unit: ");
		result.append(unit);
		result.append(", period: ");
		result.append(period);
		result.append(", last__P: ");
		result.append(last__P);
		result.append(", next__P: ");
		result.append(next__P);
		result.append(", avg24: ");
		result.append(avg24);
		result.append(", std24: ");
		result.append(std24);
		result.append(", avg72: ");
		result.append(avg72);
		result.append(", std72: ");
		result.append(std72);
		result.append(", avg168: ");
		result.append(avg168);
		result.append(", std168: ");
		result.append(std168);
		result.append(", verbose: ");
		result.append(verbose);
		result.append(')');
		return result.toString();
	}

} //StubauctionImpl
