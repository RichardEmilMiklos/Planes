/**
 */
package planes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import planes.Bird;
import planes.Field;
import planes.Grid;
import planes.Plane;
import planes.PlanesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link planes.impl.GridImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link planes.impl.GridImpl#getBird <em>Bird</em>}</li>
 *   <li>{@link planes.impl.GridImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridImpl extends MinimalEObjectImpl.Container implements Grid {
	/**
	 * The cached value of the '{@link #getPlane() <em>Plane</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlane()
	 * @generated
	 * @ordered
	 */
	protected EList<Plane> plane;

	/**
	 * The cached value of the '{@link #getBird() <em>Bird</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBird()
	 * @generated
	 * @ordered
	 */
	protected EList<Bird> bird;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanesPackage.Literals.GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plane> getPlane() {
		if (plane == null) {
			plane = new EObjectContainmentEList<Plane>(Plane.class, this, PlanesPackage.GRID__PLANE);
		}
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bird> getBird() {
		if (bird == null) {
			bird = new EObjectContainmentEList<Bird>(Bird.class, this, PlanesPackage.GRID__BIRD);
		}
		return bird;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<Field>(Field.class, this, PlanesPackage.GRID__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanesPackage.GRID__PLANE:
				return ((InternalEList<?>)getPlane()).basicRemove(otherEnd, msgs);
			case PlanesPackage.GRID__BIRD:
				return ((InternalEList<?>)getBird()).basicRemove(otherEnd, msgs);
			case PlanesPackage.GRID__FIELD:
				return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
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
			case PlanesPackage.GRID__PLANE:
				return getPlane();
			case PlanesPackage.GRID__BIRD:
				return getBird();
			case PlanesPackage.GRID__FIELD:
				return getField();
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
			case PlanesPackage.GRID__PLANE:
				getPlane().clear();
				getPlane().addAll((Collection<? extends Plane>)newValue);
				return;
			case PlanesPackage.GRID__BIRD:
				getBird().clear();
				getBird().addAll((Collection<? extends Bird>)newValue);
				return;
			case PlanesPackage.GRID__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends Field>)newValue);
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
			case PlanesPackage.GRID__PLANE:
				getPlane().clear();
				return;
			case PlanesPackage.GRID__BIRD:
				getBird().clear();
				return;
			case PlanesPackage.GRID__FIELD:
				getField().clear();
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
			case PlanesPackage.GRID__PLANE:
				return plane != null && !plane.isEmpty();
			case PlanesPackage.GRID__BIRD:
				return bird != null && !bird.isEmpty();
			case PlanesPackage.GRID__FIELD:
				return field != null && !field.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GridImpl
