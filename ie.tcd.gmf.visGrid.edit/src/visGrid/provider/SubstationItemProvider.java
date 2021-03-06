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

import visGrid.Substation;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Substation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubstationItemProvider
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
	public SubstationItemProvider(AdapterFactory adapterFactory) {
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

			addDistribution_energyPropertyDescriptor(object);
			addDistribution_powerPropertyDescriptor(object);
			addDistribution_demandPropertyDescriptor(object);
			addDistribution_voltage_APropertyDescriptor(object);
			addDistribution_voltage_BPropertyDescriptor(object);
			addDistribution_voltage_CPropertyDescriptor(object);
			addDistribution_current_APropertyDescriptor(object);
			addDistribution_current_BPropertyDescriptor(object);
			addDistribution_current_CPropertyDescriptor(object);
			addNetwork_Node_Base_PowerPropertyDescriptor(object);
			addNetwork_Node_Base_VoltagePropertyDescriptor(object);
			addBustypePropertyDescriptor(object);
			addBusflagsPropertyDescriptor(object);
			addReference_busPropertyDescriptor(object);
			addMaximum_voltage_errorPropertyDescriptor(object);
			addVoltage_APropertyDescriptor(object);
			addVoltage_BPropertyDescriptor(object);
			addVoltage_CPropertyDescriptor(object);
			addVoltage_ABPropertyDescriptor(object);
			addVoltage_BCPropertyDescriptor(object);
			addVoltage_CAPropertyDescriptor(object);
			addCurrent_APropertyDescriptor(object);
			addCurrent_BPropertyDescriptor(object);
			addCurrent_CPropertyDescriptor(object);
			addPower_APropertyDescriptor(object);
			addPower_BPropertyDescriptor(object);
			addPower_CPropertyDescriptor(object);
			addShunt_APropertyDescriptor(object);
			addShunt_BPropertyDescriptor(object);
			addShunt_CPropertyDescriptor(object);
			addPhasesPropertyDescriptor(object);
			addNominal_voltagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Distribution energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistribution_energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_distribution_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_distribution_energy_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Distribution_energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistribution_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_distribution_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_distribution_power_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Distribution_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistribution_demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_distribution_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_distribution_demand_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Distribution_demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution voltage A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistribution_voltage_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_distribution_voltage_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_distribution_voltage_A_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Distribution_voltage_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution voltage B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistribution_voltage_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_distribution_voltage_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_distribution_voltage_B_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Distribution_voltage_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution voltage C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistribution_voltage_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_distribution_voltage_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_distribution_voltage_C_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Distribution_voltage_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution current A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistribution_current_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_distribution_current_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_distribution_current_A_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Distribution_current_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution current B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistribution_current_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_distribution_current_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_distribution_current_B_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Distribution_current_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution current C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistribution_current_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_distribution_current_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_distribution_current_C_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Distribution_current_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Node Base Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetwork_Node_Base_PowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_Network_Node_Base_Power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_Network_Node_Base_Power_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Network_Node_Base_Power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Node Base Voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetwork_Node_Base_VoltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_Network_Node_Base_Voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_Network_Node_Base_Voltage_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Network_Node_Base_Voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bustype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBustypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_bustype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_bustype_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Bustype(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Busflags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusflagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_busflags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_busflags_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Busflags(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference bus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReference_busPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_reference_bus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_reference_bus_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Reference_bus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum voltage error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximum_voltage_errorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_maximum_voltage_error_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_maximum_voltage_error_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Maximum_voltage_error(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_voltage_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_voltage_A_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Voltage_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_voltage_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_voltage_B_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Voltage_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_voltage_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_voltage_C_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Voltage_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage AB feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_ABPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_voltage_AB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_voltage_AB_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Voltage_AB(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage BC feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_BCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_voltage_BC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_voltage_BC_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Voltage_BC(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage CA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_CAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_voltage_CA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_voltage_CA_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Voltage_CA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_current_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_current_A_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Current_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_current_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_current_B_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Current_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_current_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_current_C_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Current_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_power_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_power_A_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Power_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_power_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_power_B_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Power_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_power_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_power_C_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Power_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_shunt_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_shunt_A_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Shunt_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_shunt_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_shunt_B_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Shunt_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_shunt_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_shunt_C_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Shunt_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phases feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_phases_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominal_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Substation_nominal_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Substation_nominal_voltage_feature", "_UI_Substation_type"),
				 VisGridPackage.eINSTANCE.getSubstation_Nominal_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Substation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Substation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Substation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Substation_type") :
			getString("_UI_Substation_type") + " " + label;
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

		switch (notification.getFeatureID(Substation.class)) {
			case VisGridPackage.SUBSTATION__DISTRIBUTION_ENERGY:
			case VisGridPackage.SUBSTATION__DISTRIBUTION_POWER:
			case VisGridPackage.SUBSTATION__DISTRIBUTION_DEMAND:
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_A:
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_B:
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_C:
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_A:
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_B:
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_C:
			case VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_POWER:
			case VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_VOLTAGE:
			case VisGridPackage.SUBSTATION__BUSTYPE:
			case VisGridPackage.SUBSTATION__BUSFLAGS:
			case VisGridPackage.SUBSTATION__REFERENCE_BUS:
			case VisGridPackage.SUBSTATION__MAXIMUM_VOLTAGE_ERROR:
			case VisGridPackage.SUBSTATION__VOLTAGE_A:
			case VisGridPackage.SUBSTATION__VOLTAGE_B:
			case VisGridPackage.SUBSTATION__VOLTAGE_C:
			case VisGridPackage.SUBSTATION__VOLTAGE_AB:
			case VisGridPackage.SUBSTATION__VOLTAGE_BC:
			case VisGridPackage.SUBSTATION__VOLTAGE_CA:
			case VisGridPackage.SUBSTATION__CURRENT_A:
			case VisGridPackage.SUBSTATION__CURRENT_B:
			case VisGridPackage.SUBSTATION__CURRENT_C:
			case VisGridPackage.SUBSTATION__POWER_A:
			case VisGridPackage.SUBSTATION__POWER_B:
			case VisGridPackage.SUBSTATION__POWER_C:
			case VisGridPackage.SUBSTATION__SHUNT_A:
			case VisGridPackage.SUBSTATION__SHUNT_B:
			case VisGridPackage.SUBSTATION__SHUNT_C:
			case VisGridPackage.SUBSTATION__PHASES:
			case VisGridPackage.SUBSTATION__NOMINAL_VOLTAGE:
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
