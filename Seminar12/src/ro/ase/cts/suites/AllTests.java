package ro.ase.cts.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.tests.OtherTests;
import ro.ase.cts.tests.StudentTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({OtherTests.class, StudentTests.class})
public class AllTests {
}
