/**
 */
package planes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import planes.Field;
import planes.FlyingObject;
import planes.PlanesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link planes.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link planes.impl.FieldImpl#getNeighbour <em>Neighbour</em>}</li>
 *   <li>{@link planes.impl.FieldImpl#getFlyingObject <em>Flying Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNeighbour() <em>Neighbour</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbour()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> neighbour;

	/**
	 * The cached value of the '{@link #getFlyingObject() <em>Flying Object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlyingObject()
	 * @generated
	 * @ordered
	 */
	protected EList<FlyingObject> flyingObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanesPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanesPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getNeighbour() {
		if (neighbour == null) {
			neighbour = new EObjectResolvingEList<Field>(Field.class, this, PlanesPackage.FIELD__NEIGHBOUR);
		}
		return neighbour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlyingObject> getFlyingObject() {
		if (flyingObject == null) {
			flyingObject = new EObjectWithInverseResolvingEList<FlyingObject>(FlyingObject.class, this, PlanesPackage.FIELD__FLYING_OBJECT, PlanesPackage.FLYING_OBJECT__FIELD);
		}
		return flyingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanesPackage.FIELD__FLYING_OBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlyingObject()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanesPackage.FIELD__FLYING_OBJECT:
				return ((InternalEList<?>)getFlyingObject()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlanesPackage.FIELD__NAME:
				return getName();
			case PlanesPackage.FIELD__NEIGHBOUR:
				return getNeighbour();
			case PlanesPackage.FIELD__FLYING_OBJECT:
				return getFlyingObject();
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
			case PlanesPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case PlanesPackage.FIELD__NEIGHBOUR:
				getNeighbour().clear();
				getNeighbour().addAll((Collection<? extends Field>)newValue);
				return;
			case PlanesPackage.FIELD__FLYING_OBJECT:
				getFlyingObject().clear();
				getFlyingObject().addAll((Collection<? extends FlyingObject>)newValue);
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
			case PlanesPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PlanesPackage.FIELD__NEIGHBOUR:
				getNeighbour().clear();
				return;
			case PlanesPackage.FIELD__FLYING_OBJECT:
				getFlyingObject().clear();
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
			case PlanesPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PlanesPackage.FIELD__NEIGHBOUR:
				return neighbour != null && !neighbour.isEmpty();
			case PlanesPackage.FIELD__FLYING_OBJECT:
				return flyingObject != null && !flyingObject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
