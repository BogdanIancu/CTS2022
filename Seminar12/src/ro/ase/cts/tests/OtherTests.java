package ro.ase.cts.tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.suites.SmokeTestCategory;

import static junit.framework.TestCase.assertTrue;

public class OtherTests {

    @Test
    @Category(SmokeTestCategory.class)
    public void test1() {
        assertTrue(true);
    }
}
