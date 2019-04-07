package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    private static final Logger logger = LogManager.getLogger();

    private int time = 0;
    private int duration;

    protected State(int duration) {
        this.duration = duration;
    }

    final State tick (Cat cat) {
        time = time + 1;

        if(time < duration) {
            logger.info("still in {}", getClass().getSimpleName());
            return this;
        }
        return successor(cat);

    }

    protected abstract State successor(Cat cat);
}
