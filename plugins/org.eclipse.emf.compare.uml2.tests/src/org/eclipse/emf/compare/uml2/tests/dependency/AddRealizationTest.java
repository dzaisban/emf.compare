package org.eclipse.emf.compare.uml2.tests.dependency;

import static com.google.common.base.Predicates.and;
import static com.google.common.base.Predicates.instanceOf;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;
import static org.eclipse.emf.compare.utils.EMFComparePredicates.added;
import static org.eclipse.emf.compare.utils.EMFComparePredicates.addedToReference;
import static org.eclipse.emf.compare.utils.EMFComparePredicates.ofKind;
import static org.eclipse.emf.compare.utils.EMFComparePredicates.removed;
import static org.eclipse.emf.compare.utils.EMFComparePredicates.removedFromReference;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.uml2.internal.DirectedRelationshipChange;
import org.eclipse.emf.compare.uml2.tests.AbstractUMLTest;
import org.eclipse.emf.compare.uml2.tests.AbstractUMLInputData;
import org.eclipse.emf.compare.uml2.tests.dependency.data.DependencyInputData;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

//TODO To extend from AddDependencyTest and change only descriptions.
@SuppressWarnings("nls")
public class AddRealizationTest extends AbstractUMLTest {

	private DependencyInputData input = new DependencyInputData();

	@Test
	public void testA60UseCase() throws IOException {
		final Resource left = input.getA6Left();
		final Resource right = input.getA6Right();

		final Comparison comparison = compare(left, right);
		testAB1(TestKind.ADD, comparison);

		testMergeLeftToRight(left, right, null);
		testMergeRightToLeft(left, right, null);
	}

	@Test
	public void testA61UseCase() throws IOException {
		final Resource left = input.getA6Left();
		final Resource right = input.getA6Right();

		final Comparison comparison = compare(right, left);
		testAB1(TestKind.DELETE, comparison);

		testMergeLeftToRight(right, left, null);
		testMergeRightToLeft(right, left, null);
	}

	@Test
	public void testA60UseCase3way() throws IOException {
		final Resource left = input.getA6Left();
		final Resource right = input.getA6Right();

		final Comparison comparison = compare(left, right, right);
		testAB1(TestKind.ADD, comparison);

		testMergeLeftToRight(left, right, right);
		testMergeRightToLeft(left, right, right);
	}

	@Test
	public void testA61UseCase3way() throws IOException {
		final Resource left = input.getA6Left();
		final Resource right = input.getA6Right();

		final Comparison comparison = compare(left, right, left);
		testAB1(TestKind.DELETE, comparison);

		testMergeLeftToRight(left, right, left);
		testMergeRightToLeft(left, right, left);
	}

