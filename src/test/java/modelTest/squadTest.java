package modelTest;

import models.squad;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class squadTest {

    @Test
    @DisplayName("Squad Name should be added")
    public void testString_SquadName() {
        squad newSquad = squad.setUpNewSquad1();
        assertEquals("Team Avatar", newSquad.getSquadName ());
    }

    @Test
    @DisplayName("Squad Name should be added")
    public void testInt_SquadQuantity() {
        squad newSquad = squad.setUpNewSquad1();
        assertEquals(4, newSquad.getSquadQuantity ());
    }
}
