/**
 *  Copyright (c) 2011 Atos Origin.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Atos Origin - Initial API and implementation
 * 
 */
package org.eclipse.emf.compare.sysml.sysmldiff.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.diff.merge.IMerger;
import org.eclipse.emf.compare.diff.metamodel.AbstractDiffExtension;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.DiffPackage;
import org.eclipse.emf.compare.diff.metamodel.impl.AttributeChangeLeftTargetImpl;
import org.eclipse.emf.compare.sysml.sysmldiff.SysMLStereotypeAttributeChange;
import org.eclipse.emf.compare.sysml.sysmldiff.SysMLStereotypePropertyChangeLeftTarget;
import org.eclipse.emf.compare.sysml.sysmldiff.SysMLdiffPackage;
import org.eclipse.emf.compare.uml2diff.UML2DiffPackage;
import org.eclipse.emf.compare.uml2diff.UMLDiffExtension;
import org.eclipse.emf.compare.uml2diff.UMLStereotypePropertyChange;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Stereotype;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Sys ML Stereotype Property Change Left Target</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.compare.sysml.sysmldiff.impl.SysMLStereotypePropertyChangeLeftTargetImpl#getHideElements
 * <em>Hide Elements</em>}</li>
 * <li>
 * {@link org.eclipse.emf.compare.sysml.sysmldiff.impl.SysMLStereotypePropertyChangeLeftTargetImpl#isIsCollapsed
 * <em>Is Collapsed</em>}</li>
 * <li>
 * {@link org.eclipse.emf.compare.sysml.sysmldiff.impl.SysMLStereotypePropertyChangeLeftTargetImpl#getStereotype
 * <em>Stereotype</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SysMLStereotypePropertyChangeLeftTargetImpl extends AttributeChangeLeftTargetImpl implements SysMLStereotypePropertyChangeLeftTarget {
	/**
	 * The cached value of the '{@link #getHideElements() <em>Hide Elements</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHideElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffElement> hideElements;

	/**
	 * The default value of the '{@link #isIsCollapsed() <em>Is Collapsed</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isIsCollapsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLAPSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCollapsed() <em>Is Collapsed</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #isIsCollapsed()
	 * @generated
	 * @ordered
	 */
	protected boolean isCollapsed = IS_COLLAPSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected Stereotype stereotype;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SysMLStereotypePropertyChangeLeftTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLdiffPackage.Literals.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DiffElement> getHideElements() {
		if (hideElements == null) {
			hideElements = new EObjectWithInverseResolvingEList.ManyInverse<DiffElement>(DiffElement.class,
					this, SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__HIDE_ELEMENTS,
					DiffPackage.DIFF_ELEMENT__IS_HIDDEN_BY);
		}
		return hideElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isIsCollapsed() {
		return isCollapsed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIsCollapsed(boolean newIsCollapsed) {
		boolean oldIsCollapsed = isCollapsed;
		isCollapsed = newIsCollapsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__IS_COLLAPSED,
					oldIsCollapsed, isCollapsed));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Stereotype getStereotype() {
		if (stereotype != null && stereotype.eIsProxy()) {
			InternalEObject oldStereotype = (InternalEObject)stereotype;
			stereotype = (Stereotype)eResolveProxy(oldStereotype);
			if (stereotype != oldStereotype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__STEREOTYPE,
							oldStereotype, stereotype));
			}
		}
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Stereotype basicGetStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStereotype(Stereotype newStereotype) {
		Stereotype oldStereotype = stereotype;
		stereotype = newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__STEREOTYPE,
					oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void visit(DiffModel diffModel) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public String getText() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public Object getImage() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public IMerger provideMerger() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__HIDE_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHideElements()).basicAdd(
						otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__HIDE_ELEMENTS:
				return ((InternalEList<?>)getHideElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__HIDE_ELEMENTS:
				return getHideElements();
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__IS_COLLAPSED:
				return isIsCollapsed();
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__STEREOTYPE:
				if (resolve)
					return getStereotype();
				return basicGetStereotype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__HIDE_ELEMENTS:
				getHideElements().clear();
				getHideElements().addAll((Collection<? extends DiffElement>)newValue);
				return;
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__IS_COLLAPSED:
				setIsCollapsed((Boolean)newValue);
				return;
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__STEREOTYPE:
				setStereotype((Stereotype)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__HIDE_ELEMENTS:
				getHideElements().clear();
				return;
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__IS_COLLAPSED:
				setIsCollapsed(IS_COLLAPSED_EDEFAULT);
				return;
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__STEREOTYPE:
				setStereotype((Stereotype)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__HIDE_ELEMENTS:
				return hideElements != null && !hideElements.isEmpty();
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__IS_COLLAPSED:
				return isCollapsed != IS_COLLAPSED_EDEFAULT;
			case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__STEREOTYPE:
				return stereotype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractDiffExtension.class) {
			switch (derivedFeatureID) {
				case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__HIDE_ELEMENTS:
					return DiffPackage.ABSTRACT_DIFF_EXTENSION__HIDE_ELEMENTS;
				case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__IS_COLLAPSED:
					return DiffPackage.ABSTRACT_DIFF_EXTENSION__IS_COLLAPSED;
				default:
					return -1;
			}
		}
		if (baseClass == UMLDiffExtension.class) {
			switch (derivedFeatureID) {
				default:
					return -1;
			}
		}
		if (baseClass == UMLStereotypePropertyChange.class) {
			switch (derivedFeatureID) {
				case SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__STEREOTYPE:
					return UML2DiffPackage.UML_STEREOTYPE_PROPERTY_CHANGE__STEREOTYPE;
				default:
					return -1;
			}
		}
		if (baseClass == SysMLStereotypeAttributeChange.class) {
			switch (derivedFeatureID) {
				default:
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractDiffExtension.class) {
			switch (baseFeatureID) {
				case DiffPackage.ABSTRACT_DIFF_EXTENSION__HIDE_ELEMENTS:
					return SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__HIDE_ELEMENTS;
				case DiffPackage.ABSTRACT_DIFF_EXTENSION__IS_COLLAPSED:
					return SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__IS_COLLAPSED;
				default:
					return -1;
			}
		}
		if (baseClass == UMLDiffExtension.class) {
			switch (baseFeatureID) {
				default:
					return -1;
			}
		}
		if (baseClass == UMLStereotypePropertyChange.class) {
			switch (baseFeatureID) {
				case UML2DiffPackage.UML_STEREOTYPE_PROPERTY_CHANGE__STEREOTYPE:
					return SysMLdiffPackage.SYS_ML_STEREOTYPE_PROPERTY_CHANGE_LEFT_TARGET__STEREOTYPE;
				default:
					return -1;
			}
		}
		if (baseClass == SysMLStereotypeAttributeChange.class) {
			switch (baseFeatureID) {
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isCollapsed: "); //$NON-NLS-1$
		result.append(isCollapsed);
		result.append(')');
		return result.toString();
	}

} // SysMLStereotypePropertyChangeLeftTargetImpl
