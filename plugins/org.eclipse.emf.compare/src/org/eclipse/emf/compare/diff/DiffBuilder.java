/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.compare.diff;

import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * This default implementation of an {@link IDiffProcessor} will build the necessary differences and attach
 * them to the appropriate {@link Match}.
 * 
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 */
public class DiffBuilder implements IDiffProcessor {
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.diff.IDiffProcessor#referenceChange(org.eclipse.emf.compare.Match,
	 *      org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.compare.DifferenceKind, org.eclipse.emf.compare.DifferenceSource)
	 */
	public void referenceChange(Match match, EReference reference, EObject value, DifferenceKind kind,
			DifferenceSource source) {
		final ReferenceChange referenceChange = CompareFactory.eINSTANCE.createReferenceChange();
		referenceChange.setMatch(match);
		referenceChange.setReference(reference);
		referenceChange.setValue(value);
		referenceChange.setKind(kind);
		referenceChange.setSource(source);
	}
}