import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BearTest {
    private Bear bear;
    private Salmon salmon;
    private River river;

    @Before
    public void before(){
        bear = new Bear("Baloo");
        salmon = new Salmon();
        river = new River();
        river.addFish(salmon);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eatFishFromRiver(river);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleep(){
        bear.eatFishFromRiver(river);
        bear.sleep();
        assertEquals(bear.foodCount(), 0);
    }

    @Test
    public void getName(){
        assertEquals("Baloo", bear.getName());
    }









}
