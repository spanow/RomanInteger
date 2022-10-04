package parsers;

import languages.Roman;
import utils.RomainToInteger;


public final class ParserRomanToInteger implements ParserToInteger {


    public ParserRomanToInteger() {
    }


    @Override
    public int parse(String toParse) {
        Roman roman = new Roman(toParse, 0);
        RomainToInteger romanToInteger= new RomainToInteger();
        int translation = romanToInteger.romanToInt(roman);
        roman.setValue(translation);
        return translation;

    }


}




