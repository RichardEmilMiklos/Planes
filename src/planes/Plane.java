/**
 */
package planes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link planes.Plane#getId <em>Id</em>}</li>
 *   <li>{@link planes.Plane#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see planes.PlanesPackage#getPlane()
 * @model
 * @generated
 */
public interface Plane extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see planes.PlanesPackage#getPlane_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link planes.Plane#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link planes.Field#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see planes.PlanesPackage#getPlane_Field()
	 * @see planes.Field#getPlane
	 * @model opposite="plane" required="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link planes.Plane#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // Plane
