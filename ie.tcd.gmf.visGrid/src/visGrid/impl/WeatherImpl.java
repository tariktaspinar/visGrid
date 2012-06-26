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

import visGrid.VisGridPackage;
import visGrid.Weather;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weather</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.WeatherImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getSolar_dir <em>Solar dir</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getSolar_diff <em>Solar diff</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getWind_speed <em>Wind speed</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getRainfall <em>Rainfall</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getSnowdepth <em>Snowdepth</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getDay <em>Day</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link visGrid.impl.WeatherImpl#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeatherImpl extends ConnectionImpl implements Weather {
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
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected String temperature = TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHumidity() <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidity()
	 * @generated
	 * @ordered
	 */
	protected static final String HUMIDITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHumidity() <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidity()
	 * @generated
	 * @ordered
	 */
	protected String humidity = HUMIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_dir() <em>Solar dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_dir()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolar_dir() <em>Solar dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_dir()
	 * @generated
	 * @ordered
	 */
	protected String solar_dir = SOLAR_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_diff() <em>Solar diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_diff()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_DIFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolar_diff() <em>Solar diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_diff()
	 * @generated
	 * @ordered
	 */
	protected String solar_diff = SOLAR_DIFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getWind_speed() <em>Wind speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind_speed()
	 * @generated
	 * @ordered
	 */
	protected static final String WIND_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWind_speed() <em>Wind speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind_speed()
	 * @generated
	 * @ordered
	 */
	protected String wind_speed = WIND_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRainfall() <em>Rainfall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRainfall()
	 * @generated
	 * @ordered
	 */
	protected static final String RAINFALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRainfall() <em>Rainfall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRainfall()
	 * @generated
	 * @ordered
	 */
	protected String rainfall = RAINFALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSnowdepth() <em>Snowdepth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnowdepth()
	 * @generated
	 * @ordered
	 */
	protected static final String SNOWDEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnowdepth() <em>Snowdepth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnowdepth()
	 * @generated
	 * @ordered
	 */
	protected String snowdepth = SNOWDEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final String MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected String month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final String DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected String day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected String hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final String MINUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected String minute = MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected String second = SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeatherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getWeather();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(String newTemperature) {
		String oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHumidity() {
		return humidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumidity(String newHumidity) {
		String oldHumidity = humidity;
		humidity = newHumidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__HUMIDITY, oldHumidity, humidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_dir() {
		return solar_dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_dir(String newSolar_dir) {
		String oldSolar_dir = solar_dir;
		solar_dir = newSolar_dir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__SOLAR_DIR, oldSolar_dir, solar_dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_diff() {
		return solar_diff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_diff(String newSolar_diff) {
		String oldSolar_diff = solar_diff;
		solar_diff = newSolar_diff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__SOLAR_DIFF, oldSolar_diff, solar_diff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWind_speed() {
		return wind_speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWind_speed(String newWind_speed) {
		String oldWind_speed = wind_speed;
		wind_speed = newWind_speed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__WIND_SPEED, oldWind_speed, wind_speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRainfall() {
		return rainfall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRainfall(String newRainfall) {
		String oldRainfall = rainfall;
		rainfall = newRainfall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__RAINFALL, oldRainfall, rainfall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSnowdepth() {
		return snowdepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnowdepth(String newSnowdepth) {
		String oldSnowdepth = snowdepth;
		snowdepth = newSnowdepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__SNOWDEPTH, oldSnowdepth, snowdepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(String newMonth) {
		String oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(String newDay) {
		String oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(String newHour) {
		String oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinute(String newMinute) {
		String oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(String newSecond) {
		String oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.WEATHER__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.WEATHER__NAME:
				return getName();
			case VisGridPackage.WEATHER__TEMPERATURE:
				return getTemperature();
			case VisGridPackage.WEATHER__HUMIDITY:
				return getHumidity();
			case VisGridPackage.WEATHER__SOLAR_DIR:
				return getSolar_dir();
			case VisGridPackage.WEATHER__SOLAR_DIFF:
				return getSolar_diff();
			case VisGridPackage.WEATHER__WIND_SPEED:
				return getWind_speed();
			case VisGridPackage.WEATHER__RAINFALL:
				return getRainfall();
			case VisGridPackage.WEATHER__SNOWDEPTH:
				return getSnowdepth();
			case VisGridPackage.WEATHER__MONTH:
				return getMonth();
			case VisGridPackage.WEATHER__DAY:
				return getDay();
			case VisGridPackage.WEATHER__HOUR:
				return getHour();
			case VisGridPackage.WEATHER__MINUTE:
				return getMinute();
			case VisGridPackage.WEATHER__SECOND:
				return getSecond();
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
			case VisGridPackage.WEATHER__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.WEATHER__TEMPERATURE:
				setTemperature((String)newValue);
				return;
			case VisGridPackage.WEATHER__HUMIDITY:
				setHumidity((String)newValue);
				return;
			case VisGridPackage.WEATHER__SOLAR_DIR:
				setSolar_dir((String)newValue);
				return;
			case VisGridPackage.WEATHER__SOLAR_DIFF:
				setSolar_diff((String)newValue);
				return;
			case VisGridPackage.WEATHER__WIND_SPEED:
				setWind_speed((String)newValue);
				return;
			case VisGridPackage.WEATHER__RAINFALL:
				setRainfall((String)newValue);
				return;
			case VisGridPackage.WEATHER__SNOWDEPTH:
				setSnowdepth((String)newValue);
				return;
			case VisGridPackage.WEATHER__MONTH:
				setMonth((String)newValue);
				return;
			case VisGridPackage.WEATHER__DAY:
				setDay((String)newValue);
				return;
			case VisGridPackage.WEATHER__HOUR:
				setHour((String)newValue);
				return;
			case VisGridPackage.WEATHER__MINUTE:
				setMinute((String)newValue);
				return;
			case VisGridPackage.WEATHER__SECOND:
				setSecond((String)newValue);
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
			case VisGridPackage.WEATHER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__HUMIDITY:
				setHumidity(HUMIDITY_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__SOLAR_DIR:
				setSolar_dir(SOLAR_DIR_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__SOLAR_DIFF:
				setSolar_diff(SOLAR_DIFF_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__WIND_SPEED:
				setWind_speed(WIND_SPEED_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__RAINFALL:
				setRainfall(RAINFALL_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__SNOWDEPTH:
				setSnowdepth(SNOWDEPTH_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case VisGridPackage.WEATHER__SECOND:
				setSecond(SECOND_EDEFAULT);
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
			case VisGridPackage.WEATHER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.WEATHER__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? temperature != null : !TEMPERATURE_EDEFAULT.equals(temperature);
			case VisGridPackage.WEATHER__HUMIDITY:
				return HUMIDITY_EDEFAULT == null ? humidity != null : !HUMIDITY_EDEFAULT.equals(humidity);
			case VisGridPackage.WEATHER__SOLAR_DIR:
				return SOLAR_DIR_EDEFAULT == null ? solar_dir != null : !SOLAR_DIR_EDEFAULT.equals(solar_dir);
			case VisGridPackage.WEATHER__SOLAR_DIFF:
				return SOLAR_DIFF_EDEFAULT == null ? solar_diff != null : !SOLAR_DIFF_EDEFAULT.equals(solar_diff);
			case VisGridPackage.WEATHER__WIND_SPEED:
				return WIND_SPEED_EDEFAULT == null ? wind_speed != null : !WIND_SPEED_EDEFAULT.equals(wind_speed);
			case VisGridPackage.WEATHER__RAINFALL:
				return RAINFALL_EDEFAULT == null ? rainfall != null : !RAINFALL_EDEFAULT.equals(rainfall);
			case VisGridPackage.WEATHER__SNOWDEPTH:
				return SNOWDEPTH_EDEFAULT == null ? snowdepth != null : !SNOWDEPTH_EDEFAULT.equals(snowdepth);
			case VisGridPackage.WEATHER__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case VisGridPackage.WEATHER__DAY:
				return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
			case VisGridPackage.WEATHER__HOUR:
				return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
			case VisGridPackage.WEATHER__MINUTE:
				return MINUTE_EDEFAULT == null ? minute != null : !MINUTE_EDEFAULT.equals(minute);
			case VisGridPackage.WEATHER__SECOND:
				return SECOND_EDEFAULT == null ? second != null : !SECOND_EDEFAULT.equals(second);
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
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", humidity: ");
		result.append(humidity);
		result.append(", solar_dir: ");
		result.append(solar_dir);
		result.append(", solar_diff: ");
		result.append(solar_diff);
		result.append(", wind_speed: ");
		result.append(wind_speed);
		result.append(", rainfall: ");
		result.append(rainfall);
		result.append(", snowdepth: ");
		result.append(snowdepth);
		result.append(", month: ");
		result.append(month);
		result.append(", day: ");
		result.append(day);
		result.append(", hour: ");
		result.append(hour);
		result.append(", minute: ");
		result.append(minute);
		result.append(", second: ");
		result.append(second);
		result.append(')');
		return result.toString();
	}

} //WeatherImpl
