/**
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.emf.compare.uml2diff.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.compare.uml2diff.UMLGeneralizationSetChange;
import org.eclipse.emf.compare.uml2diff.Uml2diffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UML Generalization Set Change</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLGeneralizationSetChangeTest extends UMLExtensionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UMLGeneralizationSetChangeTest.class);
	}

	/**
	 * Constructs a new UML Generalization Set Change test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLGeneralizationSetChangeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UML Generalization Set Change test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UMLGeneralizationSetChange getFixture() {
		return (UMLGeneralizationSetChange)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Uml2diffFactory.eINSTANCE.createUMLGeneralizationSetChange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UMLGeneralizationSetChangeTest
