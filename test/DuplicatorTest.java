import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DuplicatorTest {

    private Duplicator SUT;

    @Before
    public void setup() { SUT =  new Duplicator();}

    @Test
    public void duplicateCounterTest(){
        int result = SUT.duplicateCounter(2);
        assertThat(result, is(4));
    }

}
