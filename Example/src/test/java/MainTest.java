import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.ServletUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JClark on 6/26/2014.
 */
public class MainTest {

    @Test
    public void testName() throws Exception {
        DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
        Assert.assertNull(request);
    }
}
