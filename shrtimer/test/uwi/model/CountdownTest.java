package uwi.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CountdownTest extends AppEngineTestCase {

    private Countdown model = new Countdown();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
