/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weather</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Weather#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link visGrid.Weather#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link visGrid.Weather#getSolar_dir <em>Solar dir</em>}</li>
 *   <li>{@link visGrid.Weather#getSolar_diff <em>Solar diff</em>}</li>
 *   <li>{@link visGrid.Weather#getWind_speed <em>Wind speed</em>}</li>
 *   <li>{@link visGrid.Weather#getRainfall <em>Rainfall</em>}</li>
 *   <li>{@link visGrid.Weather#getSnowdepth <em>Snowdepth</em>}</li>
 *   <li>{@link visGrid.Weather#getMonth <em>Month</em>}</li>
 *   <li>{@link visGrid.Weather#getDay <em>Day</em>}</li>
 *   <li>{@link visGrid.Weather#getHour <em>Hour</em>}</li>
 *   <li>{@link visGrid.Weather#getMinute <em>Minute</em>}</li>
 *   <li>{@link visGrid.Weather#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getWeather()
 * @model
 * @generated
 */
public interface Weather extends Connection {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(String)
	 * @see visGrid.VisGridPackage#getWeather_Temperature()
	 * @model
	 * @generated
	 */
	String getTemperature();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(String value);

	/**
	 * Returns the value of the '<em><b>Humidity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Humidity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Humidity</em>' attribute.
	 * @see #setHumidity(String)
	 * @see visGrid.VisGridPackage#getWeather_Humidity()
	 * @model
	 * @generated
	 */
	String getHumidity();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getHumidity <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Humidity</em>' attribute.
	 * @see #getHumidity()
	 * @generated
	 */
	void setHumidity(String value);

	/**
	 * Returns the value of the '<em><b>Solar dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar dir</em>' attribute.
	 * @see #setSolar_dir(String)
	 * @see visGrid.VisGridPackage#getWeather_Solar_dir()
	 * @model
	 * @generated
	 */
	String getSolar_dir();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getSolar_dir <em>Solar dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar dir</em>' attribute.
	 * @see #getSolar_dir()
	 * @generated
	 */
	void setSolar_dir(String value);

	/**
	 * Returns the value of the '<em><b>Solar diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar diff</em>' attribute.
	 * @see #setSolar_diff(String)
	 * @see visGrid.VisGridPackage#getWeather_Solar_diff()
	 * @model
	 * @generated
	 */
	String getSolar_diff();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getSolar_diff <em>Solar diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar diff</em>' attribute.
	 * @see #getSolar_diff()
	 * @generated
	 */
	void setSolar_diff(String value);

	/**
	 * Returns the value of the '<em><b>Wind speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wind speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind speed</em>' attribute.
	 * @see #setWind_speed(String)
	 * @see visGrid.VisGridPackage#getWeather_Wind_speed()
	 * @model
	 * @generated
	 */
	String getWind_speed();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getWind_speed <em>Wind speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind speed</em>' attribute.
	 * @see #getWind_speed()
	 * @generated
	 */
	void setWind_speed(String value);

	/**
	 * Returns the value of the '<em><b>Rainfall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rainfall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rainfall</em>' attribute.
	 * @see #setRainfall(String)
	 * @see visGrid.VisGridPackage#getWeather_Rainfall()
	 * @model
	 * @generated
	 */
	String getRainfall();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getRainfall <em>Rainfall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rainfall</em>' attribute.
	 * @see #getRainfall()
	 * @generated
	 */
	void setRainfall(String value);

	/**
	 * Returns the value of the '<em><b>Snowdepth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snowdepth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snowdepth</em>' attribute.
	 * @see #setSnowdepth(String)
	 * @see visGrid.VisGridPackage#getWeather_Snowdepth()
	 * @model
	 * @generated
	 */
	String getSnowdepth();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getSnowdepth <em>Snowdepth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snowdepth</em>' attribute.
	 * @see #getSnowdepth()
	 * @generated
	 */
	void setSnowdepth(String value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(String)
	 * @see visGrid.VisGridPackage#getWeather_Month()
	 * @model
	 * @generated
	 */
	String getMonth();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(String value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(String)
	 * @see visGrid.VisGridPackage#getWeather_Day()
	 * @model
	 * @generated
	 */
	String getDay();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(String value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(String)
	 * @see visGrid.VisGridPackage#getWeather_Hour()
	 * @model
	 * @generated
	 */
	String getHour();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(String value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(String)
	 * @see visGrid.VisGridPackage#getWeather_Minute()
	 * @model
	 * @generated
	 */
	String getMinute();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(String value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(String)
	 * @see visGrid.VisGridPackage#getWeather_Second()
	 * @model
	 * @generated
	 */
	String getSecond();

	/**
	 * Sets the value of the '{@link visGrid.Weather#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(String value);

} // Weather
