/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Auction#getType <em>Type</em>}</li>
 *   <li>{@link visGrid.Auction#getUnit <em>Unit</em>}</li>
 *   <li>{@link visGrid.Auction#getPeriod <em>Period</em>}</li>
 *   <li>{@link visGrid.Auction#getLatency <em>Latency</em>}</li>
 *   <li>{@link visGrid.Auction#getMarket_id <em>Market id</em>}</li>
 *   <li>{@link visGrid.Auction#getLast__Q <em>Last Q</em>}</li>
 *   <li>{@link visGrid.Auction#getLast__P <em>Last P</em>}</li>
 *   <li>{@link visGrid.Auction#getNext__Q <em>Next Q</em>}</li>
 *   <li>{@link visGrid.Auction#getNext__P <em>Next P</em>}</li>
 *   <li>{@link visGrid.Auction#getAvg24 <em>Avg24</em>}</li>
 *   <li>{@link visGrid.Auction#getStd24 <em>Std24</em>}</li>
 *   <li>{@link visGrid.Auction#getAvg72 <em>Avg72</em>}</li>
 *   <li>{@link visGrid.Auction#getStd72 <em>Std72</em>}</li>
 *   <li>{@link visGrid.Auction#getAvg168 <em>Avg168</em>}</li>
 *   <li>{@link visGrid.Auction#getStd168 <em>Std168</em>}</li>
 *   <li>{@link visGrid.Auction#getNetwork <em>Network</em>}</li>
 *   <li>{@link visGrid.Auction#getVerbose <em>Verbose</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getAuction()
 * @model
 * @generated
 */
public interface Auction extends Connection {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see visGrid.VisGridPackage#getAuction_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see visGrid.VisGridPackage#getAuction_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(String)
	 * @see visGrid.VisGridPackage#getAuction_Period()
	 * @model
	 * @generated
	 */
	String getPeriod();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(String value);

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
	 * @see visGrid.VisGridPackage#getAuction_Latency()
	 * @model
	 * @generated
	 */
	String getLatency();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(String value);

	/**
	 * Returns the value of the '<em><b>Market id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market id</em>' attribute.
	 * @see #setMarket_id(String)
	 * @see visGrid.VisGridPackage#getAuction_Market_id()
	 * @model
	 * @generated
	 */
	String getMarket_id();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getMarket_id <em>Market id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market id</em>' attribute.
	 * @see #getMarket_id()
	 * @generated
	 */
	void setMarket_id(String value);

	/**
	 * Returns the value of the '<em><b>Last Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Q</em>' attribute.
	 * @see #setLast__Q(String)
	 * @see visGrid.VisGridPackage#getAuction_Last__Q()
	 * @model
	 * @generated
	 */
	String getLast__Q();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getLast__Q <em>Last Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Q</em>' attribute.
	 * @see #getLast__Q()
	 * @generated
	 */
	void setLast__Q(String value);

	/**
	 * Returns the value of the '<em><b>Last P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last P</em>' attribute.
	 * @see #setLast__P(String)
	 * @see visGrid.VisGridPackage#getAuction_Last__P()
	 * @model
	 * @generated
	 */
	String getLast__P();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getLast__P <em>Last P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last P</em>' attribute.
	 * @see #getLast__P()
	 * @generated
	 */
	void setLast__P(String value);

	/**
	 * Returns the value of the '<em><b>Next Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Q</em>' attribute.
	 * @see #setNext__Q(String)
	 * @see visGrid.VisGridPackage#getAuction_Next__Q()
	 * @model
	 * @generated
	 */
	String getNext__Q();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getNext__Q <em>Next Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Q</em>' attribute.
	 * @see #getNext__Q()
	 * @generated
	 */
	void setNext__Q(String value);

	/**
	 * Returns the value of the '<em><b>Next P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next P</em>' attribute.
	 * @see #setNext__P(String)
	 * @see visGrid.VisGridPackage#getAuction_Next__P()
	 * @model
	 * @generated
	 */
	String getNext__P();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getNext__P <em>Next P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next P</em>' attribute.
	 * @see #getNext__P()
	 * @generated
	 */
	void setNext__P(String value);

	/**
	 * Returns the value of the '<em><b>Avg24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg24</em>' attribute.
	 * @see #setAvg24(String)
	 * @see visGrid.VisGridPackage#getAuction_Avg24()
	 * @model
	 * @generated
	 */
	String getAvg24();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getAvg24 <em>Avg24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg24</em>' attribute.
	 * @see #getAvg24()
	 * @generated
	 */
	void setAvg24(String value);

	/**
	 * Returns the value of the '<em><b>Std24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Std24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std24</em>' attribute.
	 * @see #setStd24(String)
	 * @see visGrid.VisGridPackage#getAuction_Std24()
	 * @model
	 * @generated
	 */
	String getStd24();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getStd24 <em>Std24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std24</em>' attribute.
	 * @see #getStd24()
	 * @generated
	 */
	void setStd24(String value);

	/**
	 * Returns the value of the '<em><b>Avg72</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg72</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg72</em>' attribute.
	 * @see #setAvg72(String)
	 * @see visGrid.VisGridPackage#getAuction_Avg72()
	 * @model
	 * @generated
	 */
	String getAvg72();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getAvg72 <em>Avg72</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg72</em>' attribute.
	 * @see #getAvg72()
	 * @generated
	 */
	void setAvg72(String value);

	/**
	 * Returns the value of the '<em><b>Std72</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Std72</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std72</em>' attribute.
	 * @see #setStd72(String)
	 * @see visGrid.VisGridPackage#getAuction_Std72()
	 * @model
	 * @generated
	 */
	String getStd72();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getStd72 <em>Std72</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std72</em>' attribute.
	 * @see #getStd72()
	 * @generated
	 */
	void setStd72(String value);

	/**
	 * Returns the value of the '<em><b>Avg168</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg168</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg168</em>' attribute.
	 * @see #setAvg168(String)
	 * @see visGrid.VisGridPackage#getAuction_Avg168()
	 * @model
	 * @generated
	 */
	String getAvg168();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getAvg168 <em>Avg168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg168</em>' attribute.
	 * @see #getAvg168()
	 * @generated
	 */
	void setAvg168(String value);

	/**
	 * Returns the value of the '<em><b>Std168</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Std168</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std168</em>' attribute.
	 * @see #setStd168(String)
	 * @see visGrid.VisGridPackage#getAuction_Std168()
	 * @model
	 * @generated
	 */
	String getStd168();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getStd168 <em>Std168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std168</em>' attribute.
	 * @see #getStd168()
	 * @generated
	 */
	void setStd168(String value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see #setNetwork(String)
	 * @see visGrid.VisGridPackage#getAuction_Network()
	 * @model
	 * @generated
	 */
	String getNetwork();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verbose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbose</em>' attribute.
	 * @see #setVerbose(String)
	 * @see visGrid.VisGridPackage#getAuction_Verbose()
	 * @model
	 * @generated
	 */
	String getVerbose();

	/**
	 * Sets the value of the '{@link visGrid.Auction#getVerbose <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbose</em>' attribute.
	 * @see #getVerbose()
	 * @generated
	 */
	void setVerbose(String value);

} // Auction
