package ro.ase.cts.tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.tests.SumTestsCorrect;
import ro.ase.cts.tests.SumTestsRightBicep;

@RunWith(Suite.class)
@Suite.SuiteClasses({SumTestsCorrect.class, SumTestsRightBicep.class})
public class AllTests {
}
