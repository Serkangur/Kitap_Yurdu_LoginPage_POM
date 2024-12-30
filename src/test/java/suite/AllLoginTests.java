package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Login_001.class,
        Login_002.class,
        Login_003.class,
        Login_004.class,
        Login_005.class,
        Login_006.class,
        Login_007.class,
        Login_008.class,
        Login_009.class,
        Login_010.class,
        Login_011.class,
})
public class AllLoginTests {

}
