package ru.runa.gpd.lang.model.bpmn;

import java.util.List;

import ru.runa.gpd.extension.HandlerArtifact;
import ru.runa.gpd.lang.model.Delegable;
import ru.runa.gpd.lang.model.Node;
import ru.runa.gpd.lang.model.Transition;

public class ScriptTask extends Node implements Delegable, IBoundaryEventContainer {

    @Override
    public String getDelegationType() {
        return HandlerArtifact.ACTION;
    }

    @Override
    protected boolean allowLeavingTransition(List<Transition> transitions) {
        return super.allowLeavingTransition(transitions) && transitions.size() == 0;
    }
    
    @Override
    public CatchEventNode getCatchEventNodes() {
        return getFirstChild(CatchEventNode.class);
    }

}
