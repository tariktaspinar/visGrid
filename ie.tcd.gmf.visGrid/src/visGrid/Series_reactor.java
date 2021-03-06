/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Series reactor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Series_reactor#getPhase_A_impedance <em>Phase Aimpedance</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPhase_A_resistance <em>Phase Aresistance</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPhase_A_reactance <em>Phase Areactance</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPhase_B_impedance <em>Phase Bimpedance</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPhase_B_resistance <em>Phase Bresistance</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPhase_B_reactance <em>Phase Breactance</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPhase_C_impedance <em>Phase Cimpedance</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPhase_C_resistance <em>Phase Cresistance</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPhase_C_reactance <em>Phase Creactance</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getRated_current_limit <em>Rated current limit</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getStatus <em>Status</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getFrom <em>From</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getTo <em>To</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_in <em>Power in</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_out <em>Power out</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_losses <em>Power losses</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_in_A <em>Power in A</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_in_B <em>Power in B</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_in_C <em>Power in C</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_out_A <em>Power out A</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_out_B <em>Power out B</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_out_C <em>Power out C</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_losses_A <em>Power losses A</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_losses_B <em>Power losses B</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPower_losses_C <em>Power losses C</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getFlow_direction <em>Flow direction</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.Series_reactor#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getSeries_reactor()
 * @model
 * @generated
 */
public interface Series_reactor extends Connection {
	/**
	 * Returns the value of the '<em><b>Phase Aimpedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Aimpedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Aimpedance</em>' attribute.
	 * @see #setPhase_A_impedance(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Phase_A_impedance()
	 * @model
	 * @generated
	 */
	String getPhase_A_impedance();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPhase_A_impedance <em>Phase Aimpedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Aimpedance</em>' attribute.
	 * @see #getPhase_A_impedance()
	 * @generated
	 */
	void setPhase_A_impedance(String value);

	/**
	 * Returns the value of the '<em><b>Phase Aresistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Aresistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Aresistance</em>' attribute.
	 * @see #setPhase_A_resistance(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Phase_A_resistance()
	 * @model
	 * @generated
	 */
	String getPhase_A_resistance();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPhase_A_resistance <em>Phase Aresistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Aresistance</em>' attribute.
	 * @see #getPhase_A_resistance()
	 * @generated
	 */
	void setPhase_A_resistance(String value);

	/**
	 * Returns the value of the '<em><b>Phase Areactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Areactance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Areactance</em>' attribute.
	 * @see #setPhase_A_reactance(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Phase_A_reactance()
	 * @model
	 * @generated
	 */
	String getPhase_A_reactance();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPhase_A_reactance <em>Phase Areactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Areactance</em>' attribute.
	 * @see #getPhase_A_reactance()
	 * @generated
	 */
	void setPhase_A_reactance(String value);

	/**
	 * Returns the value of the '<em><b>Phase Bimpedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Bimpedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Bimpedance</em>' attribute.
	 * @see #setPhase_B_impedance(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Phase_B_impedance()
	 * @model
	 * @generated
	 */
	String getPhase_B_impedance();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPhase_B_impedance <em>Phase Bimpedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Bimpedance</em>' attribute.
	 * @see #getPhase_B_impedance()
	 * @generated
	 */
	void setPhase_B_impedance(String value);

	/**
	 * Returns the value of the '<em><b>Phase Bresistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Bresistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Bresistance</em>' attribute.
	 * @see #setPhase_B_resistance(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Phase_B_resistance()
	 * @model
	 * @generated
	 */
	String getPhase_B_resistance();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPhase_B_resistance <em>Phase Bresistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Bresistance</em>' attribute.
	 * @see #getPhase_B_resistance()
	 * @generated
	 */
	void setPhase_B_resistance(String value);

