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
package org.eclipse.emf.compare.rcp.ui.internal.contentmergeviewer.impl;

import org.eclipse.emf.compare.rcp.ui.EMFCompareRCPUIPlugin;

public final class TypeConstants {

	private TypeConstants() {
	}

	public static final String TYPE__ETREE_DIFF = EMFCompareRCPUIPlugin.PLUGIN_ID + ".eTreeDiff"; //$NON-NLS-1$

	public static final String TYPE__ELIST_DIFF = EMFCompareRCPUIPlugin.PLUGIN_ID + ".eListDiff"; //$NON-NLS-1$

	public static final String TYPE__ETEXT_DIFF = EMFCompareRCPUIPlugin.PLUGIN_ID + ".eTextDiff"; //$NON-NLS-1$

	public static final String TYPE__ERESOURCE_DIFF = EMFCompareRCPUIPlugin.PLUGIN_ID + ".eResourceDiff"; //$NON-NLS-1$

	public static final String TYPE__EMATCH = EMFCompareRCPUIPlugin.PLUGIN_ID + ".eMatch"; //$NON-NLS-1$
}
