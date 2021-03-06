/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Fuse#getTimeConstant <em>Time Constant</em>}</li>
 *   <li>{@link visGrid.Fuse#getSetCurrent <em>Set Current</em>}</li>
 *   <li>{@link visGrid.Fuse#getSetBase <em>Set Base</em>}</li>
 *   <li>{@link visGrid.Fuse#getSetScale <em>Set Scale</em>}</li>
 *   <li>{@link visGrid.Fuse#getSetCurve <em>Set Curve</em>}</li>
 *   <li>{@link visGrid.Fuse#getTresetAvg <em>Treset Avg</em>}</li>
 *   <li>{@link visGrid.Fuse#getTresetStd <em>Treset Std</em>}</li>
 *   <li>{@link visGrid.Fuse#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getFuse()
 * @model
 * @generated
 */
public interface Fuse extends Connection {
	/**
	 * Returns the value of the '<em><b>Time Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Constant</em>' attribute.
	 * @see #setTimeConstant(String)
	 * @see visGrid.VisGridPackage#getFuse_TimeConstant()
	 * @model
	 * @generated
	 */
	String getTimeConstant();

	/**
	 * Sets the value of the '{@link visGrid.Fuse#getTimeConstant <em>Time Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Constant</em>' attribute.
	 * @see #getTimeConstant()
	 * @generated
	 */
	void setTimeConstant(String value);

	/**
	 * Returns the value of the '<em><b>Set Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Current</em>' attribute.
	 * @see #setSetCurrent(String)
	 * @see visGrid.VisGridPackage#getFuse_SetCurrent()
	 * @model
	 * @generated
	 */
	String getSetCurrent();

	/**
	 * Sets the value of the '{@link visGrid.Fuse#getSetCurrent <em>Set Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Current</em>' attribute.
	 * @see #getSetCurrent()
	 * @generated
	 */
	void setSetCurrent(String value);

	/**
	 * Returns the value of the '<em><b>Set Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Base</em>' attribute.
	 * @see #setSetBase(String)
	 * @see visGrid.VisGridPackage#getFuse_SetBase()
	 * @model
	 * @generated
	 */
	String getSetBase();

	/**
	 * Sets the value of the '{@link visGrid.Fuse#getSetBase <em>Set Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Base</em>' attribute.
	 * @see #getSetBase()
	 * @generated
	 */
	void setSetBase(String value);

	/**
	 * Returns the value of the '<em><b>Set Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Scale</em>' attribute.
	 * @see #setSetScale(String)
	 * @see visGrid.VisGridPackage#getFuse_SetScale()
	 * @model
	 * @generated
	 */
	String getSetScale();

	/**
	 * Sets the value of the '{@link visGrid.Fuse#getSetScale <em>Set Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Scale</em>' attribute.
	 * @see #getSetScale()
	 * @generated
	 */
	void setSetScale(String value);

	/**
	 * Returns the value of the '<em><b>Set Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Curve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Curve</em>' attribute.
	 * @see #setSetCurve(String)
	 * @see visGrid.VisGridPackage#getFuse_SetCurve()
	 * @model
	 * @generated
	 */
	String getSetCurve();

	/**
	 * Sets the value of the '{@link visGrid.Fuse#getSetCurve <em>Set Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Curve</em>' attribute.
	 * @see #getSetCurve()
	 * @generated
	 */
	void setSetCurve(String value);

	/**
	 * Returns the value of the '<em><b>Treset Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treset Avg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treset Avg</em>' attribute.
	 * @see #setTresetAvg(String)
	 * @see visGrid.VisGridPackage#getFuse_TresetAvg()
	 * @model
	 * @generated
	 */
	String getTresetAvg();

	/**
	 * Sets the value of the '{@link visGrid.Fuse#getTresetAvg <em>Treset Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treset Avg</em>' attribute.
	 * @see #getTresetAvg()
	 * @generated
	 */
	void setTresetAvg(String value);

	/**
	 * Returns the value of the '<em><b>Treset Std</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treset Std</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treset Std</em>' attribute.
	 * @see #setTresetStd(String)
	 * @see visGrid.VisGridPackage#getFuse_TresetStd()
	 * @model
	 * @generated
	 */
	String getTresetStd();

	/**
	 * Sets the value of the '{@link visGrid.Fuse#getTresetStd <em>Treset Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treset Std</em>' attribute.
	 * @see #getTresetStd()
	 * @generated
	 */
	void setTresetStd(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see visGrid.VisGridPackage#getFuse_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link visGrid.Fuse#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // Fuse
