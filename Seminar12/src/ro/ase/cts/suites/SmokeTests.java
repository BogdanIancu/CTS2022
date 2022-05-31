package ro.ase.cts.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses(AllTests.class)
@Categories.IncludeCategory(SmokeTestCategory.class)
public class SmokeTests {
}
