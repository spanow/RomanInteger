
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import facade.ParserFacade;
import org.junit.Test;

public class RomanTestCase {

  @Test
  public void testRomanUn() {
    assertEquals(15, ParserFacade.parse("Roman","CCD"));
  }
}
