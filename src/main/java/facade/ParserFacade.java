package facade;

import parsers.ParserFactory;
import parsers.ParserToInteger;

public class ParserFacade {
  public static int parse(String parser, String toParse) {
    ParserToInteger parserToInteger = ParserFactory.getParser(parser);
    return parserToInteger.parse(toParse);
  }

}
