package parsers;

import adapters.StringToRomanAdapter;
import exception.ErrorCodes;
import exception.InvalidOperationException;
import romans.Roman;
import validator.RomanValidator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

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
    return romanToInt(roman);

  }











}




