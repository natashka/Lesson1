import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Set;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class Task1Test {
    private static Task1 task1;
    private static final Logger logger = LogManager.getLogger(Task1Test.class);

    @BeforeClass
    public static void setUp() {
        task1 = new Task1();
    }
    @Test
   public  void predicateTest() {
        logger.info("Test of true");
        assertTrue(task1.predicate(Set.of("a", "b"), "vg"));
        logger.info("Test of false");
        assertFalse(task1.predicate(Set.of("a", "b"), "ab"));
    }
}