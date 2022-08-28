package parsers;

import adapter.StringToRomanAdapter;
import models.Roman;

import static utils.RomainToInteger.romanToInt;

public final class ParserRomanToInteger implements ParserToInteger{
  private static volatile ParserRomanToInteger instance;


  private ParserRomanToInteger() {
  }

  public static ParserRomanToInteger getInstance() {

    ParserRomanToInteger result = instance;
    if (result != null) {
      return result;
    }
    synchronized(ParserRomanToInteger.class) {
      if (instance == null) {
        instance = new ParserRomanToInteger();
      }
      return instance;
    }
  }



  @Override
  public int parse(String toParse) {
    Roman roman = StringToRomanAdapter.stringToRoman(toParse);
    int translation = romanToInt(roman);
    roman.setValue(translation);
    return translation;

  }











}




