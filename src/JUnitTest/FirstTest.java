package JUnitTest;

import fwk.Beopt;
import org.junit.jupiter.api.Test;

public class FirstTest {


    @Test
    @Beopt("11111111")
    public void FirstTest() {
        System.out.println("test2_1 - 20110101. Thread: " + Thread.currentThread().getId());
    }
}
