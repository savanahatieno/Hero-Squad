package modelTest;

import models.hero;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

//import static org.junit.Assert.*;

public class heroTest {

    @Test
    @DisplayName("Name should be added")
    public void testString() {
        hero newHero = hero.setUpNewHero1();
        assertEquals("Aang", newHero.getName ());
    }

    @Test
    @DisplayName("Age should be added")
    public void testAge() {
        hero newHero = hero.setUpNewHero2();
        assertEquals(24, newHero.getAge ());
    }

    @Test
    @DisplayName("Name should be added")
    public void testPower() {
        hero newHero = hero.setUpNewHero3();
        assertEquals("Fire Bender", newHero.getPower ());
    }

    @Test
    @DisplayName("Name should be added")
    public void testWeakness() {
        hero newHero = hero.setUpNewHero4();
        assertEquals("Emotions", newHero.getWeakness ());
    }



}
