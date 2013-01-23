package org.eclipse.emf.compare.diagram.ide.diff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Conflict;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diagram.DiagramCompareFactory;
import org.eclipse.emf.compare.diagram.LabelChange;
import org.eclipse.emf.compare.diagram.diff.util.GMFLabelUtil;
import org.eclipse.emf.compare.diagram.ide.GMFCompareIDEPlugin;
import org.eclipse.emf.compare.diagram.ide.diff.internal.extension.IDiffExtensionFactory;
import org.eclipse.emf.compare.diagram.provider.IViewLabelProvider;
import org.eclipse.emf.compare.diagram.provider.ViewLabelProviderExtensionRegistry;
import org.eclipse.emf.compare.extension.IPostProcessor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

public class DiagramDiffIDEExtensionPostProcessor implements IPostProcessor {

	private Set<IDiffExtensionFactory> diagramExtensionFactories;

	public DiagramDiffIDEExtensionPostProcessor() {
		// TODO Auto-generated constructor stub
	}

	public void postMatch(Comparison comparison, Monitor monitor) {
		// TODO Auto-generated method stub

	}

	public void postDiff(Comparison comparison, Monitor monitor) {
		// TODO Auto-generated method stub

	}

	public void postRequirements(Comparison comparison, Monitor monitor) {
		// computeLabels
		computeLabels(comparison);
	}

	public void postEquivalences(Comparison comparison, Monitor monitor) {
		// TODO Auto-generated method stub

	}

	public void postConflicts(Comparison comparison, Monitor monitor) {
		// TODO Auto-generated method stub

	}

	private void computeLabels(Comparison comparison) {
		final Iterator<Match> matches = getAllMatches(comparison).iterator();
		while (matches.hasNext()) {
			final Match match = (Match)matches.next();

			final EObject leftElement = match.getLeft();

			if (leftElement instanceof View) {
				LabelChange diff = null;
				final EObject rightElement = match.getRight();
				final View view = (View)leftElement;
				final Diagram diagram = view.getDiagram();

				if (diagram != null) {
					final String diagramType = diagram.getType();

					IViewLabelProvider extensionForType = ViewLabelProviderExtensionRegistry.getExtensionForType(diagramType);

					if (extensionForType == null) { // no extension registered for handling label in this
													// diagram,
						// use the default one
						GMFCompareIDEPlugin.getDefault().getLog().log(
								new Status(IStatus.INFO, GMFCompareIDEPlugin.PLUGIN_ID,
										"No IViewLabelProvider registered for diagram " + diagramType)); //$NON-NLS-1$
						extensionForType = IViewLabelProvider.DEFAULT_INSTANCE;
					}
					if (rightElement instanceof View && extensionForType.isManaged(view) && isVisible(view)
							&& isVisible((View)rightElement)) {
						final String leftLabel = extensionForType.elementLabel(view);
						final String rightLabel = extensionForType.elementLabel((View)rightElement);
						if (!leftLabel.equals(rightLabel)) {
							diff = DiagramCompareFactory.eINSTANCE.createLabelChange();
							diff.setKind(DifferenceKind.CHANGE);
							diff.setLeft(leftLabel);
							diff.setRight(rightLabel);
							diff.setView(leftElement);
							if (match.eContainer() instanceof Match) {
								((Match) match.eContainer()).getDifferences().add(diff);
							} else {
								match.getDifferences().add(diff);
							}
						}
					}
				}

				if (comparison.isThreeWay() && diff != null) {
					final EObject ancestor = match.getOrigin();
					if (ancestor instanceof View) {
						final ITextAwareEditPart ancestorEp = GMFLabelUtil.getTextEditPart((View)ancestor);
						if (ancestorEp != null) {
							final String ancestorLabel = ancestorEp.getEditText();
							final String leftLabel = diff.getLeft();
							final String rightLabel = diff.getRight();
							if (ancestorLabel.equals(leftLabel)) {
								diff.setSource(DifferenceSource.RIGHT);
								diff.setView(rightElement);
							} else if (!ancestorLabel.equals(rightLabel)) {
								diff.setView(leftElement);
								final Conflict conflict = CompareFactory.eINSTANCE.createConflict();
								conflict.getDifferences().add(diff);
								comparison.getConflicts().add(conflict);
							}
						}

					}
				}
			}
		}
		GMFLabelUtil.cleanup();
	}
	
	/**
	 * Checks if the view is visible.
	 * 
	 * @param view
	 *            The tested view.
	 * @return True if visible.
	 */
	public static boolean isVisible(View view) {
		boolean result = view.isVisible();
		if (result) {
			final View container = getNextParent(view);
			if (container != null) {
				result = isVisible(container);
			}
		}
		return result;
	}
	
	/**
	 * Get the closest parent view.
	 * 
	 * @param obj
	 *            The current view.
	 * @return The parent view.
	 */
	private static View getNextParent(EObject obj) {
		View result = null;
		if (obj != null) {
			final EObject parent = obj.eContainer();
			if (parent instanceof View) {
				result = (View)parent;
			} else {
				result = getNextParent(parent);
			}
		}
		return result;
	}

	private List<Match> getAllMatches(Comparison comparison) {
		final List<Match> result = new ArrayList<Match>();
		final Iterator<Match> matches = comparison.getMatches().iterator();
		while (matches.hasNext()) {
			final Match match = (Match)matches.next();
			result.add(match);
			final Iterator<Match> subMatches = match.getAllSubmatches().iterator();
			while (subMatches.hasNext()) {
				Match match2 = (Match)subMatches.next();
				result.add(match2);
			}
		}
		return result;
	}

}
