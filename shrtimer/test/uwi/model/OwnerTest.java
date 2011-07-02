package uwi.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class OwnerTest extends AppEngineTestCase {

    private Owner model = new Owner();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
