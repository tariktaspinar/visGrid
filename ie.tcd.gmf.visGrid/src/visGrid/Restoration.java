/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Restoration#getConfiguration_file <em>Configuration file</em>}</li>
 *   <li>{@link visGrid.Restoration#getReconfig_attempts <em>Reconfig attempts</em>}</li>
 *   <li>{@link visGrid.Restoration#getReconfig_iteration_limit <em>Reconfig iteration limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getRestoration()
 * @model
 * @generated
 */
public interface Restoration extends Connection {
	/**
	 * Returns the value of the '<em><b>Configuration file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration file</em>' attribute.
	 * @see #setConfiguration_file(String)
	 * @see visGrid.VisGridPackage#getRestoration_Configuration_file()
	 * @model
	 * @generated
	 */
	String getConfiguration_file();

	/**
	 * Sets the value of the '{@link visGrid.Restoration#getConfiguration_file <em>Configuration file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration file</em>' attribute.
	 * @see #getConfiguration_file()
	 * @generated
	 */
	void setConfiguration_file(String value);

	/**
	 * Returns the value of the '<em><b>Reconfig attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfig attempts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfig attempts</em>' attribute.
	 * @see #setReconfig_attempts(String)
	 * @see visGrid.VisGridPackage#getRestoration_Reconfig_attempts()
	 * @model
	 * @generated
	 */
	String getReconfig_attempts();

	/**
	 * Sets the value of the '{@link visGrid.Restoration#getReconfig_attempts <em>Reconfig attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfig attempts</em>' attribute.
	 * @see #getReconfig_attempts()
	 * @generated
	 */
	void setReconfig_attempts(String value);

	/**
	 * Returns the value of the '<em><b>Reconfig iteration limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfig iteration limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfig iteration limit</em>' attribute.
	 * @see #setReconfig_iteration_limit(String)
	 * @see visGrid.VisGridPackage#getRestoration_Reconfig_iteration_limit()
	 * @model
	 * @generated
	 */
	String getReconfig_iteration_limit();

	/**
	 * Sets the value of the '{@link visGrid.Restoration#getReconfig_iteration_limit <em>Reconfig iteration limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfig iteration limit</em>' attribute.
	 * @see #getReconfig_iteration_limit()
	 * @generated
	 */
	void setReconfig_iteration_limit(String value);

} // Restoration
