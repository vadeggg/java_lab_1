import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Lab1TestNg {
    @DataProvider(name = "data-provider")
    public Object[][] inputProvider() {
        return new Object[][] { { 123, 6, 6 }, { 555, 125, 15 } };
    }
    @Test(dataProvider = "data-provider")
    void integers(int number, int product, int summ) {
        Lab1 lab = new Lab1();
        int[] test = new int[]{product, summ};
        assertArrayEquals(test, lab.Integers(number));
    }



    @Test
    void booleans() {
        Lab1 lab = new Lab1();
        assertEquals(false, lab.Booleans(3,2));
    }

    @Test
    void conditional() {
        Lab1 lab = new Lab1();
        int[] test = new int[]{0, 0};
        assertArrayEquals(test, lab.Conditional(4,4));

    }
    @DataProvider(name="cases-provider")
    public Object[][] casesProvider() {
        return new Object[][] { { 'W', 2, 1, 'N' }, { 'E', 1, 1, 'W' } };
    }
    @Test(dataProvider = "cases-provider")
    void cases(char side, int change1, int change2, char expect) {
        Lab1 lab = new Lab1();
        assertEquals(expect, lab.Cases(side,change1,change2));
    }

    @Test
    void forFunc() {
        Lab1 lab = new Lab1();
        assertEquals(4+9+16, lab.ForFunc(2));

    }

    @Test
    void whileFunc() {
        Lab1 lab = new Lab1();
        int[] test = new int[]{10, 4};
        assertArrayEquals(test, lab.WhileFunc(7));
    }
}