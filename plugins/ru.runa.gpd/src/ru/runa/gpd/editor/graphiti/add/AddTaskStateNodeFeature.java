package ru.runa.gpd.editor.graphiti.add;

import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.services.Graphiti;

import ru.runa.gpd.editor.graphiti.GaProperty;
import ru.runa.gpd.lang.NodeRegistry;
import ru.runa.gpd.lang.model.Node;
import ru.runa.gpd.lang.model.Synchronizable;

public class AddTaskStateNodeFeature extends AddStateNodeFeature {

    @Override
    protected void addCustomGraphics(Node node, IAddContext context, GraphicsAlgorithmContainer container, ContainerShape containerShape) {
        addAsyncImage(node, context, container, containerShape);
    }

    private void addAsyncImage(Node node, IAddContext context, GraphicsAlgorithmContainer container, ContainerShape containerShape) {
        Image asyncImage = Graphiti.getGaService().createImage(container, "graph/async.png");
        asyncImage.getProperties().add(new GaProperty(GaProperty.ID, GaProperty.ASYNC));
        Graphiti.getGaService().setLocation(asyncImage, node.getConstraint().width - 2 * GRID_SIZE, node.getConstraint().height - 2 * GRID_SIZE - 1);
        boolean async = ((Synchronizable) node).isAsync();
        containerShape.getProperties().add(new GaProperty(GaProperty.ASYNC, String.valueOf(async)));
    }

}
