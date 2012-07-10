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

import visGrid.Underground_line_conductor;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Underground line conductor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getOuter_diameter <em>Outer diameter</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getConductor_gmr <em>Conductor gmr</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getConductor_diameter <em>Conductor diameter</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getConductor_resistance <em>Conductor resistance</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getNeutral_gmr <em>Neutral gmr</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getNeutral_diameter <em>Neutral diameter</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getNeutral_resistance <em>Neutral resistance</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getNeutral_strands <em>Neutral strands</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getShield_gmr <em>Shield gmr</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getShield_resistance <em>Shield resistance</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getRating__summer__continuous <em>Rating summer continuous</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getRating__summer__emergency <em>Rating summer emergency</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getRating__winter__continuous <em>Rating winter continuous</em>}</li>
 *   <li>{@link visGrid.impl.Underground_line_conductorImpl#getRating__winter__emergency <em>Rating winter emergency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Underground_line_conductorImpl extends ConnectionImpl implements Underground_line_conductor {
		boolean lock = false;
	/**
	 * The default value of the '{@link #getOuter_diameter() <em>Outer diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuter_diameter()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTER_DIAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOuter_diameter() <em>Outer diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuter_diameter()
	 * @generated
	 * @ordered
	 */
	protected String outer_diameter = OUTER_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConductor_gmr() <em>Conductor gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductor_gmr()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDUCTOR_GMR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConductor_gmr() <em>Conductor gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductor_gmr()
	 * @generated
	 * @ordered
	 */
	protected String conductor_gmr = CONDUCTOR_GMR_EDEFAULT;

	/**
	 * The default value of the '{@link #getConductor_diameter() <em>Conductor diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductor_diameter()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDUCTOR_DIAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConductor_diameter() <em>Conductor diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductor_diameter()
	 * @generated
	 * @ordered
	 */
	protected String conductor_diameter = CONDUCTOR_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConductor_resistance() <em>Conductor resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductor_resistance()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDUCTOR_RESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConductor_resistance() <em>Conductor resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductor_resistance()
	 * @generated
	 * @ordered
	 */
	protected String conductor_resistance = CONDUCTOR_RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutral_gmr() <em>Neutral gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutral_gmr()
	 * @generated
	 * @ordered
	 */
	protected static final String NEUTRAL_GMR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeutral_gmr() <em>Neutral gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutral_gmr()
	 * @generated
	 * @ordered
	 */
	protected String neutral_gmr = NEUTRAL_GMR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutral_diameter() <em>Neutral diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutral_diameter()
	 * @generated
	 * @ordered
	 */
	protected static final String NEUTRAL_DIAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeutral_diameter() <em>Neutral diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutral_diameter()
	 * @generated
	 * @ordered
	 */
	protected String neutral_diameter = NEUTRAL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutral_resistance() <em>Neutral resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutral_resistance()
	 * @generated
	 * @ordered
	 */
	protected static final String NEUTRAL_RESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeutral_resistance() <em>Neutral resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutral_resistance()
	 * @generated
	 * @ordered
	 */
	protected String neutral_resistance = NEUTRAL_RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutral_strands() <em>Neutral strands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutral_strands()
	 * @generated
	 * @ordered
	 */
	protected static final String NEUTRAL_STRANDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeutral_strands() <em>Neutral strands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutral_strands()
	 * @generated
	 * @ordered
	 */
	protected String neutral_strands = NEUTRAL_STRANDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShield_gmr() <em>Shield gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShield_gmr()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIELD_GMR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShield_gmr() <em>Shield gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShield_gmr()
	 * @generated
	 * @ordered
	 */
	protected String shield_gmr = SHIELD_GMR_EDEFAULT;

	/**
	 * The default value of the '{@link #getShield_resistance() <em>Shield resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShield_resistance()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIELD_RESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShield_resistance() <em>Shield resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShield_resistance()
	 * @generated
	 * @ordered
	 */
	protected String shield_resistance = SHIELD_RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating__summer__continuous() <em>Rating summer continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__summer__continuous()
	 * @generated
	 * @ordered
	 */
	protected static final String RATING_SUMMER_CONTINUOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRating__summer__continuous() <em>Rating summer continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__summer__continuous()
	 * @generated
	 * @ordered
	 */
	protected String rating__summer__continuous = RATING_SUMMER_CONTINUOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating__summer__emergency() <em>Rating summer emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__summer__emergency()
	 * @generated
	 * @ordered
	 */
	protected static final String RATING_SUMMER_EMERGENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRating__summer__emergency() <em>Rating summer emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__summer__emergency()
	 * @generated
	 * @ordered
	 */
	protected String rating__summer__emergency = RATING_SUMMER_EMERGENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating__winter__continuous() <em>Rating winter continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__winter__continuous()
	 * @generated
	 * @ordered
	 */
	protected static final String RATING_WINTER_CONTINUOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRating__winter__continuous() <em>Rating winter continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__winter__continuous()
	 * @generated
	 * @ordered
	 */
	protected String rating__winter__continuous = RATING_WINTER_CONTINUOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating__winter__emergency() <em>Rating winter emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__winter__emergency()
	 * @generated
	 * @ordered
	 */
	protected static final String RATING_WINTER_EMERGENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRating__winter__emergency() <em>Rating winter emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__winter__emergency()
	 * @generated
	 * @ordered
	 */
	protected String rating__winter__emergency = RATING_WINTER_EMERGENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Underground_line_conductorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getUnderground_line_conductor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOuter_diameter() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"outer_diameter");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Outer_diameter");
				outer_diameter= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return outer_diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuter_diameter(String newOuter_diameter) {
		String oldOuter_diameter = outer_diameter;
		outer_diameter = newOuter_diameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__OUTER_DIAMETER, oldOuter_diameter, outer_diameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConductor_gmr() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"conductor_gmr");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Conductor_gmr");
				conductor_gmr= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conductor_gmr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductor_gmr(String newConductor_gmr) {
		String oldConductor_gmr = conductor_gmr;
		conductor_gmr = newConductor_gmr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_GMR, oldConductor_gmr, conductor_gmr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConductor_diameter() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"conductor_diameter");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Conductor_diameter");
				conductor_diameter= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conductor_diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductor_diameter(String newConductor_diameter) {
		String oldConductor_diameter = conductor_diameter;
		conductor_diameter = newConductor_diameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_DIAMETER, oldConductor_diameter, conductor_diameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConductor_resistance() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"conductor_resistance");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Conductor_resistance");
				conductor_resistance= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conductor_resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductor_resistance(String newConductor_resistance) {
		String oldConductor_resistance = conductor_resistance;
		conductor_resistance = newConductor_resistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_RESISTANCE, oldConductor_resistance, conductor_resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNeutral_gmr() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"neutral_gmr");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Neutral_gmr");
				neutral_gmr= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return neutral_gmr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutral_gmr(String newNeutral_gmr) {
		String oldNeutral_gmr = neutral_gmr;
		neutral_gmr = newNeutral_gmr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_GMR, oldNeutral_gmr, neutral_gmr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNeutral_diameter() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"neutral_diameter");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Neutral_diameter");
				neutral_diameter= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return neutral_diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutral_diameter(String newNeutral_diameter) {
		String oldNeutral_diameter = neutral_diameter;
		neutral_diameter = newNeutral_diameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_DIAMETER, oldNeutral_diameter, neutral_diameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNeutral_resistance() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"neutral_resistance");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Neutral_resistance");
				neutral_resistance= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return neutral_resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutral_resistance(String newNeutral_resistance) {
		String oldNeutral_resistance = neutral_resistance;
		neutral_resistance = newNeutral_resistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_RESISTANCE, oldNeutral_resistance, neutral_resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNeutral_strands() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"neutral_strands");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Neutral_strands");
				neutral_strands= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return neutral_strands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutral_strands(String newNeutral_strands) {
		String oldNeutral_strands = neutral_strands;
		neutral_strands = newNeutral_strands;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_STRANDS, oldNeutral_strands, neutral_strands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShield_gmr() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"shield_gmr");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Shield_gmr");
				shield_gmr= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return shield_gmr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShield_gmr(String newShield_gmr) {
		String oldShield_gmr = shield_gmr;
		shield_gmr = newShield_gmr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_GMR, oldShield_gmr, shield_gmr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShield_resistance() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"shield_resistance");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Shield_resistance");
				shield_resistance= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return shield_resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShield_resistance(String newShield_resistance) {
		String oldShield_resistance = shield_resistance;
		shield_resistance = newShield_resistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_RESISTANCE, oldShield_resistance, shield_resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRating__summer__continuous() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"rating%20summer%20continuous");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"RATING%20SUMMER%20CONTINUOUS");
				rating__summer__continuous= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rating__summer__continuous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating__summer__continuous(String newRating__summer__continuous) {
		String oldRating__summer__continuous = rating__summer__continuous;
		rating__summer__continuous = newRating__summer__continuous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS, oldRating__summer__continuous, rating__summer__continuous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRating__summer__emergency() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"rating%20summer%20emergency");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"RATING%20SUMMER%20EMERGENCY");
				rating__summer__emergency= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rating__summer__emergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating__summer__emergency(String newRating__summer__emergency) {
		String oldRating__summer__emergency = rating__summer__emergency;
		rating__summer__emergency = newRating__summer__emergency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY, oldRating__summer__emergency, rating__summer__emergency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRating__winter__continuous() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"rating%20winter%20continuous");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"RATING%20WINTER%20CONTINUOUS");
				rating__winter__continuous= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rating__winter__continuous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating__winter__continuous(String newRating__winter__continuous) {
		String oldRating__winter__continuous = rating__winter__continuous;
		rating__winter__continuous = newRating__winter__continuous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS, oldRating__winter__continuous, rating__winter__continuous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRating__winter__emergency() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"rating%20winter%20emergency");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"RATING%20WINTER%20EMERGENCY");
				rating__winter__emergency= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rating__winter__emergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating__winter__emergency(String newRating__winter__emergency) {
		String oldRating__winter__emergency = rating__winter__emergency;
		rating__winter__emergency = newRating__winter__emergency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY, oldRating__winter__emergency, rating__winter__emergency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__OUTER_DIAMETER:
				return getOuter_diameter();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_GMR:
				return getConductor_gmr();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_DIAMETER:
				return getConductor_diameter();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_RESISTANCE:
				return getConductor_resistance();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_GMR:
				return getNeutral_gmr();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_DIAMETER:
				return getNeutral_diameter();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_RESISTANCE:
				return getNeutral_resistance();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_STRANDS:
				return getNeutral_strands();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_GMR:
				return getShield_gmr();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_RESISTANCE:
				return getShield_resistance();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS:
				return getRating__summer__continuous();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY:
				return getRating__summer__emergency();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS:
				return getRating__winter__continuous();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY:
				return getRating__winter__emergency();
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
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__OUTER_DIAMETER:
				setOuter_diameter((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_GMR:
				setConductor_gmr((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_DIAMETER:
				setConductor_diameter((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_RESISTANCE:
				setConductor_resistance((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_GMR:
				setNeutral_gmr((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_DIAMETER:
				setNeutral_diameter((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_RESISTANCE:
				setNeutral_resistance((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_STRANDS:
				setNeutral_strands((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_GMR:
				setShield_gmr((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_RESISTANCE:
				setShield_resistance((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS:
				setRating__summer__continuous((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY:
				setRating__summer__emergency((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS:
				setRating__winter__continuous((String)newValue);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY:
				setRating__winter__emergency((String)newValue);
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
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__OUTER_DIAMETER:
				setOuter_diameter(OUTER_DIAMETER_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_GMR:
				setConductor_gmr(CONDUCTOR_GMR_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_DIAMETER:
				setConductor_diameter(CONDUCTOR_DIAMETER_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_RESISTANCE:
				setConductor_resistance(CONDUCTOR_RESISTANCE_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_GMR:
				setNeutral_gmr(NEUTRAL_GMR_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_DIAMETER:
				setNeutral_diameter(NEUTRAL_DIAMETER_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_RESISTANCE:
				setNeutral_resistance(NEUTRAL_RESISTANCE_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_STRANDS:
				setNeutral_strands(NEUTRAL_STRANDS_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_GMR:
				setShield_gmr(SHIELD_GMR_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_RESISTANCE:
				setShield_resistance(SHIELD_RESISTANCE_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS:
				setRating__summer__continuous(RATING_SUMMER_CONTINUOUS_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY:
				setRating__summer__emergency(RATING_SUMMER_EMERGENCY_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS:
				setRating__winter__continuous(RATING_WINTER_CONTINUOUS_EDEFAULT);
				return;
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY:
				setRating__winter__emergency(RATING_WINTER_EMERGENCY_EDEFAULT);
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
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__OUTER_DIAMETER:
				return OUTER_DIAMETER_EDEFAULT == null ? outer_diameter != null : !OUTER_DIAMETER_EDEFAULT.equals(outer_diameter);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_GMR:
				return CONDUCTOR_GMR_EDEFAULT == null ? conductor_gmr != null : !CONDUCTOR_GMR_EDEFAULT.equals(conductor_gmr);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_DIAMETER:
				return CONDUCTOR_DIAMETER_EDEFAULT == null ? conductor_diameter != null : !CONDUCTOR_DIAMETER_EDEFAULT.equals(conductor_diameter);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_RESISTANCE:
				return CONDUCTOR_RESISTANCE_EDEFAULT == null ? conductor_resistance != null : !CONDUCTOR_RESISTANCE_EDEFAULT.equals(conductor_resistance);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_GMR:
				return NEUTRAL_GMR_EDEFAULT == null ? neutral_gmr != null : !NEUTRAL_GMR_EDEFAULT.equals(neutral_gmr);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_DIAMETER:
				return NEUTRAL_DIAMETER_EDEFAULT == null ? neutral_diameter != null : !NEUTRAL_DIAMETER_EDEFAULT.equals(neutral_diameter);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_RESISTANCE:
				return NEUTRAL_RESISTANCE_EDEFAULT == null ? neutral_resistance != null : !NEUTRAL_RESISTANCE_EDEFAULT.equals(neutral_resistance);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_STRANDS:
				return NEUTRAL_STRANDS_EDEFAULT == null ? neutral_strands != null : !NEUTRAL_STRANDS_EDEFAULT.equals(neutral_strands);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_GMR:
				return SHIELD_GMR_EDEFAULT == null ? shield_gmr != null : !SHIELD_GMR_EDEFAULT.equals(shield_gmr);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_RESISTANCE:
				return SHIELD_RESISTANCE_EDEFAULT == null ? shield_resistance != null : !SHIELD_RESISTANCE_EDEFAULT.equals(shield_resistance);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS:
				return RATING_SUMMER_CONTINUOUS_EDEFAULT == null ? rating__summer__continuous != null : !RATING_SUMMER_CONTINUOUS_EDEFAULT.equals(rating__summer__continuous);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY:
				return RATING_SUMMER_EMERGENCY_EDEFAULT == null ? rating__summer__emergency != null : !RATING_SUMMER_EMERGENCY_EDEFAULT.equals(rating__summer__emergency);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS:
				return RATING_WINTER_CONTINUOUS_EDEFAULT == null ? rating__winter__continuous != null : !RATING_WINTER_CONTINUOUS_EDEFAULT.equals(rating__winter__continuous);
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY:
				return RATING_WINTER_EMERGENCY_EDEFAULT == null ? rating__winter__emergency != null : !RATING_WINTER_EMERGENCY_EDEFAULT.equals(rating__winter__emergency);
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
		result.append(" (outer_diameter: ");
		result.append(outer_diameter);
		result.append(", conductor_gmr: ");
		result.append(conductor_gmr);
		result.append(", conductor_diameter: ");
		result.append(conductor_diameter);
		result.append(", conductor_resistance: ");
		result.append(conductor_resistance);
		result.append(", neutral_gmr: ");
		result.append(neutral_gmr);
		result.append(", neutral_diameter: ");
		result.append(neutral_diameter);
		result.append(", neutral_resistance: ");
		result.append(neutral_resistance);
		result.append(", neutral_strands: ");
		result.append(neutral_strands);
		result.append(", shield_gmr: ");
		result.append(shield_gmr);
		result.append(", shield_resistance: ");
		result.append(shield_resistance);
		result.append(", rating__summer__continuous: ");
		result.append(rating__summer__continuous);
		result.append(", rating__summer__emergency: ");
		result.append(rating__summer__emergency);
		result.append(", rating__winter__continuous: ");
		result.append(rating__winter__continuous);
		result.append(", rating__winter__emergency: ");
		result.append(rating__winter__emergency);
		result.append(')');
		return result.toString();
	}

} //Underground_line_conductorImpl
