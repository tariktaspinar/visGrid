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

import visGrid.Restoration;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.RestorationImpl#getConfiguration_file <em>Configuration file</em>}</li>
 *   <li>{@link visGrid.impl.RestorationImpl#getReconfig_attempts <em>Reconfig attempts</em>}</li>
 *   <li>{@link visGrid.impl.RestorationImpl#getReconfig_iteration_limit <em>Reconfig iteration limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestorationImpl extends ConnectionImpl implements Restoration {
		boolean lock = false;
	/**
	 * The default value of the '{@link #getConfiguration_file() <em>Configuration file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_file()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfiguration_file() <em>Configuration file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration_file()
	 * @generated
	 * @ordered
	 */
	protected String configuration_file = CONFIGURATION_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReconfig_attempts() <em>Reconfig attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfig_attempts()
	 * @generated
	 * @ordered
	 */
	protected static final String RECONFIG_ATTEMPTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReconfig_attempts() <em>Reconfig attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfig_attempts()
	 * @generated
	 * @ordered
	 */
	protected String reconfig_attempts = RECONFIG_ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReconfig_iteration_limit() <em>Reconfig iteration limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfig_iteration_limit()
	 * @generated
	 * @ordered
	 */
	protected static final String RECONFIG_ITERATION_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReconfig_iteration_limit() <em>Reconfig iteration limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfig_iteration_limit()
	 * @generated
	 * @ordered
	 */
	protected String reconfig_iteration_limit = RECONFIG_ITERATION_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestorationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getRestoration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfiguration_file() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"configuration_file");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Configuration_file");
				configuration_file= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return configuration_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration_file(String newConfiguration_file) {
		String oldConfiguration_file = configuration_file;
		configuration_file = newConfiguration_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RESTORATION__CONFIGURATION_FILE, oldConfiguration_file, configuration_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReconfig_attempts() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"reconfig_attempts");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Reconfig_attempts");
				reconfig_attempts= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return reconfig_attempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfig_attempts(String newReconfig_attempts) {
		String oldReconfig_attempts = reconfig_attempts;
		reconfig_attempts = newReconfig_attempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RESTORATION__RECONFIG_ATTEMPTS, oldReconfig_attempts, reconfig_attempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReconfig_iteration_limit() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"reconfig_iteration_limit");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Reconfig_iteration_limit");
				reconfig_iteration_limit= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return reconfig_iteration_limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfig_iteration_limit(String newReconfig_iteration_limit) {
		String oldReconfig_iteration_limit = reconfig_iteration_limit;
		reconfig_iteration_limit = newReconfig_iteration_limit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RESTORATION__RECONFIG_ITERATION_LIMIT, oldReconfig_iteration_limit, reconfig_iteration_limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.RESTORATION__CONFIGURATION_FILE:
				return getConfiguration_file();
			case VisGridPackage.RESTORATION__RECONFIG_ATTEMPTS:
				return getReconfig_attempts();
			case VisGridPackage.RESTORATION__RECONFIG_ITERATION_LIMIT:
				return getReconfig_iteration_limit();
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
			case VisGridPackage.RESTORATION__CONFIGURATION_FILE:
				setConfiguration_file((String)newValue);
				return;
			case VisGridPackage.RESTORATION__RECONFIG_ATTEMPTS:
				setReconfig_attempts((String)newValue);
				return;
			case VisGridPackage.RESTORATION__RECONFIG_ITERATION_LIMIT:
				setReconfig_iteration_limit((String)newValue);
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
			case VisGridPackage.RESTORATION__CONFIGURATION_FILE:
				setConfiguration_file(CONFIGURATION_FILE_EDEFAULT);
				return;
			case VisGridPackage.RESTORATION__RECONFIG_ATTEMPTS:
				setReconfig_attempts(RECONFIG_ATTEMPTS_EDEFAULT);
				return;
			case VisGridPackage.RESTORATION__RECONFIG_ITERATION_LIMIT:
				setReconfig_iteration_limit(RECONFIG_ITERATION_LIMIT_EDEFAULT);
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
			case VisGridPackage.RESTORATION__CONFIGURATION_FILE:
				return CONFIGURATION_FILE_EDEFAULT == null ? configuration_file != null : !CONFIGURATION_FILE_EDEFAULT.equals(configuration_file);
			case VisGridPackage.RESTORATION__RECONFIG_ATTEMPTS:
				return RECONFIG_ATTEMPTS_EDEFAULT == null ? reconfig_attempts != null : !RECONFIG_ATTEMPTS_EDEFAULT.equals(reconfig_attempts);
			case VisGridPackage.RESTORATION__RECONFIG_ITERATION_LIMIT:
				return RECONFIG_ITERATION_LIMIT_EDEFAULT == null ? reconfig_iteration_limit != null : !RECONFIG_ITERATION_LIMIT_EDEFAULT.equals(reconfig_iteration_limit);
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
		result.append(" (configuration_file: ");
		result.append(configuration_file);
		result.append(", reconfig_attempts: ");
		result.append(reconfig_attempts);
		result.append(", reconfig_iteration_limit: ");
		result.append(reconfig_iteration_limit);
		result.append(')');
		return result.toString();
	}

} //RestorationImpl
