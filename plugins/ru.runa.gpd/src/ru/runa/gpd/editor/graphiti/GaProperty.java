package ru.runa.gpd.editor.graphiti;

import org.eclipse.graphiti.mm.impl.PropertyImpl;

public class GaProperty extends PropertyImpl {
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String DESCRIPTION = "description";
    public static final String SWIMLANE_NAME = "swimlaneName";
    public static final String EXCLUSIVE_FLOW = "exclusiveFlow";
    public static final String DEFAULT_FLOW = "defaultFlow";
    public static final String SUBPROCESS = "subProcess";
    public static final String MULTIPLE_INSTANCES = "multipleInstances";
    public static final String SWIMLANE_DISPLAY_VERTICAL = "swimlaneDisplayVertical";
    public static final String MINIMAZED_VIEW = "minimazedView";
    public static final String SCRIPT = "script";
    public static final String ASYNC = "async";
    public static final String ICON = "icon";

    public GaProperty(String name, String value) {
        setKey(name);
        setValue(value);
    }
}
