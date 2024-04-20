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

    private void repeatedRoll(int pins, int times) {
        for (int i = 0; i < times; i++) {
            game.roll(pins);
        }
    }

    private void rollOneStrike() {
        game.roll(10);
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

    @Test
    public void testOneSpare() {
        game.roll(2);
        game.roll(0);
        game.roll(1);
        game.roll(9);   // spare
        repeatedRoll(0, 16);
        assertEquals(12, game.score());
    }

    @Test
    public void testTwoSpare() {
        rollOneStrike();
        rollOneStrike();
        repeatedRoll(1, 2);
        repeatedRoll(0, 14);
        assertEquals(35, game.score());
    }


}