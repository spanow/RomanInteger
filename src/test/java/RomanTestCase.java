import exception.InvalidOperationException;
import org.junit.Test;
import parsers.ParserFactory;

import static org.junit.Assert.*;

public class RomanTestCase {
  @Test
  public void TestRoman1() {
    assertEquals(1,ParserFactory.getParser().parse("I"));
  }
  @Test
  public void testRoman14() {
    assertEquals(14,ParserFactory.getParser().parse("XIV"));
  }
  @Test
  public void testRoman23() {
    assertEquals(23,ParserFactory.getParser().parse("XXIII"));
  }
  @Test
  public void testRoman43() {
    assertEquals(43,ParserFactory.getParser().parse("XLIII"));
  }
  @Test
  public void testRoman101() {
    assertEquals(101,ParserFactory.getParser().parse("CI"));
  }

  @Test(expected = InvalidOperationException.class)
  public void testWrongRoman() {
    assertEquals(101,ParserFactory.getParser().parse("CCCCC"));
  }


}