	/**
	 * Returns the value of the '<em><b>Phase Breactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Breactance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Breactance</em>' attribute.
	 * @see #setPhase_B_reactance(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Phase_B_reactance()
	 * @model
	 * @generated
	 */
	String getPhase_B_reactance();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPhase_B_reactance <em>Phase Breactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Breactance</em>' attribute.
	 * @see #getPhase_B_reactance()
	 * @generated
	 */
	void setPhase_B_reactance(String value);

	/**
	 * Returns the value of the '<em><b>Phase Cimpedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Cimpedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Cimpedance</em>' attribute.
	 * @see #setPhase_C_impedance(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Phase_C_impedance()
	 * @model
	 * @generated
	 */
	String getPhase_C_impedance();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPhase_C_impedance <em>Phase Cimpedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Cimpedance</em>' attribute.
	 * @see #getPhase_C_impedance()
	 * @generated
	 */
	void setPhase_C_impedance(String value);

	/**
	 * Returns the value of the '<em><b>Phase Cresistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Cresistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Cresistance</em>' attribute.
	 * @see #setPhase_C_resistance(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Phase_C_resistance()
	 * @model
	 * @generated
	 */
	String getPhase_C_resistance();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPhase_C_resistance <em>Phase Cresistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Cresistance</em>' attribute.
	 * @see #getPhase_C_resistance()
	 * @generated
	 */
	void setPhase_C_resistance(String value);

	/**
	 * Returns the value of the '<em><b>Phase Creactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Creactance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Creactance</em>' attribute.
	 * @see #setPhase_C_reactance(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Phase_C_reactance()
	 * @model
	 * @generated
	 */
	String getPhase_C_reactance();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPhase_C_reactance <em>Phase Creactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Creactance</em>' attribute.
	 * @see #getPhase_C_reactance()
	 * @generated
	 */
	void setPhase_C_reactance(String value);

