/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.tests;

import junit.textui.TestRunner;

import visGrid.Collector;
import visGrid.VisGridFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectorTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollectorTest.class);
	}

	/**
	 * Constructs a new Collector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Collector getFixture() {
		return (Collector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VisGridFactory.eINSTANCE.createCollector());
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

} //CollectorTest
