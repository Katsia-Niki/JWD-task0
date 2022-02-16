package by.jwd.task0.observer;

import by.jwd.task0.entity.AbstractCustomArray;
import by.jwd.task0.entity.CustomArray;

import java.util.EventObject;

public class CustomArrayEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @throws IllegalArgumentException if source is null
     */
    public CustomArrayEvent(AbstractCustomArray source) {
        super(source);
    }

    @Override
    public CustomArray getSource() {
        return (CustomArray) super.getSource();
    }

}
