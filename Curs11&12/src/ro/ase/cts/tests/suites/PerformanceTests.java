package ro.ase.cts.tests.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses(AllTests.class)
@Categories.IncludeCategory(PerformanceCategory.class)
public class PerformanceTests {
}
