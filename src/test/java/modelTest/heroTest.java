package modelTest;

import models.hero;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class heroTest {
    //private heroTest heroTest;

//    @BeforeEach
//    public void addHero() throws Exception {
//        hero = new hero();
//    }

    @Test
    @DisplayName("Name should be added")
    public void testString() {
        hero newHero = hero.setUpNewHero();
        assertEquals("Aang", newHero.getName ());
    }

}
