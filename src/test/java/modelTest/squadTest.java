package modelTest;

import models.squad;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class squadTest {

    @Test
    @DisplayName("Name should be added")
    public void testString() {
        squad newSquad = squad.setUpNewSquad1();
        System.out.println(newSquad);
        //assertEquals("Team Avatar", newSquad.getSquadName ());
    }
}
