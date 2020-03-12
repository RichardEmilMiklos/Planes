/**
 */
package planes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bird</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link planes.Bird#getId <em>Id</em>}</li>
 *   <li>{@link planes.Bird#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see planes.PlanesPackage#getBird()
 * @model
 * @generated
 */
public interface Bird extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see planes.PlanesPackage#getBird_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link planes.Bird#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link planes.Field#getBird <em>Bird</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see planes.PlanesPackage#getBird_Field()
	 * @see planes.Field#getBird
	 * @model opposite="bird" required="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link planes.Bird#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // Bird
