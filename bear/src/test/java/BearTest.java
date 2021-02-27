import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BearTest {
    private Bear bear;
    private Salmon salmon;

    @Before
    public void before(){
        bear = new Bear("Baloo");
        salmon = new Salmon();
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }
}
