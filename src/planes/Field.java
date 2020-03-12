/**
 */
package planes;

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
 *   <li>{@link planes.Field#getPlane <em>Plane</em>}</li>
 *   <li>{@link planes.Field#getBird <em>Bird</em>}</li>
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
	 * Returns the value of the '<em><b>Plane</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link planes.Plane#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane</em>' reference.
	 * @see #setPlane(Plane)
	 * @see planes.PlanesPackage#getField_Plane()
	 * @see planes.Plane#getField
	 * @model opposite="field"
	 * @generated
	 */
	Plane getPlane();

	/**
	 * Sets the value of the '{@link planes.Field#getPlane <em>Plane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane</em>' reference.
	 * @see #getPlane()
	 * @generated
	 */
	void setPlane(Plane value);

	/**
	 * Returns the value of the '<em><b>Bird</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link planes.Bird#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bird</em>' reference.
	 * @see #setBird(Bird)
	 * @see planes.PlanesPackage#getField_Bird()
	 * @see planes.Bird#getField
	 * @model opposite="field"
	 * @generated
	 */
	Bird getBird();

	/**
	 * Sets the value of the '{@link planes.Field#getBird <em>Bird</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bird</em>' reference.
	 * @see #getBird()
	 * @generated
	 */
	void setBird(Bird value);

} // Field
