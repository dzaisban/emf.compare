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
package org.eclipse.emf.compare.match.eobject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Provide the weight to consider while comparing EObjects by their content.
 * 
 * @author <a href="mailto:cedric.brun@obeo.fr">Cedric Brun</a>
 */
public interface WeightProvider {

	/**
	 * Return the weight for the given feature.
	 * 
	 * @param attribute
	 *            any {@link EStructuralFeature}.
	 * @return the weight for the given feature. 0 meaning no effects.
	 */
	int getWeight(EStructuralFeature attribute);

	/**
	 * Return the weight associated with the fact some Object has changed it's container.
	 * 
	 * @param a
	 *            any instance.
	 * @return a weight representing the importance of the change of container to compute matches.
	 */
	int getParentWeight(EObject a);

	/**
	 * Return the weight associated with the fact some Object has changed it's containing reference.
	 * 
	 * @param a
	 *            any instance.
	 * @return a weight representing the importance of the change of containing reference to compute matches.
	 */
	int getContainingFeatureWeight(EObject a);

}
