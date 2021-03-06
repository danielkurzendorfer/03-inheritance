package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class HungryState extends State {
    public HungryState(int duration) {
        super(duration);
    }

    @Override
    public State successor(Cat cat) {
        logger.info("Katze ist zu lange hungrig");
        return new DeathState();
    }

    public State feed(Cat cat) {
        logger.info("Katze wird gefüttert");

        return new DigestingState(cat.getDigest(), duration - time);
    }
}
