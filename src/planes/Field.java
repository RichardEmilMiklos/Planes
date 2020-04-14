/**
 */
package planes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link planes.Field#getName <em>Name</em>}</li>
 *   <li>{@link planes.Field#getNeighbour <em>Neighbour</em>}</li>
 *   <li>{@link planes.Field#getFlyingObject <em>Flying Object</em>}</li>
 * </ul>
 *
 * @see planes.PlanesPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see planes.PlanesPackage#getField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link planes.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Neighbour</b></em>' reference list.
	 * The list contents are of type {@link planes.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbour</em>' reference list.
	 * @see planes.PlanesPackage#getField_Neighbour()
	 * @model
	 * @generated
	 */
	EList<Field> getNeighbour();

	/**
	 * Returns the value of the '<em><b>Flying Object</b></em>' reference list.
	 * The list contents are of type {@link planes.FlyingObject}.
	 * It is bidirectional and its opposite is '{@link planes.FlyingObject#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flying Object</em>' reference list.
	 * @see planes.PlanesPackage#getField_FlyingObject()
	 * @see planes.FlyingObject#getField
	 * @model opposite="field"
	 * @generated
	 */
	EList<FlyingObject> getFlyingObject();

} // Field
