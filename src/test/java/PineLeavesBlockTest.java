import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PineLeavesBlockTest {

    @Test
    void testFlammabilityHelper() {
        Assertions.assertTrue(FlammabilityHelper.isHighlyFlammable(60));
        Assertions.assertFalse(FlammabilityHelper.isHighlyFlammable(30));
    }
}