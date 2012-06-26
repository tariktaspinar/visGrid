/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import visGrid.Auction;
import visGrid.Battery;
import visGrid.Billdump;
import visGrid.Capacitor;
import visGrid.Capbank;
import visGrid.Climate;
import visGrid.Clotheswasher;
import visGrid.Collector;
import visGrid.Comm;
import visGrid.Connections;
import visGrid.Controller;
import visGrid.Controller2;
import visGrid.Csv_reader;
import visGrid.Dc_dc_converter;
import visGrid.Diesel_dg;
import visGrid.Dishwasher;
import visGrid.Dryer;
import visGrid.Energy_storage;
import visGrid.Evcharger;
import visGrid.Fault_check;
import visGrid.Freezer;
import visGrid.Frequency_gen;
import visGrid.Fuse;
import visGrid.Generator;
import visGrid.Histogram;
import visGrid.House;
import visGrid.House_a;
import visGrid.Inverter;
import visGrid.Lights;
import visGrid.Line;
import visGrid.Line_configuration;
import visGrid.Line_spacing;
import visGrid.Link;
import visGrid.Load;
import visGrid.Meter;
import visGrid.Microturbine;
import visGrid.Microwave;
import visGrid.Motor;
import visGrid.Multizone;
import visGrid.Node;
import visGrid.Occupantload;
import visGrid.Office;
import visGrid.Overhead_line;
import visGrid.Overhead_line_conductor;
import visGrid.Player;
import visGrid.Plc;
import visGrid.Plugload;
import visGrid.Power_electronics;
import visGrid.Pqload;
import visGrid.Range;
import visGrid.Recorder;
import visGrid.Rectifier;
import visGrid.Refrigerator;
import visGrid.Regulator;
import visGrid.Regulator_configuration;
import visGrid.Relay;
import visGrid.Residential_enduse;
import visGrid.Restoration;
import visGrid.Series_reactor;
import visGrid.Shaper;
import visGrid.Solar;
import visGrid.Stubauction;
import visGrid.Substation;
import visGrid.Switch;
import visGrid.Transformer;
import visGrid.Transformer_configuration;
import visGrid.Triplex_line;
import visGrid.Triplex_line_conductor;
import visGrid.Triplex_line_configuration;
import visGrid.Triplex_meter;
import visGrid.Triplex_node;
import visGrid.Underground_line;
import visGrid.Underground_line_conductor;
import visGrid.VisGridPackage;
import visGrid.Volt_var_control;
import visGrid.Voltdump;
import visGrid.Waterheater;
import visGrid.Weather;
import visGrid.Windturb_dg;
import visGrid.ZIPload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getCsv_reader <em>Csv reader</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getDiesel_dg <em>Diesel dg</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getEnergy_storage <em>Energy storage</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getInverter <em>Inverter</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getDc_dc_converter <em>Dc dc converter</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getBattery <em>Battery</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getAuction <em>Auction</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getController <em>Controller</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getController2 <em>Controller2</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getCapbank <em>Capbank</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getComm <em>Comm</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getCapacitor <em>Capacitor</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getLine <em>Line</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getLine_spacing <em>Line spacing</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getOverhead_line <em>Overhead line</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getUnderground_line <em>Underground line</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getOverhead_line_conductor <em>Overhead line conductor</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getUnderground_line_conductor <em>Underground line conductor</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getLine_configuration <em>Line configuration</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getTransformer_configuration <em>Transformer configuration</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getRegulator_configuration <em>Regulator configuration</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getTriplex_node <em>Triplex node</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getTriplex_meter <em>Triplex meter</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getTriplex_line <em>Triplex line</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getTriplex_line_configuration <em>Triplex line configuration</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getTriplex_line_conductor <em>Triplex line conductor</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getSubstation <em>Substation</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getPqload <em>Pqload</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getVoltdump <em>Voltdump</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getSeries_reactor <em>Series reactor</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getRestoration <em>Restoration</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getFrequency_gen <em>Frequency gen</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getVolt_var_control <em>Volt var control</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getFault_check <em>Fault check</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getMotor <em>Motor</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getBilldump <em>Billdump</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getResidential_enduse <em>Residential enduse</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getHouse_a <em>House a</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getHouse <em>House</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getWaterheater <em>Waterheater</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getLights <em>Lights</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getRefrigerator <em>Refrigerator</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getClotheswasher <em>Clotheswasher</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getDishwasher <em>Dishwasher</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getOccupantload <em>Occupantload</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getPlugload <em>Plugload</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getMicrowave <em>Microwave</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getRange <em>Range</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getFreezer <em>Freezer</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getDryer <em>Dryer</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getEvcharger <em>Evcharger</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getZIPload <em>ZI Pload</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getShaper <em>Shaper</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getCollector <em>Collector</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getHistogram <em>Histogram</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getClimate <em>Climate</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getWeather <em>Weather</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getOffice <em>Office</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getMultizone <em>Multizone</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getWindturb_dg <em>Windturb dg</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getPower_electronics <em>Power electronics</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getRectifier <em>Rectifier</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getMicroturbine <em>Microturbine</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getSolar <em>Solar</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getStubauction <em>Stubauction</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getLink <em>Link</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getFuse <em>Fuse</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getRelay <em>Relay</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getRegulator <em>Regulator</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getMeter <em>Meter</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getPlc <em>Plc</em>}</li>
 *   <li>{@link visGrid.impl.ConnectionsImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionsImpl extends EObjectImpl implements Connections {
	/**
	 * The cached value of the '{@link #getCsv_reader() <em>Csv reader</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsv_reader()
	 * @generated
	 * @ordered
	 */
	protected EList<Csv_reader> csv_reader;

	/**
	 * The cached value of the '{@link #getDiesel_dg() <em>Diesel dg</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiesel_dg()
	 * @generated
	 * @ordered
	 */
	protected EList<Diesel_dg> diesel_dg;

	/**
	 * The cached value of the '{@link #getEnergy_storage() <em>Energy storage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy_storage()
	 * @generated
	 * @ordered
	 */
	protected EList<Energy_storage> energy_storage;

	/**
	 * The cached value of the '{@link #getInverter() <em>Inverter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverter()
	 * @generated
	 * @ordered
	 */
	protected EList<Inverter> inverter;

	/**
	 * The cached value of the '{@link #getDc_dc_converter() <em>Dc dc converter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc_dc_converter()
	 * @generated
	 * @ordered
	 */
	protected EList<Dc_dc_converter> dc_dc_converter;

	/**
	 * The cached value of the '{@link #getBattery() <em>Battery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected EList<Battery> battery;

	/**
	 * The cached value of the '{@link #getAuction() <em>Auction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuction()
	 * @generated
	 * @ordered
	 */
	protected EList<Auction> auction;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controller;

	/**
	 * The cached value of the '{@link #getController2() <em>Controller2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController2()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller2> controller2;

	/**
	 * The cached value of the '{@link #getCapbank() <em>Capbank</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapbank()
	 * @generated
	 * @ordered
	 */
	protected EList<Capbank> capbank;

	/**
	 * The cached value of the '{@link #getComm() <em>Comm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComm()
	 * @generated
	 * @ordered
	 */
	protected EList<Comm> comm;

	/**
	 * The cached value of the '{@link #getCapacitor() <em>Capacitor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitor()
	 * @generated
	 * @ordered
	 */
	protected EList<Capacitor> capacitor;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> line;

	/**
	 * The cached value of the '{@link #getLine_spacing() <em>Line spacing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_spacing()
	 * @generated
	 * @ordered
	 */
	protected EList<Line_spacing> line_spacing;

	/**
	 * The cached value of the '{@link #getOverhead_line() <em>Overhead line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverhead_line()
	 * @generated
	 * @ordered
	 */
	protected EList<Overhead_line> overhead_line;

	/**
	 * The cached value of the '{@link #getUnderground_line() <em>Underground line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderground_line()
	 * @generated
	 * @ordered
	 */
	protected EList<Underground_line> underground_line;

	/**
	 * The cached value of the '{@link #getOverhead_line_conductor() <em>Overhead line conductor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverhead_line_conductor()
	 * @generated
	 * @ordered
	 */
	protected EList<Overhead_line_conductor> overhead_line_conductor;

	/**
	 * The cached value of the '{@link #getUnderground_line_conductor() <em>Underground line conductor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderground_line_conductor()
	 * @generated
	 * @ordered
	 */
	protected EList<Underground_line_conductor> underground_line_conductor;

	/**
	 * The cached value of the '{@link #getLine_configuration() <em>Line configuration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Line_configuration> line_configuration;

	/**
	 * The cached value of the '{@link #getTransformer_configuration() <em>Transformer configuration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformer_configuration> transformer_configuration;

	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<Load> load;

	/**
	 * The cached value of the '{@link #getRegulator_configuration() <em>Regulator configuration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulator_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Regulator_configuration> regulator_configuration;

	/**
	 * The cached value of the '{@link #getTriplex_node() <em>Triplex node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_node()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_node> triplex_node;

	/**
	 * The cached value of the '{@link #getTriplex_meter() <em>Triplex meter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_meter()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_meter> triplex_meter;

	/**
	 * The cached value of the '{@link #getTriplex_line() <em>Triplex line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_line> triplex_line;

	/**
	 * The cached value of the '{@link #getTriplex_line_configuration() <em>Triplex line configuration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_line_configuration> triplex_line_configuration;

	/**
	 * The cached value of the '{@link #getTriplex_line_conductor() <em>Triplex line conductor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line_conductor()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_line_conductor> triplex_line_conductor;

	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> switch_;

	/**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
	protected EList<Substation> substation;

	/**
	 * The cached value of the '{@link #getPqload() <em>Pqload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPqload()
	 * @generated
	 * @ordered
	 */
	protected EList<Pqload> pqload;

	/**
	 * The cached value of the '{@link #getVoltdump() <em>Voltdump</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltdump()
	 * @generated
	 * @ordered
	 */
	protected EList<Voltdump> voltdump;

	/**
	 * The cached value of the '{@link #getSeries_reactor() <em>Series reactor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries_reactor()
	 * @generated
	 * @ordered
	 */
	protected EList<Series_reactor> series_reactor;

	/**
	 * The cached value of the '{@link #getRestoration() <em>Restoration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestoration()
	 * @generated
	 * @ordered
	 */
	protected EList<Restoration> restoration;

	/**
	 * The cached value of the '{@link #getFrequency_gen() <em>Frequency gen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency_gen()
	 * @generated
	 * @ordered
	 */
	protected EList<Frequency_gen> frequency_gen;

	/**
	 * The cached value of the '{@link #getVolt_var_control() <em>Volt var control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolt_var_control()
	 * @generated
	 * @ordered
	 */
	protected EList<Volt_var_control> volt_var_control;

	/**
	 * The cached value of the '{@link #getFault_check() <em>Fault check</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault_check()
	 * @generated
	 * @ordered
	 */
	protected EList<Fault_check> fault_check;

	/**
	 * The cached value of the '{@link #getMotor() <em>Motor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor()
	 * @generated
	 * @ordered
	 */
	protected EList<Motor> motor;

	/**
	 * The cached value of the '{@link #getBilldump() <em>Billdump</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilldump()
	 * @generated
	 * @ordered
	 */
	protected EList<Billdump> billdump;

	/**
	 * The cached value of the '{@link #getResidential_enduse() <em>Residential enduse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_enduse()
	 * @generated
	 * @ordered
	 */
	protected EList<Residential_enduse> residential_enduse;

	/**
	 * The cached value of the '{@link #getHouse_a() <em>House a</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse_a()
	 * @generated
	 * @ordered
	 */
	protected EList<House_a> house_a;

	/**
	 * The cached value of the '{@link #getHouse() <em>House</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse()
	 * @generated
	 * @ordered
	 */
	protected EList<House> house;

	/**
	 * The cached value of the '{@link #getWaterheater() <em>Waterheater</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterheater()
	 * @generated
	 * @ordered
	 */
	protected EList<Waterheater> waterheater;

	/**
	 * The cached value of the '{@link #getLights() <em>Lights</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights()
	 * @generated
	 * @ordered
	 */
	protected EList<Lights> lights;

	/**
	 * The cached value of the '{@link #getRefrigerator() <em>Refrigerator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefrigerator()
	 * @generated
	 * @ordered
	 */
	protected EList<Refrigerator> refrigerator;

	/**
	 * The cached value of the '{@link #getClotheswasher() <em>Clotheswasher</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClotheswasher()
	 * @generated
	 * @ordered
	 */
	protected EList<Clotheswasher> clotheswasher;

	/**
	 * The cached value of the '{@link #getDishwasher() <em>Dishwasher</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDishwasher()
	 * @generated
	 * @ordered
	 */
	protected EList<Dishwasher> dishwasher;

	/**
	 * The cached value of the '{@link #getOccupantload() <em>Occupantload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupantload()
	 * @generated
	 * @ordered
	 */
	protected EList<Occupantload> occupantload;

	/**
	 * The cached value of the '{@link #getPlugload() <em>Plugload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugload()
	 * @generated
	 * @ordered
	 */
	protected EList<Plugload> plugload;

	/**
	 * The cached value of the '{@link #getMicrowave() <em>Microwave</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrowave()
	 * @generated
	 * @ordered
	 */
	protected EList<Microwave> microwave;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Range> range;

	/**
	 * The cached value of the '{@link #getFreezer() <em>Freezer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreezer()
	 * @generated
	 * @ordered
	 */
	protected EList<Freezer> freezer;

	/**
	 * The cached value of the '{@link #getDryer() <em>Dryer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDryer()
	 * @generated
	 * @ordered
	 */
	protected EList<Dryer> dryer;

	/**
	 * The cached value of the '{@link #getEvcharger() <em>Evcharger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvcharger()
	 * @generated
	 * @ordered
	 */
	protected EList<Evcharger> evcharger;

	/**
	 * The cached value of the '{@link #getZIPload() <em>ZI Pload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIPload()
	 * @generated
	 * @ordered
	 */
	protected EList<ZIPload> ziPload;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> player;

	/**
	 * The cached value of the '{@link #getShaper() <em>Shaper</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaper()
	 * @generated
	 * @ordered
	 */
	protected EList<Shaper> shaper;

	/**
	 * The cached value of the '{@link #getRecorder() <em>Recorder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorder()
	 * @generated
	 * @ordered
	 */
	protected EList<Recorder> recorder;

	/**
	 * The cached value of the '{@link #getCollector() <em>Collector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollector()
	 * @generated
	 * @ordered
	 */
	protected EList<Collector> collector;

	/**
	 * The cached value of the '{@link #getHistogram() <em>Histogram</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistogram()
	 * @generated
	 * @ordered
	 */
	protected EList<Histogram> histogram;

	/**
	 * The cached value of the '{@link #getClimate() <em>Climate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClimate()
	 * @generated
	 * @ordered
	 */
	protected EList<Climate> climate;

	/**
	 * The cached value of the '{@link #getWeather() <em>Weather</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeather()
	 * @generated
	 * @ordered
	 */
	protected EList<Weather> weather;

	/**
	 * The cached value of the '{@link #getOffice() <em>Office</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice()
	 * @generated
	 * @ordered
	 */
	protected EList<Office> office;

	/**
	 * The cached value of the '{@link #getMultizone() <em>Multizone</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultizone()
	 * @generated
	 * @ordered
	 */
	protected EList<Multizone> multizone;

	/**
	 * The cached value of the '{@link #getWindturb_dg() <em>Windturb dg</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindturb_dg()
	 * @generated
	 * @ordered
	 */
	protected EList<Windturb_dg> windturb_dg;

	/**
	 * The cached value of the '{@link #getPower_electronics() <em>Power electronics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_electronics()
	 * @generated
	 * @ordered
	 */
	protected EList<Power_electronics> power_electronics;

	/**
	 * The cached value of the '{@link #getRectifier() <em>Rectifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Rectifier> rectifier;

	/**
	 * The cached value of the '{@link #getMicroturbine() <em>Microturbine</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroturbine()
	 * @generated
	 * @ordered
	 */
	protected EList<Microturbine> microturbine;

	/**
	 * The cached value of the '{@link #getSolar() <em>Solar</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar()
	 * @generated
	 * @ordered
	 */
	protected EList<Solar> solar;

	/**
	 * The cached value of the '{@link #getStubauction() <em>Stubauction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubauction()
	 * @generated
	 * @ordered
	 */
	protected EList<Stubauction> stubauction;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getFuse() <em>Fuse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuse()
	 * @generated
	 * @ordered
	 */
	protected EList<Fuse> fuse;

	/**
	 * The cached value of the '{@link #getRelay() <em>Relay</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelay()
	 * @generated
	 * @ordered
	 */
	protected EList<Relay> relay;

	/**
	 * The cached value of the '{@link #getRegulator() <em>Regulator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulator()
	 * @generated
	 * @ordered
	 */
	protected EList<Regulator> regulator;

	/**
	 * The cached value of the '{@link #getTransformer() <em>Transformer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformer> transformer;

	/**
	 * The cached value of the '{@link #getMeter() <em>Meter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter()
	 * @generated
	 * @ordered
	 */
	protected EList<Meter> meter;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected EList<Generator> generator;

	/**
	 * The cached value of the '{@link #getPlc() <em>Plc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlc()
	 * @generated
	 * @ordered
	 */
	protected EList<Plc> plc;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getConnections();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Csv_reader> getCsv_reader() {
		if (csv_reader == null) {
			csv_reader = new EObjectResolvingEList<Csv_reader>(Csv_reader.class, this, VisGridPackage.CONNECTIONS__CSV_READER);
		}
		return csv_reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Diesel_dg> getDiesel_dg() {
		if (diesel_dg == null) {
			diesel_dg = new EObjectResolvingEList<Diesel_dg>(Diesel_dg.class, this, VisGridPackage.CONNECTIONS__DIESEL_DG);
		}
		return diesel_dg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Energy_storage> getEnergy_storage() {
		if (energy_storage == null) {
			energy_storage = new EObjectResolvingEList<Energy_storage>(Energy_storage.class, this, VisGridPackage.CONNECTIONS__ENERGY_STORAGE);
		}
		return energy_storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inverter> getInverter() {
		if (inverter == null) {
			inverter = new EObjectResolvingEList<Inverter>(Inverter.class, this, VisGridPackage.CONNECTIONS__INVERTER);
		}
		return inverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dc_dc_converter> getDc_dc_converter() {
		if (dc_dc_converter == null) {
			dc_dc_converter = new EObjectResolvingEList<Dc_dc_converter>(Dc_dc_converter.class, this, VisGridPackage.CONNECTIONS__DC_DC_CONVERTER);
		}
		return dc_dc_converter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Battery> getBattery() {
		if (battery == null) {
			battery = new EObjectResolvingEList<Battery>(Battery.class, this, VisGridPackage.CONNECTIONS__BATTERY);
		}
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Auction> getAuction() {
		if (auction == null) {
			auction = new EObjectResolvingEList<Auction>(Auction.class, this, VisGridPackage.CONNECTIONS__AUCTION);
		}
		return auction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getController() {
		if (controller == null) {
			controller = new EObjectResolvingEList<Controller>(Controller.class, this, VisGridPackage.CONNECTIONS__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller2> getController2() {
		if (controller2 == null) {
			controller2 = new EObjectResolvingEList<Controller2>(Controller2.class, this, VisGridPackage.CONNECTIONS__CONTROLLER2);
		}
		return controller2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capbank> getCapbank() {
		if (capbank == null) {
			capbank = new EObjectResolvingEList<Capbank>(Capbank.class, this, VisGridPackage.CONNECTIONS__CAPBANK);
		}
		return capbank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comm> getComm() {
		if (comm == null) {
			comm = new EObjectResolvingEList<Comm>(Comm.class, this, VisGridPackage.CONNECTIONS__COMM);
		}
		return comm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capacitor> getCapacitor() {
		if (capacitor == null) {
			capacitor = new EObjectResolvingEList<Capacitor>(Capacitor.class, this, VisGridPackage.CONNECTIONS__CAPACITOR);
		}
		return capacitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLine() {
		if (line == null) {
			line = new EObjectResolvingEList<Line>(Line.class, this, VisGridPackage.CONNECTIONS__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line_spacing> getLine_spacing() {
		if (line_spacing == null) {
			line_spacing = new EObjectResolvingEList<Line_spacing>(Line_spacing.class, this, VisGridPackage.CONNECTIONS__LINE_SPACING);
		}
		return line_spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Overhead_line> getOverhead_line() {
		if (overhead_line == null) {
			overhead_line = new EObjectResolvingEList<Overhead_line>(Overhead_line.class, this, VisGridPackage.CONNECTIONS__OVERHEAD_LINE);
		}
		return overhead_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Underground_line> getUnderground_line() {
		if (underground_line == null) {
			underground_line = new EObjectResolvingEList<Underground_line>(Underground_line.class, this, VisGridPackage.CONNECTIONS__UNDERGROUND_LINE);
		}
		return underground_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Overhead_line_conductor> getOverhead_line_conductor() {
		if (overhead_line_conductor == null) {
			overhead_line_conductor = new EObjectResolvingEList<Overhead_line_conductor>(Overhead_line_conductor.class, this, VisGridPackage.CONNECTIONS__OVERHEAD_LINE_CONDUCTOR);
		}
		return overhead_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Underground_line_conductor> getUnderground_line_conductor() {
		if (underground_line_conductor == null) {
			underground_line_conductor = new EObjectResolvingEList<Underground_line_conductor>(Underground_line_conductor.class, this, VisGridPackage.CONNECTIONS__UNDERGROUND_LINE_CONDUCTOR);
		}
		return underground_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line_configuration> getLine_configuration() {
		if (line_configuration == null) {
			line_configuration = new EObjectResolvingEList<Line_configuration>(Line_configuration.class, this, VisGridPackage.CONNECTIONS__LINE_CONFIGURATION);
		}
		return line_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformer_configuration> getTransformer_configuration() {
		if (transformer_configuration == null) {
			transformer_configuration = new EObjectResolvingEList<Transformer_configuration>(Transformer_configuration.class, this, VisGridPackage.CONNECTIONS__TRANSFORMER_CONFIGURATION);
		}
		return transformer_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Load> getLoad() {
		if (load == null) {
			load = new EObjectResolvingEList<Load>(Load.class, this, VisGridPackage.CONNECTIONS__LOAD);
		}
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regulator_configuration> getRegulator_configuration() {
		if (regulator_configuration == null) {
			regulator_configuration = new EObjectResolvingEList<Regulator_configuration>(Regulator_configuration.class, this, VisGridPackage.CONNECTIONS__REGULATOR_CONFIGURATION);
		}
		return regulator_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_node> getTriplex_node() {
		if (triplex_node == null) {
			triplex_node = new EObjectResolvingEList<Triplex_node>(Triplex_node.class, this, VisGridPackage.CONNECTIONS__TRIPLEX_NODE);
		}
		return triplex_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_meter> getTriplex_meter() {
		if (triplex_meter == null) {
			triplex_meter = new EObjectResolvingEList<Triplex_meter>(Triplex_meter.class, this, VisGridPackage.CONNECTIONS__TRIPLEX_METER);
		}
		return triplex_meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_line> getTriplex_line() {
		if (triplex_line == null) {
			triplex_line = new EObjectResolvingEList<Triplex_line>(Triplex_line.class, this, VisGridPackage.CONNECTIONS__TRIPLEX_LINE);
		}
		return triplex_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_line_configuration> getTriplex_line_configuration() {
		if (triplex_line_configuration == null) {
			triplex_line_configuration = new EObjectResolvingEList<Triplex_line_configuration>(Triplex_line_configuration.class, this, VisGridPackage.CONNECTIONS__TRIPLEX_LINE_CONFIGURATION);
		}
		return triplex_line_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_line_conductor> getTriplex_line_conductor() {
		if (triplex_line_conductor == null) {
			triplex_line_conductor = new EObjectResolvingEList<Triplex_line_conductor>(Triplex_line_conductor.class, this, VisGridPackage.CONNECTIONS__TRIPLEX_LINE_CONDUCTOR);
		}
		return triplex_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSwitch() {
		if (switch_ == null) {
			switch_ = new EObjectResolvingEList<Switch>(Switch.class, this, VisGridPackage.CONNECTIONS__SWITCH);
		}
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substation> getSubstation() {
		if (substation == null) {
			substation = new EObjectResolvingEList<Substation>(Substation.class, this, VisGridPackage.CONNECTIONS__SUBSTATION);
		}
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pqload> getPqload() {
		if (pqload == null) {
			pqload = new EObjectResolvingEList<Pqload>(Pqload.class, this, VisGridPackage.CONNECTIONS__PQLOAD);
		}
		return pqload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Voltdump> getVoltdump() {
		if (voltdump == null) {
			voltdump = new EObjectResolvingEList<Voltdump>(Voltdump.class, this, VisGridPackage.CONNECTIONS__VOLTDUMP);
		}
		return voltdump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Series_reactor> getSeries_reactor() {
		if (series_reactor == null) {
			series_reactor = new EObjectResolvingEList<Series_reactor>(Series_reactor.class, this, VisGridPackage.CONNECTIONS__SERIES_REACTOR);
		}
		return series_reactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Restoration> getRestoration() {
		if (restoration == null) {
			restoration = new EObjectResolvingEList<Restoration>(Restoration.class, this, VisGridPackage.CONNECTIONS__RESTORATION);
		}
		return restoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Frequency_gen> getFrequency_gen() {
		if (frequency_gen == null) {
			frequency_gen = new EObjectResolvingEList<Frequency_gen>(Frequency_gen.class, this, VisGridPackage.CONNECTIONS__FREQUENCY_GEN);
		}
		return frequency_gen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Volt_var_control> getVolt_var_control() {
		if (volt_var_control == null) {
			volt_var_control = new EObjectResolvingEList<Volt_var_control>(Volt_var_control.class, this, VisGridPackage.CONNECTIONS__VOLT_VAR_CONTROL);
		}
		return volt_var_control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fault_check> getFault_check() {
		if (fault_check == null) {
			fault_check = new EObjectResolvingEList<Fault_check>(Fault_check.class, this, VisGridPackage.CONNECTIONS__FAULT_CHECK);
		}
		return fault_check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Motor> getMotor() {
		if (motor == null) {
			motor = new EObjectResolvingEList<Motor>(Motor.class, this, VisGridPackage.CONNECTIONS__MOTOR);
		}
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Billdump> getBilldump() {
		if (billdump == null) {
			billdump = new EObjectResolvingEList<Billdump>(Billdump.class, this, VisGridPackage.CONNECTIONS__BILLDUMP);
		}
		return billdump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Residential_enduse> getResidential_enduse() {
		if (residential_enduse == null) {
			residential_enduse = new EObjectResolvingEList<Residential_enduse>(Residential_enduse.class, this, VisGridPackage.CONNECTIONS__RESIDENTIAL_ENDUSE);
		}
		return residential_enduse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<House_a> getHouse_a() {
		if (house_a == null) {
			house_a = new EObjectResolvingEList<House_a>(House_a.class, this, VisGridPackage.CONNECTIONS__HOUSE_A);
		}
		return house_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<House> getHouse() {
		if (house == null) {
			house = new EObjectResolvingEList<House>(House.class, this, VisGridPackage.CONNECTIONS__HOUSE);
		}
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Waterheater> getWaterheater() {
		if (waterheater == null) {
			waterheater = new EObjectResolvingEList<Waterheater>(Waterheater.class, this, VisGridPackage.CONNECTIONS__WATERHEATER);
		}
		return waterheater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lights> getLights() {
		if (lights == null) {
			lights = new EObjectResolvingEList<Lights>(Lights.class, this, VisGridPackage.CONNECTIONS__LIGHTS);
		}
		return lights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refrigerator> getRefrigerator() {
		if (refrigerator == null) {
			refrigerator = new EObjectResolvingEList<Refrigerator>(Refrigerator.class, this, VisGridPackage.CONNECTIONS__REFRIGERATOR);
		}
		return refrigerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clotheswasher> getClotheswasher() {
		if (clotheswasher == null) {
			clotheswasher = new EObjectResolvingEList<Clotheswasher>(Clotheswasher.class, this, VisGridPackage.CONNECTIONS__CLOTHESWASHER);
		}
		return clotheswasher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dishwasher> getDishwasher() {
		if (dishwasher == null) {
			dishwasher = new EObjectResolvingEList<Dishwasher>(Dishwasher.class, this, VisGridPackage.CONNECTIONS__DISHWASHER);
		}
		return dishwasher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Occupantload> getOccupantload() {
		if (occupantload == null) {
			occupantload = new EObjectResolvingEList<Occupantload>(Occupantload.class, this, VisGridPackage.CONNECTIONS__OCCUPANTLOAD);
		}
		return occupantload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plugload> getPlugload() {
		if (plugload == null) {
			plugload = new EObjectResolvingEList<Plugload>(Plugload.class, this, VisGridPackage.CONNECTIONS__PLUGLOAD);
		}
		return plugload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microwave> getMicrowave() {
		if (microwave == null) {
			microwave = new EObjectResolvingEList<Microwave>(Microwave.class, this, VisGridPackage.CONNECTIONS__MICROWAVE);
		}
		return microwave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Range> getRange() {
		if (range == null) {
			range = new EObjectResolvingEList<Range>(Range.class, this, VisGridPackage.CONNECTIONS__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Freezer> getFreezer() {
		if (freezer == null) {
			freezer = new EObjectResolvingEList<Freezer>(Freezer.class, this, VisGridPackage.CONNECTIONS__FREEZER);
		}
		return freezer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dryer> getDryer() {
		if (dryer == null) {
			dryer = new EObjectResolvingEList<Dryer>(Dryer.class, this, VisGridPackage.CONNECTIONS__DRYER);
		}
		return dryer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evcharger> getEvcharger() {
		if (evcharger == null) {
			evcharger = new EObjectResolvingEList<Evcharger>(Evcharger.class, this, VisGridPackage.CONNECTIONS__EVCHARGER);
		}
		return evcharger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZIPload> getZIPload() {
		if (ziPload == null) {
			ziPload = new EObjectResolvingEList<ZIPload>(ZIPload.class, this, VisGridPackage.CONNECTIONS__ZI_PLOAD);
		}
		return ziPload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayer() {
		if (player == null) {
			player = new EObjectResolvingEList<Player>(Player.class, this, VisGridPackage.CONNECTIONS__PLAYER);
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shaper> getShaper() {
		if (shaper == null) {
			shaper = new EObjectResolvingEList<Shaper>(Shaper.class, this, VisGridPackage.CONNECTIONS__SHAPER);
		}
		return shaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recorder> getRecorder() {
		if (recorder == null) {
			recorder = new EObjectResolvingEList<Recorder>(Recorder.class, this, VisGridPackage.CONNECTIONS__RECORDER);
		}
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collector> getCollector() {
		if (collector == null) {
			collector = new EObjectResolvingEList<Collector>(Collector.class, this, VisGridPackage.CONNECTIONS__COLLECTOR);
		}
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Histogram> getHistogram() {
		if (histogram == null) {
			histogram = new EObjectResolvingEList<Histogram>(Histogram.class, this, VisGridPackage.CONNECTIONS__HISTOGRAM);
		}
		return histogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Climate> getClimate() {
		if (climate == null) {
			climate = new EObjectResolvingEList<Climate>(Climate.class, this, VisGridPackage.CONNECTIONS__CLIMATE);
		}
		return climate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Weather> getWeather() {
		if (weather == null) {
			weather = new EObjectResolvingEList<Weather>(Weather.class, this, VisGridPackage.CONNECTIONS__WEATHER);
		}
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Office> getOffice() {
		if (office == null) {
			office = new EObjectResolvingEList<Office>(Office.class, this, VisGridPackage.CONNECTIONS__OFFICE);
		}
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Multizone> getMultizone() {
		if (multizone == null) {
			multizone = new EObjectResolvingEList<Multizone>(Multizone.class, this, VisGridPackage.CONNECTIONS__MULTIZONE);
		}
		return multizone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Windturb_dg> getWindturb_dg() {
		if (windturb_dg == null) {
			windturb_dg = new EObjectResolvingEList<Windturb_dg>(Windturb_dg.class, this, VisGridPackage.CONNECTIONS__WINDTURB_DG);
		}
		return windturb_dg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Power_electronics> getPower_electronics() {
		if (power_electronics == null) {
			power_electronics = new EObjectResolvingEList<Power_electronics>(Power_electronics.class, this, VisGridPackage.CONNECTIONS__POWER_ELECTRONICS);
		}
		return power_electronics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rectifier> getRectifier() {
		if (rectifier == null) {
			rectifier = new EObjectResolvingEList<Rectifier>(Rectifier.class, this, VisGridPackage.CONNECTIONS__RECTIFIER);
		}
		return rectifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microturbine> getMicroturbine() {
		if (microturbine == null) {
			microturbine = new EObjectResolvingEList<Microturbine>(Microturbine.class, this, VisGridPackage.CONNECTIONS__MICROTURBINE);
		}
		return microturbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solar> getSolar() {
		if (solar == null) {
			solar = new EObjectResolvingEList<Solar>(Solar.class, this, VisGridPackage.CONNECTIONS__SOLAR);
		}
		return solar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stubauction> getStubauction() {
		if (stubauction == null) {
			stubauction = new EObjectResolvingEList<Stubauction>(Stubauction.class, this, VisGridPackage.CONNECTIONS__STUBAUCTION);
		}
		return stubauction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectResolvingEList<Link>(Link.class, this, VisGridPackage.CONNECTIONS__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fuse> getFuse() {
		if (fuse == null) {
			fuse = new EObjectResolvingEList<Fuse>(Fuse.class, this, VisGridPackage.CONNECTIONS__FUSE);
		}
		return fuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relay> getRelay() {
		if (relay == null) {
			relay = new EObjectResolvingEList<Relay>(Relay.class, this, VisGridPackage.CONNECTIONS__RELAY);
		}
		return relay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regulator> getRegulator() {
		if (regulator == null) {
			regulator = new EObjectResolvingEList<Regulator>(Regulator.class, this, VisGridPackage.CONNECTIONS__REGULATOR);
		}
		return regulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformer> getTransformer() {
		if (transformer == null) {
			transformer = new EObjectResolvingEList<Transformer>(Transformer.class, this, VisGridPackage.CONNECTIONS__TRANSFORMER);
		}
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meter> getMeter() {
		if (meter == null) {
			meter = new EObjectResolvingEList<Meter>(Meter.class, this, VisGridPackage.CONNECTIONS__METER);
		}
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generator> getGenerator() {
		if (generator == null) {
			generator = new EObjectResolvingEList<Generator>(Generator.class, this, VisGridPackage.CONNECTIONS__GENERATOR);
		}
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plc> getPlc() {
		if (plc == null) {
			plc = new EObjectResolvingEList<Plc>(Plc.class, this, VisGridPackage.CONNECTIONS__PLC);
		}
		return plc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectResolvingEList<Node>(Node.class, this, VisGridPackage.CONNECTIONS__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.CONNECTIONS__CSV_READER:
				return getCsv_reader();
			case VisGridPackage.CONNECTIONS__DIESEL_DG:
				return getDiesel_dg();
			case VisGridPackage.CONNECTIONS__ENERGY_STORAGE:
				return getEnergy_storage();
			case VisGridPackage.CONNECTIONS__INVERTER:
				return getInverter();
			case VisGridPackage.CONNECTIONS__DC_DC_CONVERTER:
				return getDc_dc_converter();
			case VisGridPackage.CONNECTIONS__BATTERY:
				return getBattery();
			case VisGridPackage.CONNECTIONS__AUCTION:
				return getAuction();
			case VisGridPackage.CONNECTIONS__CONTROLLER:
				return getController();
			case VisGridPackage.CONNECTIONS__CONTROLLER2:
				return getController2();
			case VisGridPackage.CONNECTIONS__CAPBANK:
				return getCapbank();
			case VisGridPackage.CONNECTIONS__COMM:
				return getComm();
			case VisGridPackage.CONNECTIONS__CAPACITOR:
				return getCapacitor();
			case VisGridPackage.CONNECTIONS__LINE:
				return getLine();
			case VisGridPackage.CONNECTIONS__LINE_SPACING:
				return getLine_spacing();
			case VisGridPackage.CONNECTIONS__OVERHEAD_LINE:
				return getOverhead_line();
			case VisGridPackage.CONNECTIONS__UNDERGROUND_LINE:
				return getUnderground_line();
			case VisGridPackage.CONNECTIONS__OVERHEAD_LINE_CONDUCTOR:
				return getOverhead_line_conductor();
			case VisGridPackage.CONNECTIONS__UNDERGROUND_LINE_CONDUCTOR:
				return getUnderground_line_conductor();
			case VisGridPackage.CONNECTIONS__LINE_CONFIGURATION:
				return getLine_configuration();
			case VisGridPackage.CONNECTIONS__TRANSFORMER_CONFIGURATION:
				return getTransformer_configuration();
			case VisGridPackage.CONNECTIONS__LOAD:
				return getLoad();
			case VisGridPackage.CONNECTIONS__REGULATOR_CONFIGURATION:
				return getRegulator_configuration();
			case VisGridPackage.CONNECTIONS__TRIPLEX_NODE:
				return getTriplex_node();
			case VisGridPackage.CONNECTIONS__TRIPLEX_METER:
				return getTriplex_meter();
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE:
				return getTriplex_line();
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE_CONFIGURATION:
				return getTriplex_line_configuration();
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE_CONDUCTOR:
				return getTriplex_line_conductor();
			case VisGridPackage.CONNECTIONS__SWITCH:
				return getSwitch();
			case VisGridPackage.CONNECTIONS__SUBSTATION:
				return getSubstation();
			case VisGridPackage.CONNECTIONS__PQLOAD:
				return getPqload();
			case VisGridPackage.CONNECTIONS__VOLTDUMP:
				return getVoltdump();
			case VisGridPackage.CONNECTIONS__SERIES_REACTOR:
				return getSeries_reactor();
			case VisGridPackage.CONNECTIONS__RESTORATION:
				return getRestoration();
			case VisGridPackage.CONNECTIONS__FREQUENCY_GEN:
				return getFrequency_gen();
			case VisGridPackage.CONNECTIONS__VOLT_VAR_CONTROL:
				return getVolt_var_control();
			case VisGridPackage.CONNECTIONS__FAULT_CHECK:
				return getFault_check();
			case VisGridPackage.CONNECTIONS__MOTOR:
				return getMotor();
			case VisGridPackage.CONNECTIONS__BILLDUMP:
				return getBilldump();
			case VisGridPackage.CONNECTIONS__RESIDENTIAL_ENDUSE:
				return getResidential_enduse();
			case VisGridPackage.CONNECTIONS__HOUSE_A:
				return getHouse_a();
			case VisGridPackage.CONNECTIONS__HOUSE:
				return getHouse();
			case VisGridPackage.CONNECTIONS__WATERHEATER:
				return getWaterheater();
			case VisGridPackage.CONNECTIONS__LIGHTS:
				return getLights();
			case VisGridPackage.CONNECTIONS__REFRIGERATOR:
				return getRefrigerator();
			case VisGridPackage.CONNECTIONS__CLOTHESWASHER:
				return getClotheswasher();
			case VisGridPackage.CONNECTIONS__DISHWASHER:
				return getDishwasher();
			case VisGridPackage.CONNECTIONS__OCCUPANTLOAD:
				return getOccupantload();
			case VisGridPackage.CONNECTIONS__PLUGLOAD:
				return getPlugload();
			case VisGridPackage.CONNECTIONS__MICROWAVE:
				return getMicrowave();
			case VisGridPackage.CONNECTIONS__RANGE:
				return getRange();
			case VisGridPackage.CONNECTIONS__FREEZER:
				return getFreezer();
			case VisGridPackage.CONNECTIONS__DRYER:
				return getDryer();
			case VisGridPackage.CONNECTIONS__EVCHARGER:
				return getEvcharger();
			case VisGridPackage.CONNECTIONS__ZI_PLOAD:
				return getZIPload();
			case VisGridPackage.CONNECTIONS__PLAYER:
				return getPlayer();
			case VisGridPackage.CONNECTIONS__SHAPER:
				return getShaper();
			case VisGridPackage.CONNECTIONS__RECORDER:
				return getRecorder();
			case VisGridPackage.CONNECTIONS__COLLECTOR:
				return getCollector();
			case VisGridPackage.CONNECTIONS__HISTOGRAM:
				return getHistogram();
			case VisGridPackage.CONNECTIONS__CLIMATE:
				return getClimate();
			case VisGridPackage.CONNECTIONS__WEATHER:
				return getWeather();
			case VisGridPackage.CONNECTIONS__OFFICE:
				return getOffice();
			case VisGridPackage.CONNECTIONS__MULTIZONE:
				return getMultizone();
			case VisGridPackage.CONNECTIONS__WINDTURB_DG:
				return getWindturb_dg();
			case VisGridPackage.CONNECTIONS__POWER_ELECTRONICS:
				return getPower_electronics();
			case VisGridPackage.CONNECTIONS__RECTIFIER:
				return getRectifier();
			case VisGridPackage.CONNECTIONS__MICROTURBINE:
				return getMicroturbine();
			case VisGridPackage.CONNECTIONS__SOLAR:
				return getSolar();
			case VisGridPackage.CONNECTIONS__STUBAUCTION:
				return getStubauction();
			case VisGridPackage.CONNECTIONS__LINK:
				return getLink();
			case VisGridPackage.CONNECTIONS__FUSE:
				return getFuse();
			case VisGridPackage.CONNECTIONS__RELAY:
				return getRelay();
			case VisGridPackage.CONNECTIONS__REGULATOR:
				return getRegulator();
			case VisGridPackage.CONNECTIONS__TRANSFORMER:
				return getTransformer();
			case VisGridPackage.CONNECTIONS__METER:
				return getMeter();
			case VisGridPackage.CONNECTIONS__GENERATOR:
				return getGenerator();
			case VisGridPackage.CONNECTIONS__PLC:
				return getPlc();
			case VisGridPackage.CONNECTIONS__NODE:
				return getNode();
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
			case VisGridPackage.CONNECTIONS__CSV_READER:
				getCsv_reader().clear();
				getCsv_reader().addAll((Collection<? extends Csv_reader>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__DIESEL_DG:
				getDiesel_dg().clear();
				getDiesel_dg().addAll((Collection<? extends Diesel_dg>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__ENERGY_STORAGE:
				getEnergy_storage().clear();
				getEnergy_storage().addAll((Collection<? extends Energy_storage>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__INVERTER:
				getInverter().clear();
				getInverter().addAll((Collection<? extends Inverter>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__DC_DC_CONVERTER:
				getDc_dc_converter().clear();
				getDc_dc_converter().addAll((Collection<? extends Dc_dc_converter>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__BATTERY:
				getBattery().clear();
				getBattery().addAll((Collection<? extends Battery>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__AUCTION:
				getAuction().clear();
				getAuction().addAll((Collection<? extends Auction>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__CONTROLLER:
				getController().clear();
				getController().addAll((Collection<? extends Controller>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__CONTROLLER2:
				getController2().clear();
				getController2().addAll((Collection<? extends Controller2>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__CAPBANK:
				getCapbank().clear();
				getCapbank().addAll((Collection<? extends Capbank>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__COMM:
				getComm().clear();
				getComm().addAll((Collection<? extends Comm>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__CAPACITOR:
				getCapacitor().clear();
				getCapacitor().addAll((Collection<? extends Capacitor>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends Line>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__LINE_SPACING:
				getLine_spacing().clear();
				getLine_spacing().addAll((Collection<? extends Line_spacing>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__OVERHEAD_LINE:
				getOverhead_line().clear();
				getOverhead_line().addAll((Collection<? extends Overhead_line>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__UNDERGROUND_LINE:
				getUnderground_line().clear();
				getUnderground_line().addAll((Collection<? extends Underground_line>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__OVERHEAD_LINE_CONDUCTOR:
				getOverhead_line_conductor().clear();
				getOverhead_line_conductor().addAll((Collection<? extends Overhead_line_conductor>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__UNDERGROUND_LINE_CONDUCTOR:
				getUnderground_line_conductor().clear();
				getUnderground_line_conductor().addAll((Collection<? extends Underground_line_conductor>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__LINE_CONFIGURATION:
				getLine_configuration().clear();
				getLine_configuration().addAll((Collection<? extends Line_configuration>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__TRANSFORMER_CONFIGURATION:
				getTransformer_configuration().clear();
				getTransformer_configuration().addAll((Collection<? extends Transformer_configuration>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__LOAD:
				getLoad().clear();
				getLoad().addAll((Collection<? extends Load>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__REGULATOR_CONFIGURATION:
				getRegulator_configuration().clear();
				getRegulator_configuration().addAll((Collection<? extends Regulator_configuration>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__TRIPLEX_NODE:
				getTriplex_node().clear();
				getTriplex_node().addAll((Collection<? extends Triplex_node>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__TRIPLEX_METER:
				getTriplex_meter().clear();
				getTriplex_meter().addAll((Collection<? extends Triplex_meter>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE:
				getTriplex_line().clear();
				getTriplex_line().addAll((Collection<? extends Triplex_line>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE_CONFIGURATION:
				getTriplex_line_configuration().clear();
				getTriplex_line_configuration().addAll((Collection<? extends Triplex_line_configuration>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE_CONDUCTOR:
				getTriplex_line_conductor().clear();
				getTriplex_line_conductor().addAll((Collection<? extends Triplex_line_conductor>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__SWITCH:
				getSwitch().clear();
				getSwitch().addAll((Collection<? extends Switch>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__SUBSTATION:
				getSubstation().clear();
				getSubstation().addAll((Collection<? extends Substation>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__PQLOAD:
				getPqload().clear();
				getPqload().addAll((Collection<? extends Pqload>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__VOLTDUMP:
				getVoltdump().clear();
				getVoltdump().addAll((Collection<? extends Voltdump>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__SERIES_REACTOR:
				getSeries_reactor().clear();
				getSeries_reactor().addAll((Collection<? extends Series_reactor>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__RESTORATION:
				getRestoration().clear();
				getRestoration().addAll((Collection<? extends Restoration>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__FREQUENCY_GEN:
				getFrequency_gen().clear();
				getFrequency_gen().addAll((Collection<? extends Frequency_gen>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__VOLT_VAR_CONTROL:
				getVolt_var_control().clear();
				getVolt_var_control().addAll((Collection<? extends Volt_var_control>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__FAULT_CHECK:
				getFault_check().clear();
				getFault_check().addAll((Collection<? extends Fault_check>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__MOTOR:
				getMotor().clear();
				getMotor().addAll((Collection<? extends Motor>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__BILLDUMP:
				getBilldump().clear();
				getBilldump().addAll((Collection<? extends Billdump>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__RESIDENTIAL_ENDUSE:
				getResidential_enduse().clear();
				getResidential_enduse().addAll((Collection<? extends Residential_enduse>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__HOUSE_A:
				getHouse_a().clear();
				getHouse_a().addAll((Collection<? extends House_a>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__HOUSE:
				getHouse().clear();
				getHouse().addAll((Collection<? extends House>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__WATERHEATER:
				getWaterheater().clear();
				getWaterheater().addAll((Collection<? extends Waterheater>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__LIGHTS:
				getLights().clear();
				getLights().addAll((Collection<? extends Lights>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__REFRIGERATOR:
				getRefrigerator().clear();
				getRefrigerator().addAll((Collection<? extends Refrigerator>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__CLOTHESWASHER:
				getClotheswasher().clear();
				getClotheswasher().addAll((Collection<? extends Clotheswasher>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__DISHWASHER:
				getDishwasher().clear();
				getDishwasher().addAll((Collection<? extends Dishwasher>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__OCCUPANTLOAD:
				getOccupantload().clear();
				getOccupantload().addAll((Collection<? extends Occupantload>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__PLUGLOAD:
				getPlugload().clear();
				getPlugload().addAll((Collection<? extends Plugload>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__MICROWAVE:
				getMicrowave().clear();
				getMicrowave().addAll((Collection<? extends Microwave>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends Range>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__FREEZER:
				getFreezer().clear();
				getFreezer().addAll((Collection<? extends Freezer>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__DRYER:
				getDryer().clear();
				getDryer().addAll((Collection<? extends Dryer>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__EVCHARGER:
				getEvcharger().clear();
				getEvcharger().addAll((Collection<? extends Evcharger>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__ZI_PLOAD:
				getZIPload().clear();
				getZIPload().addAll((Collection<? extends ZIPload>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__PLAYER:
				getPlayer().clear();
				getPlayer().addAll((Collection<? extends Player>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__SHAPER:
				getShaper().clear();
				getShaper().addAll((Collection<? extends Shaper>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__RECORDER:
				getRecorder().clear();
				getRecorder().addAll((Collection<? extends Recorder>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__COLLECTOR:
				getCollector().clear();
				getCollector().addAll((Collection<? extends Collector>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__HISTOGRAM:
				getHistogram().clear();
				getHistogram().addAll((Collection<? extends Histogram>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__CLIMATE:
				getClimate().clear();
				getClimate().addAll((Collection<? extends Climate>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__WEATHER:
				getWeather().clear();
				getWeather().addAll((Collection<? extends Weather>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__OFFICE:
				getOffice().clear();
				getOffice().addAll((Collection<? extends Office>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__MULTIZONE:
				getMultizone().clear();
				getMultizone().addAll((Collection<? extends Multizone>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__WINDTURB_DG:
				getWindturb_dg().clear();
				getWindturb_dg().addAll((Collection<? extends Windturb_dg>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__POWER_ELECTRONICS:
				getPower_electronics().clear();
				getPower_electronics().addAll((Collection<? extends Power_electronics>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__RECTIFIER:
				getRectifier().clear();
				getRectifier().addAll((Collection<? extends Rectifier>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__MICROTURBINE:
				getMicroturbine().clear();
				getMicroturbine().addAll((Collection<? extends Microturbine>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__SOLAR:
				getSolar().clear();
				getSolar().addAll((Collection<? extends Solar>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__STUBAUCTION:
				getStubauction().clear();
				getStubauction().addAll((Collection<? extends Stubauction>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__FUSE:
				getFuse().clear();
				getFuse().addAll((Collection<? extends Fuse>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__RELAY:
				getRelay().clear();
				getRelay().addAll((Collection<? extends Relay>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__REGULATOR:
				getRegulator().clear();
				getRegulator().addAll((Collection<? extends Regulator>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__TRANSFORMER:
				getTransformer().clear();
				getTransformer().addAll((Collection<? extends Transformer>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__METER:
				getMeter().clear();
				getMeter().addAll((Collection<? extends Meter>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__GENERATOR:
				getGenerator().clear();
				getGenerator().addAll((Collection<? extends Generator>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__PLC:
				getPlc().clear();
				getPlc().addAll((Collection<? extends Plc>)newValue);
				return;
			case VisGridPackage.CONNECTIONS__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
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
			case VisGridPackage.CONNECTIONS__CSV_READER:
				getCsv_reader().clear();
				return;
			case VisGridPackage.CONNECTIONS__DIESEL_DG:
				getDiesel_dg().clear();
				return;
			case VisGridPackage.CONNECTIONS__ENERGY_STORAGE:
				getEnergy_storage().clear();
				return;
			case VisGridPackage.CONNECTIONS__INVERTER:
				getInverter().clear();
				return;
			case VisGridPackage.CONNECTIONS__DC_DC_CONVERTER:
				getDc_dc_converter().clear();
				return;
			case VisGridPackage.CONNECTIONS__BATTERY:
				getBattery().clear();
				return;
			case VisGridPackage.CONNECTIONS__AUCTION:
				getAuction().clear();
				return;
			case VisGridPackage.CONNECTIONS__CONTROLLER:
				getController().clear();
				return;
			case VisGridPackage.CONNECTIONS__CONTROLLER2:
				getController2().clear();
				return;
			case VisGridPackage.CONNECTIONS__CAPBANK:
				getCapbank().clear();
				return;
			case VisGridPackage.CONNECTIONS__COMM:
				getComm().clear();
				return;
			case VisGridPackage.CONNECTIONS__CAPACITOR:
				getCapacitor().clear();
				return;
			case VisGridPackage.CONNECTIONS__LINE:
				getLine().clear();
				return;
			case VisGridPackage.CONNECTIONS__LINE_SPACING:
				getLine_spacing().clear();
				return;
			case VisGridPackage.CONNECTIONS__OVERHEAD_LINE:
				getOverhead_line().clear();
				return;
			case VisGridPackage.CONNECTIONS__UNDERGROUND_LINE:
				getUnderground_line().clear();
				return;
			case VisGridPackage.CONNECTIONS__OVERHEAD_LINE_CONDUCTOR:
				getOverhead_line_conductor().clear();
				return;
			case VisGridPackage.CONNECTIONS__UNDERGROUND_LINE_CONDUCTOR:
				getUnderground_line_conductor().clear();
				return;
			case VisGridPackage.CONNECTIONS__LINE_CONFIGURATION:
				getLine_configuration().clear();
				return;
			case VisGridPackage.CONNECTIONS__TRANSFORMER_CONFIGURATION:
				getTransformer_configuration().clear();
				return;
			case VisGridPackage.CONNECTIONS__LOAD:
				getLoad().clear();
				return;
			case VisGridPackage.CONNECTIONS__REGULATOR_CONFIGURATION:
				getRegulator_configuration().clear();
				return;
			case VisGridPackage.CONNECTIONS__TRIPLEX_NODE:
				getTriplex_node().clear();
				return;
			case VisGridPackage.CONNECTIONS__TRIPLEX_METER:
				getTriplex_meter().clear();
				return;
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE:
				getTriplex_line().clear();
				return;
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE_CONFIGURATION:
				getTriplex_line_configuration().clear();
				return;
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE_CONDUCTOR:
				getTriplex_line_conductor().clear();
				return;
			case VisGridPackage.CONNECTIONS__SWITCH:
				getSwitch().clear();
				return;
			case VisGridPackage.CONNECTIONS__SUBSTATION:
				getSubstation().clear();
				return;
			case VisGridPackage.CONNECTIONS__PQLOAD:
				getPqload().clear();
				return;
			case VisGridPackage.CONNECTIONS__VOLTDUMP:
				getVoltdump().clear();
				return;
			case VisGridPackage.CONNECTIONS__SERIES_REACTOR:
				getSeries_reactor().clear();
				return;
			case VisGridPackage.CONNECTIONS__RESTORATION:
				getRestoration().clear();
				return;
			case VisGridPackage.CONNECTIONS__FREQUENCY_GEN:
				getFrequency_gen().clear();
				return;
			case VisGridPackage.CONNECTIONS__VOLT_VAR_CONTROL:
				getVolt_var_control().clear();
				return;
			case VisGridPackage.CONNECTIONS__FAULT_CHECK:
				getFault_check().clear();
				return;
			case VisGridPackage.CONNECTIONS__MOTOR:
				getMotor().clear();
				return;
			case VisGridPackage.CONNECTIONS__BILLDUMP:
				getBilldump().clear();
				return;
			case VisGridPackage.CONNECTIONS__RESIDENTIAL_ENDUSE:
				getResidential_enduse().clear();
				return;
			case VisGridPackage.CONNECTIONS__HOUSE_A:
				getHouse_a().clear();
				return;
			case VisGridPackage.CONNECTIONS__HOUSE:
				getHouse().clear();
				return;
			case VisGridPackage.CONNECTIONS__WATERHEATER:
				getWaterheater().clear();
				return;
			case VisGridPackage.CONNECTIONS__LIGHTS:
				getLights().clear();
				return;
			case VisGridPackage.CONNECTIONS__REFRIGERATOR:
				getRefrigerator().clear();
				return;
			case VisGridPackage.CONNECTIONS__CLOTHESWASHER:
				getClotheswasher().clear();
				return;
			case VisGridPackage.CONNECTIONS__DISHWASHER:
				getDishwasher().clear();
				return;
			case VisGridPackage.CONNECTIONS__OCCUPANTLOAD:
				getOccupantload().clear();
				return;
			case VisGridPackage.CONNECTIONS__PLUGLOAD:
				getPlugload().clear();
				return;
			case VisGridPackage.CONNECTIONS__MICROWAVE:
				getMicrowave().clear();
				return;
			case VisGridPackage.CONNECTIONS__RANGE:
				getRange().clear();
				return;
			case VisGridPackage.CONNECTIONS__FREEZER:
				getFreezer().clear();
				return;
			case VisGridPackage.CONNECTIONS__DRYER:
				getDryer().clear();
				return;
			case VisGridPackage.CONNECTIONS__EVCHARGER:
				getEvcharger().clear();
				return;
			case VisGridPackage.CONNECTIONS__ZI_PLOAD:
				getZIPload().clear();
				return;
			case VisGridPackage.CONNECTIONS__PLAYER:
				getPlayer().clear();
				return;
			case VisGridPackage.CONNECTIONS__SHAPER:
				getShaper().clear();
				return;
			case VisGridPackage.CONNECTIONS__RECORDER:
				getRecorder().clear();
				return;
			case VisGridPackage.CONNECTIONS__COLLECTOR:
				getCollector().clear();
				return;
			case VisGridPackage.CONNECTIONS__HISTOGRAM:
				getHistogram().clear();
				return;
			case VisGridPackage.CONNECTIONS__CLIMATE:
				getClimate().clear();
				return;
			case VisGridPackage.CONNECTIONS__WEATHER:
				getWeather().clear();
				return;
			case VisGridPackage.CONNECTIONS__OFFICE:
				getOffice().clear();
				return;
			case VisGridPackage.CONNECTIONS__MULTIZONE:
				getMultizone().clear();
				return;
			case VisGridPackage.CONNECTIONS__WINDTURB_DG:
				getWindturb_dg().clear();
				return;
			case VisGridPackage.CONNECTIONS__POWER_ELECTRONICS:
				getPower_electronics().clear();
				return;
			case VisGridPackage.CONNECTIONS__RECTIFIER:
				getRectifier().clear();
				return;
			case VisGridPackage.CONNECTIONS__MICROTURBINE:
				getMicroturbine().clear();
				return;
			case VisGridPackage.CONNECTIONS__SOLAR:
				getSolar().clear();
				return;
			case VisGridPackage.CONNECTIONS__STUBAUCTION:
				getStubauction().clear();
				return;
			case VisGridPackage.CONNECTIONS__LINK:
				getLink().clear();
				return;
			case VisGridPackage.CONNECTIONS__FUSE:
				getFuse().clear();
				return;
			case VisGridPackage.CONNECTIONS__RELAY:
				getRelay().clear();
				return;
			case VisGridPackage.CONNECTIONS__REGULATOR:
				getRegulator().clear();
				return;
			case VisGridPackage.CONNECTIONS__TRANSFORMER:
				getTransformer().clear();
				return;
			case VisGridPackage.CONNECTIONS__METER:
				getMeter().clear();
				return;
			case VisGridPackage.CONNECTIONS__GENERATOR:
				getGenerator().clear();
				return;
			case VisGridPackage.CONNECTIONS__PLC:
				getPlc().clear();
				return;
			case VisGridPackage.CONNECTIONS__NODE:
				getNode().clear();
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
			case VisGridPackage.CONNECTIONS__CSV_READER:
				return csv_reader != null && !csv_reader.isEmpty();
			case VisGridPackage.CONNECTIONS__DIESEL_DG:
				return diesel_dg != null && !diesel_dg.isEmpty();
			case VisGridPackage.CONNECTIONS__ENERGY_STORAGE:
				return energy_storage != null && !energy_storage.isEmpty();
			case VisGridPackage.CONNECTIONS__INVERTER:
				return inverter != null && !inverter.isEmpty();
			case VisGridPackage.CONNECTIONS__DC_DC_CONVERTER:
				return dc_dc_converter != null && !dc_dc_converter.isEmpty();
			case VisGridPackage.CONNECTIONS__BATTERY:
				return battery != null && !battery.isEmpty();
			case VisGridPackage.CONNECTIONS__AUCTION:
				return auction != null && !auction.isEmpty();
			case VisGridPackage.CONNECTIONS__CONTROLLER:
				return controller != null && !controller.isEmpty();
			case VisGridPackage.CONNECTIONS__CONTROLLER2:
				return controller2 != null && !controller2.isEmpty();
			case VisGridPackage.CONNECTIONS__CAPBANK:
				return capbank != null && !capbank.isEmpty();
			case VisGridPackage.CONNECTIONS__COMM:
				return comm != null && !comm.isEmpty();
			case VisGridPackage.CONNECTIONS__CAPACITOR:
				return capacitor != null && !capacitor.isEmpty();
			case VisGridPackage.CONNECTIONS__LINE:
				return line != null && !line.isEmpty();
			case VisGridPackage.CONNECTIONS__LINE_SPACING:
				return line_spacing != null && !line_spacing.isEmpty();
			case VisGridPackage.CONNECTIONS__OVERHEAD_LINE:
				return overhead_line != null && !overhead_line.isEmpty();
			case VisGridPackage.CONNECTIONS__UNDERGROUND_LINE:
				return underground_line != null && !underground_line.isEmpty();
			case VisGridPackage.CONNECTIONS__OVERHEAD_LINE_CONDUCTOR:
				return overhead_line_conductor != null && !overhead_line_conductor.isEmpty();
			case VisGridPackage.CONNECTIONS__UNDERGROUND_LINE_CONDUCTOR:
				return underground_line_conductor != null && !underground_line_conductor.isEmpty();
			case VisGridPackage.CONNECTIONS__LINE_CONFIGURATION:
				return line_configuration != null && !line_configuration.isEmpty();
			case VisGridPackage.CONNECTIONS__TRANSFORMER_CONFIGURATION:
				return transformer_configuration != null && !transformer_configuration.isEmpty();
			case VisGridPackage.CONNECTIONS__LOAD:
				return load != null && !load.isEmpty();
			case VisGridPackage.CONNECTIONS__REGULATOR_CONFIGURATION:
				return regulator_configuration != null && !regulator_configuration.isEmpty();
			case VisGridPackage.CONNECTIONS__TRIPLEX_NODE:
				return triplex_node != null && !triplex_node.isEmpty();
			case VisGridPackage.CONNECTIONS__TRIPLEX_METER:
				return triplex_meter != null && !triplex_meter.isEmpty();
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE:
				return triplex_line != null && !triplex_line.isEmpty();
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE_CONFIGURATION:
				return triplex_line_configuration != null && !triplex_line_configuration.isEmpty();
			case VisGridPackage.CONNECTIONS__TRIPLEX_LINE_CONDUCTOR:
				return triplex_line_conductor != null && !triplex_line_conductor.isEmpty();
			case VisGridPackage.CONNECTIONS__SWITCH:
				return switch_ != null && !switch_.isEmpty();
			case VisGridPackage.CONNECTIONS__SUBSTATION:
				return substation != null && !substation.isEmpty();
			case VisGridPackage.CONNECTIONS__PQLOAD:
				return pqload != null && !pqload.isEmpty();
			case VisGridPackage.CONNECTIONS__VOLTDUMP:
				return voltdump != null && !voltdump.isEmpty();
			case VisGridPackage.CONNECTIONS__SERIES_REACTOR:
				return series_reactor != null && !series_reactor.isEmpty();
			case VisGridPackage.CONNECTIONS__RESTORATION:
				return restoration != null && !restoration.isEmpty();
			case VisGridPackage.CONNECTIONS__FREQUENCY_GEN:
				return frequency_gen != null && !frequency_gen.isEmpty();
			case VisGridPackage.CONNECTIONS__VOLT_VAR_CONTROL:
				return volt_var_control != null && !volt_var_control.isEmpty();
			case VisGridPackage.CONNECTIONS__FAULT_CHECK:
				return fault_check != null && !fault_check.isEmpty();
			case VisGridPackage.CONNECTIONS__MOTOR:
				return motor != null && !motor.isEmpty();
			case VisGridPackage.CONNECTIONS__BILLDUMP:
				return billdump != null && !billdump.isEmpty();
			case VisGridPackage.CONNECTIONS__RESIDENTIAL_ENDUSE:
				return residential_enduse != null && !residential_enduse.isEmpty();
			case VisGridPackage.CONNECTIONS__HOUSE_A:
				return house_a != null && !house_a.isEmpty();
			case VisGridPackage.CONNECTIONS__HOUSE:
				return house != null && !house.isEmpty();
			case VisGridPackage.CONNECTIONS__WATERHEATER:
				return waterheater != null && !waterheater.isEmpty();
			case VisGridPackage.CONNECTIONS__LIGHTS:
				return lights != null && !lights.isEmpty();
			case VisGridPackage.CONNECTIONS__REFRIGERATOR:
				return refrigerator != null && !refrigerator.isEmpty();
			case VisGridPackage.CONNECTIONS__CLOTHESWASHER:
				return clotheswasher != null && !clotheswasher.isEmpty();
			case VisGridPackage.CONNECTIONS__DISHWASHER:
				return dishwasher != null && !dishwasher.isEmpty();
			case VisGridPackage.CONNECTIONS__OCCUPANTLOAD:
				return occupantload != null && !occupantload.isEmpty();
			case VisGridPackage.CONNECTIONS__PLUGLOAD:
				return plugload != null && !plugload.isEmpty();
			case VisGridPackage.CONNECTIONS__MICROWAVE:
				return microwave != null && !microwave.isEmpty();
			case VisGridPackage.CONNECTIONS__RANGE:
				return range != null && !range.isEmpty();
			case VisGridPackage.CONNECTIONS__FREEZER:
				return freezer != null && !freezer.isEmpty();
			case VisGridPackage.CONNECTIONS__DRYER:
				return dryer != null && !dryer.isEmpty();
			case VisGridPackage.CONNECTIONS__EVCHARGER:
				return evcharger != null && !evcharger.isEmpty();
			case VisGridPackage.CONNECTIONS__ZI_PLOAD:
				return ziPload != null && !ziPload.isEmpty();
			case VisGridPackage.CONNECTIONS__PLAYER:
				return player != null && !player.isEmpty();
			case VisGridPackage.CONNECTIONS__SHAPER:
				return shaper != null && !shaper.isEmpty();
			case VisGridPackage.CONNECTIONS__RECORDER:
				return recorder != null && !recorder.isEmpty();
			case VisGridPackage.CONNECTIONS__COLLECTOR:
				return collector != null && !collector.isEmpty();
			case VisGridPackage.CONNECTIONS__HISTOGRAM:
				return histogram != null && !histogram.isEmpty();
			case VisGridPackage.CONNECTIONS__CLIMATE:
				return climate != null && !climate.isEmpty();
			case VisGridPackage.CONNECTIONS__WEATHER:
				return weather != null && !weather.isEmpty();
			case VisGridPackage.CONNECTIONS__OFFICE:
				return office != null && !office.isEmpty();
			case VisGridPackage.CONNECTIONS__MULTIZONE:
				return multizone != null && !multizone.isEmpty();
			case VisGridPackage.CONNECTIONS__WINDTURB_DG:
				return windturb_dg != null && !windturb_dg.isEmpty();
			case VisGridPackage.CONNECTIONS__POWER_ELECTRONICS:
				return power_electronics != null && !power_electronics.isEmpty();
			case VisGridPackage.CONNECTIONS__RECTIFIER:
				return rectifier != null && !rectifier.isEmpty();
			case VisGridPackage.CONNECTIONS__MICROTURBINE:
				return microturbine != null && !microturbine.isEmpty();
			case VisGridPackage.CONNECTIONS__SOLAR:
				return solar != null && !solar.isEmpty();
			case VisGridPackage.CONNECTIONS__STUBAUCTION:
				return stubauction != null && !stubauction.isEmpty();
			case VisGridPackage.CONNECTIONS__LINK:
				return link != null && !link.isEmpty();
			case VisGridPackage.CONNECTIONS__FUSE:
				return fuse != null && !fuse.isEmpty();
			case VisGridPackage.CONNECTIONS__RELAY:
				return relay != null && !relay.isEmpty();
			case VisGridPackage.CONNECTIONS__REGULATOR:
				return regulator != null && !regulator.isEmpty();
			case VisGridPackage.CONNECTIONS__TRANSFORMER:
				return transformer != null && !transformer.isEmpty();
			case VisGridPackage.CONNECTIONS__METER:
				return meter != null && !meter.isEmpty();
			case VisGridPackage.CONNECTIONS__GENERATOR:
				return generator != null && !generator.isEmpty();
			case VisGridPackage.CONNECTIONS__PLC:
				return plc != null && !plc.isEmpty();
			case VisGridPackage.CONNECTIONS__NODE:
				return node != null && !node.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionsImpl
