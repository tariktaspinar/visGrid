/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import visGrid.Climate;
import visGrid.Connections;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Climate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.ClimateImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getCity <em>City</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getTmyfile <em>Tmyfile</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_flux <em>Solar flux</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_direct <em>Solar direct</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getWind_speed <em>Wind speed</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getWind_dir <em>Wind dir</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getWind_gust <em>Wind gust</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getRecord__low <em>Record low</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getRecord__low_day <em>Record low day</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getRecord__high <em>Record high</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getRecord__high_day <em>Record high day</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getRecord__solar <em>Record solar</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getRainfall <em>Rainfall</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSnowdepth <em>Snowdepth</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getInterpolate <em>Interpolate</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_horiz <em>Solar horiz</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_north <em>Solar north</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_northeast <em>Solar northeast</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_east <em>Solar east</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_southeast <em>Solar southeast</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_south <em>Solar south</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_southwest <em>Solar southwest</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_west <em>Solar west</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_northwest <em>Solar northwest</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getSolar_raw <em>Solar raw</em>}</li>
 *   <li>{@link visGrid.impl.ClimateImpl#getReader <em>Reader</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClimateImpl extends EObjectImpl implements Climate {
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connections> connection;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTmyfile() <em>Tmyfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmyfile()
	 * @generated
	 * @ordered
	 */
	protected static final String TMYFILE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTmyfile() <em>Tmyfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmyfile()
	 * @generated
	 * @ordered
	 */
	protected String tmyfile = TMYFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPERATURE_EDEFAULT = "";

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
	protected static final String HUMIDITY_EDEFAULT = "";

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
	 * The default value of the '{@link #getSolar_flux() <em>Solar flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_flux()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_FLUX_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_flux() <em>Solar flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_flux()
	 * @generated
	 * @ordered
	 */
	protected String solar_flux = SOLAR_FLUX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_direct() <em>Solar direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_direct()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_DIRECT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_direct() <em>Solar direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_direct()
	 * @generated
	 * @ordered
	 */
	protected String solar_direct = SOLAR_DIRECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWind_speed() <em>Wind speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind_speed()
	 * @generated
	 * @ordered
	 */
	protected static final String WIND_SPEED_EDEFAULT = "";

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
	 * The default value of the '{@link #getWind_dir() <em>Wind dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind_dir()
	 * @generated
	 * @ordered
	 */
	protected static final String WIND_DIR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getWind_dir() <em>Wind dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind_dir()
	 * @generated
	 * @ordered
	 */
	protected String wind_dir = WIND_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWind_gust() <em>Wind gust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind_gust()
	 * @generated
	 * @ordered
	 */
	protected static final String WIND_GUST_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getWind_gust() <em>Wind gust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind_gust()
	 * @generated
	 * @ordered
	 */
	protected String wind_gust = WIND_GUST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecord__low() <em>Record low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord__low()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_LOW_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRecord__low() <em>Record low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord__low()
	 * @generated
	 * @ordered
	 */
	protected String record__low = RECORD_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecord__low_day() <em>Record low day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord__low_day()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_LOW_DAY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRecord__low_day() <em>Record low day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord__low_day()
	 * @generated
	 * @ordered
	 */
	protected String record__low_day = RECORD_LOW_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecord__high() <em>Record high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord__high()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_HIGH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRecord__high() <em>Record high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord__high()
	 * @generated
	 * @ordered
	 */
	protected String record__high = RECORD_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecord__high_day() <em>Record high day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord__high_day()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_HIGH_DAY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRecord__high_day() <em>Record high day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord__high_day()
	 * @generated
	 * @ordered
	 */
	protected String record__high_day = RECORD_HIGH_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecord__solar() <em>Record solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord__solar()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_SOLAR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRecord__solar() <em>Record solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord__solar()
	 * @generated
	 * @ordered
	 */
	protected String record__solar = RECORD_SOLAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRainfall() <em>Rainfall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRainfall()
	 * @generated
	 * @ordered
	 */
	protected static final String RAINFALL_EDEFAULT = "";

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
	protected static final String SNOWDEPTH_EDEFAULT = "";

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
	 * The default value of the '{@link #getInterpolate() <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolate()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPOLATE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInterpolate() <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolate()
	 * @generated
	 * @ordered
	 */
	protected String interpolate = INTERPOLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_horiz() <em>Solar horiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_horiz()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_HORIZ_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_horiz() <em>Solar horiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_horiz()
	 * @generated
	 * @ordered
	 */
	protected String solar_horiz = SOLAR_HORIZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_north() <em>Solar north</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_north()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_NORTH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_north() <em>Solar north</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_north()
	 * @generated
	 * @ordered
	 */
	protected String solar_north = SOLAR_NORTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_northeast() <em>Solar northeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_northeast()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_NORTHEAST_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_northeast() <em>Solar northeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_northeast()
	 * @generated
	 * @ordered
	 */
	protected String solar_northeast = SOLAR_NORTHEAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_east() <em>Solar east</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_east()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_EAST_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_east() <em>Solar east</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_east()
	 * @generated
	 * @ordered
	 */
	protected String solar_east = SOLAR_EAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_southeast() <em>Solar southeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_southeast()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_SOUTHEAST_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_southeast() <em>Solar southeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_southeast()
	 * @generated
	 * @ordered
	 */
	protected String solar_southeast = SOLAR_SOUTHEAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_south() <em>Solar south</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_south()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_SOUTH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_south() <em>Solar south</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_south()
	 * @generated
	 * @ordered
	 */
	protected String solar_south = SOLAR_SOUTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_southwest() <em>Solar southwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_southwest()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_SOUTHWEST_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_southwest() <em>Solar southwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_southwest()
	 * @generated
	 * @ordered
	 */
	protected String solar_southwest = SOLAR_SOUTHWEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_west() <em>Solar west</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_west()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_WEST_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_west() <em>Solar west</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_west()
	 * @generated
	 * @ordered
	 */
	protected String solar_west = SOLAR_WEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_northwest() <em>Solar northwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_northwest()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_NORTHWEST_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_northwest() <em>Solar northwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_northwest()
	 * @generated
	 * @ordered
	 */
	protected String solar_northwest = SOLAR_NORTHWEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_raw() <em>Solar raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_raw()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_RAW_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolar_raw() <em>Solar raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_raw()
	 * @generated
	 * @ordered
	 */
	protected String solar_raw = SOLAR_RAW_EDEFAULT;

	/**
	 * The default value of the '{@link #getReader() <em>Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected static final String READER_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getReader() <em>Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected String reader = READER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getClimate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.CLIMATE__CONNECTION);
		}
		return connection;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTmyfile() {
		return tmyfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmyfile(String newTmyfile) {
		String oldTmyfile = tmyfile;
		tmyfile = newTmyfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__TMYFILE, oldTmyfile, tmyfile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__TEMPERATURE, oldTemperature, temperature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__HUMIDITY, oldHumidity, humidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_flux() {
		return solar_flux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_flux(String newSolar_flux) {
		String oldSolar_flux = solar_flux;
		solar_flux = newSolar_flux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_FLUX, oldSolar_flux, solar_flux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_direct() {
		return solar_direct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_direct(String newSolar_direct) {
		String oldSolar_direct = solar_direct;
		solar_direct = newSolar_direct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_DIRECT, oldSolar_direct, solar_direct));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__WIND_SPEED, oldWind_speed, wind_speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWind_dir() {
		return wind_dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWind_dir(String newWind_dir) {
		String oldWind_dir = wind_dir;
		wind_dir = newWind_dir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__WIND_DIR, oldWind_dir, wind_dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWind_gust() {
		return wind_gust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWind_gust(String newWind_gust) {
		String oldWind_gust = wind_gust;
		wind_gust = newWind_gust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__WIND_GUST, oldWind_gust, wind_gust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecord__low() {
		return record__low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecord__low(String newRecord__low) {
		String oldRecord__low = record__low;
		record__low = newRecord__low;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__RECORD_LOW, oldRecord__low, record__low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecord__low_day() {
		return record__low_day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecord__low_day(String newRecord__low_day) {
		String oldRecord__low_day = record__low_day;
		record__low_day = newRecord__low_day;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__RECORD_LOW_DAY, oldRecord__low_day, record__low_day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecord__high() {
		return record__high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecord__high(String newRecord__high) {
		String oldRecord__high = record__high;
		record__high = newRecord__high;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__RECORD_HIGH, oldRecord__high, record__high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecord__high_day() {
		return record__high_day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecord__high_day(String newRecord__high_day) {
		String oldRecord__high_day = record__high_day;
		record__high_day = newRecord__high_day;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__RECORD_HIGH_DAY, oldRecord__high_day, record__high_day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecord__solar() {
		return record__solar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecord__solar(String newRecord__solar) {
		String oldRecord__solar = record__solar;
		record__solar = newRecord__solar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__RECORD_SOLAR, oldRecord__solar, record__solar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__RAINFALL, oldRainfall, rainfall));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SNOWDEPTH, oldSnowdepth, snowdepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterpolate() {
		return interpolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpolate(String newInterpolate) {
		String oldInterpolate = interpolate;
		interpolate = newInterpolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__INTERPOLATE, oldInterpolate, interpolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_horiz() {
		return solar_horiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_horiz(String newSolar_horiz) {
		String oldSolar_horiz = solar_horiz;
		solar_horiz = newSolar_horiz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_HORIZ, oldSolar_horiz, solar_horiz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_north() {
		return solar_north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_north(String newSolar_north) {
		String oldSolar_north = solar_north;
		solar_north = newSolar_north;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_NORTH, oldSolar_north, solar_north));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_northeast() {
		return solar_northeast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_northeast(String newSolar_northeast) {
		String oldSolar_northeast = solar_northeast;
		solar_northeast = newSolar_northeast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_NORTHEAST, oldSolar_northeast, solar_northeast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_east() {
		return solar_east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_east(String newSolar_east) {
		String oldSolar_east = solar_east;
		solar_east = newSolar_east;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_EAST, oldSolar_east, solar_east));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_southeast() {
		return solar_southeast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_southeast(String newSolar_southeast) {
		String oldSolar_southeast = solar_southeast;
		solar_southeast = newSolar_southeast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_SOUTHEAST, oldSolar_southeast, solar_southeast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_south() {
		return solar_south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_south(String newSolar_south) {
		String oldSolar_south = solar_south;
		solar_south = newSolar_south;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_SOUTH, oldSolar_south, solar_south));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_southwest() {
		return solar_southwest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_southwest(String newSolar_southwest) {
		String oldSolar_southwest = solar_southwest;
		solar_southwest = newSolar_southwest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_SOUTHWEST, oldSolar_southwest, solar_southwest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_west() {
		return solar_west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_west(String newSolar_west) {
		String oldSolar_west = solar_west;
		solar_west = newSolar_west;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_WEST, oldSolar_west, solar_west));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_northwest() {
		return solar_northwest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_northwest(String newSolar_northwest) {
		String oldSolar_northwest = solar_northwest;
		solar_northwest = newSolar_northwest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_NORTHWEST, oldSolar_northwest, solar_northwest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_raw() {
		return solar_raw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_raw(String newSolar_raw) {
		String oldSolar_raw = solar_raw;
		solar_raw = newSolar_raw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__SOLAR_RAW, oldSolar_raw, solar_raw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReader() {
		return reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReader(String newReader) {
		String oldReader = reader;
		reader = newReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CLIMATE__READER, oldReader, reader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.CLIMATE__CONNECTION:
				return getConnection();
			case VisGridPackage.CLIMATE__NAME:
				return getName();
			case VisGridPackage.CLIMATE__CITY:
				return getCity();
			case VisGridPackage.CLIMATE__TMYFILE:
				return getTmyfile();
			case VisGridPackage.CLIMATE__TEMPERATURE:
				return getTemperature();
			case VisGridPackage.CLIMATE__HUMIDITY:
				return getHumidity();
			case VisGridPackage.CLIMATE__SOLAR_FLUX:
				return getSolar_flux();
			case VisGridPackage.CLIMATE__SOLAR_DIRECT:
				return getSolar_direct();
			case VisGridPackage.CLIMATE__WIND_SPEED:
				return getWind_speed();
			case VisGridPackage.CLIMATE__WIND_DIR:
				return getWind_dir();
			case VisGridPackage.CLIMATE__WIND_GUST:
				return getWind_gust();
			case VisGridPackage.CLIMATE__RECORD_LOW:
				return getRecord__low();
			case VisGridPackage.CLIMATE__RECORD_LOW_DAY:
				return getRecord__low_day();
			case VisGridPackage.CLIMATE__RECORD_HIGH:
				return getRecord__high();
			case VisGridPackage.CLIMATE__RECORD_HIGH_DAY:
				return getRecord__high_day();
			case VisGridPackage.CLIMATE__RECORD_SOLAR:
				return getRecord__solar();
			case VisGridPackage.CLIMATE__RAINFALL:
				return getRainfall();
			case VisGridPackage.CLIMATE__SNOWDEPTH:
				return getSnowdepth();
			case VisGridPackage.CLIMATE__INTERPOLATE:
				return getInterpolate();
			case VisGridPackage.CLIMATE__SOLAR_HORIZ:
				return getSolar_horiz();
			case VisGridPackage.CLIMATE__SOLAR_NORTH:
				return getSolar_north();
			case VisGridPackage.CLIMATE__SOLAR_NORTHEAST:
				return getSolar_northeast();
			case VisGridPackage.CLIMATE__SOLAR_EAST:
				return getSolar_east();
			case VisGridPackage.CLIMATE__SOLAR_SOUTHEAST:
				return getSolar_southeast();
			case VisGridPackage.CLIMATE__SOLAR_SOUTH:
				return getSolar_south();
			case VisGridPackage.CLIMATE__SOLAR_SOUTHWEST:
				return getSolar_southwest();
			case VisGridPackage.CLIMATE__SOLAR_WEST:
				return getSolar_west();
			case VisGridPackage.CLIMATE__SOLAR_NORTHWEST:
				return getSolar_northwest();
			case VisGridPackage.CLIMATE__SOLAR_RAW:
				return getSolar_raw();
			case VisGridPackage.CLIMATE__READER:
				return getReader();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisGridPackage.CLIMATE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.CLIMATE__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.CLIMATE__CITY:
				setCity((String)newValue);
				return;
			case VisGridPackage.CLIMATE__TMYFILE:
				setTmyfile((String)newValue);
				return;
			case VisGridPackage.CLIMATE__TEMPERATURE:
				setTemperature((String)newValue);
				return;
			case VisGridPackage.CLIMATE__HUMIDITY:
				setHumidity((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_FLUX:
				setSolar_flux((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_DIRECT:
				setSolar_direct((String)newValue);
				return;
			case VisGridPackage.CLIMATE__WIND_SPEED:
				setWind_speed((String)newValue);
				return;
			case VisGridPackage.CLIMATE__WIND_DIR:
				setWind_dir((String)newValue);
				return;
			case VisGridPackage.CLIMATE__WIND_GUST:
				setWind_gust((String)newValue);
				return;
			case VisGridPackage.CLIMATE__RECORD_LOW:
				setRecord__low((String)newValue);
				return;
			case VisGridPackage.CLIMATE__RECORD_LOW_DAY:
				setRecord__low_day((String)newValue);
				return;
			case VisGridPackage.CLIMATE__RECORD_HIGH:
				setRecord__high((String)newValue);
				return;
			case VisGridPackage.CLIMATE__RECORD_HIGH_DAY:
				setRecord__high_day((String)newValue);
				return;
			case VisGridPackage.CLIMATE__RECORD_SOLAR:
				setRecord__solar((String)newValue);
				return;
			case VisGridPackage.CLIMATE__RAINFALL:
				setRainfall((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SNOWDEPTH:
				setSnowdepth((String)newValue);
				return;
			case VisGridPackage.CLIMATE__INTERPOLATE:
				setInterpolate((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_HORIZ:
				setSolar_horiz((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_NORTH:
				setSolar_north((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_NORTHEAST:
				setSolar_northeast((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_EAST:
				setSolar_east((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_SOUTHEAST:
				setSolar_southeast((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_SOUTH:
				setSolar_south((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_SOUTHWEST:
				setSolar_southwest((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_WEST:
				setSolar_west((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_NORTHWEST:
				setSolar_northwest((String)newValue);
				return;
			case VisGridPackage.CLIMATE__SOLAR_RAW:
				setSolar_raw((String)newValue);
				return;
			case VisGridPackage.CLIMATE__READER:
				setReader((String)newValue);
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
			case VisGridPackage.CLIMATE__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.CLIMATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__TMYFILE:
				setTmyfile(TMYFILE_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__HUMIDITY:
				setHumidity(HUMIDITY_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_FLUX:
				setSolar_flux(SOLAR_FLUX_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_DIRECT:
				setSolar_direct(SOLAR_DIRECT_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__WIND_SPEED:
				setWind_speed(WIND_SPEED_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__WIND_DIR:
				setWind_dir(WIND_DIR_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__WIND_GUST:
				setWind_gust(WIND_GUST_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__RECORD_LOW:
				setRecord__low(RECORD_LOW_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__RECORD_LOW_DAY:
				setRecord__low_day(RECORD_LOW_DAY_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__RECORD_HIGH:
				setRecord__high(RECORD_HIGH_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__RECORD_HIGH_DAY:
				setRecord__high_day(RECORD_HIGH_DAY_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__RECORD_SOLAR:
				setRecord__solar(RECORD_SOLAR_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__RAINFALL:
				setRainfall(RAINFALL_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SNOWDEPTH:
				setSnowdepth(SNOWDEPTH_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__INTERPOLATE:
				setInterpolate(INTERPOLATE_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_HORIZ:
				setSolar_horiz(SOLAR_HORIZ_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_NORTH:
				setSolar_north(SOLAR_NORTH_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_NORTHEAST:
				setSolar_northeast(SOLAR_NORTHEAST_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_EAST:
				setSolar_east(SOLAR_EAST_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_SOUTHEAST:
				setSolar_southeast(SOLAR_SOUTHEAST_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_SOUTH:
				setSolar_south(SOLAR_SOUTH_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_SOUTHWEST:
				setSolar_southwest(SOLAR_SOUTHWEST_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_WEST:
				setSolar_west(SOLAR_WEST_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_NORTHWEST:
				setSolar_northwest(SOLAR_NORTHWEST_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__SOLAR_RAW:
				setSolar_raw(SOLAR_RAW_EDEFAULT);
				return;
			case VisGridPackage.CLIMATE__READER:
				setReader(READER_EDEFAULT);
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
			case VisGridPackage.CLIMATE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.CLIMATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.CLIMATE__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case VisGridPackage.CLIMATE__TMYFILE:
				return TMYFILE_EDEFAULT == null ? tmyfile != null : !TMYFILE_EDEFAULT.equals(tmyfile);
			case VisGridPackage.CLIMATE__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? temperature != null : !TEMPERATURE_EDEFAULT.equals(temperature);
			case VisGridPackage.CLIMATE__HUMIDITY:
				return HUMIDITY_EDEFAULT == null ? humidity != null : !HUMIDITY_EDEFAULT.equals(humidity);
			case VisGridPackage.CLIMATE__SOLAR_FLUX:
				return SOLAR_FLUX_EDEFAULT == null ? solar_flux != null : !SOLAR_FLUX_EDEFAULT.equals(solar_flux);
			case VisGridPackage.CLIMATE__SOLAR_DIRECT:
				return SOLAR_DIRECT_EDEFAULT == null ? solar_direct != null : !SOLAR_DIRECT_EDEFAULT.equals(solar_direct);
			case VisGridPackage.CLIMATE__WIND_SPEED:
				return WIND_SPEED_EDEFAULT == null ? wind_speed != null : !WIND_SPEED_EDEFAULT.equals(wind_speed);
			case VisGridPackage.CLIMATE__WIND_DIR:
				return WIND_DIR_EDEFAULT == null ? wind_dir != null : !WIND_DIR_EDEFAULT.equals(wind_dir);
			case VisGridPackage.CLIMATE__WIND_GUST:
				return WIND_GUST_EDEFAULT == null ? wind_gust != null : !WIND_GUST_EDEFAULT.equals(wind_gust);
			case VisGridPackage.CLIMATE__RECORD_LOW:
				return RECORD_LOW_EDEFAULT == null ? record__low != null : !RECORD_LOW_EDEFAULT.equals(record__low);
			case VisGridPackage.CLIMATE__RECORD_LOW_DAY:
				return RECORD_LOW_DAY_EDEFAULT == null ? record__low_day != null : !RECORD_LOW_DAY_EDEFAULT.equals(record__low_day);
			case VisGridPackage.CLIMATE__RECORD_HIGH:
				return RECORD_HIGH_EDEFAULT == null ? record__high != null : !RECORD_HIGH_EDEFAULT.equals(record__high);
			case VisGridPackage.CLIMATE__RECORD_HIGH_DAY:
				return RECORD_HIGH_DAY_EDEFAULT == null ? record__high_day != null : !RECORD_HIGH_DAY_EDEFAULT.equals(record__high_day);
			case VisGridPackage.CLIMATE__RECORD_SOLAR:
				return RECORD_SOLAR_EDEFAULT == null ? record__solar != null : !RECORD_SOLAR_EDEFAULT.equals(record__solar);
			case VisGridPackage.CLIMATE__RAINFALL:
				return RAINFALL_EDEFAULT == null ? rainfall != null : !RAINFALL_EDEFAULT.equals(rainfall);
			case VisGridPackage.CLIMATE__SNOWDEPTH:
				return SNOWDEPTH_EDEFAULT == null ? snowdepth != null : !SNOWDEPTH_EDEFAULT.equals(snowdepth);
			case VisGridPackage.CLIMATE__INTERPOLATE:
				return INTERPOLATE_EDEFAULT == null ? interpolate != null : !INTERPOLATE_EDEFAULT.equals(interpolate);
			case VisGridPackage.CLIMATE__SOLAR_HORIZ:
				return SOLAR_HORIZ_EDEFAULT == null ? solar_horiz != null : !SOLAR_HORIZ_EDEFAULT.equals(solar_horiz);
			case VisGridPackage.CLIMATE__SOLAR_NORTH:
				return SOLAR_NORTH_EDEFAULT == null ? solar_north != null : !SOLAR_NORTH_EDEFAULT.equals(solar_north);
			case VisGridPackage.CLIMATE__SOLAR_NORTHEAST:
				return SOLAR_NORTHEAST_EDEFAULT == null ? solar_northeast != null : !SOLAR_NORTHEAST_EDEFAULT.equals(solar_northeast);
			case VisGridPackage.CLIMATE__SOLAR_EAST:
				return SOLAR_EAST_EDEFAULT == null ? solar_east != null : !SOLAR_EAST_EDEFAULT.equals(solar_east);
			case VisGridPackage.CLIMATE__SOLAR_SOUTHEAST:
				return SOLAR_SOUTHEAST_EDEFAULT == null ? solar_southeast != null : !SOLAR_SOUTHEAST_EDEFAULT.equals(solar_southeast);
			case VisGridPackage.CLIMATE__SOLAR_SOUTH:
				return SOLAR_SOUTH_EDEFAULT == null ? solar_south != null : !SOLAR_SOUTH_EDEFAULT.equals(solar_south);
			case VisGridPackage.CLIMATE__SOLAR_SOUTHWEST:
				return SOLAR_SOUTHWEST_EDEFAULT == null ? solar_southwest != null : !SOLAR_SOUTHWEST_EDEFAULT.equals(solar_southwest);
			case VisGridPackage.CLIMATE__SOLAR_WEST:
				return SOLAR_WEST_EDEFAULT == null ? solar_west != null : !SOLAR_WEST_EDEFAULT.equals(solar_west);
			case VisGridPackage.CLIMATE__SOLAR_NORTHWEST:
				return SOLAR_NORTHWEST_EDEFAULT == null ? solar_northwest != null : !SOLAR_NORTHWEST_EDEFAULT.equals(solar_northwest);
			case VisGridPackage.CLIMATE__SOLAR_RAW:
				return SOLAR_RAW_EDEFAULT == null ? solar_raw != null : !SOLAR_RAW_EDEFAULT.equals(solar_raw);
			case VisGridPackage.CLIMATE__READER:
				return READER_EDEFAULT == null ? reader != null : !READER_EDEFAULT.equals(reader);
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
		result.append(", city: ");
		result.append(city);
		result.append(", tmyfile: ");
		result.append(tmyfile);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", humidity: ");
		result.append(humidity);
		result.append(", solar_flux: ");
		result.append(solar_flux);
		result.append(", solar_direct: ");
		result.append(solar_direct);
		result.append(", wind_speed: ");
		result.append(wind_speed);
		result.append(", wind_dir: ");
		result.append(wind_dir);
		result.append(", wind_gust: ");
		result.append(wind_gust);
		result.append(", record__low: ");
		result.append(record__low);
		result.append(", record__low_day: ");
		result.append(record__low_day);
		result.append(", record__high: ");
		result.append(record__high);
		result.append(", record__high_day: ");
		result.append(record__high_day);
		result.append(", record__solar: ");
		result.append(record__solar);
		result.append(", rainfall: ");
		result.append(rainfall);
		result.append(", snowdepth: ");
		result.append(snowdepth);
		result.append(", interpolate: ");
		result.append(interpolate);
		result.append(", solar_horiz: ");
		result.append(solar_horiz);
		result.append(", solar_north: ");
		result.append(solar_north);
		result.append(", solar_northeast: ");
		result.append(solar_northeast);
		result.append(", solar_east: ");
		result.append(solar_east);
		result.append(", solar_southeast: ");
		result.append(solar_southeast);
		result.append(", solar_south: ");
		result.append(solar_south);
		result.append(", solar_southwest: ");
		result.append(solar_southwest);
		result.append(", solar_west: ");
		result.append(solar_west);
		result.append(", solar_northwest: ");
		result.append(solar_northwest);
		result.append(", solar_raw: ");
		result.append(solar_raw);
		result.append(", reader: ");
		result.append(reader);
		result.append(')');
		return result.toString();
	}

} //ClimateImpl
