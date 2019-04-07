package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    private static final Logger logger = LogManager.getLogger();

    private int t;
    private int duration;

    final State tick (Cat cat) {
        return null;
    }

    abstract State successor(Cat cat);
}
