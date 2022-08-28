package parsers;

public class ParserFactory {
  public static ParserToInteger getParser(String type) {

    switch (type) {

      case "Roman":
        return ParserRomanToInteger.getInstance();

    }
    return null;
  }
}
