/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Comm#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.Comm#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.Comm#getLatency <em>Latency</em>}</li>
 *   <li>{@link visGrid.Comm#getReliability <em>Reliability</em>}</li>
 *   <li>{@link visGrid.Comm#getBitrate <em>Bitrate</em>}</li>
 *   <li>{@link visGrid.Comm#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getComm()
 * @model
 * @generated
 */
public interface Comm extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference list.
	 * The list contents are of type {@link visGrid.Connections}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference list.
	 * @see visGrid.VisGridPackage#getComm_Connection()
	 * @model
	 * @generated
	 */
	EList<Connections> getConnection();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see visGrid.VisGridPackage#getComm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visGrid.Comm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(String)
	 * @see visGrid.VisGridPackage#getComm_Latency()
	 * @model
	 * @generated
	 */
	String getLatency();

	/**
	 * Sets the value of the '{@link visGrid.Comm#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(String value);

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' attribute.
	 * @see #setReliability(String)
	 * @see visGrid.VisGridPackage#getComm_Reliability()
	 * @model
	 * @generated
	 */
	String getReliability();

	/**
	 * Sets the value of the '{@link visGrid.Comm#getReliability <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' attribute.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(String value);

	/**
	 * Returns the value of the '<em><b>Bitrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bitrate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bitrate</em>' attribute.
	 * @see #setBitrate(String)
	 * @see visGrid.VisGridPackage#getComm_Bitrate()
	 * @model
	 * @generated
	 */
	String getBitrate();

	/**
	 * Sets the value of the '{@link visGrid.Comm#getBitrate <em>Bitrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bitrate</em>' attribute.
	 * @see #getBitrate()
	 * @generated
	 */
	void setBitrate(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see visGrid.VisGridPackage#getComm_Timeout()
	 * @model
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link visGrid.Comm#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

} // Comm
