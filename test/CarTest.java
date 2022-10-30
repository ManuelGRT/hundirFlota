import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import test5.Car;
 


public class CarTest {

    //public CarTest(){};

    @Test
    public void testFullRefill(){
        Car c = new Car(15);
        c.fullRefill();
        assertEquals(c.getFuelAmount(), c.getTankCapacity());
    }

    @Test
    public void testCarIsCreatedWithEmptyTank(){
        Car c = new Car(15);
        assertEquals(0, c.getFuelAmount());
    }

}