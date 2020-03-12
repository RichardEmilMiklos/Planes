/**
 */
package planes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import planes.Bird;
import planes.Field;
import planes.Plane;
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
 *   <li>{@link planes.impl.FieldImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link planes.impl.FieldImpl#getBird <em>Bird</em>}</li>
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
	 * The cached value of the '{@link #getPlane() <em>Plane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlane()
	 * @generated
	 * @ordered
	 */
	protected Plane plane;

	/**
	 * The cached value of the '{@link #getBird() <em>Bird</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBird()
	 * @generated
	 * @ordered
	 */
	protected Bird bird;

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
	public Plane getPlane() {
		if (plane != null && plane.eIsProxy()) {
			InternalEObject oldPlane = (InternalEObject)plane;
			plane = (Plane)eResolveProxy(oldPlane);
			if (plane != oldPlane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanesPackage.FIELD__PLANE, oldPlane, plane));
			}
		}
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plane basicGetPlane() {
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlane(Plane newPlane, NotificationChain msgs) {
		Plane oldPlane = plane;
		plane = newPlane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanesPackage.FIELD__PLANE, oldPlane, newPlane);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlane(Plane newPlane) {
		if (newPlane != plane) {
			NotificationChain msgs = null;
			if (plane != null)
				msgs = ((InternalEObject)plane).eInverseRemove(this, PlanesPackage.PLANE__FIELD, Plane.class, msgs);
			if (newPlane != null)
				msgs = ((InternalEObject)newPlane).eInverseAdd(this, PlanesPackage.PLANE__FIELD, Plane.class, msgs);
			msgs = basicSetPlane(newPlane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanesPackage.FIELD__PLANE, newPlane, newPlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bird getBird() {
		if (bird != null && bird.eIsProxy()) {
			InternalEObject oldBird = (InternalEObject)bird;
			bird = (Bird)eResolveProxy(oldBird);
			if (bird != oldBird) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanesPackage.FIELD__BIRD, oldBird, bird));
			}
		}
		return bird;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bird basicGetBird() {
		return bird;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBird(Bird newBird, NotificationChain msgs) {
		Bird oldBird = bird;
		bird = newBird;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanesPackage.FIELD__BIRD, oldBird, newBird);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBird(Bird newBird) {
		if (newBird != bird) {
			NotificationChain msgs = null;
			if (bird != null)
				msgs = ((InternalEObject)bird).eInverseRemove(this, PlanesPackage.BIRD__FIELD, Bird.class, msgs);
			if (newBird != null)
				msgs = ((InternalEObject)newBird).eInverseAdd(this, PlanesPackage.BIRD__FIELD, Bird.class, msgs);
			msgs = basicSetBird(newBird, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanesPackage.FIELD__BIRD, newBird, newBird));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanesPackage.FIELD__PLANE:
				if (plane != null)
					msgs = ((InternalEObject)plane).eInverseRemove(this, PlanesPackage.PLANE__FIELD, Plane.class, msgs);
				return basicSetPlane((Plane)otherEnd, msgs);
			case PlanesPackage.FIELD__BIRD:
				if (bird != null)
					msgs = ((InternalEObject)bird).eInverseRemove(this, PlanesPackage.BIRD__FIELD, Bird.class, msgs);
				return basicSetBird((Bird)otherEnd, msgs);
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
			case PlanesPackage.FIELD__PLANE:
				return basicSetPlane(null, msgs);
			case PlanesPackage.FIELD__BIRD:
				return basicSetBird(null, msgs);
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
			case PlanesPackage.FIELD__PLANE:
				if (resolve) return getPlane();
				return basicGetPlane();
			case PlanesPackage.FIELD__BIRD:
				if (resolve) return getBird();
				return basicGetBird();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlanesPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case PlanesPackage.FIELD__PLANE:
				setPlane((Plane)newValue);
				return;
			case PlanesPackage.FIELD__BIRD:
				setBird((Bird)newValue);
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
			case PlanesPackage.FIELD__PLANE:
				setPlane((Plane)null);
				return;
			case PlanesPackage.FIELD__BIRD:
				setBird((Bird)null);
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
			case PlanesPackage.FIELD__PLANE:
				return plane != null;
			case PlanesPackage.FIELD__BIRD:
				return bird != null;
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
