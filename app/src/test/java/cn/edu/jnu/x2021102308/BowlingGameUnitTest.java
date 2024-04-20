package cn.edu.jnu.x2021102308;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void testAllZeros() {
        repeatedRoll(0, 20);
        assertEquals(0, game.score());
    }

    @Test
    public void testAllOnes() {
        repeatedRoll(1, 20);
        assertEquals(20, game.score());
    }

    private void repeatedRoll(int pins, int times) {
        for (int i = 0; i < times; i++) {
            game.roll(pins);
        }
    }
}