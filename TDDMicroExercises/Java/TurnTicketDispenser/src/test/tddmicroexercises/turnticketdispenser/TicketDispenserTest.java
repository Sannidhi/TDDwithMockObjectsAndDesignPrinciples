package tddmicroexercises.turnticketdispenser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(TurnNumberSequence.class)
public class TicketDispenserTest {

    @Test
    public void shouldReturnANewTurnTicket() throws Exception {
        TicketDispenser ticketDispenser = new TicketDispenser();
        mockStatic(TurnNumberSequence.class);

        when(TurnNumberSequence.getNextTurnNumber()).thenReturn(4);

        assertThat(ticketDispenser.getTurnTicket().getTurnNumber(), is(4));
    }
}