	/**
	 * Returns the value of the '<em><b>Rated current limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated current limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated current limit</em>' attribute.
	 * @see #setRated_current_limit(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Rated_current_limit()
	 * @model
	 * @generated
	 */
	String getRated_current_limit();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getRated_current_limit <em>Rated current limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated current limit</em>' attribute.
	 * @see #getRated_current_limit()
	 * @generated
	 */
	void setRated_current_limit(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_From()
	 * @model
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_To()
	 * @model
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Power in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power in</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power in</em>' attribute.
	 * @see #setPower_in(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_in()
	 * @model
	 * @generated
	 */
	String getPower_in();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_in <em>Power in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power in</em>' attribute.
	 * @see #getPower_in()
	 * @generated
	 */
	void setPower_in(String value);

	/**
	 * Returns the value of the '<em><b>Power out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power out</em>' attribute.
	 * @see #setPower_out(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_out()
	 * @model
	 * @generated
	 */
	String getPower_out();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_out <em>Power out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power out</em>' attribute.
	 * @see #getPower_out()
	 * @generated
	 */
	void setPower_out(String value);

	/**
	 * Returns the value of the '<em><b>Power losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power losses</em>' attribute.
	 * @see #setPower_losses(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_losses()
	 * @model
	 * @generated
	 */
	String getPower_losses();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_losses <em>Power losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power losses</em>' attribute.
	 * @see #getPower_losses()
	 * @generated
	 */
	void setPower_losses(String value);

	/**
	 * Returns the value of the '<em><b>Power in A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power in A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power in A</em>' attribute.
	 * @see #setPower_in_A(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_in_A()
	 * @model
	 * @generated
	 */
	String getPower_in_A();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_in_A <em>Power in A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power in A</em>' attribute.
	 * @see #getPower_in_A()
	 * @generated
	 */
	void setPower_in_A(String value);

	/**
	 * Returns the value of the '<em><b>Power in B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power in B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power in B</em>' attribute.
	 * @see #setPower_in_B(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_in_B()
	 * @model
	 * @generated
	 */
	String getPower_in_B();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_in_B <em>Power in B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power in B</em>' attribute.
	 * @see #getPower_in_B()
	 * @generated
	 */
	void setPower_in_B(String value);

	/**
	 * Returns the value of the '<em><b>Power in C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power in C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power in C</em>' attribute.
	 * @see #setPower_in_C(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_in_C()
	 * @model
	 * @generated
	 */
	String getPower_in_C();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_in_C <em>Power in C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power in C</em>' attribute.
	 * @see #getPower_in_C()
	 * @generated
	 */
	void setPower_in_C(String value);

	/**
	 * Returns the value of the '<em><b>Power out A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power out A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power out A</em>' attribute.
	 * @see #setPower_out_A(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_out_A()
	 * @model
	 * @generated
	 */
	String getPower_out_A();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_out_A <em>Power out A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power out A</em>' attribute.
	 * @see #getPower_out_A()
	 * @generated
	 */
	void setPower_out_A(String value);

	/**
	 * Returns the value of the '<em><b>Power out B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power out B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power out B</em>' attribute.
	 * @see #setPower_out_B(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_out_B()
	 * @model
	 * @generated
	 */
	String getPower_out_B();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_out_B <em>Power out B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power out B</em>' attribute.
	 * @see #getPower_out_B()
	 * @generated
	 */
	void setPower_out_B(String value);

	/**
	 * Returns the value of the '<em><b>Power out C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power out C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power out C</em>' attribute.
	 * @see #setPower_out_C(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_out_C()
	 * @model
	 * @generated
	 */
	String getPower_out_C();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_out_C <em>Power out C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power out C</em>' attribute.
	 * @see #getPower_out_C()
	 * @generated
	 */
	void setPower_out_C(String value);

	/**
	 * Returns the value of the '<em><b>Power losses A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power losses A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power losses A</em>' attribute.
	 * @see #setPower_losses_A(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_losses_A()
	 * @model
	 * @generated
	 */
	String getPower_losses_A();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_losses_A <em>Power losses A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power losses A</em>' attribute.
	 * @see #getPower_losses_A()
	 * @generated
	 */
	void setPower_losses_A(String value);

	/**
	 * Returns the value of the '<em><b>Power losses B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power losses B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power losses B</em>' attribute.
	 * @see #setPower_losses_B(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_losses_B()
	 * @model
	 * @generated
	 */
	String getPower_losses_B();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_losses_B <em>Power losses B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power losses B</em>' attribute.
	 * @see #getPower_losses_B()
	 * @generated
	 */
	void setPower_losses_B(String value);

	/**
	 * Returns the value of the '<em><b>Power losses C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power losses C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power losses C</em>' attribute.
	 * @see #setPower_losses_C(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Power_losses_C()
	 * @model
	 * @generated
	 */
	String getPower_losses_C();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPower_losses_C <em>Power losses C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power losses C</em>' attribute.
	 * @see #getPower_losses_C()
	 * @generated
	 */
	void setPower_losses_C(String value);

	/**
	 * Returns the value of the '<em><b>Flow direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow direction</em>' attribute.
	 * @see #setFlow_direction(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Flow_direction()
	 * @model
	 * @generated
	 */
	String getFlow_direction();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getFlow_direction <em>Flow direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow direction</em>' attribute.
	 * @see #getFlow_direction()
	 * @generated
	 */
	void setFlow_direction(String value);

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' attribute.
	 * @see #setPhases(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

	/**
	 * Returns the value of the '<em><b>Nominal voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal voltage</em>' attribute.
	 * @see #setNominal_voltage(String)
	 * @see visGrid.VisGridPackage#getSeries_reactor_Nominal_voltage()
	 * @model
	 * @generated
	 */
	String getNominal_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Series_reactor#getNominal_voltage <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal voltage</em>' attribute.
	 * @see #getNominal_voltage()
	 * @generated
	 */
	void setNominal_voltage(String value);

} // Series_reactor
