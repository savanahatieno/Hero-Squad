package modelTest;

import org.junit.Test;



import static org.junit.Assert.*;

public class heroTest {
    @Test
    public void newHero_getName_String(){
        Hero newHero = Hero.setUpNewHero();
        assertEquals(("Aang", newHero.getName());
    }
}
