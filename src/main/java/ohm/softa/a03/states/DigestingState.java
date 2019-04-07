package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;



public class DigestingState extends State {
    private final int remainingTime;

    public DigestingState(int duration, int remainingTime) {
        super(duration);
        this.remainingTime = remainingTime;
    }

    @Override
    public State successor(Cat cat) {
        logger.info("Katze wird verspielt");
        return new PlayfulState(remainingTime-cat.getDigest());
    }
}
