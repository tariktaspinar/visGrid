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

import visGrid.Load;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Load} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadItemProvider
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
	public LoadItemProvider(AdapterFactory adapterFactory) {
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

			addLoad_classPropertyDescriptor(object);
			addConstant_power_APropertyDescriptor(object);
			addConstant_power_BPropertyDescriptor(object);
			addConstant_power_CPropertyDescriptor(object);
			addConstant_power_A_realPropertyDescriptor(object);
			addConstant_power_B_realPropertyDescriptor(object);
			addConstant_power_C_realPropertyDescriptor(object);
			addConstant_power_A_reacPropertyDescriptor(object);
			addConstant_power_B_reacPropertyDescriptor(object);
			addConstant_power_C_reacPropertyDescriptor(object);
			addConstant_current_APropertyDescriptor(object);
			addConstant_current_BPropertyDescriptor(object);
			addConstant_current_CPropertyDescriptor(object);
			addConstant_current_A_realPropertyDescriptor(object);
			addConstant_current_B_realPropertyDescriptor(object);
			addConstant_current_C_realPropertyDescriptor(object);
			addConstant_current_A_reacPropertyDescriptor(object);
			addConstant_current_B_reacPropertyDescriptor(object);
			addConstant_current_C_reacPropertyDescriptor(object);
			addConstant_impedance_APropertyDescriptor(object);
			addConstant_impedance_BPropertyDescriptor(object);
			addConstant_impedance_CPropertyDescriptor(object);
			addConstant_impedance_A_realPropertyDescriptor(object);
			addConstant_impedance_B_realPropertyDescriptor(object);
			addConstant_impedance_C_realPropertyDescriptor(object);
			addConstant_impedance_A_reacPropertyDescriptor(object);
			addConstant_impedance_B_reacPropertyDescriptor(object);
			addConstant_impedance_C_reacPropertyDescriptor(object);
			addMeasured_voltage_APropertyDescriptor(object);
			addMeasured_voltage_BPropertyDescriptor(object);
			addMeasured_voltage_CPropertyDescriptor(object);
			addMeasured_voltage_ABPropertyDescriptor(object);
			addMeasured_voltage_BCPropertyDescriptor(object);
			addMeasured_voltage_CAPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Load class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoad_classPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_load_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_load_class_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Load_class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_power_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_power_A_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_power_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_power_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_power_B_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_power_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_power_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_power_C_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_power_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Areal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_A_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_power_A_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_power_A_real_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_power_A_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Breal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_B_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_power_B_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_power_B_real_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_power_B_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Creal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_C_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_power_C_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_power_C_real_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_power_C_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Areac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_A_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_power_A_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_power_A_reac_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_power_A_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Breac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_B_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_power_B_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_power_B_reac_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_power_B_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Creac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_C_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_power_C_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_power_C_reac_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_power_C_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_current_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_current_A_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_current_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_current_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_current_B_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_current_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_current_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_current_C_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_current_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Areal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_A_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_current_A_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_current_A_real_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_current_A_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Breal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_B_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_current_B_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_current_B_real_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_current_B_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Creal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_C_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_current_C_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_current_C_real_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_current_C_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Areac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_A_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_current_A_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_current_A_reac_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_current_A_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Breac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_B_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_current_B_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_current_B_reac_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_current_B_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Creac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_C_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_current_C_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_current_C_reac_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_current_C_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_impedance_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_impedance_A_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_impedance_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_impedance_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_impedance_B_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_impedance_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_impedance_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_impedance_C_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_impedance_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Areal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_A_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_impedance_A_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_impedance_A_real_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_impedance_A_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Breal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_B_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_impedance_B_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_impedance_B_real_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_impedance_B_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Creal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_C_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_impedance_C_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_impedance_C_real_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_impedance_C_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Areac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_A_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_impedance_A_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_impedance_A_reac_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_impedance_A_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Breac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_B_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_impedance_B_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_impedance_B_reac_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_impedance_B_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Creac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_C_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_constant_impedance_C_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_constant_impedance_C_reac_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Constant_impedance_C_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_measured_voltage_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_measured_voltage_A_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Measured_voltage_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_measured_voltage_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_measured_voltage_B_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Measured_voltage_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_measured_voltage_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_measured_voltage_C_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Measured_voltage_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage AB feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_ABPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_measured_voltage_AB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_measured_voltage_AB_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Measured_voltage_AB(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage BC feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_BCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_measured_voltage_BC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_measured_voltage_BC_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Measured_voltage_BC(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage CA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_CAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Load_measured_voltage_CA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_measured_voltage_CA_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Measured_voltage_CA(),
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
				 getString("_UI_Load_bustype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_bustype_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Bustype(),
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
				 getString("_UI_Load_busflags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_busflags_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Busflags(),
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
				 getString("_UI_Load_reference_bus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_reference_bus_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Reference_bus(),
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
				 getString("_UI_Load_maximum_voltage_error_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_maximum_voltage_error_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Maximum_voltage_error(),
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
				 getString("_UI_Load_voltage_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_voltage_A_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Voltage_A(),
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
				 getString("_UI_Load_voltage_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_voltage_B_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Voltage_B(),
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
				 getString("_UI_Load_voltage_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_voltage_C_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Voltage_C(),
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
				 getString("_UI_Load_voltage_AB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_voltage_AB_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Voltage_AB(),
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
				 getString("_UI_Load_voltage_BC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_voltage_BC_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Voltage_BC(),
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
				 getString("_UI_Load_voltage_CA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_voltage_CA_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Voltage_CA(),
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
				 getString("_UI_Load_current_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_current_A_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Current_A(),
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
				 getString("_UI_Load_current_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_current_B_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Current_B(),
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
				 getString("_UI_Load_current_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_current_C_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Current_C(),
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
				 getString("_UI_Load_power_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_power_A_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Power_A(),
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
				 getString("_UI_Load_power_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_power_B_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Power_B(),
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
				 getString("_UI_Load_power_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_power_C_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Power_C(),
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
				 getString("_UI_Load_shunt_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_shunt_A_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Shunt_A(),
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
				 getString("_UI_Load_shunt_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_shunt_B_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Shunt_B(),
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
				 getString("_UI_Load_shunt_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_shunt_C_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Shunt_C(),
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
				 getString("_UI_Load_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_phases_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Phases(),
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
				 getString("_UI_Load_nominal_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Load_nominal_voltage_feature", "_UI_Load_type"),
				 VisGridPackage.eINSTANCE.getLoad_Nominal_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Load.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Load"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Load)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Load_type") :
			getString("_UI_Load_type") + " " + label;
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

		switch (notification.getFeatureID(Load.class)) {
			case VisGridPackage.LOAD__LOAD_CLASS:
			case VisGridPackage.LOAD__CONSTANT_POWER_A:
			case VisGridPackage.LOAD__CONSTANT_POWER_B:
			case VisGridPackage.LOAD__CONSTANT_POWER_C:
			case VisGridPackage.LOAD__CONSTANT_POWER_AREAL:
			case VisGridPackage.LOAD__CONSTANT_POWER_BREAL:
			case VisGridPackage.LOAD__CONSTANT_POWER_CREAL:
			case VisGridPackage.LOAD__CONSTANT_POWER_AREAC:
			case VisGridPackage.LOAD__CONSTANT_POWER_BREAC:
			case VisGridPackage.LOAD__CONSTANT_POWER_CREAC:
			case VisGridPackage.LOAD__CONSTANT_CURRENT_A:
			case VisGridPackage.LOAD__CONSTANT_CURRENT_B:
			case VisGridPackage.LOAD__CONSTANT_CURRENT_C:
			case VisGridPackage.LOAD__CONSTANT_CURRENT_AREAL:
			case VisGridPackage.LOAD__CONSTANT_CURRENT_BREAL:
			case VisGridPackage.LOAD__CONSTANT_CURRENT_CREAL:
			case VisGridPackage.LOAD__CONSTANT_CURRENT_AREAC:
			case VisGridPackage.LOAD__CONSTANT_CURRENT_BREAC:
			case VisGridPackage.LOAD__CONSTANT_CURRENT_CREAC:
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_A:
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_B:
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_C:
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAL:
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAL:
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAL:
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAC:
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAC:
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAC:
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_A:
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_B:
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_C:
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_AB:
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_BC:
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_CA:
			case VisGridPackage.LOAD__BUSTYPE:
			case VisGridPackage.LOAD__BUSFLAGS:
			case VisGridPackage.LOAD__REFERENCE_BUS:
			case VisGridPackage.LOAD__MAXIMUM_VOLTAGE_ERROR:
			case VisGridPackage.LOAD__VOLTAGE_A:
			case VisGridPackage.LOAD__VOLTAGE_B:
			case VisGridPackage.LOAD__VOLTAGE_C:
			case VisGridPackage.LOAD__VOLTAGE_AB:
			case VisGridPackage.LOAD__VOLTAGE_BC:
			case VisGridPackage.LOAD__VOLTAGE_CA:
			case VisGridPackage.LOAD__CURRENT_A:
			case VisGridPackage.LOAD__CURRENT_B:
			case VisGridPackage.LOAD__CURRENT_C:
			case VisGridPackage.LOAD__POWER_A:
			case VisGridPackage.LOAD__POWER_B:
			case VisGridPackage.LOAD__POWER_C:
			case VisGridPackage.LOAD__SHUNT_A:
			case VisGridPackage.LOAD__SHUNT_B:
			case VisGridPackage.LOAD__SHUNT_C:
			case VisGridPackage.LOAD__PHASES:
			case VisGridPackage.LOAD__NOMINAL_VOLTAGE:
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
