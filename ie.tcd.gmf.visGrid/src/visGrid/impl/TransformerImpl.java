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
import visGrid.Transformer;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.TransformerImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.TransformerImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.TransformerImpl#getType <em>Type</em>}</li>
 *   <li>{@link visGrid.impl.TransformerImpl#getSbase <em>Sbase</em>}</li>
 *   <li>{@link visGrid.impl.TransformerImpl#getVbase <em>Vbase</em>}</li>
 *   <li>{@link visGrid.impl.TransformerImpl#getZpu <em>Zpu</em>}</li>
 *   <li>{@link visGrid.impl.TransformerImpl#getVprimary <em>Vprimary</em>}</li>
 *   <li>{@link visGrid.impl.TransformerImpl#getVsecondary <em>Vsecondary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerImpl extends EObjectImpl implements Transformer {
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
	 * The default value of the '{@link #getSbase() <em>Sbase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSbase()
	 * @generated
	 * @ordered
	 */
	protected static final String SBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSbase() <em>Sbase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSbase()
	 * @generated
	 * @ordered
	 */
	protected String sbase = SBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVbase() <em>Vbase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVbase()
	 * @generated
	 * @ordered
	 */
	protected static final String VBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVbase() <em>Vbase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVbase()
	 * @generated
	 * @ordered
	 */
	protected String vbase = VBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZpu() <em>Zpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZpu()
	 * @generated
	 * @ordered
	 */
	protected static final String ZPU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZpu() <em>Zpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZpu()
	 * @generated
	 * @ordered
	 */
	protected String zpu = ZPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getVprimary() <em>Vprimary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVprimary()
	 * @generated
	 * @ordered
	 */
	protected static final String VPRIMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVprimary() <em>Vprimary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVprimary()
	 * @generated
	 * @ordered
	 */
	protected String vprimary = VPRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVsecondary() <em>Vsecondary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsecondary()
	 * @generated
	 * @ordered
	 */
	protected static final String VSECONDARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVsecondary() <em>Vsecondary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsecondary()
	 * @generated
	 * @ordered
	 */
	protected String vsecondary = VSECONDARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getTransformer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.TRANSFORMER__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSbase() {
		return sbase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSbase(String newSbase) {
		String oldSbase = sbase;
		sbase = newSbase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER__SBASE, oldSbase, sbase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVbase() {
		return vbase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVbase(String newVbase) {
		String oldVbase = vbase;
		vbase = newVbase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER__VBASE, oldVbase, vbase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZpu() {
		return zpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZpu(String newZpu) {
		String oldZpu = zpu;
		zpu = newZpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER__ZPU, oldZpu, zpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVprimary() {
		return vprimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVprimary(String newVprimary) {
		String oldVprimary = vprimary;
		vprimary = newVprimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER__VPRIMARY, oldVprimary, vprimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVsecondary() {
		return vsecondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVsecondary(String newVsecondary) {
		String oldVsecondary = vsecondary;
		vsecondary = newVsecondary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER__VSECONDARY, oldVsecondary, vsecondary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.TRANSFORMER__CONNECTION:
				return getConnection();
			case VisGridPackage.TRANSFORMER__NAME:
				return getName();
			case VisGridPackage.TRANSFORMER__TYPE:
				return getType();
			case VisGridPackage.TRANSFORMER__SBASE:
				return getSbase();
			case VisGridPackage.TRANSFORMER__VBASE:
				return getVbase();
			case VisGridPackage.TRANSFORMER__ZPU:
				return getZpu();
			case VisGridPackage.TRANSFORMER__VPRIMARY:
				return getVprimary();
			case VisGridPackage.TRANSFORMER__VSECONDARY:
				return getVsecondary();
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
			case VisGridPackage.TRANSFORMER__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.TRANSFORMER__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER__TYPE:
				setType((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER__SBASE:
				setSbase((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER__VBASE:
				setVbase((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER__ZPU:
				setZpu((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER__VPRIMARY:
				setVprimary((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER__VSECONDARY:
				setVsecondary((String)newValue);
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
			case VisGridPackage.TRANSFORMER__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.TRANSFORMER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER__SBASE:
				setSbase(SBASE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER__VBASE:
				setVbase(VBASE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER__ZPU:
				setZpu(ZPU_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER__VPRIMARY:
				setVprimary(VPRIMARY_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER__VSECONDARY:
				setVsecondary(VSECONDARY_EDEFAULT);
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
			case VisGridPackage.TRANSFORMER__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.TRANSFORMER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.TRANSFORMER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case VisGridPackage.TRANSFORMER__SBASE:
				return SBASE_EDEFAULT == null ? sbase != null : !SBASE_EDEFAULT.equals(sbase);
			case VisGridPackage.TRANSFORMER__VBASE:
				return VBASE_EDEFAULT == null ? vbase != null : !VBASE_EDEFAULT.equals(vbase);
			case VisGridPackage.TRANSFORMER__ZPU:
				return ZPU_EDEFAULT == null ? zpu != null : !ZPU_EDEFAULT.equals(zpu);
			case VisGridPackage.TRANSFORMER__VPRIMARY:
				return VPRIMARY_EDEFAULT == null ? vprimary != null : !VPRIMARY_EDEFAULT.equals(vprimary);
			case VisGridPackage.TRANSFORMER__VSECONDARY:
				return VSECONDARY_EDEFAULT == null ? vsecondary != null : !VSECONDARY_EDEFAULT.equals(vsecondary);
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
		result.append(", Type: ");
		result.append(type);
		result.append(", Sbase: ");
		result.append(sbase);
		result.append(", Vbase: ");
		result.append(vbase);
		result.append(", Zpu: ");
		result.append(zpu);
		result.append(", Vprimary: ");
		result.append(vprimary);
		result.append(", Vsecondary: ");
		result.append(vsecondary);
		result.append(')');
		return result.toString();
	}

} //TransformerImpl
