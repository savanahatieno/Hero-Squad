package modelTest;

import models.hero;
import models.squad;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class squadTest {

    @Test
    @DisplayName("Squad Name should be added")
    public void testString_SquadName() {
        squad newSquad = squad.setUpNewSquad1();
        assertEquals("Team Avatar", newSquad.getSquadName ());
    }

    @Test
    @DisplayName("Squad Quantity should be added")
    public void testInt_SquadQuantity() {
        squad newSquad = squad.setUpNewSquad2();
        assertEquals(6,newSquad.getSquadQuantity ());
    }

    @Test
    @DisplayName("Squad Reason should be added")
    public void testString_SquadReason() {
        squad newSquad = squad.setUpNewSquad3();
        assertEquals("Save New York", newSquad.getSquadReason ());
    }

    @Test
    @DisplayName("NewSquad and able to add another")
    public void newSquad_getInstances_true() {
        squad newSquad = squad.setUpNewSquad1();
        squad another = squad.setUpNewSquad1();
        assertTrue(squad.getInstances().contains(newSquad));
        assertTrue(squad.getInstances().contains(another));
    }

    @Test
    @DisplayName("NewSquad and able to add another")
    public void newSquad_setUpSquadMembers_Array() {
        squad newSquad = squad.setUpNewSquad1();
        hero newHero = hero.setUpNewHero1();
        hero newHero1 = hero.setUpNewHero2();
        newSquad.setSquadMembers(newHero);
        newSquad.setSquadMembers(newHero1);
        assertEquals("Team Avatar", newSquad.getSquadMembers().get(0).getClass());
    }

    //Testing All Squad  Members
    @Test
    public void testAllSquadMembers_Array(){
        hero newHero = hero.setUpNewHero1();
        squad newSquad = squad.setUpNewSquad1();
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        assertEquals("Aang", newSquad.getSquadMembers().get(0).getClass());
    }


}
