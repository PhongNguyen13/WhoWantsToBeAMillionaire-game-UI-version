package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrizeTest {

    private Prize prize;

    public PrizeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        prize = new Prize();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of checkPrize method, of class Prize.
     */
    @Test
    public void testCheckPrizeCaseQnumSmallerThanFive() {
        System.out.println("checkPrize");
        int questionNum = 3;
        int expResult = 0;
        int result = prize.checkPrize(questionNum);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testCheckPrizeCaseQnumEqualsFive() {
        System.out.println("checkPrize");
        int questionNum = 5;
        int expResult = 0;
        int result = prize.checkPrize(questionNum);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testCheckPrizeCaseQnumBetweenFiveAndTen() {
        System.out.println("checkPrize");
        int questionNum = 9;
        int expResult = 1000;
        int result = prize.checkPrize(questionNum);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testCheckPrizeCaseQnumEqualsTen() {
        System.out.println("checkPrize");
        int questionNum = 10;
        int expResult = 1000;
        int result = prize.checkPrize(questionNum);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testCheckPrizeCaseQnumBetweenTenAndFifteen() {
        System.out.println("checkPrize");
        int questionNum = 11;
        int expResult = 25000;
        int result = prize.checkPrize(questionNum);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    @Test
    public void testCheckPrizeCaseQnumEqualsFifteen() {
        System.out.println("checkPrize");
        int questionNum = 15;
        int expResult = 25000;
        int result = prize.checkPrize(questionNum);
        assertEquals(expResult, result);
        System.out.println(result);
    }
}
