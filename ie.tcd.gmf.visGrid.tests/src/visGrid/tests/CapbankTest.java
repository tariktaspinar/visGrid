/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.tests;

import junit.textui.TestRunner;

import visGrid.Capbank;
import visGrid.VisGridFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Capbank</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapbankTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CapbankTest.class);
	}

	/**
	 * Constructs a new Capbank test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapbankTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Capbank test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Capbank getFixture() {
		return (Capbank)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VisGridFactory.eINSTANCE.createCapbank());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CapbankTest
