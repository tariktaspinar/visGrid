/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import visGrid.Refrigerator;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Refrigerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RefrigeratorItemProvider
	extends ConnectionItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefrigeratorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSizePropertyDescriptor(object);
			addRated_capacityPropertyDescriptor(object);
			addTemperaturePropertyDescriptor(object);
			addSetpointPropertyDescriptor(object);
			addDeadbandPropertyDescriptor(object);
			addNext_timePropertyDescriptor(object);
			addOutputPropertyDescriptor(object);
			addEvent_tempPropertyDescriptor(object);
			addUAPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addShapePropertyDescriptor(object);
			addLoadPropertyDescriptor(object);
			addEnergyPropertyDescriptor(object);
			addPowerPropertyDescriptor(object);
			addPeak_demandPropertyDescriptor(object);
			addHeatgainPropertyDescriptor(object);
			addHeatgain_fractionPropertyDescriptor(object);
			addCurrent_fractionPropertyDescriptor(object);
			addImpedance_fractionPropertyDescriptor(object);
			addPower_fractionPropertyDescriptor(object);
			addPower_factorPropertyDescriptor(object);
			addConstant_powerPropertyDescriptor(object);
			addConstant_currentPropertyDescriptor(object);
			addConstant_admittancePropertyDescriptor(object);
			addVoltage_factorPropertyDescriptor(object);
			addConfigurationPropertyDescriptor(object);
			addOverridePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_size_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Size(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_rated_capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_rated_capacity_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Rated_capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_temperature_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSetpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_setpoint_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadband feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadbandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_deadband_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_deadband_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Deadband(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNext_timePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_next_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_next_time_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Next_time(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_output_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_output_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Output(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event temp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvent_tempPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_event_temp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_event_temp_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Event_temp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the UA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_UA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_UA_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_UA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_state_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_State(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shape feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShapePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_shape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_shape_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Shape(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_load_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Load(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnergyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_energy_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_power_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Peak demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeak_demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_peak_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_peak_demand_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Peak_demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heatgain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeatgainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_heatgain_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Heatgain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heatgain fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeatgain_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_heatgain_fraction_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Heatgain_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_current_fraction_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Current_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_impedance_fraction_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Impedance_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_power_fraction_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Power_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_power_factor_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_constant_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_constant_power_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Constant_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_currentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_constant_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_constant_current_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Constant_current(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant admittance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_admittancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_constant_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_constant_admittance_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Constant_admittance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_voltage_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_voltage_factor_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Voltage_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_configuration_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Configuration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Refrigerator_override_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Refrigerator_override_feature", "_UI_Refrigerator_type"),
				 VisGridPackage.eINSTANCE.getRefrigerator_Override(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Refrigerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Refrigerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Refrigerator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Refrigerator_type") :
			getString("_UI_Refrigerator_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Refrigerator.class)) {
			case VisGridPackage.REFRIGERATOR__SIZE:
			case VisGridPackage.REFRIGERATOR__RATED_CAPACITY:
			case VisGridPackage.REFRIGERATOR__TEMPERATURE:
			case VisGridPackage.REFRIGERATOR__SETPOINT:
			case VisGridPackage.REFRIGERATOR__DEADBAND:
			case VisGridPackage.REFRIGERATOR__NEXT_TIME:
			case VisGridPackage.REFRIGERATOR__OUTPUT:
			case VisGridPackage.REFRIGERATOR__EVENT_TEMP:
			case VisGridPackage.REFRIGERATOR__UA:
			case VisGridPackage.REFRIGERATOR__STATE:
			case VisGridPackage.REFRIGERATOR__SHAPE:
			case VisGridPackage.REFRIGERATOR__LOAD:
			case VisGridPackage.REFRIGERATOR__ENERGY:
			case VisGridPackage.REFRIGERATOR__POWER:
			case VisGridPackage.REFRIGERATOR__PEAK_DEMAND:
			case VisGridPackage.REFRIGERATOR__HEATGAIN:
			case VisGridPackage.REFRIGERATOR__HEATGAIN_FRACTION:
			case VisGridPackage.REFRIGERATOR__CURRENT_FRACTION:
			case VisGridPackage.REFRIGERATOR__IMPEDANCE_FRACTION:
			case VisGridPackage.REFRIGERATOR__POWER_FRACTION:
			case VisGridPackage.REFRIGERATOR__POWER_FACTOR:
			case VisGridPackage.REFRIGERATOR__CONSTANT_POWER:
			case VisGridPackage.REFRIGERATOR__CONSTANT_CURRENT:
			case VisGridPackage.REFRIGERATOR__CONSTANT_ADMITTANCE:
			case VisGridPackage.REFRIGERATOR__VOLTAGE_FACTOR:
			case VisGridPackage.REFRIGERATOR__CONFIGURATION:
			case VisGridPackage.REFRIGERATOR__OVERRIDE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
