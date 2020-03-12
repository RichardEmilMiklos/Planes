/**
 */
package planes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see planes.PlanesFactory
 * @model kind="package"
 * @generated
 */
public interface PlanesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "planes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://planes/planes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "plns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlanesPackage eINSTANCE = planes.impl.PlanesPackageImpl.init();

	/**
	 * The meta object id for the '{@link planes.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see planes.impl.GridImpl
	 * @see planes.impl.PlanesPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 0;

	/**
	 * The feature id for the '<em><b>Plane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__PLANE = 0;

	/**
	 * The feature id for the '<em><b>Bird</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__BIRD = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__FIELD = 2;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link planes.impl.PlaneImpl <em>Plane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see planes.impl.PlaneImpl
	 * @see planes.impl.PlanesPackageImpl#getPlane()
	 * @generated
	 */
	int PLANE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__ID = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__FIELD = 1;

	/**
	 * The number of structural features of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link planes.impl.BirdImpl <em>Bird</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see planes.impl.BirdImpl
	 * @see planes.impl.PlanesPackageImpl#getBird()
	 * @generated
	 */
	int BIRD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD__ID = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD__FIELD = 1;

	/**
	 * The number of structural features of the '<em>Bird</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bird</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link planes.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see planes.impl.FieldImpl
	 * @see planes.impl.PlanesPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Plane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PLANE = 1;

	/**
	 * The feature id for the '<em><b>Bird</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__BIRD = 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link planes.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see planes.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link planes.Grid#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plane</em>'.
	 * @see planes.Grid#getPlane()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Plane();

	/**
	 * Returns the meta object for the containment reference list '{@link planes.Grid#getBird <em>Bird</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bird</em>'.
	 * @see planes.Grid#getBird()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Bird();

	/**
	 * Returns the meta object for the containment reference list '{@link planes.Grid#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see planes.Grid#getField()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Field();

	/**
	 * Returns the meta object for class '{@link planes.Plane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plane</em>'.
	 * @see planes.Plane
	 * @generated
	 */
	EClass getPlane();

	/**
	 * Returns the meta object for the attribute '{@link planes.Plane#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see planes.Plane#getId()
	 * @see #getPlane()
	 * @generated
	 */
	EAttribute getPlane_Id();

	/**
	 * Returns the meta object for the reference '{@link planes.Plane#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see planes.Plane#getField()
	 * @see #getPlane()
	 * @generated
	 */
	EReference getPlane_Field();

	/**
	 * Returns the meta object for class '{@link planes.Bird <em>Bird</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bird</em>'.
	 * @see planes.Bird
	 * @generated
	 */
	EClass getBird();

	/**
	 * Returns the meta object for the attribute '{@link planes.Bird#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see planes.Bird#getId()
	 * @see #getBird()
	 * @generated
	 */
	EAttribute getBird_Id();

	/**
	 * Returns the meta object for the reference '{@link planes.Bird#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see planes.Bird#getField()
	 * @see #getBird()
	 * @generated
	 */
	EReference getBird_Field();

	/**
	 * Returns the meta object for class '{@link planes.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see planes.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link planes.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see planes.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the reference '{@link planes.Field#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plane</em>'.
	 * @see planes.Field#getPlane()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Plane();

	/**
	 * Returns the meta object for the reference '{@link planes.Field#getBird <em>Bird</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bird</em>'.
	 * @see planes.Field#getBird()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Bird();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlanesFactory getPlanesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link planes.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see planes.impl.GridImpl
		 * @see planes.impl.PlanesPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Plane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__PLANE = eINSTANCE.getGrid_Plane();

		/**
		 * The meta object literal for the '<em><b>Bird</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__BIRD = eINSTANCE.getGrid_Bird();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__FIELD = eINSTANCE.getGrid_Field();

		/**
		 * The meta object literal for the '{@link planes.impl.PlaneImpl <em>Plane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see planes.impl.PlaneImpl
		 * @see planes.impl.PlanesPackageImpl#getPlane()
		 * @generated
		 */
		EClass PLANE = eINSTANCE.getPlane();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE__ID = eINSTANCE.getPlane_Id();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANE__FIELD = eINSTANCE.getPlane_Field();

		/**
		 * The meta object literal for the '{@link planes.impl.BirdImpl <em>Bird</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see planes.impl.BirdImpl
		 * @see planes.impl.PlanesPackageImpl#getBird()
		 * @generated
		 */
		EClass BIRD = eINSTANCE.getBird();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIRD__ID = eINSTANCE.getBird_Id();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIRD__FIELD = eINSTANCE.getBird_Field();

		/**
		 * The meta object literal for the '{@link planes.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see planes.impl.FieldImpl
		 * @see planes.impl.PlanesPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Plane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__PLANE = eINSTANCE.getField_Plane();

		/**
		 * The meta object literal for the '<em><b>Bird</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__BIRD = eINSTANCE.getField_Bird();

	}

} //PlanesPackage
