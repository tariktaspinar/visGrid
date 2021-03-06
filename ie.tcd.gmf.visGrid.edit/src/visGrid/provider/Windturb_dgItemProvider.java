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

import visGrid.VisGridPackage;
import visGrid.Windturb_dg;

/**
 * This is the item provider adapter for a {@link visGrid.Windturb_dg} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Windturb_dgItemProvider
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
	public Windturb_dgItemProvider(AdapterFactory adapterFactory) {
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

			addGen_statusPropertyDescriptor(object);
			addGen_typePropertyDescriptor(object);
			addGen_modePropertyDescriptor(object);
			addTurbine_ModelPropertyDescriptor(object);
			addRated_VAPropertyDescriptor(object);
			addRated_VPropertyDescriptor(object);
			addPconvPropertyDescriptor(object);
			addWSadjPropertyDescriptor(object);
			addWind_SpeedPropertyDescriptor(object);
			addPfPropertyDescriptor(object);
			addGenElecEffPropertyDescriptor(object);
			addTotalRealPowPropertyDescriptor(object);
			addTotalReacPowPropertyDescriptor(object);
			addVoltage_APropertyDescriptor(object);
			addVoltage_BPropertyDescriptor(object);
			addVoltage_CPropertyDescriptor(object);
			addCurrent_APropertyDescriptor(object);
			addCurrent_BPropertyDescriptor(object);
			addCurrent_CPropertyDescriptor(object);
			addEfAPropertyDescriptor(object);
			addEfBPropertyDescriptor(object);
			addEfCPropertyDescriptor(object);
			addVrotor_APropertyDescriptor(object);
			addVrotor_BPropertyDescriptor(object);
			addVrotor_CPropertyDescriptor(object);
			addIrotor_APropertyDescriptor(object);
			addIrotor_BPropertyDescriptor(object);
			addIrotor_CPropertyDescriptor(object);
			addPhasesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Gen status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGen_statusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Gen_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Gen_status_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Gen_status(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGen_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Gen_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Gen_type_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Gen_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGen_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Gen_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Gen_mode_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Gen_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Turbine Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTurbine_ModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Turbine_Model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Turbine_Model_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Turbine_Model(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated VA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_VAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Rated_VA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Rated_VA_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Rated_VA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated V feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_VPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Rated_V_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Rated_V_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Rated_V(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pconv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPconvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Pconv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Pconv_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Pconv(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the WSadj feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWSadjPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_WSadj_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_WSadj_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_WSadj(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wind Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWind_SpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Wind_Speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Wind_Speed_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Wind_Speed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_pf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_pf_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Pf(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen Elec Eff feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenElecEffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_GenElecEff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_GenElecEff_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_GenElecEff(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Real Pow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalRealPowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_TotalRealPow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_TotalRealPow_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_TotalRealPow(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Reac Pow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalReacPowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_TotalReacPow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_TotalReacPow_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_TotalReacPow(),
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
				 getString("_UI_Windturb_dg_voltage_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_voltage_A_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Voltage_A(),
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
				 getString("_UI_Windturb_dg_voltage_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_voltage_B_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Voltage_B(),
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
				 getString("_UI_Windturb_dg_voltage_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_voltage_C_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Voltage_C(),
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
				 getString("_UI_Windturb_dg_current_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_current_A_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Current_A(),
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
				 getString("_UI_Windturb_dg_current_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_current_B_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Current_B(),
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
				 getString("_UI_Windturb_dg_current_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_current_C_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Current_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ef A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_EfA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_EfA_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_EfA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ef B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_EfB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_EfB_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_EfB(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ef C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_EfC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_EfC_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_EfC(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vrotor A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVrotor_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Vrotor_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Vrotor_A_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Vrotor_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vrotor B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVrotor_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Vrotor_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Vrotor_B_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Vrotor_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vrotor C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVrotor_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Vrotor_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Vrotor_C_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Vrotor_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Irotor A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIrotor_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Irotor_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Irotor_A_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Irotor_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Irotor B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIrotor_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Irotor_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Irotor_B_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Irotor_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Irotor C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIrotor_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Windturb_dg_Irotor_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_Irotor_C_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Irotor_C(),
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
				 getString("_UI_Windturb_dg_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Windturb_dg_phases_feature", "_UI_Windturb_dg_type"),
				 VisGridPackage.eINSTANCE.getWindturb_dg_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Windturb_dg.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Windturb_dg"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Windturb_dg)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Windturb_dg_type") :
			getString("_UI_Windturb_dg_type") + " " + label;
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

		switch (notification.getFeatureID(Windturb_dg.class)) {
			case VisGridPackage.WINDTURB_DG__GEN_STATUS:
			case VisGridPackage.WINDTURB_DG__GEN_TYPE:
			case VisGridPackage.WINDTURB_DG__GEN_MODE:
			case VisGridPackage.WINDTURB_DG__TURBINE_MODEL:
			case VisGridPackage.WINDTURB_DG__RATED_VA:
			case VisGridPackage.WINDTURB_DG__RATED_V:
			case VisGridPackage.WINDTURB_DG__PCONV:
			case VisGridPackage.WINDTURB_DG__WSADJ:
			case VisGridPackage.WINDTURB_DG__WIND_SPEED:
			case VisGridPackage.WINDTURB_DG__PF:
			case VisGridPackage.WINDTURB_DG__GEN_ELEC_EFF:
			case VisGridPackage.WINDTURB_DG__TOTAL_REAL_POW:
			case VisGridPackage.WINDTURB_DG__TOTAL_REAC_POW:
			case VisGridPackage.WINDTURB_DG__VOLTAGE_A:
			case VisGridPackage.WINDTURB_DG__VOLTAGE_B:
			case VisGridPackage.WINDTURB_DG__VOLTAGE_C:
			case VisGridPackage.WINDTURB_DG__CURRENT_A:
			case VisGridPackage.WINDTURB_DG__CURRENT_B:
			case VisGridPackage.WINDTURB_DG__CURRENT_C:
			case VisGridPackage.WINDTURB_DG__EF_A:
			case VisGridPackage.WINDTURB_DG__EF_B:
			case VisGridPackage.WINDTURB_DG__EF_C:
			case VisGridPackage.WINDTURB_DG__VROTOR_A:
			case VisGridPackage.WINDTURB_DG__VROTOR_B:
			case VisGridPackage.WINDTURB_DG__VROTOR_C:
			case VisGridPackage.WINDTURB_DG__IROTOR_A:
			case VisGridPackage.WINDTURB_DG__IROTOR_B:
			case VisGridPackage.WINDTURB_DG__IROTOR_C:
			case VisGridPackage.WINDTURB_DG__PHASES:
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
