import java.util.concurrent.Phaser;

import static org.testng.Assert.*;


public class PhaserExampleTest {

    @org.testng.annotations.Test
    public void testGetSquareSum() throws Exception {

        int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        long actual = new PhaserExample().getSquareSum(array, 4);
        assertEquals(actual, 385, "Wrong execution result");

    }
}