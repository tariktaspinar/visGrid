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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import visGrid.Overhead_line;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Overhead_line} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Overhead_lineItemProvider
	extends ItemProviderAdapter
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
	public Overhead_lineItemProvider(AdapterFactory adapterFactory) {
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

			addConnectionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addConfigurationPropertyDescriptor(object);
			addLengthPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addFromPropertyDescriptor(object);
			addToPropertyDescriptor(object);
			addPower_inPropertyDescriptor(object);
			addPower_outPropertyDescriptor(object);
			addPower_lossesPropertyDescriptor(object);
			addPower_in_APropertyDescriptor(object);
			addPower_in_BPropertyDescriptor(object);
			addPower_in_CPropertyDescriptor(object);
			addPower_out_APropertyDescriptor(object);
			addPower_out_BPropertyDescriptor(object);
			addPower_out_CPropertyDescriptor(object);
			addPower_losses_APropertyDescriptor(object);
			addPower_losses_BPropertyDescriptor(object);
			addPower_losses_CPropertyDescriptor(object);
			addFlow_directionPropertyDescriptor(object);
			addPhasesPropertyDescriptor(object);
			addNominal_voltagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_Connection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_Connection_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Connection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_name_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Name(),
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
				 getString("_UI_Overhead_line_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_configuration_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Configuration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_length_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_length_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Length(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_status_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Status(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_from_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_from_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_From(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_to_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_to_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_To(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power in feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_inPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_in_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_in_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_in(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_outPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_out_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power losses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_lossesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_losses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_losses_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_losses(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power in A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_in_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_in_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_in_A_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_in_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power in B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_in_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_in_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_in_B_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_in_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power in C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_in_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_in_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_in_C_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_in_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power out A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_out_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_out_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_out_A_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_out_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power out B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_out_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_out_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_out_B_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_out_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power out C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_out_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_out_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_out_C_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_out_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power losses A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_losses_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_losses_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_losses_A_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_losses_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power losses B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_losses_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_losses_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_losses_B_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_losses_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power losses C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_losses_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_power_losses_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_power_losses_C_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Power_losses_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlow_directionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_flow_direction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_flow_direction_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Flow_direction(),
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
				 getString("_UI_Overhead_line_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_phases_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Phases(),
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
				 getString("_UI_Overhead_line_nominal_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_nominal_voltage_feature", "_UI_Overhead_line_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_Nominal_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Overhead_line.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Overhead_line"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Overhead_line)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Overhead_line_type") :
			getString("_UI_Overhead_line_type") + " " + label;
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

		switch (notification.getFeatureID(Overhead_line.class)) {
			case VisGridPackage.OVERHEAD_LINE__NAME:
			case VisGridPackage.OVERHEAD_LINE__CONFIGURATION:
			case VisGridPackage.OVERHEAD_LINE__LENGTH:
			case VisGridPackage.OVERHEAD_LINE__STATUS:
			case VisGridPackage.OVERHEAD_LINE__FROM:
			case VisGridPackage.OVERHEAD_LINE__TO:
			case VisGridPackage.OVERHEAD_LINE__POWER_IN:
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT:
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES:
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_A:
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_B:
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_C:
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_A:
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_B:
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_C:
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_A:
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_B:
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_C:
			case VisGridPackage.OVERHEAD_LINE__FLOW_DIRECTION:
			case VisGridPackage.OVERHEAD_LINE__PHASES:
			case VisGridPackage.OVERHEAD_LINE__NOMINAL_VOLTAGE:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VisGridEditPlugin.INSTANCE;
	}

}
