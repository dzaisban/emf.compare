/**
 * Copyright (c) 2012, 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.emf.compare.uml2.internal.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.compare.uml2.internal.util.UMLCompareAdapterFactory;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class UMLCompareItemProviderAdapterFactory extends UMLCompareAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UMLCompareItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemColorProvider.class);
		supportedTypes.add(IItemFontProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.uml2.internal.AssociationChange} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected AssociationChangeItemProvider associationChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.AssociationChange}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAssociationChangeAdapter() {
		if (associationChangeItemProvider == null) {
			associationChangeItemProvider = new AssociationChangeItemProvider(this);
		}

		return associationChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.uml2.internal.ExtendChange} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected ExtendChangeItemProvider extendChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.ExtendChange}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createExtendChangeAdapter() {
		if (extendChangeItemProvider == null) {
			extendChangeItemProvider = new ExtendChangeItemProvider(this);
		}

		return extendChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.uml2.internal.GeneralizationSetChange} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationSetChangeItemProvider generalizationSetChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.GeneralizationSetChange}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralizationSetChangeAdapter() {
		if (generalizationSetChangeItemProvider == null) {
			generalizationSetChangeItemProvider = new GeneralizationSetChangeItemProvider(this);
		}

		return generalizationSetChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.eclipse.emf.compare.uml2.internal.ExecutionSpecificationChange} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExecutionSpecificationChangeItemProvider executionSpecificationChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.ExecutionSpecificationChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionSpecificationChangeAdapter() {
		if (executionSpecificationChangeItemProvider == null) {
			executionSpecificationChangeItemProvider = new ExecutionSpecificationChangeItemProvider(this);
		}

		return executionSpecificationChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.uml2.internal.IntervalConstraintChange} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalConstraintChangeItemProvider intervalConstraintChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.IntervalConstraintChange}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntervalConstraintChangeAdapter() {
		if (intervalConstraintChangeItemProvider == null) {
			intervalConstraintChangeItemProvider = new IntervalConstraintChangeItemProvider(this);
		}

		return intervalConstraintChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.uml2.internal.MessageChange} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected MessageChangeItemProvider messageChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.MessageChange}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createMessageChangeAdapter() {
		if (messageChangeItemProvider == null) {
			messageChangeItemProvider = new MessageChangeItemProvider(this);
		}

		return messageChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.uml2.internal.StereotypePropertyChange} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypePropertyChangeItemProvider stereotypePropertyChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.StereotypePropertyChange}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStereotypePropertyChangeAdapter() {
		if (stereotypePropertyChangeItemProvider == null) {
			stereotypePropertyChangeItemProvider = new StereotypePropertyChangeItemProvider(this);
		}

		return stereotypePropertyChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.eclipse.emf.compare.uml2.internal.StereotypeApplicationChange} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StereotypeApplicationChangeItemProvider stereotypeApplicationChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.StereotypeApplicationChange}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStereotypeApplicationChangeAdapter() {
		if (stereotypeApplicationChangeItemProvider == null) {
			stereotypeApplicationChangeItemProvider = new StereotypeApplicationChangeItemProvider(this);
		}

		return stereotypeApplicationChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.uml2.internal.StereotypeReferenceChange} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeReferenceChangeItemProvider stereotypeReferenceChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.StereotypeReferenceChange}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStereotypeReferenceChangeAdapter() {
		if (stereotypeReferenceChangeItemProvider == null) {
			stereotypeReferenceChangeItemProvider = new StereotypeReferenceChangeItemProvider(this);
		}

		return stereotypeReferenceChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.uml2.internal.ProfileApplicationChange} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileApplicationChangeItemProvider profileApplicationChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.ProfileApplicationChange}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProfileApplicationChangeAdapter() {
		if (profileApplicationChangeItemProvider == null) {
			profileApplicationChangeItemProvider = new ProfileApplicationChangeItemProvider(this);
		}

		return profileApplicationChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.uml2.internal.DirectedRelationshipChange} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectedRelationshipChangeItemProvider directedRelationshipChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.uml2.internal.DirectedRelationshipChange}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDirectedRelationshipChangeAdapter() {
		if (directedRelationshipChangeItemProvider == null) {
			directedRelationshipChangeItemProvider = new DirectedRelationshipChangeItemProvider(this);
		}

		return directedRelationshipChangeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (associationChangeItemProvider != null) associationChangeItemProvider.dispose();
		if (extendChangeItemProvider != null) extendChangeItemProvider.dispose();
		if (generalizationSetChangeItemProvider != null) generalizationSetChangeItemProvider.dispose();
		if (executionSpecificationChangeItemProvider != null) executionSpecificationChangeItemProvider.dispose();
		if (intervalConstraintChangeItemProvider != null) intervalConstraintChangeItemProvider.dispose();
		if (messageChangeItemProvider != null) messageChangeItemProvider.dispose();
		if (stereotypePropertyChangeItemProvider != null) stereotypePropertyChangeItemProvider.dispose();
		if (stereotypeApplicationChangeItemProvider != null) stereotypeApplicationChangeItemProvider.dispose();
		if (stereotypeReferenceChangeItemProvider != null) stereotypeReferenceChangeItemProvider.dispose();
		if (profileApplicationChangeItemProvider != null) profileApplicationChangeItemProvider.dispose();
		if (directedRelationshipChangeItemProvider != null) directedRelationshipChangeItemProvider.dispose();
	}

}
