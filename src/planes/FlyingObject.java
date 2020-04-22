/**
 */
package planes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flying Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link planes.FlyingObject#getId <em>Id</em>}</li>
 *   <li>{@link planes.FlyingObject#getProximity <em>Proximity</em>}</li>
 *   <li>{@link planes.FlyingObject#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see planes.PlanesPackage#getFlyingObject()
 * @model
 * @generated
 */
public interface FlyingObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see planes.PlanesPackage#getFlyingObject_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link planes.FlyingObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Proximity</b></em>' reference list.
	 * The list contents are of type {@link planes.FlyingObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proximity</em>' reference list.
	 * @see planes.PlanesPackage#getFlyingObject_Proximity()
	 * @model
	 * @generated
	 */
	EList<FlyingObject> getProximity();

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link planes.Field#getFlyingObject <em>Flying Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see planes.PlanesPackage#getFlyingObject_Field()
	 * @see planes.Field#getFlyingObject
	 * @model opposite="flyingObject"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link planes.FlyingObject#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // FlyingObject
