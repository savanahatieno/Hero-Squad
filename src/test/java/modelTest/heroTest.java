package modelTest;

import org.junit.Test;



import static org.junit.Assert.*;

public class heroTest {
    @Test
    public void setUpNewHero_getName_String(){
        Hero newHero = Hero.setUpNewHero();
        assertEquals(("Aang", newHero.getName);
    }
}
