package commonline.cl4.response.model;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;


public class UniqueSupplementDetailRecordFactoryTest extends TestCase {

    public void test() {
        UniqueSupplementDetailRecordFactory factory = new UniqueSupplementDetailRecordFactory();

        List fields = Arrays.asList(new byte[][]{
                "@2".getBytes(),
                "vendorCode".getBytes(),
                "idCode".getBytes(),
                "filler".getBytes(),
                "*".getBytes(),
                "\r\n".getBytes()
        });

        Object obj = factory.build(fields, null);

        assertNotNull(obj);
        assertTrue(obj instanceof UniqueSupplementDetail);

        UniqueSupplementDetail detail = (UniqueSupplementDetail) obj;
        
        assertEquals("vendorCode", detail.getUniqueSupplementVendorCode());
        assertEquals("idCode", detail.getUniqueSupplementalLayoutIdentifierCode());
    }
}
