package modelTest;

import models.hero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//import org.junit.jupiter.api.BeforeEach;


//import static org.junit.Assert.*;

public class heroTest {

    @Test
    public void testString() {
        hero newHero = hero.setUpNewHero1();
        assertEquals("Aang", newHero.getName ());
    }

    @Test
    public void testAge() {
        hero newHero = hero.setUpNewHero2();
        assertEquals(24, newHero.getAge ());
    }

    @Test
    public void testPower() {
        hero newHero = hero.setUpNewHero3();
        assertEquals("Fire Bender", newHero.getPower ());
    }

    @Test
    public void testWeakness() {
        hero newHero = hero.setUpNewHero4();
        assertEquals("Emotions", newHero.getWeakness ());
    }



}
