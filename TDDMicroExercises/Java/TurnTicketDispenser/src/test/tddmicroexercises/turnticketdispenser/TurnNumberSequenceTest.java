package tddmicroexercises.turnticketdispenser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TurnNumberSequenceTest {

    @Test
    public void shouldReturnNextTurnNumber() throws Exception {
        TurnNumberSequence.getNextTurnNumber();
        assertThat(TurnNumberSequence.getNextTurnNumber(), is(1));
    }
}