package uwi.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CapsuleTest extends AppEngineTestCase {

    private Capsule model = new Capsule();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
