/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.compare.rcp.ui.internal.contentmergeviewer.accessor;

import com.google.common.collect.ImmutableList;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.rcp.ui.internal.contentmergeviewer.accessor.legacy.ITypedElement;
import org.eclipse.emf.compare.rcp.ui.internal.mergeviewer.item.IMergeViewerItem;

/**
 * @author <a href="mailto:axel.richard@obeo.fr">Axel Richard</a>
 */
public interface ICompareAccessor extends ITypedElement {

	Comparison getComparison();

	IMergeViewerItem getInitialItem();

	ImmutableList<? extends IMergeViewerItem> getItems();
}