	private void testAB1(TestKind kind, final Comparison comparison) {
		final List<Diff> differences = comparison.getDifferences();

		// We should have no less and no more than 5 differences
		assertSame(Integer.valueOf(5), Integer.valueOf(differences.size()));

		Predicate<? super Diff> addRealizationDescription = null;
		Predicate<? super Diff> addRefRealizationInClass0Description = null;
		Predicate<? super Diff> addRefClass1InRealizationDescription = null;
		Predicate<? super Diff> addRefClass0InRealizationDescription = null;

		if (kind.equals(TestKind.DELETE)) {
			addRealizationDescription = removed("model.Realization0"); //$NON-NLS-1$
			addRefRealizationInClass0Description = removedFromReference("model.Class0", "clientDependency",
					"model.Realization0");
			addRefClass0InRealizationDescription = removedFromReference("model.Realization0", "client",
					"model.Class0");
			addRefClass1InRealizationDescription = removedFromReference("model.Realization0", "supplier",
					"model.Class1");
		} else {
			addRealizationDescription = added("model.Realization0"); //$NON-NLS-1$
			addRefRealizationInClass0Description = addedToReference("model.Class0", "clientDependency",
					"model.Realization0");
			addRefClass0InRealizationDescription = addedToReference("model.Realization0", "client",
					"model.Class0");
			addRefClass1InRealizationDescription = addedToReference("model.Realization0", "supplier",
					"model.Class1");
		}

		final Diff addDependency = Iterators.find(differences.iterator(), addRealizationDescription);
		final Diff addRefDependencyInClass0 = Iterators.find(differences.iterator(),
				addRefRealizationInClass0Description);
		final Diff addRefClass0InDependency = Iterators.find(differences.iterator(),
				addRefClass0InRealizationDescription);
		final Diff addRefClass1InDependency = Iterators.find(differences.iterator(),
				addRefClass1InRealizationDescription);

		assertNotNull(addDependency);
		assertNotNull(addRefDependencyInClass0);
		assertNotNull(addRefClass0InDependency);
		assertNotNull(addRefClass1InDependency);

		// CHECK EXTENSION
		assertSame(Integer.valueOf(1), count(differences, instanceOf(DirectedRelationshipChange.class)));
		Diff addUMLDependency = null;
		if (kind.equals(TestKind.ADD)) {
			addUMLDependency = Iterators.find(differences.iterator(), and(
					instanceOf(DirectedRelationshipChange.class), ofKind(DifferenceKind.ADD)));
		} else {
			addUMLDependency = Iterators.find(differences.iterator(), and(
					instanceOf(DirectedRelationshipChange.class), ofKind(DifferenceKind.DELETE)));
		}
		assertNotNull(addUMLDependency);
		assertSame(Integer.valueOf(4), Integer.valueOf(addUMLDependency.getRefinedBy().size()));
		assertTrue(addUMLDependency.getRefinedBy().contains(addRefClass0InDependency));
		assertTrue(addUMLDependency.getRefinedBy().contains(addRefClass1InDependency));
		assertTrue(addUMLDependency.getRefinedBy().contains(addDependency));
		assertTrue(addUMLDependency.getRefinedBy().contains(addRefDependencyInClass0));

		// CHECK REQUIREMENT
		if (kind.equals(TestKind.ADD)) {
			assertSame(Integer.valueOf(1), Integer.valueOf(addRefClass0InDependency.getRequires().size()));
			assertTrue(addRefClass0InDependency.getRequires().contains(addDependency));

			assertSame(Integer.valueOf(1), Integer.valueOf(addRefClass1InDependency.getRequires().size()));
			assertTrue(addRefClass1InDependency.getRequires().contains(addDependency));

			assertSame(Integer.valueOf(1), Integer.valueOf(addRefDependencyInClass0.getRequires().size()));
			assertTrue(addRefDependencyInClass0.getRequires().contains(addDependency));

			assertSame(Integer.valueOf(0), Integer.valueOf(addDependency.getRequires().size()));
			assertSame(Integer.valueOf(0), Integer.valueOf(addUMLDependency.getRequires().size()));
		} else {
			assertSame(Integer.valueOf(0), Integer.valueOf(addRefClass0InDependency.getRequires().size()));

			assertSame(Integer.valueOf(0), Integer.valueOf(addRefClass1InDependency.getRequires().size()));

			assertSame(Integer.valueOf(0), Integer.valueOf(addRefDependencyInClass0.getRequires().size()));

			assertSame(Integer.valueOf(3), Integer.valueOf(addDependency.getRequires().size()));
			assertTrue(addDependency.getRequires().contains(addRefClass0InDependency));
			assertTrue(addDependency.getRequires().contains(addRefClass1InDependency));
			assertTrue(addDependency.getRequires().contains(addRefDependencyInClass0));

			assertSame(Integer.valueOf(0), Integer.valueOf(addUMLDependency.getRequires().size()));
		}

		// CHECK EQUIVALENCE
		assertSame(Integer.valueOf(1), Integer.valueOf(comparison.getEquivalences().size()));

		assertNotNull(addRefClass0InDependency.getEquivalence());
		assertSame(Integer.valueOf(2), Integer.valueOf(addRefClass0InDependency.getEquivalence()
				.getDifferences().size()));
		assertTrue(addRefClass0InDependency.getEquivalence().getDifferences().contains(
				addRefDependencyInClass0));

		testIntersections(comparison);

	}

	@Override
	protected AbstractUMLInputData getInput() {
		return input;
	}

}
