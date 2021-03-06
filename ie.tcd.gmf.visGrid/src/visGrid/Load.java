/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Load#getLoad_class <em>Load class</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_power_A <em>Constant power A</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_power_B <em>Constant power B</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_power_C <em>Constant power C</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_power_A_real <em>Constant power Areal</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_power_B_real <em>Constant power Breal</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_power_C_real <em>Constant power Creal</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_power_A_reac <em>Constant power Areac</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_power_B_reac <em>Constant power Breac</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_power_C_reac <em>Constant power Creac</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_current_A <em>Constant current A</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_current_B <em>Constant current B</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_current_C <em>Constant current C</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_current_A_real <em>Constant current Areal</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_current_B_real <em>Constant current Breal</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_current_C_real <em>Constant current Creal</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_current_A_reac <em>Constant current Areac</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_current_B_reac <em>Constant current Breac</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_current_C_reac <em>Constant current Creac</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_impedance_A <em>Constant impedance A</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_impedance_B <em>Constant impedance B</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_impedance_C <em>Constant impedance C</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_impedance_A_real <em>Constant impedance Areal</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_impedance_B_real <em>Constant impedance Breal</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_impedance_C_real <em>Constant impedance Creal</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_impedance_A_reac <em>Constant impedance Areac</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_impedance_B_reac <em>Constant impedance Breac</em>}</li>
 *   <li>{@link visGrid.Load#getConstant_impedance_C_reac <em>Constant impedance Creac</em>}</li>
 *   <li>{@link visGrid.Load#getMeasured_voltage_A <em>Measured voltage A</em>}</li>
 *   <li>{@link visGrid.Load#getMeasured_voltage_B <em>Measured voltage B</em>}</li>
 *   <li>{@link visGrid.Load#getMeasured_voltage_C <em>Measured voltage C</em>}</li>
 *   <li>{@link visGrid.Load#getMeasured_voltage_AB <em>Measured voltage AB</em>}</li>
 *   <li>{@link visGrid.Load#getMeasured_voltage_BC <em>Measured voltage BC</em>}</li>
 *   <li>{@link visGrid.Load#getMeasured_voltage_CA <em>Measured voltage CA</em>}</li>
 *   <li>{@link visGrid.Load#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.Load#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.Load#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.Load#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.Load#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.Load#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.Load#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.Load#getVoltage_AB <em>Voltage AB</em>}</li>
 *   <li>{@link visGrid.Load#getVoltage_BC <em>Voltage BC</em>}</li>
 *   <li>{@link visGrid.Load#getVoltage_CA <em>Voltage CA</em>}</li>
 *   <li>{@link visGrid.Load#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.Load#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.Load#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.Load#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.Load#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.Load#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.Load#getShunt_A <em>Shunt A</em>}</li>
 *   <li>{@link visGrid.Load#getShunt_B <em>Shunt B</em>}</li>
 *   <li>{@link visGrid.Load#getShunt_C <em>Shunt C</em>}</li>
 *   <li>{@link visGrid.Load#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.Load#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getLoad()
 * @model
 * @generated
 */
public interface Load extends Connection {
	/**
	 * Returns the value of the '<em><b>Load class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load class</em>' attribute.
	 * @see #setLoad_class(String)
	 * @see visGrid.VisGridPackage#getLoad_Load_class()
	 * @model
	 * @generated
	 */
	String getLoad_class();

	/**
	 * Sets the value of the '{@link visGrid.Load#getLoad_class <em>Load class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load class</em>' attribute.
	 * @see #getLoad_class()
	 * @generated
	 */
	void setLoad_class(String value);

	/**
	 * Returns the value of the '<em><b>Constant power A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power A</em>' attribute.
	 * @see #setConstant_power_A(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_power_A()
	 * @model
	 * @generated
	 */
	String getConstant_power_A();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_power_A <em>Constant power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power A</em>' attribute.
	 * @see #getConstant_power_A()
	 * @generated
	 */
	void setConstant_power_A(String value);

	/**
	 * Returns the value of the '<em><b>Constant power B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power B</em>' attribute.
	 * @see #setConstant_power_B(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_power_B()
	 * @model
	 * @generated
	 */
	String getConstant_power_B();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_power_B <em>Constant power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power B</em>' attribute.
	 * @see #getConstant_power_B()
	 * @generated
	 */
	void setConstant_power_B(String value);

	/**
	 * Returns the value of the '<em><b>Constant power C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power C</em>' attribute.
	 * @see #setConstant_power_C(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_power_C()
	 * @model
	 * @generated
	 */
	String getConstant_power_C();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_power_C <em>Constant power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power C</em>' attribute.
	 * @see #getConstant_power_C()
	 * @generated
	 */
	void setConstant_power_C(String value);

	/**
	 * Returns the value of the '<em><b>Constant power Areal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power Areal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power Areal</em>' attribute.
	 * @see #setConstant_power_A_real(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_power_A_real()
	 * @model
	 * @generated
	 */
	String getConstant_power_A_real();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_power_A_real <em>Constant power Areal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power Areal</em>' attribute.
	 * @see #getConstant_power_A_real()
	 * @generated
	 */
	void setConstant_power_A_real(String value);

	/**
	 * Returns the value of the '<em><b>Constant power Breal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power Breal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power Breal</em>' attribute.
	 * @see #setConstant_power_B_real(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_power_B_real()
	 * @model
	 * @generated
	 */
	String getConstant_power_B_real();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_power_B_real <em>Constant power Breal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power Breal</em>' attribute.
	 * @see #getConstant_power_B_real()
	 * @generated
	 */
	void setConstant_power_B_real(String value);

	/**
	 * Returns the value of the '<em><b>Constant power Creal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power Creal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power Creal</em>' attribute.
	 * @see #setConstant_power_C_real(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_power_C_real()
	 * @model
	 * @generated
	 */
	String getConstant_power_C_real();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_power_C_real <em>Constant power Creal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power Creal</em>' attribute.
	 * @see #getConstant_power_C_real()
	 * @generated
	 */
	void setConstant_power_C_real(String value);

	/**
	 * Returns the value of the '<em><b>Constant power Areac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power Areac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power Areac</em>' attribute.
	 * @see #setConstant_power_A_reac(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_power_A_reac()
	 * @model
	 * @generated
	 */
	String getConstant_power_A_reac();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_power_A_reac <em>Constant power Areac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power Areac</em>' attribute.
	 * @see #getConstant_power_A_reac()
	 * @generated
	 */
	void setConstant_power_A_reac(String value);

	/**
	 * Returns the value of the '<em><b>Constant power Breac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power Breac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power Breac</em>' attribute.
	 * @see #setConstant_power_B_reac(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_power_B_reac()
	 * @model
	 * @generated
	 */
	String getConstant_power_B_reac();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_power_B_reac <em>Constant power Breac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power Breac</em>' attribute.
	 * @see #getConstant_power_B_reac()
	 * @generated
	 */
	void setConstant_power_B_reac(String value);

	/**
	 * Returns the value of the '<em><b>Constant power Creac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power Creac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power Creac</em>' attribute.
	 * @see #setConstant_power_C_reac(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_power_C_reac()
	 * @model
	 * @generated
	 */
	String getConstant_power_C_reac();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_power_C_reac <em>Constant power Creac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power Creac</em>' attribute.
	 * @see #getConstant_power_C_reac()
	 * @generated
	 */
	void setConstant_power_C_reac(String value);

	/**
	 * Returns the value of the '<em><b>Constant current A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current A</em>' attribute.
	 * @see #setConstant_current_A(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_current_A()
	 * @model
	 * @generated
	 */
	String getConstant_current_A();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_current_A <em>Constant current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current A</em>' attribute.
	 * @see #getConstant_current_A()
	 * @generated
	 */
	void setConstant_current_A(String value);

	/**
	 * Returns the value of the '<em><b>Constant current B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current B</em>' attribute.
	 * @see #setConstant_current_B(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_current_B()
	 * @model
	 * @generated
	 */
	String getConstant_current_B();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_current_B <em>Constant current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current B</em>' attribute.
	 * @see #getConstant_current_B()
	 * @generated
	 */
	void setConstant_current_B(String value);

	/**
	 * Returns the value of the '<em><b>Constant current C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current C</em>' attribute.
	 * @see #setConstant_current_C(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_current_C()
	 * @model
	 * @generated
	 */
	String getConstant_current_C();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_current_C <em>Constant current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current C</em>' attribute.
	 * @see #getConstant_current_C()
	 * @generated
	 */
	void setConstant_current_C(String value);

	/**
	 * Returns the value of the '<em><b>Constant current Areal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current Areal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current Areal</em>' attribute.
	 * @see #setConstant_current_A_real(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_current_A_real()
	 * @model
	 * @generated
	 */
	String getConstant_current_A_real();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_current_A_real <em>Constant current Areal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current Areal</em>' attribute.
	 * @see #getConstant_current_A_real()
	 * @generated
	 */
	void setConstant_current_A_real(String value);

	/**
	 * Returns the value of the '<em><b>Constant current Breal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current Breal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current Breal</em>' attribute.
	 * @see #setConstant_current_B_real(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_current_B_real()
	 * @model
	 * @generated
	 */
	String getConstant_current_B_real();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_current_B_real <em>Constant current Breal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current Breal</em>' attribute.
	 * @see #getConstant_current_B_real()
	 * @generated
	 */
	void setConstant_current_B_real(String value);

	/**
	 * Returns the value of the '<em><b>Constant current Creal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current Creal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current Creal</em>' attribute.
	 * @see #setConstant_current_C_real(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_current_C_real()
	 * @model
	 * @generated
	 */
	String getConstant_current_C_real();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_current_C_real <em>Constant current Creal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current Creal</em>' attribute.
	 * @see #getConstant_current_C_real()
	 * @generated
	 */
	void setConstant_current_C_real(String value);

	/**
	 * Returns the value of the '<em><b>Constant current Areac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current Areac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current Areac</em>' attribute.
	 * @see #setConstant_current_A_reac(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_current_A_reac()
	 * @model
	 * @generated
	 */
	String getConstant_current_A_reac();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_current_A_reac <em>Constant current Areac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current Areac</em>' attribute.
	 * @see #getConstant_current_A_reac()
	 * @generated
	 */
	void setConstant_current_A_reac(String value);

	/**
	 * Returns the value of the '<em><b>Constant current Breac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current Breac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current Breac</em>' attribute.
	 * @see #setConstant_current_B_reac(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_current_B_reac()
	 * @model
	 * @generated
	 */
	String getConstant_current_B_reac();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_current_B_reac <em>Constant current Breac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current Breac</em>' attribute.
	 * @see #getConstant_current_B_reac()
	 * @generated
	 */
	void setConstant_current_B_reac(String value);

	/**
	 * Returns the value of the '<em><b>Constant current Creac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current Creac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current Creac</em>' attribute.
	 * @see #setConstant_current_C_reac(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_current_C_reac()
	 * @model
	 * @generated
	 */
	String getConstant_current_C_reac();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_current_C_reac <em>Constant current Creac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current Creac</em>' attribute.
	 * @see #getConstant_current_C_reac()
	 * @generated
	 */
	void setConstant_current_C_reac(String value);

	/**
	 * Returns the value of the '<em><b>Constant impedance A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant impedance A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant impedance A</em>' attribute.
	 * @see #setConstant_impedance_A(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_impedance_A()
	 * @model
	 * @generated
	 */
	String getConstant_impedance_A();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_impedance_A <em>Constant impedance A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant impedance A</em>' attribute.
	 * @see #getConstant_impedance_A()
	 * @generated
	 */
	void setConstant_impedance_A(String value);

	/**
	 * Returns the value of the '<em><b>Constant impedance B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant impedance B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant impedance B</em>' attribute.
	 * @see #setConstant_impedance_B(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_impedance_B()
	 * @model
	 * @generated
	 */
	String getConstant_impedance_B();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_impedance_B <em>Constant impedance B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant impedance B</em>' attribute.
	 * @see #getConstant_impedance_B()
	 * @generated
	 */
	void setConstant_impedance_B(String value);

	/**
	 * Returns the value of the '<em><b>Constant impedance C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant impedance C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant impedance C</em>' attribute.
	 * @see #setConstant_impedance_C(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_impedance_C()
	 * @model
	 * @generated
	 */
	String getConstant_impedance_C();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_impedance_C <em>Constant impedance C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant impedance C</em>' attribute.
	 * @see #getConstant_impedance_C()
	 * @generated
	 */
	void setConstant_impedance_C(String value);

	/**
	 * Returns the value of the '<em><b>Constant impedance Areal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant impedance Areal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant impedance Areal</em>' attribute.
	 * @see #setConstant_impedance_A_real(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_impedance_A_real()
	 * @model
	 * @generated
	 */
	String getConstant_impedance_A_real();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_impedance_A_real <em>Constant impedance Areal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant impedance Areal</em>' attribute.
	 * @see #getConstant_impedance_A_real()
	 * @generated
	 */
	void setConstant_impedance_A_real(String value);

	/**
	 * Returns the value of the '<em><b>Constant impedance Breal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant impedance Breal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant impedance Breal</em>' attribute.
	 * @see #setConstant_impedance_B_real(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_impedance_B_real()
	 * @model
	 * @generated
	 */
	String getConstant_impedance_B_real();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_impedance_B_real <em>Constant impedance Breal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant impedance Breal</em>' attribute.
	 * @see #getConstant_impedance_B_real()
	 * @generated
	 */
	void setConstant_impedance_B_real(String value);

	/**
	 * Returns the value of the '<em><b>Constant impedance Creal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant impedance Creal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant impedance Creal</em>' attribute.
	 * @see #setConstant_impedance_C_real(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_impedance_C_real()
	 * @model
	 * @generated
	 */
	String getConstant_impedance_C_real();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_impedance_C_real <em>Constant impedance Creal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant impedance Creal</em>' attribute.
	 * @see #getConstant_impedance_C_real()
	 * @generated
	 */
	void setConstant_impedance_C_real(String value);

	/**
	 * Returns the value of the '<em><b>Constant impedance Areac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant impedance Areac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant impedance Areac</em>' attribute.
	 * @see #setConstant_impedance_A_reac(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_impedance_A_reac()
	 * @model
	 * @generated
	 */
	String getConstant_impedance_A_reac();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_impedance_A_reac <em>Constant impedance Areac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant impedance Areac</em>' attribute.
	 * @see #getConstant_impedance_A_reac()
	 * @generated
	 */
	void setConstant_impedance_A_reac(String value);

	/**
	 * Returns the value of the '<em><b>Constant impedance Breac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant impedance Breac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant impedance Breac</em>' attribute.
	 * @see #setConstant_impedance_B_reac(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_impedance_B_reac()
	 * @model
	 * @generated
	 */
	String getConstant_impedance_B_reac();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_impedance_B_reac <em>Constant impedance Breac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant impedance Breac</em>' attribute.
	 * @see #getConstant_impedance_B_reac()
	 * @generated
	 */
	void setConstant_impedance_B_reac(String value);

	/**
	 * Returns the value of the '<em><b>Constant impedance Creac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant impedance Creac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant impedance Creac</em>' attribute.
	 * @see #setConstant_impedance_C_reac(String)
	 * @see visGrid.VisGridPackage#getLoad_Constant_impedance_C_reac()
	 * @model
	 * @generated
	 */
	String getConstant_impedance_C_reac();

	/**
	 * Sets the value of the '{@link visGrid.Load#getConstant_impedance_C_reac <em>Constant impedance Creac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant impedance Creac</em>' attribute.
	 * @see #getConstant_impedance_C_reac()
	 * @generated
	 */
	void setConstant_impedance_C_reac(String value);

	/**
	 * Returns the value of the '<em><b>Measured voltage A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured voltage A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured voltage A</em>' attribute.
	 * @see #setMeasured_voltage_A(String)
	 * @see visGrid.VisGridPackage#getLoad_Measured_voltage_A()
	 * @model
	 * @generated
	 */
	String getMeasured_voltage_A();

	/**
	 * Sets the value of the '{@link visGrid.Load#getMeasured_voltage_A <em>Measured voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured voltage A</em>' attribute.
	 * @see #getMeasured_voltage_A()
	 * @generated
	 */
	void setMeasured_voltage_A(String value);

	/**
	 * Returns the value of the '<em><b>Measured voltage B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured voltage B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured voltage B</em>' attribute.
	 * @see #setMeasured_voltage_B(String)
	 * @see visGrid.VisGridPackage#getLoad_Measured_voltage_B()
	 * @model
	 * @generated
	 */
	String getMeasured_voltage_B();

	/**
	 * Sets the value of the '{@link visGrid.Load#getMeasured_voltage_B <em>Measured voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured voltage B</em>' attribute.
	 * @see #getMeasured_voltage_B()
	 * @generated
	 */
	void setMeasured_voltage_B(String value);

	/**
	 * Returns the value of the '<em><b>Measured voltage C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured voltage C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured voltage C</em>' attribute.
	 * @see #setMeasured_voltage_C(String)
	 * @see visGrid.VisGridPackage#getLoad_Measured_voltage_C()
	 * @model
	 * @generated
	 */
	String getMeasured_voltage_C();

	/**
	 * Sets the value of the '{@link visGrid.Load#getMeasured_voltage_C <em>Measured voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured voltage C</em>' attribute.
	 * @see #getMeasured_voltage_C()
	 * @generated
	 */
	void setMeasured_voltage_C(String value);

	/**
	 * Returns the value of the '<em><b>Measured voltage AB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured voltage AB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured voltage AB</em>' attribute.
	 * @see #setMeasured_voltage_AB(String)
	 * @see visGrid.VisGridPackage#getLoad_Measured_voltage_AB()
	 * @model
	 * @generated
	 */
	String getMeasured_voltage_AB();

	/**
	 * Sets the value of the '{@link visGrid.Load#getMeasured_voltage_AB <em>Measured voltage AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured voltage AB</em>' attribute.
	 * @see #getMeasured_voltage_AB()
	 * @generated
	 */
	void setMeasured_voltage_AB(String value);

	/**
	 * Returns the value of the '<em><b>Measured voltage BC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured voltage BC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured voltage BC</em>' attribute.
	 * @see #setMeasured_voltage_BC(String)
	 * @see visGrid.VisGridPackage#getLoad_Measured_voltage_BC()
	 * @model
	 * @generated
	 */
	String getMeasured_voltage_BC();

	/**
	 * Sets the value of the '{@link visGrid.Load#getMeasured_voltage_BC <em>Measured voltage BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured voltage BC</em>' attribute.
	 * @see #getMeasured_voltage_BC()
	 * @generated
	 */
	void setMeasured_voltage_BC(String value);

	/**
	 * Returns the value of the '<em><b>Measured voltage CA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured voltage CA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured voltage CA</em>' attribute.
	 * @see #setMeasured_voltage_CA(String)
	 * @see visGrid.VisGridPackage#getLoad_Measured_voltage_CA()
	 * @model
	 * @generated
	 */
	String getMeasured_voltage_CA();

	/**
	 * Sets the value of the '{@link visGrid.Load#getMeasured_voltage_CA <em>Measured voltage CA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured voltage CA</em>' attribute.
	 * @see #getMeasured_voltage_CA()
	 * @generated
	 */
	void setMeasured_voltage_CA(String value);

	/**
	 * Returns the value of the '<em><b>Bustype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bustype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bustype</em>' attribute.
	 * @see #setBustype(String)
	 * @see visGrid.VisGridPackage#getLoad_Bustype()
	 * @model
	 * @generated
	 */
	String getBustype();

	/**
	 * Sets the value of the '{@link visGrid.Load#getBustype <em>Bustype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bustype</em>' attribute.
	 * @see #getBustype()
	 * @generated
	 */
	void setBustype(String value);

	/**
	 * Returns the value of the '<em><b>Busflags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busflags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busflags</em>' attribute.
	 * @see #setBusflags(String)
	 * @see visGrid.VisGridPackage#getLoad_Busflags()
	 * @model
	 * @generated
	 */
	String getBusflags();

	/**
	 * Sets the value of the '{@link visGrid.Load#getBusflags <em>Busflags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busflags</em>' attribute.
	 * @see #getBusflags()
	 * @generated
	 */
	void setBusflags(String value);

	/**
	 * Returns the value of the '<em><b>Reference bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference bus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference bus</em>' attribute.
	 * @see #setReference_bus(String)
	 * @see visGrid.VisGridPackage#getLoad_Reference_bus()
	 * @model
	 * @generated
	 */
	String getReference_bus();

	/**
	 * Sets the value of the '{@link visGrid.Load#getReference_bus <em>Reference bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference bus</em>' attribute.
	 * @see #getReference_bus()
	 * @generated
	 */
	void setReference_bus(String value);

	/**
	 * Returns the value of the '<em><b>Maximum voltage error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum voltage error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum voltage error</em>' attribute.
	 * @see #setMaximum_voltage_error(String)
	 * @see visGrid.VisGridPackage#getLoad_Maximum_voltage_error()
	 * @model
	 * @generated
	 */
	String getMaximum_voltage_error();

	/**
	 * Sets the value of the '{@link visGrid.Load#getMaximum_voltage_error <em>Maximum voltage error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum voltage error</em>' attribute.
	 * @see #getMaximum_voltage_error()
	 * @generated
	 */
	void setMaximum_voltage_error(String value);

	/**
	 * Returns the value of the '<em><b>Voltage A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage A</em>' attribute.
	 * @see #setVoltage_A(String)
	 * @see visGrid.VisGridPackage#getLoad_Voltage_A()
	 * @model
	 * @generated
	 */
	String getVoltage_A();

	/**
	 * Sets the value of the '{@link visGrid.Load#getVoltage_A <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage A</em>' attribute.
	 * @see #getVoltage_A()
	 * @generated
	 */
	void setVoltage_A(String value);

	/**
	 * Returns the value of the '<em><b>Voltage B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage B</em>' attribute.
	 * @see #setVoltage_B(String)
	 * @see visGrid.VisGridPackage#getLoad_Voltage_B()
	 * @model
	 * @generated
	 */
	String getVoltage_B();

	/**
	 * Sets the value of the '{@link visGrid.Load#getVoltage_B <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage B</em>' attribute.
	 * @see #getVoltage_B()
	 * @generated
	 */
	void setVoltage_B(String value);

	/**
	 * Returns the value of the '<em><b>Voltage C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage C</em>' attribute.
	 * @see #setVoltage_C(String)
	 * @see visGrid.VisGridPackage#getLoad_Voltage_C()
	 * @model
	 * @generated
	 */
	String getVoltage_C();

	/**
	 * Sets the value of the '{@link visGrid.Load#getVoltage_C <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage C</em>' attribute.
	 * @see #getVoltage_C()
	 * @generated
	 */
	void setVoltage_C(String value);

	/**
	 * Returns the value of the '<em><b>Voltage AB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage AB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage AB</em>' attribute.
	 * @see #setVoltage_AB(String)
	 * @see visGrid.VisGridPackage#getLoad_Voltage_AB()
	 * @model
	 * @generated
	 */
	String getVoltage_AB();

	/**
	 * Sets the value of the '{@link visGrid.Load#getVoltage_AB <em>Voltage AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage AB</em>' attribute.
	 * @see #getVoltage_AB()
	 * @generated
	 */
	void setVoltage_AB(String value);

	/**
	 * Returns the value of the '<em><b>Voltage BC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage BC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage BC</em>' attribute.
	 * @see #setVoltage_BC(String)
	 * @see visGrid.VisGridPackage#getLoad_Voltage_BC()
	 * @model
	 * @generated
	 */
	String getVoltage_BC();

	/**
	 * Sets the value of the '{@link visGrid.Load#getVoltage_BC <em>Voltage BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage BC</em>' attribute.
	 * @see #getVoltage_BC()
	 * @generated
	 */
	void setVoltage_BC(String value);

	/**
	 * Returns the value of the '<em><b>Voltage CA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage CA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage CA</em>' attribute.
	 * @see #setVoltage_CA(String)
	 * @see visGrid.VisGridPackage#getLoad_Voltage_CA()
	 * @model
	 * @generated
	 */
	String getVoltage_CA();

	/**
	 * Sets the value of the '{@link visGrid.Load#getVoltage_CA <em>Voltage CA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage CA</em>' attribute.
	 * @see #getVoltage_CA()
	 * @generated
	 */
	void setVoltage_CA(String value);

	/**
	 * Returns the value of the '<em><b>Current A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current A</em>' attribute.
	 * @see #setCurrent_A(String)
	 * @see visGrid.VisGridPackage#getLoad_Current_A()
	 * @model
	 * @generated
	 */
	String getCurrent_A();

	/**
	 * Sets the value of the '{@link visGrid.Load#getCurrent_A <em>Current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current A</em>' attribute.
	 * @see #getCurrent_A()
	 * @generated
	 */
	void setCurrent_A(String value);

	/**
	 * Returns the value of the '<em><b>Current B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current B</em>' attribute.
	 * @see #setCurrent_B(String)
	 * @see visGrid.VisGridPackage#getLoad_Current_B()
	 * @model
	 * @generated
	 */
	String getCurrent_B();

	/**
	 * Sets the value of the '{@link visGrid.Load#getCurrent_B <em>Current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current B</em>' attribute.
	 * @see #getCurrent_B()
	 * @generated
	 */
	void setCurrent_B(String value);

	/**
	 * Returns the value of the '<em><b>Current C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current C</em>' attribute.
	 * @see #setCurrent_C(String)
	 * @see visGrid.VisGridPackage#getLoad_Current_C()
	 * @model
	 * @generated
	 */
	String getCurrent_C();

	/**
	 * Sets the value of the '{@link visGrid.Load#getCurrent_C <em>Current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current C</em>' attribute.
	 * @see #getCurrent_C()
	 * @generated
	 */
	void setCurrent_C(String value);

	/**
	 * Returns the value of the '<em><b>Power A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power A</em>' attribute.
	 * @see #setPower_A(String)
	 * @see visGrid.VisGridPackage#getLoad_Power_A()
	 * @model
	 * @generated
	 */
	String getPower_A();

	/**
	 * Sets the value of the '{@link visGrid.Load#getPower_A <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power A</em>' attribute.
	 * @see #getPower_A()
	 * @generated
	 */
	void setPower_A(String value);

	/**
	 * Returns the value of the '<em><b>Power B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power B</em>' attribute.
	 * @see #setPower_B(String)
	 * @see visGrid.VisGridPackage#getLoad_Power_B()
	 * @model
	 * @generated
	 */
	String getPower_B();

	/**
	 * Sets the value of the '{@link visGrid.Load#getPower_B <em>Power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power B</em>' attribute.
	 * @see #getPower_B()
	 * @generated
	 */
	void setPower_B(String value);

	/**
	 * Returns the value of the '<em><b>Power C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power C</em>' attribute.
	 * @see #setPower_C(String)
	 * @see visGrid.VisGridPackage#getLoad_Power_C()
	 * @model
	 * @generated
	 */
	String getPower_C();

	/**
	 * Sets the value of the '{@link visGrid.Load#getPower_C <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power C</em>' attribute.
	 * @see #getPower_C()
	 * @generated
	 */
	void setPower_C(String value);

	/**
	 * Returns the value of the '<em><b>Shunt A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt A</em>' attribute.
	 * @see #setShunt_A(String)
	 * @see visGrid.VisGridPackage#getLoad_Shunt_A()
	 * @model
	 * @generated
	 */
	String getShunt_A();

	/**
	 * Sets the value of the '{@link visGrid.Load#getShunt_A <em>Shunt A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt A</em>' attribute.
	 * @see #getShunt_A()
	 * @generated
	 */
	void setShunt_A(String value);

	/**
	 * Returns the value of the '<em><b>Shunt B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt B</em>' attribute.
	 * @see #setShunt_B(String)
	 * @see visGrid.VisGridPackage#getLoad_Shunt_B()
	 * @model
	 * @generated
	 */
	String getShunt_B();

	/**
	 * Sets the value of the '{@link visGrid.Load#getShunt_B <em>Shunt B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt B</em>' attribute.
	 * @see #getShunt_B()
	 * @generated
	 */
	void setShunt_B(String value);

	/**
	 * Returns the value of the '<em><b>Shunt C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt C</em>' attribute.
	 * @see #setShunt_C(String)
	 * @see visGrid.VisGridPackage#getLoad_Shunt_C()
	 * @model
	 * @generated
	 */
	String getShunt_C();

	/**
	 * Sets the value of the '{@link visGrid.Load#getShunt_C <em>Shunt C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt C</em>' attribute.
	 * @see #getShunt_C()
	 * @generated
	 */
	void setShunt_C(String value);

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
	 * @see visGrid.VisGridPackage#getLoad_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Load#getPhases <em>Phases</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getLoad_Nominal_voltage()
	 * @model
	 * @generated
	 */
	String getNominal_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Load#getNominal_voltage <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal voltage</em>' attribute.
	 * @see #getNominal_voltage()
	 * @generated
	 */
	void setNominal_voltage(String value);

} // Load
