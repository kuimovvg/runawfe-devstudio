package ru.runa.gpd.editor.graphiti.layout;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.services.Graphiti;

import ru.runa.gpd.lang.model.IBoundaryEventContainer;
import ru.runa.gpd.lang.model.Node;
import ru.runa.gpd.lang.model.bpmn.CatchEventNode;

public class LayoutCatchEventNodeFeature extends LayoutElementFeature {

    @Override
    public boolean layout(ILayoutContext context) {
        ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
        GraphicsAlgorithm ga = containerShape.getGraphicsAlgorithm();

        CatchEventNode node = (CatchEventNode) getBusinessObjectForPictogramElement(containerShape);
        if (node.getParent() instanceof IBoundaryEventContainer) {
            Rectangle parentRectangle = ((Node) node.getParent()).getConstraint();
            Graphiti.getGaService().setLocation(ga, parentRectangle.width - 2 * GRID_SIZE, parentRectangle.height - 2 * GRID_SIZE);
        }
        return true;
    }
}
