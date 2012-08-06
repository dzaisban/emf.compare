/*******************************************************************************
 * Copyright (c) 2011, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.compare.uml2.diff.internal.extension.sequence;

import org.eclipse.emf.compare.ComparePackage;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.uml2.diff.internal.extension.AbstractDiffExtensionFactory;
import org.eclipse.emf.compare.uml2diff.UMLExecutionSpecificationChange;
import org.eclipse.emf.compare.uml2diff.Uml2diffFactory;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Factory for UMLExecutionSpecificationChangeLeft.
 */
public class UMLExecutionSpecificationChangeFactory extends AbstractDiffExtensionFactory {

	/**
	 * The predicate to hide difference elements.
	 */
	private static final UMLPredicate<Setting> COVERED_BY_PREDICATE = new UMLPredicate<Setting>() {
		public boolean apply(Setting input) {
			return ((ReferenceChange)input.getEObject()).getReference() == UMLPackage.Literals.LIFELINE__COVERED_BY;
		}
	};

	/**
	 * Constructor.
	 * 
	 * @param engine
	 *            The UML2 difference engine.
	 */
	public UMLExecutionSpecificationChangeFactory() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.uml2.diff.internal.extension.IDiffExtensionFactory#handles(org.eclipse.emf.compare.diff.metamodel.DiffElement)
	 */
	public boolean handles(Diff input) {
		return input instanceof ReferenceChange && ((ReferenceChange)input).getReference().isContainment()
				&& ((ReferenceChange)input).getValue() instanceof ExecutionSpecification;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.uml2.diff.internal.extension.IDiffExtensionFactory#create(org.eclipse.emf.compare.diff.metamodel.DiffElement,
	 *      org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer)
	 */
	public Diff create(Diff input, EcoreUtil.CrossReferencer crossReferencer) {
		final ReferenceChange referenceChange = (ReferenceChange)input;
		final ExecutionSpecification actionExecutionSpecification = (ExecutionSpecification)referenceChange
				.getValue();

		final UMLExecutionSpecificationChange ret = Uml2diffFactory.eINSTANCE
				.createUMLExecutionSpecificationChange();

		ret.getRefinedBy().add(input);

		beRefinedByCrossReferences(actionExecutionSpecification,
				ComparePackage.Literals.REFERENCE_CHANGE__VALUE, ret, COVERED_BY_PREDICATE, crossReferencer);
		beRefinedByCrossReferences(actionExecutionSpecification.getStart(),
				ComparePackage.Literals.REFERENCE_CHANGE__VALUE, ret, COVERED_BY_PREDICATE, crossReferencer);
		beRefinedByCrossReferences(actionExecutionSpecification.getFinish(),
				ComparePackage.Literals.REFERENCE_CHANGE__VALUE, ret, COVERED_BY_PREDICATE, crossReferencer);

		return ret;
	}
}
