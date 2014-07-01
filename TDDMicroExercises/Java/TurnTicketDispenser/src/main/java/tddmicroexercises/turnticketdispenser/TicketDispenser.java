package tddmicroexercises.turnticketdispenser;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class TicketDispenser {
    public TurnTicket getTurnTicket() {
        int newTurnNumber = TurnNumberSequence.getNextTurnNumber();

        return new TurnTicket(newTurnNumber);
    }
}
