/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microturbine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Microturbine#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.Microturbine#getGenerator_status <em>Generator status</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPower_type <em>Power type</em>}</li>
 *   <li>{@link visGrid.Microturbine#getRinternal <em>Rinternal</em>}</li>
 *   <li>{@link visGrid.Microturbine#getRload <em>Rload</em>}</li>
 *   <li>{@link visGrid.Microturbine#getV_Max <em>VMax</em>}</li>
 *   <li>{@link visGrid.Microturbine#getI_Max <em>IMax</em>}</li>
 *   <li>{@link visGrid.Microturbine#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link visGrid.Microturbine#getMax_Frequency <em>Max Frequency</em>}</li>
 *   <li>{@link visGrid.Microturbine#getMin_Frequency <em>Min Frequency</em>}</li>
 *   <li>{@link visGrid.Microturbine#getFuel_Used <em>Fuel Used</em>}</li>
 *   <li>{@link visGrid.Microturbine#getHeat_Out <em>Heat Out</em>}</li>
 *   <li>{@link visGrid.Microturbine#getKV <em>KV</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPower_Angle <em>Power Angle</em>}</li>
 *   <li>{@link visGrid.Microturbine#getMax_P <em>Max P</em>}</li>
 *   <li>{@link visGrid.Microturbine#getMin_P <em>Min P</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPhaseA_V_Out <em>Phase AVOut</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPhaseB_V_Out <em>Phase BVOut</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPhaseC_V_Out <em>Phase CVOut</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPhaseA_I_Out <em>Phase AIOut</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPhaseB_I_Out <em>Phase BIOut</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPhaseC_I_Out <em>Phase CIOut</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPower_A_Out <em>Power AOut</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPower_B_Out <em>Power BOut</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPower_C_Out <em>Power COut</em>}</li>
 *   <li>{@link visGrid.Microturbine#getVA_Out <em>VA Out</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPf_Out <em>Pf Out</em>}</li>
 *   <li>{@link visGrid.Microturbine#getE_A_Internal <em>EAInternal</em>}</li>
 *   <li>{@link visGrid.Microturbine#getE_B_Internal <em>EBInternal</em>}</li>
 *   <li>{@link visGrid.Microturbine#getE_C_Internal <em>ECInternal</em>}</li>
 *   <li>{@link visGrid.Microturbine#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link visGrid.Microturbine#getRated_kVA <em>Rated kVA</em>}</li>
 *   <li>{@link visGrid.Microturbine#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getMicroturbine()
 * @model
 * @generated
 */
public interface Microturbine extends Connection {
	/**
	 * Returns the value of the '<em><b>Generator mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator mode</em>' attribute.
	 * @see #setGenerator_mode(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Generator_mode()
	 * @model
	 * @generated
	 */
	String getGenerator_mode();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getGenerator_mode <em>Generator mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator mode</em>' attribute.
	 * @see #getGenerator_mode()
	 * @generated
	 */
	void setGenerator_mode(String value);

	/**
	 * Returns the value of the '<em><b>Generator status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator status</em>' attribute.
	 * @see #setGenerator_status(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Generator_status()
	 * @model
	 * @generated
	 */
	String getGenerator_status();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getGenerator_status <em>Generator status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator status</em>' attribute.
	 * @see #getGenerator_status()
	 * @generated
	 */
	void setGenerator_status(String value);

	/**
	 * Returns the value of the '<em><b>Power type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power type</em>' attribute.
	 * @see #setPower_type(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Power_type()
	 * @model
	 * @generated
	 */
	String getPower_type();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPower_type <em>Power type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power type</em>' attribute.
	 * @see #getPower_type()
	 * @generated
	 */
	void setPower_type(String value);

	/**
	 * Returns the value of the '<em><b>Rinternal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rinternal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rinternal</em>' attribute.
	 * @see #setRinternal(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Rinternal()
	 * @model
	 * @generated
	 */
	String getRinternal();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getRinternal <em>Rinternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rinternal</em>' attribute.
	 * @see #getRinternal()
	 * @generated
	 */
	void setRinternal(String value);

	/**
	 * Returns the value of the '<em><b>Rload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rload</em>' attribute.
	 * @see #setRload(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Rload()
	 * @model
	 * @generated
	 */
	String getRload();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getRload <em>Rload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rload</em>' attribute.
	 * @see #getRload()
	 * @generated
	 */
	void setRload(String value);

	/**
	 * Returns the value of the '<em><b>VMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VMax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VMax</em>' attribute.
	 * @see #setV_Max(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_V_Max()
	 * @model
	 * @generated
	 */
	String getV_Max();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getV_Max <em>VMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMax</em>' attribute.
	 * @see #getV_Max()
	 * @generated
	 */
	void setV_Max(String value);

	/**
	 * Returns the value of the '<em><b>IMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IMax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IMax</em>' attribute.
	 * @see #setI_Max(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_I_Max()
	 * @model
	 * @generated
	 */
	String getI_Max();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getI_Max <em>IMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IMax</em>' attribute.
	 * @see #getI_Max()
	 * @generated
	 */
	void setI_Max(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Frequency()
	 * @model
	 * @generated
	 */
	String getFrequency();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(String value);

	/**
	 * Returns the value of the '<em><b>Max Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Frequency</em>' attribute.
	 * @see #setMax_Frequency(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Max_Frequency()
	 * @model
	 * @generated
	 */
	String getMax_Frequency();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getMax_Frequency <em>Max Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Frequency</em>' attribute.
	 * @see #getMax_Frequency()
	 * @generated
	 */
	void setMax_Frequency(String value);

	/**
	 * Returns the value of the '<em><b>Min Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Frequency</em>' attribute.
	 * @see #setMin_Frequency(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Min_Frequency()
	 * @model
	 * @generated
	 */
	String getMin_Frequency();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getMin_Frequency <em>Min Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Frequency</em>' attribute.
	 * @see #getMin_Frequency()
	 * @generated
	 */
	void setMin_Frequency(String value);

	/**
	 * Returns the value of the '<em><b>Fuel Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Used</em>' attribute.
	 * @see #setFuel_Used(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Fuel_Used()
	 * @model
	 * @generated
	 */
	String getFuel_Used();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getFuel_Used <em>Fuel Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Used</em>' attribute.
	 * @see #getFuel_Used()
	 * @generated
	 */
	void setFuel_Used(String value);

	/**
	 * Returns the value of the '<em><b>Heat Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Out</em>' attribute.
	 * @see #setHeat_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Heat_Out()
	 * @model
	 * @generated
	 */
	String getHeat_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getHeat_Out <em>Heat Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Out</em>' attribute.
	 * @see #getHeat_Out()
	 * @generated
	 */
	void setHeat_Out(String value);

	/**
	 * Returns the value of the '<em><b>KV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KV</em>' attribute.
	 * @see #setKV(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_KV()
	 * @model
	 * @generated
	 */
	String getKV();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getKV <em>KV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KV</em>' attribute.
	 * @see #getKV()
	 * @generated
	 */
	void setKV(String value);

	/**
	 * Returns the value of the '<em><b>Power Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Angle</em>' attribute.
	 * @see #setPower_Angle(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Power_Angle()
	 * @model
	 * @generated
	 */
	String getPower_Angle();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPower_Angle <em>Power Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Angle</em>' attribute.
	 * @see #getPower_Angle()
	 * @generated
	 */
	void setPower_Angle(String value);

	/**
	 * Returns the value of the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max P</em>' attribute.
	 * @see #setMax_P(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Max_P()
	 * @model
	 * @generated
	 */
	String getMax_P();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getMax_P <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max P</em>' attribute.
	 * @see #getMax_P()
	 * @generated
	 */
	void setMax_P(String value);

	/**
	 * Returns the value of the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min P</em>' attribute.
	 * @see #setMin_P(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Min_P()
	 * @model
	 * @generated
	 */
	String getMin_P();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getMin_P <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min P</em>' attribute.
	 * @see #getMin_P()
	 * @generated
	 */
	void setMin_P(String value);

	/**
	 * Returns the value of the '<em><b>Phase AVOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase AVOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase AVOut</em>' attribute.
	 * @see #setPhaseA_V_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_PhaseA_V_Out()
	 * @model
	 * @generated
	 */
	String getPhaseA_V_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPhaseA_V_Out <em>Phase AVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase AVOut</em>' attribute.
	 * @see #getPhaseA_V_Out()
	 * @generated
	 */
	void setPhaseA_V_Out(String value);

	/**
	 * Returns the value of the '<em><b>Phase BVOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase BVOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase BVOut</em>' attribute.
	 * @see #setPhaseB_V_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_PhaseB_V_Out()
	 * @model
	 * @generated
	 */
	String getPhaseB_V_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPhaseB_V_Out <em>Phase BVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase BVOut</em>' attribute.
	 * @see #getPhaseB_V_Out()
	 * @generated
	 */
	void setPhaseB_V_Out(String value);

	/**
	 * Returns the value of the '<em><b>Phase CVOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase CVOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase CVOut</em>' attribute.
	 * @see #setPhaseC_V_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_PhaseC_V_Out()
	 * @model
	 * @generated
	 */
	String getPhaseC_V_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPhaseC_V_Out <em>Phase CVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase CVOut</em>' attribute.
	 * @see #getPhaseC_V_Out()
	 * @generated
	 */
	void setPhaseC_V_Out(String value);

	/**
	 * Returns the value of the '<em><b>Phase AIOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase AIOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase AIOut</em>' attribute.
	 * @see #setPhaseA_I_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_PhaseA_I_Out()
	 * @model
	 * @generated
	 */
	String getPhaseA_I_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPhaseA_I_Out <em>Phase AIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase AIOut</em>' attribute.
	 * @see #getPhaseA_I_Out()
	 * @generated
	 */
	void setPhaseA_I_Out(String value);

	/**
	 * Returns the value of the '<em><b>Phase BIOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase BIOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase BIOut</em>' attribute.
	 * @see #setPhaseB_I_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_PhaseB_I_Out()
	 * @model
	 * @generated
	 */
	String getPhaseB_I_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPhaseB_I_Out <em>Phase BIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase BIOut</em>' attribute.
	 * @see #getPhaseB_I_Out()
	 * @generated
	 */
	void setPhaseB_I_Out(String value);

	/**
	 * Returns the value of the '<em><b>Phase CIOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase CIOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase CIOut</em>' attribute.
	 * @see #setPhaseC_I_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_PhaseC_I_Out()
	 * @model
	 * @generated
	 */
	String getPhaseC_I_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPhaseC_I_Out <em>Phase CIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase CIOut</em>' attribute.
	 * @see #getPhaseC_I_Out()
	 * @generated
	 */
	void setPhaseC_I_Out(String value);

	/**
	 * Returns the value of the '<em><b>Power AOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power AOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power AOut</em>' attribute.
	 * @see #setPower_A_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Power_A_Out()
	 * @model
	 * @generated
	 */
	String getPower_A_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPower_A_Out <em>Power AOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power AOut</em>' attribute.
	 * @see #getPower_A_Out()
	 * @generated
	 */
	void setPower_A_Out(String value);

	/**
	 * Returns the value of the '<em><b>Power BOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power BOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power BOut</em>' attribute.
	 * @see #setPower_B_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Power_B_Out()
	 * @model
	 * @generated
	 */
	String getPower_B_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPower_B_Out <em>Power BOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power BOut</em>' attribute.
	 * @see #getPower_B_Out()
	 * @generated
	 */
	void setPower_B_Out(String value);

	/**
	 * Returns the value of the '<em><b>Power COut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power COut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power COut</em>' attribute.
	 * @see #setPower_C_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Power_C_Out()
	 * @model
	 * @generated
	 */
	String getPower_C_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPower_C_Out <em>Power COut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power COut</em>' attribute.
	 * @see #getPower_C_Out()
	 * @generated
	 */
	void setPower_C_Out(String value);

	/**
	 * Returns the value of the '<em><b>VA Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VA Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VA Out</em>' attribute.
	 * @see #setVA_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_VA_Out()
	 * @model
	 * @generated
	 */
	String getVA_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getVA_Out <em>VA Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VA Out</em>' attribute.
	 * @see #getVA_Out()
	 * @generated
	 */
	void setVA_Out(String value);

	/**
	 * Returns the value of the '<em><b>Pf Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pf Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pf Out</em>' attribute.
	 * @see #setPf_Out(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Pf_Out()
	 * @model
	 * @generated
	 */
	String getPf_Out();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPf_Out <em>Pf Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pf Out</em>' attribute.
	 * @see #getPf_Out()
	 * @generated
	 */
	void setPf_Out(String value);

	/**
	 * Returns the value of the '<em><b>EAInternal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAInternal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAInternal</em>' attribute.
	 * @see #setE_A_Internal(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_E_A_Internal()
	 * @model
	 * @generated
	 */
	String getE_A_Internal();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getE_A_Internal <em>EAInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAInternal</em>' attribute.
	 * @see #getE_A_Internal()
	 * @generated
	 */
	void setE_A_Internal(String value);

	/**
	 * Returns the value of the '<em><b>EBInternal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBInternal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBInternal</em>' attribute.
	 * @see #setE_B_Internal(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_E_B_Internal()
	 * @model
	 * @generated
	 */
	String getE_B_Internal();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getE_B_Internal <em>EBInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EBInternal</em>' attribute.
	 * @see #getE_B_Internal()
	 * @generated
	 */
	void setE_B_Internal(String value);

	/**
	 * Returns the value of the '<em><b>ECInternal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECInternal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECInternal</em>' attribute.
	 * @see #setE_C_Internal(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_E_C_Internal()
	 * @model
	 * @generated
	 */
	String getE_C_Internal();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getE_C_Internal <em>ECInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECInternal</em>' attribute.
	 * @see #getE_C_Internal()
	 * @generated
	 */
	void setE_C_Internal(String value);

	/**
	 * Returns the value of the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efficiency</em>' attribute.
	 * @see #setEfficiency(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Efficiency()
	 * @model
	 * @generated
	 */
	String getEfficiency();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getEfficiency <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efficiency</em>' attribute.
	 * @see #getEfficiency()
	 * @generated
	 */
	void setEfficiency(String value);

	/**
	 * Returns the value of the '<em><b>Rated kVA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated kVA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated kVA</em>' attribute.
	 * @see #setRated_kVA(String)
	 * @see visGrid.VisGridPackage#getMicroturbine_Rated_kVA()
	 * @model
	 * @generated
	 */
	String getRated_kVA();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getRated_kVA <em>Rated kVA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated kVA</em>' attribute.
	 * @see #getRated_kVA()
	 * @generated
	 */
	void setRated_kVA(String value);

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
	 * @see visGrid.VisGridPackage#getMicroturbine_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Microturbine#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

} // Microturbine
