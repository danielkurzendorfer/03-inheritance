package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    protected static final Logger logger = LogManager.getLogger();

    protected int time = 0;
    protected int duration;

    protected State(int duration) {
        this.duration = duration;
    }

    final State tick (Cat cat) {
        if(duration < 0)
            return this;

        time = time + 1;

        if(time < duration) {
            logger.info("still in {}", getClass().getSimpleName());
            return this;
        } else {
            return successor(cat);
        }

    }

    public abstract State successor(Cat cat);
}
