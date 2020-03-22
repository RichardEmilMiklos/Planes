/**
 */
package planes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link planes.Grid#getField <em>Field</em>}</li>
 *   <li>{@link planes.Grid#getPlane <em>Plane</em>}</li>
 *   <li>{@link planes.Grid#getBird <em>Bird</em>}</li>
 * </ul>
 *
 * @see planes.PlanesPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link planes.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see planes.PlanesPackage#getGrid_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

	/**
	 * Returns the value of the '<em><b>Bird</b></em>' containment reference list.
	 * The list contents are of type {@link planes.Bird}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bird</em>' containment reference list.
	 * @see planes.PlanesPackage#getGrid_Bird()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bird> getBird();

	/**
	 * Returns the value of the '<em><b>Plane</b></em>' containment reference list.
	 * The list contents are of type {@link planes.Plane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane</em>' containment reference list.
	 * @see planes.PlanesPackage#getGrid_Plane()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plane> getPlane();

} // Grid
