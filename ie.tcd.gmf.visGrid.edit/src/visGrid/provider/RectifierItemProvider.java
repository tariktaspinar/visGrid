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

import visGrid.Rectifier;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Rectifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RectifierItemProvider
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
	public RectifierItemProvider(AdapterFactory adapterFactory) {
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

			addRectifier_typePropertyDescriptor(object);
			addGenerator_modePropertyDescriptor(object);
			addV_OutPropertyDescriptor(object);
			addI_OutPropertyDescriptor(object);
			addVA_OutPropertyDescriptor(object);
			addP_OutPropertyDescriptor(object);
			addQ_OutPropertyDescriptor(object);
			addVdcPropertyDescriptor(object);
			addPhaseA_V_InPropertyDescriptor(object);
			addPhaseB_V_InPropertyDescriptor(object);
			addPhaseC_V_InPropertyDescriptor(object);
			addPhaseA_I_InPropertyDescriptor(object);
			addPhaseB_I_InPropertyDescriptor(object);
			addPhaseC_I_InPropertyDescriptor(object);
			addPower_A_InPropertyDescriptor(object);
			addPower_B_InPropertyDescriptor(object);
			addPower_C_InPropertyDescriptor(object);
			addPhasesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Rectifier type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRectifier_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_rectifier_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_rectifier_type_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_Rectifier_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generator mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerator_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_generator_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_generator_mode_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_Generator_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_V_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_V_Out_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_V_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_I_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_I_Out_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_I_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VA Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVA_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_VA_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_VA_Out_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_VA_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the POut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addP_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_P_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_P_Out_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_P_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the QOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQ_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_Q_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_Q_Out_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_Q_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vdc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVdcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_Vdc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_Vdc_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_Vdc(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase AVIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseA_V_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_phaseA_V_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_phaseA_V_In_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_PhaseA_V_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase BVIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseB_V_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_phaseB_V_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_phaseB_V_In_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_PhaseB_V_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase CVIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseC_V_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_phaseC_V_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_phaseC_V_In_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_PhaseC_V_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase AIIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseA_I_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_phaseA_I_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_phaseA_I_In_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_PhaseA_I_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase BIIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseB_I_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_phaseB_I_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_phaseB_I_In_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_PhaseB_I_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase CIIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseC_I_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_phaseC_I_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_phaseC_I_In_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_PhaseC_I_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power AIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_A_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_power_A_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_power_A_In_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_Power_A_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power BIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_B_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_power_B_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_power_B_In_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_Power_B_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power CIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_C_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rectifier_power_C_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_power_C_In_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_Power_C_In(),
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
				 getString("_UI_Rectifier_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rectifier_phases_feature", "_UI_Rectifier_type"),
				 VisGridPackage.eINSTANCE.getRectifier_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Rectifier.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Rectifier"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Rectifier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Rectifier_type") :
			getString("_UI_Rectifier_type") + " " + label;
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

		switch (notification.getFeatureID(Rectifier.class)) {
			case VisGridPackage.RECTIFIER__RECTIFIER_TYPE:
			case VisGridPackage.RECTIFIER__GENERATOR_MODE:
			case VisGridPackage.RECTIFIER__VOUT:
			case VisGridPackage.RECTIFIER__IOUT:
			case VisGridPackage.RECTIFIER__VA_OUT:
			case VisGridPackage.RECTIFIER__POUT:
			case VisGridPackage.RECTIFIER__QOUT:
			case VisGridPackage.RECTIFIER__VDC:
			case VisGridPackage.RECTIFIER__PHASE_AVIN:
			case VisGridPackage.RECTIFIER__PHASE_BVIN:
			case VisGridPackage.RECTIFIER__PHASE_CVIN:
			case VisGridPackage.RECTIFIER__PHASE_AIIN:
			case VisGridPackage.RECTIFIER__PHASE_BIIN:
			case VisGridPackage.RECTIFIER__PHASE_CIIN:
			case VisGridPackage.RECTIFIER__POWER_AIN:
			case VisGridPackage.RECTIFIER__POWER_BIN:
			case VisGridPackage.RECTIFIER__POWER_CIN:
			case VisGridPackage.RECTIFIER__PHASES:
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
