package parsers;

public class ParserFactory {
    public static ParserToInteger getParser() {
        return new ParserRomanToInteger();
    }
}
