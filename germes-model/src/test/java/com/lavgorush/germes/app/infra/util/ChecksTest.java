package com.lavgorush.germes.app.infra.util;

import com.lavgorush.germes.app.ifra.exception.flow.InvalidParameterException;
import com.lavgorush.germes.app.ifra.util.Checks;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class ChecksTest {
    @Test
    public  void testCheckParameterGetException(){
        try {
            Checks.checkParameter(false, "test");
            assertTrue(false);
        } catch (Exception ex) {
            assertSame(ex.getClass(), InvalidParameterException.class);
            assertEquals(ex.getMessage(),"test");
        }
    }
    @Test
    public  void testCheckParameterNoException(){
        Checks.checkParameter(true, "test");
        assertTrue(true);
    }
}
