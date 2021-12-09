import atm.ATM;
import org.junit.Test;

public class AtmWorkTest {
    @Test
    public void testAverageWithOneElementArray() {
        int money = 127;
        ATM atm = new ATM();
        atm.process(money);
    }
}

