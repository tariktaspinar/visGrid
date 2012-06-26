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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import visGrid.Grid;
import visGrid.VisGridFactory;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Grid} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GridItemProvider
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
	public GridItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Csv_reader());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Diesel_dg());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Energy_storage());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Inverter());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Dc_dc_converter());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Battery());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Auction());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Controller());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Controller2());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Capbank());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Comm());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Capacitor());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Line());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Line_spacing());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Overhead_line());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Underground_line());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Overhead_line_conductor());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Underground_line_conductor());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Line_configuration());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Transformer_configuration());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Load());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Regulator_configuration());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Triplex_node());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Triplex_meter());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Triplex_line());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Triplex_line_configuration());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Triplex_line_conductor());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Switch());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Substation());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Pqload());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Voltdump());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Series_reactor());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Restoration());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Frequency_gen());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Volt_var_control());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Fault_check());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Motor());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Billdump());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Residential_enduse());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_House_a());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_House());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Waterheater());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Lights());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Refrigerator());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Clotheswasher());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Dishwasher());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Occupantload());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Plugload());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Microwave());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Range());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Freezer());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Dryer());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Evcharger());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_ZIPload());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Player());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Shaper());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Recorder());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Collector());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Histogram());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Climate());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Weather());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Office());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Multizone());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Windturb_dg());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Power_electronics());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Rectifier());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Microturbine());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Solar());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Stubauction());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Link());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Fuse());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Relay());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Regulator());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Transformer());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Meter());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Generator());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Plc());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Node());
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Connection());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Grid.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Grid"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Grid_type");
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

		switch (notification.getFeatureID(Grid.class)) {
			case VisGridPackage.GRID__CSV_READER:
			case VisGridPackage.GRID__DIESEL_DG:
			case VisGridPackage.GRID__ENERGY_STORAGE:
			case VisGridPackage.GRID__INVERTER:
			case VisGridPackage.GRID__DC_DC_CONVERTER:
			case VisGridPackage.GRID__BATTERY:
			case VisGridPackage.GRID__AUCTION:
			case VisGridPackage.GRID__CONTROLLER:
			case VisGridPackage.GRID__CONTROLLER2:
			case VisGridPackage.GRID__CAPBANK:
			case VisGridPackage.GRID__COMM:
			case VisGridPackage.GRID__CAPACITOR:
			case VisGridPackage.GRID__LINE:
			case VisGridPackage.GRID__LINE_SPACING:
			case VisGridPackage.GRID__OVERHEAD_LINE:
			case VisGridPackage.GRID__UNDERGROUND_LINE:
			case VisGridPackage.GRID__OVERHEAD_LINE_CONDUCTOR:
			case VisGridPackage.GRID__UNDERGROUND_LINE_CONDUCTOR:
			case VisGridPackage.GRID__LINE_CONFIGURATION:
			case VisGridPackage.GRID__TRANSFORMER_CONFIGURATION:
			case VisGridPackage.GRID__LOAD:
			case VisGridPackage.GRID__REGULATOR_CONFIGURATION:
			case VisGridPackage.GRID__TRIPLEX_NODE:
			case VisGridPackage.GRID__TRIPLEX_METER:
			case VisGridPackage.GRID__TRIPLEX_LINE:
			case VisGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
			case VisGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
			case VisGridPackage.GRID__SWITCH:
			case VisGridPackage.GRID__SUBSTATION:
			case VisGridPackage.GRID__PQLOAD:
			case VisGridPackage.GRID__VOLTDUMP:
			case VisGridPackage.GRID__SERIES_REACTOR:
			case VisGridPackage.GRID__RESTORATION:
			case VisGridPackage.GRID__FREQUENCY_GEN:
			case VisGridPackage.GRID__VOLT_VAR_CONTROL:
			case VisGridPackage.GRID__FAULT_CHECK:
			case VisGridPackage.GRID__MOTOR:
			case VisGridPackage.GRID__BILLDUMP:
			case VisGridPackage.GRID__RESIDENTIAL_ENDUSE:
			case VisGridPackage.GRID__HOUSE_A:
			case VisGridPackage.GRID__HOUSE:
			case VisGridPackage.GRID__WATERHEATER:
			case VisGridPackage.GRID__LIGHTS:
			case VisGridPackage.GRID__REFRIGERATOR:
			case VisGridPackage.GRID__CLOTHESWASHER:
			case VisGridPackage.GRID__DISHWASHER:
			case VisGridPackage.GRID__OCCUPANTLOAD:
			case VisGridPackage.GRID__PLUGLOAD:
			case VisGridPackage.GRID__MICROWAVE:
			case VisGridPackage.GRID__RANGE:
			case VisGridPackage.GRID__FREEZER:
			case VisGridPackage.GRID__DRYER:
			case VisGridPackage.GRID__EVCHARGER:
			case VisGridPackage.GRID__ZI_PLOAD:
			case VisGridPackage.GRID__PLAYER:
			case VisGridPackage.GRID__SHAPER:
			case VisGridPackage.GRID__RECORDER:
			case VisGridPackage.GRID__COLLECTOR:
			case VisGridPackage.GRID__HISTOGRAM:
			case VisGridPackage.GRID__CLIMATE:
			case VisGridPackage.GRID__WEATHER:
			case VisGridPackage.GRID__OFFICE:
			case VisGridPackage.GRID__MULTIZONE:
			case VisGridPackage.GRID__WINDTURB_DG:
			case VisGridPackage.GRID__POWER_ELECTRONICS:
			case VisGridPackage.GRID__RECTIFIER:
			case VisGridPackage.GRID__MICROTURBINE:
			case VisGridPackage.GRID__SOLAR:
			case VisGridPackage.GRID__STUBAUCTION:
			case VisGridPackage.GRID__LINK:
			case VisGridPackage.GRID__FUSE:
			case VisGridPackage.GRID__RELAY:
			case VisGridPackage.GRID__REGULATOR:
			case VisGridPackage.GRID__TRANSFORMER:
			case VisGridPackage.GRID__METER:
			case VisGridPackage.GRID__GENERATOR:
			case VisGridPackage.GRID__PLC:
			case VisGridPackage.GRID__NODE:
			case VisGridPackage.GRID__CONNECTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Csv_reader(),
				 VisGridFactory.eINSTANCE.createCsv_reader()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Diesel_dg(),
				 VisGridFactory.eINSTANCE.createDiesel_dg()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Energy_storage(),
				 VisGridFactory.eINSTANCE.createEnergy_storage()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Inverter(),
				 VisGridFactory.eINSTANCE.createInverter()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Dc_dc_converter(),
				 VisGridFactory.eINSTANCE.createDc_dc_converter()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Battery(),
				 VisGridFactory.eINSTANCE.createBattery()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Auction(),
				 VisGridFactory.eINSTANCE.createAuction()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Controller(),
				 VisGridFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Controller2(),
				 VisGridFactory.eINSTANCE.createController2()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Capbank(),
				 VisGridFactory.eINSTANCE.createCapbank()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Comm(),
				 VisGridFactory.eINSTANCE.createComm()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Capacitor(),
				 VisGridFactory.eINSTANCE.createCapacitor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Line(),
				 VisGridFactory.eINSTANCE.createLine()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Line_spacing(),
				 VisGridFactory.eINSTANCE.createLine_spacing()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Overhead_line(),
				 VisGridFactory.eINSTANCE.createOverhead_line()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Underground_line(),
				 VisGridFactory.eINSTANCE.createUnderground_line()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Overhead_line_conductor(),
				 VisGridFactory.eINSTANCE.createOverhead_line_conductor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Underground_line_conductor(),
				 VisGridFactory.eINSTANCE.createUnderground_line_conductor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Line_configuration(),
				 VisGridFactory.eINSTANCE.createLine_configuration()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Transformer_configuration(),
				 VisGridFactory.eINSTANCE.createTransformer_configuration()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Load(),
				 VisGridFactory.eINSTANCE.createLoad()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Regulator_configuration(),
				 VisGridFactory.eINSTANCE.createRegulator_configuration()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Triplex_node(),
				 VisGridFactory.eINSTANCE.createTriplex_node()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Triplex_meter(),
				 VisGridFactory.eINSTANCE.createTriplex_meter()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Triplex_line(),
				 VisGridFactory.eINSTANCE.createTriplex_line()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Triplex_line_configuration(),
				 VisGridFactory.eINSTANCE.createTriplex_line_configuration()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Triplex_line_conductor(),
				 VisGridFactory.eINSTANCE.createTriplex_line_conductor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Switch(),
				 VisGridFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Substation(),
				 VisGridFactory.eINSTANCE.createSubstation()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Pqload(),
				 VisGridFactory.eINSTANCE.createPqload()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Voltdump(),
				 VisGridFactory.eINSTANCE.createVoltdump()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Series_reactor(),
				 VisGridFactory.eINSTANCE.createSeries_reactor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Restoration(),
				 VisGridFactory.eINSTANCE.createRestoration()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Frequency_gen(),
				 VisGridFactory.eINSTANCE.createFrequency_gen()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Volt_var_control(),
				 VisGridFactory.eINSTANCE.createVolt_var_control()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Fault_check(),
				 VisGridFactory.eINSTANCE.createFault_check()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Motor(),
				 VisGridFactory.eINSTANCE.createMotor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Billdump(),
				 VisGridFactory.eINSTANCE.createBilldump()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Residential_enduse(),
				 VisGridFactory.eINSTANCE.createResidential_enduse()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_House_a(),
				 VisGridFactory.eINSTANCE.createHouse_a()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_House(),
				 VisGridFactory.eINSTANCE.createHouse()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Waterheater(),
				 VisGridFactory.eINSTANCE.createWaterheater()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Lights(),
				 VisGridFactory.eINSTANCE.createLights()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Refrigerator(),
				 VisGridFactory.eINSTANCE.createRefrigerator()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Clotheswasher(),
				 VisGridFactory.eINSTANCE.createClotheswasher()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Dishwasher(),
				 VisGridFactory.eINSTANCE.createDishwasher()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Occupantload(),
				 VisGridFactory.eINSTANCE.createOccupantload()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Plugload(),
				 VisGridFactory.eINSTANCE.createPlugload()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Microwave(),
				 VisGridFactory.eINSTANCE.createMicrowave()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Range(),
				 VisGridFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Freezer(),
				 VisGridFactory.eINSTANCE.createFreezer()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Dryer(),
				 VisGridFactory.eINSTANCE.createDryer()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Evcharger(),
				 VisGridFactory.eINSTANCE.createEvcharger()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_ZIPload(),
				 VisGridFactory.eINSTANCE.createZIPload()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Player(),
				 VisGridFactory.eINSTANCE.createPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Shaper(),
				 VisGridFactory.eINSTANCE.createShaper()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Recorder(),
				 VisGridFactory.eINSTANCE.createRecorder()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Collector(),
				 VisGridFactory.eINSTANCE.createCollector()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Histogram(),
				 VisGridFactory.eINSTANCE.createHistogram()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Climate(),
				 VisGridFactory.eINSTANCE.createClimate()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Weather(),
				 VisGridFactory.eINSTANCE.createWeather()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Office(),
				 VisGridFactory.eINSTANCE.createOffice()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Multizone(),
				 VisGridFactory.eINSTANCE.createMultizone()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Windturb_dg(),
				 VisGridFactory.eINSTANCE.createWindturb_dg()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Power_electronics(),
				 VisGridFactory.eINSTANCE.createPower_electronics()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Rectifier(),
				 VisGridFactory.eINSTANCE.createRectifier()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Microturbine(),
				 VisGridFactory.eINSTANCE.createMicroturbine()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Solar(),
				 VisGridFactory.eINSTANCE.createSolar()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Stubauction(),
				 VisGridFactory.eINSTANCE.createStubauction()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Link(),
				 VisGridFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Fuse(),
				 VisGridFactory.eINSTANCE.createFuse()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Relay(),
				 VisGridFactory.eINSTANCE.createRelay()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Regulator(),
				 VisGridFactory.eINSTANCE.createRegulator()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Transformer(),
				 VisGridFactory.eINSTANCE.createTransformer()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Meter(),
				 VisGridFactory.eINSTANCE.createMeter()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Generator(),
				 VisGridFactory.eINSTANCE.createGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Plc(),
				 VisGridFactory.eINSTANCE.createPlc()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Node(),
				 VisGridFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connection(),
				 VisGridFactory.eINSTANCE.createConnections()));
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
