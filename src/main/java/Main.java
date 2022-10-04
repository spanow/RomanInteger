import parsers.ParserFactory;
import parsers.ParserToInteger;;

public class Main {
    public static void main(String args[]) {
        ParserToInteger parserToInteger = ParserFactory.getParser();
        System.out.println(parserToInteger.parse("XX"));
    }
}
